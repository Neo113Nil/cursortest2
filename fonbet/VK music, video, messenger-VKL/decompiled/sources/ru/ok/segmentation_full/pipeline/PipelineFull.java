package ru.ok.segmentation_full.pipeline;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.Closeable;
import java.io.IOException;
import ru.ok.FrameConsumer;
import ru.ok.TFFrameType;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.segmentation_full.segmentation.ISegmenter;
import ru.ok.tensorflow.util.ImageUtils;
import ru.ok.wrapper.AsyncWrapper;
import xsna.j1d;

/* loaded from: classes9.dex */
public class PipelineFull implements Closeable, FrameConsumer {
    private Matrix inverseTransform;
    private int originalHeight;
    private int originalWidth;
    private final AsyncWrapper<Bitmap> pipelineAsync = new AsyncWrapper<>(0, null);
    private Bitmap scaledBitmap;
    private final ISegmenter segmenter;
    private Matrix transform;

    public PipelineFull(ISegmenter iSegmenter) {
        this.segmenter = iSegmenter;
        this.scaledBitmap = Bitmap.createBitmap(iSegmenter.getInputWidth(), iSegmenter.getInputHeight(), Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$process$0(FrameHolder frameHolder) {
        return this.segmenter.segment(frameHolder);
    }

    private void setTransform(Matrix matrix) {
        this.transform = matrix;
        Matrix matrix2 = new Matrix();
        this.inverseTransform = matrix2;
        this.transform.invert(matrix2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.segmenter.close();
        this.pipelineAsync.close();
    }

    public int getInputHeight() {
        return this.segmenter.getInputHeight();
    }

    public int getInputWidth() {
        return this.segmenter.getInputWidth();
    }

    public boolean isGpued() {
        return this.segmenter.isGPUInited();
    }

    public Bitmap process(FrameHolder frameHolder, long j) {
        if (this.pipelineAsync.isReady()) {
            if (this.segmenter.wantRunWithGPUPass() && frameHolder.hasGPU()) {
                this.segmenter.copyInputGPU(frameHolder);
                GlUtil.syncGL();
            }
            this.pipelineAsync.submitTask(new j1d(this, frameHolder));
        }
        return this.pipelineAsync.fetchResult(j);
    }

    public void setInputSize(int i, int i2) {
        this.originalWidth = i;
        this.originalHeight = i2;
        setTransform(ImageUtils.getTransformationMatrix(i, i2, this.segmenter.getInputWidth(), this.segmenter.getInputHeight(), false, true, true));
    }

    public void startInitGPU(GlThreadWithSharedContext glThreadWithSharedContext) {
        this.segmenter.startInitGPU(glThreadWithSharedContext);
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        ISegmenter iSegmenter = this.segmenter;
        if (iSegmenter != null) {
            return iSegmenter.useFrame(tFFrameType);
        }
        return 0;
    }
}

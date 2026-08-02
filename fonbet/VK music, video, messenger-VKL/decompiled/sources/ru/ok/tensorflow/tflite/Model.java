package ru.ok.tensorflow.tflite;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GLComputerProgram;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.tflite.InterpreterWrapper;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;
import xsna.o63;
import xsna.po4;
import xsna.s230;
import xsna.sd;

/* loaded from: classes9.dex */
public abstract class Model implements Closeable {
    protected GpuCache cache;
    protected GLComputerProgram convertShader;
    protected SimpleGLProgram copyProgram;
    protected ArrayList<Runnable> gpuResources;
    protected boolean gpuResourcesInited;
    protected boolean initStarted;
    protected InterpreterWrapper interpreterWrapper;
    protected ByteBuffer modelBuffer;
    protected boolean useGPUPass;

    public Model(@NonNull ModelDataProvider modelDataProvider, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        this(modelDataProvider, Util.DelegateType.CPU, Util.Api2BufferType.None, null, weakReference, weakReference2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCopyShader$2() {
        this.copyProgram.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initConvertShader$0() {
        this.convertShader.release();
    }

    public void addGPUResourse(Runnable runnable) {
        this.gpuResources.add(runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.interpreterWrapper.close();
        Iterator<Runnable> it = this.gpuResources.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.gpuResourcesInited = false;
    }

    public void copyTexture(FrameBuffer frameBuffer, int i) {
        this.copyProgram.setTextureId(i);
        this.copyProgram.setMVPMat(GlUtil.getOpenGLMatrix(new Matrix()));
        frameBuffer.render(this.copyProgram, new s230(0));
    }

    public void copyTextureToBuffer(FrameHolder frameHolder, GLSSBO glssbo) {
        this.convertShader.useProgram();
        glssbo.copyTextureToBufferWithShader(frameHolder.getGPUFrame(), frameHolder.getWidth(), frameHolder.getHeight());
        this.convertShader.resetProgram();
    }

    public void createCopyShader() {
        if (this.copyProgram == null) {
            this.copyProgram = new SimpleGLProgram();
            addGPUResourse(new sd(this, 9));
        }
    }

    public GLSSBO createSSBO(int i) {
        GLSSBO glssbo = new GLSSBO(i);
        addGPUResourse(new po4(glssbo, 5));
        return glssbo;
    }

    public void initConvertShader(int i, int i2, boolean z) {
        initConvertShader(GLComputerProgram.TEXTURE_TO_BUFFER_3CHANNELS, i, i2, z);
    }

    public void initGPUResources() {
        this.gpuResourcesInited = true;
    }

    public InterpreterWrapper.InitFuture initInterpreter(int i, Util.DelegateType delegateType, boolean z, Util.Api2BufferType api2BufferType, GpuCache gpuCache) {
        this.cache = gpuCache;
        return this.interpreterWrapper.init(this.modelBuffer, i, delegateType, z, api2BufferType, gpuCache);
    }

    public void startInitGPU(GlThreadWithSharedContext glThreadWithSharedContext) {
        if (!this.interpreterWrapper.needGpuInit() || this.interpreterWrapper.isGPUInited() || this.initStarted) {
            return;
        }
        this.initStarted = this.interpreterWrapper.initGPU(this.cache, glThreadWithSharedContext);
    }

    public Model(@NonNull ModelDataProvider modelDataProvider, Util.DelegateType delegateType, Util.Api2BufferType api2BufferType, GpuCache gpuCache, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        this.gpuResources = new ArrayList<>();
        this.gpuResourcesInited = false;
        this.useGPUPass = false;
        this.initStarted = false;
        try {
            this.modelBuffer = modelDataProvider.getModelData();
            this.useGPUPass = api2BufferType == Util.Api2BufferType.PassGPU;
            this.interpreterWrapper = new InterpreterWrapper(weakReference, weakReference2);
            initInterpreter(4, delegateType, true, api2BufferType, gpuCache);
        } catch (IOException e) {
            throw new RuntimeException("Failed to get model data", e);
        }
    }

    public void initConvertShader(String str, int i, int i2, boolean z) {
        if (this.convertShader == null) {
            GLComputerProgram gLComputerProgram = new GLComputerProgram(str);
            this.convertShader = gLComputerProgram;
            gLComputerProgram.useProgram();
            this.convertShader.setIntUniform("u_Texture0", 0);
            this.convertShader.setIntUniform("u_width", i);
            this.convertShader.setIntUniform("u_height", i2);
            this.convertShader.setFloatUniform("f_valueFactor", z ? 2.0f : 1.0f);
            this.convertShader.setFloatUniform("f_valueOffset", z ? -1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.convertShader.resetProgram();
            addGPUResourse(new o63(this, 8));
        }
    }
}

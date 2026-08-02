package xsna;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.View;
import java.util.List;
import xsna.avt0;

/* compiled from: BlurDrawer.kt */
/* loaded from: classes8.dex */
public final class pg7 implements hlo {
    public final List<avt0.a> a;
    public final RenderNode b;
    public final int[] c;

    public pg7(View view, List<avt0.a> list) {
        RenderEffect createBlurEffect;
        this.a = list;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        createBlurEffect = RenderEffect.createBlurEffect(20.0f, 20.0f, Shader.TileMode.CLAMP);
        RenderNode c = l32.c();
        c.setRenderEffect(createBlurEffect);
        this.b = c;
        int[] iArr = new int[2];
        this.c = iArr;
        view.getLocationOnScreen(iArr);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.og7
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view2.getLocationOnScreen(pg7.this.c);
            }
        });
    }

    @Override // xsna.hlo
    public final void a(Canvas canvas, int i, int i2) {
        RecordingCanvas beginRecording;
        List<avt0.a> list = this.a;
        if (list.isEmpty() || !canvas.isHardwareAccelerated()) {
            return;
        }
        this.b.setPosition(0, 0, i, i2);
        beginRecording = this.b.beginRecording();
        try {
            for (avt0.a aVar : list) {
                int[] iArr = aVar.b;
                int i3 = iArr[0];
                int[] iArr2 = this.c;
                int i4 = i3 - iArr2[0];
                int i5 = iArr[1] - iArr2[1];
                int save = beginRecording.save();
                beginRecording.translate(i4, i5);
                try {
                    beginRecording.drawRenderNode(aVar.a);
                    beginRecording.restoreToCount(save);
                } catch (Throwable th) {
                    beginRecording.restoreToCount(save);
                    throw th;
                }
            }
            this.b.endRecording();
            canvas.drawRenderNode(this.b);
        } catch (Throwable th2) {
            this.b.endRecording();
            throw th2;
        }
    }
}

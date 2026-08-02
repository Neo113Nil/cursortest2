package xsna;

import android.media.MediaRecorder;
import com.vk.media.recorder.RecorderBase;
import com.vk.medianative.MediaNative;
import java.io.File;
import java.util.concurrent.Executor;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;

/* compiled from: CameraRecorder.kt */
/* loaded from: classes3.dex */
public abstract class rk9 implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener {
    public com.vk.media.recorder.f a;
    public jhu0 b;
    public qj9 d;
    public pj9 e;
    public File f;
    public Executor i;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public RecorderBase.RecordingType c = RecorderBase.RecordingType.ORIGINAL;
    public int g = Integer.MAX_VALUE;
    public final ExtraAudioSupplier h = new ExtraAudioSupplier(MediaNative.context);
    public float j = 1.0f;
    public float k = 1.0f;
    public float l = 30.0f;
    public long m = -1;

    public final boolean a() {
        com.vk.media.recorder.f fVar = this.a;
        return fVar != null && fVar.q;
    }

    public final void b(long j) {
        qj9 qj9Var;
        if (!a() || (qj9Var = this.d) == null) {
            return;
        }
        qj9Var.c(j, this.a != null ? r1.s : 0);
    }

    public final void c() {
        qj9 qj9Var = this.d;
        if (qj9Var != null) {
            qj9Var.d();
        }
    }

    public final void d(nhf0 nhf0Var) {
        qj9 qj9Var = this.d;
        if (qj9Var != null) {
            qj9Var.b(nhf0Var);
        }
    }

    public final void e(boolean z) {
        com.vk.media.recorder.f fVar;
        if (z || (fVar = this.a) == null || !(fVar instanceof sy70)) {
            com.vk.media.recorder.f fVar2 = this.a;
            if (fVar2 != null) {
                fVar2.g = null;
                fVar2.j = null;
                fVar2.m();
                s3q0 s3q0Var = s3q0.a;
            }
            this.a = null;
        }
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        qj9 qj9Var = this.d;
        if (qj9Var != null) {
            qj9Var.onError(i);
        }
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        qj9 qj9Var = this.d;
        if (qj9Var != null) {
            qj9Var.e(i);
        }
        if (i == -1003) {
            com.vk.media.recorder.f fVar = this.a;
            if (fVar != null) {
                fVar.i = new rt0(this, 7);
            }
            qj9 qj9Var2 = this.d;
            if (qj9Var2 != null) {
                qj9Var2.onStop();
            }
        }
    }
}

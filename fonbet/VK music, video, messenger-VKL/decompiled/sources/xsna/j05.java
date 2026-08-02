package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: AudioWaveVoiceoverStub.kt */
/* loaded from: classes18.dex */
public final class j05 implements yz4 {
    public int a;
    public final Object b;
    public Object c;

    public j05(i05 i05Var) {
        this.b = i05Var;
        this.c = new float[4];
    }

    @Override // xsna.yz4
    public int a() {
        return this.a;
    }

    @Override // xsna.yz4
    public float[] b() {
        return (float[]) this.c;
    }

    public j05(k5h k5hVar, int i) {
        this.b = k5hVar;
        this.a = i;
        this.c = new Handler(Looper.getMainLooper());
    }
}

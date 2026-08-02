package defpackage;

import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes.dex */
public class dlm0 {
    public float a;
    public float b;

    public dlm0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final String toString() {
        return this.a + RemoteBioParameters.X + this.b;
    }

    public dlm0() {
        this(1.0f, 1.0f);
    }
}

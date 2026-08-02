package defpackage;

import android.util.Base64;

/* loaded from: classes10.dex */
public final /* synthetic */ class cih implements rhw0 {
    public final /* synthetic */ int a;

    public /* synthetic */ cih(int i) {
        this.a = i;
    }

    @Override // defpackage.rhw0
    public final Object get() {
        switch (this.a) {
            case 0:
                byte[] bArr = new byte[12];
                eih.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 1:
                return new zdh();
            default:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    invoke.getClass();
                    return (rxc0) invoke;
                } catch (Exception e) {
                    ny61.o(e);
                    return null;
                }
        }
    }
}

package xsna;

import android.graphics.drawable.Animatable;

/* compiled from: ImageLoadingTimeControllerListener.kt */
/* loaded from: classes12.dex */
public final class hkw extends fc6<Object> {
    public final q2l c;
    public long d = -1;

    public hkw(q2l q2lVar) {
        this.c = q2lVar;
    }

    @Override // xsna.fc6, xsna.kqj
    public final void e(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        q2l q2lVar = this.c;
        q2lVar.s = currentTimeMillis;
        q2lVar.invalidateSelf();
    }

    @Override // xsna.fc6, xsna.kqj
    public final void f(Object obj, String str) {
        this.d = System.currentTimeMillis();
    }
}

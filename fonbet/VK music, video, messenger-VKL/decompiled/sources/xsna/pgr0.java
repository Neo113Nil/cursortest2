package xsna;

import android.net.Uri;

/* compiled from: VKSuperappBitmapLoader.kt */
/* loaded from: classes6.dex */
public final class pgr0 implements ign0 {
    public static final pgr0 a = new pgr0();

    @Override // xsna.ign0
    public final io.reactivex.rxjava3.internal.operators.single.y a(int i, int i2, final String str) {
        return new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.ngr0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                return mcr0.h(Uri.parse(str));
            }
        }).K().l(new mvc0(new ogr0(i, i2), 8));
    }

    @Override // xsna.ign0
    public final io.reactivex.rxjava3.internal.operators.single.y b(String str) {
        return a(0, 0, str);
    }
}

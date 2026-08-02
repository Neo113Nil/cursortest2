package xsna;

import java.util.ArrayList;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class zit implements tfn0 {
    @Override // xsna.tfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 a(String str, ArrayList arrayList) {
        ufx ufxVar = new ufx("translations.translate", new iun0(2), new jh(29));
        ufxVar.h("texts", arrayList);
        ufx.n(ufxVar, "translation_language", str, 0, 12);
        return rdx0.B(e370.e(ufxVar));
    }
}

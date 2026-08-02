package xsna;

import android.net.Uri;
import xsna.h39;

/* compiled from: CallFinishHandler.kt */
/* loaded from: classes8.dex */
public final class m39<T, R> implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ ear b;

    public m39(ear earVar) {
        this.b = earVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        String str = ((mst) obj).a;
        if (str == null) {
            return new io.reactivex.rxjava3.internal.operators.single.q(new l39());
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        ear earVar = this.b;
        return io.reactivex.rxjava3.core.x.k(new h39.a(earVar, buildUpon.appendQueryParameter("size", String.valueOf(earVar.a.length())).build().toString()));
    }
}

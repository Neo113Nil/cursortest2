package xsna;

import android.app.Activity;
import android.content.Context;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.l2f;

/* compiled from: Completable.kt */
/* loaded from: classes17.dex */
public final class t7i {
    public static final io.reactivex.rxjava3.internal.operators.observable.b0 a(io.reactivex.rxjava3.core.q qVar, Context context, String str, String str2) {
        l2f.a aVar = new l2f.a(context, str, 48, str2);
        mp0 mp0Var = new mp0(new ozh(aVar, 3), 14);
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, mp0Var, io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new vyb(aVar, 1)).F(new f50(new com.vk.movika.sdk.base.logic.interactor.e(aVar, 22), 22)).C(new gt0(aVar, 1));
    }

    public static io.reactivex.rxjava3.internal.operators.completable.w b(io.reactivex.rxjava3.internal.operators.completable.u uVar, Activity activity, String str, String str2, boolean z) {
        l2f.a aVar = new l2f.a(activity, 2000L, str, str2, z);
        gf0 gf0Var = new gf0(new ns1(aVar, 29), 17);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.completable.w(uVar, gf0Var, lVar, kVar, kVar, kVar, kVar).h(new g57(aVar, 1)).i(new vl0(new s6(aVar, 26), 15)).g(new if1(aVar, 1));
    }
}

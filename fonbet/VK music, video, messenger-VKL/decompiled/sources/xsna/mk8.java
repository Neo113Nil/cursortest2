package xsna;

import android.content.Context;

/* compiled from: BrowserAuthLinkRepositoryImpl.kt */
/* loaded from: classes15.dex */
public final class mk8 implements lk8 {
    @Override // xsna.lk8
    public final io.reactivex.rxjava3.disposables.c a(Context context) {
        String b = b6m.b(context);
        ufx ufxVar = new ufx("auth.getWebAuthLink", new mr(5), new sr(7));
        ufx.n(ufxVar, "device_id", b, 0, 12);
        ufx.n(ufxVar, "to", "https://vk.ru", 0, 12);
        return rdx0.B(e370.e(ufxVar)).subscribe(new k5(new j5(context, 8), 5), new m5(new com.vk.movika.sdk.base.observable.e0(6), 7));
    }
}

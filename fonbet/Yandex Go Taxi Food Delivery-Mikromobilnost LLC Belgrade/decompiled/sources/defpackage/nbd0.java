package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.yandex.plus.pay.common.api.model.PlusPayPlatform;
import com.yandex.plus.pay.internal.di.b;

/* loaded from: classes2.dex */
public final class nbd0 {
    public final /* synthetic */ hhw a;

    public nbd0(hhw hhwVar) {
        this.a = hhwVar;
    }

    public final uxd a() {
        EvgenOffersPlatform evgenOffersPlatform;
        b bVar = (b) this.a.a;
        DisplayMetrics displayMetrics = bVar.g.getResources().getDisplayMetrics();
        String str = Build.MODEL;
        String valueOf = String.valueOf(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        String valueOf2 = String.valueOf(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels));
        String valueOf3 = String.valueOf(displayMetrics.densityDpi);
        String valueOf4 = String.valueOf(Build.VERSION.SDK_INT);
        String str2 = Build.MANUFACTURER;
        String b = bVar.p.b();
        String str3 = b == null ? "" : b;
        String a = bVar.p.a();
        String str4 = a == null ? "" : a;
        String str5 = bVar.f;
        da31 da31Var = da31.a;
        Context context = bVar.g;
        da31Var.getClass();
        Long a2 = da31.a(context);
        int longValue = a2 != null ? (int) a2.longValue() : -1;
        String c = bVar.c();
        int i = mbd0.a[ned0.b(PlusPayPlatform.Companion, bVar.g).ordinal()];
        if (i == 1) {
            evgenOffersPlatform = EvgenOffersPlatform.Android;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            evgenOffersPlatform = EvgenOffersPlatform.AndroidTv;
        }
        return new uxd(valueOf, valueOf2, str3, str4, str5, longValue, c, evgenOffersPlatform, valueOf4, valueOf3);
    }
}

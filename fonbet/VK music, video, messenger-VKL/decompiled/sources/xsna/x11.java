package xsna;

import android.content.Context;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdsService.kt */
/* loaded from: classes18.dex */
public final class x11 {
    public final fks0 a;
    public final nmk0 b;
    public final a290 c;
    public final Object d;
    public final Object e;

    public x11(fks0 fks0Var, nmk0 nmk0Var, a290 a290Var) {
        this.a = fks0Var;
        this.b = nmk0Var;
        this.c = a290Var;
        v6 v6Var = new v6(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, v6Var);
        this.e = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.g0(1));
    }

    public static io.reactivex.rxjava3.core.a a(String str, String str2, String str3) {
        if (str2 == null || str3 == null) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String b = b6m.b(context);
        tfx tfxVar = new tfx("video.trackAdEvent", new thl0(8), new qjk0(8));
        tfx.o(tfxVar, "banner_id", str, 0, 0, 12);
        tfx.o(tfxVar, "video", str2, 0, 0, 12);
        tfx.o(tfxVar, "section_key", str3, 0, 0, 12);
        if (b != null) {
            tfx.o(tfxVar, "device_id", b, 0, 0, 12);
            tfxVar = tfxVar;
        }
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        return rsg0.Z(x);
    }
}

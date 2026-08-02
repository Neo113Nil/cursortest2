package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zzpd;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

/* compiled from: OpenButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class wp80 implements q701 {
    public static final /* synthetic */ wp80 b = new wp80();

    public static final Object a(io.reactivex.rxjava3.internal.operators.single.h0 h0Var) {
        try {
            return h0Var.c();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int b(int i) {
        ato0 ato0Var = ato0.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i == 6) {
            return 90;
        }
        if (i != 8) {
            return 0;
        }
        return atv0.b;
    }

    public static final UserId c(Intent intent) {
        UserId userId = (UserId) intent.getParcelableExtra("uid");
        if (userId != null) {
            return userId;
        }
        int intExtra = intent.getIntExtra("uid", 0);
        return intExtra != 0 ? new UserId(intExtra) : new UserId(intent.getLongExtra("uid", 0L));
    }

    public static void d(Context context) {
        f370 f370Var;
        f370 f370Var2;
        Intent intent = new Intent("android.settings.VPN_SETTINGS");
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            d6q0.a.getClass();
            bxi bxiVar = d6q0.b;
            if (bxiVar != null && (f370Var2 = bxiVar.h) != null) {
                f370Var2.n(th);
            }
            try {
                context.startActivity(new Intent("android.settings.SETTINGS"));
            } catch (Throwable th2) {
                d6q0.a.getClass();
                bxi bxiVar2 = d6q0.b;
                if (bxiVar2 == null || (f370Var = bxiVar2.h) == null) {
                    return;
                }
                f370Var.n(th2);
            }
        }
    }

    public static cye0 e(float f, String str, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-207973545, 24960, -1, "com.vk.ecomm.design.compose.ratingblock.RatingBlock.Rating.Companion.invoke (RatingBlock.kt:25)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-335851024, 3078, -1, "com.vk.ecomm.design.compose.ratingblock.remember (RatingImpl.kt:100)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new cye0(f, str);
            aVar.R(x);
        }
        cye0 cye0Var = (cye0) x;
        ((zak0) cye0Var.a).setValue(new yxe0(f));
        ((zak0) cye0Var.b).setValue(str);
        ((zak0) cye0Var.c).setValue(null);
        ((zak0) cye0Var.d).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return cye0Var;
    }

    public static rw6 f(efj efjVar, float f, PictureRadius pictureRadius, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = 72;
        }
        float f2 = f;
        rep repVar = rep.a;
        if ((i2 & 16) != 0) {
            pictureRadius = PictureRadius.Medium;
        }
        PictureRadius pictureRadius2 = pictureRadius;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1289689962, i, -1, "com.vk.core.compose.component.banner.Banner.Before.Picture.Companion.invoke (Banner.kt:414)");
        }
        rw6 x = rte0.x(efjVar, Collections.singletonList(repVar), f2, tgp.a, pictureRadius2, null, aVar, 6 | ((i << 6) & 7168) | ((i << 3) & 458752));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return x;
    }

    public static final boolean g(l2u0 l2u0Var, n2u0 n2u0Var) {
        return l2u0Var.isVisible() == n2u0Var.isVisible();
    }

    public static final jai h(jai jaiVar) {
        return new jai(-328108779, new uxb(new fc30(new jai(-703201834, new gc30(jaiVar), true)), 7), true);
    }

    public static final void i(io.reactivex.rxjava3.core.x xVar, izs izsVar, izs izsVar2) {
        xVar.subscribe(new ztg0(izsVar, izsVar2));
    }

    public static final UIBlockActionOpenUrl j(bi20 bi20Var, CatalogViewType catalogViewType, String str, ActionOpenUrl actionOpenUrl, String str2, String str3, String str4, String str5, String str6) {
        return new UIBlockActionOpenUrl(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.c(catalogViewType), null, null, null, null, UserId.d, null, 8159), str2, str6 == null ? bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()) : str6, str, actionOpenUrl, str4, str3, str5);
    }

    public static final String k(w0g w0gVar) {
        return w0gVar instanceof peu ? "2_vertical" : w0gVar instanceof oeu ? "2_horizontal" : w0gVar instanceof veu ? "3_vertical" : w0gVar instanceof reu ? "3_horizontal" : w0gVar instanceof teu ? "3_right" : w0gVar instanceof seu ? "3_left" : w0gVar instanceof ueu ? "3_top" : w0gVar instanceof qeu ? "3_bottom" : w0gVar instanceof weu ? "4_default" : w0gVar instanceof xeu ? "4_shift1" : w0gVar instanceof yeu ? "5_shift2" : "unknown";
    }

    public static final io.reactivex.rxjava3.internal.operators.single.p l(io.reactivex.rxjava3.internal.operators.single.f0 f0Var, final e1w e1wVar, final xyh xyhVar) {
        return new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(f0Var, new f60(new by5(0, xyhVar, e1wVar), 4)), new io.reactivex.rxjava3.functions.a() { // from class: xsna.cy5
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                xyh xyhVar2 = xyh.this;
                e1w e1wVar2 = e1wVar;
                ay5 ay5Var = (ay5) xyhVar2.invoke();
                if (ay5Var != null) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap = ay5Var.b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e1wVar2.c());
                    mla mlaVar = e1wVar2.a;
                    if (mlaVar == null) {
                        mlaVar = null;
                    }
                    sb.append(mlaVar.b);
                    String sb2 = sb.toString();
                    final j21 j21Var = new j21((byte) 0, 1);
                    concurrentHashMap.computeIfPresent(sb2, new BiFunction() { // from class: xsna.xx5
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return (Integer) j21.this.invoke(obj, obj2);
                        }
                    });
                }
            }
        });
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzpd.zzd());
    }
}

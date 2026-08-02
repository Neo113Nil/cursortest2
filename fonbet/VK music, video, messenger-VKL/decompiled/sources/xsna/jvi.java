package xsna;

import android.content.Context;
import android.graphics.Color;
import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zzpj;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Locale;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dak0;
import xsna.foa0;

/* compiled from: Composition.kt */
/* loaded from: classes11.dex */
public final class jvi implements q701 {
    public static final Object b = new Object();
    public static final /* synthetic */ jvi c = new jvi();

    public static final void a(final Object obj, final int i, final buy buyVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(872548579);
        if ((i2 & 6) == 0) {
            i3 = (M.y(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(buyVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(jaiVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(872548579, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean J = M.J(obj) | M.J(buyVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new yty(obj, buyVar);
                M.R(x);
            }
            yty ytyVar = (yty) x;
            ytyVar.c = i;
            wh50 wh50Var = ytyVar.g;
            pqo pqoVar = goa0.a;
            foa0 foa0Var = (foa0) M.r(pqoVar);
            dak0 a = dak0.a.a();
            izs<Object, s3q0> e = a != null ? a.e() : null;
            dak0 b2 = dak0.a.b(a);
            try {
                if (foa0Var != ((foa0) ((zak0) wh50Var).getValue())) {
                    ((zak0) wh50Var).setValue(foa0Var);
                    if (ytyVar.d > 0) {
                        foa0.a aVar2 = ytyVar.e;
                        if (aVar2 != null) {
                            aVar2.release();
                        }
                        ytyVar.e = foa0Var != null ? foa0Var.a() : null;
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                dak0.a.d(a, b2, e);
                boolean J2 = M.J(ytyVar);
                Object x2 = M.x();
                if (J2 || x2 == c0012a) {
                    x2 = new qpj(ytyVar, 22);
                    M.R(x2);
                }
                bap.c(ytyVar, (izs) x2, M, 0);
                rvi.a(pqoVar.b(ytyVar), jaiVar, M, ((i3 >> 6) & 112) | 8);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } catch (Throwable th) {
                dak0.a.d(a, b2, e);
                throw th;
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zty
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    jvi.a(obj, i, buyVar, jaiVar, (androidx.compose.runtime.a) obj2, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean b(NewsEntry newsEntry, h170 h170Var) {
        if (((Boolean) h170Var.B.getValue()).booleanValue() && fkq0.b(k9q0.o(newsEntry))) {
            return (newsEntry instanceof Post) || (newsEntry instanceof Videos) || (newsEntry instanceof Photos);
        }
        return false;
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final q630 d(q630 q630Var, rwr rwrVar) {
        return q630Var.g(new swr(rwrVar));
    }

    public static e4b0 e(Context context, List list) {
        return new e4b0(context, list);
    }

    public static mqv g(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-343407859, 48, -1, "com.vk.core.compose.component.snackbar.SnackbarContent.Left.Error.Companion.invoke (SnackbarContent.kt:123)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1418025839, 6, -1, "com.vk.core.compose.component.snackbar.remember (IconImpl.kt:130)");
        }
        w65.k().getClass();
        aVar.K(2070086161);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2070086161, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSnackbarDefaults.errorIcon (MilkshakeSnackbarDefaults.kt:45)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1522720900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorCircleOutline28> (VkSdkIcons.kt:804)");
        }
        lg90 b2 = or.b(aVar, 66431199, R.drawable.vk_icon_error_circle_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        w65.k().getClass();
        aVar.K(-1108860268);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1108860268, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSnackbarDefaults.errorIconTint (MilkshakeSnackbarDefaults.kt:38)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().h;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            float f = 28;
            mqv mqvVar = new mqv(b2, j, byc0.b(f, f), 0);
            aVar.R(mqvVar);
            x = mqvVar;
        }
        mqv mqvVar2 = (mqv) x;
        ((zak0) mqvVar2.a).setValue(b2);
        mqvVar2.b(j);
        ((zak0) mqvVar2.f).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return mqvVar2;
    }

    public static String h(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        String str = y2r0.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public io.reactivex.rxjava3.internal.operators.single.y f(Integer num) {
        tfx tfxVar = new tfx("calls.getAsrTranscriptions", new or(6), new pr(6));
        tfxVar.f(25, 1, 50, "count");
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        return rsg0.w0(yfb.x(tfxVar)).l(new h7(new gv3(this), 2));
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzpj.zzd());
    }
}

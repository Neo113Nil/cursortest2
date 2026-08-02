package defpackage;

import android.net.Uri;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.internal.a;
import com.google.ar.core.ImageMetadata;
import ru.yandex.taxi.logistics.sdk.ui.component.misc.EnterAnimation;
import ru.yandex.taxi.logistics.sdk.ui.component.misc.ExitAnimation;

/* loaded from: classes11.dex */
public abstract class cza1 {
    public static final void a(boolean z, int i, EnterAnimation enterAnimation, ExitAnimation exitAnimation, a aVar, fid fidVar, int i2) {
        a aVar2;
        int i3;
        EnterAnimation enterAnimation2;
        ExitAnimation exitAnimation2;
        w2o e;
        zmo f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2125339304);
        int i4 = i2 | (btsVar.a(z) ? 4 : 2) | 3504;
        int i5 = 0;
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            EnterAnimation enterAnimation3 = EnterAnimation.DEFAULT;
            ExitAnimation exitAnimation3 = ExitAnimation.DEFAULT;
            switch (kz2.a[enterAnimation3.ordinal()]) {
                case 1:
                    e = k.e(sb2.K(500, 0, null, 6), 2);
                    break;
                case 2:
                    e = k.g(sb2.K(500, 0, null, 6), 0.0f, 6);
                    break;
                case 3:
                    e = k.m(sb2.K(500, 0, null, 6), new f22(23));
                    break;
                case 4:
                    e = k.o(2, null, sb2.K(500, 0, null, 6));
                    break;
                case 5:
                    e = k.q(2, null, sb2.K(500, 0, null, 6));
                    break;
                case 6:
                    e = k.c(sb2.K(500, 0, null, 6), 14);
                    break;
                case 7:
                    e = k.a(sb2.K(500, 0, null, 6), null, 14);
                    break;
                case 8:
                    e = k.d(sb2.K(500, 0, null, 6), null, 14);
                    break;
                case 9:
                    e = k.e(sb2.K(500, 0, null, 6), 2).a(k.d(sb2.K(500, 0, null, 6), null, 12));
                    break;
                default:
                    w511.b();
                    return;
            }
            switch (kz2.b[exitAnimation3.ordinal()]) {
                case 1:
                    f = k.f(sb2.K(500, 0, null, 6), 2);
                    break;
                case 2:
                    f = k.h(sb2.K(500, 0, null, 6), 0.0f, 6);
                    break;
                case 3:
                    f = k.r(sb2.K(500, 0, null, 6), new f22(22));
                    break;
                case 4:
                    f = k.t(2, null, sb2.K(500, 0, null, 6));
                    break;
                case 5:
                    f = k.v(2, null, sb2.K(500, 0, null, 6));
                    break;
                case 6:
                    f = k.k(sb2.K(500, 0, null, 6), 14);
                    break;
                case 7:
                    f = k.i(sb2.K(500, 0, null, 6), null, 14);
                    break;
                case 8:
                    f = k.l(sb2.K(500, 0, null, 6), null, 14);
                    break;
                case 9:
                    f = k.f(sb2.K(500, 0, null, 6), 2).a(k.l(sb2.K(500, 0, null, 6), null, 12));
                    break;
                default:
                    w511.b();
                    return;
            }
            aVar2 = aVar;
            g.e(z, null, e, f, null, wwg.S(307339472, true, new jz2(aVar2, i5), btsVar), btsVar, (i4 & 14) | ImageMetadata.EDGE_MODE, 18);
            exitAnimation2 = exitAnimation3;
            enterAnimation2 = enterAnimation3;
            i3 = 500;
        } else {
            aVar2 = aVar;
            btsVar.Y();
            i3 = i;
            enterAnimation2 = enterAnimation;
            exitAnimation2 = exitAnimation;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(z, i3, enterAnimation2, exitAnimation2, aVar2, i2);
        }
    }

    public static final Uri b(String str, String str2, String str3) {
        return Uri.parse(cvu0.v(cvu0.v(str, "{QRC_ID}", str2, false), "{QUERY_STRING}", (str3 == null || evu0.J(str3)) ? "" : "?".concat(str3), false));
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}

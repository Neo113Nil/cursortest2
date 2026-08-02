package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import com.vk.core.utils.a;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import xsna.q630;
import xsna.rmw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cxu implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cxu(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0286  */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        phr phrVar;
        Pair pair;
        T t;
        T t2;
        Pair pair2;
        int i = this.b;
        int i2 = 0;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                fxu fxuVar = (fxu) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1197047470, intValue, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.HeaderImpl.Content.<anonymous>.<anonymous>.<anonymous> (BookingCalendarDayBlockView.kt:187)");
                    }
                    q630 E = ahn.E(fxuVar.j, "calendar_previous_period");
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2338790, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron24> (VkSdkIcons.kt:412)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_chevron_24, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.booking_accessibility_select_prev_month, 0, aVar);
                    if (((Boolean) fxuVar.e.getValue()).booleanValue()) {
                        aVar.K(-688604168);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getIcon().a;
                        aVar.j();
                    } else {
                        aVar.K(-688601349);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getIcon().l;
                        aVar.j();
                    }
                    pzu0.b(a, N, E, j, aVar, 8, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                float f = ListGroupCallView.o0;
                ((ListGroupCallView) obj4).X4((View) obj);
                return s3q0.a;
            case 2:
                q020 q020Var = (q020) obj4;
                va8 va8Var = (va8) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                int i3 = 2;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(va8Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1037264018, intValue2, -1, "com.vk.libvideo.design.compose.base.media.MediaImage.<anonymous> (MediaView.kt:79)");
                    }
                    boolean J = aVar2.J(q020Var.b);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    Pair pair3 = null;
                    if (J || x == c0012a) {
                        Integer num = q020Var.b;
                        x = num != null ? new qow(new gh7(num.intValue())) : null;
                        aVar2.R(x);
                    }
                    qow qowVar = (qow) x;
                    azl azlVar = (azl) aVar2.r(uvi.h);
                    long b = byc0.b(azlVar.j1(o6j.i(va8Var.f())), azlVar.j1(o6j.h(va8Var.f())));
                    Object[] objArr = q020Var.a().h() != null;
                    rmw rmwVar = q020Var.a;
                    if (rmwVar == null) {
                        aVar2.K(-1156898683);
                        aVar2.j();
                        phrVar = null;
                    } else {
                        aVar2.K(378322684);
                        uco ucoVar = new uco(b);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-447714796, 0, -1, "com.vk.libvideo.design.compose.utils.ImageViewState.ComposeDefaultImpls.asPainterWithState$default (ImageViewState.kt:-1)");
                        }
                        rmwVar.getClass();
                        aVar2.K(902722284);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(902722284, 0, -1, "com.vk.libvideo.design.compose.utils.ImageViewState.asPainterWithState (ImageViewState.kt:99)");
                        }
                        if (rmwVar instanceof rmw.d) {
                            aVar2.K(-67271300);
                            pair2 = new Pair(pg90.a(((rmw.d) rmwVar).a, 0, aVar2), rmw.e.a.C3614a.a);
                            aVar2.j();
                        } else if (rmwVar instanceof rmw.c) {
                            aVar2.K(-67268633);
                            pair2 = new Pair(w65.p(null, aVar2, 0), rmw.e.a.C3614a.a);
                            aVar2.j();
                        } else {
                            if (rmwVar instanceof rmw.h) {
                                aVar2.K(-67259788);
                                String str = ((rmw.h) rmwVar).a;
                                Object x2 = aVar2.x();
                                if (x2 == c0012a) {
                                    x2 = new bqt(i3);
                                    aVar2.R(x2);
                                }
                                phrVar = null;
                                Pair m = fwu0.m(null, str, null, null, (izs) x2, qowVar, aVar2, ((0 << 12) & 458752) | 24576, 77);
                                pair = new Pair(m.j(), rmw.a((chs) m.i()));
                                aVar2.j();
                            } else {
                                phrVar = null;
                                if (rmwVar instanceof rmw.g) {
                                    aVar2.K(-2084932805);
                                    List list = ((rmw.g) rmwVar).a;
                                    qow qowVar2 = (qowVar == null || (t2 = qowVar.a) == 0) ? null : new qow((ktc0) t2);
                                    Object x3 = aVar2.x();
                                    if (x3 == c0012a) {
                                        x3 = new tb4(28);
                                        aVar2.R(x3);
                                    }
                                    Pair h = fwu0.h(ucoVar.a, null, list, null, qowVar2, (izs) x3, null, aVar2, 698);
                                    aVar2 = aVar2;
                                    pair = new Pair(h.j(), rmw.a((chs) h.i()));
                                    aVar2.j();
                                } else {
                                    if (!(rmwVar instanceof rmw.f)) {
                                        throw alb0.c(-67271127, aVar2);
                                    }
                                    aVar2.K(-2084482685);
                                    azl azlVar2 = (azl) aVar2.r(uvi.h);
                                    rmw.f fVar = (rmw.f) rmwVar;
                                    Image image = fVar.a;
                                    boolean J2 = aVar2.J(image);
                                    Object x4 = aVar2.x();
                                    if (J2 || x4 == c0012a) {
                                        ImageSize Cb = image.Cb((int) (azlVar2.I0(uco.c(ucoVar.a)) * fVar.b), true, false);
                                        String str2 = Cb != null ? Cb.d.d : null;
                                        aVar2.R(str2);
                                        x4 = str2;
                                    }
                                    String str3 = (String) x4;
                                    qow qowVar3 = (qowVar == null || (t = qowVar.a) == 0) ? null : new qow((ktc0) t);
                                    Object x5 = aVar2.x();
                                    if (x5 == c0012a) {
                                        x5 = new f6w(1 == true ? 1 : 0);
                                        aVar2.R(x5);
                                    }
                                    Pair m2 = fwu0.m(null, str3, null, null, (izs) x5, qowVar3, aVar2, 24576, 77);
                                    pair = new Pair(m2.j(), rmw.a((chs) m2.i()));
                                    aVar2.j();
                                }
                            }
                            pair3 = pair;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar2.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar2.j();
                        }
                        phrVar = null;
                        pair3 = pair2;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        aVar2.j();
                    }
                    q630.a aVar3 = q630.a.a;
                    if (pair3 != null || objArr == true) {
                        aVar2.K(-1160600144);
                    } else {
                        aVar2.K(-1156732398);
                        ja8.a(txj0.d(aVar3, 1.0f), aVar2, 6);
                    }
                    aVar2.j();
                    if (q020Var.h) {
                        aVar2.K(378331369);
                        yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, ? extends s3q0> h2 = q020Var.a().h();
                        if (h2 == null) {
                            aVar2.K(-1156584591);
                        } else {
                            aVar2.K(378332816);
                            h2.invoke(txj0.d(aVar3, 1.0f), aVar2, 6);
                        }
                        aVar2.j();
                    } else {
                        aVar2.K(-1160600144);
                    }
                    aVar2.j();
                    if (objArr == true && epx.f(q020Var.e().getValue(), Boolean.TRUE)) {
                        aVar2.K(-1156406898);
                        mm2.f(pair3 != null, null, anp.e(phrVar, 3), anp.f(phrVar, 3), null, kai.c(797314493, new m020(i2, pair3, q020Var), aVar2), aVar2, 200064, 18);
                        aVar2.j();
                    } else {
                        aVar2.K(-1155705492);
                        if (pair3 != null) {
                            aVar2.K(-1155655830);
                            lg90 lg90Var = (lg90) pair3.i();
                            float f2 = q020Var.e;
                            Pair pair4 = pair3;
                            wkj wkjVar = q020Var.c;
                            dt1 dt1Var = q020Var.d;
                            q630 E2 = ahn.E(aVar3, "mvi_video_card_preview");
                            rmw.e eVar = (rmw.e) pair4.j();
                            rmw.e h3 = q020Var.c().h();
                            if (h3 != null) {
                                E2 = qri.a(E2, a5x.a, new zt7(2, eVar, (izs) h3));
                            }
                            androidx.compose.runtime.a aVar4 = aVar2;
                            r0v0.a(lg90Var, E2, dt1Var, wkjVar, f2, null, null, null, aVar4, 8, 224);
                            aVar2 = aVar4;
                        } else {
                            aVar2.K(-1160600144);
                        }
                        aVar2.j();
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                return new a.b(new baf0(m33.a(((Integer) obj).intValue(), (Context) obj4), ((Integer) obj2).intValue()), ((Boolean) obj3).booleanValue());
        }
    }
}

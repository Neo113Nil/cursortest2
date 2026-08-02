package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.compose.modal.internal.BottomSheetBehavior;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarouselItem;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import xsna.cri;
import xsna.dt1;
import xsna.ei3;
import xsna.gfb0;
import xsna.i11;
import xsna.q630;
import xsna.sh4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yh3 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ yh3(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        PlaylistsCarouselItem playlistsCarouselItem;
        int i = this.b;
        q630.a aVar = q630.a.a;
        int i2 = 6;
        int h = 1;
        switch (i) {
            case 0:
                DialogsCounters dialogsCounters = (DialogsCounters) obj2;
                Boolean bool = (Boolean) ((xpp) obj).a();
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Integer a = dialogsCounters.c().a();
                int intValue = a != null ? a.intValue() : 0;
                Integer a2 = dialogsCounters.b().a();
                return new ei3.a(intValue, booleanValue, (a2 != null ? a2.intValue() : 0) > 0);
            case 1:
                List list = (List) obj2;
                Object d = ((Result) obj).d();
                if (!(d instanceof Result.Failure)) {
                    d = AudioBook.zb((AudioBook) d, j5g.D0(new sh4.c(), list), false, 4193791);
                }
                return new Result(d);
            case 2:
                return pzl.b((String) obj, " must have been one of ", (String) obj2);
            case 3:
                ((Integer) obj).getClass();
                return "desc_above_" + ((pgf) obj2).a().hashCode();
            case 4:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1085743497, intValue2, -1, "com.vk.profile.community.impl.ui.profile.content.holders.events.ComposableSingletons$CommunityProfileContentEventsViewHolderKt.lambda$-1085743497.<anonymous> (CommunityProfileContentEventsViewHolder.kt:85)");
                    }
                    tth.a(null, jgz.e, aVar2, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1562163440, intValue3, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.screen.ComposableSingletons$ScreenKt.lambda$1562163440.<anonymous> (Screen.kt:34)");
                    }
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.f;
                    q630 d2 = txj0.d(aVar, 1.0f);
                    cp10 d3 = ja8.d(ty6Var, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, d2);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, d3, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, null, null, aVar3, 6, 510);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 6:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2108253928, intValue4, -1, "com.vk.core.compose.component.ComposableSingletons$VkSecondaryTabRowKt.lambda$2108253928.<anonymous> (VkSecondaryTabRow.kt:545)");
                    }
                    a.j g = androidx.compose.foundation.layout.a.g(8);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, aVar5, 6);
                    int hashCode2 = Long.hashCode(n34.n(aVar5));
                    sy90 D2 = aVar5.D();
                    q630 c2 = qri.c(aVar5, aVar);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar6);
                    } else {
                        aVar5.f();
                    }
                    k9q0.w(aVar5, a3, cri.a.f);
                    k9q0.w(aVar5, D2, cri.a.e);
                    k9q0.w(aVar5, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar5, cri.a.h);
                    k9q0.w(aVar5, c2, cri.a.d);
                    aVar5.K(878880928);
                    new khx();
                    m1i0 m1i0Var = new m1i0();
                    Object x = aVar5.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new com.vk.movika.sdk.base.ui.g0(19);
                        aVar5.R(x);
                    }
                    m1i0Var.b(true, (gzs) x, joi.c, null, aVar5, 438, 8);
                    Object x2 = aVar5.x();
                    if (x2 == c0012a) {
                        x2 = new iy2(15);
                        aVar5.R(x2);
                    }
                    m1i0Var.b(false, (gzs) x2, joi.d, null, aVar5, 438, 8);
                    rvi.a(opv0.a.b(Boolean.FALSE), kai.c(488888983, new zu3(m1i0Var, i2), aVar5), aVar5, 56);
                    aVar5.j();
                    aVar5.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 7:
                int i3 = vpi.f1;
                return new BottomSheetBehavior((com.vk.core.ui.bottomsheet.internal.b) obj, (u080) obj2);
            case 8:
                return Integer.valueOf(((zox) obj).M(((Integer) obj2).intValue()));
            case 9:
                int intValue5 = ((Integer) obj).intValue();
                ArrayList arrayList = ((gfb0) obj2).g;
                gfb0.a aVar7 = arrayList != null ? (gfb0.a) arrayList.get(intValue5) : null;
                gfb0.a.C2938a c2938a = aVar7 instanceof gfb0.a.C2938a ? (gfb0.a.C2938a) aVar7 : null;
                if (c2938a == null || (playlistsCarouselItem = c2938a.a) == null) {
                    return null;
                }
                return playlistsCarouselItem.b;
            case 10:
                ((ScrollToBottomView) obj).a(((kkm) obj2).f(R.attr.vk_legacy_accent));
                return s3q0.a;
            case 11:
                return new ihn0((String) obj, (lgn0) obj2);
            case 12:
                Long l = ((i11.d.b) obj).d;
                Long l2 = ((i11.d.b) obj2).d;
                if (l == null && l2 == null) {
                    h = 0;
                } else if (l == null) {
                    h = -1;
                } else if (l2 != null) {
                    h = epx.h(l.longValue(), l2.longValue());
                }
                return Integer.valueOf(h);
            default:
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar8.K(-1613855399);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1613855399, intValue6, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:195)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar8.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.g0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar8.j();
                return frv0Var;
        }
    }

    public /* synthetic */ yh3(rzr0 rzr0Var) {
        this.b = 12;
    }
}

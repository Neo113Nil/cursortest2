package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.preference.Preference;
import com.vk.core.ui.modal.VkModal;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragmentInternalComponent;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.dt1;
import xsna.e8v0;
import xsna.q630;
import xsna.toz;
import xsna.v5g;
import xsna.yqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i60 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ i60(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 6;
        switch (i) {
            case 0:
                return new Pair((b70) obj, (com.vk.core.utils.newtork.d) obj2);
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                aVar.K(-298388260);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-298388260, intValue, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookPlaybackQueueItem.Content.<anonymous> (AudioBookPlaybackQueueItem.kt:52)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1554705458, 0, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookPlaybackQueueItem.coverErrorContent (AudioBookPlaybackQueueItem.kt:104)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                v5g a = v5g.a.a(ylu0Var.getBackground().z, aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return a;
            case 2:
                ((q7v0) obj).a((VkOnboardingCampaign) obj2, VkOnboardingType.Highlighter, e8v0.m.b);
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1767692162, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$-1767692162.<anonymous> (VkAccentTabRow.kt:552)");
                    }
                    a.j g = androidx.compose.foundation.layout.a.g(8);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, aVar2, 6);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, q630.a.a);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a2, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    aVar2.K(-1238897542);
                    mj mjVar = new mj(new anx(new khx()));
                    Object x = aVar2.x();
                    if (x == c0012a) {
                        x = new lz2(7);
                        aVar2.R(x);
                    }
                    mjVar.b(true, (gzs) x, nni.e, null, aVar2, 438, 8);
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = new f4(11);
                        aVar2.R(x2);
                    }
                    mjVar.b(false, (gzs) x2, nni.f, null, aVar2, 438, 8);
                    rvi.a(opv0.a.b(Boolean.FALSE), kai.c(958213245, new com.vk.movika.tools.controls.seekbar.q(mjVar, i2), aVar2), aVar2, 56);
                    aVar2.j();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj).intValue();
                return ((s8r) obj2).d.getAbsolutePath();
            case 5:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                aVar4.K(312246656);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(312246656, intValue3, -1, "com.vk.core.compose.component.modal.VkModalBottomSheet.<anonymous> (Modal.kt:222)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-49441252, 6, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:211)");
                }
                WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                o3q0 o3q0Var = yqx0.a.c(aVar4).l;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                h7z h7zVar = new h7z(o3q0Var, 32);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return h7zVar;
            case 6:
                return j5g.u0((List) obj2, (List) obj);
            case 7:
                och0 och0Var = (och0) obj2;
                ky6 j = Preference.j();
                qaj0.c(j, "overlay_menu_button_position_x", Float.valueOf(och0Var.a));
                qaj0.c(j, "overlay_menu_button_position_y", Float.valueOf(och0Var.b));
                return s3q0.a;
            case 8:
                return Integer.valueOf(Math.min(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
            case 9:
                return new com.vk.libvideo.autoplay.a(false, null, null, false, false, false, null, SubtitlesConfigurationMode.ALWAYS_DISABLED, new toz.a(), null, null, null, false, null, 511995);
            case 10:
                ((Integer) obj2).getClass();
                gkl0.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                eol0.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                aVar5.K(-1304911204);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1304911204, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.coverContent.<anonymous> (Utils.kt:124)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-733344492, 48, -1, "com.vk.core.compose.component.image.content.LoadingContent.Companion.invoke (LoadingContent.kt:36)");
                }
                Object x3 = aVar5.x();
                if (x3 == c0012a) {
                    x3 = new ysz();
                    aVar5.R(x3);
                }
                ysz yszVar = (ysz) x3;
                ((zak0) yszVar.a).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return yszVar;
            case 13:
                return new VideoViewerFragmentInternalComponent((nrt0) obj2, (AppContextDiComponent) ((f8m) obj).a(fpf0.a(AppContextDiComponent.class)));
            case 14:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar6.K(-1173861547);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1173861547, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:256)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar6.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.p1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return frv0Var;
            default:
                ((VkModal) obj).a();
                g2v.d().a().u((Context) obj2, false, EmptyList.b, null, null);
                return s3q0.a;
        }
    }
}

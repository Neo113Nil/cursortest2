package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.feature.music.holders.MusicKidsCatalogVh;
import com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment.ClipCtaWithDonutFragment;
import com.vk.libvideo.bottomsheet.about.delegate.g0;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip.ClipSubtitleViewState;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.dt1;
import xsna.fvf;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qw6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qw6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 2;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((rw6) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                ClipCtaWithDonutFragment clipCtaWithDonutFragment = (ClipCtaWithDonutFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = ClipCtaWithDonutFragment.T;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-86868614, intValue, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment.ClipCtaWithDonutFragment.onCreateView.<anonymous>.<anonymous> (ClipCtaWithDonutFragment.kt:90)");
                    }
                    nzw nzwVar = clipCtaWithDonutFragment.R;
                    qcy<Object> qcyVar = ClipCtaWithDonutFragment.T[0];
                    qpc qpcVar = (qpc) nzwVar.getValue();
                    boolean J = aVar.J(clipCtaWithDonutFragment);
                    Object x = aVar.x();
                    if (J || x == c0012a) {
                        x = new kf1(clipCtaWithDonutFragment, 16);
                        aVar.R(x);
                    }
                    cpc.b(qpcVar, (izs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                c7d.c((ClipSubtitleViewState) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 3:
                fvf fvfVar = (fvf) obj3;
                myc0.h(fvfVar.W1(), null, null, new fvf.a.b(fvfVar, (ov70) obj2, null), 3);
                return s3q0.a;
            case 4:
                ((xlb0) obj).a();
                long j = ((ov70) obj2).a;
                ((nfu) obj3).getClass();
                throw null;
            case 5:
                HighlightEditFragment highlightEditFragment = (HighlightEditFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = HighlightEditFragment.h0;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1093270518, intValue2, -1, "com.vk.narratives.impl.highlights.HighlightEditFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (HighlightEditFragment.kt:177)");
                    }
                    tho0 tho0Var = (tho0) ((zak0) highlightEditFragment.a0).getValue();
                    boolean y = aVar2.y(highlightEditFragment);
                    Object x2 = aVar2.x();
                    if (y || x2 == c0012a) {
                        x2 = new udo(highlightEditFragment, 14);
                        aVar2.R(x2);
                    }
                    izs izsVar = (izs) x2;
                    String N = d370.N(R.string.highlight_create_enter_title, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var.getText().m;
                    Object x3 = aVar2.x();
                    if (x3 == c0012a) {
                        x3 = new v4v(r8 ? 1 : 0);
                        aVar2.R(x3);
                    }
                    nvu0.a(g8s.b.a.a(s2x.a.C3649a.b(tho0Var, izsVar, N, j2, 0L, null, null, null, null, null, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar2, 0, 196608, 16368), null, false, null, aVar2, 24576, 14), null, h8s.a.a(d370.N(R.string.highlight_create_title, 0, aVar2), false, null, null, null, aVar2, 196608, 30), null, null, aVar2, 0, 26);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                sev.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((o0z) obj3).n(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                izs izsVar2 = (izs) obj3;
                return Boolean.valueOf(!epx.f(izsVar2.invoke(obj), izsVar2.invoke(obj2)));
            case 9:
                return new c98(new kkc((UIBlockLink) obj2, (MusicKidsCatalogVh) obj3, (View) obj, i2), r11 ? 1 : 0);
            case 10:
                View view = (View) obj;
                wix wixVar = (wix) obj2;
                cjx cjxVar = ((vq50) obj3).E;
                (cjxVar != null ? cjxVar : null).i(view, wixVar, "DEFAULT");
                return s3q0.a;
            case 11:
                ((nma0) obj3).e.un();
                return s3q0.a;
            case 12:
                ((nhb0) obj3).b7(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 13:
                String str = (String) obj;
                lfg lfgVar = ((a1c0) obj3).i;
                if (lfgVar != null) {
                    lfgVar.Q1(str);
                }
                return s3q0.a;
            case 14:
                faf0 faf0Var = (faf0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1138498527, intValue3, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesChooserList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecomThemesChooserList.kt:88)");
                    }
                    float f = 24;
                    String str2 = faf0Var.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    q630 q = txj0.q(q630.a.a, f);
                    dt1.a.getClass();
                    mdx.a(f, Tensorflow.FRAME_WIDTH, aVar3, str2, txj0.B(q, dt1.a.f, 2));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 15:
                ((com.vk.clips.sdk.shared.item.static_ads.c) obj3).m.c().a(new oxk0((String) obj));
                return s3q0.a;
            default:
                g0.a aVar4 = (g0.a) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1962033255, intValue4, -1, "com.vk.libvideo.bottomsheet.about.delegate.VideoEpisodesDelegate.ViewHolder.<anonymous> (VideoEpisodesDelegate.kt:75)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(-1657244470, new z77(aVar4, 15), aVar5), aVar5, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ qw6(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}

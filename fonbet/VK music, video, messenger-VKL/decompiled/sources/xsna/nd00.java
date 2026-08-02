package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.idh0;
import xsna.q630;
import xsna.zra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nd00 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nd00(int i, Object obj, izs izsVar) {
        this.b = i;
        this.c = izsVar;
        this.d = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                mtk0 mtk0Var = (mtk0) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1674810617, intValue, -1, "com.vk.clips.coauthors.selector.ui.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainContent.kt:98)");
                }
                qqz.g(((d8p0) mtk0Var.getValue()).b, this.c, ahn.E(q630.a.a, "SelectedContainer"), aVar, 384);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                yrb0 yrb0Var = (yrb0) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(991134048, intValue2, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollEditorSettings.<anonymous> (PollEditorSettings.kt:111)");
                }
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                int hashCode = Long.hashCode(n34.n(aVar2));
                sy90 D = aVar2.D();
                q630.a aVar3 = q630.a.a;
                q630 c = qri.c(aVar2, aVar3);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar4);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, a, cri.a.f);
                k9q0.w(aVar2, D, cri.a.e);
                k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(aVar2, cri.a.h);
                k9q0.w(aVar2, c, cri.a.d);
                float f = 8;
                f9t.e(txj0.h(aVar3, f), aVar2, 6);
                fob0.a(this.c, yrb0Var, ahn.E(aVar3, "pollEditorSettingsDatePicker"), aVar2, 384);
                if (xga0.c(aVar3, f, aVar2, 6)) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            default:
                idh0.a aVar5 = (idh0.a) this.d;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar6.J(s890Var) ? 4 : 2;
                }
                if (aVar6.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(573809197, intValue3, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Loaded.<anonymous>.<anonymous> (Screen.kt:150)");
                    }
                    boolean isEmpty = aVar5.b.isEmpty();
                    q630.a aVar7 = q630.a.a;
                    if (isEmpty) {
                        aVar6.K(380027435);
                        q630 C = s200.C(txj0.d(aVar7, 1.0f), s890Var);
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar6));
                        sy90 D2 = aVar6.D();
                        q630 c2 = qri.c(aVar6, C);
                        cri.h7.getClass();
                        LayoutNode.a aVar8 = cri.a.b;
                        if (aVar6.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar6.H();
                        if (aVar6.L()) {
                            aVar6.I(aVar8);
                        } else {
                            aVar6.f();
                        }
                        k9q0.w(aVar6, d, cri.a.f);
                        k9q0.w(aVar6, D2, cri.a.e);
                        k9q0.w(aVar6, Integer.valueOf(hashCode2), cri.a.g);
                        k9q0.t(aVar6, cri.a.h);
                        k9q0.w(aVar6, c2, cri.a.d);
                        ldv0.d(ahn.E(ra8.a.b(aVar7, dt1.a.f), "AttachedClipsScreenTags.PLACEHOLDER"), null, zra0.a.a(d370.N(R.string.attached_clips_placeholder_title, 0, aVar6), null, d370.N(R.string.attached_clips_placeholder_description, 0, aVar6), null, aVar6, 196608, 26), null, null, null, false, aVar6, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                        aVar6.G();
                        aVar6.j();
                    } else {
                        aVar6.K(380729895);
                        q630 C2 = s200.C(aVar7, s890Var);
                        izs izsVar = this.c;
                        ich0.d(aVar5, izsVar, C2, aVar6, 0);
                        ich0.e(aVar5, izsVar, aVar6, 0);
                        aVar6.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ nd00(idh0.a aVar, izs izsVar) {
        this.b = 2;
        this.d = aVar;
        this.c = izsVar;
    }
}

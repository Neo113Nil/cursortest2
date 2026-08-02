package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.TooltipsData;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;

/* compiled from: ClipsTooltipsInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class caf {
    public final h7v a;
    public final daf b;

    public caf(jwe jweVar, h7v h7vVar) {
        this.a = h7vVar;
        this.b = jweVar.b();
    }

    public final TooltipsData a() {
        Hint p;
        Hint p2;
        Hint p3;
        HintId hintId = HintId.CLIPS_COAUTHORS_PUBLICATION_ONBOARDING;
        h7v h7vVar = this.a;
        String str = null;
        String str2 = (!h7vVar.m(hintId) || (p3 = h7vVar.p(hintId.getId())) == null) ? null : p3.c;
        daf dafVar = this.b;
        boolean z = !dafVar.l();
        boolean z2 = !dafVar.e();
        boolean z3 = !dafVar.g();
        boolean z4 = !dafVar.k();
        String id = HintId.CLIPS_TREND_HASHTAG.getId();
        String str3 = (!h7vVar.a(id) || (p2 = h7vVar.p(id)) == null) ? null : p2.c;
        boolean z5 = !dafVar.c();
        boolean m = h7vVar.m(HintId.CLIPS_DONUT_ACTION_BUTTON);
        HintId hintId2 = HintId.CLIPS_NEW_BC_POSTING_ONBOARDING;
        if (h7vVar.m(hintId2) && (p = h7vVar.p(hintId2.getId())) != null) {
            str = p.c;
        }
        return new TooltipsData(str2, str, z, z2, z3, z4, str3, z5, m);
    }
}

package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Collection;

/* compiled from: NarrativeRouterImpl.kt */
/* loaded from: classes3.dex */
public final class tu50 implements su50 {
    @Override // xsna.su50
    public final oz50 a(Narrative narrative, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        int i = HighlightEditFragment.h0;
        UserId userId = narrative.c;
        int i2 = narrative.b;
        String a = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
        Bundle bundle = new Bundle();
        bundle.putParcelable("owner_id", userId);
        bundle.putInt("EXTRA_HIGHLIGHT_ID", i2);
        bundle.putString("ref", a);
        oz50 oz50Var = new oz50(HighlightEditFragment.class, null, bundle);
        oz50Var.s(true);
        return oz50Var;
    }

    @Override // xsna.su50
    public final oz50 b(UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z) {
        int i = AllHighlightsFragment.g0;
        Bundle bundle = new Bundle();
        bundle.putParcelable("owner_id", userId);
        bundle.putString("ref", com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen));
        bundle.putBoolean("edit_mode", z);
        oz50 oz50Var = new oz50(AllHighlightsFragment.class, null, bundle);
        oz50Var.s(true);
        return oz50Var;
    }

    @Override // xsna.su50
    public final oz50 c(UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Collection<Integer> collection) {
        int i = HighlightEditFragment.h0;
        String a = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
        Bundle bundle = new Bundle();
        bundle.putParcelable("owner_id", userId);
        bundle.putIntegerArrayList("EXTRA_STORY_IDS", p4g.q(collection));
        bundle.putString("ref", a);
        oz50 oz50Var = new oz50(HighlightEditFragment.class, null, bundle);
        oz50Var.s(true);
        return oz50Var;
    }
}

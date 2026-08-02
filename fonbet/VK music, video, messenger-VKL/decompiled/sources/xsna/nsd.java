package xsna;

import com.vk.core.preference.Preference;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: ClipsDraftCounterCoordinatorProvider.kt */
/* loaded from: classes14.dex */
public final class nsd {
    public final std a;

    public nsd(std stdVar) {
        this.a = stdVar;
    }

    public final void a() {
        Preference.F(0L, "clips_draft_prefs", "unseen_drafts_pref");
    }

    public final int b() {
        return (int) Preference.m(0L, "clips_draft_prefs", "unseen_drafts_pref");
    }

    public final void c(int i) {
        Preference.F(swe0.i(Preference.m(0L, "clips_draft_prefs", "unseen_drafts_pref") + i, 0L, ((Number) myc0.i(EmptyCoroutineContext.b, new msd(this, null))).intValue()), "clips_draft_prefs", "unseen_drafts_pref");
    }
}

package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$SeenMediaInfo;
import com.vk.story.viewer.impl.presentation.stories.StoryViewActivity;

/* compiled from: ActionStoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final class p50 implements b780 {
    public final /* synthetic */ String b;
    public final /* synthetic */ q50 c;
    public final /* synthetic */ boolean d;

    public p50(String str, q50 q50Var, boolean z) {
        this.b = str;
        this.c = q50Var;
        this.d = z;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        mcr0.s(this.b).subscribe();
        q50 q50Var = this.c;
        q7r q7rVar = q50Var.a;
        q7r q7rVar2 = q50Var.a;
        vrl0 a = q7rVar.a();
        if (a != null) {
            StoryEntry currentStory = q7rVar2.i0.getCurrentStory();
            mkm0 mkm0Var = q7rVar2.i0;
            a.d(currentStory, mkm0Var.f, this.d, false, new MobileOfficialAppsConStoriesStat$SeenMediaInfo(MobileOfficialAppsConStoriesStat$SeenMediaInfo.ContentType.PHOTO, mkm0Var.getContext() instanceof StoryViewActivity, Integer.valueOf(i2), Integer.valueOf(i), 0, Integer.valueOf(q50.a(q50Var))));
        }
        q50Var.l();
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}

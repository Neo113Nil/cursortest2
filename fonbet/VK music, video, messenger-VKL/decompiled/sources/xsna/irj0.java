package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: SimpleLinksBridgeImpl.kt */
/* loaded from: classes18.dex */
public final class irj0 implements hrj0 {
    public final qdz a;

    public irj0(qdz qdzVar) {
        this.a = qdzVar;
    }

    @Override // xsna.hrj0
    public final boolean a(Context context, String str) {
        return maz.c(this.a.e(), context, str, new LaunchContext(false, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_EDITOR), null, null, null, null, null, "story", null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108343), null, null, 24);
    }
}

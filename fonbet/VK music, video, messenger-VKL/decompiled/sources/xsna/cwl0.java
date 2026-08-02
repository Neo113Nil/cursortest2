package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.List;

/* compiled from: StoriesViewerConfig.kt */
/* loaded from: classes5.dex */
public final class cwl0 {
    public final UserId a;
    public final String b;
    public final List<StoriesContainer> c;
    public final i0u0 d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint g;
    public final StoryViewerRouter.a h;

    /* JADX WARN: Multi-variable type inference failed */
    public cwl0(UserId userId, String str, List<? extends StoriesContainer> list, i0u0 i0u0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryViewerRouter.a aVar) {
        this.a = userId;
        this.b = str;
        this.c = list;
        this.d = i0u0Var;
        this.e = gzsVar;
        this.f = gzsVar2;
        this.g = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.h = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwl0)) {
            return false;
        }
        cwl0 cwl0Var = (cwl0) obj;
        return epx.f(this.a, cwl0Var.a) && epx.f(this.b, cwl0Var.b) && epx.f(this.c, cwl0Var.c) && epx.f(this.d, cwl0Var.d) && epx.f(this.e, cwl0Var.e) && epx.f(this.f, cwl0Var.f) && this.g == cwl0Var.g && epx.f(this.h, cwl0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + sf3.a(sf3.a((this.d.hashCode() + fw3.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f)) * 31;
        StoryViewerRouter.a aVar = this.h;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "StoriesViewerConfig(userId=" + this.a + ", storyId=" + this.b + ", storiesContainers=" + this.c + ", viewProvider=" + this.d + ", onShow=" + this.e + ", onDismiss=" + this.f + ", viewEntryPoint=" + this.g + ", animationProvider=" + this.h + ')';
    }
}

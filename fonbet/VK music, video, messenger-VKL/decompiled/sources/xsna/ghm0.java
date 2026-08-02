package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.lists.c;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.a;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import java.util.LinkedHashSet;
import xsna.oem0;

/* compiled from: StoryStatisticsStickersPagedDataProviderDelegate.kt */
/* loaded from: classes6.dex */
public final class ghm0 implements c.l<VKList<StoryQuestionEntry>> {
    public final jfm0 b;
    public final wmc c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final LinkedHashSet e = new LinkedHashSet();
    public Integer f;
    public UserId g;
    public int h;

    public ghm0(StoryEntry storyEntry, jfm0 jfm0Var, io.reactivex.rxjava3.disposables.b bVar, wmc wmcVar) {
        this.b = jfm0Var;
        this.c = wmcVar;
        bVar.b(hg1.c(jfm0Var.o().a, oem0.a.b.class, oem0.c.a.class).subscribe(new m330(new dn20(this, 29), 28)));
        this.g = storyEntry.d;
        this.h = storyEntry.c;
    }

    public final io.reactivex.rxjava3.core.q<VKList<StoryQuestionEntry>> a(int i, com.vk.lists.c cVar, boolean z) {
        LoadStrategy loadStrategy;
        this.c.invoke(new a.c.j(z));
        if (this.e.contains(Integer.valueOf(this.h))) {
            loadStrategy = LoadStrategy.ONLY_CACHE;
        } else {
            if (z) {
                int i2 = this.h;
                Integer num = this.f;
                if (num != null && i2 == num.intValue()) {
                    loadStrategy = LoadStrategy.ONLY_API;
                }
            }
            loadStrategy = z ? LoadStrategy.CACHE_FIRST : LoadStrategy.ONLY_API;
        }
        if (z) {
            this.f = Integer.valueOf(this.h);
        }
        return this.b.i(new rqe0(this.h, cVar.k(), i, this.g), loadStrategy, z);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<StoryQuestionEntry>> hj(com.vk.lists.c cVar, boolean z) {
        this.d.e();
        this.c.invoke(a.d.b);
        return a(0, cVar, true);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VKList<StoryQuestionEntry>> ui(int i, com.vk.lists.c cVar) {
        return a(i, cVar, false);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<StoryQuestionEntry>> qVar, boolean z, com.vk.lists.c cVar) {
        this.d.b(qVar.subscribe(new gl30(new ii3(z, cVar, this), 27), new afs(new v6k(this, z, 2), 27)));
    }
}

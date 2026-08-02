package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.lists.c;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.a;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import java.util.LinkedHashSet;
import xsna.oem0;

/* compiled from: StoryStatisticsViewersPagedDataProviderDelegate.kt */
/* loaded from: classes6.dex */
public final class eim0 implements c.m<tnm0> {
    public final jfm0 b;
    public final kf8 c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final LinkedHashSet e = new LinkedHashSet();
    public Integer f;
    public UserId g;
    public int h;

    public eim0(StoryEntry storyEntry, jfm0 jfm0Var, io.reactivex.rxjava3.disposables.b bVar, kf8 kf8Var) {
        this.b = jfm0Var;
        this.c = kf8Var;
        bVar.b(hg1.c(jfm0Var.o().a, oem0.a.d.class, oem0.c.b.class).subscribe(new rkz(new aj50(this, 29), 27)));
        this.g = storyEntry.d;
        this.h = storyEntry.c;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<tnm0> O9(String str, com.vk.lists.c cVar) {
        return a(str, cVar, false);
    }

    public final io.reactivex.rxjava3.core.q<tnm0> a(String str, com.vk.lists.c cVar, boolean z) {
        LoadStrategy loadStrategy;
        this.c.invoke(new a.d.c(z));
        if (this.e.contains(Integer.valueOf(this.h))) {
            loadStrategy = LoadStrategy.ONLY_CACHE;
        } else {
            if (z) {
                int i = this.h;
                Integer num = this.f;
                if (num != null && i == num.intValue()) {
                    loadStrategy = LoadStrategy.ONLY_API;
                }
            }
            loadStrategy = z ? LoadStrategy.CACHE_FIRST : LoadStrategy.ONLY_API;
        }
        if (z) {
            this.f = Integer.valueOf(this.h);
        }
        return this.b.f(new v3u0(this.g, this.h, cVar.k(), str, false), loadStrategy);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<tnm0> hj(com.vk.lists.c cVar, boolean z) {
        this.d.e();
        this.c.invoke(a.C1820a.b);
        return a("", cVar, true);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<tnm0> qVar, boolean z, com.vk.lists.c cVar) {
        this.d.b(qVar.subscribe(new k2y(new dim0(cVar, this, z), 18), new qw40(new cdg(this, z, 1), 19)));
    }
}

package xsna;

import android.util.SparseArray;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import com.vk.voip.ui.sessionrooms.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.i4c;
import xsna.qwi0;
import xsna.rwi0;
import xsna.wwi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class j4c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j4c(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VKList<StoryUserProfile> vKList;
        switch (this.b) {
            case 0:
                v8s v8sVar = (v8s) this.c;
                yvj yvjVar = (yvj) this.d;
                xvy xvyVar = (xvy) this.e;
                l5c l5cVar = (l5c) this.f;
                h8c h8cVar = (h8c) obj;
                Integer g = i7o0.g(v8sVar.a, new vs(h8cVar, 18));
                if (g == null) {
                    break;
                } else {
                    myc0.h(yvjVar, null, null, new i4c.e.a(xvyVar, g.intValue(), h8cVar, l5cVar, null), 3);
                    break;
                }
            case 1:
                com.vk.clips.playlists.di.a aVar = (com.vk.clips.playlists.di.a) this.c;
                ClipsPlaylist clipsPlaylist = (ClipsPlaylist) this.d;
                vve.e(aVar.c, new lve(clipsPlaylist.c, new jl4(3, clipsPlaylist, (VideoFile) this.f)), false, ((Boolean) ((lk) this.e).invoke()).booleanValue(), 2);
                break;
            case 2:
                qwi0.b bVar = (qwi0.b) this.c;
                mwi0 mwi0Var = (mwi0) this.d;
                wwi0.c.C3962c c3962c = (wwi0.c.C3962c) this.e;
                wwi0 wwi0Var = (wwi0) this.f;
                whr0 whr0Var = (whr0) ((Map) obj).get(bVar.b.id);
                if (whr0Var != null) {
                    String str = whr0Var.q;
                    if (str == null) {
                        str = whr0Var.e();
                    }
                    f.a.b a = xwi0.a(c3962c);
                    wwi0.b bVar2 = wwi0Var.e;
                    mwi0Var.V(new rwi0.a.C3639a(str, a, bVar2 instanceof wwi0.b.C3961b ? epx.f(((wwi0.b.C3961b) bVar2).a.a, c3962c.a) : false));
                }
                break;
            default:
                jzl0 jzl0Var = (jzl0) this.c;
                LoadStrategy loadStrategy = (LoadStrategy) this.d;
                StoryEntry storyEntry = (StoryEntry) this.e;
                StoriesContainer storiesContainer = (StoriesContainer) this.f;
                tnm0 tnm0Var = (tnm0) obj;
                StoryBottomViewGroup storyBottomViewGroup = jzl0Var.a;
                SparseArray<Boolean> sparseArray = jzl0Var.E;
                int i = tnm0Var.b;
                boolean z = tnm0Var.e;
                if (loadStrategy == LoadStrategy.CACHE_FIRST && z && tnm0Var.d == null) {
                    jzl0Var.q.add(Integer.valueOf(storyEntry.c));
                }
                VKList<StoryUserProfile> vKList2 = tnm0Var.a;
                VKList<StoryUserProfile> vKList3 = new VKList<>(j5g.H0(vKList2, 3));
                vKList3.l(vKList2.k() == 1);
                vKList3.o(vKList2.i());
                jzl0Var.o = vKList3;
                HashMap<Integer, VKList<StoryUserProfile>> hashMap = storiesContainer.h;
                if (((hashMap == null || (vKList = hashMap.get(Integer.valueOf(storyEntry.c))) == null) ? 0 : vKList.i()) != vKList3.i() || tnm0Var.f > 0) {
                    sparseArray.put(storyEntry.c, Boolean.valueOf(loadStrategy == LoadStrategy.ONLY_CACHE));
                }
                HashMap<Integer, VKList<StoryUserProfile>> hashMap2 = storiesContainer.h;
                if (hashMap2 != null) {
                    hashMap2.put(Integer.valueOf(storyEntry.c), vKList3);
                }
                storiesContainer.i.put(Integer.valueOf(storyEntry.c), Integer.valueOf(i));
                List<uwl0> g2 = jzl0Var.g(storyEntry, storiesContainer, vKList3, i, false);
                jzl0Var.r = g2;
                storyBottomViewGroup.setActionItems(g2);
                int i2 = jzl0Var.D;
                int i3 = storyEntry.c;
                boolean z2 = i2 != i3;
                jzl0Var.D = i3;
                Boolean bool = sparseArray.get(i3);
                if (bool == null) {
                    if (z2) {
                        storyBottomViewGroup.T4();
                    }
                } else if (!vKList2.isEmpty() && (bool.booleanValue() || z)) {
                    VKList vKList4 = new VKList(rli0.A(rli0.y(new fhn(new i5g(vKList2), new hyu(21)), 10)));
                    vKList4.l(vKList2.k() == 1);
                    vKList4.o(vKList2.i());
                    sparseArray.delete(storyEntry.c);
                    storyBottomViewGroup.T4();
                    storyBottomViewGroup.L = false;
                    storyBottomViewGroup.H.h = false;
                    storyBottomViewGroup.setRunLikesAnimation(vKList4);
                    nzl0 nzl0Var = jzl0Var.j;
                    if (nzl0Var == null) {
                        nzl0Var = null;
                    }
                    nzl0Var.n(storyEntry);
                    nzl0 nzl0Var2 = jzl0Var.j;
                    (nzl0Var2 != null ? nzl0Var2 : null).b(storyEntry.c, storyEntry.d);
                }
                break;
        }
        return s3q0.a;
    }
}

package xsna;

import com.google.android.material.appbar.AppBarLayout;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.fave.fragments.FavesFragment;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class rsq implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rsq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        ExtendedCommunityProfile g;
        ArrayList<StoriesContainer> arrayList;
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList;
        StoryEntry storyEntry;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                FavesFragment favesFragment = (FavesFragment) obj2;
                FaveTag faveTag = (FaveTag) obj;
                if (i != 1201) {
                    if (i != 1204) {
                        if (i != 1205) {
                            int i4 = FavesFragment.j0;
                            break;
                        } else {
                            FaveTag faveTag2 = favesFragment.U;
                            if (faveTag2 != null) {
                                if (Integer.valueOf(faveTag2.b).equals(faveTag != null ? Integer.valueOf(faveTag.b) : null)) {
                                    favesFragment.U = faveTag;
                                    favesFragment.ko();
                                    break;
                                }
                            }
                        }
                    } else {
                        FaveTag faveTag3 = favesFragment.U;
                        if (faveTag3 != null && faveTag3.equals(faveTag)) {
                            enq.a.getClass();
                            enq.e(null);
                            break;
                        }
                    }
                } else {
                    favesFragment.U = faveTag;
                    AppBarLayout appBarLayout = favesFragment.V;
                    if (appBarLayout != null) {
                        appBarLayout.g(true, true, true);
                    }
                    favesFragment.ko();
                    break;
                }
                break;
            default:
                vzd0 vzd0Var = (vzd0) obj2;
                zjm0 zjm0Var = (zjm0) obj;
                boolean c = vzd0Var.c(zjm0Var);
                m3a m3aVar = vzd0Var.a;
                if (c) {
                    boolean z = !fkq0.d(m3aVar.h()) && epx.f(zjm0Var.j.e, fkq0.e(m3aVar.h()));
                    boolean z2 = fkq0.d(m3aVar.h()) && vzd0Var.f.a(m3aVar.h());
                    if ((z || z2) && (g = m3aVar.g()) != null && (arrayList = g.v1) != null) {
                        for (StoriesContainer storiesContainer : arrayList) {
                            if (storiesContainer != null && (copyOnWriteArrayList = storiesContainer.g) != null) {
                                Iterator<StoryEntry> it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                    StoryEntry next = it.next();
                                    if (next.b && next.c == zjm0Var.a && (storyEntry = zjm0Var.g) != null) {
                                        next.y = zjm0Var.f;
                                        next.Xb(storyEntry);
                                    }
                                }
                            }
                        }
                        vzd0Var.b.a(arrayList);
                        if (z) {
                            vzd0Var.d.invoke(new d.b.C1592b(zjm0Var.g.Gb()));
                            break;
                        }
                    }
                }
                break;
        }
    }
}

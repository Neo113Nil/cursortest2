package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.SimpleStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StubAddStoriesContainer;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: StoriesRearrangerImpl.kt */
/* loaded from: classes11.dex */
public final class hul0 implements gul0 {
    public final b25 a;
    public final tov b;
    public final gxh c;

    public hul0(b25 b25Var, tvl0 tvl0Var, gxh gxhVar) {
        this.a = b25Var;
        this.b = tvl0Var;
        this.c = gxhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r13 == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gul0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList<StoriesContainer> a(ArrayList<StoriesContainer> arrayList, StoryEntryExtended storyEntryExtended, boolean z, boolean z2) {
        Object obj;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (!z) {
            arrayList = new ArrayList<>(arrayList);
        }
        Iterator<StoriesContainer> it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            StoriesContainer next = it.next();
            if (next.Qb() && !fsk.x(next)) {
                break;
            }
            i++;
        }
        if (i > 0) {
            arrayList.add(0, arrayList.remove(i));
        }
        b25 b25Var = this.a;
        if (z2) {
            StoriesContainer storiesContainer = (StoriesContainer) j5g.a0(arrayList);
            if (storiesContainer != null) {
                boolean Qb = storiesContainer.Qb();
                boolean z3 = storiesContainer.Qb() && fsk.x(storiesContainer);
                if (Qb) {
                }
            }
            SimpleStoriesContainer simpleStoriesContainer = new SimpleStoriesContainer(b25Var.o().b(), new ArrayList());
            simpleStoriesContainer.m = storyEntryExtended;
            arrayList.add(0, simpleStoriesContainer);
        }
        tov tovVar = this.b;
        ArrayList j = storyEntryExtended == null ? tovVar.j() : tovVar.c(storyEntryExtended.zb().c, storyEntryExtended.zb().d);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : j) {
            if (epx.f(((zjm0) obj2).j.Jb(), b25Var.c())) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            zjm0 zjm0Var = (zjm0) it2.next();
            SimpleStoriesContainer simpleStoriesContainer2 = null;
            if (zjm0Var.c()) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (!fsk.x((StoriesContainer) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    StoryOwner Nb = ((StoriesContainer) obj).Nb();
                    if (Nb != null && Nb.Ib(zjm0Var.a())) {
                        break;
                    }
                }
                StoriesContainer storiesContainer2 = (StoriesContainer) obj;
                int indexOf = arrayList.indexOf(storiesContainer2);
                if (storiesContainer2 != null) {
                    arrayList.remove(indexOf);
                } else {
                    Group C0 = this.c.C0(zjm0Var.a());
                    if (C0 != null) {
                        C0.E = true;
                        simpleStoriesContainer2 = new SimpleStoriesContainer(C0, new ArrayList());
                    }
                    if (simpleStoriesContainer2 == null) {
                        L.l("Error! Cache don't contains story group!");
                        s3q0 s3q0Var = s3q0.a;
                    }
                    storiesContainer2 = simpleStoriesContainer2;
                }
                StoryEntry e = zjm0Var.e(b25Var.c());
                if (storiesContainer2 != null && !storiesContainer2.Mb().contains(e)) {
                    Iterator<StoriesContainer> it4 = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (fsk.A(it4.next())) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        arrayList.add(i2 + 1, storiesContainer2);
                        storiesContainer2.Mb().add(e);
                    } else {
                        arrayList.add(1, storiesContainer2);
                        storiesContainer2.Mb().add(e);
                    }
                }
            } else {
                Iterator<T> it5 = arrayList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next2 = it5.next();
                    StoriesContainer storiesContainer3 = (StoriesContainer) next2;
                    if (storiesContainer3.Rb() && !(storiesContainer3 instanceof StubAddStoriesContainer)) {
                        simpleStoriesContainer2 = next2;
                        break;
                    }
                }
                SimpleStoriesContainer simpleStoriesContainer3 = simpleStoriesContainer2;
                if (simpleStoriesContainer3 == null || !simpleStoriesContainer3.Nb().Kb()) {
                    simpleStoriesContainer3 = new SimpleStoriesContainer(b25Var.o().b(), new ArrayList());
                    simpleStoriesContainer3.m = storyEntryExtended;
                    arrayList.add(0, simpleStoriesContainer3);
                }
                StoryEntry e2 = zjm0Var.e(b25Var.c());
                if (!simpleStoriesContainer3.Mb().contains(e2)) {
                    simpleStoriesContainer3.Mb().add(e2);
                }
            }
        }
        for (StoriesContainer storiesContainer4 : arrayList) {
            if (!fsk.x(storiesContainer4)) {
                CopyOnWriteArrayList<StoryEntry> Mb = storiesContainer4.Mb();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : Mb) {
                    StoryEntry storyEntry = (StoryEntry) obj4;
                    if (storyEntryExtended != null && storyEntry.Hb() == null && storyEntry.O == storyEntryExtended.zb().c && epx.f(storyEntry.P, storyEntryExtended.zb().d)) {
                        arrayList4.add(obj4);
                    }
                }
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    ((StoryEntry) it6.next()).Wb(storyEntryExtended);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    @Override // xsna.gul0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b(UserId userId, ArrayList arrayList) {
        SimpleStoriesContainer simpleStoriesContainer;
        ArrayList arrayList2 = new ArrayList(j5g.V(arrayList));
        boolean isEmpty = arrayList2.isEmpty();
        b25 b25Var = this.a;
        if (isEmpty) {
            if (userId.b < 0) {
                Group C0 = this.c.C0(fkq0.e(userId));
                if (C0 != null) {
                    simpleStoriesContainer = new SimpleStoriesContainer(C0, new ArrayList());
                    if (simpleStoriesContainer != null) {
                        return new ArrayList();
                    }
                    arrayList2.add(simpleStoriesContainer);
                }
                simpleStoriesContainer = null;
                if (simpleStoriesContainer != null) {
                }
            } else {
                if (b25Var.a(userId)) {
                    simpleStoriesContainer = new SimpleStoriesContainer(b25Var.o().b(), new ArrayList());
                    if (simpleStoriesContainer != null) {
                    }
                }
                simpleStoriesContainer = null;
                if (simpleStoriesContainer != null) {
                }
            }
        }
        for (zjm0 zjm0Var : this.b.j()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                StoriesContainer storiesContainer = (StoriesContainer) it.next();
                StoryOwner Nb = storiesContainer.Nb();
                boolean z = false;
                boolean z2 = !zjm0Var.c() && Nb.Kb();
                boolean z3 = zjm0Var.c() && Nb != null && Nb.Ib(zjm0Var.a());
                CopyOnWriteArrayList<StoryEntry> Mb = storiesContainer.Mb();
                if (Mb == null || !Mb.isEmpty()) {
                    Iterator<T> it2 = Mb.iterator();
                    while (it2.hasNext()) {
                        if (((StoryEntry) it2.next()).c == zjm0Var.a) {
                            break;
                        }
                    }
                }
                z = true;
                if (z2 || z3) {
                    if (z) {
                        storiesContainer.Mb().add(zjm0Var.e(b25Var.c()));
                    }
                }
            }
        }
        return new ArrayList(arrayList2);
    }
}

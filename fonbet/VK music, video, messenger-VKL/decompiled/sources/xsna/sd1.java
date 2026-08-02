package xsna;

import android.content.Context;
import com.vk.dto.common.data.VKList;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.dto.stories.model.SimpleStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.stories.design.view.archive.StoryArchiveFastScrollView;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class sd1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sd1(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        StoryEntry storyEntry;
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList;
        boolean z;
        Integer num;
        switch (this.b) {
            case 0:
                dwj dwjVar = (dwj) obj;
                break;
            case 1:
                DiscoverId discoverId = (DiscoverId) this.d;
                if (this.c) {
                    DiscoverNewsEntriesRepository.b.remove(discoverId);
                }
                break;
            case 2:
                rah0 rah0Var = (rah0) this.d;
                rah0Var.b.l(true, this.c);
                rah0Var.a.L();
                break;
            case 3:
                nmk0 nmk0Var = (nmk0) this.d;
                if (!((it80) obj).a()) {
                    lmk0 lmk0Var = nmk0Var.a;
                    (this.c ? lmk0Var.b : lmk0Var.a).b();
                }
                break;
            case 4:
                oxl0 oxl0Var = (oxl0) this.d;
                ppt pptVar = (ppt) obj;
                ListDataSet<zif0> listDataSet = oxl0Var.g;
                StoryArchiveFragment storyArchiveFragment = oxl0Var.b;
                if (oxl0Var.i == null) {
                    oxl0Var.i = new mxl0(pptVar.b);
                }
                mxl0 mxl0Var = oxl0Var.i;
                if (mxl0Var == null) {
                    mxl0Var = null;
                }
                mxl0Var.b = pptVar.b;
                VKList<StoryEntry> vKList = pptVar.a;
                int i2 = 1;
                if (this.c) {
                    listDataSet.clear();
                    mxl0 mxl0Var2 = oxl0Var.i;
                    if (mxl0Var2 == null) {
                        mxl0Var2 = null;
                    }
                    ((ArrayList) mxl0Var2.c).clear();
                    mxl0Var2.e = null;
                    mxl0Var2.f = null;
                    if (vKList.isEmpty()) {
                        storyArchiveFragment.no(false);
                    } else {
                        storyArchiveFragment.no(true);
                    }
                }
                StoryArchiveFastScrollView storyArchiveFastScrollView = storyArchiveFragment.Z;
                if (storyArchiveFastScrollView != null) {
                    storyArchiveFastScrollView.setScrolling(false);
                }
                com.vk.lists.c cVar = oxl0Var.h;
                if (cVar != null) {
                    cVar.l(vKList.i());
                }
                mxl0 mxl0Var3 = oxl0Var.i;
                if (mxl0Var3 == null) {
                    mxl0Var3 = null;
                }
                Calendar calendar = (Calendar) mxl0Var3.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) mxl0Var3.c;
                StoriesContainer storiesContainer = (StoriesContainer) j5g.k0(arrayList2);
                CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList2 = storiesContainer != null ? storiesContainer.g : null;
                boolean z2 = copyOnWriteArrayList2 == null;
                Iterator<StoryEntry> it = vKList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    int i4 = i3 + 1;
                    StoryEntry next = it.next();
                    calendar.setTimeInMillis(next.f);
                    int i5 = calendar.get(i2);
                    int i6 = calendar.get(6);
                    boolean z3 = i2;
                    int i7 = calendar.get(5);
                    VKList<StoryEntry> vKList2 = vKList;
                    Integer num2 = (Integer) mxl0Var3.f;
                    if (num2 != null && i6 == num2.intValue() && (num = (Integer) mxl0Var3.e) != null && i5 == num.intValue()) {
                        if (copyOnWriteArrayList2 != null) {
                            copyOnWriteArrayList2.add(next);
                        }
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        i = i3;
                        storyEntry = next;
                        z = false;
                    } else {
                        mxl0Var3.f = Integer.valueOf(i6);
                        mxl0Var3.e = Integer.valueOf(i5);
                        if (copyOnWriteArrayList2 != null && (!copyOnWriteArrayList2.isEmpty()) == z3 && z2) {
                            i = i3;
                            CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList3 = copyOnWriteArrayList2;
                            storyEntry = next;
                            SimpleStoriesContainer simpleStoriesContainer = new SimpleStoriesContainer((StoryOwner) mxl0Var3.b, copyOnWriteArrayList3, null, false, 12, null);
                            simpleStoriesContainer.j = z3;
                            arrayList2.add(simpleStoriesContainer);
                        } else {
                            i = i3;
                            storyEntry = next;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(storyEntry);
                        copyOnWriteArrayList = arrayList3;
                        z2 = true;
                        z = true;
                    }
                    if (i == vKList2.size() - 1 && copyOnWriteArrayList != null && (!copyOnWriteArrayList.isEmpty())) {
                        SimpleStoriesContainer simpleStoriesContainer2 = new SimpleStoriesContainer((StoryOwner) mxl0Var3.b, copyOnWriteArrayList, null, false, 12, null);
                        simpleStoriesContainer2.j = true;
                        arrayList2.add(simpleStoriesContainer2);
                    }
                    StringBuilder sb = new StringBuilder();
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    mxl0 mxl0Var4 = mxl0Var3;
                    sb.append(context.getResources().getStringArray(R.array.story_months_short)[Math.min(calendar.get(2), 11)]);
                    sb.append(' ');
                    sb.append(i5);
                    String sb2 = sb.toString();
                    String valueOf = String.valueOf(i7);
                    Context context2 = e43.a;
                    if (context2 == null) {
                        context2 = null;
                    }
                    arrayList.add(new lxl0(storyEntry, sb2, valueOf, context2.getResources().getStringArray(R.array.story_months_short)[Math.min(calendar.get(2), 11)].toLowerCase(Locale.ROOT), z));
                    copyOnWriteArrayList2 = copyOnWriteArrayList;
                    mxl0Var3 = mxl0Var4;
                    i3 = i4;
                    vKList = vKList2;
                    i2 = 1;
                }
                listDataSet.n0(arrayList);
                int size = arrayList.size();
                zak0 zak0Var = (zak0) storyArchiveFragment.e0;
                zak0Var.setValue(fj3.a((fj3) zak0Var.getValue(), size > 0, false, 2));
                break;
            default:
                mcs0 mcs0Var = (mcs0) this.d;
                vqt vqtVar = (vqt) obj;
                if (this.c) {
                    mcs0Var.m.e(vqtVar.a.size());
                } else {
                    mcs0Var.m.e(vqtVar.a.size() + vqtVar.c);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sd1(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}

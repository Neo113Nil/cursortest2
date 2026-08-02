package xsna;

import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gae implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gae(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        switch (this.b) {
            case 0:
                jae jaeVar = (jae) this.c;
                ClipGridParams.Data data = ((fde) this.d).a;
                if (!(data instanceof ClipGridParams.Data.Music ? ((ClipGridParams.Data.Music) data).i : data instanceof ClipGridParams.Data.Hashtag ? ((ClipGridParams.Data.Hashtag) data).d : false) || !jaeVar.a(data)) {
                    return io.reactivex.rxjava3.internal.operators.maybe.i.b;
                }
                dz2 x = yfb.x(((sdy) jaeVar.b.b).i(Collections.singletonList("dynamic/png/drawable-xxhdpi/clips_banner_trends_166h.png")));
                x.d = true;
                return rsg0.w0(x).v();
            default:
                MyTargetAdStoriesContainer myTargetAdStoriesContainer = (MyTargetAdStoriesContainer) this.c;
                utl0 utl0Var = ((rpl0) this.d).b;
                ArrayList arrayList = new ArrayList();
                CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = myTargetAdStoriesContainer.g;
                ArrayList arrayList2 = new ArrayList();
                Iterator<StoryEntry> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    StoryEntry next = it.next();
                    StoryEntry storyEntry = next;
                    if (storyEntry.Nb() && utl0Var.g(storyEntry) == null) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    io.reactivex.rxjava3.core.a c = utl0Var.c((StoryEntry) it2.next(), myTargetAdStoriesContainer);
                    asu0.a.getClass();
                    arrayList.add(c.q(asu0.i()));
                }
                int i = io.reactivex.rxjava3.core.g.b;
                io.reactivex.rxjava3.internal.operators.flowable.y yVar = new io.reactivex.rxjava3.internal.operators.flowable.y(arrayList);
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                io.reactivex.rxjava3.internal.functions.b.a(2, "prefetch");
                return new io.reactivex.rxjava3.internal.operators.mixed.b(yVar, qVar, ErrorMode.END);
        }
    }
}

package xsna;

import android.content.Context;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.yandex.div.core.view2.spannable.ImageSpan;
import ru.ok.proto.PublisherConfiguration;
import xsna.vtl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uik0 implements ImageSpan.OnAccessibilityClickAction, io.reactivex.rxjava3.core.d {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uik0(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        String str = (String) this.b;
        StoryEntry storyEntry = (StoryEntry) this.c;
        vtl0 vtl0Var = (vtl0) this.d;
        MyTargetAdStoriesContainer myTargetAdStoriesContainer = (MyTargetAdStoriesContainer) this.e;
        bp50 bp50Var = new bp50();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        zu50 zu50Var = new zu50(737148, bp50Var, context);
        zu50Var.b("VK_STORIES");
        int i = PublisherConfiguration.DEFAULT_MAX_RES;
        try {
            int i2 = iah0.f().heightPixels;
            if (i2 >= 720) {
                i = i2;
            }
        } catch (Throwable unused) {
        }
        u6z0 u6z0Var = zu50Var.a;
        u6z0Var.d = i;
        u6z0Var.a.g("stories_playhead_v2", "1");
        zu50Var.i = new vtl0.a(storyEntry, vtl0Var, zu50Var, bp50Var, myTargetAdStoriesContainer, bVar);
        vtl0.c cVar = new vtl0.c(zu50Var, vtl0Var);
        zu50Var.p = cVar;
        ckz0 ckz0Var = zu50Var.h;
        if (ckz0Var != null) {
            ckz0Var.k(cVar);
        }
        vtl0.b bVar2 = new vtl0.b(zu50Var, vtl0Var);
        zu50Var.o = bVar2;
        ckz0 ckz0Var2 = zu50Var.h;
        if (ckz0Var2 != null) {
            ckz0Var2.i(bVar2);
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"StoriesMyTargetAdPrefetcherImpl start handle storyId=" + storyEntry.c + " on thread " + Thread.currentThread().getName()});
        }
        zu50Var.f(str);
    }
}

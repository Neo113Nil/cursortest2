package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import java.util.ArrayList;
import java.util.HashSet;
import xsna.hfr;

/* compiled from: StoriesPixelsControllerImpl.kt */
/* loaded from: classes11.dex */
public final class aul0 implements ztl0 {
    public final HashSet<String> a = new HashSet<>();

    @Override // xsna.ztl0
    public final void a(StoryViewAction storyViewAction, StoryEntry storyEntry) {
        ArrayList arrayList = storyEntry.V;
        if (arrayList != null) {
            hfr j = rli0.j(new i5g(arrayList), new qjl0(storyViewAction, 2));
            bqt bqtVar = new bqt(26);
            hfr.a aVar = new hfr.a(j);
            while (aVar.hasNext()) {
                String str = (String) bqtVar.invoke(aVar.next());
                HashSet<String> hashSet = this.a;
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                    io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new ofl(str, 1));
                    asu0.a.getClass();
                    io.reactivex.rxjava3.internal.operators.observable.m1 a0 = s0Var.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                    int i = kwg0.a;
                    a0.subscribe(new iwg0(), new iwg0());
                }
            }
        }
    }
}

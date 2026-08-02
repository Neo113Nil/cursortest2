package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DraftsListInteractor.kt */
/* loaded from: classes18.dex */
public final class beo {
    public final UserId a;

    public beo(UserId userId) {
        this.a = userId;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, ContinuationImpl continuationImpl) {
        aeo aeoVar;
        int i2;
        Iterator<NewsEntry> it;
        if (continuationImpl instanceof aeo) {
            aeoVar = (aeo) continuationImpl;
            int i3 = aeoVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aeoVar.label = i3 - Integer.MIN_VALUE;
                Object obj = aeoVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = aeoVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new a0u(this.a, i, 30), null, null, 3);
                    aeoVar.I$0 = i;
                    aeoVar.label = 1;
                    obj = sd9.g(y0, q230.FIRST, aeoVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                ArrayList arrayList = new ArrayList();
                it = wallWithCounters.iterator();
                while (it.hasNext()) {
                    NewsEntry next = it.next();
                    Post post = next instanceof Post ? (Post) next : null;
                    if (post != null) {
                        arrayList.add(post);
                    }
                }
                String s1 = wallWithCounters.s1();
                Integer m = s1 != null ? arm0.m(10, s1) : null;
                return new hfo(arrayList, m != null ? m.intValue() : 0, m == null);
            }
        }
        aeoVar = new aeo(this, continuationImpl);
        Object obj2 = aeoVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = aeoVar.label;
        if (i2 != 0) {
        }
        WallWithCounters wallWithCounters2 = (WallWithCounters) obj2;
        ArrayList arrayList2 = new ArrayList();
        it = wallWithCounters2.iterator();
        while (it.hasNext()) {
        }
        String s12 = wallWithCounters2.s1();
        if (s12 != null) {
        }
        if (m == null) {
        }
        return new hfo(arrayList2, m != null ? m.intValue() : 0, m == null);
    }
}

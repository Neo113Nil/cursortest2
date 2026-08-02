package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeFeedItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hzp0;
import xsna.vha;

/* compiled from: FeedCatalogUIViewTracker.kt */
/* loaded from: classes16.dex */
public class oxq extends z160 {
    public final AudienceResearchComponent f;
    public final LinkedHashMap g;
    public int h;

    /* compiled from: FeedCatalogUIViewTracker.kt */
    public final class a extends vha.a {
        public final /* synthetic */ oxq A;
        public final LinkedHashMap w;
        public NewsEntry x;
        public int y;
        public int z;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(oxq oxqVar, oxq oxqVar2, RecyclerView recyclerView, d dVar) {
            super(oxqVar2, recyclerView, dVar, r0);
            q5u0 q5u0Var = new q5u0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            this.A = oxqVar;
            this.w = new LinkedHashMap();
        }

        @Override // xsna.vha.a, xsna.c2q0, xsna.jm6
        public final Object c(RecyclerView.e0 e0Var) {
            Object c = super.c(e0Var);
            tca tcaVar = e0Var instanceof tca ? (tca) e0Var : null;
            if (tcaVar != null) {
                UIBlock uIBlock = tcaVar.n;
                UIBlockFeed uIBlockFeed = uIBlock instanceof UIBlockFeed ? (UIBlockFeed) uIBlock : null;
                if (uIBlockFeed != null) {
                    NewsEntry newsEntry = uIBlockFeed.y.a;
                    LinkedHashMap linkedHashMap = this.A.g;
                    Integer num = (Integer) linkedHashMap.get(newsEntry);
                    int intValue = num != null ? num.intValue() : 0;
                    int i = this.z - this.y;
                    if (intValue < i) {
                        intValue = i;
                    }
                    linkedHashMap.put(newsEntry, Integer.valueOf(intValue));
                    LinkedHashMap linkedHashMap2 = this.w;
                    Object obj = linkedHashMap2.get(newsEntry);
                    if (obj != null) {
                        return obj;
                    }
                    b bVar = new b(o(uIBlockFeed, tcaVar), uIBlockFeed);
                    linkedHashMap2.put(newsEntry, bVar);
                    return bVar;
                }
            }
            return c;
        }

        @Override // xsna.jm6
        public final boolean e(RecyclerView recyclerView, Object obj, List<? extends RecyclerView.e0> list) {
            boolean e = super.e(recyclerView, obj, list);
            if (!(obj instanceof b)) {
                return e;
            }
            UIBlock uIBlock = ((b) obj).a;
            UIBlockFeed uIBlockFeed = uIBlock instanceof UIBlockFeed ? (UIBlockFeed) uIBlock : null;
            boolean z = ((ArrayList) list).size() == (uIBlockFeed != null ? uIBlockFeed.A : 1);
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int top = ((RecyclerView.e0) it.next()).itemView.getTop();
            while (it.hasNext()) {
                int top2 = ((RecyclerView.e0) it.next()).itemView.getTop();
                if (top > top2) {
                    top = top2;
                }
            }
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int bottom = ((RecyclerView.e0) it2.next()).itemView.getBottom();
            while (it2.hasNext()) {
                int bottom2 = ((RecyclerView.e0) it2.next()).itemView.getBottom();
                if (bottom < bottom2) {
                    bottom = bottom2;
                }
            }
            int i = bottom - top;
            int max = Math.max(0, Math.min(recyclerView.getHeight(), bottom) - Math.max(0, top));
            if (recyclerView.getHeight() > 0 && i > 0) {
                float f = max;
                if (f / recyclerView.getHeight() >= 0.35f || (z && f / i >= 0.35f)) {
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.jm6
        public final boolean f(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            u1c0 u1c0Var;
            NewsEntry newsEntry = null;
            tca tcaVar = e0Var instanceof tca ? (tca) e0Var : null;
            if (tcaVar == null) {
                return false;
            }
            UIBlock uIBlock = tcaVar.n;
            UIBlockFeed uIBlockFeed = uIBlock instanceof UIBlockFeed ? (UIBlockFeed) uIBlock : null;
            if (uIBlockFeed == null) {
                return false;
            }
            NewsEntry newsEntry2 = uIBlockFeed.y.a;
            if (!epx.f(this.x, newsEntry2)) {
                this.x = newsEntry2;
                this.y = e0Var.itemView.getTop();
            }
            this.z = e0Var.itemView.getBottom();
            oxq oxqVar = this.A;
            int i = oxqVar.h;
            int width = e0Var.itemView.getWidth();
            if (i < width) {
                i = width;
            }
            oxqVar.h = i;
            tca tcaVar2 = e0Var2 instanceof tca ? (tca) e0Var2 : null;
            UIBlock uIBlock2 = tcaVar2 != null ? tcaVar2.n : null;
            UIBlockFeed uIBlockFeed2 = uIBlock2 instanceof UIBlockFeed ? (UIBlockFeed) uIBlock2 : null;
            if (uIBlockFeed2 != null && (u1c0Var = uIBlockFeed2.y) != null) {
                newsEntry = u1c0Var.a;
            }
            return newsEntry2.equals(newsEntry);
        }

        @Override // xsna.vha.a, xsna.jm6
        public final void g(List<? extends Object> list) {
            u1c0 u1c0Var;
            super.g(list);
            Set keySet = this.w.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UIBlock uIBlock = ((b) it.next()).a;
                NewsEntry newsEntry = null;
                UIBlockFeed uIBlockFeed = uIBlock instanceof UIBlockFeed ? (UIBlockFeed) uIBlock : null;
                if (uIBlockFeed != null && (u1c0Var = uIBlockFeed.y) != null) {
                    newsEntry = u1c0Var.a;
                }
                if (newsEntry != null) {
                    arrayList2.add(newsEntry);
                }
            }
            keySet.removeAll(j5g.S0(arrayList2));
        }

        @Override // xsna.c2q0
        public final boolean k(View view) {
            if (view instanceof gs4) {
                return true;
            }
            return (view instanceof RecyclerView) && (((RecyclerView) view).getLayoutManager() instanceof t3n);
        }

        @Override // xsna.vha.a, xsna.c2q0
        public final void l() {
            super.l();
            this.w.clear();
        }
    }

    /* compiled from: FeedCatalogUIViewTracker.kt */
    public static final class b extends vha.b {
    }

    /* compiled from: FeedCatalogUIViewTracker.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsCoreNavStat$EventScreen.values().length];
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FeedCatalogUIViewTracker.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<RecyclerView, Integer, c2q0<Object>> {
        @Override // xsna.wzs
        public final c2q0<Object> invoke(RecyclerView recyclerView, Integer num) {
            num.intValue();
            return ((oxq) this.receiver).p(recyclerView);
        }
    }

    public oxq(s1v s1vVar, dha dhaVar, AudienceResearchComponent audienceResearchComponent) {
        super(s1vVar, dhaVar, 4);
        this.f = audienceResearchComponent;
        this.g = new LinkedHashMap();
    }

    @Override // xsna.vha, xsna.d680
    public List<hzp0> j(Object obj) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        if (!(obj instanceof b)) {
            return super.j(obj);
        }
        UIBlock uIBlock = ((b) obj).a;
        UIBlockFeed uIBlockFeed = uIBlock instanceof UIBlockFeed ? (UIBlockFeed) uIBlock : null;
        if (uIBlockFeed == null) {
            return super.j(obj);
        }
        NewsEntry newsEntry = uIBlockFeed.y.a;
        dha dhaVar = this.c;
        if (dhaVar == null || (mobileOfficialAppsCoreNavStat$EventScreen = dhaVar.a()) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
        List<String> g = di60.g(newsEntry);
        if (g != null && (newsEntry instanceof Post)) {
            io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new nxq(g, this, c.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen2.ordinal()] == 1 ? AudienceResearchSurfaceCode.POST : AudienceResearchSurfaceCode.SEARCH_POST, 0)), new b9(new u4e(this, 19), 19));
            asu0.a.getClass();
            sVar.q(asu0.i()).subscribe();
            List<NewsfeedResearchEvent> f = di60.f(newsEntry);
            if (f != null) {
                List<NewsfeedResearchEvent> list = f;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (NewsfeedResearchEvent newsfeedResearchEvent : list) {
                    arrayList.add(this.f.b().c(newsfeedResearchEvent.b, newsfeedResearchEvent.c));
                }
                io.reactivex.rxjava3.internal.operators.completable.d dVar = new io.reactivex.rxjava3.internal.operators.completable.d(arrayList);
                asu0.a.getClass();
                dVar.q(asu0.i()).subscribe();
            }
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, null, null, null, newsEntry.Cb().b, null, 46, null);
        int i = uIBlockFeed.u;
        String Db = newsEntry.Db();
        int i2 = this.h;
        Integer num = (Integer) this.g.get(newsEntry);
        int intValue = num != null ? num.intValue() : 0;
        SchemeStat$TypeFeedItem.StateAsync stateAsync = SchemeStat$TypeFeedItem.StateAsync.NONE;
        Feedback feedback = newsEntry.g;
        return Collections.singletonList(new hzp0.i0(schemeStat$EventItem, i, false, 0L, 0L, new SchemeStat$TypeFeedItem(i2, intValue, Db, null, stateAsync, feedback != null ? feedback.d : null, null, 72, null), mobileOfficialAppsCoreNavStat$EventScreen2));
    }

    @Override // xsna.z160, xsna.vha
    public final c2q0<Object> p(RecyclerView recyclerView) {
        return new a(this, this, recyclerView, new d(2, this, oxq.class, "createNestedUiViewedTimeChecker", "createNestedUiViewedTimeChecker(Landroidx/recyclerview/widget/RecyclerView;I)Lcom/vk/core/ui/tracking/views/recycler/viewtime/UiViewedTimeChecker;", 0));
    }
}

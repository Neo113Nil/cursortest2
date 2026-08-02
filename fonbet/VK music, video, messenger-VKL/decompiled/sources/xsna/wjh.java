package xsna;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.group.footer.VkGroupFooter;
import com.vk.core.view.components.group.footer.VkGroupFooter$Content$Loader$Size;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.dto.common.id.UserId;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.klh;
import xsna.mut0;

/* compiled from: CommunityProfileContentPagerViewHolder.kt */
/* loaded from: classes5.dex */
public class wjh<T extends CommunityProfileContentItem> extends RecyclerView.e0 {
    public static final float B = cn70.a() * 45.0f;
    public static final float C = cn70.a() * 236.0f;
    public static final int D = cn70.b(12);
    public klh A;
    public final UserId l;
    public final FragmentImpl m;
    public final izs<Integer, s3q0> n;
    public final izs<CommunityProfileContentItem, s3q0> o;
    public final izs<CommunityProfileContentItem, s3q0> p;
    public final izs<CommunityProfileContentItem, s3q0> q;
    public final izs<CommunityProfileContentItem, s3q0> r;
    public final izs<CommunityProfileContentItem, s3q0> s;
    public T t;
    public r7j u;
    public final m2l v;
    public final RecyclerPaginatedView w;
    public final ComposeView x;
    public final mkh y;
    public final mkh z;

    /* compiled from: CommunityProfileContentPagerViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityProfileContentItem.State.values().length];
            try {
                iArr[CommunityProfileContentItem.State.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileContentItem.State.RELOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityProfileContentItem.State.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityProfileContentItem.State.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommunityProfileContentItem.State.LOADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommunityProfileContentItem.State.LOADED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunityProfileContentPagerViewHolder.kt */
    public static final class b extends x6s {
        @Override // xsna.x6s
        public final View a(Context context, ViewGroup viewGroup) {
            VkGroupFooter vkGroupFooter = new VkGroupFooter(context, null, 6);
            vkGroupFooter.setLayoutParams(new RecyclerView.p(-1, -2));
            vkGroupFooter.setContent(new com.vk.core.view.components.group.footer.c(VkGroupFooter$Content$Loader$Size.M));
            return vkGroupFooter;
        }
    }

    /* compiled from: CommunityProfileContentPagerViewHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            wjh wjhVar = (wjh) this.receiver;
            T t = wjhVar.t;
            izs<CommunityProfileContentItem, s3q0> izsVar = wjhVar.r;
            if (t != null && izsVar != null) {
                izsVar.invoke(t);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentPagerViewHolder.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            wjh wjhVar = (wjh) this.receiver;
            T t = wjhVar.t;
            izs<CommunityProfileContentItem, s3q0> izsVar = wjhVar.s;
            if (t != null && izsVar != null) {
                izsVar.invoke(t);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CommunityProfileContentPagerViewHolder.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((wjh) this.receiver).h6();
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wjh(View view, UserId userId, FragmentImpl fragmentImpl, izs<? super Integer, s3q0> izsVar, izs<? super CommunityProfileContentItem, s3q0> izsVar2, izs<? super CommunityProfileContentItem, s3q0> izsVar3, izs<? super CommunityProfileContentItem, s3q0> izsVar4, izs<? super CommunityProfileContentItem, s3q0> izsVar5, izs<? super CommunityProfileContentItem, s3q0> izsVar6) {
        super(view);
        this.l = userId;
        this.m = fragmentImpl;
        this.n = izsVar;
        this.o = izsVar2;
        this.p = izsVar3;
        this.q = izsVar4;
        this.r = izsVar5;
        this.s = izsVar6;
        this.v = new m2l();
        c cVar = new c(this);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.community_profile_item_content_pager_recycler);
        recyclerPaginatedView.Om(cVar);
        recyclerPaginatedView.setFooterLoadingViewProvider(new b());
        recyclerPaginatedView.setOnLoadNextRetryClickListener(new gbh(this, 1));
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        f4m.v(D, recyclerView);
        recyclerView.setClipToPadding(false);
        this.w = recyclerPaginatedView;
        ComposeView composeView = (ComposeView) view.findViewById(R.id.community_profile_item_content_pager_loading);
        composeView.setViewCompositionStrategy(mut0.b.a);
        this.x = composeView;
        this.y = new mkh(view);
        this.z = new mkh(view);
    }

    public static void j6(RecyclerView recyclerView) {
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
    }

    public void V5(T t) {
        wjh<T> wjhVar;
        boolean s6 = s6();
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (s6 && this.A == null) {
            klh.a aVar = new klh.a();
            wjhVar = this;
            wjhVar.A = new klh(recyclerPaginatedView.getRecyclerView(), new xjh(1, wjhVar, wjh.class, "getUiViewRecordForHolder", "getUiViewRecordForHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lcom/vk/profile/core/tabs/stat/CommunityProfileContentUiViewTracker$Record;", 0), wjhVar.m, new jlh(aVar, wjhVar.l));
            wjhVar.itemView.addOnAttachStateChangeListener(new yjh(this));
        } else {
            wjhVar = this;
        }
        m6(t);
        int i = a.$EnumSwitchMapping$0[t.f().ordinal()];
        mkh mkhVar = wjhVar.z;
        mkh mkhVar2 = wjhVar.y;
        ComposeView composeView = wjhVar.x;
        switch (i) {
            case 1:
                mkhVar2.a();
                mkhVar.a();
                recyclerPaginatedView.setVisibility(4);
                composeView.setVisibility(0);
                break;
            case 2:
                mkhVar2.a();
                mkhVar.a();
                recyclerPaginatedView.setVisibility(4);
                composeView.setVisibility(0);
                i6(t);
                break;
            case 3:
                composeView.setVisibility(4);
                recyclerPaginatedView.setVisibility(4);
                mkhVar.a();
                o6(t, null);
                break;
            case 4:
                composeView.setVisibility(4);
                mkhVar2.a();
                recyclerPaginatedView.setVisibility(4);
                q6(t, null);
                break;
            case 5:
                mkhVar2.a();
                mkhVar.a();
                recyclerPaginatedView.setVisibility(4);
                composeView.setVisibility(0);
                break;
            case 6:
                composeView.setVisibility(4);
                mkhVar2.a();
                mkhVar.a();
                recyclerPaginatedView.setVisibility(0);
                recyclerPaginatedView.f0();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        wjhVar.t = t;
    }

    public boolean W5(T t) {
        return false;
    }

    public void a6() {
        klh klhVar = this.A;
        if (klhVar != null) {
            klhVar.a();
        }
    }

    public klh.b b6(RecyclerView.e0 e0Var) {
        return null;
    }

    public final void g6(int i) {
        float f2 = i;
        float height = this.itemView.getHeight() / 2.0f;
        float f3 = 2;
        float f4 = B;
        float min = Math.min(height - (f2 / f3), height - f4);
        float f5 = C;
        if (f2 < f5) {
            float height2 = this.itemView.getHeight() / 2.0f;
            min = Math.min(height2 - (f5 / f3), height2 - f4);
        }
        float f6 = -min;
        mkh mkhVar = this.y;
        mkhVar.c = f6;
        VkPlaceholder vkPlaceholder = mkhVar.b;
        if (vkPlaceholder != null) {
            vkPlaceholder.setTranslationY(f6);
        }
        mkh mkhVar2 = this.z;
        mkhVar2.c = f6;
        VkPlaceholder vkPlaceholder2 = mkhVar2.b;
        if (vkPlaceholder2 != null) {
            vkPlaceholder2.setTranslationY(f6);
        }
        a6();
    }

    public void h6() {
        T t = this.t;
        if (t != null) {
            this.p.invoke(t);
        }
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType = null;
        try {
            T t2 = this.t;
            if (t2 != null) {
                ContentTab contentTab = t2.a;
                ContentTab.Options.b.getClass();
                commonCommunitiesStat$TypeTabContentType = ContentTab.a(contentTab);
            }
        } catch (IllegalStateException e2) {
            StringBuilder sb = new StringBuilder("Couldn't identify tab for stat event : ");
            T t3 = this.t;
            sb.append(t3 != null ? t3.a : null);
            L.j(e2, sb.toString());
        }
        if (commonCommunitiesStat$TypeTabContentType != null) {
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null);
            UserId userId = this.l;
            new bjc(c2, SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick(userId.b, commonCommunitiesStat$TypeTabContentType), 2)).q();
            AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.COMMUNITY_SCREEN_NETWORK_ERROR);
            aggregateEventBuilder.w(0, "type_community_screen_tab_load_retry_click");
            aggregateEventBuilder.w(1, String.valueOf(userId.b));
            aggregateEventBuilder.w(2, commonCommunitiesStat$TypeTabContentType.toString());
            aggregateEventBuilder.q();
        }
    }

    public void m6(T t) {
        this.x.setContent(sdi.d);
    }

    public final void o6(T t, CommunityProfileContentItem.b bVar) {
        CommunityProfileContentItem.b a2;
        if (t != null && (a2 = t.a()) != null) {
            bVar = a2;
        } else if (bVar == null) {
            return;
        }
        d dVar = new d(0, this, wjh.class, "onAddContentClick", "onAddContentClick()V", 0);
        e eVar = new e(0, this, wjh.class, "onSecondButtonClick", "onSecondButtonClick()V", 0);
        Integer valueOf = Integer.valueOf(bVar.a);
        Integer num = bVar.b;
        CommunityProfileContentItem.a aVar = bVar.e;
        Integer valueOf2 = (aVar == null || aVar.d) ? Integer.valueOf(R.drawable.vk_icon_add_24) : null;
        d dVar2 = bVar.b != null ? dVar : null;
        CommunityProfileContentItem.a aVar2 = bVar.e;
        Integer num2 = bVar.c;
        String str = bVar.d;
        this.y.b(new lkh(valueOf, num, valueOf2, dVar2, aVar2, num2, str, (num2 == null && str == null) ? null : eVar, 1));
    }

    public final void q6(T t, CommunityProfileContentItem.c cVar) {
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType;
        CommunityProfileContentItem.c b2;
        if (t != null && (b2 = t.b()) != null) {
            cVar = b2;
        } else if (cVar == null) {
            return;
        }
        if (t != null) {
            try {
                ContentTab.Options options = ContentTab.Options.b;
                ContentTab contentTab = t.a;
                options.getClass();
                commonCommunitiesStat$TypeTabContentType = ContentTab.a(contentTab);
            } catch (IllegalStateException e2) {
                L.j(e2, "Couldn't identify tab for stat event: " + t.a);
                commonCommunitiesStat$TypeTabContentType = null;
            }
            if (commonCommunitiesStat$TypeTabContentType != null) {
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null);
                String valueOf = String.valueOf(System.currentTimeMillis());
                String valueOf2 = String.valueOf(System.currentTimeMillis());
                UserId userId = this.l;
                new bvt0(c2, SchemeStat$TypeView.a.b(schemeStat$EventItem, valueOf, valueOf2, null, new CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView(userId.b, commonCommunitiesStat$TypeTabContentType), 8)).q();
                AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.COMMUNITY_SCREEN_NETWORK_ERROR);
                aggregateEventBuilder.w(0, "type_community_screen_tab_load_error_view");
                aggregateEventBuilder.w(1, String.valueOf(userId.b));
                aggregateEventBuilder.w(2, commonCommunitiesStat$TypeTabContentType.toString());
                aggregateEventBuilder.q();
            }
        }
        this.z.b(new lkh(Integer.valueOf(cVar.a), Integer.valueOf(R.string.err_try_again), null, new f(0, this, wjh.class, "onLoadRetryClick", "onLoadRetryClick()V", 0), null, null, null, null, 2008));
    }

    public boolean s6() {
        return !(this instanceof dmh);
    }

    /* compiled from: CommunityProfileContentPagerViewHolder.kt */
    public static final class c implements df90 {
        public final /* synthetic */ wjh<T> b;

        public c(wjh<T> wjhVar) {
            this.b = wjhVar;
        }

        @Override // xsna.df90
        public final void e(int i, int i2, int i3, int i4) {
            T t;
            wjh<T> wjhVar = this.b;
            if (i4 != 0) {
                wjhVar.n.invoke(Integer.valueOf(i4));
            }
            if (wjhVar.W5(wjhVar.t)) {
                T t2 = wjhVar.t;
                Integer valueOf = t2 != null ? Integer.valueOf(t2.b) : null;
                if (valueOf != null && i >= valueOf.intValue() && i - 10 <= i3 && i3 <= i) {
                    m2l m2lVar = wjhVar.v;
                    m2lVar.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = m2lVar.a;
                    boolean z = j == 0 || elapsedRealtime - j > 300;
                    if (z) {
                        m2lVar.a = elapsedRealtime;
                    }
                    if (!z || (t = wjhVar.t) == null) {
                        return;
                    }
                    wjhVar.o.invoke(t);
                }
            }
        }

        @Override // xsna.df90
        public final void l(int i) {
        }
    }

    public void i6(T t) {
    }

    public void l(int i) {
    }

    public void l6(boolean z) {
    }
}

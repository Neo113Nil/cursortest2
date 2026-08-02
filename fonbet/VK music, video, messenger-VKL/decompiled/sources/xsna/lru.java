package xsna;

import android.annotation.SuppressLint;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.groups.GroupsGetSuggestions;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupSuggestion;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.newsfeed.common.views.HorizontalPaginatedView;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GroupsSuggestionsInfoItemCatalogStyle.kt */
/* loaded from: classes5.dex */
public final class lru extends we6 {
    public final GroupsSuggestions g;
    public final UserId h;
    public final String i;
    public final ire j;
    public final cm k;
    public final int l = -80;

    public lru(GroupsSuggestions groupsSuggestions, UserId userId, String str, ire ireVar, cm cmVar) {
        this.g = groupsSuggestions;
        this.h = userId;
        this.i = str;
        this.j = ireVar;
        this.k = cmVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setTag("SimilarCarouselTag");
        VkGroupHeader vkGroupHeader = new VkGroupHeader(linearLayout.getContext(), null, 6);
        vkGroupHeader.setId(R.id.title);
        vkGroupHeader.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        HorizontalPaginatedView horizontalPaginatedView = new HorizontalPaginatedView(linearLayout.getContext(), null, 6);
        horizontalPaginatedView.setLayoutParams(new FrameLayout.LayoutParams(-1, cn70.b(244)));
        horizontalPaginatedView.setId(R.id.recom_friends_list);
        linearLayout.addView(vkGroupHeader);
        linearLayout.addView(horizontalPaginatedView);
        return new a(linearLayout, this.j);
    }

    @Override // xsna.we6
    public final int h() {
        return this.l;
    }

    /* compiled from: GroupsSuggestionsInfoItemCatalogStyle.kt */
    public static final class a extends vif0<lru> implements c.m<kru>, View.OnAttachStateChangeListener {
        public final io.reactivex.rxjava3.disposables.g n;
        public final q3n0 o;
        public final RecyclerPaginatedView p;
        public final ytg q;
        public com.vk.lists.c r;
        public final VkGroupHeader s;

        /* compiled from: GroupsSuggestionsInfoItemCatalogStyle.kt */
        /* renamed from: xsna.lru$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3285a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
                return s3q0.a;
            }
        }

        public a(LinearLayout linearLayout, ire ireVar) {
            super(linearLayout);
            bwt0.Z(R.attr.vk_ui_background_content, linearLayout);
            this.n = new io.reactivex.rxjava3.disposables.g();
            this.o = new q3n0(this, FullSourceJoinApi.SourceType.SIMILAR_GROUPS_BLOCK.h(), FullSourceJoinApi.EntryServiceType.COMMUNITY.i(), 18);
            RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) linearLayout.findViewById(R.id.recom_friends_list);
            recyclerPaginatedView.getLayoutParams().height = iah0.a(272);
            this.p = recyclerPaginatedView;
            ytg ytgVar = new ytg(new com.vk.movika.tools.controls.seekbar.j(this, 6), new omf(this, 24), new gyn(this, 2), new Size(iah0.a(160), iah0.a(260)));
            this.q = ytgVar;
            VkGroupHeader vkGroupHeader = (VkGroupHeader) linearLayout.findViewById(R.id.title);
            vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
            vkGroupHeader.setRight(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.b(new z0h(this, 20), tq.h(tlo0.Companion, R.string.hide)), 3));
            vkGroupHeader.setOnClickListener(new n2q(2, ireVar, this));
            this.s = vkGroupHeader;
            RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
            recyclerPaginatedView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerPaginatedView.getRecyclerView().addItemDecoration(new ehk0(cn70.b(8)));
            int a = gbg0.a(b6(), 16.0f);
            recyclerPaginatedView.getRecyclerView().setPadding(a, 0, a, 0);
            recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
            recyclerPaginatedView.setSwipeRefreshEnabled(false);
            recyclerPaginatedView.setFooterLoadingViewProvider(null);
            recyclerPaginatedView.setFooterErrorViewProvider(null);
            recyclerPaginatedView.setAdapter(ytgVar);
            linearLayout.addOnAttachStateChangeListener(this);
        }

        public static ArrayList q6(lru lruVar) {
            ArrayList<GroupSuggestion> arrayList = lruVar.g.l;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (GroupSuggestion groupSuggestion : arrayList) {
                arrayList2.add(new j3i(groupSuggestion.b, groupSuggestion.e));
            }
            return arrayList2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.lists.c.m
        public final io.reactivex.rxjava3.core.q<kru> O9(String str, com.vk.lists.c cVar) {
            ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_SUGGESTIONS;
            comFeatures.getClass();
            if (!com.vk.toggle.b.A.a(comFeatures)) {
                GroupsGetSuggestions groupsGetSuggestions = new GroupsGetSuggestions(cVar.k(), ((lru) this.m).h, str);
                String str2 = ((lru) this.m).i;
                if (str2 != null && str2.length() != 0) {
                    groupsGetSuggestions.K("ref", str2);
                }
                String str3 = ((lru) this.m).g.n;
                if (str3 != null && str3.length() != 0) {
                    groupsGetSuggestions.K("track_code", str3);
                }
                groupsGetSuggestions.K("block_type", ((lru) this.m).g.i);
                return rsg0.y0(groupsGetSuggestions, null, null, 3);
            }
            zqu zquVar = new zqu();
            UserId a = fkq0.a(((lru) this.m).h);
            Integer valueOf = Integer.valueOf(cVar.k());
            List l = e43.l(GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.ACTIVITY, GroupsFieldsDto.CITY, GroupsFieldsDto.COUNTRY, GroupsFieldsDto.VERIFIED, GroupsFieldsDto.TRENDING, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.ADMIN_LEVEL, GroupsFieldsDto.PHOTO_AVG_COLOR, GroupsFieldsDto.COVER, GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.FRIENDS);
            ArrayList arrayList = new ArrayList(c5g.u(l, 10));
            Iterator it = l.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsFieldsDto) it.next()).k());
            }
            dz2 x = yfb.x(xqu.w(zquVar, a, valueOf, str, arrayList, null, ((lru) this.m).i, 16));
            String str4 = ((lru) this.m).g.n;
            if (str4 != null && str4.length() != 0) {
                x.K("track_code", ((lru) this.m).g.n);
            }
            return rsg0.y0(x, null, null, 3).U(new t7(new sm0(26), 17));
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<kru> hj(com.vk.lists.c cVar, boolean z) {
            return O9(null, cVar);
        }

        @Override // xsna.vif0
        public final void i6(lru lruVar) {
            lru lruVar2 = lruVar;
            GroupsSuggestions groupsSuggestions = lruVar2.g;
            String str = groupsSuggestions.j;
            if (str == null) {
                str = "";
            }
            this.s.setTitle(new VkGroupHeader.d(str, new com.vk.core.view.components.group.header.d(new gko(R.drawable.vk_icon_chevron_16), new x7g(R.attr.vk_ui_icon_secondary)), null, null, 0, null, IronSourceError.ERROR_CODE_INIT_FAILED));
            RecyclerPaginatedView recyclerPaginatedView = this.p;
            wjf0.c(recyclerPaginatedView.getRecyclerView(), new com.vk.movika.tools.controls.seekbar.f(10, this, lruVar2));
            if (this.r == null) {
                c.h hVar = new c.h(this);
                hVar.l = false;
                hVar.k = groupsSuggestions.k;
                hVar.i = 20;
                this.r = com.vk.lists.f.a(hVar, recyclerPaginatedView);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            io.reactivex.rxjava3.disposables.c a = this.n.a();
            if (a != null) {
                a.dispose();
            }
        }

        @Override // com.vk.lists.c.k
        @SuppressLint({"CheckResult"})
        public final void wd(io.reactivex.rxjava3.core.q<kru> qVar, boolean z, com.vk.lists.c cVar) {
            qVar.subscribe(new um0(new uf1(20, cVar, this), 26), new eu0(new C3285a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 29));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}

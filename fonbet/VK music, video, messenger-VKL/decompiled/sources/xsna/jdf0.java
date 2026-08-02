package xsna;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupSuggestion;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gpu;
import xsna.r3n0;

/* compiled from: RecommendedGroupsHolder.kt */
/* loaded from: classes4.dex */
public final class jdf0 extends rp6<kdf0, GroupsSuggestions> implements View.OnClickListener, View.OnAttachStateChangeListener, c.m<kru> {
    public final p870 E;
    public final RecyclerPaginatedView F;
    public final iru G;
    public com.vk.lists.c H;
    public final UserId I;
    public io.reactivex.rxjava3.disposables.c J;
    public final nbf0 K;

    /* compiled from: RecommendedGroupsHolder.kt */
    public static final /* synthetic */ class a implements r3n0.b, g0t {
        public a() {
        }

        @Override // xsna.r3n0.b
        public final boolean a(int i) {
            jdf0.this.getClass();
            return (i == 4 || i == 5 || i == 6 || i == 7) ? false : true;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof r3n0.b) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, jdf0.this, jdf0.class, "isViewTypeNeedsDecoration", "isViewTypeNeedsDecoration(I)Z", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: RecommendedGroupsHolder.kt */
    public static final /* synthetic */ class b implements r3n0.a, g0t {
        public b() {
        }

        @Override // xsna.r3n0.a
        public final float a(int i) {
            jdf0.this.getClass();
            return cn70.c(8);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof r3n0.a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, jdf0.this, jdf0.class, "getDecorationCornerRadius", "getDecorationCornerRadius(I)F", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: RecommendedGroupsHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public jdf0(ViewGroup viewGroup, h170 h170Var, p870 p870Var) {
        super(R.layout.news_groups_recommendations, viewGroup);
        this.E = p870Var;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.itemView.findViewById(R.id.recom_friends_list);
        this.F = recyclerPaginatedView;
        iru iruVar = new iru(new wf40(this, 20), h170Var);
        this.G = iruVar;
        this.I = UserId.d;
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        nbf0 nbf0Var = new nbf0();
        this.K = nbf0Var;
        recyclerPaginatedView.getRecyclerView().setItemAnimator(new jxq(nbf0Var));
        getContext();
        recyclerPaginatedView.getRecyclerView().addItemDecoration(new ehk0(cn70.b(12)));
        recyclerPaginatedView.getRecyclerView().addItemDecoration(new r3n0(new a(), new b()));
        int a2 = gbg0.a(this.itemView.getResources(), 16.0f);
        recyclerPaginatedView.getRecyclerView().setPadding(a2, 0, a2, 0);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.setFooterLoadingViewProvider(null);
        recyclerPaginatedView.setFooterErrorViewProvider(null);
        recyclerPaginatedView.setAdapter(iruVar);
        this.itemView.addOnAttachStateChangeListener(this);
        f4m.v(cn70.b(3), this.itemView);
    }

    public static ArrayList c7(String str, List list) {
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new gpu.a((GroupSuggestion) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (str != null && str.length() != 0) {
            return arrayList;
        }
        arrayList.add(gpu.b.a);
        return arrayList;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<kru> O9(String str, com.vk.lists.c cVar) {
        GroupsSuggestions b7 = b7();
        if (b7 != null && b7.e) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GET_RECOM_GROUPS;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            return rsg0.y0(yfb.x(new zqu().z(str, this.u, Integer.valueOf(cVar.k()), b7 != null ? b7.n : null, e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.ACTIVITY, BaseUserGroupFieldsDto.CITY, BaseUserGroupFieldsDto.COUNTRY, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.MEMBER_STATUS, BaseUserGroupFieldsDto.IS_CLOSED, BaseUserGroupFieldsDto.ADMIN_LEVEL, BaseUserGroupFieldsDto.PHOTO_AVG_COLOR, BaseUserGroupFieldsDto.COVER, BaseUserGroupFieldsDto.MEMBERS_COUNT))), null, null, 3).U(new tp1(new gvs(25), 28));
        }
        com.vk.api.groups.a aVar = new com.vk.api.groups.a(str, cVar.k());
        String str2 = this.u;
        if (str2 != null && str2.length() != 0) {
            aVar.K("ref", str2);
        }
        String str3 = b7 != null ? b7.n : null;
        if (str3 != null && str3.length() != 0) {
            aVar.K("track_code", str3);
        }
        return rsg0.y0(aVar, null, null, 3);
    }

    @Override // xsna.rp6
    public final void R6(kdf0 kdf0Var) {
        kdf0 kdf0Var2 = kdf0Var;
        String str = kdf0Var2.i;
        iru iruVar = this.G;
        iruVar.g = str;
        iruVar.h = this.u;
        iruVar.i = this;
        boolean z = kdf0Var2.j;
        if (iruVar.j != z) {
            iruVar.j = z;
            iruVar.notifyDataSetChanged();
        }
        bwy bwyVar = kdf0Var2.k;
        if (!epx.f(iruVar.k, bwyVar)) {
            iruVar.k = bwyVar;
            iruVar.notifyDataSetChanged();
        }
        wjf0.c(this.F.getRecyclerView(), new ie3(23, this, kdf0Var2));
        com.vk.lists.c cVar = this.H;
        if (cVar != null) {
            cVar.r(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GroupsSuggestions b7() {
        kdf0 kdf0Var = (kdf0) this.C;
        return kdf0Var != null ? kdf0Var.h : (GroupsSuggestions) q6();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<kru> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        io.reactivex.rxjava3.disposables.c cVar = this.J;
        if (cVar != null) {
            cVar.dispose();
        }
        this.J = xwk.e().T().m().d.subscribe(new eiy(new hsc0(this, 5), 16));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        io.reactivex.rxjava3.disposables.c cVar = this.J;
        if (cVar != null) {
            cVar.dispose();
        }
        this.J = null;
    }

    @Override // com.vk.lists.c.k
    @SuppressLint({"CheckResult"})
    public final void wd(io.reactivex.rxjava3.core.q<kru> qVar, boolean z, com.vk.lists.c cVar) {
        GroupsSuggestions b7 = b7();
        if (b7 == null) {
            return;
        }
        qVar.subscribe(new fl30(new m0i(cVar, b7, this, 6), 19), new m330(new c(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 19));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}

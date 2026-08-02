package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.search.models.VkPeopleSearchParams;
import com.vk.superapp.api.VkRelation;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.core.api.models.VkGender;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.gzw;
import xsna.w2o0;

/* compiled from: VkRestoreSearchFragment.kt */
/* loaded from: classes5.dex */
public final class lgv0 extends uhv0 implements c.l<p2v0<? extends WebUserShortInfo>> {
    public BaseVkSearchView h;
    public RecyclerPaginatedView i;
    public View j;
    public TextView k;
    public View l;
    public xut0 m;
    public hgv0 n;
    public com.vk.lists.c o;
    public io.reactivex.rxjava3.disposables.c p;
    public String q = "";
    public final VkPeopleSearchParams r = new VkPeopleSearchParams();
    public final io.reactivex.rxjava3.disposables.b s = new io.reactivex.rxjava3.disposables.b();
    public String t;
    public lcv0 u;

    /* compiled from: VkRestoreSearchFragment.kt */
    public static final class a extends m180 {
        public a() {
            super(true);
        }

        @Override // xsna.m180
        public final void handleOnBackPressed() {
            String query;
            lgv0 lgv0Var = lgv0.this;
            VkPeopleSearchParams vkPeopleSearchParams = lgv0Var.r;
            if (vkPeopleSearchParams.I()) {
                BaseVkSearchView baseVkSearchView = lgv0Var.h;
                query = baseVkSearchView != null ? baseVkSearchView.getQuery() : null;
                if (query == null || query.length() == 0) {
                    setEnabled(false);
                    lgv0Var.kn().onBackPressed();
                    return;
                } else {
                    BaseVkSearchView baseVkSearchView2 = lgv0Var.h;
                    if (baseVkSearchView2 != null) {
                        baseVkSearchView2.setQuery("");
                        return;
                    }
                    return;
                }
            }
            vkPeopleSearchParams.reset();
            BaseVkSearchView baseVkSearchView3 = lgv0Var.h;
            query = baseVkSearchView3 != null ? baseVkSearchView3.getQuery() : null;
            if (query == null || query.length() == 0) {
                ysg0.b.a(new nru0(vkPeopleSearchParams, true));
                return;
            }
            BaseVkSearchView baseVkSearchView4 = lgv0Var.h;
            if (baseVkSearchView4 != null) {
                baseVkSearchView4.setQuery("");
            }
            ysg0.b.a(new nru0(vkPeopleSearchParams, false));
        }
    }

    /* compiled from: VkRestoreSearchFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<p2v0<WebUserShortInfo>> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        lcv0 lcv0Var = this.u;
        if (lcv0Var != null) {
            lcv0Var.b(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString(CommonConstant.KEY_ACCESS_TOKEN, "")) != null) {
            str = string;
        }
        this.t = str;
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        d4r0 d4r0Var = new d4r0(3);
        fVar.getClass();
        this.s.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, d4r0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jgs0(this, 3)));
        kn().getOnBackPressedDispatcher().a(this, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vk_recover_search, viewGroup, false);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.rv_search);
        this.i = recyclerPaginatedView;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, recyclerPaginatedView).a();
        hgv0 hgv0Var = new hgv0(new o99(1, this, lgv0.class, "handleUserProfileClick", "handleUserProfileClick(Lcom/vk/superapp/api/dto/user/WebUserShortInfo;)V", 0, 16));
        this.n = hgv0Var;
        recyclerPaginatedView.setAdapter(hgv0Var);
        float f = 8;
        recyclerPaginatedView.getRecyclerView().setPadding(0, iah0.a(f), 0, iah0.a(f));
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setClipToPadding(false);
        }
        RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new kgv0());
        }
        c.h hVar = new c.h(this);
        hVar.i = 30;
        hVar.p = 300L;
        this.o = com.vk.lists.f.a(hVar, recyclerPaginatedView);
        final BaseVkSearchView baseVkSearchView = (BaseVkSearchView) inflate.findViewById(R.id.search);
        this.h = baseVkSearchView;
        io.reactivex.rxjava3.disposables.c subscribe = new gzw.a(new qno0(baseVkSearchView.getEditView())).z(200L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new fl40(new d230(25), 12)).subscribe(new d750(new bw6(1, this, lgv0.class, "updateQuery", "updateQuery(Ljava/lang/String;)V", 0, 14), 28));
        io.reactivex.rxjava3.disposables.b bVar = this.s;
        bVar.b(subscribe);
        baseVkSearchView.setVoiceInputEnabled(true);
        baseVkSearchView.setSecondaryActionListener(new kcj0(this, 28));
        baseVkSearchView.j5(w2o0.a.a(R.drawable.vk_icon_filter_24, R.string.vk_talkback_ic_search_params));
        baseVkSearchView.h5(true, !this.r.I());
        baseVkSearchView.a5();
        baseVkSearchView.setOnBackClickListener(new l6n0(this, 22));
        ysg0<Object> ysg0Var = ysg0.b;
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0Var.a;
        vcl0 vcl0Var = new vcl0(12);
        fVar.getClass();
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, vcl0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new dh40(baseVkSearchView, 24)));
        io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0Var.a;
        kgj0 kgj0Var = new kgj0(6);
        fVar2.getClass();
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, kgj0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.igv0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                lgv0.this.r.Ab(((nru0) obj).a);
                baseVkSearchView.h5(true, !r0.r.I());
            }
        }));
        this.j = hvt0.a(R.id.ll_bottom_parameters_container, inflate, new qjg0(this, 22));
        this.l = hvt0.a(R.id.iv_close, inflate, new mcj0(this, 26));
        this.k = (TextView) inflate.findViewById(R.id.tv_subtitle);
        View view = this.j;
        if (view != null) {
            view.setVisibility(8);
        }
        this.m = new xut0(this.j);
        mhy.h(getActivity());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.s.dispose();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.h = null;
        super.onDestroyView();
    }

    public final void tn(String str, boolean z) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (z) {
            xut0 xut0Var = this.m;
            if (xut0Var != null) {
                xut0Var.a(true);
            }
            RecyclerPaginatedView recyclerPaginatedView = this.i;
            if (recyclerPaginatedView == null || (recyclerView2 = recyclerPaginatedView.getRecyclerView()) == null) {
                return;
            }
            float f = 8;
            recyclerView2.setPadding(0, iah0.a(f), 0, iah0.a(f));
            return;
        }
        TextView textView = this.k;
        if (textView != null) {
            textView.setText(str);
        }
        xut0 xut0Var2 = this.m;
        if (xut0Var2 != null) {
            xut0Var2.b();
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.i;
        if (recyclerPaginatedView2 == null || (recyclerView = recyclerPaginatedView2.getRecyclerView()) == null) {
            return;
        }
        recyclerView.setPadding(0, iah0.a(8), 0, iah0.a(64));
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<p2v0<? extends WebUserShortInfo>> ui(int i, com.vk.lists.c cVar) {
        vdx0 vdx0Var = e370.e;
        VkRelation vkRelation = null;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        ufn0 v = vdx0Var.v();
        String str = this.t;
        String str2 = str == null ? null : str;
        String str3 = this.q;
        int k = cVar.k();
        VkPeopleSearchParams vkPeopleSearchParams = this.r;
        int i2 = vkPeopleSearchParams.b;
        VkGender.a aVar = VkGender.Companion;
        Integer valueOf = Integer.valueOf(vkPeopleSearchParams.d);
        aVar.getClass();
        VkGender a2 = VkGender.a.a(valueOf);
        int i3 = vkPeopleSearchParams.e;
        int i4 = vkPeopleSearchParams.f;
        VkRelation.a aVar2 = VkRelation.Companion;
        int i5 = vkPeopleSearchParams.g.id;
        aVar2.getClass();
        VkRelation[] values = VkRelation.values();
        int length = values.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            VkRelation vkRelation2 = values[i6];
            if (vkRelation2.h() == i5) {
                vkRelation = vkRelation2;
                break;
            }
            i6++;
        }
        if (vkRelation == null) {
            vkRelation = VkRelation.NONE;
        }
        return v.a(str2, str3, k, i, i2, a2, i3, i4, vkRelation);
    }

    public final void un() {
        BaseVkSearchView baseVkSearchView = this.h;
        if (baseVkSearchView != null) {
            baseVkSearchView.d0();
        }
        VkPeopleSearchParams vkPeopleSearchParams = this.r;
        vkPeopleSearchParams.getClass();
        VkPeopleSearchParams vkPeopleSearchParams2 = new VkPeopleSearchParams();
        vkPeopleSearchParams2.Ab(vkPeopleSearchParams);
        lcv0 lcv0Var = new lcv0(vkPeopleSearchParams2, this);
        giv0 giv0Var = new giv0(kn(), lcv0Var);
        giv0Var.a.Wn(getChildFragmentManager(), null);
        this.u = lcv0Var;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<p2v0<WebUserShortInfo>> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new jgv0(new grh(z, this, cVar), 0), new onm0(new b(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 11));
        this.s.b(subscribe);
        this.p = subscribe;
    }
}

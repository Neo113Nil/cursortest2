package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import xsna.dw20;

/* compiled from: GeopickerFragment.kt */
/* loaded from: classes6.dex */
public final class vnt extends hi6<unt> {
    public static final /* synthetic */ int n1 = 0;
    public View g1;
    public ProgressBar h1;
    public RecyclerView i1;
    public View j1;
    public View k1;
    public final rwz l1;
    public io.reactivex.rxjava3.disposables.c m1;

    /* compiled from: GeopickerFragment.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new vnt();
        }
    }

    public vnt() {
        xnt xntVar = new xnt(this);
        this.f1 = xntVar;
        this.l1 = new rwz(xntVar);
    }

    public final void Zn(View... viewArr) {
        View view = this.g1;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        biq biqVar = new biq();
        biqVar.setDuration(150L);
        for (View view2 : viewArr) {
            if (view2 != null) {
                biqVar.addTarget(view2);
            }
        }
        zmp0.a(viewGroup, biqVar);
    }

    public final void ao(boolean z) {
        Zn(this.h1);
        ProgressBar progressBar = this.h1;
        if (progressBar != null) {
            bwt0.p0(progressBar, z);
        }
        if (z) {
            this.l1.setItems(EmptyList.b);
        }
    }

    @Override // xsna.hi6, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.g1 = null;
        this.h1 = null;
        this.i1 = null;
        this.j1 = null;
        this.k1 = null;
        io.reactivex.rxjava3.disposables.c cVar = this.m1;
        if (cVar != null) {
            cVar.dispose();
        }
        this.m1 = null;
    }

    @Override // xsna.hi6, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        this.I = getString(R.string.vk_geopicker_title);
        View inflate = LayoutInflater.from(new lpj(requireContext(), vn())).inflate(R.layout.vk_fragment_geopicker_content, (ViewGroup) null, false);
        this.g1 = inflate;
        VkSearchView vkSearchView = (VkSearchView) inflate.findViewById(R.id.search_view);
        vkSearchView.X4(false);
        vkSearchView.c5(iah0.a(12.0f), 0, iah0.a(12.0f), iah0.a(4.0f));
        vkSearchView.setMaxInputLength(50);
        new io.reactivex.rxjava3.internal.operators.observable.c0(d02.y(vkSearchView, 300L, 2).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new ov2(new ugm(this, 7), 22), io.reactivex.rxjava3.internal.functions.a.c).subscribe(new pv2(new m4g(this, 24), 18));
        View findViewById = inflate.findViewById(R.id.shadow);
        this.h1 = (ProgressBar) inflate.findViewById(R.id.progress);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.localities);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.l1);
        fkf0 fkf0Var = new fkf0(recyclerView, findViewById, null, iah0.a(4));
        RecyclerView recyclerView2 = fkf0Var.b;
        recyclerView2.removeOnScrollListener(fkf0Var);
        recyclerView2.addOnScrollListener(fkf0Var);
        this.i1 = recyclerView;
        this.j1 = inflate.findViewById(R.id.empty);
        this.k1 = inflate.findViewById(R.id.error);
        inflate.findViewById(R.id.retry_button).setOnClickListener(new ug(this, 3));
        dw20.Rn(this, inflate, 4);
        return super.yn(bundle);
    }
}

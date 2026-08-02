package me.grishka.appkit.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.data.PaginatedList;
import com.vk.dto.common.data.VKList;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.j03;
import xsna.j6r0;
import xsna.w1d0;
import xsna.was;
import xsna.wov;
import xsna.yvv;
import xsna.zvv;

/* loaded from: classes8.dex */
public abstract class BaseRecyclerFragment<T> extends LoaderFragment implements SwipeDrawableRefreshLayout.g, UsableRecyclerView.p, w1d0.a<T>, was<VKList<T>> {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final boolean D0;
    public int E0;
    public final d F0;
    public final Handler l0;
    public int m0;
    public UsableRecyclerView n0;
    public View o0;
    public wov p0;
    public View q0;
    public View r0;
    public View s0;
    public ViewGroup t0;
    public final w1d0<T> u0;
    public final ArrayList<T> v0;
    public final ArrayList<T> w0;
    public CharSequence x0;
    public Button y0;
    public boolean z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseRecyclerFragment.this.getClass();
        }
    }

    public class b extends GridLayoutManager.c {
        public final /* synthetic */ GridLayoutManager.c d;

        public b(GridLayoutManager.c cVar) {
            this.d = cVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            BaseRecyclerFragment baseRecyclerFragment = BaseRecyclerFragment.this;
            UsableRecyclerView usableRecyclerView = baseRecyclerFragment.n0;
            if (usableRecyclerView == null) {
                return 1;
            }
            if (i == usableRecyclerView.getAdapter().getItemCount() - 1 && baseRecyclerFragment.u0.h && baseRecyclerFragment.q0 != null) {
                return ((GridLayoutManager) baseRecyclerFragment.n0.getLayoutManager()).s;
            }
            GridLayoutManager.c cVar = this.d;
            if (cVar == null) {
                return 1;
            }
            return cVar.c(i);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseRecyclerFragment.this.so();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseRecyclerFragment baseRecyclerFragment = BaseRecyclerFragment.this;
            UsableRecyclerView usableRecyclerView = baseRecyclerFragment.n0;
            if (usableRecyclerView == null || usableRecyclerView.getAdapter() == null) {
                return;
            }
            if (!usableRecyclerView.isComputingLayout()) {
                usableRecyclerView.getAdapter().notifyDataSetChanged();
            } else {
                baseRecyclerFragment.l0.removeCallbacks(this);
                baseRecyclerFragment.l0.post(this);
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseRecyclerFragment baseRecyclerFragment = BaseRecyclerFragment.this;
            wov wovVar = baseRecyclerFragment.p0;
            if (wovVar != null) {
                wovVar.setRefreshing(true);
                baseRecyclerFragment.p0.setEnabled(false);
            }
        }
    }

    public BaseRecyclerFragment(int i) {
        this.l0 = new Handler(Looper.getMainLooper());
        this.z0 = false;
        this.A0 = true;
        this.B0 = false;
        this.C0 = false;
        this.D0 = true;
        this.E0 = R.layout.appkit_recycler_fragment;
        this.F0 = new d();
        this.m0 = i;
        w1d0<T> w1d0Var = new w1d0<>(this, i);
        this.u0 = w1d0Var;
        this.v0 = w1d0Var.a;
        this.w0 = w1d0Var.b;
    }

    public final void Ao(List<T> list) {
        yvv yvvVar;
        this.g0 = false;
        this.i0 = null;
        this.f0 = true;
        ArrayList<T> arrayList = this.v0;
        arrayList.clear();
        arrayList.addAll(list);
        q();
        if (this.n0 == null) {
            return;
        }
        if (this.z0) {
            Eo();
        }
        j6r0.c(0, (View) this.p0);
        j6r0.c(8, this.b0);
        if (BuildInfo.m() || (yvvVar = zvv.a.get()) == null) {
            return;
        }
        yvvVar.d();
        throw null;
    }

    public void Bo(List<T> list, boolean z) {
        yvv yvvVar;
        this.f0 = true;
        this.i0 = null;
        if (this.z0) {
            this.v0.clear();
            this.w0.clear();
            Kj();
        }
        this.g0 = false;
        w1d0<T> w1d0Var = this.u0;
        ArrayList<T> arrayList = w1d0Var.b;
        int i = w1d0Var.j;
        ArrayList<T> arrayList2 = w1d0Var.a;
        BaseRecyclerFragment baseRecyclerFragment = w1d0Var.i;
        if (baseRecyclerFragment.z0) {
            arrayList2.clear();
            arrayList.clear();
            baseRecyclerFragment.Kj();
        }
        if (w1d0Var.c) {
            arrayList.addAll(list);
        } else if (list.size() > i && z && w1d0Var.k) {
            arrayList2.addAll(list.subList(0, i));
            baseRecyclerFragment.A3(list.subList(0, i));
            arrayList.addAll(list.subList(i, list.size()));
        } else {
            arrayList2.addAll(list);
            baseRecyclerFragment.A3(list);
        }
        w1d0Var.c = false;
        if (w1d0Var.d && !baseRecyclerFragment.Lh()) {
            w1d0Var.c = true;
            w1d0Var.d = false;
            baseRecyclerFragment.xo(arrayList2.size(), i * 2);
        }
        baseRecyclerFragment.q();
        w1d0Var.e = z;
        View view = w1d0Var.f;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            boolean z2 = w1d0Var.h;
            boolean z3 = w1d0Var.e;
            if (z2 != z3) {
                w1d0Var.h = z3;
            }
        }
        if (this.z0) {
            Eo();
        }
        j6r0.c(0, (View) this.p0);
        j6r0.c(8, this.b0);
        if (BuildInfo.m() || (yvvVar = zvv.a.get()) == null) {
            return;
        }
        yvvVar.d();
        throw null;
    }

    @Override // xsna.was
    /* renamed from: Co, reason: merged with bridge method [inline-methods] */
    public void onSuccess(VKList<T> vKList) {
        zo(vKList);
    }

    public final void Do() {
        if (!this.f0) {
            qo();
            return;
        }
        wov wovVar = this.p0;
        if (wovVar == null) {
            this.B0 = true;
            return;
        }
        wovVar.post(new e());
        h();
        this.B0 = false;
    }

    public final void Eo() {
        this.z0 = false;
        wov wovVar = this.p0;
        if (wovVar != null) {
            wovVar.setRefreshing(false);
            this.p0.setEnabled(this.A0);
        }
    }

    public void Fo() {
        yvv yvvVar;
        if (!BuildInfo.m() && (yvvVar = zvv.a.get()) != null) {
            yvvVar.d();
            throw null;
        }
        this.f0 = false;
        this.v0.clear();
        Kj();
        I();
        qo();
    }

    public void Go(CharSequence charSequence) {
        this.x0 = charSequence;
        View view = this.o0;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.empty_text);
            textView.setText(charSequence);
            textView.setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
        }
    }

    public final void Ho(boolean z) {
        this.A0 = z;
        wov wovVar = this.p0;
        if (wovVar != null) {
            wovVar.setEnabled(z);
        }
    }

    public boolean Lh() {
        return this.g0;
    }

    public void N0() {
        if (this.z0 || this.C0) {
            return;
        }
        w1d0<T> w1d0Var = this.u0;
        int i = w1d0Var.j;
        ArrayList<T> arrayList = w1d0Var.a;
        ArrayList<T> arrayList2 = w1d0Var.b;
        BaseRecyclerFragment baseRecyclerFragment = w1d0Var.i;
        if (!baseRecyclerFragment.Lh() || w1d0Var.c) {
            if (w1d0Var.c) {
                w1d0Var.c = false;
                w1d0Var.d = true;
                return;
            }
            if (arrayList2.size() <= 0) {
                if (w1d0Var.e) {
                    baseRecyclerFragment.xo(arrayList.size(), i * 2);
                    return;
                }
                return;
            }
            arrayList.addAll(arrayList2);
            baseRecyclerFragment.A3(arrayList2);
            baseRecyclerFragment.q();
            arrayList2.clear();
            if (w1d0Var.e) {
                w1d0Var.c = true;
                baseRecyclerFragment.xo(arrayList.size(), i);
            }
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void h() {
        this.z0 = true;
        if (this.q0 != null) {
            this.s0.setVisibility(8);
        }
        this.C0 = false;
        po();
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (TextUtils.isEmpty(this.x0)) {
            this.x0 = context.getString(R.string.empty_list);
        }
        super.onAttach(context);
    }

    public RecyclerView.o onCreateLayoutManager() {
        getActivity();
        return new GridLayoutManager(1);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        UsableRecyclerView usableRecyclerView = this.n0;
        if (usableRecyclerView != null) {
            usableRecyclerView.setAdapter(null);
        }
        this.n0 = null;
        this.o0 = null;
        this.y0 = null;
        this.b0 = null;
        this.a0 = null;
        this.t0 = null;
        this.s0 = null;
        this.r0 = null;
        this.q0 = null;
        this.p0 = null;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, xsna.cbs
    public void onError(Throwable th) {
        this.g0 = false;
        this.i0 = null;
        if (this.a0 == null) {
            return;
        }
        if (this.z0) {
            Eo();
            j03.j(mo2getContext(), th);
        } else {
            if (this.v0.size() <= 0) {
                super.onError(th);
                return;
            }
            this.C0 = true;
            no(this.s0, th);
            j6r0.c(0, this.s0);
            j6r0.c(8, this.r0);
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        vo(0, this.m0 * 2);
    }

    public void q() {
        this.F0.run();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.E0, (ViewGroup) null);
        UsableRecyclerView usableRecyclerView = (UsableRecyclerView) inflate.findViewById(R.id.list);
        this.n0 = usableRecyclerView;
        usableRecyclerView.setListener(this);
        this.o0 = inflate.findViewById(R.id.empty);
        this.p0 = (wov) inflate.findViewById(R.id.refresh_layout);
        this.t0 = (ViewGroup) inflate.findViewById(R.id.content_wrap);
        Go(this.x0);
        Button button = (Button) this.o0.findViewById(R.id.empty_button);
        this.y0 = button;
        button.setText((CharSequence) null);
        this.y0.setVisibility(8);
        this.y0.setOnClickListener(new a());
        RecyclerView.o onCreateLayoutManager = onCreateLayoutManager();
        if (onCreateLayoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) onCreateLayoutManager;
            gridLayoutManager.x = new b(gridLayoutManager.x);
        }
        this.n0.setLayoutManager(onCreateLayoutManager);
        this.n0.setHasFixedSize(true);
        this.p0.setOnRefreshListener(this);
        this.p0.setEnabled(this.A0);
        this.n0.setEmptyView(this.o0);
        RecyclerView.Adapter wo = wo();
        this.q0 = yo(layoutInflater);
        this.n0.setAdapter(wo);
        View view = this.q0;
        if (view != null) {
            this.r0 = view.findViewById(R.id.load_more_progress);
            View findViewById = this.q0.findViewById(R.id.load_more_error);
            this.s0 = findViewById;
            findViewById.setVisibility(8);
            this.n0.e(this.q0);
            this.s0.findViewById(R.id.error_retry).setOnClickListener(new c());
            View view2 = this.r0;
            View view3 = this.s0;
            w1d0<T> w1d0Var = this.u0;
            w1d0Var.f = view2;
            w1d0Var.g = view3;
            if (view2 != null && view3 != null) {
                view2.setVisibility(w1d0Var.e ? 0 : 8);
                boolean z = w1d0Var.h;
                boolean z2 = w1d0Var.e;
                if (z != z2) {
                    w1d0Var.h = z2;
                }
            }
        }
        if (this.B0) {
            Do();
        }
        return inflate;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void so() {
        if (!this.C0) {
            super.so();
            return;
        }
        this.C0 = false;
        j6r0.c(0, this.r0);
        j6r0.c(8, this.s0);
        N0();
    }

    public boolean uo(PaginatedList<T> paginatedList, int i) {
        return paginatedList.size() + i < paginatedList.i();
    }

    public abstract void vo(int i, int i2);

    public abstract RecyclerView.Adapter wo();

    public final void xo(int i, int i2) {
        this.g0 = true;
        vo(i, i2);
    }

    public View yo(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.appkit_load_more, (ViewGroup) null);
    }

    public void zo(PaginatedList<T> paginatedList) {
        int size;
        boolean z = false;
        if (this.z0) {
            size = 0;
        } else {
            size = this.w0.size() + this.v0.size();
        }
        if (uo(paginatedList, size) && this.D0) {
            z = true;
        }
        Bo(paginatedList, z);
    }

    public BaseRecyclerFragment(int i, int i2) {
        super(i);
        this.l0 = new Handler(Looper.getMainLooper());
        this.z0 = false;
        this.A0 = true;
        this.B0 = false;
        this.C0 = false;
        this.D0 = true;
        this.E0 = R.layout.appkit_recycler_fragment;
        this.F0 = new d();
        this.m0 = i2;
        w1d0<T> w1d0Var = new w1d0<>(this, i2);
        this.u0 = w1d0Var;
        this.v0 = w1d0Var.a;
        this.w0 = w1d0Var.b;
    }

    public void Kj() {
    }

    public void M() {
    }

    public void A3(List<T> list) {
    }
}

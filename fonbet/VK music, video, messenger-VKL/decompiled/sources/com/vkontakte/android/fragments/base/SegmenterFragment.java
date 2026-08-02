package com.vkontakte.android.fragments.base;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tonicartos.superslim.LayoutManager;
import com.tonicartos.superslim.a;
import com.vk.core.view.FastScroller;
import com.vk.feed.settings.impl.base.fragment.FilterListFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import java.util.WeakHashMap;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.c2i0;
import xsna.d6i0;
import xsna.iah0;
import xsna.j6r0;
import xsna.jt9;
import xsna.mf7;
import xsna.pfd0;
import xsna.vif0;
import xsna.x48;

/* loaded from: classes7.dex */
public abstract class SegmenterFragment<T> extends VKRecyclerFragment<T> {
    public static final /* synthetic */ int L0 = 0;
    public SegmenterFragment<T>.c<T, ?> I0;
    public jt9 J0;
    public int K0;

    public class a implements View.OnLayoutChangeListener {
        public int b = 0;
        public int c = 0;

        /* renamed from: com.vkontakte.android.fragments.base.SegmenterFragment$a$a, reason: collision with other inner class name */
        public class RunnableC2105a implements Runnable {
            public RunnableC2105a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                SegmenterFragment segmenterFragment = SegmenterFragment.this;
                int i = SegmenterFragment.L0;
                UsableRecyclerView usableRecyclerView = segmenterFragment.n0;
                if (usableRecyclerView == null || usableRecyclerView.getAdapter() == null) {
                    return;
                }
                SegmenterFragment.this.n0.getAdapter().notifyDataSetChanged();
            }
        }

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = SegmenterFragment.L0;
            SegmenterFragment segmenterFragment = SegmenterFragment.this;
            if (segmenterFragment.n0.getWidth() != this.b) {
                this.b = segmenterFragment.n0.getWidth();
                if (segmenterFragment.Jo() != this.c) {
                    this.c = segmenterFragment.Jo();
                    segmenterFragment.n0.post(new RunnableC2105a());
                }
            }
        }
    }

    public static class b extends vif0<d6i0.a> {
        public ProgressBar n;
        public ViewGroup o;
        public TextView p;
        public View q;

        @Override // xsna.vif0
        public final void i6(d6i0.a aVar) {
            aVar.getClass();
        }
    }

    public abstract class c<T, VH extends vif0<T>> extends UsableRecyclerView.c implements mf7, x48.a, FastScroller.b {
        public d6i0 c;
        public final /* synthetic */ FilterListFragment d;

        public c(FilterListFragment filterListFragment) {
            this.d = filterListFragment;
        }

        public abstract pfd0 A0(ViewGroup viewGroup);

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            return null;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            getItemViewType(i);
            return 0;
        }

        @Override // xsna.mf7
        public final int e0(int i) {
            int itemCount = getItemCount();
            this.c.getClass();
            int i2 = itemCount - 1;
            int i3 = i == 0 ? 2 : 0;
            return (i3 != 0 || i > i2) ? i3 : i3 | 1;
        }

        @Override // com.vk.core.view.FastScroller.b
        public final CharSequence f(int i) {
            if (i == getItemCount()) {
                i--;
            }
            d6i0 d6i0Var = this.c;
            return d6i0Var.c(d6i0Var.e(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            d6i0 d6i0Var = this.c;
            if (d6i0Var == null) {
                return 0;
            }
            return d6i0Var.getItemCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            if (i == this.c.getItemCount()) {
                return 2;
            }
            return this.c.i(i) ? 0 : 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            a.C0366a c0366a;
            ViewGroup.LayoutParams layoutParams = e0Var.itemView.getLayoutParams();
            if (layoutParams == null) {
                c0366a = new a.C0366a();
            } else {
                c0366a = layoutParams instanceof ViewGroup.MarginLayoutParams ? new a.C0366a((ViewGroup.MarginLayoutParams) layoutParams) : new a.C0366a(layoutParams);
            }
            ((ViewGroup.MarginLayoutParams) c0366a).height = -2;
            FilterListFragment filterListFragment = this.d;
            c0366a.o = filterListFragment.Jo();
            int d = this.c.d(i);
            if (d < 0) {
                throw new LayoutManager.b.a();
            }
            c0366a.n = d;
            ((ViewGroup.MarginLayoutParams) c0366a).bottomMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0366a).topMargin = 0;
            c0366a.m = 2;
            e0Var.itemView.setLayoutParams(c0366a);
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                x0(e0Var, c0366a, i);
                return;
            }
            if (itemViewType == 1) {
                y0((vif0) e0Var, c0366a, i);
                return;
            }
            if (itemViewType != 2) {
                return;
            }
            this.c.getClass();
            ((b) e0Var).V5(null);
            c0366a.f = true;
            c0366a.g = 1;
            jt9 jt9Var = filterListFragment.J0;
            ((ViewGroup.MarginLayoutParams) c0366a).topMargin = jt9Var != null ? jt9Var.h : 0;
            if (i < 0) {
                throw new LayoutManager.b.a();
            }
            c0366a.n = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return z0(viewGroup);
            }
            if (i == 1) {
                return A0(viewGroup);
            }
            if (i != 2) {
                return null;
            }
            b bVar = new b(viewGroup, R.layout.appkit_load_more, 0);
            bVar.n = (ProgressBar) bVar.itemView.findViewById(R.id.load_more_progress);
            bVar.o = (ViewGroup) bVar.itemView.findViewById(R.id.load_more_error);
            bVar.p = (TextView) bVar.itemView.findViewById(R.id.error_text);
            bVar.q = bVar.itemView.findViewById(R.id.error_retry);
            bVar.n.setVisibility(0);
            bVar.o.setVisibility(8);
            bVar.p.setVisibility(8);
            bVar.q.setVisibility(8);
            return bVar;
        }

        @Override // xsna.x48.a
        public final boolean u0(int i) {
            if (getItemViewType(i) != 1) {
                return false;
            }
            int d = this.c.d(i);
            int e = this.c.e(i);
            int a = this.c.a(e);
            int Jo = this.d.Jo();
            int i2 = (i - d) - (this.c.i(d) ? 1 : 0);
            int i3 = (a / Jo) * Jo;
            if (i3 == a) {
                i3 -= Jo;
            }
            return i2 >= i3 && e < this.c.b() - 1;
        }

        public abstract void x0(RecyclerView.e0 e0Var, a.C0366a c0366a, int i);

        /* JADX WARN: Multi-variable type inference failed */
        public void y0(VH vh, a.C0366a c0366a, int i) {
            vh.V5(this.c.getItem(i));
        }

        public abstract RecyclerView.e0 z0(ViewGroup viewGroup);
    }

    public SegmenterFragment() {
        super(Integer.MAX_VALUE);
    }

    public abstract FilterListFragment.a Io();

    public abstract int Jo();

    public abstract c2i0 Ko();

    public final void Lo() {
        int i;
        UsableRecyclerView usableRecyclerView = this.n0;
        if (usableRecyclerView != null) {
            usableRecyclerView.removeItemDecoration(this.J0);
            jt9 jt9Var = new jt9(null, !this.U);
            int i2 = this.V;
            if (i2 >= 600) {
                WeakHashMap weakHashMap = j6r0.a;
                this.K0 = iah0.a(12.0f);
                i = iah0.a(6.0f);
            } else {
                if (i2 >= 480) {
                    WeakHashMap weakHashMap2 = j6r0.a;
                    this.K0 = iah0.a(8.0f);
                } else {
                    this.K0 = 0;
                }
                i = 0;
            }
            WeakHashMap weakHashMap3 = j6r0.a;
            int a2 = iah0.a(8.0f) + i;
            int a3 = this.V >= 924 ? iah0.a(Math.max(16, (r1 - 924) / 2)) : 0;
            UsableRecyclerView usableRecyclerView2 = this.n0;
            int i3 = this.K0;
            int i4 = a3 + i3;
            usableRecyclerView2.setPadding(i4, a2, i4, i3);
            int i5 = this.K0;
            jt9Var.e = i5;
            jt9Var.f = a2;
            jt9Var.g = i5;
            jt9Var.h = i5;
            this.J0 = jt9Var;
            this.n0.addItemDecoration(jt9Var);
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.views.UsableRecyclerView.p
    public final void N0() {
        super.N0();
        Ko().getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Lo();
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Lo();
        if (this.I0 == null) {
            this.I0 = Io();
        }
        this.I0.notifyDataSetChanged();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.o onCreateLayoutManager() {
        return new LayoutManager(getActivity());
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.n0.setScrollBarStyle(33554432);
        this.n0.setId(-1);
        this.n0.addOnLayoutChangeListener(new a());
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public final void q() {
        if (this.I0 == null) {
            this.I0 = Io();
        }
        SegmenterFragment<T>.c<T, ?> cVar = this.I0;
        cVar.c = Ko();
        cVar.notifyDataSetChanged();
        super.q();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter wo() {
        if (this.I0 == null) {
            this.I0 = Io();
        }
        return this.I0;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final View yo(LayoutInflater layoutInflater) {
        return null;
    }
}

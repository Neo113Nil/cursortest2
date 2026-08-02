package com.vkontakte.android.fragments.base;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.iah0;
import xsna.j6r0;
import xsna.jt9;
import xsna.mf7;
import xsna.ofu;
import xsna.vif0;

/* loaded from: classes7.dex */
public abstract class GridFragment<T> extends VKRecyclerFragment<T> {
    public static final /* synthetic */ int K0 = 0;
    public GridFragment<T>.b<?> I0;
    public jt9 J0;

    public class a implements View.OnLayoutChangeListener {
        public int b = 0;

        /* renamed from: com.vkontakte.android.fragments.base.GridFragment$a$a, reason: collision with other inner class name */
        public class RunnableC2104a implements Runnable {
            public RunnableC2104a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                GridFragment gridFragment = GridFragment.this;
                int i = GridFragment.K0;
                UsableRecyclerView usableRecyclerView = gridFragment.n0;
                if (usableRecyclerView != null) {
                    usableRecyclerView.requestLayout();
                    GridFragment.this.n0.getAdapter().notifyDataSetChanged();
                }
            }
        }

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = GridFragment.K0;
            GridFragment gridFragment = GridFragment.this;
            UsableRecyclerView usableRecyclerView = gridFragment.n0;
            if (usableRecyclerView == null || usableRecyclerView.getWidth() == this.b) {
                return;
            }
            this.b = gridFragment.n0.getWidth();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) gridFragment.n0.getLayoutManager();
            if (gridLayoutManager == null || gridLayoutManager.s == gridFragment.Ko()) {
                return;
            }
            gridLayoutManager.setSpanCount(gridFragment.Ko());
            gridFragment.n0.post(new RunnableC2104a());
        }
    }

    public abstract class b<VH extends vif0> extends UsableRecyclerView.c<VH> implements mf7 {
        public b() {
        }

        public int e0(int i) {
            int itemCount = getItemCount();
            if (i == itemCount) {
                return 0;
            }
            int i2 = i == 0 ? 2 : 0;
            if (i == itemCount - 1) {
                i2 |= 4;
            }
            return i2 == 0 ? i2 | 1 : i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int i = GridFragment.K0;
            ArrayList<T> arrayList = GridFragment.this.v0;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: x0, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(int i, vif0 vif0Var) {
            int i2 = GridFragment.K0;
            vif0Var.V5(GridFragment.this.v0.get(i));
        }
    }

    public abstract GridFragment<T>.b<?> Io();

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    /* renamed from: Jo, reason: merged with bridge method [inline-methods] */
    public final GridFragment<T>.b<?> wo() {
        if (this.I0 == null) {
            this.I0 = Io();
        }
        return this.I0;
    }

    public abstract int Ko();

    public jt9 Lo() {
        int i;
        View view;
        jt9 jt9Var = new jt9(null, !this.U);
        int i2 = this.V;
        if (i2 >= 600) {
            WeakHashMap weakHashMap = j6r0.a;
            i = iah0.a(12.0f);
        } else if (i2 >= 480) {
            WeakHashMap weakHashMap2 = j6r0.a;
            i = iah0.a(8.0f);
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap3 = j6r0.a;
        int a2 = iah0.a(8.0f) + i;
        int a3 = this.V >= 924 ? iah0.a(Math.max(16, (r4 - 924) / 2)) : 0;
        int i3 = a3 + i;
        this.n0.setPadding(i3, a2, i3, i);
        if (this.U && (view = this.o0) != null && view.getTag(R.id.tag_margins_adjusted) == null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o0.getLayoutParams();
            marginLayoutParams.leftMargin += a3;
            marginLayoutParams.rightMargin += a3;
            this.o0.setLayoutParams(marginLayoutParams);
            this.o0.setTag(R.id.tag_margins_adjusted, new Object());
        }
        jt9Var.e = i;
        jt9Var.f = a2;
        jt9Var.g = i;
        jt9Var.h = i;
        return jt9Var;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.n0.removeItemDecoration(this.J0);
        jt9 Lo = Lo();
        this.J0 = Lo;
        if (Lo != null) {
            this.n0.addItemDecoration(Lo);
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n0.removeItemDecoration(this.J0);
        jt9 Lo = Lo();
        this.J0 = Lo;
        if (Lo != null) {
            this.n0.addItemDecoration(Lo);
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.o onCreateLayoutManager() {
        getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(1);
        gridLayoutManager.x = new ofu();
        return gridLayoutManager;
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.n0.setScrollBarStyle(33554432);
        this.n0.addOnLayoutChangeListener(new a());
    }
}

package xsna;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import com.vk.attachpicker.stickers.StickersRecyclerView;
import com.vk.lists.DefaultEmptyView;
import com.vk.lists.DefaultErrorView;
import com.vk.stories.design.view.stickers.selection.SelectionTabView$mReceiver$1;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ifi0;

/* compiled from: SelectionTabView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class ifi0<T, V extends RecyclerView.e0> extends FrameLayout {
    public final qm6<T, V> b;
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c;
    public final StickersRecyclerView d;
    public final ProgressBar e;
    public final DefaultEmptyView f;
    public final DefaultErrorView g;
    public final LinearLayoutManager h;
    public io.reactivex.rxjava3.disposables.c i;
    public io.reactivex.rxjava3.disposables.c j;
    public final SelectionTabView$mReceiver$1 k;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.stories.design.view.stickers.selection.SelectionTabView$mReceiver$1] */
    public ifi0(View view, izs izsVar, qm6 qm6Var, io.reactivex.rxjava3.internal.operators.observable.j1 j1Var) {
        super(view.getContext());
        this.b = qm6Var;
        this.c = j1Var;
        this.k = new BroadcastReceiver(this) { // from class: com.vk.stories.design.view.stickers.selection.SelectionTabView$mReceiver$1
            public final /* synthetic */ ifi0<Object, RecyclerView.e0> a;

            {
                this.a = this;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                this.a.d();
            }
        };
        LayoutInflater.from(getContext()).inflate(R.layout.mask_sticker_tab, this);
        StickersRecyclerView stickersRecyclerView = (StickersRecyclerView) findViewById(R.id.list);
        this.d = stickersRecyclerView;
        this.e = (ProgressBar) findViewById(R.id.pb_medium);
        this.f = (DefaultEmptyView) findViewById(R.id.v_empty);
        this.g = (DefaultErrorView) findViewById(R.id.v_error);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) izsVar.invoke(stickersRecyclerView);
        this.h = linearLayoutManager;
        ((GridLayoutManager) linearLayoutManager).x = new hfi0(this);
        stickersRecyclerView.setAdapter(qm6Var);
        c();
    }

    public static s3q0 b(ifi0 ifi0Var, List list) {
        if (list.isEmpty()) {
            f4m.j(ifi0Var.d);
            f4m.j(ifi0Var.e);
            f4m.j(ifi0Var.g);
            ifi0Var.f.setVisibility(0);
        } else {
            ifi0Var.setupData(list);
        }
        return s3q0.a;
    }

    private final void setupData(List<? extends T> list) {
        ((kim0) this.b).submitList(list);
        this.d.setVisibility(0);
        f4m.j(this.e);
        f4m.j(this.g);
        f4m.j(this.f);
    }

    public final void c() {
        f4m.j(this.d);
        this.e.setVisibility(0);
        f4m.j(this.g);
        f4m.j(this.f);
        d();
    }

    public final void d() {
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        this.i = this.c.a0(io.reactivex.rxjava3.android.schedulers.a.b()).r0(asu0.a.c()).subscribe(new m330(new dn20(this, 25), 20), new gl30(new xc50(this, 18), 22));
    }

    public final qm6<T, V> getAdapter() {
        return this.b;
    }

    public final io.reactivex.rxjava3.core.q<List<T>> getDataProvider() {
        return this.c;
    }

    public final BroadcastReceiver getMReceiver() {
        return this.k;
    }
}

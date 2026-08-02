package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import xsna.pdz0;
import xsna.t5z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class m2z0 extends LinearLayout implements t5z0 {
    public final fbz0 b;
    public final ujz0 c;
    public final m5z0 d;
    public final RecyclerView e;

    public m2z0(t5z0.a aVar, pdz0.a aVar2, Context context) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        this.c = ujz0Var;
        setOrientation(1);
        fbz0 fbz0Var = new fbz0(context);
        this.b = fbz0Var;
        fbz0Var.setGravity(8388661);
        fbz0Var.getAdChoicesButton().setVisibility(8);
        addView(fbz0Var);
        RecyclerView recyclerView = new RecyclerView(context);
        this.e = recyclerView;
        m5z0 m5z0Var = new m5z0(aVar2);
        this.d = m5z0Var;
        recyclerView.setAdapter(m5z0Var);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        int i = ujz0Var.a.get(ujz0.r);
        if (context.getResources().getConfiguration().orientation == 2) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.addItemDecoration(new lcz0(i));
        } else {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.addItemDecoration(new pez0(i));
        }
        fbz0Var.getCloseButton().setOnClickListener(new wcd(aVar, 9));
        e();
        addView(recyclerView);
    }

    @Override // xsna.t5z0
    public final void b() {
        fbz0 fbz0Var = this.b;
        fbz0Var.getCloseButton().setVisibility(0);
        fbz0Var.getProgressFrame().setVisibility(8);
    }

    @Override // xsna.t5z0
    public final void c() {
        this.b.getProgressFrame().setVisibility(8);
    }

    public final void e() {
        rvy0 rvy0Var = new rvy0(getContext());
        int i = rvy0.r;
        SparseIntArray sparseIntArray = rvy0Var.a;
        setBackgroundColor(sparseIntArray.get(i));
        fbz0 fbz0Var = this.b;
        fbz0Var.getProgress().setTextColor(sparseIntArray.get(rvy0.v));
        RelativeLayout progressFrame = fbz0Var.getProgressFrame();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(sparseIntArray.get(rvy0.I));
        gradientDrawable.setShape(1);
        progressFrame.setBackground(gradientDrawable);
    }

    @Override // xsna.t5z0
    @NonNull
    public View getCloseButton() {
        return this.b.getCloseButton();
    }

    @Override // xsna.t5z0
    @Nullable
    public LinearLayout getTopBar() {
        return null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        RecyclerView recyclerView;
        super.onConfigurationChanged(configuration);
        int i = 0;
        while (true) {
            recyclerView = this.e;
            if (i >= recyclerView.getItemDecorationCount()) {
                break;
            }
            recyclerView.removeItemDecorationAt(i);
            i++;
        }
        int i2 = this.c.a.get(ujz0.r);
        if (configuration.orientation == 2) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.addItemDecoration(new lcz0(i2));
        } else {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.addItemDecoration(new pez0(i2));
        }
        e();
    }

    @Override // xsna.t5z0
    public void setDoubleBanners(@NonNull List<m6z0> list) {
        m5z0 m5z0Var = this.d;
        if (m5z0Var == null) {
            return;
        }
        m5z0Var.c = list;
        for (int i = 0; i < m5z0Var.c.size(); i++) {
            m5z0Var.notifyItemChanged(i, m5z0Var.c.get(i));
        }
    }

    @Override // xsna.t5z0
    public void setRemainingAllowCloseDelay(int i) {
        this.b.getProgress().setText(String.valueOf(i));
    }

    @Override // xsna.t5z0
    public final View a() {
        return this;
    }

    @Override // xsna.t5z0
    public final void d() {
    }

    @Override // xsna.t5z0
    public void setBanner(@NonNull tez0 tez0Var) {
    }
}

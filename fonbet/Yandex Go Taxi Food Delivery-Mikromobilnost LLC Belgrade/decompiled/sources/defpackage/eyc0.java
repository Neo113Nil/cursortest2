package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes10.dex */
public final class eyc0 extends RecyclerView.Adapter {
    public final String[] a;
    public final float[] b;
    public int c;
    public final /* synthetic */ PlayerControlView w;

    public eyc0(PlayerControlView playerControlView, String[] strArr, float[] fArr) {
        this.w = playerControlView;
        this.a = strArr;
        this.b = fArr;
    }

    public final String f() {
        return this.a[this.c];
    }

    public final void g(float f) {
        int i = 0;
        float f2 = Float.MAX_VALUE;
        int i2 = 0;
        while (true) {
            float[] fArr = this.b;
            if (i >= fArr.length) {
                this.c = i2;
                return;
            }
            float abs = Math.abs(f - fArr[i]);
            if (abs < f2) {
                i2 = i;
                f2 = abs;
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        iyc0 iyc0Var = (iyc0) x0Var;
        String[] strArr = this.a;
        if (i < strArr.length) {
            iyc0Var.N.setText(strArr[i]);
        }
        if (i == this.c) {
            iyc0Var.a.setSelected(true);
            iyc0Var.O.setVisibility(0);
        } else {
            iyc0Var.a.setSelected(false);
            iyc0Var.O.setVisibility(4);
        }
        iyc0Var.a.setOnClickListener(new wtn(this, i, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new iyc0(LayoutInflater.from(this.w.getContext()).inflate(cuh0.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}

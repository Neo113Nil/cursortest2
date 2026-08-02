package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.uniwidgets.blocks.AvatarsBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import xsna.thn0;

/* compiled from: AvatarsAdapter.kt */
/* loaded from: classes6.dex */
public final class zs5 extends RecyclerView.Adapter<jr5> {
    public final AvatarsBlock c;
    public final j3q0<? extends UniversalWidget> d;

    public zs5(AvatarsBlock avatarsBlock, j3q0<? extends UniversalWidget> j3q0Var) {
        this.c = avatarsBlock;
        this.d = j3q0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(jr5 jr5Var, int i) {
        jr5 jr5Var2 = jr5Var;
        ImageBlock imageBlock = this.c.b.get(i);
        thn0 thn0Var = m3q0.b;
        if (thn0Var == null) {
            thn0Var = null;
        }
        thn0.h hVar = thn0Var.e;
        j3q0<? extends UniversalWidget> j3q0Var = jr5Var2.l;
        View view = jr5Var2.n;
        int i2 = hVar.a;
        int i3 = hVar.b;
        j3q0Var.getClass();
        j3q0.u(i2, i3, view);
        j3q0.h(jr5Var2.l, jr5Var2.m, imageBlock, Float.valueOf(hVar.c), null, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final jr5 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new jr5(new FrameLayout(viewGroup.getContext()), this.d);
    }
}

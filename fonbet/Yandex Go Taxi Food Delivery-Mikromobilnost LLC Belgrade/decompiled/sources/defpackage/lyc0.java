package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class lyc0 extends RecyclerView.Adapter {
    public List a = new ArrayList();
    public final /* synthetic */ PlayerControlView b;

    public lyc0(PlayerControlView playerControlView) {
        this.b = playerControlView;
    }

    public final void f() {
        this.a = Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r5.a.e[r5.b] != false) goto L14;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(iyc0 iyc0Var, int i) {
        zxc0 zxc0Var = this.b.player;
        if (zxc0Var == null) {
            return;
        }
        if (i == 0) {
            h(iyc0Var);
            return;
        }
        boolean z = true;
        kyc0 kyc0Var = (kyc0) this.a.get(i - 1);
        xzz0 xzz0Var = kyc0Var.a.b;
        if (zxc0Var.getTrackSelectionParameters().t.get(xzz0Var) != null) {
        }
        z = false;
        iyc0Var.N.setText(kyc0Var.c);
        iyc0Var.O.setVisibility(z ? 0 : 4);
        iyc0Var.a.setOnClickListener(new opo(this, zxc0Var, xzz0Var, kyc0Var, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return this.a.size() + 1;
    }

    public abstract void h(iyc0 iyc0Var);

    public abstract void i(String str);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new iyc0(LayoutInflater.from(this.b.getContext()).inflate(cuh0.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}

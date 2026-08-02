package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;

/* loaded from: classes2.dex */
public final class itv extends y {
    public final tls a;
    public final tls b;
    public final sls c;

    public itv(sls slsVar, tls tlsVar, tls tlsVar2) {
        super(new htv());
        this.a = tlsVar;
        this.b = tlsVar2;
        this.c = slsVar;
    }

    public final int f(int i) {
        boolean z = i == 0 || getItemViewType(i + (-1)) == 2;
        boolean z2 = i == getItemCount() - 1 || getItemViewType(i + 1) == 2;
        return (z && z2) ? gxg0.plus_debug_panel_bg_all_corners_rounded : z ? gxg0.plus_debug_panel_bg_top_corners_rounded : z2 ? gxg0.plus_debug_panel_bg_bottom_corners_rounded : gxg0.plus_debug_panel_bg_rectangle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        bwg bwgVar = (bwg) getItem(i);
        if (bwgVar instanceof izj) {
            return 0;
        }
        if (bwgVar instanceof ykf) {
            return 1;
        }
        if (bwgVar instanceof wau) {
            return 2;
        }
        if (bwgVar instanceof jzj) {
            return 3;
        }
        ny61.g("Unknown type");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        bwg bwgVar = (bwg) getItem(i);
        if (x0Var instanceof dxs) {
            dxs dxsVar = (dxs) x0Var;
            izj izjVar = (izj) bwgVar;
            dxsVar.W().setBackground(vng.t(f(i), dxsVar.a.getContext()));
            dxsVar.W().setText(izjVar.b);
            bb1.L(dxsVar.W(), new vsn(9, dxsVar, izjVar));
            return;
        }
        if (x0Var instanceof deu) {
            ((TextView) ((deu) x0Var).N.a(deu.O[0])).setText(((wau) bwgVar).b);
            return;
        }
        if (x0Var instanceof zkf) {
            zkf zkfVar = (zkf) x0Var;
            wv5 wv5Var = zkfVar.O;
            int f = f(i);
            kgx[] kgxVarArr = zkf.P;
            ((TextView) wv5Var.a(kgxVarArr[0])).setText((CharSequence) null);
            ((TextView) wv5Var.a(kgxVarArr[0])).setBackground(vng.t(f, zkfVar.a.getContext()));
            bb1.L((TextView) wv5Var.a(kgxVarArr[0]), new ci8(zkfVar, (ykf) bwgVar));
            return;
        }
        if (x0Var instanceof ilz) {
            ilz ilzVar = (ilz) x0Var;
            wv5 wv5Var2 = ilzVar.O;
            int f2 = f(i);
            kgx[] kgxVarArr2 = ilz.P;
            ((TextView) wv5Var2.a(kgxVarArr2[0])).setText(((jzj) bwgVar).a);
            ((TextView) wv5Var2.a(kgxVarArr2[0])).setBackground(vng.t(f2, ilzVar.a.getContext()));
            bb1.L((TextView) wv5Var2.a(kgxVarArr2[0]), new zgv(7, ilzVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new dxs(bb1.v(viewGroup, bmh0.plus_debug_panel_item_general_info, false), this.a);
        }
        if (i == 1) {
            return new zkf(bb1.v(viewGroup, bmh0.plus_debug_panel_item_custom_info, false), this.b);
        }
        if (i == 2) {
            return new deu(bb1.v(viewGroup, bmh0.plus_debug_panel_item_header, false));
        }
        if (i == 3) {
            return new ilz(bb1.v(viewGroup, bmh0.plus_debug_panel_item_custom_info, false), this.c);
        }
        ny61.g("Unknown viewType");
        return null;
    }
}

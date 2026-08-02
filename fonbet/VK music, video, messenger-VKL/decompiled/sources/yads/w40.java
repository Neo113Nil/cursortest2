package yads;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$layout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class w40 extends androidx.recyclerview.widget.x {
    public final am3 a;
    public final mm3 b;

    public /* synthetic */ w40(ec1 ec1Var, z70 z70Var) {
        this(new am3(ec1Var, z70Var), new mm3());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ba0 ba0Var = (ba0) getItem(i);
        this.b.getClass();
        if (ba0Var instanceof u90) {
            return R$layout.debug_panel_item_action_button;
        }
        if (ba0Var instanceof aa0) {
            return R$layout.debug_panel_item_switch;
        }
        if (ba0Var instanceof v90) {
            return R$layout.debug_panel_item_divider;
        }
        if (ba0Var instanceof w90) {
            return R$layout.deubg_panel_item_header;
        }
        if (ba0Var instanceof x90) {
            return R$layout.deubg_panel_item_key_value;
        }
        if (ba0Var instanceof y90) {
            return R$layout.debug_panel_item_mediation_adapter;
        }
        if (ba0Var instanceof s90) {
            return R$layout.debug_panel_item_ad_units;
        }
        if (ba0Var instanceof r90) {
            return R$layout.debug_panel_item_ad_unit;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((ea0) e0Var).a((ba0) getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = xsna.tf3.b(viewGroup, i, viewGroup, false);
        am3 am3Var = this.a;
        am3Var.getClass();
        return i == R$layout.debug_panel_item_action_button ? new n0(tl3.b, b) : i == R$layout.debug_panel_item_switch ? new g63(b, new vl3(am3Var)) : i == R$layout.deubg_panel_item_header ? new v01(b) : i == R$layout.deubg_panel_item_key_value ? new me1(b) : i == R$layout.debug_panel_item_mediation_adapter ? new ns1(b, am3Var.b, new wl3(am3Var), new xl3(am3Var)) : i == R$layout.debug_panel_item_ad_units ? new rb(b, new yl3(am3Var)) : i == R$layout.debug_panel_item_ad_unit ? new pb(new zl3(am3Var), b) : new yi0(b);
    }

    public w40(am3 am3Var, mm3 mm3Var) {
        super(new t70());
        this.a = am3Var;
        this.b = mm3Var;
    }
}

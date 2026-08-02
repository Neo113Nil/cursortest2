package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;

/* compiled from: CommunityPriorityBlockServicesItem.kt */
/* loaded from: classes5.dex */
public final class vdh extends we6 {
    public final wdh g;
    public final ic h;
    public final dne i;
    public final h9 j;
    public final com.vk.movika.sdk.base.presenter.b k;
    public final qc l;
    public final w3h m;
    public final x3h n;
    public final y3h o;

    /* compiled from: CommunityPriorityBlockServicesItem.kt */
    public static final class a extends vif0<vdh> {
        public final gzs<s3q0> n;
        public final gzs<s3q0> o;
        public final gzs<s3q0> p;
        public final gzs<s3q0> q;
        public final gzs<s3q0> r;
        public final b s;
        public final wzs<MarketProductTileConfig.f, Integer, s3q0> t;
        public final wzs<MarketProductTileConfig.f, Integer, s3q0> u;
        public final wh50 v;

        public a(ViewGroup viewGroup, ComposeView composeView, wdh wdhVar, ic icVar, dne dneVar, h9 h9Var, com.vk.movika.sdk.base.presenter.b bVar, qc qcVar, b bVar2, x3h x3hVar, y3h y3hVar) {
            super(composeView, viewGroup);
            this.n = icVar;
            this.o = dneVar;
            this.p = h9Var;
            this.q = bVar;
            this.r = qcVar;
            this.s = bVar2;
            this.t = x3hVar;
            this.u = y3hVar;
            this.v = androidx.compose.runtime.k.b(wdhVar);
            bwt0.Z(R.attr.vk_ui_background_content, composeView);
            composeView.setTag("market_priority_block_item_compose_view");
            composeView.setContent(new jai(-761082986, new w61(this, 3), true));
        }

        @Override // xsna.vif0
        public final void i6(vdh vdhVar) {
            vdh vdhVar2 = vdhVar;
            if (vdhVar2 != null) {
                ((zak0) this.v).setValue(vdhVar2.g);
            }
        }

        public final wdh q6() {
            return (wdh) ((zak0) this.v).getValue();
        }
    }

    /* compiled from: CommunityPriorityBlockServicesItem.kt */
    public static final class b implements wzs<MarketProductTileConfig.f, Integer, s3q0> {
        public final /* synthetic */ ComposeView c;

        public b(ComposeView composeView) {
            this.c = composeView;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(MarketProductTileConfig.f fVar, Integer num) {
            vdh.this.m.invoke(new MarketProductTileConfig.f(fVar.a), Integer.valueOf(num.intValue()), this.c);
            return s3q0.a;
        }
    }

    public vdh(wdh wdhVar, ic icVar, dne dneVar, h9 h9Var, com.vk.movika.sdk.base.presenter.b bVar, qc qcVar, w3h w3hVar, x3h x3hVar, y3h y3hVar) {
        this.g = wdhVar;
        this.h = icVar;
        this.i = dneVar;
        this.j = h9Var;
        this.k = bVar;
        this.l = qcVar;
        this.m = w3hVar;
        this.n = x3hVar;
        this.o = y3hVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        ComposeView e = sv1.e(viewGroup.getContext());
        e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(viewGroup, e, this.g, this.h, this.i, this.j, this.k, this.l, new b(e), this.n, this.o);
    }

    @Override // xsna.we6
    public final int h() {
        return -249;
    }
}

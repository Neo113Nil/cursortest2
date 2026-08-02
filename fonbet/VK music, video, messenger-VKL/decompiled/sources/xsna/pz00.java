package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Good;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.newsfeed.common.presentation.model.items.attachments.CtaButtonClickType;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarketGoodFaveGridHolder.kt */
/* loaded from: classes4.dex */
public final class pz00 extends qi6<FaveEntry> implements View.OnClickListener {
    public static final /* synthetic */ int I = 0;
    public final q530 C;
    public final j08 D;
    public final MarketProductTileView E;
    public final b F;
    public final ecm G;
    public final m1i H;

    /* compiled from: MarketGoodFaveGridHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CtaButtonClickType.values().length];
            try {
                iArr[CtaButtonClickType.ADD_TO_CART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CtaButtonClickType.OPEN_CART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CtaButtonClickType.OPEN_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CtaButtonClickType.WRITE_OWNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CtaButtonClickType.CALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MarketGoodFaveGridHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            FaveItem faveItem;
            pz00 pz00Var = (pz00) this.receiver;
            int i = pz00.I;
            FaveEntry q6 = pz00Var.q6();
            gmq gmqVar = (q6 == null || (faveItem = q6.i) == null) ? null : faveItem.f;
            if (gmqVar instanceof FaveMarketItem) {
                gmq gmqVar2 = gmqVar;
                FaveMarketItem faveMarketItem = (FaveMarketItem) gmqVar2;
                smq.f(tmq.a(), pz00Var.itemView.getContext(), ao8.s(((FaveMarketItem) gmqVar2).b), new i8c(7, pz00Var, faveMarketItem), new x2(4, pz00Var, faveMarketItem), new ma(18, pz00Var, faveMarketItem), true, null, null, 448);
            } else {
                L.l("Can't setup product for " + gmqVar);
            }
            return s3q0.a;
        }
    }

    public pz00(ViewGroup viewGroup, q530 q530Var) {
        super(R.layout.fave_grid_holder, viewGroup);
        this.C = q530Var;
        this.D = new j08();
        this.E = (MarketProductTileView) this.itemView;
        this.F = new b(0, this, pz00.class, "onFaveClick", "onFaveClick()V", 0);
        this.G = new ecm(this, 25);
        this.H = new m1i(this, 28);
    }

    @Override // xsna.qi6
    public final void E6(FaveEntry faveEntry) {
        ModerationRestriction moderationRestriction;
        FaveItem faveItem;
        gmq gmqVar;
        FaveEntry faveEntry2 = faveEntry;
        u1c0 J0 = J0();
        Good good = null;
        ol60 ol60Var = J0 != null ? J0.h : null;
        if (ol60Var instanceof py00) {
            FaveEntry q6 = q6();
            if (q6 != null && (faveItem = q6.i) != null && (gmqVar = faveItem.f) != null) {
                FaveMarketItem faveMarketItem = gmqVar instanceof FaveMarketItem ? (FaveMarketItem) gmqVar : null;
                if (faveMarketItem != null) {
                    good = faveMarketItem.b;
                }
            }
            if (good == null) {
                L.l("Can't setup product for " + faveEntry2);
                return;
            }
            py00 py00Var = (py00) ol60Var;
            r530 r530Var = py00Var.i;
            q530 q530Var = this.C;
            if (q530Var == null || (moderationRestriction = q530Var.a(r530Var.b)) == null) {
                moderationRestriction = ModerationRestriction.NONE;
            }
            r530Var.c = moderationRestriction;
            r530 r530Var2 = py00Var.i;
            ModerationRestriction moderationRestriction2 = r530Var2.c;
            ModerationRestriction moderationRestriction3 = ModerationRestriction.NONE;
            MarketProductTileView marketProductTileView = this.E;
            if (moderationRestriction2 == moderationRestriction3) {
                marketProductTileView.P4(py00Var.h);
                marketProductTileView.Q4(this.H);
            } else {
                marketProductTileView.P4(r530Var2.a);
            }
            marketProductTileView.U4(this.F);
            marketProductTileView.Z4(this.G);
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        this.D.getClass();
        j08.a(u1c0Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s980 s980Var = this.y;
        if (s980Var != null) {
            NewsEntry t6 = t6();
            u1c0 J0 = J0();
            s980Var.U5(t6, false, J0 != null ? J0.k : -1);
        }
    }
}

package xsna;

import com.vk.dto.common.Image;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.design.compose.tile.model.ProductCtaButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.vid0;

/* compiled from: MarketProductTileConfigEntryPoint.kt */
/* loaded from: classes18.dex */
public interface hom0 {

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class a implements hom0 {
        public static final a a = new a();

        @Override // xsna.hom0
        public final MarketProductTileConfig a(tc10 tc10Var, MarketProductTileConfig marketProductTileConfig) {
            List<vid0> u0 = ((dc10) tc10Var.a).u0();
            if (u0 == null) {
                return marketProductTileConfig;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : u0) {
                if (!(((vid0) obj) instanceof vid0.a)) {
                    arrayList.add(obj);
                }
            }
            return MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, null, null, false, null, null, null, null, null, new MarketProductTileConfig.a(arrayList), null, 114687);
        }

        @Override // xsna.hom0
        public final List<Class<? extends hom0>> b() {
            return EmptyList.b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1122068616;
        }

        public final String toString() {
            return "BadgesOnlyPartnerIntegration";
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class b implements hom0 {
        public static final b a = new b();

        @Override // xsna.hom0
        public final MarketProductTileConfig a(tc10 tc10Var, MarketProductTileConfig marketProductTileConfig) {
            List<vid0> u0 = ((dc10) tc10Var.a).u0();
            return u0 != null ? MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, null, null, false, null, null, null, null, null, new MarketProductTileConfig.a(u0), null, 114687) : marketProductTileConfig;
        }

        @Override // xsna.hom0
        public final List<Class<? extends hom0>> b() {
            return EmptyList.b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1192089106;
        }

        public final String toString() {
            return "BadgesWithPartnerIntegration";
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class c implements hom0 {
        public final MarketProductTileConfig.DisplayCtaButtonType a;
        public final boolean b;

        /* compiled from: MarketProductTileConfigEntryPoint.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProductCtaButton.Type.values().length];
                try {
                    iArr[ProductCtaButton.Type.Write.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProductCtaButton.Type.Call.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProductCtaButton.Type.AddToCart.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ProductCtaButton.Type.GoToCart.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ProductCtaButton.Type.PartnerLink.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ProductCtaButton.Type.Link.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ProductCtaButton.Type.Similar.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
            this(null, 3);
        }

        @Override // xsna.hom0
        public final MarketProductTileConfig a(tc10 tc10Var, MarketProductTileConfig marketProductTileConfig) {
            ProductCtaButton productCtaButton;
            MarketProductTileConfig.b bVar;
            List<ProductCtaButton> i = ((dc10) tc10Var.a).i();
            if (i == null || (productCtaButton = (ProductCtaButton) j5g.a0(i)) == null) {
                return marketProductTileConfig;
            }
            String str = productCtaButton.b;
            switch (a.$EnumSwitchMapping$0[productCtaButton.a.ordinal()]) {
                case 1:
                    bVar = new MarketProductTileConfig.b(MarketProductTileConfig.CtaButtonType.Write, str, true);
                    break;
                case 2:
                    bVar = new MarketProductTileConfig.b(MarketProductTileConfig.CtaButtonType.Call, str, true);
                    break;
                case 3:
                    bVar = new MarketProductTileConfig.b(MarketProductTileConfig.CtaButtonType.ToCart, str, true);
                    break;
                case 4:
                    bVar = new MarketProductTileConfig.b(MarketProductTileConfig.CtaButtonType.InCart, str, true);
                    break;
                case 5:
                    bVar = new MarketProductTileConfig.b(MarketProductTileConfig.CtaButtonType.PartnerLink, str, true);
                    break;
                case 6:
                    bVar = new MarketProductTileConfig.b(MarketProductTileConfig.CtaButtonType.ToShop, str, true);
                    break;
                case 7:
                    bVar = new MarketProductTileConfig.b(MarketProductTileConfig.CtaButtonType.Similar, str, true);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            MarketProductTileConfig.b bVar2 = bVar;
            MarketProductTileConfig.DisplayCtaButtonType displayCtaButtonType = MarketProductTileConfig.DisplayCtaButtonType.BOTTOM;
            MarketProductTileConfig.DisplayCtaButtonType displayCtaButtonType2 = this.a;
            return MarketProductTileConfig.a(marketProductTileConfig, null, null, null, displayCtaButtonType2, displayCtaButtonType2 == displayCtaButtonType && this.b, null, null, false, null, null, null, null, null, null, bVar2, 98279);
        }

        @Override // xsna.hom0
        public final List<Class<? extends hom0>> b() {
            return EmptyList.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonsStrategy(displayCtaButtonType=");
            sb.append(this.a);
            sb.append(", displayRowSpacer=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public c(MarketProductTileConfig.DisplayCtaButtonType displayCtaButtonType, int i) {
            displayCtaButtonType = (i & 1) != 0 ? MarketProductTileConfig.DisplayCtaButtonType.BOTTOM : displayCtaButtonType;
            boolean z = (i & 2) == 0;
            this.a = displayCtaButtonType;
            this.b = z;
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class d implements hom0 {
        public static final d a = new d();

        @Override // xsna.hom0
        public final MarketProductTileConfig a(tc10 tc10Var, MarketProductTileConfig marketProductTileConfig) {
            List<Image> Z = ((dc10) tc10Var.a).Z();
            return Z != null ? MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, Z, null, false, null, null, null, null, null, null, null, 131039) : marketProductTileConfig;
        }

        @Override // xsna.hom0
        public final List<Class<? extends hom0>> b() {
            return EmptyList.b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1989702239;
        }

        public final String toString() {
            return "MultiImages";
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class e implements hom0 {
        public static final e a = new e();

        @Override // xsna.hom0
        public final MarketProductTileConfig a(tc10 tc10Var, MarketProductTileConfig marketProductTileConfig) {
            Image j = ((dc10) tc10Var.a).j();
            return j != null ? MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, Collections.singletonList(j), null, false, null, null, null, null, null, null, null, 131039) : marketProductTileConfig;
        }

        @Override // xsna.hom0
        public final List<Class<? extends hom0>> b() {
            return Collections.singletonList(d.class);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -655324155;
        }

        public final String toString() {
            return "OneImage";
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class f implements hom0 {
        public static final f a = new f();

        @Override // xsna.hom0
        public final MarketProductTileConfig a(tc10 tc10Var, MarketProductTileConfig marketProductTileConfig) {
            dc10 dc10Var = (dc10) tc10Var.a;
            if (((Boolean) ((bpn0) tc10Var.c).getValue()).booleanValue()) {
                return MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, null, null, false, null, new MarketProductTileConfig.c(dc10Var.P(), dc10Var.k() ? MarketProductTileConfig.d.a.a : null), null, null, null, null, null, 130047);
            }
            return marketProductTileConfig;
        }

        @Override // xsna.hom0
        public final List<Class<? extends hom0>> b() {
            return Collections.singletonList(g.class);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2123452270;
        }

        public final String toString() {
            return "OwnerDisplayStrategy";
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class g implements hom0 {
        public final boolean a;

        public g() {
            this(false);
        }

        @Override // xsna.hom0
        public final MarketProductTileConfig a(tc10 tc10Var, MarketProductTileConfig marketProductTileConfig) {
            dc10 dc10Var = (dc10) tc10Var.a;
            if (!((Boolean) ((bpn0) tc10Var.b).getValue()).booleanValue()) {
                return MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, null, null, false, null, null, null, null, this.a ? MarketProductTileConfig.HoldDescriptionSecondLineType.Rating : MarketProductTileConfig.HoldDescriptionSecondLineType.None, null, null, 122879);
            }
            return MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, null, null, false, null, null, null, new MarketProductTileConfig.g(dc10Var.e().floatValue(), dc10Var.c()), null, null, null, 126975);
        }

        @Override // xsna.hom0
        public final List<Class<? extends hom0>> b() {
            return EmptyList.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("RatingDisplayStrategy(isHoldRatingLine="), this.a, ')');
        }

        public g(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class h implements hom0 {
        public static final h a = new h();

        @Override // xsna.hom0
        public final MarketProductTileConfig a(tc10 tc10Var, MarketProductTileConfig marketProductTileConfig) {
            return MarketProductTileConfig.a(marketProductTileConfig, String.valueOf(((dc10) tc10Var.a).getItemId()), null, null, null, false, null, null, false, null, null, null, null, null, null, null, 131070);
        }

        @Override // xsna.hom0
        public final List<Class<? extends hom0>> b() {
            return EmptyList.b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -741826056;
        }

        public final String toString() {
            return "UidFromIdStrategy";
        }
    }

    MarketProductTileConfig a(tc10 tc10Var, MarketProductTileConfig marketProductTileConfig);

    default List<Class<? extends hom0>> b() {
        return EmptyList.b;
    }
}

package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import java.util.List;
import xsna.hom0;

/* compiled from: MarketProductTileConfigEntryPoint.kt */
/* loaded from: classes18.dex */
public interface wfq0 {

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class a implements wfq0 {
        public static final a a = new a();
        public static final List<hom0> b = e43.l(hom0.h.a, new hom0.c(MarketProductTileConfig.DisplayCtaButtonType.ABOVE_IMAGE, 2), hom0.e.a);

        @Override // xsna.wfq0
        public final List<hom0> a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 588211031;
        }

        public final String toString() {
            return "CommunityPriorityBlockServicesUseCase";
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class b implements wfq0 {
        public static final b a = new b();
        public static final List<hom0> b = e43.l(hom0.h.a, new hom0.c(MarketProductTileConfig.DisplayCtaButtonType.ABOVE_IMAGE, 2), new hom0.g(true), hom0.e.a, hom0.b.a);

        @Override // xsna.wfq0
        public final List<hom0> a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -404586603;
        }

        public final String toString() {
            return "CommunityPriorityBlockUseCase";
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class c implements wfq0 {
        public static final c a = new c();
        public static final List<hom0> b = e43.l(hom0.h.a, new hom0.c(null, 3), hom0.f.a, hom0.d.a, hom0.e.a, hom0.a.a);

        @Override // xsna.wfq0
        public final List<hom0> a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1640722704;
        }

        public final String toString() {
            return "ProductInContentUseCase";
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class d implements wfq0 {
        public static final d a = new d();
        public static final List<hom0> b = e43.l(hom0.h.a, new hom0.g(false), hom0.f.a, hom0.e.a, hom0.b.a);

        @Override // xsna.wfq0
        public final List<hom0> a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1410900244;
        }

        public final String toString() {
            return "ProductListUseCase";
        }
    }

    /* compiled from: MarketProductTileConfigEntryPoint.kt */
    public static final class e implements wfq0 {
        public static final e a = new e();
        public static final List<hom0> b = e43.l(hom0.h.a, new hom0.c(null, 1), new hom0.g(false), hom0.e.a, hom0.b.a);

        @Override // xsna.wfq0
        public final List<hom0> a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1713008013;
        }

        public final String toString() {
            return "StorefrontUseCase";
        }
    }

    List<hom0> a();
}

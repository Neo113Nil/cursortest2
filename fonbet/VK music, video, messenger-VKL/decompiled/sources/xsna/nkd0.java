package xsna;

import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ProductCardComposition.kt */
/* loaded from: classes18.dex */
public final class nkd0 implements uic {
    public final mnd0 b;
    public com.vk.core.view.components.spinner.c c;
    public final im50 d;

    /* compiled from: ProductCardComposition.kt */
    public static final /* synthetic */ class a extends PropertyReference1Impl {
        public static final a b = new a(ind0.class, "gallery", "getGallery()Lcom/vk/ecomm/market/good/good2/presentation/gallery/ProductCardGalleryViewState;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((ind0) obj).e;
        }
    }

    /* compiled from: ProductCardComposition.kt */
    public static final /* synthetic */ class b extends PropertyReference1Impl {
        public static final b b = new b(ind0.class, "mainInfo", "getMainInfo()Lcom/vk/ecomm/market/good/good2/presentation/maininfo/ProductCardMainInfoViewState;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((ind0) obj).h;
        }
    }

    /* compiled from: ProductCardComposition.kt */
    public static final /* synthetic */ class c extends PropertyReference1Impl {
        public static final c b = new c(ind0.class, "communityInfo", "getCommunityInfo()Lcom/vk/ecomm/market/good/good2/presentation/community/ProductCardCommunityInfoViewState;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((ind0) obj).f;
        }
    }

    /* compiled from: ProductCardComposition.kt */
    public static final /* synthetic */ class d extends PropertyReference1Impl {
        public static final d b = new d(ind0.class, "communityMarketInfo", "getCommunityMarketInfo()Lcom/vk/ecomm/market/good/good2/presentation/community/market/ProductCardCommunityMarketInfoViewState;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((ind0) obj).g;
        }
    }

    /* compiled from: ProductCardComposition.kt */
    public static final /* synthetic */ class e extends PropertyReference1Impl {
        public static final e b = new e(ind0.class, "isBlockingProgress", "isBlockingProgress()Z", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Boolean.valueOf(((ind0) obj).c);
        }
    }

    public nkd0(mnd0 mnd0Var) {
        this.b = mnd0Var;
        iid iidVar = new iid(5);
        i750 i750Var = new i750(this, 19);
        gom0 gom0Var = new gom0();
        i750Var.invoke(gom0Var);
        iidVar.b = new en50(gom0Var.a, gom0Var.b, gom0Var.c);
        s3q0 s3q0Var = s3q0.a;
        this.d = new im50((en50) iidVar.b);
    }

    @Override // xsna.uic
    public final void clear() {
    }
}

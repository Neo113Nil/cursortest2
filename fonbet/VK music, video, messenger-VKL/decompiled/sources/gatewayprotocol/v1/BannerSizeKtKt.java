package gatewayprotocol.v1;

import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: BannerSizeKt.kt */
/* loaded from: classes8.dex */
public final class BannerSizeKtKt {
    /* renamed from: -initializebannerSize, reason: not valid java name */
    public static final AdRequestOuterClass.BannerSize m218initializebannerSize(izs<? super BannerSizeKt.Dsl, s3q0> izsVar) {
        BannerSizeKt.Dsl _create = BannerSizeKt.Dsl.Companion._create(AdRequestOuterClass.BannerSize.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final AdRequestOuterClass.BannerSize copy(AdRequestOuterClass.BannerSize bannerSize, izs<? super BannerSizeKt.Dsl, s3q0> izsVar) {
        BannerSizeKt.Dsl _create = BannerSizeKt.Dsl.Companion._create(bannerSize.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}

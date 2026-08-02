package com.yandex.go.platform.lottie_splash.domain;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/lottie_splash/domain/LottieSplashThemePresentationModel;", "", "Companion", "$serializer", "com/yandex/go/platform/lottie_splash/domain/a", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LottieSplashThemePresentationModel {
    public static final a Companion = new a();
    public static final KSerializer[] e = {null, null, null, LottiePositionPresentationModel.Companion.serializer()};
    public final String a;
    public final String b;
    public final String c;
    public final LottiePositionPresentationModel d;

    public /* synthetic */ LottieSplashThemePresentationModel(int i, String str, String str2, String str3, LottiePositionPresentationModel lottiePositionPresentationModel) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, LottieSplashThemePresentationModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lottiePositionPresentationModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieSplashThemePresentationModel)) {
            return false;
        }
        LottieSplashThemePresentationModel lottieSplashThemePresentationModel = (LottieSplashThemePresentationModel) obj;
        return jl40.l(this.a, lottieSplashThemePresentationModel.a) && jl40.l(this.b, lottieSplashThemePresentationModel.b) && jl40.l(this.c, lottieSplashThemePresentationModel.c) && this.d == lottieSplashThemePresentationModel.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LottiePositionPresentationModel lottiePositionPresentationModel = this.d;
        return hashCode3 + (lottiePositionPresentationModel != null ? lottiePositionPresentationModel.hashCode() : 0);
    }

    public final String toString() {
        return "LottieSplashThemePresentationModel(lottie=" + this.a + ", backgroundColor=" + this.b + ", spiralColor=" + this.c + ", lottiePosition=" + this.d + ')';
    }
}

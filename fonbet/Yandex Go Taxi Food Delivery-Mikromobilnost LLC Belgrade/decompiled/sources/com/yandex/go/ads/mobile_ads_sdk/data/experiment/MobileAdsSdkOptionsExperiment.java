package com.yandex.go.ads.mobile_ads_sdk.data.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.um20;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ads/mobile_ads_sdk/data/experiment/MobileAdsSdkOptionsExperiment;", "Lw96;", "Companion", "com/yandex/go/ads/mobile_ads_sdk/data/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MobileAdsSdkOptionsExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(13))};
    public static final MobileAdsSdkOptionsExperiment e = new MobileAdsSdkOptionsExperiment(0);
    public final boolean b;
    public final Map c;

    public /* synthetic */ MobileAdsSdkOptionsExperiment(Map map, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileAdsSdkOptionsExperiment)) {
            return false;
        }
        MobileAdsSdkOptionsExperiment mobileAdsSdkOptionsExperiment = (MobileAdsSdkOptionsExperiment) obj;
        return this.b == mobileAdsSdkOptionsExperiment.b && jl40.l(this.c, mobileAdsSdkOptionsExperiment.c);
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "MobileAdsSdkOptionsExperiment(enabled=" + this.b + ", hostPaths=" + this.c + Extension.C_BRAKE;
    }

    public MobileAdsSdkOptionsExperiment() {
        this(0);
    }

    public MobileAdsSdkOptionsExperiment(boolean z, Map map) {
        this.b = z;
        this.c = map;
    }

    public /* synthetic */ MobileAdsSdkOptionsExperiment(int i) {
        this(false, b.f());
    }
}

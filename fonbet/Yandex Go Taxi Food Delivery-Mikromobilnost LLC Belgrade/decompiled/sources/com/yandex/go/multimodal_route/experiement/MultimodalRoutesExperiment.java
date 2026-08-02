package com.yandex.go.multimodal_route.experiement;

import defpackage.c6z;
import defpackage.d540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n;
import defpackage.qje;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/multimodal_route/experiement/MultimodalRoutesExperiment;", "Lw96;", "Lc6z;", "Companion", "OnboardingConfig", "com/yandex/go/multimodal_route/experiement/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MultimodalRoutesExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] i;
    public static final MultimodalRoutesExperiment j;
    public final boolean b;
    public final Map c;
    public final List d;
    public final OnboardingConfig e;
    public final String f;
    public final String g;
    public final Map h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/experiement/MultimodalRoutesExperiment$OnboardingConfig;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/experiement/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OnboardingConfig {
        public static final b Companion = new b();
        public final FormattedText a;
        public final FormattedText b;
        public final String c;
        public final FormattedText d;

        public /* synthetic */ OnboardingConfig(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            if (9 != (i & 9)) {
                qje.Z(i, 9, MultimodalRoutesExperiment$OnboardingConfig$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            this.d = formattedText3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnboardingConfig)) {
                return false;
            }
            OnboardingConfig onboardingConfig = (OnboardingConfig) obj;
            return jl40.l(this.a, onboardingConfig.a) && jl40.l(this.b, onboardingConfig.b) && jl40.l(this.c, onboardingConfig.c) && jl40.l(this.d, onboardingConfig.d);
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            FormattedText formattedText = this.b;
            int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
            String str = this.c;
            return this.d.a.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder r = n.r("OnboardingConfig(title=", this.a, ", subtitle=", this.b, ", imageTag=");
            r.append(this.c);
            r.append(", buttonText=");
            r.append(this.d);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new d540(12)), kotlin.a.b(lazyThreadSafetyMode, new d540(13)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new d540(14))};
        j = new MultimodalRoutesExperiment(0);
    }

    public /* synthetic */ MultimodalRoutesExperiment(int i2, boolean z, Map map, List list, OnboardingConfig onboardingConfig, String str, String str2, Map map2) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i2 & 8) == 0) {
            this.e = null;
        } else {
            this.e = onboardingConfig;
        }
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i2 & 32) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i2 & 64) == 0) {
            this.h = kotlin.collections.b.f();
        } else {
            this.h = map2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public MultimodalRoutesExperiment() {
        this(0);
    }

    public MultimodalRoutesExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = EmptyList.a;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = f2;
    }
}

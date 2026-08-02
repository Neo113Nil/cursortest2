package com.yandex.go.experiment;

import com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigSetDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.i;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.qv10;
import defpackage.t5z;
import defpackage.unr0;
import defpackage.vn11;
import defpackage.x4e;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/experiment/LocationSdkAndroidGoExperiment;", "Lvn11;", "Companion", "GoConfig", "com/yandex/go/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LocationSdkAndroidGoExperiment implements vn11 {
    public static final a Companion = new a();
    public static final LocationSdkAndroidGoExperiment j = new LocationSdkAndroidGoExperiment(0);
    public final boolean b;
    public final String c;
    public final GoConfig d;
    public final i e;
    public final ProviderConfigSetDto f;
    public final ProviderConfigSetDto g;
    public final ProviderConfigSetDto h;
    public final boolean i;

    public /* synthetic */ LocationSdkAndroidGoExperiment(int i, boolean z, String str, GoConfig goConfig, i iVar, ProviderConfigSetDto providerConfigSetDto, ProviderConfigSetDto providerConfigSetDto2, ProviderConfigSetDto providerConfigSetDto3, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = new GoConfig(0);
        } else {
            this.d = goConfig;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = iVar;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = providerConfigSetDto;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = providerConfigSetDto2;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = providerConfigSetDto3;
        }
        if ((i & 128) == 0) {
            this.i = false;
        } else {
            this.i = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSdkAndroidGoExperiment)) {
            return false;
        }
        LocationSdkAndroidGoExperiment locationSdkAndroidGoExperiment = (LocationSdkAndroidGoExperiment) obj;
        return this.b == locationSdkAndroidGoExperiment.b && jl40.l(this.c, locationSdkAndroidGoExperiment.c) && jl40.l(this.d, locationSdkAndroidGoExperiment.d) && jl40.l(this.e, locationSdkAndroidGoExperiment.e) && jl40.l(this.f, locationSdkAndroidGoExperiment.f) && jl40.l(this.g, locationSdkAndroidGoExperiment.g) && jl40.l(this.h, locationSdkAndroidGoExperiment.h) && this.i == locationSdkAndroidGoExperiment.i;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31;
        i iVar = this.e;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        ProviderConfigSetDto providerConfigSetDto = this.f;
        int hashCode3 = (hashCode2 + (providerConfigSetDto == null ? 0 : providerConfigSetDto.hashCode())) * 31;
        ProviderConfigSetDto providerConfigSetDto2 = this.g;
        int hashCode4 = (hashCode3 + (providerConfigSetDto2 == null ? 0 : providerConfigSetDto2.hashCode())) * 31;
        ProviderConfigSetDto providerConfigSetDto3 = this.h;
        return Boolean.hashCode(this.i) + ((hashCode4 + (providerConfigSetDto3 != null ? providerConfigSetDto3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("LocationSdkAndroidGoExperiment(isEnabled=", ", configName=", this.c, ", goConfig=", this.b);
        v.append(this.d);
        v.append(", defaultVerifiedStrategy=");
        v.append(this.e);
        v.append(", defaultActiveInputConfigs=");
        v.append(this.f);
        v.append(", defaultInactiveInputConfigs=");
        v.append(this.g);
        v.append(", defaultLowActiveInputConfigs=");
        v.append(this.h);
        v.append(", fetchLastKnownLocationsOnStart=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public LocationSdkAndroidGoExperiment() {
        this(0);
    }

    public LocationSdkAndroidGoExperiment(int i) {
        GoConfig goConfig = new GoConfig(0);
        this.b = false;
        this.c = "";
        this.d = goConfig;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/experiment/LocationSdkAndroidGoExperiment$GoConfig;", "", "Companion", "$serializer", "com/yandex/go/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class GoConfig {
        public static final b Companion = new b();
        public static final i3y[] n = {null, null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(2)), null, null};
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final Long j;
        public final Set k;
        public final boolean l;
        public final boolean m;

        public /* synthetic */ GoConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Long l, Set set, boolean z10, boolean z11) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z3;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z4;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z5;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z6;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z7;
            }
            if ((i & 128) == 0) {
                this.h = false;
            } else {
                this.h = z8;
            }
            if ((i & 256) == 0) {
                this.i = false;
            } else {
                this.i = z9;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = l;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = set;
            }
            if ((i & 2048) == 0) {
                this.l = false;
            } else {
                this.l = z10;
            }
            if ((i & 4096) == 0) {
                this.m = false;
            } else {
                this.m = z11;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoConfig)) {
                return false;
            }
            GoConfig goConfig = (GoConfig) obj;
            return this.a == goConfig.a && this.b == goConfig.b && this.c == goConfig.c && this.d == goConfig.d && this.e == goConfig.e && this.f == goConfig.f && this.g == goConfig.g && this.h == goConfig.h && this.i == goConfig.i && jl40.l(this.j, goConfig.j) && jl40.l(this.k, goConfig.k) && this.l == goConfig.l && this.m == goConfig.m;
        }

        public final int hashCode() {
            int e = unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            Long l = this.j;
            int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
            Set set = this.k;
            return Boolean.hashCode(this.m) + unr0.e((hashCode + (set != null ? set.hashCode() : 0)) * 31, 31, this.l);
        }

        public final String toString() {
            StringBuilder u = qv10.u("GoConfig(useWhenThereIsAtLeastOneLocation=", ", useAsLocationProvider=", ", addInPersuggestLastLocationsFromSdkForPolling=", this.a, this.b);
            nnm.v(", useFallbackProvider=", ", addInPersuggestLastLocationsFromSdk=", u, this.c, this.d);
            nnm.v(", addInPersuggestVerifiedLocationTags=", ", addInPersuggestLastLocationsTypeSuffix=", u, this.e, this.f);
            nnm.v(", addKnownCoordinateInCoordProviders=", ", provideAllLocationsInCoordProviders=", u, this.g, this.h);
            u.append(this.i);
            u.append(", lastLocationTimeoutMs=");
            u.append(this.j);
            u.append(", lastLocationTimeoutSources=");
            u.append(this.k);
            u.append(", awaitLastKnownLocationsFetched=");
            u.append(this.l);
            u.append(", useCurrentLocationAsFastPath=");
            return x4e.i(u, this.m, Extension.C_BRAKE);
        }

        public GoConfig(int i) {
            this.a = false;
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = false;
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = null;
            this.k = null;
            this.l = false;
            this.m = false;
        }

        public GoConfig() {
            this(0);
        }
    }
}

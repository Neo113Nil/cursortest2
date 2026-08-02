package com.yandex.go.permission.location_with_agreement.experiment;

import defpackage.c6z;
import defpackage.fsn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.vn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/permission/location_with_agreement/experiment/ExplainingLocationPermissionScreenWithAgreementExperiment;", "Lvn11;", "Lc6z;", "Companion", "FinalSuggestRequestConfiguration", "LocationDto", "LocationIconDto", "com/yandex/go/permission/location_with_agreement/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExplainingLocationPermissionScreenWithAgreementExperiment implements vn11, c6z {
    public static final a Companion = new a();
    public static final i3y[] j = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(11)), null, null, null, null, null, null};
    public static final ExplainingLocationPermissionScreenWithAgreementExperiment k = new ExplainingLocationPermissionScreenWithAgreementExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final LocationDto e;
    public final String f;
    public final boolean g;
    public final String h;
    public final FinalSuggestRequestConfiguration i;

    public /* synthetic */ ExplainingLocationPermissionScreenWithAgreementExperiment(int i, boolean z, Map map, String str, LocationDto locationDto, String str2, boolean z2, String str3, FinalSuggestRequestConfiguration finalSuggestRequestConfiguration) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = new LocationDto(0);
        } else {
            this.e = locationDto;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = finalSuggestRequestConfiguration;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/permission/location_with_agreement/experiment/ExplainingLocationPermissionScreenWithAgreementExperiment$FinalSuggestRequestConfiguration;", "", "Companion", "$serializer", "com/yandex/go/permission/location_with_agreement/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FinalSuggestRequestConfiguration {
        public static final b Companion = new b();
        public final int a;
        public final int b;

        public /* synthetic */ FinalSuggestRequestConfiguration(int i, int i2, int i3) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
        }

        public FinalSuggestRequestConfiguration() {
            this.a = 0;
            this.b = 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/permission/location_with_agreement/experiment/ExplainingLocationPermissionScreenWithAgreementExperiment$LocationIconDto;", "", "Companion", "$serializer", "com/yandex/go/permission/location_with_agreement/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LocationIconDto {
        public static final d Companion = new d();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ LocationIconDto(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public LocationIconDto(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public LocationIconDto() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/permission/location_with_agreement/experiment/ExplainingLocationPermissionScreenWithAgreementExperiment$LocationDto;", "", "Companion", "$serializer", "com/yandex/go/permission/location_with_agreement/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LocationDto {
        public static final c Companion = new c();
        public final LocationIconDto a;
        public final String b;
        public final String c;

        public /* synthetic */ LocationDto(int i, LocationIconDto locationIconDto, String str, String str2) {
            this.a = (i & 1) == 0 ? new LocationIconDto(0) : locationIconDto;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        public LocationDto() {
            this(0);
        }

        public LocationDto(int i) {
            this.a = new LocationIconDto(0);
            this.b = "";
            this.c = "";
        }
    }

    public ExplainingLocationPermissionScreenWithAgreementExperiment() {
        this(0);
    }

    public ExplainingLocationPermissionScreenWithAgreementExperiment(int i) {
        Map f = kotlin.collections.b.f();
        LocationDto locationDto = new LocationDto(0);
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = locationDto;
        this.f = "";
        this.g = false;
        this.h = null;
        this.i = null;
    }
}

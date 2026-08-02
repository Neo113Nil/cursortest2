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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/permission/location_with_agreement/experiment/ExplainingLocationPermissionScreenWithAgreementV2Experiment;", "Lvn11;", "Lc6z;", "Companion", "FinalSuggestRequestConfiguration", "com/yandex/go/permission/location_with_agreement/experiment/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExplainingLocationPermissionScreenWithAgreementV2Experiment implements vn11, c6z {
    public static final e Companion = new e();
    public static final i3y[] k = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(12)), null, null, null, null, null, null, null};
    public static final ExplainingLocationPermissionScreenWithAgreementV2Experiment l = new ExplainingLocationPermissionScreenWithAgreementV2Experiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final FinalSuggestRequestConfiguration i;
    public final boolean j;

    public /* synthetic */ ExplainingLocationPermissionScreenWithAgreementV2Experiment(int i, boolean z, Map map, String str, String str2, String str3, String str4, String str5, FinalSuggestRequestConfiguration finalSuggestRequestConfiguration, boolean z2) {
        this.b = (i & 1) == 0 ? false : z;
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
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = finalSuggestRequestConfiguration;
        }
        if ((i & 256) == 0) {
            this.j = true;
        } else {
            this.j = z2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/permission/location_with_agreement/experiment/ExplainingLocationPermissionScreenWithAgreementV2Experiment$FinalSuggestRequestConfiguration;", "", "Companion", "$serializer", "com/yandex/go/permission/location_with_agreement/experiment/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FinalSuggestRequestConfiguration {
        public static final f Companion = new f();
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

    public ExplainingLocationPermissionScreenWithAgreementV2Experiment() {
        this(0);
    }

    public ExplainingLocationPermissionScreenWithAgreementV2Experiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = null;
        this.j = true;
    }
}

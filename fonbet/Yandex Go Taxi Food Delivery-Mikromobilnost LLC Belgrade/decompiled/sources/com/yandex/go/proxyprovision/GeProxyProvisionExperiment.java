package com.yandex.go.proxyprovision;

import com.yandex.go.proxyprovision.api.MapKitDefaultHost;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j8s;
import defpackage.vn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/proxyprovision/GeProxyProvisionExperiment;", "Lvn11;", "Companion", "com/yandex/go/proxyprovision/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GeProxyProvisionExperiment implements vn11 {
    public static final d Companion = new d();
    public static final i3y[] i = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j8s(25)), null};
    public static final GeProxyProvisionExperiment j = new GeProxyProvisionExperiment(0);
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final MapKitDefaultHost g;
    public final boolean h;

    public /* synthetic */ GeProxyProvisionExperiment(int i2, boolean z, boolean z2, String str, boolean z3, boolean z4, MapKitDefaultHost mapKitDefaultHost, boolean z5) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = true;
        } else {
            this.c = z2;
        }
        if ((i2 & 4) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z4;
        }
        if ((i2 & 32) == 0) {
            this.g = null;
        } else {
            this.g = mapKitDefaultHost;
        }
        if ((i2 & 64) == 0) {
            this.h = false;
        } else {
            this.h = z5;
        }
    }

    public GeProxyProvisionExperiment(int i2) {
        this.b = false;
        this.c = true;
        this.d = null;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = false;
    }

    public GeProxyProvisionExperiment() {
        this(0);
    }
}

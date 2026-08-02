package defpackage;

import com.yandex.go.superapp.discovery.map.api.SuperAppDiscoveryMapLayer;

/* loaded from: classes14.dex */
public final class itv0 implements ktv0 {
    public final String a;
    public final String b;
    public final float c;
    public final String d;
    public final String e;
    public final boolean f;
    public final SuperAppDiscoveryMapLayer g;
    public final long h;

    public itv0(String str, String str2, float f, String str3, String str4, boolean z, long j) {
        SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer = SuperAppDiscoveryMapLayer.PLACES;
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = superAppDiscoveryMapLayer;
        this.h = j;
    }

    @Override // defpackage.ktv0
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ktv0
    public final float b() {
        return this.c;
    }

    @Override // defpackage.ktv0
    public final String c() {
        return this.e;
    }

    @Override // defpackage.ktv0
    public final String d() {
        return this.d;
    }

    @Override // defpackage.ktv0
    public final String e() {
        return this.a;
    }

    @Override // defpackage.ktv0
    public final SuperAppDiscoveryMapLayer f() {
        return this.g;
    }

    @Override // defpackage.ktv0
    public final boolean g() {
        return this.f;
    }
}

package xsna;

import org.json.JSONObject;

/* compiled from: VkMixAnalyticsEvent.kt */
/* loaded from: classes3.dex */
public final class c4v0 implements bxx {
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final String i;

    public c4v0(String str, String str2, long j, int i, int i2, long j2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = i;
        this.f = i2;
        this.g = j2;
        this.h = str3;
        this.i = str4;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new whg0(this, 26));
    }
}

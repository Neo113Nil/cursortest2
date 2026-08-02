package defpackage;

import java.util.Map;

/* loaded from: classes12.dex */
public final class ov6 implements jup0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final String f;
    public final uvp0 g;

    public ov6(String str, String str2, String str3, String str4, Map map, String str5, uvp0 uvp0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = str5;
        this.g = uvp0Var;
    }

    @Override // defpackage.jup0
    public final Map a() {
        return this.e;
    }

    @Override // defpackage.jup0
    public final String b() {
        return this.f;
    }

    @Override // defpackage.jup0
    public final uvp0 c() {
        return this.g;
    }
}

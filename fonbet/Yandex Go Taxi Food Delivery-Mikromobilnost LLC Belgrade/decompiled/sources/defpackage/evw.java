package defpackage;

import java.util.Map;

/* loaded from: classes10.dex */
public final class evw implements aa10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ tls d;

    public evw(int i, int i2, Map map, tls tlsVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = tlsVar;
    }

    @Override // defpackage.aa10
    public final tls a() {
        return this.d;
    }

    @Override // defpackage.aa10
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.aa10
    public final void c() {
    }

    @Override // defpackage.aa10
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.aa10
    public final int getWidth() {
        return this.a;
    }
}

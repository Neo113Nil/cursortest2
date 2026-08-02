package defpackage;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import java.util.Map;

/* loaded from: classes.dex */
public final class moz implements aa10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ tls d;
    public final /* synthetic */ tls e;
    public final /* synthetic */ LookaheadCapablePlaceable f;

    public moz(int i, int i2, Map map, tls tlsVar, tls tlsVar2, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = tlsVar;
        this.e = tlsVar2;
        this.f = lookaheadCapablePlaceable;
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
        this.e.invoke(this.f.E);
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

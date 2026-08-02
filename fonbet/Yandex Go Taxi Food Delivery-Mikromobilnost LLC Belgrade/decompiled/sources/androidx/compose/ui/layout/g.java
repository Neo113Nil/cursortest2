package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import defpackage.aa10;
import defpackage.tls;
import java.util.Map;

/* loaded from: classes10.dex */
public final class g implements aa10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ tls d;
    public final /* synthetic */ h e;
    public final /* synthetic */ i f;
    public final /* synthetic */ tls g;

    public g(int i, int i2, Map map, tls tlsVar, h hVar, i iVar, tls tlsVar2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = tlsVar;
        this.e = hVar;
        this.f = iVar;
        this.g = tlsVar2;
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
        androidx.compose.ui.node.e eVar;
        LayoutNode layoutNode = this.f.a;
        boolean d0 = this.e.d0();
        tls tlsVar = this.g;
        if (!d0 || (eVar = ((androidx.compose.ui.node.f) layoutNode.a0.d).r0) == null) {
            tlsVar.invoke(((androidx.compose.ui.node.f) layoutNode.a0.d).E);
        } else {
            tlsVar.invoke(eVar.E);
        }
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

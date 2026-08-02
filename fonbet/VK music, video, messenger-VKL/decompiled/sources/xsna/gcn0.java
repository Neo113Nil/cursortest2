package xsna;

import java.util.LinkedHashMap;

/* compiled from: SuperAppTileWidgetBackgroundIconHolder.kt */
/* loaded from: classes6.dex */
public final class gcn0 implements b780 {
    public final /* synthetic */ String b;
    public final /* synthetic */ hcn0 c;

    public gcn0(String str, hcn0 hcn0Var) {
        this.b = str;
        this.c = hcn0Var;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        LinkedHashMap linkedHashMap = bto0.i;
        Boolean bool = (Boolean) (dhr0.M() ? bto0.i : bto0.j).get(this.b);
        if (bool != null) {
            this.c.i6(bool.booleanValue());
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}

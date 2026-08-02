package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class och implements vuu {
    public String b;
    public boolean x;
    public final wuu a = new wuu();
    public final int c = 8000;
    public final int w = 8000;

    @Override // defpackage.ipg
    public final kpg createDataSource() {
        return new rch(this.b, this.c, this.w, this.x, this.a);
    }

    @Override // defpackage.vuu
    public final vuu setDefaultRequestProperties(Map map) {
        this.a.b(map);
        return this;
    }

    @Override // defpackage.vuu, defpackage.ipg
    public final xuu createDataSource() {
        return new rch(this.b, this.c, this.w, this.x, this.a);
    }
}

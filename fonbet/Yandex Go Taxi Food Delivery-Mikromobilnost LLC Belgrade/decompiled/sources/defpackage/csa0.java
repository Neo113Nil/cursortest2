package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public final class csa0 implements zeo {
    public Map a;
    public yeo b;

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        this.b = null;
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        yeo yeoVar = (yeo) xeoVar;
        this.b = yeoVar;
        Map map = this.a;
        if (map != null) {
            yeoVar.success(map);
        }
        this.a = null;
    }
}

package defpackage;

/* loaded from: classes5.dex */
public final class esa0 implements zeo {
    public Object a;
    public yeo b;

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        this.b = null;
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        yeo yeoVar = (yeo) xeoVar;
        this.b = yeoVar;
        Object obj2 = this.a;
        if (obj2 != null) {
            yeoVar.success(obj2);
        }
        this.a = null;
    }
}

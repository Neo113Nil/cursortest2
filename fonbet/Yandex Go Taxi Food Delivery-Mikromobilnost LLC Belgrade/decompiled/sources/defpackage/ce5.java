package defpackage;

import android.util.Log;

/* loaded from: classes4.dex */
public final class ce5 implements fe5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ce5(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.fe5
    public final void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((yfg) obj2).a(((rs10) ((m2v) ((ymu) obj3).c).c).b(obj));
                break;
            default:
                g7r0 g7r0Var = (g7r0) obj3;
                f7r0 f7r0Var = (f7r0) obj2;
                g7r0Var.a.remove(f7r0Var);
                if (!g7r0Var.a.isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(f7r0Var.a));
                    break;
                }
                break;
        }
    }
}

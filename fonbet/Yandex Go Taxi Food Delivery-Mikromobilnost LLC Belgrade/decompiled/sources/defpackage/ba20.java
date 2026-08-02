package defpackage;

import android.util.Log;

/* loaded from: classes4.dex */
public final class ba20 implements da20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ba20(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    private final void a() {
    }

    @Override // defpackage.da20
    public final void error(String str, String str2, Object obj) {
        switch (this.a) {
            case 0:
                ((yfg) this.b).a(((ea20) ((ht10) this.c).c).c.d(str, str2, obj));
                break;
            default:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
        }
    }

    @Override // defpackage.da20
    public final void notImplemented() {
        switch (this.a) {
            case 0:
                ((yfg) this.b).a(null);
                break;
        }
    }

    @Override // defpackage.da20
    public final void success(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((yfg) obj2).a(((ea20) ((ht10) obj3).c).c.e(obj));
                break;
            default:
                ((bxj0) obj3).b = (byte[]) obj2;
                break;
        }
    }
}

package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class op91 implements ga91, fan, f5b1 {
    public static final /* synthetic */ op91 b = new op91(0);
    public static final /* synthetic */ op91 c = new op91(1);
    public static final /* synthetic */ op91 w = new op91(2);
    public static final /* synthetic */ op91 x = new op91(3);
    public static final /* synthetic */ op91 y = new op91(4);
    public final /* synthetic */ int a;

    public /* synthetic */ op91(int i) {
        this.a = i;
    }

    @Override // defpackage.f5b1
    public boolean a(Class cls) {
        return false;
    }

    @Override // defpackage.fan
    public ean b(Context context, String str, dan danVar) {
        ean eanVar = new ean();
        int v = danVar.v(context, str, true);
        eanVar.b = v;
        if (v != 0) {
            eanVar.c = 1;
            return eanVar;
        }
        int i = danVar.i(context, str);
        eanVar.a = i;
        if (i != 0) {
            eanVar.c = -1;
        }
        return eanVar;
    }

    @Override // defpackage.f5b1
    public i7b1 c(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 0:
                List list = nw91.a;
                ((jfb1) cfb1.b.a.get()).getClass();
                Boolean bool = (Boolean) jfb1.a.b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = nw91.a;
                return Integer.valueOf((int) ucb1.a());
            case 2:
                List list3 = nw91.a;
                eib1.b.get().getClass();
                Boolean bool2 = (Boolean) lib1.f.b();
                bool2.getClass();
                return bool2;
            case 3:
                List list4 = nw91.a;
                eib1.b.get().getClass();
                Boolean bool3 = (Boolean) lib1.e.b();
                bool3.getClass();
                return bool3;
            default:
                List list5 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.n0.b()).longValue());
        }
    }
}

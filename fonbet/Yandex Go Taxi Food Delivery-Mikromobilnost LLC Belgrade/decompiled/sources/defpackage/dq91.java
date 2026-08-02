package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class dq91 implements ga91, fan {
    public static final /* synthetic */ dq91 b = new dq91(0);
    public static final /* synthetic */ dq91 c = new dq91(1);
    public static final /* synthetic */ dq91 w = new dq91(2);
    public static final /* synthetic */ dq91 x = new dq91(3);
    public static final /* synthetic */ dq91 y = new dq91(4);
    public final /* synthetic */ int a;

    public /* synthetic */ dq91(int i) {
        this.a = i;
    }

    @Override // defpackage.fan
    public ean b(Context context, String str, dan danVar) {
        int v;
        ean eanVar = new ean();
        int i = danVar.i(context, str);
        eanVar.a = i;
        int i2 = 1;
        int i3 = 0;
        if (i != 0) {
            v = danVar.v(context, str, false);
            eanVar.b = v;
        } else {
            v = danVar.v(context, str, true);
            eanVar.b = v;
        }
        int i4 = eanVar.a;
        if (i4 != 0) {
            i3 = i4;
        } else if (v == 0) {
            i2 = 0;
            eanVar.c = i2;
            return eanVar;
        }
        if (i3 >= v) {
            i2 = -1;
        }
        eanVar.c = i2;
        return eanVar;
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 0:
                List list = nw91.a;
                return Boolean.valueOf(jhb1.a());
            case 1:
                List list2 = nw91.a;
                ((yeb1) reb1.b.a.get()).getClass();
                Boolean bool = (Boolean) yeb1.b.b();
                bool.getClass();
                return bool;
            case 2:
                List list3 = nw91.a;
                eib1.b.get().getClass();
                Boolean bool2 = (Boolean) lib1.h.b();
                bool2.getClass();
                return bool2;
            case 3:
                List list4 = nw91.a;
                ((kbb1) fbb1.b.a.get()).getClass();
                Boolean bool3 = (Boolean) kbb1.a.b();
                bool3.getClass();
                return bool3;
            default:
                ((ghb1) ahb1.b.a.get()).getClass();
                return new Boolean(((Boolean) ghb1.a.b()).booleanValue());
        }
    }
}

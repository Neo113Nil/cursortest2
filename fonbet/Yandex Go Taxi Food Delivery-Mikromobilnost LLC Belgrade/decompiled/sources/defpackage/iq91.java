package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class iq91 implements ga91, uca1 {
    public static final /* synthetic */ iq91 b = new iq91(0);
    public static final /* synthetic */ iq91 c = new iq91(1);
    public static final /* synthetic */ iq91 w = new iq91(2);
    public static final /* synthetic */ iq91 x = new iq91(3);
    public static final /* synthetic */ iq91 y = new iq91(4);
    public final /* synthetic */ int a;

    public /* synthetic */ iq91(int i) {
        this.a = i;
    }

    @Override // defpackage.uca1
    public jfa1 a(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.uca1
    public boolean c(Class cls) {
        return false;
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 0:
                List list = nw91.a;
                ((vlb1) plb1.b.a.get()).getClass();
                Boolean bool = (Boolean) vlb1.a.b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = nw91.a;
                ((hkb1) bkb1.b.a.get()).getClass();
                Boolean bool2 = (Boolean) hkb1.a.b();
                bool2.getClass();
                return bool2;
            case 2:
                List list3 = nw91.a;
                eib1.b.get().getClass();
                Boolean bool3 = (Boolean) lib1.g.b();
                bool3.getClass();
                return bool3;
            case 3:
                List list4 = nw91.a;
                eib1.b.get().getClass();
                Boolean bool4 = (Boolean) lib1.d.b();
                bool4.getClass();
                return bool4;
            default:
                ((wib1) pib1.b.a.get()).getClass();
                return new Boolean(((Boolean) wib1.a.b()).booleanValue());
        }
    }
}

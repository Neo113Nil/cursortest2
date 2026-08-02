package defpackage;

/* loaded from: classes9.dex */
public abstract class cvc0 {
    public static final ua2 a;
    public static final ums b;
    public static final kl40 c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        int i = 17;
        if (property.equals("RoboVM")) {
            a = null;
            b = new ums(8);
            c = new kl40(i);
        } else if (property.equals("Dalvik")) {
            a = new ua2(0);
            b = new ooi0(8);
            c = new et6(i);
        } else {
            a = null;
            b = new poi0();
            c = new et6(i);
        }
    }
}

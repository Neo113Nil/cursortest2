package xsna;

/* compiled from: NotificationCenterExt.kt */
/* loaded from: classes11.dex */
public final class r870 implements io.reactivex.rxjava3.functions.c {
    public static final Object b = new Object();
    public static bpn0 c;

    public static final yf9 a() {
        bpn0 bpn0Var = c;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (yf9) bpn0Var.getValue();
    }

    public static String b(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
    }
}

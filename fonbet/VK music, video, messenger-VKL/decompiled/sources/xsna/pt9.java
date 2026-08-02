package xsna;

/* compiled from: CardNumberTextWatcher.kt */
/* loaded from: classes6.dex */
public final class pt9 extends ys6 {
    @Override // xsna.ys6
    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() > 19) {
            sb2 = erm0.D0(19, sb2);
        }
        return j5g.g0(erm0.u0(4, sb2), " ", null, null, 0, null, 62);
    }
}

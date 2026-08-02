package yads;

/* loaded from: classes10.dex */
public abstract class xt implements ph2 {
    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        oh2.b(i, length);
        while (i < length) {
            if (a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean a(char c);

    @Override // yads.ph2
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}

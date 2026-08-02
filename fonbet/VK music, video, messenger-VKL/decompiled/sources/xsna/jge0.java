package xsna;

/* compiled from: PullToRefreshPerfTracker.kt */
/* loaded from: classes16.dex */
public final class jge0 implements f5i0 {
    public Object b;
    public Object c;

    public /* synthetic */ jge0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.f5i0
    public int b(int i) {
        do {
            i = ((sux0) this.c).i(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // xsna.f5i0
    public int c(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((sux0) this.c).h(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // xsna.f5i0
    public int d(int i) {
        do {
            i = ((sux0) this.c).i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    @Override // xsna.f5i0
    public int e(int i) {
        do {
            i = ((sux0) this.c).h(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }
}

package xsna;

import xsna.vlk0;

/* compiled from: Splitter.java */
/* loaded from: classes13.dex */
public final class ulk0 extends vlk0.b {
    public final /* synthetic */ vlk0.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulk0(vlk0.a aVar, vlk0 vlk0Var, CharSequence charSequence) {
        super(vlk0Var, charSequence);
        this.h = aVar;
    }

    @Override // xsna.vlk0.b
    public final int a(int i) {
        return this.h.a.length() + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r8 = r8 + 1;
     */
    @Override // xsna.vlk0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(int i) {
        vlk0.a aVar = this.h;
        int length = aVar.a.length();
        CharSequence charSequence = this.d;
        int length2 = charSequence.length() - length;
        while (i <= length2) {
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2 + i) != aVar.a.charAt(i2)) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }
}

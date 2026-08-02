package xsna;

import xsna.slb;
import xsna.vlk0;

/* compiled from: Splitter.java */
/* loaded from: classes13.dex */
public final class slk0 extends vlk0.b {
    public final /* synthetic */ tlk0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slk0(tlk0 tlk0Var, vlk0 vlk0Var, CharSequence charSequence) {
        super(vlk0Var, charSequence);
        this.h = tlk0Var;
    }

    @Override // xsna.vlk0.b
    public final int a(int i) {
        return i + 1;
    }

    @Override // xsna.vlk0.b
    public final int b(int i) {
        slb.b bVar = this.h.a;
        CharSequence charSequence = this.d;
        int length = charSequence.length();
        fxc0.v(i, length);
        while (i < length) {
            if (bVar.a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}

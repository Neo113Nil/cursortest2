package xsna;

import java.util.Arrays;
import xsna.wal0;

/* compiled from: AnimateSticker.kt */
/* loaded from: classes6.dex */
public abstract class lg2 extends kr9 {
    @Override // xsna.kr9, xsna.nov
    public final nov C0() {
        bpn0 bpn0Var = i0q0.a;
        try {
            return k().a();
        } catch (Throwable th) {
            wal0.a.a.a(th, (String[]) Arrays.copyOf(new String[]{"Message: can't deep copy animated sticker, casual copy instead"}, 1));
            return E0(null);
        }
    }

    public abstract int p();

    @Override // xsna.kr9, xsna.nov
    public final boolean z0() {
        return true;
    }
}

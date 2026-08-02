package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class mw1 extends j03 {
    public final kc2 m = new kc2();

    @Override // yads.j03
    public final v53 a(byte[] bArr, int i, boolean z) {
        o20 a;
        kc2 kc2Var = this.m;
        kc2Var.a = bArr;
        kc2Var.c = i;
        kc2Var.b = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            kc2 kc2Var2 = this.m;
            int i2 = kc2Var2.c - kc2Var2.b;
            if (i2 <= 0) {
                return new nw1(arrayList);
            }
            if (i2 < 8) {
                throw new x53("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int b = kc2Var2.b();
            if (this.m.b() == 1987343459) {
                kc2 kc2Var3 = this.m;
                int i3 = b - 8;
                CharSequence charSequence = null;
                n20 n20Var = null;
                while (i3 > 0) {
                    if (i3 < 8) {
                        throw new x53("Incomplete vtt cue box header found.");
                    }
                    int b2 = kc2Var3.b();
                    int b3 = kc2Var3.b();
                    int i4 = b2 - 8;
                    String a2 = mc3.a(kc2Var3.a, kc2Var3.b, i4);
                    kc2Var3.e(kc2Var3.b + i4);
                    i3 = (i3 - 8) - i4;
                    if (b3 == 1937011815) {
                        tp3 tp3Var = new tp3();
                        up3.a(a2, tp3Var);
                        n20Var = tp3Var.a();
                    } else if (b3 == 1885436268) {
                        charSequence = up3.a(null, a2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (n20Var != null) {
                    n20Var.a = charSequence;
                    a = n20Var.a();
                } else {
                    Pattern pattern = up3.a;
                    tp3 tp3Var2 = new tp3();
                    tp3Var2.c = charSequence;
                    a = tp3Var2.a().a();
                }
                arrayList.add(a);
            } else {
                kc2 kc2Var4 = this.m;
                kc2Var4.e(kc2Var4.b + (b - 8));
            }
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import yads.w23;

/* loaded from: classes7.dex */
public final class l381 extends zt71 {
    public final dl81 m = new dl81();

    @Override // defpackage.zt71
    public final fh81 c(int i, byte[] bArr, boolean z) {
        r871 a;
        dl81 dl81Var = this.m;
        dl81Var.a = bArr;
        dl81Var.c = i;
        dl81Var.b = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i2 = dl81Var.c - dl81Var.b;
            if (i2 <= 0) {
                return new f69(arrayList);
            }
            if (i2 < 8) {
                throw new w23("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int a2 = dl81Var.a();
            if (dl81Var.a() == 1987343459) {
                int i3 = a2 - 8;
                CharSequence charSequence = null;
                r571 r571Var = null;
                while (i3 > 0) {
                    if (i3 < 8) {
                        throw new w23("Incomplete vtt cue box header found.");
                    }
                    int a3 = dl81Var.a();
                    int a4 = dl81Var.a();
                    int i4 = a3 - 8;
                    String j = rf71.j(dl81Var.b, i4, dl81Var.a);
                    dl81Var.m(dl81Var.b + i4);
                    i3 = (i3 - 8) - i4;
                    if (a4 == 1937011815) {
                        wc81 wc81Var = new wc81();
                        vf81.d(j, wc81Var);
                        r571Var = wc81Var.a();
                    } else if (a4 == 1885436268) {
                        charSequence = vf81.a(null, j.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (r571Var != null) {
                    r571Var.a = charSequence;
                    a = r571Var.a();
                } else {
                    Pattern pattern = vf81.a;
                    wc81 wc81Var2 = new wc81();
                    wc81Var2.c = charSequence;
                    a = wc81Var2.a().a();
                }
                arrayList.add(a);
            } else {
                dl81Var.m(dl81Var.b + (a2 - 8));
            }
        }
    }
}

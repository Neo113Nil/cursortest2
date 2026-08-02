package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import xsna.a1n0;
import xsna.rkk;
import xsna.zjx0;

/* compiled from: Mp4WebvttParser.java */
/* loaded from: classes12.dex */
public final class bg30 implements a1n0 {
    public final xi90 a = new xi90();

    @Override // xsna.a1n0
    public final void a(byte[] bArr, int i, int i2, a1n0.b bVar, j7j<wkk> j7jVar) {
        rkk a;
        xi90 xi90Var = this.a;
        xi90Var.N(bArr, i + i2);
        xi90Var.P(i);
        ArrayList arrayList = new ArrayList();
        while (xi90Var.a() > 0) {
            fxc0.q(xi90Var.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int p = xi90Var.p();
            if (xi90Var.p() == 1987343459) {
                int i3 = p - 8;
                CharSequence charSequence = null;
                rkk.a aVar = null;
                while (i3 > 0) {
                    fxc0.q(i3 >= 8, "Incomplete vtt cue box header found.");
                    int p2 = xi90Var.p();
                    int p3 = xi90Var.p();
                    int i4 = p2 - 8;
                    byte[] bArr2 = xi90Var.a;
                    int i5 = xi90Var.b;
                    String str = y2r0.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    xi90Var.Q(i4);
                    i3 = (i3 - 8) - i4;
                    if (p3 == 1937011815) {
                        zjx0.d dVar = new zjx0.d();
                        zjx0.e(str2, dVar);
                        aVar = dVar.a();
                    } else if (p3 == 1885436268) {
                        charSequence = zjx0.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                    a = aVar.a();
                } else {
                    Pattern pattern = zjx0.a;
                    zjx0.d dVar2 = new zjx0.d();
                    dVar2.c = charSequence;
                    a = dVar2.a().a();
                }
                arrayList.add(a);
            } else {
                xi90Var.Q(p - 8);
            }
        }
        j7jVar.accept(new wkk(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // xsna.a1n0
    public final int b() {
        return 2;
    }
}

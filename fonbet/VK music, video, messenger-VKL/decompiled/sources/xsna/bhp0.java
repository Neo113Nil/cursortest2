package xsna;

import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import xsna.dip0;
import xsna.ln00;

/* compiled from: TrackSelectionUtil.java */
/* loaded from: classes12.dex */
public final class bhp0 {
    public static dip0 a(ln00.a aVar, List<? extends wgp0>[] listArr) {
        boolean z;
        ImmutableList.a aVar2 = new ImmutableList.a();
        int i = 0;
        while (true) {
            int i2 = aVar.a;
            int[][][] iArr = aVar.e;
            qfp0[] qfp0VarArr = aVar.c;
            if (i >= i2) {
                break;
            }
            qfp0 qfp0Var = qfp0VarArr[i];
            List<? extends wgp0> list = listArr[i];
            int i3 = 0;
            while (i3 < qfp0Var.a) {
                pfp0 a = qfp0Var.a(i3);
                int i4 = a.a;
                int i5 = qfp0VarArr[i].a(i3).a;
                int[] iArr2 = new int[i5];
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    if ((iArr[i][i3][i7] & 7) == 4) {
                        iArr2[i6] = i7;
                        i6++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr2, i6);
                int i8 = 16;
                String str = null;
                int i9 = i;
                int i10 = 0;
                boolean z2 = false;
                int i11 = 0;
                while (i10 < copyOf.length) {
                    int[] iArr3 = copyOf;
                    String str2 = qfp0VarArr[i9].a(i3).d[copyOf[i10]].n;
                    int i12 = i11 + 1;
                    if (i11 == 0) {
                        str = str2;
                    } else {
                        z2 |= !Objects.equals(str, str2);
                    }
                    i8 = Math.min(i8, iArr[i9][i3][i10] & 24);
                    i10++;
                    i11 = i12;
                    copyOf = iArr3;
                }
                if (z2) {
                    i8 = Math.min(i8, aVar.d[i9]);
                }
                boolean z3 = i8 != 0;
                int[] iArr4 = new int[i4];
                boolean[] zArr = new boolean[i4];
                for (int i13 = 0; i13 < i4; i13++) {
                    iArr4[i13] = iArr[i9][i3][i13] & 7;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z = false;
                            break;
                        }
                        wgp0 wgp0Var = list.get(i14);
                        if (wgp0Var.getTrackGroup().equals(a) && wgp0Var.indexOf(i13) != -1) {
                            z = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z;
                }
                aVar2.c(new dip0.a(a, z3, iArr4, zArr));
                i3++;
                i = i9;
            }
            i++;
        }
        qfp0 qfp0Var2 = aVar.f;
        for (int i15 = 0; i15 < qfp0Var2.a; i15++) {
            pfp0 a2 = qfp0Var2.a(i15);
            int i16 = a2.a;
            int[] iArr5 = new int[i16];
            Arrays.fill(iArr5, 0);
            aVar2.c(new dip0.a(a2, false, iArr5, new boolean[i16]));
        }
        return new dip0(aVar2.g());
    }

    public static b.a b(d7q d7qVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = d7qVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (d7qVar.a(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new b.a(1, 0, length, i);
    }
}

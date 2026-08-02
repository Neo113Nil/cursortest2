package defpackage;

import androidx.compose.ui.layout.e;
import androidx.compose.ui.layout.i;
import java.util.Map;

/* loaded from: classes10.dex */
public final class f1y implements aa10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa10 b;
    public final /* synthetic */ i c;
    public final /* synthetic */ int d;
    public final /* synthetic */ aa10 e;

    public /* synthetic */ f1y(aa10 aa10Var, i iVar, int i, aa10 aa10Var2, int i2) {
        this.a = i2;
        this.c = iVar;
        this.d = i;
        this.e = aa10Var2;
        this.b = aa10Var;
    }

    @Override // defpackage.aa10
    public final tls a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.aa10
    public final Map b() {
        switch (this.a) {
        }
        return this.b.b();
    }

    @Override // defpackage.aa10
    public final void c() {
        int i = this.a;
        aa10 aa10Var = this.e;
        int i2 = this.d;
        i iVar = this.c;
        switch (i) {
            case 0:
                iVar.x = i2;
                aa10Var.c();
                wz40 wz40Var = iVar.F;
                hz40 hz40Var = iVar.E;
                long[] jArr = hz40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = hz40Var.b[i6];
                                    syu0 syu0Var = (syu0) hz40Var.c[i6];
                                    int i7 = wz40Var.i(obj);
                                    if (i7 < 0 || i7 >= iVar.x) {
                                        if (i7 >= 0) {
                                            Object[] objArr = wz40Var.a;
                                            Object obj2 = objArr[i7];
                                            objArr[i7] = e.b;
                                        }
                                        if (iVar.C.a(obj)) {
                                            syu0Var.dispose();
                                        }
                                        hz40Var.n(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                iVar.e(iVar.w);
                break;
            default:
                iVar.w = i2;
                aa10Var.c();
                if (iVar.a.A == null) {
                    iVar.e(iVar.w);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.aa10
    public final int getHeight() {
        switch (this.a) {
        }
        return this.b.getHeight();
    }

    @Override // defpackage.aa10
    public final int getWidth() {
        switch (this.a) {
        }
        return this.b.getWidth();
    }
}

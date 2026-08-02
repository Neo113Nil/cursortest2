package defpackage;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import java.util.Map;

/* loaded from: classes10.dex */
public final class gou extends uyl0 {
    public final Map H;
    public DrmInitData I;

    public gou(au1 au1Var, qmm qmmVar, mmm mmmVar, Map map) {
        super(au1Var, qmmVar, mmmVar);
        this.H = map;
    }

    @Override // defpackage.uyl0
    public final a m(a aVar) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.I;
        if (drmInitData2 == null) {
            drmInitData2 = aVar.r;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.H.get(drmInitData2.schemeType)) != null) {
            drmInitData2 = drmInitData;
        }
        w820 w820Var = aVar.l;
        w820 w820Var2 = null;
        if (w820Var != null) {
            s820[] s820VarArr = w820Var.a;
            int length = s820VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                s820 s820Var = s820VarArr[i2];
                if ((s820Var instanceof o3f0) && "com.apple.streaming.transportStreamTimestamp".equals(((o3f0) s820Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    s820[] s820VarArr2 = new s820[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            s820VarArr2[i < i2 ? i : i - 1] = s820VarArr[i];
                        }
                        i++;
                    }
                    w820Var2 = new w820(s820VarArr2);
                }
            }
            if (drmInitData2 == aVar.r || w820Var != aVar.l) {
                f7s a = aVar.a();
                a.q = drmInitData2;
                a.k = w820Var;
                aVar = new a(a);
            }
            return super.m(aVar);
        }
        w820Var = w820Var2;
        if (drmInitData2 == aVar.r) {
        }
        f7s a2 = aVar.a();
        a2.q = drmInitData2;
        a2.k = w820Var;
        aVar = new a(a2);
        return super.m(aVar);
    }
}

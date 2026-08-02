package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class glo implements Enumeration {
    public final /* synthetic */ int a;
    public int b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                ylo[] yloVarArr = llo.c;
                if (i < 4) {
                    break;
                }
                break;
            default:
                int i2 = this.b;
                ylo[] yloVarArr2 = llo.c;
                if (i2 < 4) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap hashMap = new HashMap();
                for (ylo yloVar : llo.d[this.b]) {
                    hashMap.put(yloVar.b, yloVar);
                }
                this.b++;
                return hashMap;
            default:
                this.b++;
                return new HashMap();
        }
    }
}

package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i73 implements qrq0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ i73(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new r43((byte[]) obj);
            case 1:
                return new z43((float[]) obj);
            case 2:
                return new xmm(this);
            case 3:
                return new h8(3, (ViewGroup) obj);
            case 4:
                return new njy(this);
            case 5:
                return new xrq0(obj);
            default:
                return new dvu0((CharSequence) obj);
        }
    }
}

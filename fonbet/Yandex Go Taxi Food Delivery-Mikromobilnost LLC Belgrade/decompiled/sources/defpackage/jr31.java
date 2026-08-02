package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jr31 implements qrq0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ jr31(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new h8(3, this.b);
            default:
                return new xw01(new h8(3, this.b));
        }
    }
}

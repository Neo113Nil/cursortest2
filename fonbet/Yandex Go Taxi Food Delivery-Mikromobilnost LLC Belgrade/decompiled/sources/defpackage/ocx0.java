package defpackage;

import androidx.compose.foundation.lazy.b;
import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.c;

/* loaded from: classes14.dex */
public final /* synthetic */ class ocx0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ ocx0(b bVar, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = bVar;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        b bVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                c.d(bVar, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                c.e(bVar, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}

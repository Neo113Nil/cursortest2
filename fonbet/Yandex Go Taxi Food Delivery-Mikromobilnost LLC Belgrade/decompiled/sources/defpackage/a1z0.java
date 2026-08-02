package defpackage;

import androidx.compose.foundation.lazy.b;
import com.yandex.passport.api.AccountListBranding;
import com.yandex.passport.internal.ui.bouncer.chooser.h;
import java.util.List;
import java.util.Locale;
import ru.yandex.taxi.logistics.sdk.ui.form.background.video.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class a1z0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ a1z0(zxc0 zxc0Var, boolean z, f530 f530Var, j690 j690Var, int i) {
        this.a = 4;
        this.x = zxc0Var;
        this.b = z;
        this.c = f530Var;
        this.y = j690Var;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                c1z0.c(this.b, (s3z0) obj5, (sls) obj4, (f530) obj3, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                c1z0.d(this.b, (t3z0) obj5, (tls) obj4, (f530) obj3, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                dub1.a((List) obj5, (b) obj4, (f530) obj3, this.b, (fid) obj, O3);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int O4 = vng.O(i2 | 1);
                ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b.b((o9z0) obj5, (tls) obj3, (sls) obj4, this.b, (fid) obj, O4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int O5 = vng.O(i2 | 1);
                a.b((zxc0) obj5, this.b, (f530) obj3, (j690) obj4, (fid) obj, O5);
                break;
            default:
                ((Integer) obj2).getClass();
                int O6 = vng.O(i2 | 1);
                h.c(this.b, (AccountListBranding) obj5, (Locale) obj4, (f530) obj3, (fid) obj, O6);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a1z0(o9z0 o9z0Var, tls tlsVar, sls slsVar, boolean z, int i) {
        this.a = 3;
        this.x = o9z0Var;
        this.c = tlsVar;
        this.y = slsVar;
        this.b = z;
        this.w = i;
    }

    public /* synthetic */ a1z0(List list, b bVar, f530 f530Var, boolean z, int i) {
        this.a = 2;
        this.x = list;
        this.y = bVar;
        this.c = f530Var;
        this.b = z;
        this.w = i;
    }

    public /* synthetic */ a1z0(boolean z, Object obj, Object obj2, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.x = obj;
        this.y = obj2;
        this.c = f530Var;
        this.w = i;
    }
}

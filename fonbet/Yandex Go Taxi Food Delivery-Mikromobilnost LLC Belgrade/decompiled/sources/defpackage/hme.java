package defpackage;

import ru.yandex.taxi.logistics.sdk.dashboard.ui.widget.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class hme implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ cms y;

    public /* synthetic */ hme(long j, String str, long j2, lzr lzrVar, sls slsVar, int i) {
        this.b = j;
        this.w = str;
        this.c = j2;
        this.x = lzrVar;
        this.y = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cms cmsVar = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.b(this.b, (String) obj4, this.c, (lzr) obj3, (sls) cmsVar, (fid) obj, vng.O(1));
                break;
            default:
                wls wlsVar = (wls) obj4;
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj3;
                wls wlsVar2 = (wls) cmsVar;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.b(vqy0.a.a(eq11.a(f1t0.h, btsVar)), wwg.S(969655473, true, new t0t0(wlsVar, aVar, wlsVar2, eq11.a(f1t0.b, btsVar), this.b, this.c), btsVar), btsVar, 56);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ hme(wls wlsVar, androidx.compose.runtime.internal.a aVar, wls wlsVar2, long j, long j2) {
        this.w = wlsVar;
        this.x = aVar;
        this.y = wlsVar2;
        this.b = j;
        this.c = j2;
    }
}

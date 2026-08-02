package defpackage;

import androidx.compose.animation.core.a;
import ru.yandex.taxi.logistics.sdk.ui.component.misc.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class nx20 implements wls {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ cms z;

    public /* synthetic */ nx20(sls slsVar, long j, mx20 mx20Var, a aVar, androidx.compose.runtime.internal.a aVar2, int i) {
        this.w = slsVar;
        this.b = j;
        this.x = mx20Var;
        this.y = aVar;
        this.z = aVar2;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        cms cmsVar = this.z;
        Object obj3 = this.w;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                androidx.compose.material3.a.d((sls) obj3, this.b, (mx20) obj5, (a) obj4, (androidx.compose.runtime.internal.a) cmsVar, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int O2 = vng.O(i2 | 1);
                b.b((v4v) obj3, (String) obj5, (s9z0) obj4, this.b, (tls) cmsVar, (fid) obj, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                ha91.d((String) obj5, (String) obj4, this.b, (sls) obj3, (tls) cmsVar, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ nx20(v4v v4vVar, String str, s9z0 s9z0Var, long j, tls tlsVar, int i) {
        this.w = v4vVar;
        this.x = str;
        this.y = s9z0Var;
        this.b = j;
        this.z = tlsVar;
        this.c = i;
    }

    public /* synthetic */ nx20(String str, String str2, long j, sls slsVar, tls tlsVar, int i) {
        this.x = str;
        this.y = str2;
        this.b = j;
        this.w = slsVar;
        this.z = tlsVar;
        this.c = i;
    }
}

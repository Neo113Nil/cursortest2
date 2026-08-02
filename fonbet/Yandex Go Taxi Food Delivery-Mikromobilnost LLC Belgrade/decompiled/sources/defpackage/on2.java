package defpackage;

import okhttp3.OkHttpClient;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class on2 {
    public final umx a;
    public final h3y b;
    public final tt2 c;
    public final h3y d;
    public final h3y e;
    public final uc f;
    public final uc g;
    public final ik3 h;
    public final i3y i;
    public final i3y j;
    public final i3y k;
    public final i3y l;
    public final i3y m;
    public final i3y n;

    public on2(ey2 ey2Var, h3y h3yVar, wnt wntVar, umx umxVar, a aVar, h hVar, h3y h3yVar2, tt2 tt2Var, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8, h3y h3yVar9, e6v0 e6v0Var) {
        this.a = umxVar;
        this.b = h3yVar2;
        this.c = tt2Var;
        this.d = h3yVar3;
        this.e = h3yVar4;
        int i = 2;
        this.f = new uc(i, hVar);
        this.g = new uc(9, wntVar);
        int i2 = 0;
        this.h = new ik3(aVar, i2);
        this.i = kotlin.a.a(new ck(this, i));
        this.j = kotlin.a.a(new mj(h3yVar, i));
        this.k = kotlin.a.a(new hn2(this, h3yVar5, ey2Var, h3yVar7));
        this.l = kotlin.a.a(new in2(i2, this, h3yVar5, ey2Var));
        this.m = kotlin.a.a(new ou(i, this, h3yVar5));
        this.n = kotlin.a.a(new jn2(this, h3yVar5, h3yVar6, h3yVar9, h3yVar8, h3yVar7, e6v0Var, 0));
    }

    public final Object a(GoApiName goApiName, Class cls) {
        OkHttpClient okHttpClient;
        switch (ln2.a[goApiName.ordinal()]) {
            case 1:
            case 2:
                okHttpClient = (OkHttpClient) this.m.getValue();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                okHttpClient = (OkHttpClient) this.k.getValue();
                break;
            default:
                w511.b();
                return null;
        }
        return ((apt) this.e.get()).a(goApiName, cls, new mn2(okHttpClient, 0), new fn2(this, 1));
    }
}

package defpackage;

import com.yandex.mob.d;
import com.yandex.mob.okhttp.a;
import com.yandex.mob.okhttp.b;
import com.yandex.mob.okhttp.c;

/* loaded from: classes8.dex */
public final class el20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ flv b;
    public final /* synthetic */ d c;

    public /* synthetic */ el20(flv flvVar, d dVar, int i) {
        this.a = i;
        this.b = flvVar;
        this.c = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        d dVar = this.c;
        flv flvVar = this.b;
        switch (i) {
            case 0:
                return new b(flvVar, dVar.n);
            case 1:
                return new a(flvVar, dVar.n);
            case 2:
                return new com.yandex.mob.okhttp.d(flvVar, dVar.n);
            default:
                return new c(flvVar, dVar.n);
        }
    }
}

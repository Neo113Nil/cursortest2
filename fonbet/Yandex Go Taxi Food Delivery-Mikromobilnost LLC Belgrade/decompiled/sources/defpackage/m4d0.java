package defpackage;

import com.yandex.plus.home.analytics.evgen.a;
import com.yandex.plus.home.c;
import java.util.Map;
import kotlin.Result;

/* loaded from: classes8.dex */
public final /* synthetic */ class m4d0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ m4d0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                return (Map) ((a) cVar.d.f.getValue()).a().a;
            default:
                Object h = cVar.f.a().h();
                if (h instanceof Result.Failure) {
                    h = null;
                }
                return (k2d0) h;
        }
    }
}

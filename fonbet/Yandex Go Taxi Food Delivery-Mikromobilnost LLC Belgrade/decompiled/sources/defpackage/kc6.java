package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.b;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.d;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.f;

/* loaded from: classes5.dex */
public final class kc6 implements v7p {
    public final /* synthetic */ int a;
    public final oti b;
    public final mzf c;
    public final ibg d;

    public /* synthetic */ kc6(oti otiVar, mzf mzfVar, ibg ibgVar, int i) {
        this.a = i;
        this.b = otiVar;
        this.c = mzfVar;
        this.d = ibgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        ibg ibgVar = this.d;
        mzf mzfVar = this.c;
        oti otiVar = this.b;
        switch (i) {
            case 0:
                return new b((d) otiVar.get(), (e) mzfVar.get(), (hwy0) ibgVar.get());
            default:
                return new f((d) otiVar.get(), (e) mzfVar.get(), (hwy0) ibgVar.get());
        }
    }
}

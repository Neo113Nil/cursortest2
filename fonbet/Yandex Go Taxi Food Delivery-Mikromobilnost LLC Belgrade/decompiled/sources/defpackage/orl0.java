package defpackage;

import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.safety.center.analytics.a;
import com.yandex.go.safety.center.help.e;
import com.yandex.go.safety.center.j;

/* loaded from: classes13.dex */
public final /* synthetic */ class orl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ orl0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                a aVar = eVar.J;
                SafetyCenterParams$Source safetyCenterParams$Source = eVar.F.a;
                j jVar = eVar.z;
                aVar.f(true, jVar.h(), ((Boolean) jVar.q.getValue()).booleanValue());
                break;
            case 1:
                a aVar2 = eVar.J;
                SafetyCenterParams$Source safetyCenterParams$Source2 = eVar.F.a;
                j jVar2 = eVar.z;
                aVar2.f(true, jVar2.h(), ((Boolean) jVar2.q.getValue()).booleanValue());
                break;
            default:
                a aVar3 = eVar.J;
                SafetyCenterParams$Source safetyCenterParams$Source3 = eVar.F.a;
                j jVar3 = eVar.z;
                aVar3.f(false, jVar3.h(), ((Boolean) jVar3.q.getValue()).booleanValue());
                break;
        }
    }
}

package defpackage;

import com.yandex.go.transfer_requirement.state.meeting.a;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class gh10 implements v7p {
    public final /* synthetic */ int a;
    public final pbg b;
    public final pbg c;

    public /* synthetic */ gh10(pbg pbgVar, pbg pbgVar2, int i) {
        this.a = i;
        this.b = pbgVar;
        this.c = pbgVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        pbg pbgVar = this.c;
        pbg pbgVar2 = this.b;
        switch (i) {
            case 0:
                return new a((c) pbgVar2.get(), (e) pbgVar.get());
            case 1:
                return new com.yandex.go.transfer_requirement.state.rules.a((c) pbgVar2.get(), (e) pbgVar.get());
            default:
                return new com.yandex.go.transfer_requirement.state.service_section.a((c) pbgVar2.get(), (e) pbgVar.get());
        }
    }
}

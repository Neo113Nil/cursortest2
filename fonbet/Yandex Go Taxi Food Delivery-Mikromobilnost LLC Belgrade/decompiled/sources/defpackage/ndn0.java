package defpackage;

import com.yandex.go.scooters.passes.c;
import ru.yandex.taxi.scooters.presentation.route_navigation.b;

/* loaded from: classes13.dex */
public final class ndn0 implements ujn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ndn0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                ((c) obj).P();
                break;
            case 2:
                ((gmo0) obj).r(new qu(9));
                break;
            default:
                ((b) obj).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.ujn0
    public final void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((sls) obj).invoke();
                break;
            case 1:
                break;
            case 2:
                ((gmo0) obj).r(new pzn0(26));
                break;
            default:
                ((b) obj).r(new qu(9));
                break;
        }
    }
}

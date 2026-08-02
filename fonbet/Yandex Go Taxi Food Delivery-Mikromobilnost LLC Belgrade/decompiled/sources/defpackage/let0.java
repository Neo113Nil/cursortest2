package defpackage;

import java.util.function.Consumer;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;

/* loaded from: classes6.dex */
public final /* synthetic */ class let0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ net0 b;

    public /* synthetic */ let0(net0 net0Var, int i) {
        this.a = i;
        this.b = net0Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        net0 net0Var = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    net0Var.p.a = null;
                    net0Var.h.a = null;
                }
                net0Var.j.g();
                break;
            default:
                net0Var.j.b((CameraAnimationUpdateType) obj);
                break;
        }
    }
}

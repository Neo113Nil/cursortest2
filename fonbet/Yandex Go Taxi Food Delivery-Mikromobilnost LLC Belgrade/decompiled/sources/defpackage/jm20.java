package defpackage;

import com.yandex.mob.data.c;
import com.yandex.mob.domain.s;

/* loaded from: classes8.dex */
public final class jm20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yuf0 b;
    public final /* synthetic */ mm20 c;

    public /* synthetic */ jm20(yuf0 yuf0Var, mm20 mm20Var, int i) {
        this.a = i;
        this.b = yuf0Var;
        this.c = mm20Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        mm20 mm20Var = this.c;
        yuf0 yuf0Var = this.b;
        switch (i) {
            case 0:
                return new s((c) ((al20) yuf0Var.e).invoke(), (un20) mm20Var.a.getValue());
            default:
                return new wbz0(false);
        }
    }
}

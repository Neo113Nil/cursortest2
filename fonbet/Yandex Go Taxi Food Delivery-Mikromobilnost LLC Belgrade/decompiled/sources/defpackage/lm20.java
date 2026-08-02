package defpackage;

import com.yandex.mob.api.model.MobEnvironment;
import com.yandex.mob.data.c;
import com.yandex.mob.m;

/* loaded from: classes8.dex */
public final class lm20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yuf0 b;

    public /* synthetic */ lm20(yuf0 yuf0Var, int i) {
        this.a = i;
        this.b = yuf0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        yuf0 yuf0Var = this.b;
        switch (i) {
            case 0:
                return (yn20) yuf0Var.b;
            case 1:
                return (m) ((duu) yuf0Var.d).invoke();
            case 2:
                return (c) ((al20) yuf0Var.e).invoke();
            case 3:
                return (jr20) yuf0Var.c;
            case 4:
                return (MobEnvironment) yuf0Var.a;
            default:
                return new mm20(yuf0Var);
        }
    }
}

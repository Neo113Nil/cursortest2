package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class hgt0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ igt0 b;

    public /* synthetic */ hgt0(igt0 igt0Var, int i) {
        this.a = i;
        this.b = igt0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        igt0 igt0Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                igt0Var.i.a();
                break;
            default:
                SourcePointMode sourcePointMode = (SourcePointMode) obj;
                igt0Var.getClass();
                unr0.C(new Object[]{sourcePointMode}, 1, "SourcePointMode changed to '%s'", jst.e);
                igt0Var.b.c();
                if (sourcePointMode == SourcePointMode.DRIVE_TARIFF_FLOW) {
                    igt0Var.g.a();
                }
                igt0Var.e.g();
                igt0Var.a.b();
                rjt0 rjt0Var = igt0Var.c;
                jpv0 b = igt0Var.f.b();
                b.getClass();
                rjt0Var.o = sourcePointMode.i(b instanceof hpv0);
                break;
        }
        return zy11Var;
    }
}

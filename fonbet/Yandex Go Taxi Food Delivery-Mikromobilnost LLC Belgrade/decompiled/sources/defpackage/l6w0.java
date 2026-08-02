package defpackage;

import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class l6w0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6w0 b;

    public /* synthetic */ l6w0(m6w0 m6w0Var, int i) {
        this.a = i;
        this.b = m6w0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m6w0 m6w0Var = this.b;
        switch (i) {
            case 0:
                ((Number) obj).intValue();
                m6w0Var.a(null);
                break;
            case 1:
                m6w0Var.a((SuperAppRecenterPointRepository$Type) obj);
                break;
            default:
                m6w0Var.b(((Boolean) obj).booleanValue());
                break;
        }
        return zy11Var;
    }
}

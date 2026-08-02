package defpackage;

import com.yandex.go.geosharing.controller.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.order.d;

/* loaded from: classes6.dex */
public final class f1t implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ f1t(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                this.b.d();
                break;
            case 1:
                Object a = d.a(continuation, this.b);
                if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                ((Boolean) obj).getClass();
                this.b.m = true;
                this.b.d();
                break;
            case 3:
                Object b = d.b(this.b, ((Boolean) obj).booleanValue(), continuation);
                if (b != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                this.b.n = ((Boolean) obj).booleanValue();
                if (!this.b.n) {
                    e eVar = (e) this.b.b;
                    eVar.n = false;
                    eVar.b.q = false;
                    eVar.r = null;
                    eVar.j();
                }
                this.b.d();
                break;
        }
        return zy11.a;
    }
}

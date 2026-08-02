package defpackage;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.order.i;

/* loaded from: classes6.dex */
public final class ax70 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ ax70(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (defpackage.jl40.l(r3, r0 != null ? r0.b().a : null) == false) goto L24;
     */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ((ww70) this.b.Dg()).Me();
                }
                break;
            case 1:
                ((Number) obj).floatValue();
                i iVar = this.b;
                if (iVar.M.b() == OrderScreen.ORDER_TRACKING) {
                    iVar.Rg(false);
                }
                break;
            case 2:
                this.b.Og(false);
                break;
            case 3:
                zsg zsgVar = (zsg) obj;
                i iVar2 = this.b;
                iVar2.getClass();
                if (zsgVar.a.b().l.X && iVar2.y0 != null) {
                    String str = zsgVar.a.b().a;
                    o2y0 o2y0Var = iVar2.y0;
                    break;
                }
                ((ww70) iVar2.Dg()).n9(zsgVar.a);
                if (zsgVar.b) {
                    iVar2.Og(zsgVar.c);
                }
                break;
            case 4:
                i iVar3 = this.b;
                iVar3.Pg(iVar3.M.b(), iVar3.y0, (o2y0) obj);
                break;
            case 5:
                ((ww70) this.b.Dg()).Ea((vh70) obj);
                break;
            default:
                this.b.Rg(true);
                break;
        }
        return zy11.a;
    }
}

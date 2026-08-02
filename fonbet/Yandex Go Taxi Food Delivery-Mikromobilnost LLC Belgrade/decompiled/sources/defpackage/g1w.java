package defpackage;

import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.input.bricks.writing.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class g1w implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ g1w(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                j3b j3bVar = (j3b) obj;
                dVar.j0 = j3bVar;
                wbz0 wbz0Var = s8b.c;
                int i2 = j3bVar.i;
                wbz0Var.getClass();
                s8b s8bVar = new s8b(i2);
                j1w j1wVar = dVar.a;
                ChatRightsFlag chatRightsFlag = ChatRightsFlag.SendAttachments;
                kgx kgxVar = s8b.d[19];
                boolean booleanValue = chatRightsFlag.c(s8bVar).booleanValue();
                if (!dVar.I.j || !booleanValue) {
                    ai91.c(j1wVar.A, false);
                    break;
                } else {
                    ai91.f(j1wVar.A, false);
                    break;
                }
            default:
                dVar.k0 = (x4b0) obj;
                break;
        }
        return zy11Var;
    }
}

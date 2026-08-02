package xsna;

import com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto;
import kotlin.NoWhenBranchMatchedException;
import xsna.arw0;
import xsna.vqw0;

/* compiled from: VoipInviteToScheduledCallReducer.kt */
/* loaded from: classes7.dex */
public final class zqw0 extends dm50<erw0, vqw0, arw0> {
    public zqw0() {
        super(new arw0(0));
    }

    @Override // xsna.dm50
    public final arw0 c(arw0 arw0Var, vqw0 vqw0Var) {
        arw0 arw0Var2 = arw0Var;
        vqw0 vqw0Var2 = vqw0Var;
        if (vqw0Var2 instanceof vqw0.a) {
            arw0.b bVar = arw0Var2.b;
            boolean z = ((vqw0.a) vqw0Var2).b;
            bVar.getClass();
            return arw0.a(arw0Var2, new arw0.b(z), null, null, 6);
        }
        if (!(vqw0Var2 instanceof vqw0.b)) {
            if (!(vqw0Var2 instanceof vqw0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            arw0.c cVar = arw0Var2.d;
            boolean z2 = ((vqw0.c) vqw0Var2).b;
            cVar.getClass();
            return arw0.a(arw0Var2, null, null, new arw0.c(z2), 3);
        }
        arw0.a aVar = arw0Var2.c;
        vqw0.b bVar2 = (vqw0.b) vqw0Var2;
        String str = bVar2.b;
        String str2 = bVar2.c;
        String str3 = bVar2.d;
        MessagesScheduledCallItemDto messagesScheduledCallItemDto = bVar2.e;
        aVar.getClass();
        return arw0.a(arw0Var2, null, new arw0.a(str, str2, str3, messagesScheduledCallItemDto), null, 5);
    }

    @Override // xsna.dm50
    public final erw0 d() {
        return new erw0(e(new u5p0(this, 22)));
    }

    @Override // xsna.dm50
    public final void h(arw0 arw0Var, erw0 erw0Var) {
        f(erw0Var.a, arw0Var);
    }
}

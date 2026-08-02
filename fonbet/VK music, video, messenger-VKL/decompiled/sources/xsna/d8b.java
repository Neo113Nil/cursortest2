package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b8b;
import xsna.e8b;

/* compiled from: ChannelPayoutReducer.kt */
/* loaded from: classes16.dex */
public final class d8b extends dm50<g8b, b8b, e8b> {
    public d8b() {
        super(e8b.b.b);
    }

    @Override // xsna.dm50
    public final e8b c(e8b e8bVar, b8b b8bVar) {
        e8b e8bVar2 = e8bVar;
        b8b b8bVar2 = b8bVar;
        if (b8bVar2 instanceof b8b.c) {
            return e8b.b.b;
        }
        if (b8bVar2 instanceof b8b.a) {
            return new e8b.a(new e8b.a.InterfaceC2785a.C2786a(((b8b.a) b8bVar2).b));
        }
        if (b8bVar2 instanceof b8b.d) {
            b8b.d dVar = (b8b.d) b8bVar2;
            List<h8b> list = dVar.b;
            UserId userId = dVar.c;
            return new e8b.a(new e8b.a.InterfaceC2785a.b(list, userId, userId, dVar.d, dVar.e));
        }
        if (!(b8bVar2 instanceof b8b.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (e8bVar2 instanceof e8b.a) {
            e8b.a.InterfaceC2785a interfaceC2785a = ((e8b.a) e8bVar2).b;
            if (interfaceC2785a instanceof e8b.a.InterfaceC2785a.b) {
                e8b.a.InterfaceC2785a.b bVar = (e8b.a.InterfaceC2785a.b) interfaceC2785a;
                return new e8b.a(new e8b.a.InterfaceC2785a.b(bVar.a, bVar.b, ((b8b.b) b8bVar2).b, bVar.d, bVar.e));
            }
        }
        return e8bVar2;
    }

    @Override // xsna.dm50
    public final g8b d() {
        return new g8b(e(new p1(this, 19)));
    }

    @Override // xsna.dm50
    public final void h(e8b e8bVar, g8b g8bVar) {
        f(g8bVar.a, e8bVar);
    }
}

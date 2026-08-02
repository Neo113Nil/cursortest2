package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e8b;
import xsna.g8b;
import xsna.u7b;

/* compiled from: ChannelPayoutReducer.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class c8b extends FunctionReferenceImpl implements izs<e8b, g8b.a.C2922a> {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (xsna.epx.f(r12.b, r12.c) == false) goto L34;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g8b.a.C2922a invoke(e8b e8bVar) {
        g8b.a.C2922a.InterfaceC2923a interfaceC2923a;
        u7b cVar;
        List list;
        e8b e8bVar2 = e8bVar;
        ((d8b) this.receiver).getClass();
        boolean z = true;
        if (e8bVar2 instanceof e8b.b) {
            return new g8b.a.C2922a(true, g8b.a.C2922a.InterfaceC2923a.b.a, EmptyList.b, false);
        }
        if (!(e8bVar2 instanceof e8b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        e8b.a.InterfaceC2785a interfaceC2785a = ((e8b.a) e8bVar2).b;
        if (interfaceC2785a instanceof e8b.a.InterfaceC2785a.C2786a) {
            interfaceC2923a = g8b.a.C2922a.InterfaceC2923a.C2924a.a;
        } else {
            if (!(interfaceC2785a instanceof e8b.a.InterfaceC2785a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC2923a = g8b.a.C2922a.InterfaceC2923a.c.a;
        }
        if (interfaceC2785a instanceof e8b.a.InterfaceC2785a.C2786a) {
            list = Collections.singletonList(new u7b.a(((e8b.a.InterfaceC2785a.C2786a) interfaceC2785a).a));
        } else {
            if (!(interfaceC2785a instanceof e8b.a.InterfaceC2785a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            e8b.a.InterfaceC2785a.b bVar = (e8b.a.InterfaceC2785a.b) interfaceC2785a;
            boolean z2 = bVar.d;
            UserId userId = bVar.c;
            h8b h8bVar = bVar.e;
            if (z2) {
                cVar = new u7b.b(h8bVar.b);
            } else {
                UserId userId2 = h8bVar.a;
                cVar = new u7b.c(userId2, h8bVar.b, epx.f(userId2, userId));
            }
            ArrayList o = e43.o(cVar);
            for (h8b h8bVar2 : bVar.a) {
                UserId userId3 = h8bVar2.a;
                o.add(new u7b.c(userId3, h8bVar2.b, epx.f(userId3, userId)));
            }
            list = o;
        }
        if (interfaceC2785a instanceof e8b.a.InterfaceC2785a.b) {
            e8b.a.InterfaceC2785a.b bVar2 = (e8b.a.InterfaceC2785a.b) interfaceC2785a;
        }
        z = false;
        return new g8b.a.C2922a(false, interfaceC2923a, list, z);
    }
}

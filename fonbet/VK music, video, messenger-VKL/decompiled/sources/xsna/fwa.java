package xsna;

import com.vk.channels.impl.comments.g;
import java.util.LinkedHashSet;
import xsna.awg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fwa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fwa(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.d;
                LinkedHashSet linkedHashSet = bVar.n;
                hag hagVar = (hag) this.e;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                g.b bVar2 = gVar.c;
                ttp0.a(linkedHashSet).remove(bVar2 != null ? bVar2.b() : null);
                int i = this.c;
                linkedHashSet.add(Integer.valueOf(i));
                return com.vk.channels.impl.comments.g.a(gVar, com.vk.channels.impl.comments.b.s(bVar, bVar.k.a(), false, 3), null, new g.b(new g.b.a.C0534a(i, hagVar.c)), false, 10);
            default:
                ts70 ts70Var = (ts70) this.d;
                el50 el50Var = (el50) this.e;
                awg0 awg0Var = (awg0) obj;
                return awg0.a.b(awg0Var, ((lq40) ts70Var.a.c).r(this.c).U(new q40(new xmz(15), 28)).r0(awg0Var.r().c()), new cx00(el50Var, 8), null, new zk30(el50Var, 9), 2);
        }
    }
}

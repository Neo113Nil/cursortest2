package xsna;

import com.vk.channels.impl.comments.g;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.mwa;
import xsna.q70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m70 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m70(int i, com.vk.channels.impl.comments.b bVar, mwa.a aVar) {
        this.d = bVar;
        this.c = i;
        this.e = aVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer a;
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.d;
                izs izsVar = (izs) this.e;
                aoj aojVar = (aoj) obj;
                int i = this.c;
                aojVar.a(new q70.a(i, gzsVar, izsVar));
                aojVar.a(new q70.b(i, gzsVar, izsVar));
                return s3q0.a;
            default:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.d;
                LinkedHashSet linkedHashSet = bVar.n;
                mwa.a aVar = (mwa.a) this.e;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                g.b bVar2 = gVar.c;
                if (bVar2 != null && (a = bVar2.a()) != null) {
                    linkedHashSet.remove(Integer.valueOf(a.intValue()));
                }
                linkedHashSet.add(Integer.valueOf(this.c));
                List s = com.vk.channels.impl.comments.b.s(bVar, aVar, false, 3);
                g.b bVar3 = null;
                if (aVar.a.bc() && bVar2 != null) {
                    bVar3 = new g.b(g.b.a.C0535b.a);
                }
                return com.vk.channels.impl.comments.g.a(gVar, s, null, bVar3, false, 2);
        }
    }

    public /* synthetic */ m70(int i, gzs gzsVar, izs izsVar) {
        this.d = gzsVar;
        this.e = izsVar;
        this.c = i;
    }
}

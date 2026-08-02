package xsna;

import com.vk.dto.common.id.UserId;
import xsna.cbh;
import xsna.xrh;

/* compiled from: CommunityHeaderLiteItemsFactory.kt */
/* loaded from: classes5.dex */
public final class m3h extends d4h {
    public final cbh.a s;
    public final n3h t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m3h(aph aphVar) {
        super(r0.a, r0.c, r0.b, r0.e, r0.d, r0.f, r0.g, r0.h, r0.i, r0.j, r0.k);
        bph bphVar = aphVar.a;
        zoh zohVar = aphVar.b;
        this.s = zohVar.a;
        this.t = zohVar.b;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.d4h
    public final we6 d(s4h s4hVar) {
        boolean z = s4hVar instanceof btg;
        ynh ynhVar = this.g;
        if (z) {
            return new atg((btg) s4hVar, ynhVar.e());
        }
        if (s4hVar instanceof fxg) {
            return new exg((fxg) s4hVar);
        }
        boolean z2 = s4hVar instanceof l3h;
        o3h o3hVar = this.h;
        if (z2) {
            l3h l3hVar = (l3h) s4hVar;
            xrh a = o3hVar != null ? o3hVar.a() : null;
            return new cbh(l3hVar, a instanceof xrh.d ? (xrh.d) a : null, this.n, this.s, ynhVar.d(), this.k, this.l);
        }
        if (!(s4hVar instanceof d9h)) {
            if (s4hVar instanceof i6h) {
                return new h6h((i6h) s4hVar, ynhVar.e(), new go1(this, 27), new dof(this, 7), this.j);
            }
            return null;
        }
        d9h d9hVar = (d9h) s4hVar;
        h7v d = ynhVar.d();
        xrh a2 = o3hVar != null ? o3hVar.a() : null;
        xrh.d dVar = a2 instanceof xrh.d ? (xrh.d) a2 : null;
        UserId userId = d9hVar.b.b;
        n3h n3hVar = this.t;
        j8h j8hVar = new j8h(d9hVar, d, dVar, this.n, userId, n3hVar.a, n3hVar.b, this.j, this.k, this.l, (wvw) ynhVar.K0.getValue(), this.i);
        j8hVar.d = iah0.a(12);
        return j8hVar;
    }
}

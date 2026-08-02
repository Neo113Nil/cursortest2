package defpackage;

import defpackage.t8i;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryCommentRequirementType;

/* loaded from: classes5.dex */
public abstract class e9i extends ad5 {
    public final b8r A;
    public final ymi B;
    public final w15 C;
    public final r0 D;
    public final j9i x;
    public final pwy0 y;
    public final zch z;

    public e9i(j9i j9iVar, pwy0 pwy0Var, zch zchVar, b8r b8rVar, ymi ymiVar, w15 w15Var) {
        super(h9i.class);
        this.x = j9iVar;
        this.y = pwy0Var;
        this.z = zchVar;
        this.A = b8rVar;
        this.B = ymiVar;
        this.C = w15Var;
        this.D = bvf0.c(new oex0(0));
    }

    public final gl Kg() {
        String str;
        oex0 oex0Var = (oex0) this.D.getValue();
        if (oex0Var.b && (str = oex0Var.a) != null && !evu0.J(str)) {
            DeliveryCommentRequirementType deliveryCommentRequirementType = DeliveryCommentRequirementType.COURIER;
            String str2 = oex0Var.a;
            j9i j9iVar = this.x;
            kzo e = j9iVar.a.e(str2);
            int[] iArr = i9i.a;
            if (iArr[deliveryCommentRequirementType.ordinal()] == 1) {
                String str3 = e != null ? (String) e.c : "";
                if (iArr[deliveryCommentRequirementType.ordinal()] != 1) {
                    w511.b();
                    return null;
                }
                String str4 = ((t8i.a) j9iVar.b.b.a.getValue()).a;
                if (iArr[deliveryCommentRequirementType.ordinal()] != 1) {
                    w511.b();
                    return null;
                }
                boolean z = str4 == null || evu0.J(str4);
                gl glVar = new gl();
                glVar.x = deliveryCommentRequirementType;
                glVar.b = str2;
                glVar.c = str3;
                glVar.a = !z;
                glVar.w = str4;
                return glVar;
            }
            w511.b();
        }
        return null;
    }
}

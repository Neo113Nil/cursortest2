package defpackage;

import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryCommentRequirementType;

/* loaded from: classes5.dex */
public final class j9i {
    public final l8i a;
    public final t8i b;

    public j9i(l8i l8iVar, t8i t8iVar) {
        this.a = l8iVar;
        this.b = t8iVar;
    }

    public final qzh a(pzh pzhVar, String str, boolean z, boolean z2) {
        String str2;
        kzo e = this.a.e(str);
        boolean z3 = false;
        boolean z4 = z && e != null;
        DeliveryCommentRequirementType deliveryCommentRequirementType = pzhVar.a;
        int[] iArr = i9i.a;
        String str3 = null;
        if (iArr[deliveryCommentRequirementType.ordinal()] != 1) {
            w511.b();
            return null;
        }
        if (e == null) {
            str2 = "";
        } else {
            if (iArr[pzhVar.a.ordinal()] != 1) {
                w511.b();
                return null;
            }
            str2 = (String) e.c;
        }
        String str4 = pzhVar.b;
        if (str4 != null) {
            str3 = str4;
        } else if (e != null) {
            str3 = (String) e.w;
        }
        if (z4 && !evu0.J(str2)) {
            z3 = true;
        }
        return new qzh(z3, z2, str2, str3);
    }
}

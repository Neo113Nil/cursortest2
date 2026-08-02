package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.c;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldVisibility;

/* loaded from: classes5.dex */
public final /* synthetic */ class jt0 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;

    public /* synthetic */ jt0(mv60 mv60Var, boolean z, boolean z2) {
        this.w = mv60Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                j7l0 j7l0Var = (j7l0) obj2;
                iyq iyqVar = (iyq) obj;
                return ((iyqVar instanceof byq) && z) ? FieldVisibility.GONE : (j7l0Var == null || !j7l0Var.g.contains(iyqVar)) ? !z2 ? FieldVisibility.INVISIBLE : FieldVisibility.VISIBLE : FieldVisibility.GONE;
            default:
                mnq0 mnq0Var = (mnq0) obj;
                long a = ((mv60) obj2).a();
                mnq0Var.a(qkq0.a, new pkq0(z2 ? Handle.SelectionStart : Handle.SelectionEnd, a, z ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (9223372034707292159L & a) != 9205357640488583168L));
                return zy11.a;
        }
    }

    public /* synthetic */ jt0(c cVar, j7l0 j7l0Var, boolean z, boolean z2) {
        this.w = j7l0Var;
        this.b = z;
        this.c = z2;
    }
}

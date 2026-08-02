package xsna;

import android.os.Parcelable;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.PickerItem;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.fja0;
import xsna.hja0;

/* compiled from: PickingReducer.kt */
/* loaded from: classes17.dex */
public final class gja0 extends dm50<ija0, fja0, hja0> {
    @Override // xsna.dm50
    public final hja0 c(hja0 hja0Var, fja0 fja0Var) {
        hja0 hja0Var2 = hja0Var;
        fja0 fja0Var2 = fja0Var;
        if (fja0Var2 instanceof fja0.a) {
            return new hja0.b(hg10.r(((fja0.a) fja0Var2).b));
        }
        if (!(fja0Var2 instanceof fja0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(hja0Var2 instanceof hja0.b)) {
            return hja0Var2;
        }
        xow<PickerItem> xowVar = ((hja0.b) hja0Var2).b;
        ArrayList arrayList = new ArrayList(c5g.u(xowVar, 10));
        for (Parcelable parcelable : xowVar) {
            PickerItem.User user = parcelable instanceof PickerItem.User ? (PickerItem.User) parcelable : null;
            UserId userId = user != null ? user.e : null;
            fja0.b bVar = (fja0.b) fja0Var2;
            if (epx.f(userId, bVar.b)) {
                parcelable = bVar.c;
            }
            arrayList.add(parcelable);
        }
        return new hja0.b(hg10.r(arrayList));
    }

    @Override // xsna.dm50
    public final ija0 d() {
        return new ija0(e(new wx30(5)), e(new l140(7)));
    }

    @Override // xsna.dm50
    public final void h(hja0 hja0Var, ija0 ija0Var) {
        hja0 hja0Var2 = hja0Var;
        ija0 ija0Var2 = ija0Var;
        if (hja0Var2.equals(hja0.a.b)) {
            return;
        }
        if (!(hja0Var2 instanceof hja0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        f(ija0Var2.b, hja0Var2);
    }
}

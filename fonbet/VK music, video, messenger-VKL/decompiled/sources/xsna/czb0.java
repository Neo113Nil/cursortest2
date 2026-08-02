package xsna;

import android.graphics.drawable.Drawable;
import com.vk.core.ui.utils.ItemType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PopupVc.kt */
/* loaded from: classes2.dex */
public final class czb0 {
    public final /* synthetic */ apj0 a;

    public czb0(apj0 apj0Var) {
        this.a = apj0Var;
    }

    public final void a(List<jwb0<Object>> list) {
        List<jwb0<Object>> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            jwb0 jwb0Var = (jwb0) obj;
            int i3 = jwb0Var.e;
            Drawable drawable = jwb0Var.c;
            int i4 = jwb0Var.b;
            CharSequence charSequence = jwb0Var.a;
            boolean z = jwb0Var.h;
            Integer num = jwb0Var.d;
            cpj0 cpj0Var = jwb0Var.i;
            arrayList.add(new brj0(i, i3, drawable, i4, charSequence, z, false, cpj0Var != null ? ItemType.CUSTOM : ItemType.DEFAULT, 0, num, null, cpj0Var, null, jwb0Var, 55968));
            i = i2;
        }
        apj0 apj0Var = this.a;
        apj0Var.c = arrayList;
        apj0Var.notifyDataSetChanged();
    }
}

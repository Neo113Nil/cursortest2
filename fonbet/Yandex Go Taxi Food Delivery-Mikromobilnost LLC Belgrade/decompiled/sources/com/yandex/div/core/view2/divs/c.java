package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivGestureListener;
import defpackage.aw5;
import defpackage.f5k;
import defpackage.g5k;
import defpackage.h090;
import defpackage.rvo;
import defpackage.sls;
import defpackage.tls;
import defpackage.v3k;
import defpackage.y4k;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    public final com.yandex.div.core.c a;
    public final y4k b;
    public final boolean c;
    public final boolean d;
    public final tls e = DivActionBinder$passToParentLongClickListener$1.b;

    public c(com.yandex.div.core.c cVar, y4k y4kVar, boolean z, boolean z2) {
        this.a = cVar;
        this.b = y4kVar;
        this.c = z;
        this.d = z2;
    }

    public static void b(final View view, DivGestureListener divGestureListener, final View.OnClickListener onClickListener) {
        if (divGestureListener.getOnDoubleTapListener() != null) {
            divGestureListener.setOnSingleTapListener(new sls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$setTapListener$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    onClickListener.onClick(view);
                    return zy11.a;
                }
            });
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void a(aw5 aw5Var, View view, List list) {
        Object obj;
        List list2;
        rvo rvoVar = aw5Var.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v3k v3kVar = (v3k) obj;
            if (((Boolean) v3kVar.b.a(rvoVar)).booleanValue() && (list2 = v3kVar.e) != null && !list2.isEmpty()) {
                break;
            }
        }
        v3k v3kVar2 = (v3k) obj;
        if (v3kVar2 == null) {
            this.a.d(aw5Var, view, list, "click");
            return;
        }
        List list3 = v3kVar2.e;
        if (list3 == null) {
            return;
        }
        Div2View div2View = aw5Var.a;
        view.getContext();
        h090 h090Var = new h090(view);
        h090Var.b(new f5k(this, aw5Var, list3));
        div2View.clearSubscriptions();
        div2View.subscribe(new g5k(h090Var));
        this.b.b(v3kVar2, rvoVar);
        h090Var.a().onClick(view);
    }
}

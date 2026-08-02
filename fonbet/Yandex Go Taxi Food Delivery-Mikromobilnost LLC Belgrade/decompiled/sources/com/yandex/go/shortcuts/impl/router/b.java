package com.yandex.go.shortcuts.impl.router;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.dto.response.Action$ScootersQrScan;
import defpackage.d221;
import defpackage.eor;
import defpackage.epo0;
import defpackage.fwz0;
import defpackage.gwz0;
import defpackage.h3y;
import defpackage.hwz0;
import defpackage.i4s0;
import defpackage.ike;
import defpackage.jst;
import defpackage.ku4;
import defpackage.kyh0;
import defpackage.nac;
import defpackage.o0s0;
import defpackage.obv;
import defpackage.pzt0;
import defpackage.qwn;
import defpackage.r330;
import defpackage.rwz0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tyr0;
import defpackage.wdz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonSingleComponent;

/* loaded from: classes13.dex */
public final class b {
    public final h3y a;
    public final hwz0 b;
    public final Context c;
    public final tse d;
    public final wdz e;
    public final ArrayList f = new ArrayList();
    public pzt0 g;

    public b(h3y h3yVar, hwz0 hwz0Var, Context context, tse tseVar, wdz wdzVar) {
        this.a = h3yVar;
        this.b = hwz0Var;
        this.c = context;
        this.d = tseVar;
        this.e = wdzVar;
    }

    public final void a() {
        r330 r330Var = (r330) this.a.get();
        ArrayList arrayList = this.f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r330Var.removeFloatButton((eor) it.next());
        }
        this.b.c.clear();
        arrayList.clear();
    }

    public final void b(ike ikeVar, List list, i4s0 i4s0Var) {
        List list2 = list;
        h3y h3yVar = this.a;
        r330 r330Var = (r330) h3yVar.get();
        if (h3yVar.get() instanceof qwn) {
            jst.e.getClass();
            return;
        }
        if (list2.isEmpty()) {
            a();
        }
        o0s0 o0s0Var = new o0s0(this, i4s0Var);
        int size = list2.size();
        int i = 0;
        while (i < size) {
            gwz0 gwz0Var = (gwz0) list2.get(i);
            if (!this.b.c.contains(gwz0Var.a) && !(gwz0Var instanceof d221)) {
                ku4 ku4Var = new ku4(this, list2, gwz0Var, r330Var, 3);
                boolean z = gwz0Var instanceof rwz0;
                String str = "";
                b bVar = o0s0Var.b;
                if (z) {
                    rwz0 rwz0Var = (rwz0) gwz0Var;
                    FloatButtonSingleComponent floatButtonSingleComponent = new FloatButtonSingleComponent(bVar.c, null, 0, 6, null);
                    o0s0Var.a(floatButtonSingleComponent);
                    tje.N(ikeVar, null, null, new ShortcutModalTopItemsRouter$TopItemFactory$buildTopRoundItem$1(floatButtonSingleComponent, o0s0Var.b, rwz0Var, ku4Var, null), 3);
                    floatButtonSingleComponent.setDebounceClickListener(new epo0(21, o0s0Var, rwz0Var));
                    if (rwz0Var.b instanceof Action$ScootersQrScan) {
                        str = floatButtonSingleComponent.getContext().getString(kyh0.scooters_qr_content_description);
                    }
                    floatButtonSingleComponent.setContentDescription(str);
                } else if (gwz0Var instanceof fwz0) {
                    fwz0 fwz0Var = (fwz0) gwz0Var;
                    FloatButtonIconComponent floatButtonIconComponent = new FloatButtonIconComponent(bVar.c, null, 0, 0, 14, null);
                    hwz0 hwz0Var = bVar.b;
                    AppCompatImageView icon = floatButtonIconComponent.getIcon();
                    String str2 = fwz0Var.f;
                    nac nacVar = (nac) hwz0Var.b.a(icon);
                    nacVar.h = new tyr0(icon, 1);
                    nacVar.b(new obv(str2, null, 6, 0));
                    floatButtonIconComponent.setDebounceClickListener(new epo0(20, o0s0Var, fwz0Var));
                    o0s0Var.a(floatButtonIconComponent);
                    ku4Var.accept(floatButtonIconComponent);
                    if (fwz0Var.b instanceof Action$ScootersQrScan) {
                        str = floatButtonIconComponent.getContext().getString(kyh0.scooters_qr_content_description);
                    }
                    floatButtonIconComponent.setContentDescription(str);
                    i++;
                    list2 = list;
                }
            }
            i++;
            list2 = list;
        }
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = tje.N(this.d, null, null, new ShortcutModalTopItemsRouter$observeTopItemsVisibility$$inlined$safeCollectIn$1(this.e.m(), null, this), 3);
    }
}

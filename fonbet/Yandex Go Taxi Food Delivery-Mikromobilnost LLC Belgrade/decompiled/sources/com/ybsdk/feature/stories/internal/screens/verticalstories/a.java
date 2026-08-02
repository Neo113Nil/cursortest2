package com.ybsdk.feature.stories.internal.screens.verticalstories;

import android.content.Context;
import com.ybsdk.core.stories.CloseButtonVisibility;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.core.stories.ui.CommunicationFullscreenTitlePaddingMode;
import com.ybsdk.feature.stories.internal.screens.verticalstories.b;
import defpackage.dsc;
import defpackage.ev31;
import defpackage.og31;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.scc;
import defpackage.smu0;
import defpackage.t8j0;
import defpackage.tcc;
import defpackage.tou0;
import defpackage.u8j0;
import defpackage.vjf0;
import defpackage.vou0;
import defpackage.w511;
import defpackage.wmu0;
import defpackage.wou0;
import defpackage.xg31;
import defpackage.xlu0;
import defpackage.yg31;
import defpackage.ylu0;
import defpackage.zg31;
import defpackage.zlu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements ev31 {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        Iterator it;
        Iterator it2;
        String str;
        zlu0 xlu0Var;
        b bVar = (b) obj;
        int i = bVar.b;
        u8j0 u8j0Var = bVar.a;
        if (u8j0Var instanceof t8j0) {
            return zg31.a;
        }
        if (u8j0Var instanceof s8j0) {
            return new yg31(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        if (!(u8j0Var instanceof r8j0)) {
            w511.b();
            return null;
        }
        List list = ((og31) ((r8j0) u8j0Var).a).a;
        List list2 = list;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it3 = list2.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            smu0 smu0Var = (smu0) next;
            int i5 = (i3 == i && i == bVar.d) ? bVar.e : 0;
            String str2 = smu0Var.a;
            List list3 = smu0Var.b;
            List list4 = list3;
            ArrayList arrayList2 = new ArrayList(tcc.n(list4, i2));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                wou0 wou0Var = (wou0) it4.next();
                if (wou0Var instanceof tou0) {
                    tou0 tou0Var = (tou0) wou0Var;
                    it = it3;
                    it2 = it4;
                    str = str2;
                    xlu0Var = new ylu0(tou0Var.d, tou0Var.g, tou0Var.e, tou0Var.c);
                } else {
                    it = it3;
                    it2 = it4;
                    str = str2;
                    if (!(wou0Var instanceof vou0)) {
                        w511.b();
                        return null;
                    }
                    vou0 vou0Var = (vou0) wou0Var;
                    xlu0Var = new xlu0(dsc.b(vou0Var, this.a, CommunicationFullscreenTitlePaddingMode.MULTIPLE, null, 12), vou0Var.f, vou0Var.k, vou0Var.c);
                }
                arrayList2.add(xlu0Var);
                it4 = it2;
                it3 = it;
                str2 = str;
            }
            Iterator it5 = it3;
            String str3 = str2;
            b.a aVar = bVar.f;
            StoriesComponentView.a.C0090a c0090a = new StoriesComponentView.a.C0090a(aVar.b, aVar.a);
            CloseButtonVisibility closeButtonVisibility = CloseButtonVisibility.INVISIBLE;
            boolean z = i3 == i;
            vjf0 vjf0Var = smu0Var.c;
            StoriesComponentView.a aVar2 = new StoriesComponentView.a(i5, (List) arrayList2, c0090a, closeButtonVisibility, false, z, new StoriesComponentView.a.b(vjf0Var != null ? vjf0Var.a : null, vjf0Var != null ? vjf0Var.b : null), 16);
            wou0 wou0Var2 = (wou0) kotlin.collections.a.S(i5, list3);
            arrayList.add(new wmu0(str3, i3, aVar2, wou0Var2 != null ? wou0Var2.b : null, i3 == i));
            i3 = i4;
            it3 = it5;
            i2 = 10;
        }
        smu0 smu0Var2 = (smu0) kotlin.collections.a.S(i, list);
        return new xg31(arrayList, smu0Var2 != null ? smu0Var2.d : null);
    }
}

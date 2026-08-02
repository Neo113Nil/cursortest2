package com.yandex.go.flex.main_screen.presentation.actions;

import com.yandex.go.flex.main_screen.presentation.actions.OpenInfoListAction;
import com.yandex.go.shortcuts.dto.response.ShortcutInfoListItem;
import defpackage.a3g;
import defpackage.dw;
import defpackage.hxx;
import defpackage.jzr0;
import defpackage.kr;
import defpackage.m950;
import defpackage.n6u;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class c implements dw {
    public final a3g a;
    public final oep0 b;

    public c(a3g a3gVar, oep0 oep0Var) {
        this.a = a3gVar;
        this.b = oep0Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        m950 m950Var = (m950) this.a.get();
        List<OpenInfoListAction.InfoItem> list = ((OpenInfoListAction) krVar).a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (OpenInfoListAction.InfoItem infoItem : list) {
            arrayList.add(new ShortcutInfoListItem(infoItem.a, infoItem.b));
        }
        ((pep0) this.b).f(m950Var, new jzr0(arrayList), hxx.a);
    }
}

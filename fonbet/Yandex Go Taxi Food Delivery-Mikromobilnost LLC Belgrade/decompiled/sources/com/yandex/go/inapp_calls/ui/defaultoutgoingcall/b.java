package com.yandex.go.inapp_calls.ui.defaultoutgoingcall;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.c8h;
import defpackage.dfs0;
import defpackage.kr31;
import defpackage.nwe;
import defpackage.tls;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes12.dex */
public final class b extends dfs0 {
    public final tls f;

    public b(LinearLayout linearLayout, tls tlsVar) {
        super(linearLayout, DefaultCallTypeOptionsAdapter$1.b);
        this.f = tlsVar;
    }

    @Override // defpackage.dfs0
    public final kr31 a(ViewGroup viewGroup, Object obj) {
        c8h c8hVar = (c8h) obj;
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(viewGroup.getContext(), null, 0, 6, null);
        nwe nweVar = new nwe(this, listItemCheckComponent);
        nweVar.f = c8hVar;
        listItemCheckComponent.setTitle(c8hVar.b);
        listItemCheckComponent.setChecked(c8hVar.c);
        return nweVar;
    }
}

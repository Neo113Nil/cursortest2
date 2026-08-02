package com.yandex.go.navigator.ui;

import android.view.ViewGroup;
import defpackage.dfs0;
import defpackage.kr31;
import defpackage.tm6;
import defpackage.um6;
import defpackage.vl6;
import defpackage.xng0;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public abstract class a extends dfs0 {
    public final int f;
    public final int g;
    public vl6 h;

    public a(BubbleGridView bubbleGridView) {
        super(bubbleGridView, BubbleGridAdapter$1.b);
        this.f = xng0.controlMain;
        this.g = xng0.textOnControl;
    }

    @Override // defpackage.dfs0
    public final kr31 a(ViewGroup viewGroup, Object obj) {
        tm6 tm6Var = new tm6(this, new ButtonComponent(viewGroup.getContext(), null, 0, 6, null), c(), d());
        tm6Var.c((um6) obj);
        return tm6Var;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }
}

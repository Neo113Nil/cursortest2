package com.yandex.go.shortcuts.impl.view.adapter;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.egz;
import java.util.List;

/* loaded from: classes13.dex */
public final class m extends RecyclerView.g {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        n nVar = this.a;
        PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator = nVar.W;
        List list = n.e0;
        personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator.setSelected(egz.C(recyclerView, nVar.U) % nVar.Z);
    }
}

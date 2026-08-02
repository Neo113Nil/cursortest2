package com.yandex.go.tariffcard.ui;

import android.view.View;
import defpackage.amp0;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.ho4;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tt2;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.DialogueComponent;

/* loaded from: classes14.dex */
public final class r0 {
    public final tt2 a;
    public final ru.yandex.taxi.summary.promotions.interactor.a b;
    public final ru.yandex.taxi.summary.promotions.repository.e c;
    public final com.yandex.go.taxi.summary.shared.expanded.repository.c d;
    public final DialogueComponent e;
    public final amp0 f;
    public final hbp0 g;

    public r0(tt2 tt2Var, ru.yandex.taxi.summary.promotions.interactor.a aVar, ru.yandex.taxi.summary.promotions.repository.e eVar, com.yandex.go.taxi.summary.shared.expanded.repository.c cVar, DialogueComponent dialogueComponent, int i) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = eVar;
        this.d = cVar;
        this.e = dialogueComponent;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.f = new amp0(dialogueComponent, ho4.q((View) rp31.d(dialogueComponent, i)));
        this.g = new hbp0(new czo0(14), "", null);
        dialogueComponent.setAnimationType(DialogueComponent.AnimationType.CONTENT_SLIDE_BOTTOM);
    }

    public final void a() {
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new TariffPagerDialogDelegate$attach$1(this, null), 3);
    }
}

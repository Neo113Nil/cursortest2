package com.yandex.go.pickup_from_photo.navigation;

import defpackage.abe0;
import defpackage.pgd;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class a implements abe0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pgd b;

    public /* synthetic */ a(pgd pgdVar, int i) {
        this.a = i;
        this.b = pgdVar;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.abe0
    public final void b0(String str) {
        int i = this.a;
        pgd pgdVar = this.b;
        switch (i) {
            case 0:
                b bVar = (b) pgdVar;
                tje.N(bVar.o(), null, null, new PickupFromPhotoClarifyPointRouter$InnerNavigator$onPorchButtonClicked$1$onEntranceNumberDone$1(bVar, str, null), 3);
                break;
            default:
                d dVar = (d) pgdVar;
                tje.N(dVar.o(), null, null, new RecognitionSuccessScreenRouter$InnerNavigator$onPorchButtonClicked$1$onEntranceNumberDone$1(dVar, str, null), 3);
                break;
        }
    }
}

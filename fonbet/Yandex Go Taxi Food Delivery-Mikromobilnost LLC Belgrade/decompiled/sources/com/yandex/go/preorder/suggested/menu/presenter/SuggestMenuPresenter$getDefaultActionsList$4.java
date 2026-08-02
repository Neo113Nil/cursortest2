package com.yandex.go.preorder.suggested.menu.presenter;

import com.yandex.go.address.models.add.BackNavigationStrategy;
import defpackage.bvv;
import defpackage.hxx;
import defpackage.ie0;
import defpackage.m950;
import defpackage.pep0;
import defpackage.sls;
import defpackage.xe0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.analytics.Events$SuggestMenu$ActionType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class SuggestMenuPresenter$getDefaultActionsList$4 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        bVar.getClass();
        bVar.Tg(Events$SuggestMenu$ActionType.SAVE_TO_FAVORITES);
        bvv bvvVar = new bvv(bVar.I.B(), bVar.I, xe0.b, null, null, false, BackNavigationStrategy.SUGGESTS, 120);
        com.yandex.go.preorder.suggested.menu.router.a aVar = (com.yandex.go.preorder.suggested.menu.router.a) bVar.x.b;
        ((pep0) aVar.I).f((m950) aVar.K.get(), new ie0(bvvVar, aVar.M), hxx.a);
        return zy11.a;
    }
}

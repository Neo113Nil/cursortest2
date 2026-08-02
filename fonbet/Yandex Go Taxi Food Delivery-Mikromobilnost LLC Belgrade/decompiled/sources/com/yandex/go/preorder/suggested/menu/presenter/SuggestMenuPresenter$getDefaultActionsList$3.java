package com.yandex.go.preorder.suggested.menu.presenter;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.analytics.Events$SuggestMenu$ActionType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class SuggestMenuPresenter$getDefaultActionsList$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        bVar.F.a.a = true;
        bVar.Tg(Events$SuggestMenu$ActionType.SELECT);
        return zy11.a;
    }
}

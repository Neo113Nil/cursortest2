package com.yandex.go.preorder.suggested.menu.presenter;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.analytics.Events$SuggestMenu$ActionType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class SuggestMenuPresenter$getDefaultActionsList$5 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        bVar.getClass();
        bVar.Tg(Events$SuggestMenu$ActionType.SELECT_ON_MAP);
        return zy11.a;
    }
}

package com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.delegates;

import android.view.View;
import defpackage.cvw;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.utils.TouchDelegateComposite;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$1 extends FunctionReferenceImpl implements wls {
    final /* synthetic */ TouchDelegateComposite $compositeTouchDelegate;
    final /* synthetic */ int $touchBoundBottom;
    final /* synthetic */ Ref$IntRef $touchBoundRight;
    final /* synthetic */ int $touchBoundTop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$1(Ref$IntRef ref$IntRef, int i, int i2, TouchDelegateComposite touchDelegateComposite) {
        super(2, 0, cvw.class, "consumeRightButtonTouchBounds", "calculateExpandedStateDelegate$consumeRightButtonTouchBounds(Lkotlin/jvm/internal/Ref$IntRef;IILru/yandex/taxi/utils/TouchDelegateComposite;Landroid/view/View;I)V");
        this.$touchBoundRight = ref$IntRef;
        this.$touchBoundTop = i;
        this.$touchBoundBottom = i2;
        this.$compositeTouchDelegate = touchDelegateComposite;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        SuperAppMapSearchbarViewTouchDelegate.calculateExpandedStateDelegate$consumeRightButtonTouchBounds(this.$touchBoundRight, this.$touchBoundTop, this.$touchBoundBottom, this.$compositeTouchDelegate, (View) obj, intValue);
        return zy11.a;
    }
}

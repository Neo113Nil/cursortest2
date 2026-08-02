package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview.DivCustomActionHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;

/* loaded from: classes12.dex */
public final class hu8 extends kz4 {
    public hu8() {
        super(gu8.Companion.serializer());
    }

    @Override // defpackage.kz4
    public final void a(DivCustomActionHandlerImpl divCustomActionHandlerImpl, View view, BduiExpressionResolverImpl bduiExpressionResolverImpl) {
        ((CaretView) view).applyExpressionResolver(bduiExpressionResolverImpl);
    }

    @Override // defpackage.kz4
    public final View b(Context context, Object obj) {
        return new CaretView(context, (gu8) obj);
    }
}

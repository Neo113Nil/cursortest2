package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview.DivCustomActionHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.qrcode.QrCodeView;

/* loaded from: classes12.dex */
public final class i6g0 extends kz4 {
    public i6g0() {
        super(y5g0.Companion.serializer());
    }

    @Override // defpackage.kz4
    public final void a(DivCustomActionHandlerImpl divCustomActionHandlerImpl, View view, BduiExpressionResolverImpl bduiExpressionResolverImpl) {
        ((QrCodeView) view).applyExpressionResolver(bduiExpressionResolverImpl);
    }

    @Override // defpackage.kz4
    public final View b(Context context, Object obj) {
        return new QrCodeView(context, (y5g0) obj);
    }
}

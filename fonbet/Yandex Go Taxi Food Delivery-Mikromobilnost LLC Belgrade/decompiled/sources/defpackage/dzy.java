package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview.DivCustomActionHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.loader.LoaderView;

/* loaded from: classes12.dex */
public final class dzy extends kz4 {
    public dzy() {
        super(czy.Companion.serializer());
    }

    @Override // defpackage.kz4
    public final void a(DivCustomActionHandlerImpl divCustomActionHandlerImpl, View view, BduiExpressionResolverImpl bduiExpressionResolverImpl) {
        ((LoaderView) view).applyExpressionResolver(bduiExpressionResolverImpl);
    }

    @Override // defpackage.kz4
    public final View b(Context context, Object obj) {
        return new LoaderView(context, (czy) obj);
    }
}

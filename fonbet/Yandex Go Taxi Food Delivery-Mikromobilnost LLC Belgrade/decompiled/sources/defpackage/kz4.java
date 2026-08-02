package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview.DivCustomActionHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public abstract class kz4 {
    public final KSerializer a;
    public final zcx b = tje.a(sbx.d, new at3(22));

    public kz4(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    public abstract void a(DivCustomActionHandlerImpl divCustomActionHandlerImpl, View view, BduiExpressionResolverImpl bduiExpressionResolverImpl);

    public abstract View b(Context context, Object obj);
}

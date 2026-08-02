package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview.DivCustomActionHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.CustomWebView;

/* loaded from: classes12.dex */
public final class ph8 extends kz4 {
    public final /* synthetic */ int c = 1;
    public final zh5 d;
    public final Object e;

    public ph8(zh5 zh5Var, ch8 ch8Var) {
        super(ig8.Companion.serializer());
        this.d = zh5Var;
        this.e = ch8Var;
    }

    @Override // defpackage.kz4
    public final void a(DivCustomActionHandlerImpl divCustomActionHandlerImpl, View view, BduiExpressionResolverImpl bduiExpressionResolverImpl) {
        switch (this.c) {
            case 0:
                CardInputMainView cardInputMainView = (CardInputMainView) view;
                cardInputMainView.setActionHandler(divCustomActionHandlerImpl);
                cardInputMainView.setExpressionResolver(bduiExpressionResolverImpl);
                break;
            default:
                ((CustomWebView) view).bind(divCustomActionHandlerImpl, bduiExpressionResolverImpl);
                break;
        }
    }

    @Override // defpackage.kz4
    public final View b(Context context, Object obj) {
        int i = this.c;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ig8 ig8Var = (ig8) obj;
                if (ig8Var == null) {
                    ny61.g("CardInputCustomProps must be not null");
                    return null;
                }
                ch8 ch8Var = (ch8) obj2;
                return new CardInputMainView(ch8Var.a, context, ch8Var.b, ig8Var, this.d);
            default:
                vm41 vm41Var = (vm41) obj2;
                CustomWebView customWebView = new CustomWebView(context, this.d, vm41Var, (jo41) obj);
                vm41Var.getClass();
                return customWebView;
        }
    }

    public ph8(vm41 vm41Var, zh5 zh5Var) {
        super(jo41.Companion.serializer());
        this.e = vm41Var;
        this.d = zh5Var;
    }
}

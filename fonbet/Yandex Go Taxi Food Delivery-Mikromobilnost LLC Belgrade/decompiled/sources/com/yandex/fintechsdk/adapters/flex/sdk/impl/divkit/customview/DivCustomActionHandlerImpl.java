package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview;

import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import defpackage.ilk;
import defpackage.klk;
import defpackage.ngd0;
import defpackage.v3k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/customview/DivCustomActionHandlerImpl;", "Lklk;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "<init>", "(Lcom/yandex/div/core/view2/Div2View;)V", "Lilk;", "action", "", "handleAction", "(Lilk;)Z", "Lcom/yandex/div/core/view2/Div2View;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivCustomActionHandlerImpl implements klk {
    private final Div2View divView;

    public DivCustomActionHandlerImpl(Div2View div2View) {
        this.divView = div2View;
    }

    @Override // defpackage.klk
    public boolean handleAction(ilk action) {
        return Div2View.handleActionWithResult$default(this.divView, new v3k(ngd0.m(action.a), null, ngd0.m(Uri.parse(action.b)), 1019), null, null, 6, null);
    }
}

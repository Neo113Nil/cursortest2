package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager;

import com.yandex.go.flex.common.facade.routers.views.EmbeddedFlexView;
import defpackage.a941;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class MainSidePagerIntegration$bind$1$1 extends FunctionReferenceImpl implements sls {
    public MainSidePagerIntegration$bind$1$1(Object obj) {
        super(0, obj, a941.class, "isContentScrollAtBottom", "isContentScrollAtBottom()Z", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        EmbeddedFlexView embeddedFlexView = ((a941) this.receiver).a.k;
        return Boolean.valueOf(embeddedFlexView != null ? embeddedFlexView.isContentScrollAtBottom() : true);
    }
}

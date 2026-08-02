package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CommunitySettingsActionsModalBottomSheet.kt */
@b6l(c = "com.vk.profile.community.impl.ui.view.CommunitySettingsActionsModalBottomSheet", f = "CommunitySettingsActionsModalBottomSheet.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234}, m = "handleCommunityMessages")
/* loaded from: classes5.dex */
public final class v1i extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z1i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1i(z1i z1iVar, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.this$0 = z1iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return z1i.a(this.this$0, null, this);
    }
}

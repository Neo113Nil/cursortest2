package defpackage;

import com.yandex.go.flex.common.actions.create_order.SendOrderDraftAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenFlexScreenAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenSelectPaymentMethodScreenAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class how implements nu {
    public final /* synthetic */ int a;
    public final nt0 b;
    public final mu c;

    public how(nt0 nt0Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = nt0Var;
                this.c = new mu("OpenSelectPaymentMethodScreen", qoi0.a(IntercityOpenSelectPaymentMethodScreenAction.class), new ojw(3), a.b(LazyThreadSafetyMode.NONE, new tzt(28, this)), EmptyList.a, false);
                break;
            case 2:
                this.b = nt0Var;
                this.c = new mu("OpenShuttleClarifyPointAction", qoi0.a(IntercityOpenShuttleClarifyPointAction.class), new ojw(10), a.b(LazyThreadSafetyMode.NONE, new tzt(29, this)), EmptyList.a, false);
                break;
            case 3:
                this.b = nt0Var;
                this.c = new mu("ReloadLabeledSectionsAction", qoi0.a(bti0.class), new ojw(11), a.b(LazyThreadSafetyMode.NONE, new yow(0, this)), EmptyList.a, true);
                break;
            case 4:
                this.b = nt0Var;
                this.c = new mu("SendOrderDraftAction", qoi0.a(SendOrderDraftAction.class), new ojw(13), a.b(LazyThreadSafetyMode.NONE, new yow(2, this)), EmptyList.a, false);
                break;
            default:
                this.b = nt0Var;
                this.c = new mu("OpenFlexScreenAction", qoi0.a(IntercityOpenFlexScreenAction.class), new ojw(2), a.b(LazyThreadSafetyMode.NONE, new tzt(27, this)), EmptyList.a, false);
                break;
        }
    }

    @Override // defpackage.nu
    public final mu create() {
        switch (this.a) {
        }
        return this.c;
    }
}

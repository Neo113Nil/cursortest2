package defpackage;

import com.yandex.go.flex.common.actions.create_order.SendOrderDraftAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercitySelectContactAction;
import com.yandex.go.places.flex.container.domain.actions.c;
import defpackage.ak80;
import defpackage.bpw;
import defpackage.m020;
import defpackage.mu;
import defpackage.qoi0;
import defpackage.s210;
import defpackage.t210;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.router.d;

/* loaded from: classes12.dex */
public final class bpw implements nu {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public bpw(if9 if9Var) {
        this.a = 3;
        this.b = if9Var;
        this.c = new mu("SendOrderDraftAction", qoi0.a(SendOrderDraftAction.class), new xiq0(8), a.b(LazyThreadSafetyMode.NONE, new b7p0(12, this)), EmptyList.a, false);
    }

    @Override // defpackage.nu
    public final mu create() {
        switch (this.a) {
            case 0:
                return (mu) this.c;
            case 1:
                return (mu) ((i3y) this.c).getValue();
            case 2:
                return (mu) ((i3y) this.c).getValue();
            default:
                return (mu) this.c;
        }
    }

    public bpw(c cVar) {
        this.a = 2;
        this.b = cVar;
        this.c = a.a(new sls() { // from class: com.yandex.go.places.flex.container.domain.actions.b
            @Override // defpackage.sls
            public final Object invoke() {
                return new mu("PerformOnParentDocumentAction", qoi0.a(PerformOnParentDocumentAction.class), new PerformOnParentDocumentActionDescriptorFactory$actionDescriptor$2$1(0, PerformOnParentDocumentAction.Companion, a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ak80(24, bpw.this)), EmptyList.a, false);
            }
        });
    }

    public bpw(epf epfVar) {
        this.a = 0;
        this.b = epfVar;
        this.c = new mu("IntercitySelectContactAction", qoi0.a(IntercitySelectContactAction.class), new ojw(12), a.b(LazyThreadSafetyMode.NONE, new yow(1, this)), EmptyList.a, false);
    }

    public bpw(d dVar) {
        this.a = 1;
        this.b = dVar;
        this.c = a.a(new sls() { // from class: ru.yandex.taxi.masstransit.router.c
            @Override // defpackage.sls
            public final Object invoke() {
                return new mu("MasstransitExpectedDestinationAction", qoi0.a(t210.class), new MtExpectedDestinationActionDescriptorFactory$actionDescriptor$2$1(0, t210.Companion, s210.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new m020(22, bpw.this)), EmptyList.a, false);
            }
        });
    }
}

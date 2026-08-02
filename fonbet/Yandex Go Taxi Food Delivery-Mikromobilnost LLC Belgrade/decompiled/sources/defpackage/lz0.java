package defpackage;

import com.yandex.go.address.address_map_picker.domain.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class lz0 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ lz0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return c.a(this.b, (pv0) obj, continuation);
            default:
                return c.a(this.b, (pv0) obj, continuation);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new FunctionReferenceImpl(2, this.b, c.class, "onAddressInfoReceived", "onAddressInfoReceived(Lcom/yandex/go/preorder/AddressInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}

package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.add.BackNavigationStrategy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.search.presenter.f;

/* loaded from: classes6.dex */
public final /* synthetic */ class e61 implements t6v0, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.t6v0
    public final void a(Address address) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((f) obj).ah(address);
                break;
            default:
                h6v0 h6v0Var = (h6v0) obj;
                h6v0Var.getClass();
                bvv bvvVar = new bvv(address.B(), address, se0.b, null, null, false, BackNavigationStrategy.NONE, 120);
                ((pep0) h6v0Var.b).f((m950) h6v0Var.e.get(), new ie0(bvvVar, h6v0Var.d), hxx.a);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof t6v0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof t6v0) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(1, (f) this.b, f.class, "pointOnMapClicked", "pointOnMapClicked(Lcom/yandex/go/address/models/Address;)V", 0);
            default:
                return new FunctionReferenceImpl(1, (h6v0) this.b, h6v0.class, "onFavoritesTap", "onFavoritesTap(Lcom/yandex/go/address/models/Address;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}

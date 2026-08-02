package defpackage;

import android.view.View;
import com.yandex.go.address.models.Address;

/* loaded from: classes6.dex */
public final /* synthetic */ class f6v0 implements t6v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f6v0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.t6v0
    public final void a(Address address) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h6v0 h6v0Var = (h6v0) obj;
                ((pep0) h6v0Var.b).f((m950) h6v0Var.f.get(), bff.a, hxx.a);
                break;
            default:
                View view = (View) obj;
                if (view != null) {
                    view.postDelayed(new ce0(view, 19), 300L);
                    break;
                }
                break;
        }
    }
}

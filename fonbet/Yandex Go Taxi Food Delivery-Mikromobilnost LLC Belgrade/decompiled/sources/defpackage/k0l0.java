package defpackage;

import android.view.View;
import com.yandex.go.address.models.Address;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.preorder.summary.solid.o;
import ru.yandex.taxi.preorder.summary.solid.sourcedestination.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class k0l0 implements SourceDestinationComponent.SourceTrailClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k0l0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                act0 act0Var = ((n0l0) obj).i;
                if (act0Var != null) {
                    act0Var.z0();
                    break;
                }
                break;
            default:
                b bVar = (b) obj;
                o oVar = bVar.b;
                Address e = bVar.g.l.e();
                oVar.a(e != null ? e.J1() : null);
                break;
        }
    }
}

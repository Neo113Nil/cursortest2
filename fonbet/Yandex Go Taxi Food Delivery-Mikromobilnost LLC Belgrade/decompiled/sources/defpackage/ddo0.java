package defpackage;

import com.yandex.go.scooters.passes.details.ScootersPassesDetailsModalView;
import java.util.List;

/* loaded from: classes13.dex */
public final class ddo0 implements gdo0 {
    public final /* synthetic */ ScootersPassesDetailsModalView a;

    public ddo0(ScootersPassesDetailsModalView scootersPassesDetailsModalView) {
        this.a = scootersPassesDetailsModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        cdo0 cdo0Var;
        List list = ((ldo0) obj).a;
        cdo0Var = this.a.itemsAdapter;
        cdo0Var.submitList(list, null);
    }
}

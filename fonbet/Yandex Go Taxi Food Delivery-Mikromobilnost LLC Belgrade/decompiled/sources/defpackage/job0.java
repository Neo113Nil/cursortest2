package defpackage;

import com.yandex.go.pickup_from_photo.data.PickupFromPhotoGyroscopeRepository;
import com.yandex.go.pickup_from_photo.domain.c;
import com.yandex.go.pickup_from_photo.domain.f;
import com.yandex.go.pickup_from_photo.experiment.p;
import java.util.LinkedHashSet;

/* loaded from: classes13.dex */
public final class job0 extends ad5 {
    public final f A;
    public final c B;
    public final umb0 C;
    public final PickupFromPhotoGyroscopeRepository D;
    public final p E;
    public pzt0 F;
    public pzt0 G;
    public boolean H;
    public final dob0 x;
    public final ney y;
    public final aob0 z;

    public job0(dob0 dob0Var, ney neyVar, aob0 aob0Var, f fVar, c cVar, umb0 umb0Var, PickupFromPhotoGyroscopeRepository pickupFromPhotoGyroscopeRepository, p pVar) {
        super(znb0.class);
        this.x = dob0Var;
        this.y = neyVar;
        this.z = aob0Var;
        this.A = fVar;
        this.B = cVar;
        this.C = umb0Var;
        this.D = pickupFromPhotoGyroscopeRepository;
        this.E = pVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        Kg(jmb0.a);
        c cVar = this.B;
        cVar.c.c = 0;
        bjb0 bjb0Var = cVar.d.c;
        LinkedHashSet linkedHashSet = bjb0Var.b;
        int size = linkedHashSet.size();
        for (int i = 0; i < size; i++) {
            bjb0Var.a(i).delete();
        }
        linkedHashSet.clear();
        pzt0 pzt0Var = cVar.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cVar.h = null;
        pzt0 pzt0Var2 = cVar.i;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        cVar.i = null;
        this.y.d(this);
    }

    public final void Kg(smb0 smb0Var) {
        this.B.d(smb0Var, this.z);
    }
}

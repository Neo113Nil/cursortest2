package androidx.room;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.lkw0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class RoomDatabase$closeBarrier$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        RoomDatabase roomDatabase = (RoomDatabase) this.receiver;
        ike ikeVar = roomDatabase.a;
        if (ikeVar == null) {
            ikeVar = null;
        }
        bvf0.j(ikeVar, null);
        d dVar = roomDatabase.f;
        if (dVar == null) {
            dVar = null;
        }
        f fVar = dVar.i;
        if (fVar != null) {
            fVar.c();
        }
        i iVar = roomDatabase.e;
        i iVar2 = iVar != null ? iVar : null;
        iVar2.f.close();
        lkw0 lkw0Var = iVar2.g;
        if (lkw0Var != null) {
            lkw0Var.close();
        }
        return zy11.a;
    }
}

package defpackage;

import androidx.room.RoomDatabase;

/* loaded from: classes15.dex */
public final /* synthetic */ class e4r implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoomDatabase b;

    public /* synthetic */ e4r(RoomDatabase roomDatabase, int i) {
        this.a = i;
        this.b = roomDatabase;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        RoomDatabase roomDatabase = this.b;
        switch (i) {
            case 0:
                return (j6w) roomDatabase.j.get(qoi0.a(j6w.class));
            case 1:
                return (euu0) roomDatabase.j.get(qoi0.a(euu0.class));
            case 2:
                return (us10) roomDatabase.j.get(qoi0.a(us10.class));
            case 3:
                return (xsu0) roomDatabase.j.get(qoi0.a(xsu0.class));
            case 4:
                return (dmo) roomDatabase.j.get(qoi0.a(dmo.class));
            case 5:
                return (okf) roomDatabase.j.get(qoi0.a(okf.class));
            case 6:
                return (kas) roomDatabase.j.get(qoi0.a(kas.class));
            case 7:
                return (r8b) roomDatabase.j.get(qoi0.a(r8b.class));
            case 8:
                return (fuu0) roomDatabase.j.get(qoi0.a(fuu0.class));
            case 9:
                return (w5z) roomDatabase.j.get(qoi0.a(w5z.class));
            default:
                return (x5z) roomDatabase.j.get(qoi0.a(x5z.class));
        }
    }
}

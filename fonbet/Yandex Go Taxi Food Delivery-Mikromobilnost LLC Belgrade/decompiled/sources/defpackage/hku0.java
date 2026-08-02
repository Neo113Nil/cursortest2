package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final /* synthetic */ class hku0 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ hku0(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        String str = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                T0 = ((oll0) obj).T0("SELECT * FROM stored_experiments WHERE source = ? AND last_update > ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    int r = eja1.r(T0, "source");
                    int r2 = eja1.r(T0, "name");
                    int r3 = eja1.r(T0, "version");
                    int r4 = eja1.r(T0, "value");
                    int r5 = eja1.r(T0, "last_update");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(new bku0(T0.Y1(r), T0.Y1(r2), T0.isNull(r3) ? null : T0.Y1(r3), T0.Y1(r4), T0.getLong(r5)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
        }
    }

    public /* synthetic */ hku0(String str, long j) {
        this.c = str;
        this.b = j;
    }
}

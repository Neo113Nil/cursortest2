package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class c3x0 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ c3x0(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        String str = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                T0 = ((oll0) obj).T0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    T0.g1(1, str);
                    T0.b(2, i2);
                    return T0.q() ? new b3x0(T0.Y1(eja1.r(T0, "work_spec_id")), (int) T0.getLong(eja1.r(T0, "generation")), (int) T0.getLong(eja1.r(T0, "system_id"))) : null;
                } finally {
                }
            default:
                T0 = ((oll0) obj).T0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    T0.b(1, i2);
                    T0.g1(2, str);
                    T0.q();
                    T0.close();
                    return zy11.a;
                } finally {
                }
        }
    }

    public /* synthetic */ c3x0(String str, int i) {
        this.c = str;
        this.b = i;
    }
}

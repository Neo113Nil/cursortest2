package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class hdu0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ hdu0(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                T0 = ((oll0) obj).T0("INSERT INTO sticker_user_packs (sticker_user_pack_id, sticker_user_pack_order) VALUES (?,?)");
                try {
                    T0.g1(1, str);
                    T0.b(2, i2);
                    T0.q();
                    return zy11Var;
                } finally {
                }
            case 1:
                ((cne0) obj).p(i2, str);
                return zy11Var;
            default:
                T0 = ((oll0) obj).T0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    T0.g1(1, str);
                    T0.b(2, i2);
                    T0.q();
                    return zy11Var;
                } finally {
                }
        }
    }
}

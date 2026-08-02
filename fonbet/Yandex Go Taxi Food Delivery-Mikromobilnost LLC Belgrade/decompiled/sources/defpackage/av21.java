package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class av21 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ av21(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int x;
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                T0 = oll0Var.T0("UPDATE users SET shown_name= ? WHERE user_id = ?");
                try {
                    T0.g1(1, str2);
                    T0.g1(2, str);
                    T0.q();
                    x = jx81.x(oll0Var);
                    T0.close();
                    break;
                } finally {
                }
            default:
                T0 = oll0Var.T0("UPDATE users SET contact_id=?, lookup_id=?, shown_name= ? WHERE user_id = ?");
                try {
                    T0.p(1);
                    T0.p(2);
                    T0.g1(3, str2);
                    T0.g1(4, str);
                    T0.q();
                    x = jx81.x(oll0Var);
                    break;
                } finally {
                }
        }
        return Integer.valueOf(x);
    }
}

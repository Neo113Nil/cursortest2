package defpackage;

/* loaded from: classes8.dex */
public final class agz0 implements sls {
    public static final agz0 b = new agz0(0);
    public static final agz0 c = new agz0(1);
    public static final agz0 w = new agz0(2);
    public final /* synthetic */ int a;

    public agz0(tpr[] tprVarArr) {
        this.a = 16;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return "Error got while update tips from feedback";
            case 1:
                return "can't update walk route";
            case 2:
                return null;
            case 3:
                return new clp(new c7u(0, Boolean.TRUE), null, null, null, 30);
            case 4:
                return new glp(new d7u(1, null), null, null, null, 30);
            case 5:
                Boolean bool = Boolean.TRUE;
                if (rzo.J(bool)) {
                    return new hlp(new d7u(2, rzo.b0(bool)), null, null, null, 30);
                }
                ny61.g("Value arg is not of Set type or has non-string items!");
                return null;
            case 6:
                return new elp(new c7u(1, null), null, null, null, null, 62);
            case 7:
                return new dlp(new d7u(0, null), null, null, null, null, 62);
            case 8:
                return new dlp(new d7u(0, null), null, null, null, null, 62);
            case 9:
                return new glp(new d7u(1, null), null, null, null, 30);
            case 10:
                Boolean bool2 = Boolean.TRUE;
                if (rzo.J(bool2)) {
                    return new hlp(new d7u(2, rzo.b0(bool2)), null, null, null, 30);
                }
                ny61.g("Value arg is not of Set type or has non-string items!");
                return null;
            case 11:
                return new elp(new c7u(1, null), null, null, null, null, 62);
            case 12:
                return new dlp(new d7u(0, null), null, null, null, null, 62);
            case 13:
                return new clp(new c7u(0, null), null, null, null, 30);
            case 14:
                return new glp(new d7u(1, null), null, null, null, 30);
            case 15:
                if (rzo.J(720)) {
                    return new hlp(new d7u(2, rzo.b0(720)), null, null, null, 30);
                }
                ny61.g("Value arg is not of Set type or has non-string items!");
                return null;
            default:
                return new Object[2];
        }
    }

    public /* synthetic */ agz0(int i) {
        this.a = i;
    }
}

package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class hc1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ hc1(oz40 oz40Var, oz40 oz40Var2, int i) {
        this.a = i;
        this.b = oz40Var;
        this.c = oz40Var2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.c;
        oz40 oz40Var2 = this.b;
        switch (i) {
            case 0:
                long m = ((rzx) obj).m(0L);
                if (!wu60.c(m, ((wu60) oz40Var2.getValue()).a)) {
                    oz40Var2.setValue(new wu60(m));
                    sls slsVar = (sls) oz40Var.getValue();
                    if (slsVar != null) {
                        slsVar.invoke();
                        break;
                    }
                }
                break;
            case 1:
                long m2 = ((rzx) obj).m(0L);
                if (!wu60.c(m2, ((wu60) oz40Var2.getValue()).a)) {
                    oz40Var2.setValue(new wu60(m2));
                    sls slsVar2 = (sls) oz40Var.getValue();
                    if (slsVar2 != null) {
                        slsVar2.invoke();
                        break;
                    }
                }
                break;
            case 2:
                dry0 dry0Var = (dry0) obj;
                if (!((Boolean) oz40Var2.getValue()).booleanValue()) {
                    oz40Var.setValue(Boolean.valueOf(dry0Var.f()));
                    break;
                }
                break;
            case 3:
                rzx rzxVar = (rzx) obj;
                oz40Var2.setValue(new wu60(rzxVar.v(0L)));
                oz40Var.setValue(new k6w(rzxVar.e()));
                break;
            case 4:
                String str = (String) obj;
                oz40Var2.setValue(str);
                if (avu0.i(str) == null) {
                    oz40Var.setValue(Boolean.TRUE);
                    break;
                } else {
                    oz40Var.setValue(Boolean.FALSE);
                    break;
                }
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                oz40Var2.setValue(bool);
                oz40Var.setValue(bool);
                break;
            case 6:
                String str2 = (String) obj;
                oz40Var2.setValue(str2);
                if (avu0.i(str2) == null) {
                    oz40Var.setValue(Boolean.TRUE);
                    break;
                } else {
                    oz40Var.setValue(Boolean.FALSE);
                    break;
                }
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                oz40Var2.setValue(bool2);
                oz40Var.setValue(bool2);
                break;
        }
        return zy11Var;
    }
}

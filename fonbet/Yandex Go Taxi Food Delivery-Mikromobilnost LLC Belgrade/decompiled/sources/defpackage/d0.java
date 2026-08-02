package defpackage;

import ru.yandex.logistics.care.camera.ui.ConfirmAction;
import ru.yandex.logistics.care.camera.ui.c;

/* loaded from: classes6.dex */
public final /* synthetic */ class d0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ d0(tls tlsVar, oz40 oz40Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                hoy0 hoy0Var = (hoy0) obj;
                oz40Var.setValue(hoy0Var);
                tlsVar.invoke(hoy0Var.a.b);
                break;
            case 1:
                String str = (String) obj;
                oz40Var.setValue(str);
                tlsVar.invoke(new jm5(str));
                break;
            case 2:
                oz40Var.setValue(Boolean.TRUE);
                tlsVar.invoke(new hm5((String) obj));
                break;
            case 3:
                int i2 = gs8.a[((ConfirmAction) obj).ordinal()];
                if (i2 == 1) {
                    tlsVar.invoke(sr8.a);
                } else if (i2 != 2) {
                    w511.b();
                    break;
                } else {
                    c.b(oz40Var, false);
                    tlsVar.invoke(rr8.a);
                }
                break;
            case 4:
                tu21 tu21Var = (tu21) obj;
                oz40Var.setValue(tu21Var);
                tlsVar.invoke(new lep(tu21Var));
                break;
            case 5:
                String str2 = (String) obj;
                if (str2.length() <= 40) {
                    oz40Var.setValue(str2);
                    tlsVar.invoke(new mep(str2));
                    break;
                }
                break;
            case 6:
                vt30 vt30Var = (vt30) obj;
                if (!(vt30Var instanceof rt30)) {
                    if (!(vt30Var instanceof st30)) {
                        if (!(vt30Var instanceof pt30)) {
                            if (!(vt30Var instanceof qt30)) {
                                if (!(vt30Var instanceof tt30)) {
                                    if (!(vt30Var instanceof ut30)) {
                                        w511.b();
                                        break;
                                    } else {
                                        tlsVar.invoke(new ph30(((ut30) vt30Var).a));
                                    }
                                } else {
                                    tlsVar.invoke(new oh30(((tt30) vt30Var).a));
                                }
                            } else {
                                tlsVar.invoke(mh30.a);
                            }
                        } else {
                            tlsVar.invoke(new lh30(((pt30) vt30Var).a));
                        }
                    } else {
                        tlsVar.invoke(new nh30(((st30) vt30Var).a));
                    }
                } else {
                    oz40Var.setValue(Boolean.TRUE);
                }
                break;
            case 7:
                vt30 vt30Var2 = (vt30) obj;
                if (vt30Var2 instanceof rt30) {
                    oz40Var.setValue(Boolean.TRUE);
                }
                tlsVar.invoke(new u040(vt30Var2));
                break;
            case 8:
                vt30 vt30Var3 = (vt30) obj;
                if (vt30Var3 instanceof rt30) {
                    oz40Var.setValue(Boolean.TRUE);
                }
                tlsVar.invoke(new o240(vt30Var3));
                break;
            case 9:
                vt30 vt30Var4 = (vt30) obj;
                if (vt30Var4 instanceof rt30) {
                    oz40Var.setValue(Boolean.TRUE);
                }
                tlsVar.invoke(new q540(vt30Var4));
                break;
            case 10:
                vt30 vt30Var5 = (vt30) obj;
                if (vt30Var5 instanceof rt30) {
                    oz40Var.setValue(Boolean.TRUE);
                }
                tlsVar.invoke(new vyy0(vt30Var5));
                break;
            case 11:
                String str3 = (String) obj;
                oz40Var.setValue(str3);
                tlsVar.invoke(str3);
                break;
            case 12:
                String str4 = (String) obj;
                oz40Var.setValue(str4);
                tlsVar.invoke(new zvl0(str4));
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                oz40Var.setValue(bool);
                tlsVar.invoke(bool);
                break;
            case 14:
                hoy0 hoy0Var2 = (hoy0) obj;
                if (!jl40.l(hoy0Var2.a.b, ((hoy0) oz40Var.getValue()).a.b)) {
                    tlsVar.invoke(hoy0Var2.a.b);
                }
                oz40Var.setValue(hoy0Var2);
                break;
            case 15:
                hoy0 hoy0Var3 = (hoy0) obj;
                oz40Var.setValue(hoy0Var3);
                tlsVar.invoke(hoy0Var3.a.b);
                break;
            default:
                String str5 = (String) obj;
                int length = str5.length();
                oz40Var.setValue(new hoy0(str5, eja1.c(length, length), 4));
                tlsVar.invoke(str5);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ d0(oz40 oz40Var, tls tlsVar, int i) {
        this.a = i;
        this.c = oz40Var;
        this.b = tlsVar;
    }
}

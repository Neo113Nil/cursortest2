package defpackage;

import com.yandex.xplat.common.YSError;

/* loaded from: classes2.dex */
public class e0a0 implements mfr {
    @Override // defpackage.mfr
    public final md51 a(md51 md51Var) {
        sv90 sv90Var = qv90.a;
        final int i = 0;
        final iho c = y891.c("xflags_".concat("activate_flags"), new wj00(0));
        jho.a.getClass();
        final int i2 = 1;
        final v22 v22Var = new v22(o450.a(), 1);
        c.c();
        md51Var.h(new tls() { // from class: hho
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                v22 v22Var2 = v22Var;
                iho ihoVar = c;
                switch (i3) {
                    case 0:
                        ihoVar.d((lhn) v22Var2.invoke()).c();
                        break;
                    default:
                        ihoVar.a(((YSError) obj).getMessage(), (lhn) v22Var2.invoke()).c();
                        break;
                }
                return zy11Var;
            }
        }).b(new tls() { // from class: hho
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                v22 v22Var2 = v22Var;
                iho ihoVar = c;
                switch (i3) {
                    case 0:
                        ihoVar.d((lhn) v22Var2.invoke()).c();
                        break;
                    default:
                        ihoVar.a(((YSError) obj).getMessage(), (lhn) v22Var2.invoke()).c();
                        break;
                }
                return zy11Var;
            }
        });
        return md51Var;
    }
}

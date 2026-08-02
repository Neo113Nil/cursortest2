package defpackage;

import com.yx360.design.compose.atoms.DsHeading$Size;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class a2d implements zls {
    public final /* synthetic */ int a;
    public static final a2d b = new a2d(0);
    public static final a2d c = new a2d(1);
    public static final a2d w = new a2d(2);
    public static final a2d x = new a2d(3);
    public static final a2d y = new a2d(4);
    public static final a2d z = new a2d(5);
    public static final a2d A = new a2d(6);
    public static final a2d B = new a2d(7);
    public static final a2d C = new a2d(8);
    public static final a2d D = new a2d(9);

    public /* synthetic */ a2d(int i) {
        this.a = i;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                qnm.d.getClass();
                oeb1.c(fidVar, ljs0.e(c530Var, 4.0f));
                break;
            case 1:
                fid fidVar2 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                String e = ohb1.e(fidVar2, oyh0.folder_add_chat_type_title);
                DsHeading$Size dsHeading$Size = DsHeading$Size.Xs;
                f530 c2 = ljs0.c(c530Var, 1.0f);
                qnm qnmVar = qnm.a;
                qnm.e.getClass();
                f530 b2 = m4m0.b(ymb1.l(c2, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), qnm.c(fidVar2).a(), qke.q);
                qnm.c.getClass();
                hq91.a(e, an91.m(b2, 0.0f, 2.0f, 1), null, dsHeading$Size, null, 0L, 0, 0L, 0, 0, null, fidVar2, HProv.ALG_TYPE_SECURECHANNEL, 0, 2036);
                break;
            case 2:
                fid fidVar3 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar3 = (bts) fidVar3;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                String e2 = ohb1.e(fidVar3, oyh0.folder_add_chat_include_title);
                DsHeading$Size dsHeading$Size2 = DsHeading$Size.Xs;
                f530 c3 = ljs0.c(c530Var, 1.0f);
                qnm qnmVar2 = qnm.a;
                qnm.e.getClass();
                f530 b3 = m4m0.b(ymb1.l(c3, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), qnm.c(fidVar3).a(), qke.q);
                qnm.c.getClass();
                hq91.a(e2, an91.m(b3, 0.0f, 2.0f, 1), null, dsHeading$Size2, null, 0L, 0, 0L, 0, 0, null, fidVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 2036);
                break;
            case 3:
                fid fidVar4 = (fid) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    bts btsVar4 = (bts) fidVar4;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        break;
                    }
                }
                uo91.a(true, null, null, fidVar4, 6, 6);
                break;
            case 4:
                ((Number) obj3).intValue();
                ged.a.getClass();
                hlb1.a(ged.b, (fid) obj2, 6);
                break;
            case 5:
                ((Number) obj).intValue();
                jej0 jej0Var = (jej0) obj2;
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                break;
        }
        return zy11Var;
    }
}

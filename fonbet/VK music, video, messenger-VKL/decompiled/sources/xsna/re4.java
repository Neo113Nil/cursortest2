package xsna;

import android.content.Intent;
import com.vk.auth.api.models.AuthResult;
import com.vk.core.exceptions.DisposableException;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.h1p0;
import xsna.pe4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class re4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ re4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((el50) obj).W().c(pe4.a.a);
                break;
            case 1:
                ftb ftbVar = (ftb) obj;
                ftbVar.h = null;
                ftbVar.e.s();
                break;
            case 2:
                ((mi00) obj).b.a();
                break;
            case 3:
                yp80 yp80Var = ((e4b0) obj).e;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            case 4:
                ((pzk0) obj).setEnabledClickButtons(true);
                break;
            case 5:
                ncl0 ncl0Var = (ncl0) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"StickersRepositoryImpl initCache end for " + o25.a().c()});
                }
                qov qovVar = (qov) ncl0Var.r.getValue();
                etj etjVar = ncl0Var.d;
                qovVar.e(o25.a().c());
                ncl0Var.c.set(false);
                etjVar.getClass();
                n2i0.a(etjVar.b, hf8.a, new Intent("com.vkontakte.android.STICKERS_NUM_UPDATES"));
                etjVar.b();
                break;
            case 6:
                ((h1p0.b) obj).m.a();
                break;
            default:
                q55 q55Var = q55.a;
                q55.d((AuthResult) obj);
                break;
        }
    }
}

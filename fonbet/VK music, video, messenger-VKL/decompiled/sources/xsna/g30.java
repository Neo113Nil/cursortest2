package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vkontakte.android.R;
import xsna.b9a0;
import xsna.ybp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g30 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.dqb$a, xsna.j8i] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((h30) obj).n = null;
                break;
            case 1:
                l55.a.getClass();
                zbp zbpVar = (zbp) l55.c.getValue();
                r55 r55Var = r55.a;
                ybp.c cVar = (ybp.c) ((ybp) obj);
                zbpVar.a(r55.a(), cVar.a, cVar.b);
                break;
            case 2:
                dqb dqbVar = (dqb) obj;
                dqbVar.f = null;
                dqbVar.c.e0();
                break;
            case 3:
                ((scl) obj).k = false;
                break;
            case 4:
                xnt xntVar = (xnt) obj;
                if (xntVar.c) {
                    xntVar.b.ao(false);
                    break;
                }
                break;
            case 5:
                dfz dfzVar = (dfz) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = dfzVar.f;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                io.reactivex.rxjava3.disposables.c cVar3 = dfzVar.e;
                if (cVar3 != null) {
                    cVar3.dispose();
                    break;
                }
                break;
            case 6:
                c8a0 c8a0Var = (c8a0) obj;
                c8a0Var.g.invoke(b9a0.h.a);
                c8a0Var.g.invoke(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_photo_unpin_success), Integer.valueOf(R.drawable.vk_icon_unpin_outline_28), Integer.valueOf(R.attr.vk_ui_icon_accent), null, null, null, 56)));
                break;
            default:
                ((gzs) obj).invoke();
                break;
        }
    }

    public /* synthetic */ g30(ybp ybpVar, AuthResult authResult) {
        this.b = 1;
        this.c = ybpVar;
    }
}

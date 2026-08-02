package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.kwm;

/* compiled from: DialogsToolbarRouter.kt */
/* loaded from: classes18.dex */
public final class lwm implements hm50<kwm> {
    public final Context a;
    public final gwm b;

    public lwm(Context context, com.vk.dialogsscreen.impl.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    @Override // xsna.hm50
    public final void a(kwm kwmVar) {
        kwm kwmVar2 = kwmVar;
        boolean equals = kwmVar2.equals(kwm.a.a);
        Context context = this.a;
        gwm gwmVar = this.b;
        if (equals) {
            gwmVar.a(context);
            return;
        }
        if (kwmVar2 instanceof kwm.h) {
            gwmVar.e(context, ((kwm.h) kwmVar2).a);
            return;
        }
        if (kwmVar2.equals(kwm.d.a)) {
            gwmVar.getClass();
            return;
        }
        if (kwmVar2.equals(kwm.e.a)) {
            gwmVar.h();
            return;
        }
        if (kwmVar2 instanceof kwm.j) {
            gwmVar.getClass();
            return;
        }
        if (kwmVar2 instanceof kwm.f) {
            UserId b = com.vk.dto.common.a.b(gwmVar.f().q());
            sr5 sr5Var = ((kwm.f) kwmVar2).a;
            String str = sr5Var != null ? sr5Var.a : null;
            if (str == null) {
                str = "";
            }
            gwmVar.b(this.a, b, str, sr5Var != null ? sr5Var.b : null, sr5Var != null ? sr5Var.c : false);
            return;
        }
        if (kwmVar2.equals(kwm.i.a)) {
            gwmVar.g();
            return;
        }
        if (kwmVar2.equals(kwm.c.a)) {
            gwmVar.c();
        } else if (kwmVar2.equals(kwm.b.a)) {
            gwmVar.d(context);
        } else {
            if (!kwmVar2.equals(kwm.g.a)) {
                throw new NoWhenBranchMatchedException();
            }
            gwmVar.i(context);
        }
    }
}

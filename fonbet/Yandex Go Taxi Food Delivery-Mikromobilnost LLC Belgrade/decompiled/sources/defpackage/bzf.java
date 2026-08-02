package defpackage;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.MessengerEnvironment;

/* loaded from: classes15.dex */
public final class bzf implements xvf0 {
    public final /* synthetic */ int a;
    public final w4l b;

    public /* synthetic */ bzf(w4l w4lVar, int i) {
        this.a = i;
        this.b = w4lVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        w4l w4lVar = this.b;
        switch (i) {
            case 0:
                return ((c8g) w4lVar).c.a;
            case 1:
                h8g h8gVar = ((c8g) w4lVar).d;
                sml smlVar = new sml((sfl0) h8gVar.w.get());
                x870 x870Var = new x870((sfl0) h8gVar.w.get());
                ddb ddbVar = new ddb();
                Context context = h8gVar.b.a.a;
                q5z.i(context);
                vr vrVar = new vr(context, (char) 0);
                sfl0 sfl0Var = (sfl0) h8gVar.w.get();
                p8g p8gVar = h8gVar.c;
                return new w3i(smlVar, x870Var, ddbVar, vrVar, new at20(sfl0Var, (MessengerEnvironment) p8gVar.i.get()), new xoq0((b00) p8gVar.U.get(), (ax80) p8gVar.F.get()), new ndl0(24, (b00) p8gVar.U.get()), new xl10((sfl0) h8gVar.w.get()), 18);
            case 2:
                return new sml((sfl0) ((c8g) w4lVar).d.w.get());
            case 3:
                lqo lqoVar = ((c8g) w4lVar).a.a.d;
                q5z.i(lqoVar);
                return lqoVar;
            case 4:
                xav xavVar = (xav) ((c8g) w4lVar).b.j0.get();
                q5z.h(xavVar);
                return xavVar;
            default:
                Moshi moshi = (Moshi) ((c8g) w4lVar).a.N.get();
                q5z.h(moshi);
                return moshi;
        }
    }
}

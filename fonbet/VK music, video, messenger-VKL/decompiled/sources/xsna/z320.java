package xsna;

import android.content.Context;
import android.content.Intent;

/* compiled from: MentionNotificationHelper.kt */
/* loaded from: classes5.dex */
public final class z320 {
    public static void a(Intent intent) {
        long longExtra = intent.getLongExtra("mention_dialog_id", -1L);
        int intExtra = intent.getIntExtra("mention_cnv_msg_id", 0);
        y320 y320Var = y320.b;
        io.reactivex.rxjava3.internal.operators.single.t a = y320.a(intExtra, longExtra);
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.maybe.x k = a.k(asu0.i());
        l7x l7xVar = itg0.a;
        int i = kwg0.a;
        k.subscribe(new iwg0(), new hwg0());
    }

    public static void b(Context context, long j, int i, boolean z) {
        if (z) {
            y320 y320Var = y320.b;
            io.reactivex.rxjava3.internal.operators.single.r rVar = new io.reactivex.rxjava3.internal.operators.single.r(y320.b(j), new do3(new x320(j, i), 22));
            asu0.a.getClass();
            io.reactivex.rxjava3.internal.operators.single.b0 m = rVar.m(asu0.i());
            o3y o3yVar = new o3y(new ops(context, 1), 3);
            int i2 = kwg0.a;
            m.subscribe(o3yVar, new jwg0("MentionNotificationHelper"));
            return;
        }
        y320 y320Var2 = y320.b;
        io.reactivex.rxjava3.internal.operators.single.t a = y320.a(i, j);
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.maybe.x k = a.k(asu0.i());
        c2y c2yVar = new c2y(new rlh(context, 23), 5);
        int i3 = kwg0.a;
        k.subscribe(c2yVar, new jwg0("MentionNotificationHelper"));
    }
}

package xsna;

import kotlin.Result;
import xsna.qn60;
import xsna.qr60;

/* compiled from: NewsfeedListTaskExt.kt */
/* loaded from: classes4.dex */
public final class fs60 {
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final es60 a(qn60 qn60Var, pn60 pn60Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, mo60 mo60Var) {
        return new es60(qn60Var, pn60Var, cVar, mo60Var.S, mo60Var.j, mo60Var.i, mo60Var.m, mo60Var.l, mo60Var.D, mo60Var.K, mo60Var.X, mo60Var.c());
    }

    public static void b(evg0 evg0Var, gzs gzsVar) {
        Object d = ((Result) gzsVar.invoke()).d();
        if (!(d instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) d;
            evg0Var.e(new qr60.a.c(cVar.a, cVar.b, false, null, 24));
        }
        Throwable a = Result.a(d);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
        }
    }
}

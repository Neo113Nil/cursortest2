package xsna;

import android.content.Context;
import android.net.Uri;
import kotlin.text.Regex;
import xsna.ea6;

/* compiled from: VkAppChannelLinkHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class g9u0 extends ea6 implements f1b {
    public final rxr c;

    public g9u0(a1w a1wVar, rxr rxrVar) {
        super(a1wVar, rxrVar);
        this.c = rxrVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.f1b
    public final boolean a(peq0 peq0Var) {
        return peq0.p(peq0Var, (Regex) laz.K.getValue(), null, null, 14);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.f1b
    public final boolean b(Context context, peq0 peq0Var, e1b e1bVar, io.reactivex.rxjava3.disposables.b bVar) {
        Uri uri = peq0Var.a;
        if (!peq0.p(peq0Var, (Regex) laz.K.getValue(), null, null, 14)) {
            return false;
        }
        String d = peq0Var.d(1);
        Long n = d != null ? arm0.n(d) : null;
        String queryParameter = uri.getQueryParameter("cmid");
        Integer m = queryParameter != null ? arm0.m(10, queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("comment");
        Integer m2 = queryParameter2 != null ? arm0.m(10, queryParameter2) : null;
        if (n == null) {
            bVar.b(io.reactivex.rxjava3.kotlin.c.d(hg1.l(this.b.a(), context, 62).o(asu0.a.d()), new fa6(0, e1bVar, e1b.class, "onChannelFolderFound", "onChannelFolderFound()V", 0, 0), new xv2(1, e1bVar, e1b.class, "onFindChannelFolderError", "onFindChannelFolderError(Ljava/lang/Throwable;)V", 0, 2)));
            return true;
        }
        if (m == null) {
            long longValue = n.longValue();
            ea6.b bVar2 = new ea6.b(longValue, peq0Var.a, e1bVar, bVar);
            bVar.b(io.reactivex.rxjava3.kotlin.c.h(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.e0(hg1.n(c(longValue).l(new fq1(new com.vk.movika.sdk.base.observable.e(bVar2, 10), 2)), context, false, null, 62).m(asu0.a.d()), new pa(new ay0(7, this, bVar2), 3)).h(new ji3(new g20(bVar2, 6), 2)), new dh1(bVar2, 1)), null, new dg(bVar2, 8), 1));
            return true;
        }
        if (m2 != null) {
            long longValue2 = n.longValue();
            ea6.a aVar = new ea6.a(longValue2, m.intValue(), m2.intValue(), e1bVar, bVar);
            bVar.b(io.reactivex.rxjava3.kotlin.c.h(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.e0(hg1.n(new io.reactivex.rxjava3.internal.operators.single.r(c(longValue2), new p7(new mp3(2, this, aVar), 4)), context, false, null, 62).m(asu0.a.d()), new b8(new a8(this, aVar), 4)).h(new xf1(new com.vk.movika.sdk.base.observable.a(aVar, 6), 3)), new fo1(aVar, 1)), null, new go1(aVar, 11), 1));
            return true;
        }
        long longValue3 = n.longValue();
        int intValue = m.intValue();
        ea6.c cVar = new ea6.c(new faz(longValue3, intValue), uri, e1bVar, bVar);
        int i = 5;
        bVar.b(io.reactivex.rxjava3.kotlin.c.h(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.e0(hg1.n(new io.reactivex.rxjava3.internal.operators.single.r(c(longValue3), new n7(new w96(this, longValue3, intValue), 4)), context, false, null, 62).m(asu0.a.d()), new rf1(new x96(this, longValue3), i)).h(new n20(new com.vk.im.engine.internal.storage.delegates.messages.b(cVar, 11), i)), new y96(cVar, 0)), null, new tm0(cVar, 11), 1));
        return true;
    }
}

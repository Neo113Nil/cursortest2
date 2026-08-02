package xsna;

import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Source;
import com.vk.photogallery.c;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.ulp0;
import xsna.w2t;

/* compiled from: VkActionsBridge.kt */
/* loaded from: classes7.dex */
public final class a7u0 extends c.a {
    public final /* synthetic */ w2t.a a;

    public a7u0(w2t.a aVar) {
        this.a = aVar;
    }

    public final void a(String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        ulp0.a aVar = (ulp0.a) new ulp0(rli0.k(new i5g(list), ouz.class), new kz0(20)).iterator();
        if (!aVar.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        fxj0 fxj0Var = (fxj0) j5g.Z(((AttachImage) aVar.next()).r);
        if (fxj0Var != null) {
            w2t.a aVar2 = this.a;
            a1w a1wVar = aVar2.b;
            io.reactivex.rxjava3.core.x n = hg1.n(new io.reactivex.rxjava3.internal.operators.completable.p(a1wVar.C(aVar2, new qam(jeq0.g(fxj0Var.getUrl())))).e(a1wVar.C(aVar2, new jam(Collections.singletonList(w2t.e), Source.CACHE, false, true, false))).q(aVar2.d), aVar2.a, true, null, 38);
            io.reactivex.rxjava3.core.r<DialogBackground> rVar = aVar2.c;
            rVar.i(n.subscribe(new c40(new zxo(8, n, rVar), 21), new m5(new v2t(1, rVar, io.reactivex.rxjava3.core.r.class, "tryOnError", "tryOnError(Ljava/lang/Throwable;)Z", 8), 23)));
        }
    }
}

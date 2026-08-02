package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.im_item.ImItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ImItemsMetaRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class k8w {
    public final xbw a;
    public final tum b;
    public final e7w c;
    public final f9w d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.d<i8w> h;
    public final io.reactivex.rxjava3.internal.operators.observable.a0 i;

    /* compiled from: ImItemsMetaRepositoryImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((d9w) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: ImItemsMetaRepositoryImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((d9w) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public k8w(xbw xbwVar, tum tumVar, e7w e7wVar, f9w f9wVar) {
        this.a = xbwVar;
        this.b = tumVar;
        this.c = e7wVar;
        this.d = f9wVar;
        io.reactivex.rxjava3.subjects.d<i8w> O0 = io.reactivex.rxjava3.subjects.d.O0((i8w) i8w.d.getValue());
        this.h = O0;
        this.i = new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.y(O0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new np3(new w7u(this, 3), 25), io.reactivex.rxjava3.internal.functions.a.c), new j8w(this, 0));
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.b bVar = this.g;
        bVar.e();
        bVar.b(io.reactivex.rxjava3.kotlin.c.e(this.b.a(), new a(1, this.d, d9w.class, "error", "error(Ljava/lang/Throwable;)V", 0), new i4h(this, 27)));
    }

    public final void b() {
        d5w d5wVar;
        tum tumVar = this.b;
        io.reactivex.rxjava3.disposables.b bVar = this.f;
        n5w n5wVar = this.c.b;
        if (n5wVar == null || (d5wVar = n5wVar.b) == null) {
            d5wVar = ((n5w) n5w.d.getValue()).b;
        }
        List<a5w> list = d5wVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((a5w) obj).t3().b == ImItemType.DIALOG) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long j = ((a5w) it.next()).t3().a;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList2.add(Peer.a.b(j));
        }
        bVar.e();
        bVar.b(io.reactivex.rxjava3.kotlin.c.e(io.reactivex.rxjava3.core.x.B(tumVar.c(arrayList2), tumVar.b(arrayList2), new tt0(new yx5(7), 25)), new b(1, this.d, d9w.class, "error", "error(Ljava/lang/Throwable;)V", 0), new eqd(this, 26)));
    }
}

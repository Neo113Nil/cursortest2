package xsna;

import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hg1;

/* compiled from: MessengerSyncStateSource.kt */
/* loaded from: classes16.dex */
public final class t1w {
    public final xbw a;
    public final io.reactivex.rxjava3.internal.operators.observable.y b;

    /* compiled from: MessengerSyncStateSource.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<ImBgSyncState, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ImBgSyncState imBgSyncState) {
            ((io.reactivex.rxjava3.subjects.d) this.receiver).onNext(imBgSyncState);
            return s3q0.a;
        }
    }

    public t1w(xbw xbwVar, jxv jxvVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = xbwVar;
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(jxvVar.b().a(LongPollType.CHANNELS));
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(xbwVar.a(), new hg1.w1()).U(new hg1.v1()).U(new lh3(new azt(5), 21));
        a aVar = new a(1, O0, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        int i = kwg0.a;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, U, null, new nu2("ImEngineMessengerSyncStateSource", 2), aVar));
        this.b = new io.reactivex.rxjava3.internal.operators.observable.y(O0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }
}

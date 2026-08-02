package xsna;

import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: ChannelDonutStateUpdateDelegate.kt */
/* loaded from: classes16.dex */
public final class wxa {
    public final lxa a;
    public final v8b b;
    public final dy2 c;
    public final a1w d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final io.reactivex.rxjava3.subjects.d<DonutGroupSettingsDto> f;

    /* compiled from: ChannelDonutStateUpdateDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public wxa(lxa lxaVar, w8b w8bVar, dy2 dy2Var, a1w a1wVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = lxaVar;
        this.b = w8bVar;
        this.c = dy2Var;
        this.d = a1wVar;
        this.e = bVar;
        io.reactivex.rxjava3.subjects.d<DonutGroupSettingsDto> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.f = N0;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, io.reactivex.rxjava3.core.q.m(N0, new io.reactivex.rxjava3.internal.operators.observable.y(w8bVar.b.U(new qa(new com.vk.movika.sdk.base.utils.b(6), 6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new k7(new qg3(1), 6)), null, new ud8(L.a, 2), new dg(this, 13)));
    }

    public final void a() {
        this.e.b(io.reactivex.rxjava3.kotlin.c.e(this.a.e.K(), new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), new ay0(this, 20)));
    }
}

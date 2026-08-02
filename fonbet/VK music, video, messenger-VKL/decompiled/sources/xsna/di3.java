package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import xsna.ei3;

/* compiled from: ArchiveInfoEngineSource.kt */
/* loaded from: classes18.dex */
public final class di3 implements ei3 {
    public final a1w a;
    public final seb b;

    public di3(a1w a1wVar, seb sebVar) {
        this.a = a1wVar;
        this.b = sebVar;
    }

    @Override // xsna.ei3
    public final io.reactivex.rxjava3.core.q<ei3.a> a() {
        reb create = this.b.create();
        io.reactivex.rxjava3.core.q<ChannelsCounters> H = create.H();
        zl0 zl0Var = new zl0(new tl0(create, 4), 2);
        H.getClass();
        return io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(H, zl0Var, io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new bi3(create, 0)).U(new tp1(new ci3(0), 1)), new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(this.a.l.a().a0(io.reactivex.rxjava3.schedulers.a.b()), new ox0(new zj(1), 3)).U(new wr(new c2(2), 3)), new ft0(new y40(2), 2)), new ux0(new com.vk.movika.sdk.base.logic.interactor.e(this, 5), 3)).o0(b()), new ai3(new zh3(0), 0));
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 b() {
        DialogsFilter dialogsFilter = DialogsFilter.ARCHIVE;
        Source source = Source.CACHE;
        qpm qpmVar = new qpm(dialogsFilter, source, false, null);
        gnm gnmVar = new gnm(source, false);
        a1w a1wVar = this.a;
        return io.reactivex.rxjava3.core.x.B(a1wVar.C(this, qpmVar), a1wVar.C(this, gnmVar), new xl0(new yh3(0), 2)).q(io.reactivex.rxjava3.schedulers.a.b());
    }
}

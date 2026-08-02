package xsna;

import com.vk.im.engine.models.groups.Group;

/* compiled from: ChannelProfileDataSourceImpl.kt */
/* loaded from: classes16.dex */
public final class w8b implements v8b {
    public final a1w a;
    public final io.reactivex.rxjava3.subjects.d<Group> b = io.reactivex.rxjava3.subjects.d.N0();

    public w8b(ixa ixaVar, a1w a1wVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = a1wVar;
        io.reactivex.rxjava3.internal.operators.observable.o0 o0Var = new io.reactivex.rxjava3.internal.operators.observable.o0(new io.reactivex.rxjava3.internal.operators.observable.o0(ixaVar.a().a0(asu0.a.c()), new p7(new com.vk.im.engine.internal.api_commands.messages.a(this, 11), 12)), new tt0(new com.vk.im.engine.internal.storage.delegates.messages.b(this, 22), 9));
        int i = kwg0.a;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(6, o0Var, null, new nu2("ChannelProfileDataSource", 2), null));
    }

    @Override // xsna.v8b
    public final io.reactivex.rxjava3.subjects.d a() {
        return this.b;
    }

    @Override // xsna.v8b
    public final Group b() {
        return this.b.P0();
    }
}

package xsna;

/* compiled from: ChatProfileParticipationEventProvider.kt */
/* loaded from: classes16.dex */
public final class mxb {
    public final long a;
    public final ixa b;
    public final io.reactivex.rxjava3.subjects.f c;

    public mxb(long j, a1w a1wVar, ixa ixaVar) {
        this.a = j;
        this.b = ixaVar;
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        this.c = fVar;
        int i = 0;
        new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new g7(new sg3(1, this, mxb.class, "filterEvent", "filterEvent(Lcom/vk/im/engine/models/events/Event;)Z", i, 2), 11)).U(new h7(new qi3(1, this, mxb.class, "mapEvent", "mapEvent(Lcom/vk/im/engine/models/events/Event;)Lcom/vk/channels/impl/channel_screen/profile/ChannelProfileEvent;", i, 4), 10)).subscribe(fVar);
        io.reactivex.rxjava3.internal.operators.observable.y a = ixaVar.a();
        qa qaVar = new qa(new e69((byte) 0, 1), 7);
        a.getClass();
        new io.reactivex.rxjava3.internal.operators.observable.y(a, io.reactivex.rxjava3.internal.functions.a.a, qaVar).U(new k7(new tb4(4), 7)).subscribe(fVar);
    }
}

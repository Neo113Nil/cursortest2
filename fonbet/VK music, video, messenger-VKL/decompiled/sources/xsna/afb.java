package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: ChannelsFolderCounterProvider.kt */
/* loaded from: classes18.dex */
public final class afb implements fnk {
    public final uyr a;
    public final reb b;

    public afb(uyr uyrVar, reb rebVar) {
        this.a = uyrVar;
        this.b = rebVar;
    }

    @Override // xsna.fnk
    public final io.reactivex.rxjava3.internal.operators.observable.l2 a() {
        io.reactivex.rxjava3.core.q<R> s0 = this.a.a(FolderType.CHANNELS).s0(new ox0(new ns1(this, 17), 10));
        asu0.a.getClass();
        return s0.r0((io.reactivex.rxjava3.core.w) asu0.o0.getValue());
    }
}

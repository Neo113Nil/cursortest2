package xsna;

import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.im.engine.models.messages.MsgFromChannel;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.concurrent.TimeUnit;

/* compiled from: VisiblePostsContentUpdater.kt */
/* loaded from: classes16.dex */
public final class p5u0 {
    public final ChannelFragment.h a;
    public final io.reactivex.rxjava3.subjects.f<MsgFromChannel> b;
    public io.reactivex.rxjava3.disposables.c c;

    public p5u0(io.reactivex.rxjava3.disposables.b bVar, ChannelFragment.h hVar) {
        this.a = hVar;
        io.reactivex.rxjava3.subjects.f<MsgFromChannel> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = fVar;
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, new u730(new t9o0(7), 19)).d(2000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.a.a(), Integer.MAX_VALUE, ArrayListSupplier.INSTANCE), new i630(new pmp0(5), 20));
        int i = kwg0.a;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, i0Var, null, new nu2("Failed to update visible posts", 2), new o6i0(8, this, bVar)));
    }
}

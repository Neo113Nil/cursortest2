package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.channels.impl.channelselection.SelectChannelFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.im.engine.models.messages.Msg;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: VkChannelsBridge.kt */
/* loaded from: classes7.dex */
public final class jju0 implements xyv {
    public final Object b;
    public final Object c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new rjg0(10));

    public jju0(Lazy<? extends fib> lazy, Lazy<? extends NewsfeedRouterComponent> lazy2) {
        this.b = lazy;
        this.c = lazy2;
    }

    @Override // xsna.xyv
    public final Intent a(Context context, long j, ChannelHistoryOpenMode channelHistoryOpenMode, Long l, Class<? extends FragmentImpl> cls) {
        return n().a(context, j, channelHistoryOpenMode, l, cls);
    }

    @Override // xsna.xyv
    public final void b(Context context, long j, int i, ChannelHistoryOpenMode channelHistoryOpenMode) {
        n().b(context, j, i, channelHistoryOpenMode);
    }

    @Override // xsna.xyv
    public final void c(Context context, long j, ChannelHistoryOpenMode channelHistoryOpenMode, ChannelEntryPoint channelEntryPoint) {
        n().c(context, j, channelHistoryOpenMode, channelEntryPoint);
    }

    @Override // xsna.xyv
    public final void d(Context context, long j, int i, Integer num) {
        n().d(context, j, i, num);
    }

    @Override // xsna.xyv
    public final io.reactivex.rxjava3.core.a f(jbs jbsVar, long j, int i) {
        iuc0 iuc0Var = iuc0.b;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        io.reactivex.rxjava3.core.x<List<Post>> m = iuc0.g0().m(Collections.singletonList(sb.toString()));
        asu0 asu0Var = asu0.a;
        return new io.reactivex.rxjava3.internal.operators.single.s(hg1.n(m.q(asu0Var.c()).m(asu0Var.d()), jbsVar.a.kn(), false, null, 62), new uxb0(new wqb(27, this, jbsVar), 15));
    }

    @Override // xsna.xyv
    public final void g(Context context) {
        n().g(context);
    }

    @Override // xsna.xyv
    public final void h(bc6 bc6Var, long j) {
        n().f(bc6Var.a, j, null);
    }

    @Override // xsna.xyv
    public final void j(u90 u90Var, long j) {
        n().e(j, u90Var.B());
    }

    @Override // xsna.xyv
    public final void k(jbs jbsVar) {
        new SelectChannelFragment.a(SelectChannelFragment.class, null, null).i(jbsVar, 4);
    }

    @Override // xsna.xyv
    public final io.reactivex.rxjava3.core.a l(bc6 bc6Var, Msg msg) {
        return io.reactivex.rxjava3.core.a.l(new q30(this, bc6Var, msg, 1));
    }

    @Override // xsna.xyv
    public final io.reactivex.rxjava3.core.a m(long j, jbs jbsVar) {
        ExtendedProfilesRepository.a aVar = new ExtendedProfilesRepository.a(new UserId(j), new oqt0(3), new vr0(22), ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST, null, null, Tensorflow.FRAME_HEIGHT);
        t6g0 t6g0Var = t6g0.b;
        io.reactivex.rxjava3.internal.operators.observable.i1 i1Var = new io.reactivex.rxjava3.internal.operators.observable.i1(t6g0.c().S0(aVar));
        asu0 asu0Var = asu0.a;
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(hg1.n(i1Var.q(asu0Var.c()).m(asu0Var.d()), jbsVar.a.kn(), false, null, 62), new aas0(new zum(j, this, jbsVar, 1), 4)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final fib n() {
        return (fib) this.b.getValue();
    }
}

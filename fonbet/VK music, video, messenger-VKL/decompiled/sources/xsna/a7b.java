package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.pushes.msg.ChannelMsgPushInfoLoader;
import java.util.concurrent.TimeUnit;

/* compiled from: ChannelNewMessagesNotificationsHandler.kt */
/* loaded from: classes.dex */
public final class a7b {
    public final Context a;
    public final a1w b;
    public final j7b c;
    public final BuildInfo.Client d;
    public final tkb e;
    public final ui70 f;
    public final b25 g;
    public final ChannelMsgPushInfoLoader h;
    public final io.reactivex.rxjava3.disposables.b i = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.f<a> j = new io.reactivex.rxjava3.subjects.f<>();

    /* compiled from: ChannelNewMessagesNotificationsHandler.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public final long a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }
    }

    public a7b(Context context, a1w a1wVar, j7b j7bVar, BuildInfo.Client client, tkb tkbVar, ui70 ui70Var, b25 b25Var) {
        this.a = context;
        this.b = a1wVar;
        this.c = j7bVar;
        this.d = client;
        this.e = tkbVar;
        this.f = ui70Var;
        this.g = b25Var;
        this.h = new ChannelMsgPushInfoLoader(Source.ACTUAL, a1wVar);
        b();
    }

    public final Long a() {
        UserId c = this.g.c();
        if (!fkq0.c(c)) {
            c = null;
        }
        if (c != null) {
            return Long.valueOf(c.b);
        }
        return null;
    }

    public final void b() {
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.j.a0(asu0.t());
        final ki6 ki6Var = new ki6(this, 1);
        io.reactivex.rxjava3.internal.operators.observable.m1 a02 = new io.reactivex.rxjava3.internal.operators.observable.i0(a0, new io.reactivex.rxjava3.functions.m() { // from class: xsna.u6b
            @Override // io.reactivex.rxjava3.functions.m
            public final boolean test(Object obj) {
                return ((Boolean) ki6.this.invoke(obj)).booleanValue();
            }
        }).A(1000L, TimeUnit.MILLISECONDS).a0(asu0Var.c()).U(new jd9(new v6b(this))).a0(asu0.t());
        final w6b w6bVar = new w6b(this, 0);
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(a02, new io.reactivex.rxjava3.functions.m() { // from class: xsna.x6b
            @Override // io.reactivex.rxjava3.functions.m
            public final boolean test(Object obj) {
                return ((Boolean) w6b.this.invoke(obj)).booleanValue();
            }
        });
        final y6b y6bVar = new y6b(this);
        io.reactivex.rxjava3.internal.operators.observable.j1 U = i0Var.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.z6b
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (h7b) y6b.this.invoke(obj);
            }
        });
        final q6b q6bVar = new q6b(this, 0);
        io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.r6b
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                q6b.this.invoke(obj);
            }
        };
        final s6b s6bVar = new s6b(0);
        this.i.b(U.subscribe(fVar, new io.reactivex.rxjava3.functions.f() { // from class: xsna.t6b
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                s6b.this.invoke(obj);
            }
        }));
    }
}

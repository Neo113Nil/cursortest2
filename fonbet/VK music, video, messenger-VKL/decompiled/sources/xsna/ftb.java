package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.chat.restriction.api.ChatWriteRestrictionFeatureComponent;
import com.vk.im.engine.di.scope.ImScope;
import com.vk.im.engine.models.dialogs.DialogMember;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.vrm;

/* compiled from: ChatMembersAdminHelper.kt */
/* loaded from: classes2.dex */
public final class ftb implements w8i {
    public final ImScope b;
    public final lzv c;
    public final Peer d;
    public final a e;
    public final String f;
    public io.reactivex.rxjava3.disposables.c g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;
    public io.reactivex.rxjava3.disposables.c j;
    public io.reactivex.rxjava3.disposables.c k;
    public io.reactivex.rxjava3.disposables.c l;
    public io.reactivex.rxjava3.disposables.c m;
    public io.reactivex.rxjava3.disposables.c n;
    public final Object o = msy.a(LazyThreadSafetyMode.NONE, new defpackage.r(this, 21));
    public final io.reactivex.rxjava3.disposables.b p = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: ChatMembersAdminHelper.kt */
    public interface a {
        void A0();

        void K();

        void N();

        void P(Throwable th);

        void T();

        void V();

        void h0(Throwable th);

        void j();

        void k0();

        void l();

        void n0();

        void q(Throwable th);

        void r(Throwable th);

        void r0();

        void s();

        void s0(Throwable th);

        void u0(Throwable th);

        void x0();
    }

    /* compiled from: ChatMembersAdminHelper.kt */
    @b6l(c = "com.vk.im.ui.components.chat_settings.helpers.ChatMembersAdminHelper$startDisableWritePermission$1", f = "ChatMembersAdminHelper.kt", l = {188}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $duration;
        final /* synthetic */ Peer $member;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Peer peer, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$duration = i;
            this.$member = peer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ftb.this.new b(this.$duration, this.$member, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                v2y0 ha = ((ChatWriteRestrictionFeatureComponent) ftb.this.o.getValue()).ha();
                int i2 = this.$duration;
                long j = ftb.this.d.b;
                Peer peer = this.$member;
                this.label = 1;
                if (ha.a(i2, j, peer, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ChatMembersAdminHelper.kt */
    @b6l(c = "com.vk.im.ui.components.chat_settings.helpers.ChatMembersAdminHelper$startEnableWritePermission$1", f = "ChatMembersAdminHelper.kt", l = {207}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Peer $member;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Peer peer, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$member = peer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ftb.this.new c(this.$member, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                v2y0 ha = ((ChatWriteRestrictionFeatureComponent) ftb.this.o.getValue()).ha();
                long j = ftb.this.d.b;
                Peer peer = this.$member;
                this.label = 1;
                if (ha.b(j, peer, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public ftb(ImScope imScope, lzv lzvVar, Peer peer, a aVar, String str) {
        this.b = imScope;
        this.c = lzvVar;
        this.d = peer;
        this.e = aVar;
        this.f = str;
    }

    public final void a(DialogMember dialogMember) {
        if (hg1.d(this.h)) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.c.b(this, new bnm(this.d, dialogMember.b, "owner", true)).m(asu0.a.d()), new lf1(new kf1(this, 13), 8)), new re4(this, 1)).subscribe(new xha(new am0(21), 1), new sh6(new d7(this, 21), 6));
        this.p.b(subscribe);
        this.h = subscribe;
    }

    public final void b(int i, Peer peer) {
        if (hg1.d(this.k)) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(wvg0.a(EmptyCoroutineContext.b, new b(i, peer, null)).m(asu0.a.d()), new js1(new p1(this, 22), 12)), new oua(this, 1)).subscribe(new atb(new pl2(8)), new gf0(new ns1(this, 20), 9));
        this.p.b(subscribe);
        this.k = subscribe;
    }

    public final void c(Peer peer) {
        if (hg1.d(this.l)) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(wvg0.a(EmptyCoroutineContext.b, new c(peer, null)).m(asu0.a.d()), new ew(new k00(this, 20), 10)), new zsb(this, 0)).subscribe(new z97(new cj1(9), 1), new wn(new r9(this, 16), 12));
        this.p.b(subscribe);
        this.l = subscribe;
    }

    public final void d(DialogMember dialogMember) {
        e(new vrm(this.d, dialogMember.zb() ? new vrm.a.C3900a(dialogMember.f.intValue()) : new vrm.a.b(dialogMember.b), false, this.f));
    }

    public final void e(vrm vrmVar) {
        if (hg1.d(this.g)) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.c.b(this, vrmVar).m(asu0.a.d()), new xn(new v5(this, 18), 7)), new fa(this, 3)).subscribe(new etb(new rf(16), 0), new st0(new zx(this, 20), 5));
        this.p.b(subscribe);
        this.g = subscribe;
    }

    public final void f(Peer peer) {
        if (hg1.d(this.i)) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.j jVar = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.c.b(this, new bnm(this.d, peer, "admin", false)).m(asu0.a.d()), new m20(new com.vk.im.engine.internal.api_commands.messages.a(this, 14), 13)), new lm1(this, 2));
        new b40(5);
        io.reactivex.rxjava3.disposables.c subscribe = jVar.subscribe(new wsb(), new j41(new po1(this, 14), 8));
        this.p.b(subscribe);
        this.i = subscribe;
    }

    public final void g(Peer peer) {
        if (hg1.d(this.i)) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.c.b(this, new bnm(this.d, peer, "member", false)).m(asu0.a.d()), new xz(new j9(this, 21), 12)), new xsb(this, 0)).subscribe(new ysb(new tc(6)), new cw(new w5(this, 17), 9));
        this.p.b(subscribe);
        this.j = subscribe;
    }
}

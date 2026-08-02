package com.yandex.messaging.internal.authorized.chat;

import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.ChatFlags;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ac3;
import defpackage.at10;
import defpackage.at2;
import defpackage.ax80;
import defpackage.bc3;
import defpackage.cc3;
import defpackage.ck51;
import defpackage.clb1;
import defpackage.cn2;
import defpackage.dc3;
import defpackage.f7b;
import defpackage.fk51;
import defpackage.i7b;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jsa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.pm50;
import defpackage.qsa0;
import defpackage.t2b;
import defpackage.t3z;
import defpackage.tje;
import defpackage.tse;
import defpackage.tz10;
import defpackage.uw80;
import defpackage.w511;
import defpackage.wfz;
import defpackage.wls;
import defpackage.x08;
import defpackage.x4b0;
import defpackage.yb3;
import defpackage.yw80;
import defpackage.z83;
import defpackage.zb3;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.ChatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1", f = "ChatOutgoingMessageHandler.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ChatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ uw80[] $attachments$inlined;
    final /* synthetic */ jsa0 $callback$inlined;
    final /* synthetic */ Integer $fileSource$inlined;
    final /* synthetic */ yw80 $message$inlined;
    final /* synthetic */ long $msgInternalId$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i7b this$0;
    final /* synthetic */ f7b this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1(f7b f7bVar, Continuation continuation, i7b i7bVar, Integer num, yw80 yw80Var, uw80[] uw80VarArr, jsa0 jsa0Var, long j) {
        super(2, continuation);
        this.this$0$inline_fun = f7bVar;
        this.this$0 = i7bVar;
        this.$fileSource$inlined = num;
        this.$message$inlined = yw80Var;
        this.$attachments$inlined = uw80VarArr;
        this.$callback$inlined = jsa0Var;
        this.$msgInternalId$inlined = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1 chatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1 = new ChatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1(this.this$0$inline_fun, continuation, this.this$0, this.$fileSource$inlined, this.$message$inlined, this.$attachments$inlined, this.$callback$inlined, this.$msgInternalId$inlined);
        chatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1.L$0 = obj;
        return chatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ee, code lost:
    
        if (r1 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021f, code lost:
    
        if (r1 == r3) goto L49;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Boolean bool;
        CoroutineSingletons coroutineSingletons;
        f7b f7bVar;
        int i;
        Boolean bool2;
        CoroutineSingletons coroutineSingletons2;
        f7b f7bVar2;
        Object a;
        Object c;
        dc3 dc3Var;
        x4b0 A;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            f7b f7bVar3 = this.this$0$inline_fun;
            fk51 fk51Var = this.this$0.o;
            at2 at2Var = fk51Var.e;
            ck51 ck51Var = fk51Var.f;
            o1b0 o1b0Var = fk51Var.a;
            boolean z3 = o1b0Var.g;
            boolean z4 = o1b0Var.d;
            int i3 = o1b0Var.o;
            String str = o1b0Var.b;
            String str2 = o1b0Var.c;
            Boolean valueOf = str2 != null ? Boolean.valueOf(at2Var.a().d(str2)) : null;
            boolean z5 = o1b0Var.k;
            t2b a2 = at2Var.Y().a(str);
            if (a2 != null) {
                long j = a2.j;
                z = z3;
                z2 = z4;
                bool = Boolean.valueOf(ChatFlags.a(j, 64L));
            } else {
                z = z3;
                z2 = z4;
                bool = null;
            }
            boolean z6 = z;
            if (valueOf != null) {
                i = i3;
                if (Boolean.valueOf(z6).equals(valueOf)) {
                    coroutineSingletons = coroutineSingletons3;
                    f7bVar = f7bVar3;
                } else {
                    coroutineSingletons = coroutineSingletons3;
                    f7bVar = f7bVar3;
                    ck51Var.a.reportEvent("tech_yadisk_not_consistent_isSupport", kotlin.collections.b.i(new Pair("chatId", str), new Pair("namespace", Integer.valueOf(i)), new Pair("isPrivate", Boolean.valueOf(z2)), new Pair("addresseeId", str2), new Pair("isChatWithSupportBot", Boolean.valueOf(z6)), new Pair("isChatWithSupportBot_new", valueOf)));
                    z83.i();
                }
            } else {
                coroutineSingletons = coroutineSingletons3;
                f7bVar = f7bVar3;
                i = i3;
            }
            if (bool == null || Boolean.valueOf(z5).equals(bool)) {
                bool2 = valueOf;
            } else {
                bool2 = valueOf;
                ck51Var.a.reportEvent("tech_yadisk_not_consistent_isStub", kotlin.collections.b.i(new Pair("chatId", str), new Pair("namespace", Integer.valueOf(i)), new Pair("isPrivate", Boolean.valueOf(z2)), new Pair("addresseeId", str2), new Pair("isStub", Boolean.valueOf(z5)), new Pair("isStub_new", bool)));
                z83.i();
            }
            boolean a3 = fk51Var.c.a(o1b0Var.b, bool != null ? bool.booleanValue() : z5, bool2 != null ? bool2.booleanValue() : z6, o1b0Var.p, o1b0Var.o, clb1.d(fk51Var.b), !fk51Var.d.b);
            if (a3 && str2 == null) {
                ck51Var.a.reportEvent("tech_yadisk_for_chat_without_addressee", kotlin.collections.b.i(new Pair("chatId", str), new Pair("namespace", Integer.valueOf(i)), new Pair("isPrivate", Boolean.valueOf(z2)), new Pair("addresseeId", str2), new Pair("isChatWithSupportBot", Boolean.valueOf(o1b0Var.g))));
            }
            i7b i7bVar = this.this$0;
            if (a3) {
                i7bVar.p.a(i7bVar.b, 1, this.$fileSource$inlined, i7bVar.d);
                com.yandex.messaging.chat.attachments.c cVar = (com.yandex.messaging.chat.attachments.c) this.this$0.n.get();
                yw80 yw80Var = this.$message$inlined;
                List d0 = j73.d0(this.$attachments$inlined);
                f7bVar2 = f7bVar;
                this.L$0 = f7bVar2;
                this.label = 1;
                c = cVar.c(yw80Var, d0, this);
                coroutineSingletons2 = coroutineSingletons;
            } else {
                coroutineSingletons2 = coroutineSingletons;
                f7bVar2 = f7bVar;
                i7bVar.p.a(i7bVar.b, 0, this.$fileSource$inlined, i7bVar.d);
                com.yandex.messaging.chat.attachments.b bVar = (com.yandex.messaging.chat.attachments.b) this.this$0.m.get();
                String str3 = this.this$0.b.b;
                yw80 yw80Var2 = this.$message$inlined;
                this.L$0 = f7bVar2;
                this.label = 2;
                a = bVar.a(str3, yw80Var2, this);
            }
            return coroutineSingletons2;
        }
        if (i2 == 1) {
            f7b f7bVar4 = (f7b) this.L$0;
            kotlin.b.b(obj);
            f7bVar2 = f7bVar4;
            c = obj;
            dc3Var = (dc3) c;
        } else {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f7b f7bVar5 = (f7b) this.L$0;
            kotlin.b.b(obj);
            f7bVar2 = f7bVar5;
            a = obj;
            dc3Var = (dc3) a;
        }
        i7b i7bVar2 = this.this$0;
        yw80 yw80Var3 = this.$message$inlined;
        jsa0 jsa0Var = this.$callback$inlined;
        long j2 = this.$msgInternalId$inlined;
        x08 x08Var = wfz.z;
        at10 at10Var = i7bVar2.q;
        if (dc3Var instanceof bc3) {
            x08Var = i7bVar2.d(ax80.a(i7bVar2.e, yw80Var3, ((bc3) dc3Var).a, yw80Var3.h, yw80Var3.i), j2, jsa0Var);
        } else if (dc3Var instanceof ac3) {
            t3z t3zVar = LocalMessageRef.Companion;
            String str4 = yw80Var3.a;
            t3zVar.getClass();
            at10Var.a(t3z.b(str4), 3);
            ((qsa0) jsa0Var).a();
        } else if (dc3Var instanceof zb3) {
            t3z t3zVar2 = LocalMessageRef.Companion;
            String str5 = yw80Var3.a;
            t3zVar2.getClass();
            at10Var.a(t3z.b(str5), 4);
            ((qsa0) jsa0Var).a();
        } else if (dc3Var instanceof yb3) {
            t3z t3zVar3 = LocalMessageRef.Companion;
            String str6 = yw80Var3.a;
            t3zVar3.getClass();
            at10Var.a(t3z.b(str6), 5);
            ((qsa0) jsa0Var).a();
        } else {
            if (!(dc3Var instanceof cc3)) {
                w511.b();
                return null;
            }
            t3z t3zVar4 = LocalMessageRef.Companion;
            String str7 = yw80Var3.a;
            t3zVar4.getClass();
            at10Var.a(t3z.b(str7), 6);
            String str8 = yw80Var3.a;
            if (((pm50) i7bVar2.s.get()).c && (i7bVar2.r.a(tz10.V) || ((A = i7bVar2.c.A()) != null && jl40.l(A.k, "neophonish")))) {
                tje.N(i7bVar2.v, null, null, new ChatOutgoingMessageHandler$tryShowNeophonishUpgradeDialog$1(i7bVar2, str8, null), 3);
            }
            ((qsa0) jsa0Var).a();
        }
        f7bVar2.a = new cn2(x08Var, 1);
        return zy11.a;
    }
}

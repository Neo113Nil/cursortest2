package xsna;

import android.annotation.SuppressLint;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import xsna.gtb0;

/* compiled from: DefaultPollVoteController.kt */
/* loaded from: classes18.dex */
public final class ukl implements gtb0 {
    public a a;

    /* compiled from: DefaultPollVoteController.kt */
    public interface a {
        void a();

        io.reactivex.rxjava3.core.q b(io.reactivex.rxjava3.internal.operators.observable.i0 i0Var);

        void c(Poll poll);

        void d(Throwable th, Poll poll);

        void e();

        Poll getCurrentPoll();
    }

    @Override // xsna.gtb0
    @SuppressLint({"CheckResult"})
    public final void a(gtb0.a aVar, List<Long> list, String str) {
        UserId userId = aVar.a;
        int i = aVar.b;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new rtb0(userId, aVar.d, aVar.e, aVar.c, list, i, str), null, null, 3);
        f60 f60Var = new f60(new i4h(aVar, 11), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        new io.reactivex.rxjava3.internal.operators.observable.i0(y0.E(f60Var, lVar, kVar, kVar), new aa6(new p4f(this, 15), 13)).subscribe(new eu0(new b5h(this, 7), 19), new fu0(new fre(this, 16), 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [io.reactivex.rxjava3.core.q] */
    @Override // xsna.gtb0
    @SuppressLint({"CheckResult"})
    public final void b(gtb0.a aVar) {
        UserId userId = aVar.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new aub0(aVar.b, userId, aVar.d, aVar.e, aVar.c), null, null, 3);
        h60 h60Var = new h60(new nhe(aVar, 11), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(y0.E(h60Var, lVar, kVar, kVar), new rf1(new n3i(this, 5), 18));
        a aVar2 = this.a;
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var2 = i0Var;
        if (aVar2 != null) {
            i0Var2 = aVar2.b(i0Var);
        }
        i0Var2.subscribe(new c60(new mmf(this, 17), 20), new bn3(new j6e(this, 15), 22));
    }
}

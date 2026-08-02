package xsna;

import android.content.Context;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.money.createtransfer.people.CreatePeopleTransferPresenter;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CreatePeopleTransferPresenter.kt */
/* loaded from: classes3.dex */
public final class k9k {
    public final /* synthetic */ CreatePeopleTransferPresenter a;
    public final /* synthetic */ Context b;

    public k9k(CreatePeopleTransferPresenter createPeopleTransferPresenter, Context context) {
        this.a = createPeopleTransferPresenter;
        this.b = context;
    }

    public final void a(Throwable th) {
        CreatePeopleTransferPresenter createPeopleTransferPresenter = this.a;
        createPeopleTransferPresenter.o.Ao(th);
        createPeopleTransferPresenter.n = false;
    }

    public final void b(s730 s730Var) {
        CreatePeopleTransferPresenter createPeopleTransferPresenter = this.a;
        CreatePeopleTransferFragment createPeopleTransferFragment = createPeopleTransferPresenter.o;
        if (s730Var instanceof lmf0) {
            createPeopleTransferFragment.Bo(((lmf0) s730Var).a);
            createPeopleTransferPresenter.n = false;
            return;
        }
        if (!(s730Var instanceof ijp0)) {
            if (!s730Var.equals(cgq.a)) {
                throw new NoWhenBranchMatchedException();
            }
            createPeopleTransferPresenter.n = false;
            createPeopleTransferFragment.wo();
            return;
        }
        String str = ((ijp0) s730Var).a;
        io.reactivex.rxjava3.internal.operators.observable.e1 R = io.reactivex.rxjava3.core.q.R(2L, TimeUnit.SECONDS);
        Context context = this.b;
        io.reactivex.rxjava3.core.q L = hg1.m(R, context, 0L, false, 62).L(new c7(new v63(str, createPeopleTransferPresenter, context, 7), 24), false);
        e7 e7Var = new e7(new pf(23), 19);
        L.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.q2(L, e7Var), new g7(new rf(27), 15));
        gsa gsaVar = new gsa(createPeopleTransferPresenter, 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        ver0.c(context, i0Var.E(lVar, lVar, io.reactivex.rxjava3.internal.functions.a.c, gsaVar).subscribe(new el6(new srg(createPeopleTransferPresenter, 5), 15), new mf1(new com.vk.movika.sdk.base.logic.interactor.e(createPeopleTransferPresenter, 25), 18)));
    }
}

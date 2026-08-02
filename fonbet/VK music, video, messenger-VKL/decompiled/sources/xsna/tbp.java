package xsna;

import com.vk.api.generated.account.dto.AccountMarkActualizeEmailActionDto;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EmailActualizationBottomSheet.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class tbp extends FunctionReferenceImpl implements gzs<s3q0> {
    @Override // xsna.gzs
    public final s3q0 invoke() {
        ubp ubpVar = (ubp) this.receiver;
        ubpVar.a().e(ubpVar.c);
        AccountMarkActualizeEmailActionDto accountMarkActualizeEmailActionDto = AccountMarkActualizeEmailActionDto.CONFIRM;
        ufx ufxVar = new ufx("account.markActualizeEmail", new ir(0), new qr(0));
        ufx.k(ufxVar, "action", accountMarkActualizeEmailActionDto.i(), 0, 12);
        bx2 e = e370.e(ufxVar);
        e.n = ubpVar.b;
        e.o = null;
        ubpVar.e.b(hg1.i(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(rdx0.p(e).m(io.reactivex.rxjava3.android.schedulers.a.b()), new xn(new lbe(ubpVar, 19), 16)), new qbp(ubpVar, 0)).h(new i22(new ozh(ubpVar, 12), 21)), new pm1(new cqf(ubpVar, 18), 19)), new e420(19)));
        return s3q0.a;
    }
}

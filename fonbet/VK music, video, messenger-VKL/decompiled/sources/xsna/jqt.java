package xsna;

import com.vk.voip.dto.call_member.CallMember;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.List;

/* compiled from: GetCallParticipantsLockDelegate.kt */
/* loaded from: classes7.dex */
public final class jqt {
    public final iqt a;
    public final izs<List<CallMember>, s3q0> b;
    public List<CallMember> c;
    public final io.reactivex.rxjava3.disposables.c d;

    /* JADX WARN: Multi-variable type inference failed */
    public jqt(iqt iqtVar, izs<? super List<CallMember>, s3q0> izsVar) {
        this.a = iqtVar;
        this.b = izsVar;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.d = emptyDisposable;
        emptyDisposable.getClass();
        this.d = new io.reactivex.rxjava3.internal.operators.observable.i0(iqtVar.b(), new rt0(new x50(19), 16)).subscribe(new st0(new i4h(this, 26), 20));
    }
}

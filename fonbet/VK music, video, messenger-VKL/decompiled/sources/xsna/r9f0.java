package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fcw;

/* compiled from: RecentSearchedDialogsRepository.kt */
/* loaded from: classes2.dex */
public final class r9f0 implements ibw {
    public final Source a;
    public final a1w b;
    public final FunctionReferenceImpl c;
    public final FunctionReferenceImpl d;

    /* JADX WARN: Multi-variable type inference failed */
    public r9f0(Source source, a1w a1wVar, izs<? super Dialog, Boolean> izsVar, izs<? super Dialog, Boolean> izsVar2) {
        this.a = source;
        this.b = a1wVar;
        this.c = (FunctionReferenceImpl) izsVar;
        this.d = (FunctionReferenceImpl) izsVar2;
    }

    @Override // xsna.ibw
    public final io.reactivex.rxjava3.internal.operators.single.y a(fcw.a aVar, Object obj) {
        return this.b.C(obj, new i9f0(this.a, true)).l(new q9f0(new il7(15, this, aVar), 0));
    }
}

package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fcw;

/* compiled from: ImportantDialogsRepository.kt */
/* loaded from: classes2.dex */
public final class sqw implements ibw {
    public final Source a;
    public final a1w b;
    public final FunctionReferenceImpl c;
    public final FunctionReferenceImpl d;

    /* JADX WARN: Multi-variable type inference failed */
    public sqw(Source source, a1w a1wVar, izs<? super Dialog, Boolean> izsVar, izs<? super Dialog, Boolean> izsVar2) {
        this.a = source;
        this.b = a1wVar;
        this.c = (FunctionReferenceImpl) izsVar;
        this.d = (FunctionReferenceImpl) izsVar2;
    }

    @Override // xsna.ibw
    public final io.reactivex.rxjava3.internal.operators.single.y a(fcw.a aVar, Object obj) {
        a1w a1wVar = this.b;
        return a1wVar.C(obj, new t6v(a1wVar.r().n, this.a, true)).l(new d22(new m9(19, this, aVar), 23));
    }
}

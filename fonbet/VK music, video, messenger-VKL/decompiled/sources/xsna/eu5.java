package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes11.dex */
public interface eu5 extends azl {
    default long A1() {
        return 0L;
    }

    Object I1(PointerEventPass pointerEventPass, spj<? super plb0> spjVar);

    default Object L0(long j, wzs wzsVar, ContinuationImpl continuationImpl) {
        return wzsVar.invoke(this, continuationImpl);
    }

    long a();

    default Object f0(long j, wzs wzsVar, BaseContinuationImpl baseContinuationImpl) {
        return wzsVar.invoke(this, baseContinuationImpl);
    }

    rut0 getViewConfiguration();

    plb0 z0();
}

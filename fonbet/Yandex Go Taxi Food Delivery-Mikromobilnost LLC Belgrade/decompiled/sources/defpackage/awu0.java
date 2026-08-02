package defpackage;

import com.yandex.plus.pay.inapp.api.PlusPayInAppProductType;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class awu0 implements ocd0 {
    @Override // defpackage.ocd0
    public final Object a(List list, PlusPayInAppProductType plusPayInAppProductType, ContinuationImpl continuationImpl) {
        return EmptyList.a;
    }

    @Override // defpackage.ocd0
    public final Object b(PlusPayInAppProductType plusPayInAppProductType, ContinuationImpl continuationImpl) {
        return EmptyList.a;
    }

    @Override // defpackage.ocd0
    public final Object c(rcd0 rcd0Var, ContinuationImpl continuationImpl) {
        return zy11.a;
    }

    @Override // defpackage.ocd0
    public final Object d(bwt bwtVar, ucd0 ucd0Var, ContinuationImpl continuationImpl) {
        throw new IllegalStateException("purchase() must not be called for stub in app facade");
    }

    @Override // defpackage.ocd0
    public final Object e(ContinuationImpl continuationImpl) {
        return new mcd0("unknown");
    }
}

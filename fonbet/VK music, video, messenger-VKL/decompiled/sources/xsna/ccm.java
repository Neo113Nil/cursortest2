package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.dcm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ccm implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ccm(int i, izs izsVar, z7w z7wVar) {
        this.b = 1;
        this.c = i;
        this.d = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                dcm.a aVar = (dcm.a) obj2;
                if (aVar == null || !aVar.b) {
                    ref$BooleanRef.element = true;
                    return aVar != null ? dcm.a.a(aVar, null, true, false, 13) : new dcm.a(this.c, 5);
                }
                ref$BooleanRef.element = false;
                return aVar;
            case 1:
                Integer num = (Integer) obj2;
                return (!Boolean.TRUE.booleanValue() || num.intValue() >= this.c) ? io.reactivex.rxjava3.core.q.H((Throwable) obj) : io.reactivex.rxjava3.core.q.B0(((Number) ((izs) this.d).invoke(num)).longValue(), TimeUnit.MILLISECONDS);
            default:
                ((Integer) obj2).intValue();
                ((qkk0) this.d).h(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ ccm(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}

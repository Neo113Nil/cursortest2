package xsna;

import java.util.ArrayList;
import java.util.regex.MatchResult;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class om8 extends FunctionReferenceImpl implements yzs {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ om8(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                fvr.g(((nm8) this.receiver).c, obj2, (kotlin.coroutines.d) obj3);
                return s3q0.a;
            default:
                int intValue = ((Number) obj3).intValue();
                return Boolean.valueOf(((udz) this.receiver).j((MatchResult) obj, (ArrayList) obj2, intValue));
        }
    }

    public om8(nm8 nm8Var) {
        super(3, nm8Var, nm8.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }
}

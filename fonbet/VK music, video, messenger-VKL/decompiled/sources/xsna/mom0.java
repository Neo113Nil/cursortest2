package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKInternalServerErrorException;
import com.vk.core.apps.BuildInfo;
import com.vk.internal.api.StreamParsingException;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.internal.ToggleManager;
import com.vkontakte.android.VKApplication;
import java.io.InterruptedIOException;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: StrategyParserDelegate.kt */
/* loaded from: classes.dex */
public final class mom0<T, R> {
    public static volatile Boolean d;
    public final f03<T> a;
    public final FunctionReferenceImpl b;
    public final izs<T, R> c;

    static {
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mom0(f03<T> f03Var, izs<? super JSONObject, ? extends R> izsVar, izs<? super T, ? extends R> izsVar2) {
        this.a = f03Var;
        this.b = (FunctionReferenceImpl) izsVar;
        this.c = izsVar2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public final per0 a(qrj0 qrj0Var, qrj0 qrj0Var2) {
        Boolean bool = d;
        Boolean bool2 = Boolean.TRUE;
        if (epx.f(bool, bool2)) {
            return b(qrj0Var, qrj0Var2);
        }
        if (epx.f(d, Boolean.FALSE)) {
            Object invoke = qrj0Var2.a.invoke();
            Object invoke2 = qrj0Var2.b.invoke(invoke);
            per0<R> per0Var = new per0<>(this.b.invoke((JSONObject) invoke2));
            qrj0Var2.c.invoke(invoke, invoke2, per0Var);
            return per0Var;
        }
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.d != ToggleManager.Sync.Done) {
            Object invoke3 = qrj0Var2.a.invoke();
            Object invoke4 = qrj0Var2.b.invoke(invoke3);
            per0<R> per0Var2 = new per0<>(this.b.invoke((JSONObject) invoke4));
            qrj0Var2.c.invoke(invoke3, invoke4, per0Var2);
            return per0Var2;
        }
        CoreFeatures coreFeatures = CoreFeatures.API_STREAM_RESPONSE_PARSE;
        coreFeatures.getClass();
        d = Boolean.valueOf(bVar.a(coreFeatures));
        if (epx.f(d, bool2)) {
            return b(qrj0Var, qrj0Var2);
        }
        Object invoke5 = qrj0Var2.a.invoke();
        Object invoke6 = qrj0Var2.b.invoke(invoke5);
        per0<R> per0Var3 = new per0<>(this.b.invoke((JSONObject) invoke6));
        qrj0Var2.c.invoke(invoke5, invoke6, per0Var3);
        return per0Var3;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public final per0 b(qrj0 qrj0Var, qrj0 qrj0Var2) {
        Object failure;
        try {
            failure = qrj0Var.a(new cim0(this, 1));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            if (a instanceof InterruptedException) {
                throw a;
            }
            if (a instanceof InterruptedIOException) {
                throw a;
            }
            if (h03.a(a)) {
                throw a;
            }
            if (a instanceof VKApiExecutionException) {
                throw a;
            }
            if (a instanceof VKInternalServerErrorException) {
                throw a;
            }
            Object invoke = qrj0Var2.a.invoke();
            Object invoke2 = qrj0Var2.b.invoke(invoke);
            per0<R> per0Var = new per0<>(this.b.invoke((JSONObject) invoke2));
            qrj0Var2.c.invoke(invoke, invoke2, per0Var);
            R a2 = per0Var.a();
            if (a2 != null) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                StreamParsingException streamParsingException = new StreamParsingException(a2.getClass().getSimpleName());
                mnh0.d(streamParsingException, a);
                bVar.a(streamParsingException);
            }
            failure = per0Var;
        }
        return (per0) failure;
    }
}

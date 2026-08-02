package xsna;

import com.vk.translate.impl.models.SupportedTranslateLanguage;
import java.util.Iterator;

/* compiled from: MessageTranslatorImpl.kt */
/* loaded from: classes6.dex */
public final class ec20 implements yb20 {
    public final a1w a;
    public final ofy0 b;
    public final hw3 c;

    public ec20(a1w a1wVar, ofy0 ofy0Var, hw3 hw3Var) {
        this.a = a1wVar;
        this.b = ofy0Var;
        this.c = hw3Var;
    }

    @Override // xsna.yb20
    public final io.reactivex.rxjava3.internal.operators.single.f0 a(yi30 yi30Var, wnp0 wnp0Var) {
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new al9(this, 1)).h(new cc20(new o8(com.vk.metrics.eventtracking.b.a, 8), 0)).o(Boolean.FALSE), new h8(new n15(this, yi30Var, wnp0Var, 7), 24)).q(asu0.a.c());
    }

    public final SupportedTranslateLanguage b(String str) {
        Object obj;
        Iterator it = this.c.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((SupportedTranslateLanguage) obj).d(), str)) {
                break;
            }
        }
        SupportedTranslateLanguage supportedTranslateLanguage = (SupportedTranslateLanguage) obj;
        if (supportedTranslateLanguage != null) {
            return supportedTranslateLanguage;
        }
        throw new IllegalArgumentException(zr.a("languageCode = ", str, " not supported for translate"));
    }
}

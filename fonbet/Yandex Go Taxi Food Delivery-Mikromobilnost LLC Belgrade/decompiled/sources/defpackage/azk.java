package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class azk implements qfy0 {
    public final JsonParserComponent a;

    public azk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vyk a(yf90 yf90Var, dzk dzkVar, JSONObject jSONObject) {
        exq exqVar = dzkVar.a;
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        zrk zrkVar = bzk.b;
        kvo kvoVar = bzk.a;
        ?? n = xcx.n(yf90Var, exqVar, jSONObject, "angle", tmsVar, tlsVar, zrkVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        exq exqVar2 = dzkVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        List r = xcx.r(yf90Var, exqVar2, jSONObject, jsonParserComponent.f5, jsonParserComponent.d5, bzk.d);
        exq exqVar3 = dzkVar.c;
        rms rmsVar = wm11.f;
        tls tlsVar2 = b.a;
        return new vyk(kvoVar, r, xcx.p(yf90Var, exqVar3, jSONObject, rmsVar, bzk.c));
    }
}

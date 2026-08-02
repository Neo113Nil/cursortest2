package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;
import ru.rt.ebs.cryptosdk.core.verification.consumer.data.a;
import ru.rt.ebs.cryptosdk.core.verification.consumer.entities.models.ResVrfRequest;
import ru.rt.ebs.cryptosdk.core.verification.consumer.entities.models.ResVrfResponse;

/* loaded from: classes4.dex */
public final class m9e {
    public final h9e a;

    public m9e(h9e h9eVar) {
        this.a = h9eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Token token, Token token2, Token token3, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        if (continuationImpl instanceof a) {
            aVar = (a) continuationImpl;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                Object obj = aVar.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.c;
                if (i != 0) {
                    b.b(obj);
                    Map i3 = kotlin.collections.b.i(new Pair("Content-Type", "application/json;charset=UTF-8"), new Pair("Authorization", "Bearer ".concat(token.toString())));
                    ResVrfRequest resVrfRequest = new ResVrfRequest(token2.getValue(), token3.getValue());
                    aVar.c = 1;
                    HttpsMethod httpsMethod = HttpsMethod.POST;
                    zwu zwuVar = new zwu("api/resvrf");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : i3.entrySet()) {
                        linkedHashMap3.put((String) entry.getKey(), Collections.singletonList((String) entry.getValue()));
                    }
                    xwu xwuVar = new xwu(httpsMethod, zwuVar, linkedHashMap, linkedHashMap2, linkedHashMap3, resVrfRequest, arrayList);
                    qwu qwuVar = (qwu) this.a.b;
                    obj = tje.k0(qwuVar.g.io(), new ru.rt.ebs.cryptosdk.core.network.entities.models.https.client.a(qwuVar, xwuVar, ResVrfResponse.class, null), aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return new Token(((ResVrfResponse) obj).getCookieVrf());
            }
        }
        aVar = new a(this, continuationImpl);
        Object obj2 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.c;
        if (i != 0) {
        }
        return new Token(((ResVrfResponse) obj2).getCookieVrf());
    }
}

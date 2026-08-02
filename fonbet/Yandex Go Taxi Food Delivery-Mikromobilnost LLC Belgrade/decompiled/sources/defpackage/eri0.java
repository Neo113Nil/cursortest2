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
import ru.rt.ebs.cryptosdk.core.registration.data.a;
import ru.rt.ebs.cryptosdk.core.registration.entities.exceptions.RegistrationEbsException;
import ru.rt.ebs.cryptosdk.core.registration.entities.models.UpdateRegistrationRequest;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;

/* loaded from: classes4.dex */
public final class eri0 {
    public final h9e a;
    public final IKeyStorage b;

    public eri0(h9e h9eVar, IKeyStorage iKeyStorage) {
        this.a = h9eVar;
        this.b = iKeyStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Token token, Token token2, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        try {
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
                        h9e h9eVar = this.a;
                        Map e = gw00.e(new Pair("Content-Type", "application/json;charset=UTF-8"));
                        UpdateRegistrationRequest updateRegistrationRequest = new UpdateRegistrationRequest(token.getValue(), token2.getValue());
                        aVar.c = 1;
                        HttpsMethod httpsMethod = HttpsMethod.POST;
                        zwu zwuVar = new zwu("kpm/api/v1/UpdateRegStatus");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : e.entrySet()) {
                            linkedHashMap3.put((String) entry.getKey(), Collections.singletonList((String) entry.getValue()));
                        }
                        obj = ((qwu) h9eVar.b).d(new xwu(httpsMethod, zwuVar, linkedHashMap, linkedHashMap2, linkedHashMap3, updateRegistrationRequest, arrayList), aVar);
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
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e2) {
            throw new RegistrationEbsException(e2);
        }
        aVar = new a(this, continuationImpl);
        Object obj2 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.c;
    }
}

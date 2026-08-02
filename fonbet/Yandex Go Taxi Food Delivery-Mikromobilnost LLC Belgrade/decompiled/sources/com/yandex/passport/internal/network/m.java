package com.yandex.passport.internal.network;

import com.yandex.passport.api.PassportUrlType;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.gc;
import defpackage.tje;
import kotlin.coroutines.EmptyCoroutineContext;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class m {
    public static Object a(com.yandex.passport.common.domain.a aVar, Object obj) {
        return tje.Y(EmptyCoroutineContext.a, new JavaUseCaseExecutor$execute$1(aVar, obj, null));
    }

    public static void b(com.yandex.passport.data.network.core.a aVar, gc gcVar) {
        tje.X(new JavaUseCaseExecutor$execute$2(aVar, gcVar, null));
    }

    public static String c(e eVar, Environment environment, long j) {
        l lVar = (l) eVar;
        lVar.getClass();
        return lVar.j(environment, PassportUrlType.FRONTEND_ID, Long.valueOf(j), com.yandex.passport.internal.flags.p.c, new j(lVar, environment, null, j)).a;
    }

    public static final String e(String str, JSONObject jSONObject) {
        String string;
        if (!jSONObject.has(str) || jSONObject.isNull(str) || (string = jSONObject.getString(str)) == null || string.length() == 0) {
            return null;
        }
        return string;
    }
}

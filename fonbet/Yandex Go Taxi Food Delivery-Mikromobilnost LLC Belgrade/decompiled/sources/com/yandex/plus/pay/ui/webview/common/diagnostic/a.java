package com.yandex.plus.pay.ui.webview.common.diagnostic;

import android.net.Uri;
import com.yandex.plus.log.api.LogPriority;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.tg21;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements tg21 {
    public final com.yandex.plus.domain.auth.impl.a a;
    public final pgz b;

    public a(com.yandex.plus.domain.auth.impl.a aVar, pgz pgzVar) {
        this.a = aVar;
        this.b = pgzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.tg21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, Continuation continuation) {
        PlusPayWebViewAuthorizedUrlCreator$create$1 plusPayWebViewAuthorizedUrlCreator$create$1;
        int i;
        String uri;
        Object h;
        boolean z;
        if (continuation instanceof PlusPayWebViewAuthorizedUrlCreator$create$1) {
            plusPayWebViewAuthorizedUrlCreator$create$1 = (PlusPayWebViewAuthorizedUrlCreator$create$1) continuation;
            int i2 = plusPayWebViewAuthorizedUrlCreator$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPayWebViewAuthorizedUrlCreator$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPayWebViewAuthorizedUrlCreator$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayWebViewAuthorizedUrlCreator$create$1.label;
                if (i != 0) {
                    b.b(obj);
                    Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Iterator it = ((Set) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            buildUpon.appendQueryParameter(str2, (String) it.next());
                        }
                    }
                    uri = buildUpon.build().toString();
                    plusPayWebViewAuthorizedUrlCreator$create$1.L$0 = str;
                    plusPayWebViewAuthorizedUrlCreator$create$1.L$1 = null;
                    plusPayWebViewAuthorizedUrlCreator$create$1.L$2 = null;
                    plusPayWebViewAuthorizedUrlCreator$create$1.L$3 = null;
                    plusPayWebViewAuthorizedUrlCreator$create$1.L$4 = uri;
                    plusPayWebViewAuthorizedUrlCreator$create$1.label = 1;
                    h = this.a.h(str, plusPayWebViewAuthorizedUrlCreator$create$1);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) plusPayWebViewAuthorizedUrlCreator$create$1.L$4;
                    String str4 = (String) plusPayWebViewAuthorizedUrlCreator$create$1.L$0;
                    b.b(obj);
                    h = ((Result) obj).getValue();
                    uri = str3;
                    str = str4;
                }
                z = h instanceof Result.Failure;
                pgz pgzVar = this.b;
                if (!z) {
                    LogPriority logPriority = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "PlusPayWebViewAuthorizedUrlCreator", "Injected cookie for " + str);
                    }
                }
                if (Result.a(h) != null) {
                    LogPriority logPriority2 = LogPriority.ERROR;
                    if (pgzVar.e(logPriority2)) {
                        pgzVar.a(logPriority2, "PlusPayWebViewAuthorizedUrlCreator", "Failed to inject cookie for " + str);
                    }
                }
                return uri;
            }
        }
        plusPayWebViewAuthorizedUrlCreator$create$1 = new PlusPayWebViewAuthorizedUrlCreator$create$1(this, (ContinuationImpl) continuation);
        Object obj2 = plusPayWebViewAuthorizedUrlCreator$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayWebViewAuthorizedUrlCreator$create$1.label;
        if (i != 0) {
        }
        z = h instanceof Result.Failure;
        pgz pgzVar2 = this.b;
        if (!z) {
        }
        if (Result.a(h) != null) {
        }
        return uri;
    }
}

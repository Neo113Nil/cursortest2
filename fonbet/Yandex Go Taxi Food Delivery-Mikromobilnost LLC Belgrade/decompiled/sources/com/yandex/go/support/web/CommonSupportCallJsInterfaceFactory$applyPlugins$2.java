package com.yandex.go.support.web;

import defpackage.di7;
import defpackage.qcx;
import defpackage.wls;
import defpackage.xnt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CommonSupportCallJsInterfaceFactory$applyPlugins$2 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        b bVar = (b) this.receiver;
        bVar.getClass();
        try {
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) qcx.m((kotlinx.serialization.json.b) ((xnt) bVar.b).c(str, kotlinx.serialization.json.b.Companion.serializer())).get("count");
            Integer valueOf = bVar2 != null ? Integer.valueOf(qcx.j(qcx.n(bVar2))) : null;
            if (valueOf == null) {
                return new di7(null, "{}");
            }
            bVar.a.b(valueOf.intValue());
            return new di7("{}", null);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return new di7(null, "{}");
        }
    }
}

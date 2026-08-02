package com.ybsdk.utils.smsretriever;

import defpackage.e5z0;
import defpackage.i5z0;
import defpackage.tls;
import defpackage.zy11;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class SmsRetrieverHelper$smsRetrieverReceiver$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        Matcher matcher = a.g.matcher(str);
        if (matcher.find()) {
            aVar.f.l(matcher.group(1));
        } else {
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("SmsRetrieverHelper");
            e5z0Var.a("Sms message don't match pattern: ".concat(str), new Object[0]);
        }
        return zy11.a;
    }
}

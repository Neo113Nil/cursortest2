package com.yandex.payment.sdk.ui.challenger;

import defpackage.egm0;
import defpackage.oyr;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class SbpChallengerViewModel$initConfig$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String sb;
        String str = (String) obj;
        egm0 egm0Var = (egm0) this.receiver;
        egm0Var.getClass();
        if (str.length() == 3) {
            StringBuilder sb2 = new StringBuilder();
            oyr.C(0, 1, str, Extension.DOT_CHAR, sb2);
            sb2.append(str.substring(1));
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            oyr.C(0, 2, str, Extension.DOT_CHAR, sb3);
            sb3.append(str.substring(2));
            sb = sb3.toString();
        }
        egm0Var.b0(sb);
        return zy11.a;
    }
}

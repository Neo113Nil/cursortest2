package com.yandex.payment.divkit.challenger;

import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import defpackage.n891;
import defpackage.oyr;
import defpackage.psf;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class DKChallengerFragment$onViewCreated$3$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String sb;
        String str = (String) obj;
        psf psfVar = (psf) this.receiver;
        SbpChallengeInfo sbpChallengeInfo = psfVar.C;
        if (n891.o(sbpChallengeInfo != null ? Boolean.valueOf(sbpChallengeInfo.isSmsChallenge()) : null)) {
            psfVar.Z(str);
        } else {
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
            psfVar.Z(sb);
        }
        return zy11.a;
    }
}

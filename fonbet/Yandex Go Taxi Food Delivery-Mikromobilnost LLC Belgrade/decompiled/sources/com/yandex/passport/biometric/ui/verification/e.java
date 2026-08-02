package com.yandex.passport.biometric.ui.verification;

import com.yandex.passport.common.ebs.BiometricAuthSdkProperties;
import defpackage.ane;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.orb1;
import defpackage.wwg;
import defpackage.yr31;
import java.net.URI;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.EbsCryptoSdk;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.BioCollectionType;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;

/* loaded from: classes15.dex */
public final class e extends yr31 {
    public final r0 b;
    public final gci0 c;

    public static abstract class a {

        /* renamed from: com.yandex.passport.biometric.ui.verification.e$a$a, reason: collision with other inner class name */
        public static final class C0089a extends a {
            public static final C0089a a = new C0089a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0089a);
            }

            public final int hashCode() {
                return -319118263;
            }

            public final String toString() {
                return "Initializing";
            }
        }
    }

    public e() {
        r0 c = bvf0.c(a.C0089a.a);
        this.b = c;
        this.c = kotlinx.coroutines.flow.e.d(c);
        EbsCryptoSdk.registerLogger(new com.yandex.passport.biometric.utils.a());
    }

    public static final VerificationRequestScheme.WithoutEsia W(BiometricAuthSdkProperties biometricAuthSdkProperties) {
        Object obj;
        Object obj2;
        String bioCollectionType = biometricAuthSdkProperties.getBioCollectionType();
        Iterator<E> it = BioCollectionType.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((BioCollectionType) obj).getMnemonic(), bioCollectionType)) {
                break;
            }
        }
        BioCollectionType bioCollectionType2 = (BioCollectionType) obj;
        if (bioCollectionType2 == null) {
            bioCollectionType2 = BioCollectionType.FACE_ONLY_AGE;
        }
        BioCollectionType bioCollectionType3 = bioCollectionType2;
        Token token = new Token(biometricAuthSdkProperties.getSid());
        URI create = URI.create(biometricAuthSdkProperties.getTibUri());
        URI create2 = URI.create(biometricAuthSdkProperties.getConsumerApiUri());
        Token token2 = new Token(biometricAuthSdkProperties.getTrackId());
        Token token3 = new Token(biometricAuthSdkProperties.getEsiaSessionId());
        URI create3 = URI.create(String.format(biometricAuthSdkProperties.getEbsUriTemplate(), Arrays.copyOf(new Object[]{biometricAuthSdkProperties.getEsiaSessionId()}, 1)));
        String tibUri = biometricAuthSdkProperties.getTibUri();
        String esiaCookie = biometricAuthSdkProperties.getEsiaCookie();
        Pattern pattern = ane.k;
        jwu jwuVar = new jwu();
        jwuVar.i(null, tibUri);
        Iterator it2 = orb1.d(jwuVar.e(), wwg.z("Set-Cookie", esiaCookie)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((ane) obj2).a.equals("adapter")) {
                break;
            }
        }
        ane aneVar = (ane) obj2;
        String str = aneVar != null ? aneVar.b : null;
        if (str == null) {
            str = "";
        }
        return new VerificationRequestScheme.WithoutEsia(bioCollectionType3, token, create, false, create2, token2, token3, create3, str);
    }
}

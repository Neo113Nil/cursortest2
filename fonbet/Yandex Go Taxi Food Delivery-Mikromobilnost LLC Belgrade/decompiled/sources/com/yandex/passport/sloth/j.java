package com.yandex.passport.sloth;

import defpackage.b64;
import defpackage.w511;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public abstract class j {
    public static String a(List list) {
        return kotlin.collections.a.X(list, ",", null, null, SlothError$Companion$errorsMultiStringFromList$1.b, 30);
    }

    public static final String b(a1 a1Var) {
        if (a1Var.equals(b.a)) {
            return "FailedToProcessCurrentAuth";
        }
        if (a1Var.equals(d.a)) {
            return "SlothClosedResult";
        }
        if (a1Var.equals(j0.a)) {
            return "SlothFinishAccountDeletion";
        }
        if (a1Var.equals(j0.b)) {
            return "SlothFinishRegisterWebAuthN";
        }
        if (a1Var instanceof m) {
            return ((m) a1Var).toString();
        }
        if (a1Var instanceof m0) {
            StringBuilder sb = new StringBuilder("SlothLoginResult(");
            m0 m0Var = (m0) a1Var;
            sb.append(m0Var.b);
            sb.append(Extension.FIX_SPACE);
            sb.append(m0Var.c);
            sb.append(Extension.FIX_SPACE);
            return b64.p(sb, m0Var.d, ')');
        }
        if (a1Var instanceof x0) {
            return ((x0) a1Var).toString();
        }
        if (a1Var instanceof c) {
            return ((c) a1Var).toString();
        }
        if (a1Var instanceof w) {
            return ((w) a1Var).toString();
        }
        if (!(a1Var instanceof a)) {
            w511.b();
            return null;
        }
        return "DeviceId = " + ((a) a1Var).a;
    }
}

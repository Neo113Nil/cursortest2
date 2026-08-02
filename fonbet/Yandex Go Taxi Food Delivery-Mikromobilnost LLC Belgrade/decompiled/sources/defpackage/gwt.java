package defpackage;

import android.util.Base64;
import java.io.StringReader;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes9.dex */
public abstract class gwt {
    public static final PublicKey a;

    static {
        tra0 tra0Var;
        String substring;
        int indexOf;
        String readLine;
        ura0 ura0Var = new ura0(new StringReader("-----BEGIN PUBLIC KEY-----\n           MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAsu0BHGnQ++W2CTdyZyxv\n           HHRALOZPlnu/VMVgo2m+JZ8MNbAOH2cgXb8mvOj8flsX/qPMuKIaauO+PwROMjiq\n           fUpcFm80Kl7i97ZQyBDYKm3MkEYYpGN+skAR2OebX9G2DfDqFY8+jUpOOWtBNr3L\n           rmVcwx+FcFdMjGDlrZ5JRmoJ/SeGKiORkbbu9eY1Wd0uVhz/xI5bQb0OgII7hEj+\n           i/IPbJqOHgB8xQ5zWAJJ0DmG+FM6o7gk403v6W3S8qRYiR84c50KppGwe4YqSMkF\n           bLDleGQWLoaDSpEWtESisb4JiLaY4H+Kk0EyAhPSb+49JfUozYl+lf7iFN3qRq/S\n           IXXTh6z0S7Qa8EYDhKGCrpI03/+qprwy+my6fpWHi6aUIk4holUCmWvFxZDfixox\n           K0RlqbFDl2JXMBquwlQpm8u5wrsic1ksIv9z8x9zh4PJqNpCah0ciemI3YGRQqSe\n           /mRRXBiSn9YQBUPcaeqCYan+snGADFwHuXCd9xIAdFBolw9R9HTedHGUfVXPJDiF\n           4VusfX6BRR/qaadB+bqEArF/TzuDUr6FvOR4o8lUUxgLuZ/7HO+bHnaPFKYHHSm+\n           +z1lVDhhYuSZ8ax3T0C3FZpb7HMjZtpEorSV5ElKJEJwrhrBCMOD8L01EoSPrGlS\n           1w22i9uGHMn/uGQKo28u7AsCAwEAAQ==\n           -----END PUBLIC KEY-----"));
        String readLine2 = ura0Var.readLine();
        while (readLine2 != null && !readLine2.startsWith("-----BEGIN ")) {
            readLine2 = ura0Var.readLine();
        }
        if (readLine2 == null || (indexOf = (substring = readLine2.substring(11)).indexOf(45)) <= 0 || !substring.endsWith("-----") || substring.length() - indexOf != 5) {
            tra0Var = null;
        } else {
            String concat = "-----END ".concat(substring.substring(0, indexOf));
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList arrayList = new ArrayList();
            while (true) {
                readLine = ura0Var.readLine();
                if (readLine == null) {
                    break;
                }
                int indexOf2 = readLine.indexOf(58);
                if (indexOf2 >= 0) {
                    arrayList.add(new sra0(readLine.substring(0, indexOf2), readLine.substring(indexOf2 + 1).trim()));
                } else if (readLine.indexOf(concat) != -1) {
                    break;
                } else {
                    stringBuffer.append(readLine.trim());
                }
            }
            if (readLine == null) {
                ny61.v(concat.concat(" not found"));
                return;
            }
            byte[] decode = Base64.decode(stringBuffer.toString(), 0);
            tra0Var = new tra0();
            Collections.unmodifiableList(arrayList);
            tra0Var.a = decode;
        }
        a = uh6.u(tra0Var.a);
    }
}

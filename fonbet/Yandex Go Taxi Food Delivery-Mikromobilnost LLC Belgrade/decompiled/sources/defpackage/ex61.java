package defpackage;

import java.io.OutputStream;
import java.security.AlgorithmParameters;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.OmacParamsSpec;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public final class ex61 extends CipherOutputStream {
    public final /* synthetic */ no6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex61(no6 no6Var, OutputStream outputStream, Cipher cipher) {
        super(outputStream, cipher);
        this.a = no6Var;
    }

    @Override // javax.crypto.CipherOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        no6 no6Var = this.a;
        if (no6Var.a) {
            SecretKey secretKey = (SecretKey) no6Var.b;
            if (secretKey instanceof SpecKey) {
                ((SpecKey) secretKey).clear();
            }
        }
        AlgorithmParameters parameters = ((Cipher) no6Var.w).getParameters();
        if (parameters == null || !parameters.getAlgorithm().equalsIgnoreCase(JCP.GOST_OMAC_NAME)) {
            return;
        }
        try {
            OmacParamsSpec omacParamsSpec = (OmacParamsSpec) parameters.getParameterSpec(OmacParamsSpec.class);
            et61 et61Var = (et61) no6Var.x;
            byte[] omacValue = omacParamsSpec.getOmacValue();
            et61Var.getClass();
            et61Var.c = Array.copy(omacValue);
        } catch (InvalidParameterSpecException e) {
            kbs.r(e);
        }
    }
}

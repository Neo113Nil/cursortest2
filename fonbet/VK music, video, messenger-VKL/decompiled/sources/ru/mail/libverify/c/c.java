package ru.mail.libverify.c;

import android.annotation.SuppressLint;
import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class c {
    @SuppressLint({"GetInstance"})
    public static final String a() {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, new SecretKeySpec(Base64.decode("R1DhaJqD2Xvr9WnaYRSluj/E5Wp5uhOLA9fgFMQCQRw=", 2), "AES"));
            return new String(cipher.doFinal(Base64.decode("LNZrigBD/02VR1dPpu0n/Q==", 2)), Charset.forName(C.UTF8_NAME));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

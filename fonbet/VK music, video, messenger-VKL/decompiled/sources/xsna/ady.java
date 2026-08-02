package xsna;

import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key.java */
/* loaded from: classes12.dex */
public interface ady {
    public static final Charset a = Charset.forName(C.UTF8_NAME);

    void b(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}

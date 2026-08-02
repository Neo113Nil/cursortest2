package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Result;

/* loaded from: classes7.dex */
public final class i771 {
    public static final i771 a = new i771();

    public static final byte[] a(String str) {
        Object failure;
        try {
            if (str == null) {
                str = "";
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    failure = rzo.R(gZIPInputStream);
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = new byte[0];
        }
        return (byte[]) failure;
    }

    public static final String b(String str) {
        Object failure;
        try {
            failure = new String(a(str), uza.a);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = "";
        }
        return (String) failure;
    }
}

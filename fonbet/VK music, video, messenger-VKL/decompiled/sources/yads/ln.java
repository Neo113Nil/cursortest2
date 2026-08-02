package yads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Result;
import xsna.emb;
import xsna.i7o0;

/* loaded from: classes10.dex */
public final class ln {
    public static final ln a = new ln();

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
                    failure = i7o0.h(gZIPInputStream);
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
            failure = new String(a(str), emb.b);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = "";
        }
        return (String) failure;
    }
}

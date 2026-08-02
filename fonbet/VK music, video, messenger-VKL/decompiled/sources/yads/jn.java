package yads;

import android.util.Base64;
import kotlin.Result;
import xsna.emb;

/* loaded from: classes10.dex */
public final class jn {
    public static String a(String str) {
        return a(str.getBytes(emb.b));
    }

    public static String a(byte[] bArr) {
        Object failure;
        try {
            failure = Base64.encodeToString(bArr, 2);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Result.a(failure);
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }
}

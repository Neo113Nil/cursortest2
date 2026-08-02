package yads;

import java.net.URI;
import kotlin.Result;

/* loaded from: classes10.dex */
public final class fc3 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String str) {
        Object failure;
        boolean z;
        try {
            new URI(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (str != null && str.length() != 0) {
            z = true;
            failure = Boolean.valueOf(z);
            Object obj = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return ((Boolean) failure).booleanValue();
        }
        z = false;
        failure = Boolean.valueOf(z);
        Object obj2 = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
        }
        return ((Boolean) failure).booleanValue();
    }
}

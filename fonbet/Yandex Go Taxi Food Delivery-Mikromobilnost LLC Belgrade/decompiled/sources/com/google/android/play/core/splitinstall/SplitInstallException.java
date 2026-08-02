package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.l391;
import defpackage.ny61;
import defpackage.unr0;
import java.util.HashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class SplitInstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplitInstallException(int i) {
        super(new Status(i, String.format("Split Install Error(%d): %s", r1, r2)));
        String str;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = l391.a;
        Integer valueOf2 = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf2)) {
            HashMap hashMap2 = l391.b;
            if (hashMap2.containsKey(valueOf2)) {
                str = unr0.o((String) hashMap.get(valueOf2), " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#", (String) hashMap2.get(valueOf2), Extension.C_BRAKE);
                if (i == 0) {
                    return;
                }
                ny61.g("errorCode should not be 0.");
                throw null;
            }
        }
        str = "";
        if (i == 0) {
        }
    }
}

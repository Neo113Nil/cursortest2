package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;
import xsna.fw3;
import xsna.zcl;

/* compiled from: DivStorageErrorException.kt */
/* loaded from: classes7.dex */
public final class DivStorageErrorException extends StorageException {
    public static final Companion Companion = new Companion(null);

    /* compiled from: DivStorageErrorException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getMessage(String str, String str2) {
            String str3;
            StringBuilder e = fw3.e(str);
            if (str2 == null || (str3 = " Card id: ".concat(str2)) == null) {
                str3 = "";
            }
            e.append(str3);
            return e.toString();
        }

        private Companion() {
        }
    }

    public DivStorageErrorException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ DivStorageErrorException(String str, Throwable th, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str2);
    }

    public DivStorageErrorException(String str, Throwable th, String str2) {
        super(Companion.getMessage(str, str2), th, str2);
    }
}

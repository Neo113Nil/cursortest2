package com.yandex.div.storage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.div.storage.database.StorageException;
import defpackage.qv10;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yandex/div/storage/DivStorageErrorException;", "Lcom/yandex/div/storage/database/StorageException;", "", ErrorResponseData.JSON_ERROR_MESSAGE, "", "cause", "cardId", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "a", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivStorageErrorException extends StorageException {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    public /* synthetic */ DivStorageErrorException(String str, Throwable th, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/storage/DivStorageErrorException$a;", "", "<init>", "()V", "", ErrorResponseData.JSON_ERROR_MESSAGE, "cardId", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.div.storage.DivStorageErrorException$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String errorMessage, String cardId) {
            StringBuilder t = qv10.t(errorMessage);
            t.append(cardId != null ? " Card id: ".concat(cardId) : "");
            return t.toString();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivStorageErrorException() {
        this(null, null, null, 7, null);
    }

    public DivStorageErrorException(String str, Throwable th, String str2) {
        super(INSTANCE.b(str, str2), th, str2);
    }
}

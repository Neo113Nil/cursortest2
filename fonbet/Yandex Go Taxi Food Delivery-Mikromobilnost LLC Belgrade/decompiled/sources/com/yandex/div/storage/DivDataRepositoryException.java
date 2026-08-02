package com.yandex.div.storage;

import com.yandex.div.json.ParsingException;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\r\u000eB-\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/storage/DivDataRepositoryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", Constants.KEY_MESSAGE, "", "cause", "cardId", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "JsonParsingException", "StorageException", "Lcom/yandex/div/storage/DivDataRepositoryException$JsonParsingException;", "Lcom/yandex/div/storage/DivDataRepositoryException$StorageException;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DivDataRepositoryException extends Exception {
    private final String cardId;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/storage/DivDataRepositoryException$StorageException;", "Lcom/yandex/div/storage/DivDataRepositoryException;", "storageException", "Lcom/yandex/div/storage/database/StorageException;", "(Lcom/yandex/div/storage/database/StorageException;)V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StorageException extends DivDataRepositoryException {
        public StorageException(com.yandex.div.storage.database.StorageException storageException) {
            super(storageException.getMessage(), storageException, storageException.getCardId(), null);
        }
    }

    public /* synthetic */ DivDataRepositoryException(String str, Throwable th, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str2);
    }

    /* renamed from: a, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/storage/DivDataRepositoryException$JsonParsingException;", "Lcom/yandex/div/storage/DivDataRepositoryException;", Constants.KEY_MESSAGE, "", "cause", "Lcom/yandex/div/json/ParsingException;", "cardId", "(Ljava/lang/String;Lcom/yandex/div/json/ParsingException;Ljava/lang/String;)V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JsonParsingException extends DivDataRepositoryException {
        public JsonParsingException(String str, ParsingException parsingException, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : parsingException, str2, null);
        }

        public JsonParsingException(String str, ParsingException parsingException, String str2) {
            super(str, parsingException, str2, null);
        }
    }

    public /* synthetic */ DivDataRepositoryException(String str, Throwable th, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th, str2);
    }

    private DivDataRepositoryException(String str, Throwable th, String str2) {
        super(str, th);
        this.cardId = str2;
    }
}

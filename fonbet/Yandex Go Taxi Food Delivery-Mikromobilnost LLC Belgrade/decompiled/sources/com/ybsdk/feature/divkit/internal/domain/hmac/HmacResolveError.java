package com.ybsdk.feature.divkit.internal.domain.hmac;

import com.ybsdk.feature.divkit.internal.domain.hmac.HmacData;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SigningKeyUnavailable", "MissingValueItem", "IdempotencyTokenUnavailable", "UnknownItemType", "UnknownKeyType", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$IdempotencyTokenUnavailable;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$MissingValueItem;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$SigningKeyUnavailable;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$UnknownItemType;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$UnknownKeyType;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class HmacResolveError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$IdempotencyTokenUnavailable;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError;", "<init>", "()V", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdempotencyTokenUnavailable extends HmacResolveError {
        public IdempotencyTokenUnavailable() {
            super("HMAC: idempotency token unavailable");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$MissingValueItem;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError;", "<init>", "()V", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MissingValueItem extends HmacResolveError {
        public MissingValueItem() {
            super("HMAC: VALUE item is missing value field");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$SigningKeyUnavailable;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$KeyType;", "keyType", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$KeyType;", "getKeyType", "()Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData$KeyType;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SigningKeyUnavailable extends HmacResolveError {
        private final HmacData.KeyType keyType;

        public SigningKeyUnavailable(HmacData.KeyType keyType) {
            super("HMAC: signing key unavailable (keyType=" + keyType + Extension.C_BRAKE);
            this.keyType = keyType;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$UnknownItemType;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError;", "<init>", "()V", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnknownItemType extends HmacResolveError {
        public UnknownItemType() {
            super("HMAC: unknown item type");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError$UnknownKeyType;", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacResolveError;", "<init>", "()V", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnknownKeyType extends HmacResolveError {
        public UnknownKeyType() {
            super("HMAC: unknown key type");
        }
    }
}

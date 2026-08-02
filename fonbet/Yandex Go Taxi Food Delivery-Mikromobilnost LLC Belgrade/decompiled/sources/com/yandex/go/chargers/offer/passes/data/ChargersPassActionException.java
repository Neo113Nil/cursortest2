package com.yandex.go.chargers.offer.passes.data;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "ChargersPassPurchaseFailedException", "ChargersPassActionFailedException", "ChargersPassActionFailedStatusException", "ChargersPassAlreadyInPurchasingStateException", "Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException$ChargersPassActionFailedException;", "Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException$ChargersPassActionFailedStatusException;", "Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException$ChargersPassAlreadyInPurchasingStateException;", "Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException$ChargersPassPurchaseFailedException;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ChargersPassActionException extends RuntimeException {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException$ChargersPassAlreadyInPurchasingStateException;", "Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException;", "", "operationId", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ChargersPassAlreadyInPurchasingStateException extends ChargersPassActionException {
        private final String operationId;

        public ChargersPassAlreadyInPurchasingStateException(String str) {
            this.operationId = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getOperationId() {
            return this.operationId;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException$ChargersPassActionFailedException;", "Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ChargersPassActionFailedException extends ChargersPassActionException {
        private final String subtitle;
        private final String title;

        public ChargersPassActionFailedException(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        public ChargersPassActionFailedException() {
            this(null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException$ChargersPassPurchaseFailedException;", "Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ChargersPassPurchaseFailedException extends ChargersPassActionException {
        private final String subtitle;
        private final String title;

        public ChargersPassPurchaseFailedException(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        public ChargersPassPurchaseFailedException() {
            this(null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException$ChargersPassActionFailedStatusException;", "Lcom/yandex/go/chargers/offer/passes/data/ChargersPassActionException;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ChargersPassActionFailedStatusException extends ChargersPassActionException {
        private final String subtitle;
        private final String title;

        public ChargersPassActionFailedStatusException(int i) {
            this.title = null;
            this.subtitle = null;
        }

        public ChargersPassActionFailedStatusException() {
            this(0);
        }
    }
}

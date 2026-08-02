package com.yandex.mobile.ads.common;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/mobile/ads/common/AdBindingResult;", "", "()V", "Failure", "Success", "Lcom/yandex/mobile/ads/common/AdBindingResult$Failure;", "Lcom/yandex/mobile/ads/common/AdBindingResult$Success;", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AdBindingResult {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/mobile/ads/common/AdBindingResult$Failure;", "Lcom/yandex/mobile/ads/common/AdBindingResult;", "", "missingAssetName", "", Constants.KEY_EXCEPTION, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "getMissingAssetName", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure extends AdBindingResult {
        private final Throwable exception;
        private final String missingAssetName;

        public Failure(String str, Throwable th) {
            super(null);
            this.missingAssetName = str;
            this.exception = th;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/mobile/ads/common/AdBindingResult$Success;", "Lcom/yandex/mobile/ads/common/AdBindingResult;", "()V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success extends AdBindingResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ AdBindingResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AdBindingResult() {
    }
}

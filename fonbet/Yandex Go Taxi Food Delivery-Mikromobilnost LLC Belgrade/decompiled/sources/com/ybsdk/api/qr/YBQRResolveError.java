package com.ybsdk.api.qr;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/api/qr/YBQRResolveError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "RulesNotLoaded", "NoMatchingRule", "Lcom/ybsdk/api/qr/YBQRResolveError$NoMatchingRule;", "Lcom/ybsdk/api/qr/YBQRResolveError$RulesNotLoaded;", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class YBQRResolveError extends IllegalStateException {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ybsdk/api/qr/YBQRResolveError$NoMatchingRule;", "Lcom/ybsdk/api/qr/YBQRResolveError;", "<init>", "()V", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoMatchingRule extends YBQRResolveError {
        public NoMatchingRule() {
            super("No matching QR resolving rules", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ybsdk/api/qr/YBQRResolveError$RulesNotLoaded;", "Lcom/ybsdk/api/qr/YBQRResolveError;", "<init>", "()V", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RulesNotLoaded extends YBQRResolveError {
        public RulesNotLoaded() {
            super("Rules were not loaded. Call loadRules() first", null);
        }
    }
}

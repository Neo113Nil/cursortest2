package com.yandex.go.dynamic.impl.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/dynamic/impl/exceptions/DynamicFeatureException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "DynamicFeatureDownloadingException", "DynamicFeatureCanceledException", "Lcom/yandex/go/dynamic/impl/exceptions/DynamicFeatureException$DynamicFeatureCanceledException;", "Lcom/yandex/go/dynamic/impl/exceptions/DynamicFeatureException$DynamicFeatureDownloadingException;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DynamicFeatureException extends RuntimeException {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/dynamic/impl/exceptions/DynamicFeatureException$DynamicFeatureCanceledException;", "Lcom/yandex/go/dynamic/impl/exceptions/DynamicFeatureException;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DynamicFeatureCanceledException extends DynamicFeatureException {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/dynamic/impl/exceptions/DynamicFeatureException$DynamicFeatureDownloadingException;", "Lcom/yandex/go/dynamic/impl/exceptions/DynamicFeatureException;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DynamicFeatureDownloadingException extends DynamicFeatureException {
    }
}

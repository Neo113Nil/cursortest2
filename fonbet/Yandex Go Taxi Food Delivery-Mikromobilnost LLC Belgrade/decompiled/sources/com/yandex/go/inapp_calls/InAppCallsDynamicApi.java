package com.yandex.go.inapp_calls;

import android.content.Context;
import defpackage.h7n;
import defpackage.pjv;
import defpackage.qjv;
import defpackage.rjv;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi;", "Lh7n;", "qjv", "pjv", "ojv", "InAppCallException", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public interface InAppCallsDynamicApi extends h7n {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\b\t\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SDKException", "NotStartedException", "CallAlreadyStartedException", "Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException$CallAlreadyStartedException;", "Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException$NotStartedException;", "Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException$SDKException;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static abstract class InAppCallException extends RuntimeException {
        private final String analyticsName;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException$CallAlreadyStartedException;", "Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class CallAlreadyStartedException extends InAppCallException {
            public CallAlreadyStartedException() {
                super("CallAlreadyStartedException");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException$NotStartedException;", "Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class NotStartedException extends InAppCallException {
            public NotStartedException() {
                super("NotStartedException");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException$SDKException;", "Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi$InAppCallException;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class SDKException extends InAppCallException {
            private final Throwable cause;

            public SDKException(Throwable th) {
                super("SDKException");
                this.cause = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.cause;
            }
        }

        public InAppCallException(String str) {
            this.analyticsName = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getAnalyticsName() {
            return this.analyticsName;
        }
    }

    Object a(qjv qjvVar, ContinuationImpl continuationImpl);

    Object c(pjv pjvVar, ContinuationImpl continuationImpl);

    void h(rjv rjvVar);

    Object k(Context context);

    boolean l();
}

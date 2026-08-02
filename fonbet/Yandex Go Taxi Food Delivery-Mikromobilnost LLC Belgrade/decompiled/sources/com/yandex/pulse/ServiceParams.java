package com.yandex.pulse;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB)\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/pulse/ServiceParams;", "", "backgroundExecutor", "Ljava/util/concurrent/Executor;", "applicationStatusMonitor", "Lcom/yandex/pulse/ApplicationStatusMonitor;", "uploadURL", "", "enableLogging", "", "(Ljava/util/concurrent/Executor;Lcom/yandex/pulse/ApplicationStatusMonitor;Ljava/lang/String;Z)V", "Builder", "Companion", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ServiceParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final ApplicationStatusMonitor applicationStatusMonitor;
    public final Executor backgroundExecutor;
    public final boolean enableLogging;
    public final String uploadURL;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/pulse/ServiceParams$Builder;", "", "()V", "applicationStatusMonitor", "Lcom/yandex/pulse/ApplicationStatusMonitor;", "backgroundExecutor", "Ljava/util/concurrent/Executor;", "enableLogging", "", "uploadURL", "", "build", "Lcom/yandex/pulse/ServiceParams;", "setApplicationStatusMonitor", "setBackgroundExecutor", "setEnableLogging", "enable", "setUploadURL", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private ApplicationStatusMonitor applicationStatusMonitor;
        private Executor backgroundExecutor;
        private boolean enableLogging;
        private String uploadURL = "https://api.browser.yandex.ru/uma_proto";

        public final ServiceParams build() {
            Executor executor = this.backgroundExecutor;
            ApplicationStatusMonitor applicationStatusMonitor = this.applicationStatusMonitor;
            if (applicationStatusMonitor == null) {
                applicationStatusMonitor = null;
            }
            return new ServiceParams(executor, applicationStatusMonitor, this.uploadURL, this.enableLogging, null);
        }

        public final Builder setApplicationStatusMonitor(ApplicationStatusMonitor applicationStatusMonitor) {
            this.applicationStatusMonitor = applicationStatusMonitor;
            return this;
        }

        public final Builder setBackgroundExecutor(Executor backgroundExecutor) {
            this.backgroundExecutor = backgroundExecutor;
            return this;
        }

        public final Builder setEnableLogging(boolean enable) {
            this.enableLogging = enable;
            return this;
        }

        public final Builder setUploadURL(String uploadURL) {
            this.uploadURL = uploadURL;
            return this;
        }
    }

    private ServiceParams(Executor executor, ApplicationStatusMonitor applicationStatusMonitor, String str, boolean z) {
        this.backgroundExecutor = executor;
        this.applicationStatusMonitor = applicationStatusMonitor;
        this.uploadURL = str;
        this.enableLogging = z;
    }

    public static final Builder builder() {
        return INSTANCE.builder();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/yandex/pulse/ServiceParams$Companion;", "", "()V", "builder", "Lcom/yandex/pulse/ServiceParams$Builder;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ServiceParams(Executor executor, ApplicationStatusMonitor applicationStatusMonitor, String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, applicationStatusMonitor, str, z);
    }
}

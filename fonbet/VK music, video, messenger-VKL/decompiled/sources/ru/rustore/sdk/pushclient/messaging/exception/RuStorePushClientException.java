package ru.rustore.sdk.pushclient.messaging.exception;

import ru.rustore.sdk.core.exception.RuStoreException;

/* loaded from: classes9.dex */
public abstract class RuStorePushClientException extends RuStoreException {
    private final boolean isCritical;

    public static final class HostAppBackgroundWorkPermissionNotGranted extends RuStorePushClientException {
    }

    public static final class HostAppNotInstalledException extends RuStorePushClientException {
        private final boolean isCritical;

        public HostAppNotInstalledException(String str) {
            super(str);
            this.isCritical = true;
        }

        @Override // ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException
        public final boolean d() {
            return this.isCritical;
        }
    }

    public static final class UnauthorizedException extends RuStorePushClientException {
        private final boolean isCritical;

        public UnauthorizedException(String str) {
            super(str);
            this.isCritical = true;
        }

        @Override // ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException
        public final boolean d() {
            return this.isCritical;
        }
    }

    public boolean d() {
        return this.isCritical;
    }
}

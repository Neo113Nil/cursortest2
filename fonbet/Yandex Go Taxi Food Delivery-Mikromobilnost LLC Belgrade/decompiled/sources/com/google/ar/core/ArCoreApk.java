package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import defpackage.yx61;
import java.util.function.Consumer;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public class ArCoreApk {

    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);

        final int nativeCode;

        InstallBehavior(int i) {
            this.nativeCode = i;
        }

        public static InstallBehavior forNumber(int i) {
            for (InstallBehavior installBehavior : values()) {
                if (installBehavior.nativeCode == i) {
                    return installBehavior;
                }
            }
            yx61.f(a0.a(Alerts.alert_decrypt_error, i, "Unexpected value for native InstallBehavior, value="));
            return null;
        }
    }

    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);

        final int nativeCode;

        InstallStatus(int i) {
            this.nativeCode = i;
        }

        public static InstallStatus forNumber(int i) {
            for (InstallStatus installStatus : values()) {
                if (installStatus.nativeCode == i) {
                    return installStatus;
                }
            }
            yx61.f(a0.a((byte) 49, i, "Unexpected value for native InstallStatus, value="));
            return null;
        }
    }

    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);

        final int nativeCode;

        UserMessageType(int i) {
            this.nativeCode = i;
        }

        public static UserMessageType forNumber(int i) {
            for (UserMessageType userMessageType : values()) {
                if (userMessageType.nativeCode == i) {
                    return userMessageType;
                }
            }
            yx61.f(a0.a(Alerts.alert_decrypt_error, i, "Unexpected value for native UserMessageType, value="));
            return null;
        }
    }

    public static ArCoreApk getInstance() {
        return q.m;
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public void checkAvailabilityAsync(Context context, Consumer<Availability> consumer) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        throw new UnsupportedOperationException("Stub");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class Availability {
        private static final /* synthetic */ Availability[] $VALUES = $values();
        public static final Availability SUPPORTED_APK_TOO_OLD;
        public static final Availability SUPPORTED_INSTALLED;
        public static final Availability SUPPORTED_NOT_INSTALLED;
        public static final Availability UNKNOWN_CHECKING;
        public static final Availability UNKNOWN_ERROR;
        public static final Availability UNKNOWN_TIMED_OUT;
        public static final Availability UNSUPPORTED_DEVICE_NOT_CAPABLE;
        final int nativeCode;

        private static /* synthetic */ Availability[] $values() {
            return new Availability[]{UNKNOWN_ERROR, UNKNOWN_CHECKING, UNKNOWN_TIMED_OUT, UNSUPPORTED_DEVICE_NOT_CAPABLE, SUPPORTED_NOT_INSTALLED, SUPPORTED_APK_TOO_OLD, SUPPORTED_INSTALLED};
        }

        static {
            int i = 0;
            byte[] bArr = null;
            UNKNOWN_ERROR = new a("UNKNOWN_ERROR", i, i, bArr);
            int i2 = 1;
            UNKNOWN_CHECKING = new b("UNKNOWN_CHECKING", i2, i2, bArr);
            int i3 = 2;
            UNKNOWN_TIMED_OUT = new c("UNKNOWN_TIMED_OUT", i3, i3, bArr);
            UNSUPPORTED_DEVICE_NOT_CAPABLE = new d("UNSUPPORTED_DEVICE_NOT_CAPABLE", 3, 100, bArr);
            SUPPORTED_NOT_INSTALLED = new e("SUPPORTED_NOT_INSTALLED", 4, 201, bArr);
            SUPPORTED_APK_TOO_OLD = new f("SUPPORTED_APK_TOO_OLD", 5, 202, bArr);
            SUPPORTED_INSTALLED = new g("SUPPORTED_INSTALLED", 6, 203, bArr);
        }

        private Availability(String str, int i, int i2) {
            this.nativeCode = i2;
        }

        public static Availability forNumber(int i) {
            for (Availability availability : values()) {
                if (availability.nativeCode == i) {
                    return availability;
                }
            }
            yx61.f(a0.a((byte) 48, i, "Unexpected value for native Availability, value="));
            return null;
        }

        public static Availability valueOf(String str) {
            return (Availability) Enum.valueOf(Availability.class, str);
        }

        public static Availability[] values() {
            return (Availability[]) $VALUES.clone();
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }

        public /* synthetic */ Availability(String str, int i, int i2, byte[] bArr) {
            this(str, i, i2);
        }
    }

    public InstallStatus requestInstall(Activity activity, boolean z, InstallBehavior installBehavior, UserMessageType userMessageType) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        throw new UnsupportedOperationException("Stub");
    }
}

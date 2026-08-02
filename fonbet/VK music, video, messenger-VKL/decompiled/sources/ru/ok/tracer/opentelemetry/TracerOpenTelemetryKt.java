package ru.ok.tracer.opentelemetry;

import io.opentelemetry.api.common.AttributeType;
import java.util.concurrent.atomic.AtomicReference;
import xsna.gzs;
import xsna.i94;
import xsna.xfx;

/* compiled from: TracerOpenTelemetry.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetryKt {
    private static final i94<String> ATTR_KEY_APP_NAME;
    private static final i94<String> ATTR_KEY_APP_VERSION;
    private static final i94<Long> ATTR_KEY_APP_VERSION_CODE;
    private static final i94<String> ATTR_KEY_DEVICE_ID;
    private static final i94<String> ATTR_KEY_DEVICE_MANUFACTURER;
    private static final i94<String> ATTR_KEY_DEVICE_MODEL_ID;
    private static final i94<String> ATTR_KEY_DEVICE_MODEL_NAME;
    private static final i94<String> ATTR_KEY_ENVIRONMENT;
    private static final i94<String> ATTR_KEY_OS_NAME;
    private static final i94<Long> ATTR_KEY_OS_SDK_INT;
    private static final i94<String> ATTR_KEY_OS_TYPE;
    private static final i94<String> ATTR_KEY_OS_VERSION;
    private static final i94<Boolean> ATTR_KEY_SAMPLED;
    private static final i94<String> ATTR_KEY_SDK_LANGUAGE;
    private static final i94<String> ATTR_KEY_SDK_NAME;
    private static final i94<String> ATTR_KEY_SDK_VERSION;
    private static final i94<String> ATTR_KEY_SESSION_UUID;
    private static final i94<String> ATTR_KEY_USER_ID;

    static {
        AttributeType attributeType = AttributeType.STRING;
        ATTR_KEY_APP_NAME = xfx.a(attributeType, "service.name");
        ATTR_KEY_APP_VERSION = xfx.a(attributeType, "service.version");
        AttributeType attributeType2 = AttributeType.LONG;
        ATTR_KEY_APP_VERSION_CODE = xfx.a(attributeType2, "apptracer.android.service.version_code");
        ATTR_KEY_SDK_NAME = xfx.a(attributeType, "telemetry.sdk.name");
        ATTR_KEY_SDK_VERSION = xfx.a(attributeType, "telemetry.sdk.version");
        ATTR_KEY_SDK_LANGUAGE = xfx.a(attributeType, "telemetry.sdk.language");
        ATTR_KEY_OS_NAME = xfx.a(attributeType, "os.name");
        ATTR_KEY_OS_VERSION = xfx.a(attributeType, "os.version");
        ATTR_KEY_OS_TYPE = xfx.a(attributeType, "os.type");
        ATTR_KEY_OS_SDK_INT = xfx.a(attributeType2, "android.os.api_level");
        ATTR_KEY_DEVICE_MANUFACTURER = xfx.a(attributeType, "device.manufacturer");
        ATTR_KEY_DEVICE_MODEL_NAME = xfx.a(attributeType, "device.model.name");
        ATTR_KEY_DEVICE_MODEL_ID = xfx.a(attributeType, "device.model.identifier");
        ATTR_KEY_DEVICE_ID = xfx.a(attributeType, "apptracer.deviceId");
        ATTR_KEY_ENVIRONMENT = xfx.a(attributeType, "deployment.environment.name");
        ATTR_KEY_SESSION_UUID = xfx.a(attributeType, "apptracer.sessionUuid");
        ATTR_KEY_SAMPLED = xfx.a(AttributeType.BOOLEAN, "apptracer.sampled");
        ATTR_KEY_USER_ID = xfx.a(attributeType, "user.id");
    }

    public static final i94<Boolean> getATTR_KEY_SAMPLED() {
        return ATTR_KEY_SAMPLED;
    }

    public static final i94<String> getATTR_KEY_SESSION_UUID() {
        return ATTR_KEY_SESSION_UUID;
    }

    public static final i94<String> getATTR_KEY_USER_ID() {
        return ATTR_KEY_USER_ID;
    }

    public static final <T> T getOrInit(AtomicReference<T> atomicReference, gzs<? extends T> gzsVar) {
        while (true) {
            T t = atomicReference.get();
            if (t != null) {
                return t;
            }
            T invoke = gzsVar.invoke();
            while (!atomicReference.compareAndSet(null, invoke)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return invoke;
        }
    }
}

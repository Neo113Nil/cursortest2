package ru.ok.tracer.base.commands;

import org.json.JSONObject;
import ru.ok.tracer.base.limits.TracerFeatureLimits;
import xsna.drm0;
import xsna.zcl;

/* compiled from: CommandsHandler.kt */
/* loaded from: classes11.dex */
public final class CommandsHandler {
    private final String featureName;
    private final TracerFeatureLimits limits;
    private final String tag;

    /* compiled from: CommandsHandler.kt */
    public static final class Builder {
        private String featureName;
        private TracerFeatureLimits limits;
        private String tag;

        public final CommandsHandler build() {
            return new CommandsHandler(this, null);
        }

        public final String getFeatureName$tracer_base_release() {
            return this.featureName;
        }

        public final TracerFeatureLimits getLimits$tracer_base_release() {
            return this.limits;
        }

        public final String getTag$tracer_base_release() {
            return this.tag;
        }

        public final Builder setFeatureName(String str) {
            this.featureName = str;
            return this;
        }

        public final void setFeatureName$tracer_base_release(String str) {
            this.featureName = str;
        }

        public final void setLimits$tracer_base_release(TracerFeatureLimits tracerFeatureLimits) {
            this.limits = tracerFeatureLimits;
        }

        public final Builder setLimitsHandler(TracerFeatureLimits tracerFeatureLimits) {
            this.limits = tracerFeatureLimits;
            return this;
        }

        public final Builder setTag(String str) {
            this.tag = str;
            return this;
        }

        public final void setTag$tracer_base_release(String str) {
            this.tag = str;
        }
    }

    public /* synthetic */ CommandsHandler(Builder builder, zcl zclVar) {
        this(builder);
    }

    public final void handleResponse(String str, String str2) {
        if (str2 == null || drm0.N(str2)) {
            return;
        }
        try {
            handleResponse(new JSONObject(str2));
        } catch (Exception unused) {
        }
    }

    private CommandsHandler(Builder builder) {
        this.featureName = builder.getFeatureName$tracer_base_release();
        this.tag = builder.getTag$tracer_base_release();
        this.limits = builder.getLimits$tracer_base_release();
    }

    public final void handleResponse(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("commands");
        if (optJSONObject == null || this.limits == null) {
            return;
        }
        this.limits.setShutdownMs(Long.valueOf(optJSONObject.optLong("globalShutdownMs")), this.featureName, this.featureName != null ? Long.valueOf(optJSONObject.optLong("featureShutdownMs")) : null, this.tag, (this.featureName == null || this.tag == null) ? null : Long.valueOf(optJSONObject.optLong("tagShutdownMs")));
    }
}

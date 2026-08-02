package ru.ok.android.api.core;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import xsna.zcl;

/* compiled from: ApiParam.kt */
/* loaded from: classes9.dex */
public abstract class ApiParam {
    public static final Companion Companion = new Companion(null);
    public static final String PARAM_NAME_APP_KEY = "application_key";
    public static final String PARAM_NAME_SESSION_KEY = "session_key";
    public static final String PARAM_NAME_SIGNATURE = "sig";
    private final String name;

    /* compiled from: ApiParam.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ApiParam(String str) {
        this.name = str;
    }

    public boolean canRepeat() {
        return true;
    }

    public final String getName() {
        return this.name;
    }

    public boolean isSupplied() {
        return false;
    }

    public boolean shouldPost() {
        return false;
    }

    public abstract void write(JsonWriter jsonWriter) throws IOException, JsonSerializeException;
}

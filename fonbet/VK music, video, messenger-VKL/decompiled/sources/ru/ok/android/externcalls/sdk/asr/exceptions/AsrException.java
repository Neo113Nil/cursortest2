package ru.ok.android.externcalls.sdk.asr.exceptions;

import org.json.JSONObject;
import xsna.zcl;

/* compiled from: AsrException.kt */
/* loaded from: classes9.dex */
public final class AsrException extends RuntimeException {
    private final Throwable cause;
    private final JSONObject jsonObject;
    private final String message;

    public AsrException(JSONObject jSONObject) {
        this(jSONObject, null, null, 6, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public AsrException(JSONObject jSONObject, String str) {
        this(jSONObject, str, null, 4, null);
    }

    public AsrException(JSONObject jSONObject, String str, Throwable th) {
        super(str, th);
        this.jsonObject = jSONObject;
        this.message = str;
        this.cause = th;
    }

    public /* synthetic */ AsrException(JSONObject jSONObject, String str, Throwable th, int i, zcl zclVar) {
        this(jSONObject, (i & 2) != 0 ? jSONObject.toString() : str, (i & 4) != 0 ? null : th);
    }
}

package ru.ok.android.webrtc.signaling.command;

import org.json.JSONException;
import org.json.JSONObject;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class GenericCommand implements SignalingCommand {
    public final JSONObject a;
    public final boolean b;

    public GenericCommand(JSONObject jSONObject) {
        this(jSONObject, false, 2, null);
    }

    public static /* synthetic */ GenericCommand copy$default(GenericCommand genericCommand, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = genericCommand.a;
        }
        if ((i & 2) != 0) {
            z = genericCommand.b;
        }
        return genericCommand.copy(jSONObject, z);
    }

    public final boolean component2() {
        return this.b;
    }

    public final GenericCommand copy(JSONObject jSONObject, boolean z) {
        return new GenericCommand(jSONObject, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericCommand)) {
            return false;
        }
        GenericCommand genericCommand = (GenericCommand) obj;
        return epx.f(this.a, genericCommand.a) && this.b == genericCommand.b;
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommand
    public JSONObject extractParams() {
        return this.a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommand
    public boolean isSmart() {
        return this.b;
    }

    public final GenericCommand put(String str, String str2) throws JSONException {
        this.a.put(str, str2);
        return this;
    }

    public String toString() {
        return "GenericCommand(params=" + this.a + ", isSmart=" + this.b + ")";
    }

    public GenericCommand(JSONObject jSONObject, boolean z) {
        this.a = jSONObject;
        this.b = z;
    }

    public final GenericCommand put(String str, int i) throws JSONException {
        this.a.put(str, i);
        return this;
    }

    public /* synthetic */ GenericCommand(JSONObject jSONObject, boolean z, int i, zcl zclVar) {
        this(jSONObject, (i & 2) != 0 ? false : z);
    }

    public final GenericCommand put(String str, long j) throws JSONException {
        this.a.put(str, j);
        return this;
    }

    public final GenericCommand put(String str, boolean z) throws JSONException {
        this.a.put(str, z);
        return this;
    }

    public final GenericCommand put(String str, JSONObject jSONObject) throws JSONException {
        this.a.put(str, jSONObject);
        return this;
    }
}

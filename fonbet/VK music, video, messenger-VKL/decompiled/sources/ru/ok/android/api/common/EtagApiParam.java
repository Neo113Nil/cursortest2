package ru.ok.android.api.common;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.io.IOException;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: EtagApiParam.kt */
/* loaded from: classes9.dex */
public final class EtagApiParam extends ApiParam {
    private final String etag;

    public EtagApiParam(String str) {
        super(str == null ? "etagSupported" : DownloadModel.ETAG);
        this.etag = str;
    }

    public final String getEtag() {
        return this.etag;
    }

    public String toString() {
        String name = getName();
        Object obj = this.etag;
        if (obj == null) {
            obj = Boolean.TRUE;
        }
        return name + " = " + obj;
    }

    @Override // ru.ok.android.api.core.ApiParam
    public void write(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        jsonWriter.name(getName());
        String str = this.etag;
        if (str == null) {
            jsonWriter.value(true);
        } else {
            jsonWriter.value(str);
        }
    }
}

package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.ApplicationSendCodeResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationSendCodeResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/ApplicationSendCodeResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Status;", "statusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Action;", "nullableActionAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplicationSendCodeResponseJsonAdapter extends JsonAdapter<ApplicationSendCodeResponse> {
    private volatile Constructor<ApplicationSendCodeResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<ApplicationSendCodeResponse.Action> nullableActionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "hint", "action", "seconds", "support_url");
    private final JsonAdapter<ApplicationSendCodeResponse.Status> statusAdapter;

    public ApplicationSendCodeResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.statusAdapter = moshi.adapter(ApplicationSendCodeResponse.Status.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "hint");
        this.nullableActionAdapter = moshi.adapter(ApplicationSendCodeResponse.Action.class, emptySet, "action");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "seconds");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ApplicationSendCodeResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        ApplicationSendCodeResponse.Status status = null;
        String str = null;
        ApplicationSendCodeResponse.Action action = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                status = this.statusAdapter.fromJson(jsonReader);
                if (status == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                action = this.nullableActionAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("seconds", "seconds", jsonReader);
                }
                i = -9;
            } else if (selectName == 4) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (status == null) {
                throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
            }
            return new ApplicationSendCodeResponse(status, str, action, num.intValue(), str2);
        }
        Constructor<ApplicationSendCodeResponse> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = ApplicationSendCodeResponse.class.getDeclaredConstructor(ApplicationSendCodeResponse.Status.class, String.class, ApplicationSendCodeResponse.Action.class, cls2, String.class, cls2, cls);
            this.constructorRef = constructor;
        }
        if (status == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        return constructor.newInstance(status, str, action, num, str2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ApplicationSendCodeResponse applicationSendCodeResponse) {
        ApplicationSendCodeResponse applicationSendCodeResponse2 = applicationSendCodeResponse;
        if (applicationSendCodeResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) applicationSendCodeResponse2.getStatus());
        jsonWriter.name("hint");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) applicationSendCodeResponse2.getHint());
        jsonWriter.name("action");
        this.nullableActionAdapter.toJson(jsonWriter, (JsonWriter) applicationSendCodeResponse2.getAction());
        jsonWriter.name("seconds");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(applicationSendCodeResponse2.getSeconds()));
        jsonWriter.name("support_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) applicationSendCodeResponse2.getSupportUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(ApplicationSendCodeResponse)");
    }
}

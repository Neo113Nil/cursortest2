package xsna;

import android.net.Uri;
import java.util.Locale;
import one.video.calls.sdk.internal.api.request.UploadType;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;

/* compiled from: GetLogUploadUrl.kt */
/* loaded from: classes8.dex */
public final class kst implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<mst> {
    public final /* synthetic */ BasicApiRequest<mst> a;

    public kst(String str, UploadType uploadType, String str2) {
        BasicApiRequest.Builder param = BasicApiRequest.Companion.methodBuilder("vchat.getLogUploadUrl").scope(ApiScope.OPT_SESSION).param("conversationId", str).param(ApiProtocol.PARAM_WEB_RTC_PLATFORM, "ANDROID").param("type", uploadType.name().toLowerCase(Locale.ROOT));
        if (str2 != null) {
            param.param(ApiProtocol.PARAM_ANONYM_TOKEN, str2);
        }
        this.a = param.build(mst.b);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean canRepeat() {
        return this.a.canRepeat();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor */
    public final ApiConfigExtractor<mst> getConfigExtractor2() {
        return this.a.getConfigExtractor2();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public final JsonParser<? extends ApiInvocationException> getFailParser() {
        return this.a.getFailParser();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public final JsonParser<? extends mst> getOkParser() {
        return this.a.getOkParser();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final int getPriority() {
        return this.a.getPriority();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final ApiScope getScope() {
        return this.a.getScope();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public final ApiScopeAfter getScopeAfter() {
        return this.a.getScopeAfter();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // ru.ok.android.sdk.api.OkApiInterruptedIOHandler
    public final Object handleInterruptedIO() {
        return new mst(null);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    @ozl
    public final boolean shouldGzip() {
        return this.a.shouldGzip();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean shouldNeverGzip() {
        return this.a.shouldNeverGzip();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean shouldNeverJson() {
        return this.a.shouldNeverJson();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean shouldNeverPost() {
        return this.a.shouldNeverPost();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    @ozl
    public final boolean shouldPost() {
        return this.a.shouldPost();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean shouldReport() {
        return this.a.shouldReport();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean willWriteParams() {
        return this.a.willWriteParams();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean willWriteSupplyParams() {
        return this.a.willWriteSupplyParams();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final void writeParams(JsonWriter jsonWriter) {
        this.a.writeParams(jsonWriter);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final void writeSupplyParams(JsonWriter jsonWriter) {
        this.a.writeSupplyParams(jsonWriter);
    }
}

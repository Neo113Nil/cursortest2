package xsna;

import android.util.SparseArray;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;

/* compiled from: HttpStatus.kt */
/* loaded from: classes15.dex */
public final class rkv {
    public static final SparseArray<String> a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(100, "Continue");
        sparseArray.put(101, "Switching Protocols");
        sparseArray.put(102, "Processing");
        sparseArray.put(103, "Checkpoint");
        sparseArray.put(200, "OK");
        sparseArray.put(201, "Created");
        sparseArray.put(202, "Accepted");
        sparseArray.put(203, "Non-Authoritative Information");
        sparseArray.put(204, "No Content");
        sparseArray.put(205, "Reset Content");
        sparseArray.put(206, "Partial Content");
        sparseArray.put(207, "Multi-Status");
        sparseArray.put(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, "Already Reported");
        sparseArray.put(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, "IM Used");
        sparseArray.put(300, "Multiple Choices");
        sparseArray.put(301, "Moved Permanently");
        sparseArray.put(302, "Found");
        sparseArray.put(Http.StatusCode.SEE_OTHER, "See Other");
        sparseArray.put(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, "Not Modified");
        sparseArray.put(Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, "Use Proxy");
        sparseArray.put(307, "Temporary Redirect");
        sparseArray.put(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, "Permanent Redirect");
        sparseArray.put(400, "Bad Request");
        sparseArray.put(401, "Unauthorized");
        sparseArray.put(402, "Payment Required");
        sparseArray.put(403, "Forbidden");
        sparseArray.put(404, "Not Found");
        sparseArray.put(InterfaceC4413l1.a.b.e, "Method Not Allowed");
        sparseArray.put(InterfaceC4413l1.a.b.f, "Not Acceptable");
        sparseArray.put(InterfaceC4413l1.a.b.g, "Proxy Authentication Required");
        sparseArray.put(InterfaceC4413l1.a.b.h, "Request Timeout");
        sparseArray.put(InterfaceC4413l1.a.b.i, "Conflict");
        sparseArray.put(410, "Gone");
        sparseArray.put(InterfaceC4413l1.a.b.k, "Length Required");
        sparseArray.put(412, "Precondition Failed");
        sparseArray.put(413, "Payload Too Large");
        sparseArray.put(414, "URI Too Long");
        sparseArray.put(415, "Unsupported Media Type");
        sparseArray.put(Http.StatusCode.RANGE_NOT_SATISFIABLE, "Requested range not satisfiable");
        sparseArray.put(417, "Expectation Failed");
        sparseArray.put(418, "I'm a teapot");
        sparseArray.put(419, "Insufficient Space On Resource");
        sparseArray.put(420, "Method Failure");
        sparseArray.put(421, "Destination Locked");
        sparseArray.put(422, "Unprocessable Entity");
        sparseArray.put(423, "Locked");
        sparseArray.put(424, "Failed Dependency");
        sparseArray.put(426, "Upgrade Required");
        sparseArray.put(428, "Precondition Required");
        sparseArray.put(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, "Too Many Requests");
        sparseArray.put(431, "Request Header Fields Too Large");
        sparseArray.put(500, "Internal Server Error");
        sparseArray.put(501, "Not Implemented");
        sparseArray.put(502, "Bad Gateway");
        sparseArray.put(503, "Service Unavailable");
        sparseArray.put(ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, "Gateway Timeout");
        sparseArray.put(505, "HTTP Version not supported");
        sparseArray.put(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, "Variant Also Negotiates");
        sparseArray.put(507, "Insufficient Storage");
        sparseArray.put(IronSourceError.ERROR_CODE_INIT_FAILED, "Loop Detected");
        sparseArray.put(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Bandwidth Limit Exceeded");
        sparseArray.put(510, "Not Extended");
        sparseArray.put(ApiInvocationException.ErrorCodes.IDS_BLOCKED, "Network Authentication Required");
        a = sparseArray;
    }
}

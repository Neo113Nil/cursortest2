package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ExtensionDescriptor.java */
@x2m(tags = {19, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 108, 109, 110, 111, 112, 113, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 123, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 125, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 127, 128, 129, 130, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 134, 135, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 138, 139, VersionConstants.PRODUCT_MAJOR_VERSION, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, PsExtractor.PRIVATE_STREAM_1, 190, 191, PsExtractor.AUDIO_STREAM, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 211, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 224, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, PsExtractor.VIDEO_STREAM_MASK, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253})
/* loaded from: classes13.dex */
public final class scq extends sc6 {
    public ByteBuffer d;

    static {
        Logger.getLogger(scq.class.getName());
    }

    @Override // xsna.sc6
    public final int a() {
        return this.d.remaining();
    }

    @Override // xsna.sc6
    public final void d(ByteBuffer byteBuffer) throws IOException {
        this.d = byteBuffer.slice();
        byteBuffer.position(this.d.remaining() + byteBuffer.position());
    }

    @Override // xsna.sc6
    public final String toString() {
        return "ExtensionDescriptortag=" + this.a + ",bytes=" + skd.c(0, this.d.array()) + '}';
    }
}

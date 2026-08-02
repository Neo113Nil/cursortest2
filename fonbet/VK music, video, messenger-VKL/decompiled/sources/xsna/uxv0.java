package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vk.core.apps.BuildInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bex0;

/* compiled from: VkUiVmojiCaptureCommand.kt */
/* loaded from: classes7.dex */
public final class uxv0 extends dvv0 {
    public static final List<Long> f = Collections.singletonList(Long.valueOf(InternalVkMiniApps.VK_VMOJI_PROD.h().a));
    public final long e;

    public uxv0(long j) {
        this.e = j;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        if (!BuildInfo.h()) {
            if (!f.contains(Long.valueOf(this.e))) {
                r6y r6yVar = this.b;
                if (r6yVar != null) {
                    bex0.a.a(r6yVar, JsApiMethodType.VMOJI_UPLOAD_PHOTO, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                    return;
                }
                return;
            }
        }
        if (str == null) {
            d();
            return;
        }
        try {
            String optString = new JSONObject(str).optString("source");
            if (epx.f(optString, "gallery")) {
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if ((superappUiRouterBridge != null ? superappUiRouterBridge : null).s(120, this.e, false, new cck0(this, 20))) {
                    return;
                }
                f();
                return;
            }
            if (!epx.f(optString, SignalingProtocol.KEY_CAMERA)) {
                d();
                return;
            }
            SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
            if ((superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).s(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, this.e, true, new ksq0(this, 13))) {
                return;
            }
            f();
        } catch (JSONException unused) {
            d();
        }
    }

    @Override // xsna.dvv0
    public final void c(int i, int i2, Intent intent) {
        ArrayList parcelableArrayList;
        if (i == 119) {
            if (i2 != -1 || intent == null) {
                e("cancel", null);
                return;
            }
            Serializable serializableExtra = intent.getSerializableExtra("camera_photo_file");
            File file = serializableExtra instanceof File ? (File) serializableExtra : null;
            if (file == null) {
                e("error", null);
                return;
            }
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if ((superappUiRouterBridge != null ? superappUiRouterBridge : null).q(file.getPath())) {
                return;
            }
            f();
            return;
        }
        if (i != 120) {
            if (i == 121) {
                if (i2 != -1 || intent == null) {
                    e("error", null);
                    return;
                }
                String stringExtra = intent.getStringExtra("result_upload_data");
                if (stringExtra == null || stringExtra.length() == 0) {
                    e("error", null);
                    return;
                } else {
                    e("uploaded", stringExtra);
                    return;
                }
            }
            return;
        }
        if (i2 != -1 || intent == null) {
            e("cancel", null);
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("result_attachments");
        Uri uri = (bundleExtra == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null) ? null : (Uri) j5g.a0(parcelableArrayList);
        String path = uri != null ? uri.getPath() : null;
        if (path == null) {
            e("error", null);
            return;
        }
        SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
        if ((superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).q(path)) {
            return;
        }
        f();
    }

    public final void d() {
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.VMOJI_UPLOAD_PHOTO, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
        }
    }

    public final void e(String str, String str2) {
        JSONObject d = yq.d("status", str);
        if (str2 != null) {
            d.put("upload_data", new JSONObject(str2));
        }
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.b(r6yVar, JsApiMethodType.VMOJI_UPLOAD_PHOTO, d, null, 12);
        }
    }

    public final void f() {
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.a(r6yVar, JsApiMethodType.VMOJI_UPLOAD_PHOTO, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
        }
    }
}

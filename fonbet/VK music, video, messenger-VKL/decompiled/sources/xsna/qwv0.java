package xsna;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: VkUiOpenQRCommand.kt */
/* loaded from: classes6.dex */
public final class qwv0 extends dvv0 {
    public final Fragment e;
    public final long f;
    public boolean g;

    /* compiled from: VkUiOpenQRCommand.kt */
    public static final class a {
        public static String a(Intent intent) {
            return intent.getStringExtra("CODE_READER_RESULT");
        }
    }

    public qwv0(Fragment fragment, long j) {
        this.e = fragment;
        this.f = j;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        this.g = epx.f(str, "from_vk_pay");
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentActivity kn = this.e.kn();
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, kn, PermissionHelper.l, R.string.vk_permissions_camera, R.string.vk_permissions_camera, new sgt0(this, 7), new svk0(this, 19), 64);
    }

    @Override // xsna.dvv0
    public final void c(int i, int i2, Intent intent) {
        if (i == 1000) {
            if (i2 != -1 || intent == null) {
                d();
                return;
            }
            String stringExtra = intent.getStringExtra("CODE_READER_RESULT");
            if (stringExtra == null || drm0.N(stringExtra)) {
                d();
                return;
            }
            boolean z = this.g;
            if (z) {
                JSONObject d = yq.d("qr_string", stringExtra);
                r6y r6yVar = this.b;
                if (r6yVar != null) {
                    r6yVar.x(JsApiEvent.QR_DONE, d);
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            }
            if (z) {
                JSONObject d2 = yq.d("code_data", stringExtra);
                r6y r6yVar2 = this.b;
                if (r6yVar2 != null) {
                    bex0.a.b(r6yVar2, JsApiMethodType.OPEN_QR, d2, null, 12);
                    s3q0 s3q0Var2 = s3q0.a;
                    return;
                }
                return;
            }
            JSONObject d3 = yq.d("qr_data", stringExtra);
            r6y r6yVar3 = this.b;
            if (r6yVar3 != null) {
                bex0.a.b(r6yVar3, JsApiMethodType.OPEN_QR, d3, null, 12);
                s3q0 s3q0Var3 = s3q0.a;
            }
        }
    }

    public final void d() {
        boolean z = this.g;
        if (z) {
            r6y r6yVar = this.b;
            if (r6yVar != null) {
                r6yVar.x(JsApiEvent.QR_CLOSED, new JSONObject());
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            return;
        }
        if (z) {
            r6y r6yVar2 = this.b;
            if (r6yVar2 != null) {
                bex0.a.a(r6yVar2, JsApiMethodType.OPEN_QR, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                s3q0 s3q0Var2 = s3q0.a;
                return;
            }
            return;
        }
        r6y r6yVar3 = this.b;
        if (r6yVar3 != null) {
            bex0.a.a(r6yVar3, JsApiMethodType.OPEN_QR, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
            s3q0 s3q0Var3 = s3q0.a;
        }
    }
}

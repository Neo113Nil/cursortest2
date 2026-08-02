package xsna;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.apps.VkBuildAppStore;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: HuaweiInAppReviewManager.kt */
/* loaded from: classes2.dex */
public final class jlv implements crw {
    public final AppCompatActivity a;
    public final brw b;
    public final sbg c = new sbg(this, 23);
    public final u6k d = new u6k(this, 12);
    public final String e = VkBuildAppStore.HUAWEI.i();
    public io.reactivex.rxjava3.core.y<hgg0> f;
    public final hb0<Intent> g;

    public jlv(AppCompatActivity appCompatActivity, brw brwVar) {
        this.a = appCompatActivity;
        this.b = brwVar;
        this.g = appCompatActivity.registerForActivityResult(new cb0(), new ua0() { // from class: xsna.ilv
            @Override // xsna.ua0
            public final void onActivityResult(Object obj) {
                String str;
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.b;
                if (i != 0) {
                    switch (i) {
                        case 101:
                            str = "not_released";
                            break;
                        case 102:
                            str = "rating_submitted";
                            break;
                        case 103:
                            str = "comment_submitted";
                            break;
                        case 104:
                            str = "huawei_id_invalid";
                            break;
                        case 105:
                            str = "user_not_meet";
                            break;
                        case INVALID_REQUEST_BUILDER_ERROR_VALUE:
                            str = "commenting_disabled";
                            break;
                        case ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED /* 107 */:
                            str = "not_supported";
                            break;
                        case 108:
                            str = "user_canceled";
                            break;
                        default:
                            str = "unknown_code";
                            break;
                    }
                } else {
                    str = "unknown_error";
                }
                jlv jlvVar = jlv.this;
                String str2 = jlvVar.e;
                StringBuilder sb = new StringBuilder("Review completed, result code = ");
                jax0.a(activityResult.b, " (", str, "), result data = ", sb);
                sb.append(activityResult.c);
                r100.a(str2, sb.toString());
                io.reactivex.rxjava3.core.y<hgg0> yVar = jlvVar.f;
                if (yVar == null) {
                    yVar = null;
                }
                yVar.onSuccess(new hgg0(str));
            }
        });
    }

    @Override // xsna.crw
    public final void onCreate() {
        r100.a(this.e, "Huawei in-app review manager created");
    }

    @Override // xsna.crw
    public final void onPause() {
        r100.a(this.e, "Huawei in-app review manager paused");
        brw brwVar = this.b;
        brwVar.h = null;
        brwVar.i = null;
    }

    @Override // xsna.crw
    public final void onResume() {
        r100.a(this.e, "Huawei in-app review manager resumed");
        sbg sbgVar = this.c;
        brw brwVar = this.b;
        brwVar.h = sbgVar;
        brwVar.i = this.d;
    }
}

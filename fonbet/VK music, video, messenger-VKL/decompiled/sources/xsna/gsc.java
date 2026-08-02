package xsna;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.modal.base.ModalAuthHostActivity.a;
import com.vk.auth.modal.base.ModalAuthOpenerInterface$AuthParams;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gsc implements ua0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gsc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ua0
    public final void onActivityResult(Object obj) {
        String stringExtra;
        Uri g;
        String queryParameter;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = isc.t1;
                break;
            default:
                ModalAuthHostActivity modalAuthHostActivity = (ModalAuthHostActivity) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                List<String> list = ModalAuthHostActivity.h;
                if (activityResult.b == -1) {
                    Intent intent = activityResult.c;
                    if (intent != null && (stringExtra = intent.getStringExtra("CODE_READER_RESULT")) != null) {
                        if (drm0.N(stringExtra)) {
                            stringExtra = null;
                        }
                        if (stringExtra != null && (g = jeq0.g(stringExtra)) != null && (queryParameter = g.getQueryParameter(CampaignEx.JSON_KEY_AD_Q)) != null) {
                            if (drm0.N(queryParameter)) {
                                queryParameter = null;
                            }
                            if (queryParameter != null) {
                                new sv20(modalAuthHostActivity).a(modalAuthHostActivity, new ModalAuthOpenerInterface$AuthParams(queryParameter, queryParameter, false, String.valueOf(dgn0.b().b)), modalAuthHostActivity.new a());
                                break;
                            }
                        }
                    }
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    ref$BooleanRef.element = true;
                    ks2 ks2Var = new ks2(19, ref$BooleanRef, modalAuthHostActivity);
                    int i2 = 13;
                    ew3 ew3Var = new ew3(i2, ref$BooleanRef, modalAuthHostActivity);
                    v43 v43Var = new v43(i2, ref$BooleanRef, modalAuthHostActivity);
                    VkAlertData.b bVar = new VkAlertData.b(modalAuthHostActivity.getString(R.string.vk_multiqr_invalid_qr_title), modalAuthHostActivity.getString(R.string.vk_multiqr_invalid_qr_subtitle), (VkAlertData.DialogType) null, new VkAlertData.a(modalAuthHostActivity.getString(R.string.vk_qr_auth_open_internal_camera_alert_open_btn), null), new VkAlertData.a(modalAuthHostActivity.getString(R.string.vk_qr_auth_open_internal_camera_alert_cancel_btn), null), 36);
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).R(e3m.h(modalAuthHostActivity), bVar, new rr1(ks2Var, ew3Var, v43Var));
                    break;
                } else {
                    modalAuthHostActivity.finish();
                    break;
                }
                break;
        }
    }
}

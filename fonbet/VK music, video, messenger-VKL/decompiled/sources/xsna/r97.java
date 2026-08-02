package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.voip.VoipCallSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a4r0;
import xsna.e8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class r97 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r97(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final y97 y97Var = (y97) this.c;
                final Fragment fragment = (Fragment) this.d;
                final t6e0 t6e0Var = (t6e0) this.e;
                final n47 n47Var = (n47) this.f;
                final Cipher cipher = (Cipher) obj;
                break;
            case 1:
                Context context = (Context) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                x69.b(context, new wd0(3, (wzs) this.e, (VoipCallSource) this.f));
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                break;
            case 2:
                m5p m5pVar = (m5p) this.c;
                View view = (View) this.d;
                q7v0 q7v0Var = (q7v0) this.e;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.f;
                etv0 etv0Var = (etv0) obj;
                m5pVar.getClass();
                if (!m5p.b(view)) {
                    etv0Var.b(false);
                    break;
                } else {
                    q7v0Var.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.m.b);
                    break;
                }
            case 3:
                Context context2 = (Context) this.c;
                Uri uri = (Uri) this.d;
                LaunchContext launchContext = (LaunchContext) this.e;
                yp80 yp80Var = (yp80) this.f;
                a4r0.a aVar = (a4r0.a) obj;
                if (aVar != null) {
                    com.vk.common.links.b.h(context2, aVar.a, aVar.b, aVar.c, null);
                } else {
                    xwk.d().getBrowser().i(context2, uri, launchContext, null);
                }
                yp80Var.onSuccess();
                break;
            default:
                gyh0 gyh0Var = (gyh0) this.c;
                tur0 tur0Var = (tur0) this.d;
                mkr0 mkr0Var = tur0Var.l;
                Dialog dialog = (Dialog) this.e;
                ProfilesSimpleInfo profilesSimpleInfo = (ProfilesSimpleInfo) this.f;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = gyh0Var.b;
                if (imSearchItemLoggingInfo != null) {
                    mkr0Var.t0(ImSearchAnalytics.ClickAction.TAP, imSearchItemLoggingInfo);
                }
                tur0Var.getAdapterPosition();
                mkr0Var.B0(dialog, profilesSimpleInfo, gyh0Var.b);
                break;
        }
        return s3q0.a;
    }
}

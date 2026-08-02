package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.ProgressButton;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.user.UserProfile;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import kotlin.Pair;
import xsna.dbe0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class p21 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p21(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                s21.q((Context) obj4, (ButtonAction) obj3, (PostInteract) obj2, null);
                break;
            case 1:
                oio oioVar = (oio) obj;
                yq9 a = oioVar.a0().a();
                Canvas canvas = e52.a;
                Canvas canvas2 = ((d52) a).a;
                int saveLayer = canvas2.saveLayer(null, null);
                oio.x1(oioVar, (rek0) obj4, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                ((wzs) obj3).invoke(oioVar, (zhf0) obj2);
                s3q0 s3q0Var = s3q0.a;
                canvas2.restoreToCount(saveLayer);
                break;
            case 2:
                ((com.vk.superapp.miniapps.picker.j) obj4).g1.b();
                ((ProgressButton) obj3).S(true);
                ((View) obj2).setEnabled(false);
                break;
            case 3:
                izs izsVar = (izs) obj3;
                tho0 tho0Var = (tho0) obj;
                ((wh50) obj2).setValue(tho0Var);
                us2 us2Var = tho0Var.a;
                if (!epx.f(us2Var.c, ((tho0) obj4).a.c)) {
                    izsVar.invoke(new dbe0.o.a(us2Var.c));
                }
                break;
            case 4:
                cgq0 cgq0Var = (cgq0) obj4;
                ImageView imageView = (ImageView) obj3;
                UserProfile userProfile = (UserProfile) obj2;
                if (!((pxo0) cgq0Var.x.getValue()).a()) {
                    pkd f = g620.f();
                    Context context = imageView.getContext();
                    long j = userProfile.c.b;
                    String str = cgq0Var.w;
                    f.g(context, str, str, j);
                }
                break;
            default:
                CallMemberId callMemberId = (CallMemberId) obj4;
                CheckBox checkBox = (CheckBox) obj3;
                qkw0 qkw0Var = (qkw0) obj2;
                int i2 = qkw0.h1;
                if (callMemberId != null) {
                    com.vk.voip.ui.c.b.T0(Collections.singletonList(new Pair(callMemberId, Boolean.valueOf(!checkBox.isChecked()))));
                    qkw0Var.dismiss();
                }
                break;
        }
        return s3q0.a;
    }
}

package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import one.video.view.compose.models.RenderType;
import xsna.f8t0;
import xsna.h3v;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zle implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zle(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Integer valueOf;
        String f;
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ame ameVar = (ame) obj5;
                ao50 ao50Var = (ao50) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(49424656, intValue, -1, "com.vk.clips.compose.ClipsMviComposeView.Content.<anonymous> (ClipsMviComposeView.kt:22)");
                    }
                    ameVar.a(ao50Var, izsVar, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                cig cigVar = (cig) obj5;
                Context context = (Context) obj4;
                VoipCallSource voipCallSource = (VoipCallSource) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                UserId userId = (UserId) obj2;
                if (userId != null) {
                    cigVar.n(context, null, voipCallSource, booleanValue, true, userId);
                    throw null;
                }
                cigVar.o(context, null, voipCallSource, booleanValue, true);
                throw null;
            case 2:
                ((Integer) obj2).getClass();
                ((k3v) obj5).h((h3v.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                bjw.a(ne7.I(49), (androidx.compose.runtime.a) obj, (List) obj4, (izs) obj3, (q630) obj5);
                return s3q0.a;
            case 4:
                ArrayList arrayList = (ArrayList) obj4;
                com.vk.core.simplescreen.a aVar2 = (com.vk.core.simplescreen.a) obj3;
                int intValue2 = ((Integer) obj).intValue();
                Runnable runnable = (Runnable) obj2;
                efc0 feature = ((x020) obj5).a.getFeature();
                if (feature == null || !efc0.k0(feature, (MediaStoreEntry) arrayList.get(intValue2))) {
                    runnable.run();
                } else {
                    Context context2 = aVar2.getContext();
                    String e = y8g0.e(R.string.edit_photo_alert_title);
                    String e2 = y8g0.e(R.string.edit_photo_alert_description);
                    int i2 = h7u0.p;
                    h7u0.a c = h7u0.b.c(context2);
                    c.h0(e);
                    c.a.f = e2;
                    c.X(y8g0.e(R.string.vk_bottomsheet_confirmation_cancel), new qi60(1));
                    c.d0(y8g0.e(R.string.photo_editor_edit_button), new b6a0(runnable));
                    c.m();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((nc70) obj5).k((ad70) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                y4b0.b((q630) obj5, (OneVideoPlayer) obj4, (RenderType) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                wno0.a((vno0) obj5, (izs) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                f8t0.c.a aVar3 = (f8t0.c.a) obj5;
                String str = (String) obj4;
                VideoNewProfileHeaderViewV2 videoNewProfileHeaderViewV2 = (VideoNewProfileHeaderViewV2) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i3 = VideoNewProfileHeaderViewV2.y;
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1604722121, intValue3, -1, "com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2.bindTitleWithAgeMark.<anonymous>.<anonymous> (VideoNewProfileHeaderViewV2.kt:410)");
                    }
                    boolean J = aVar4.J(aVar3);
                    Object x = aVar4.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        if (aVar3 instanceof f8t0.c.a.C2854c) {
                            x = null;
                        } else {
                            if (epx.f(aVar3, f8t0.c.a.C2853a.a)) {
                                valueOf = Integer.valueOf(R.string.vk_video_profile_age_mark_16);
                            } else {
                                if (!epx.f(aVar3, f8t0.c.a.b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                valueOf = Integer.valueOf(R.string.vk_video_profile_age_mark_18);
                            }
                            x = valueOf;
                        }
                        aVar4.R(x);
                    }
                    Integer num = (Integer) x;
                    if (num == null) {
                        aVar4.K(-1003464706);
                        aVar4.j();
                        f = null;
                    } else {
                        f = l4.f(aVar4, -1003464705, num, aVar4, 0);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.z;
                    boolean y = aVar4.y(videoNewProfileHeaderViewV2);
                    Object x2 = aVar4.x();
                    if (y || x2 == c0012a) {
                        x2 = new pyr0(videoNewProfileHeaderViewV2, 4);
                        aVar4.R(x2);
                    }
                    tno0.a(new uno0(str, frv0Var, f, (gzs) x2), null, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                jiv0.a((String) obj5, (bkg0) obj4, (tlh0) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
        }
    }

    public /* synthetic */ zle(int i, List list, izs izsVar, q630 q630Var) {
        this.b = 3;
        this.e = izsVar;
        this.c = q630Var;
        this.d = list;
    }

    public /* synthetic */ zle(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ zle(vno0 vno0Var, izs izsVar, q630 q630Var, int i) {
        this.b = 7;
        this.c = vno0Var;
        this.e = izsVar;
        this.d = q630Var;
    }
}

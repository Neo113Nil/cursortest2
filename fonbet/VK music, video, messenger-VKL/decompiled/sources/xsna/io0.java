package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class io0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ io0(izs izsVar, boolean z, wh50 wh50Var, wh50 wh50Var2) {
        this.d = izsVar;
        this.c = z;
        this.e = wh50Var;
        this.f = wh50Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.d;
                wh50 wh50Var = (wh50) this.e;
                wh50 wh50Var2 = (wh50) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(245407731, intValue, -1, "com.vk.music.stickyplayer.presentation.components.AddToMyKidsCollectionButton.<anonymous> (AddToMyKidsCollectionButton.kt:63)");
                    }
                    boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                    Boolean bool = (Boolean) wh50Var.getValue();
                    bool.getClass();
                    int intValue2 = ((Number) izsVar.invoke(bool)).intValue();
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1648489128, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LikeOutline28> (VkIcons.kt:6416)");
                    }
                    lg90 b = or.b(aVar, 1483721278, R.drawable.vk_icon_like_outline_28, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new ko0(0, wh50Var2);
                        aVar.R(x);
                    }
                    nk2.e(intValue2, booleanValue, b, this.c, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (izs) x, aVar, 100696064);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                frv0 frv0Var = (frv0) this.d;
                s890 s890Var = (s890) this.e;
                jai jaiVar = (jai) this.f;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1401874042, intValue3, -1, "com.vk.core.compose.component.VkToolButton.<anonymous>.<anonymous> (VkToolButton.kt:102)");
                    }
                    if (this.c) {
                        aVar2.K(-1032320852);
                        frv0Var = frv0Var.b(aVar2);
                        aVar2.j();
                    } else {
                        aVar2.K(-1032255721);
                        aVar2.j();
                    }
                    grv0.a(frv0Var, kai.c(457886334, new q85(s890Var, jaiVar), aVar2), aVar2, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ io0(boolean z, frv0 frv0Var, s890 s890Var, jai jaiVar) {
        this.c = z;
        this.d = frv0Var;
        this.e = s890Var;
        this.f = jaiVar;
    }
}

package xsna;

import android.graphics.Bitmap;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.debug.ui.dev.DebugDevHintsFragment;
import com.vk.dto.hints.HintId;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.tab.presentation.TabView;
import java.util.UUID;
import xsna.bbv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x7c implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ x7c(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f5, code lost:
    
        if (r11 != com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse.VkCheckoutTransactionStatus.DONE) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e9  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        switch (this.b) {
            case 0:
                b0l0 b0l0Var = (b0l0) obj;
                if ((b0l0Var != null && !b0l0Var.b()) || b0l0Var == null) {
                    bbv0.g.getClass();
                    bbv0.a.f().b.e.f = UUID.randomUUID().toString();
                    return s3q0.a;
                }
                if (b0l0Var instanceof ajp0) {
                    TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus = ((ajp0) b0l0Var).c;
                    if (vkCheckoutTransactionStatus.h() && vkCheckoutTransactionStatus != TransactionStatusResponse.VkCheckoutTransactionStatus.DONE) {
                        z = true;
                        if (b0l0Var instanceof tr90) {
                            TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus2 = ((tr90) b0l0Var).c;
                            if (vkCheckoutTransactionStatus2.h()) {
                                break;
                            }
                        }
                        r2 = false;
                        if (!z || r2) {
                            bbv0.g.getClass();
                            bbv0.a.f().b.e.f = UUID.randomUUID().toString();
                        }
                        return s3q0.a;
                    }
                }
                z = false;
                if (b0l0Var instanceof tr90) {
                }
                r2 = false;
                if (!z) {
                }
                bbv0.g.getClass();
                bbv0.a.f().b.e.f = UUID.randomUUID().toString();
                return s3q0.a;
            case 1:
                int i = ClipFeedListFragment.a2;
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(659797786, intValue, -1, "com.vk.attachpicker.collages.ComposableSingletons$CollageOnboardingBottomSheetKt.lambda$659797786.<anonymous> (CollageOnboardingBottomSheet.kt:83)");
                    }
                    zfr0.f(SpinnerState.Error, null, null, 0L, null, null, aVar, 6, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(168750651, intValue2, -1, "com.vk.core.tool.view.ComposableSingletons$ThemedEmptyComposeViewKt.lambda$168750651.<anonymous> (ThemedEmptyComposeView.kt:16)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(90677708, intValue3, -1, "com.vk.core.compose.component.image.ComposableSingletons$VkResizableAvatarKt.lambda$90677708.<anonymous> (VkResizableAvatar.kt:31)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                int i2 = DebugDevHintsFragment.W;
                return Integer.valueOf(((HintId) obj).getId().compareTo(((HintId) obj2).getId()));
            case 6:
                RecyclerView recyclerView = (RecyclerView) obj2;
                return Boolean.valueOf(fhl.k(recyclerView, recyclerView.getChildAdapterPosition((View) obj)) instanceof ho60);
            case 7:
                ((NotificationCompat.h) obj).q((Bitmap) obj2);
                return s3q0.a;
            case 8:
                ((Integer) obj).intValue();
                oop0 oop0Var = (oop0) ((TabView) obj2);
                oop0Var.setTransparent(false);
                oop0Var.setTabSelected(oop0Var.isSelected());
                return s3q0.a;
            case 9:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i3 = jmu0.g1;
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1169558426, intValue4, -1, "com.vk.core.compose.modal.VkComposeModalBottomSheet.BottomContent.<anonymous> (VkComposeModalBottomSheet.kt:10)");
                    }
                    aVar4.K(-518082819);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-518082819, 8, -1, "com.vk.core.compose.modal.VkComposeModalBottomSheet.ThemedBottomContent (VkComposeModalBottomSheet.kt:16)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar5.K(-1218069704);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1218069704, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:174)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.L;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return frv0Var;
        }
    }

    public /* synthetic */ x7c(Object obj, int i) {
        this.b = i;
    }
}

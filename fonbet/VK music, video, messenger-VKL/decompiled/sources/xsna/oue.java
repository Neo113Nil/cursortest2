package xsna;

import androidx.compose.runtime.a;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.PlaceholderState;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import xsna.e0o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class oue implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ oue(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        r2 = 0;
        int i = 0;
        switch (this.b) {
            case 0:
                return (ShortVideoGetPlaylistsResponseDto) obj;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1725076673, intValue, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontServicesPlaceholderKt.lambda$1725076673.<anonymous> (StorefrontServicesPlaceholder.kt:196)");
                    }
                    PlaceholderState placeholderState = PlaceholderState.Services;
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new i8(26);
                        aVar.R(x);
                    }
                    hol0.f(placeholderState, null, null, true, null, (izs) x, aVar, 199686, 22);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1248654244, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkAvatarKt.lambda$-1248654244.<anonymous> (VkAvatar.kt:102)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                String str = (String) obj;
                fzn fznVar = (fzn) obj2;
                DonutContactsListFactory donutContactsListFactory = DonutContactsListFactory.SELECT_DONUT_USERS_VKAPP;
                return new s0o(str, fznVar.e, fznVar.a, SortOrder.BY_NAME, fznVar.d);
            case 4:
                e0o0 e0o0Var = (e0o0) obj;
                e0o0 e0o0Var2 = (e0o0) obj2;
                boolean z = e0o0Var instanceof e0o0.c;
                if ((z && (e0o0Var2 instanceof e0o0.a)) || (z && (e0o0Var2 instanceof e0o0.b))) {
                    i = -1;
                } else if (((e0o0Var instanceof e0o0.a) && (e0o0Var2 instanceof e0o0.c)) || ((e0o0Var instanceof e0o0.b) && (e0o0Var2 instanceof e0o0.c))) {
                    i = 1;
                }
                return Integer.valueOf(i);
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(-2068264460);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2068264460, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:156)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.t;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
        }
    }
}

package xsna;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vk.api.generated.account.dto.AccountGetPrivacySettingsResponseDto;
import com.vk.api.generated.account.dto.AccountPrivacySettingValueDto;
import com.vk.api.generated.account.dto.AccountPrivacySettingsDto;
import com.vk.api.generated.account.dto.AccountPrivacyValueDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x9d implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ x9d(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        UsersUserFullDto usersUserFullDto;
        List<AccountPrivacySettingsDto> d;
        AccountPrivacySettingsDto accountPrivacySettingsDto;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((zux) obj).b instanceof Integer);
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(895137426, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.events.ComposableSingletons$CommunityProfileContentEventsViewHolderKt.lambda$895137426.<anonymous> (CommunityProfileContentEventsViewHolder.kt:84)");
                    }
                    rrv0.d(null, null, null, null, jgz.f, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                return ((ccn) obj2).a();
            case 3:
                NotificationCompat.h hVar = (NotificationCompat.h) obj;
                int a = iah0.a(130.0f);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap((Bitmap) obj2, a, a, true);
                hVar.z.setImageViewBitmap(R.id.cover, createScaledBitmap);
                hVar.A.setImageViewBitmap(R.id.cover, createScaledBitmap);
                return s3q0.a;
            case 4:
                ((Integer) obj).intValue();
                return ((ua10) obj2).a.a;
            case 5:
                return (MusicTrack) ((zoj0) obj2).c(((Integer) obj).intValue());
            case 6:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(-2029182216);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2029182216, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:196)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.h0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            case 7:
                bv6 bv6Var = (bv6) obj2;
                AccountGetPrivacySettingsResponseDto accountGetPrivacySettingsResponseDto = (AccountGetPrivacySettingsResponseDto) ((bv6) obj).a;
                BaseBoolIntDto baseBoolIntDto = null;
                AccountPrivacySettingValueDto e = (accountGetPrivacySettingsResponseDto == null || (d = accountGetPrivacySettingsResponseDto.d()) == null || (accountPrivacySettingsDto = (AccountPrivacySettingsDto) j5g.a0(d)) == null) ? null : accountPrivacySettingsDto.e();
                AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto accountPrivacySettingValueCategoryDto = e instanceof AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto ? (AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto) e : null;
                AccountPrivacyValueDto d2 = accountPrivacySettingValueCategoryDto != null ? accountPrivacySettingValueCategoryDto.d() : null;
                if (d2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (d2 != AccountPrivacyValueDto.ALL) {
                    List list = (List) bv6Var.a;
                    if (list != null && (usersUserFullDto = (UsersUserFullDto) j5g.a0(list)) != null) {
                        baseBoolIntDto = usersUserFullDto.g3();
                    }
                    boolean z = baseBoolIntDto == BaseBoolIntDto.YES;
                    if (d2 == AccountPrivacyValueDto.FRIENDS) {
                        r2 = !z;
                    }
                }
                return Boolean.valueOf(r2);
            default:
                return s3q0.a;
        }
    }
}

package xsna;

import com.vk.api.comments.CommentsOrder;
import com.vk.api.generated.account.dto.AccountInfoDto;
import com.vk.api.generated.account.dto.AccountInfoSettingsDto;
import com.vk.api.generated.account.dto.AccountInfoSettingsNameDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.user.UserNameType;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vk.settings.GetAccountSettingsRequest;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiStickerPacksModel;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.i8s0;
import xsna.q630;
import xsna.w6w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class odi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ odi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-5780142, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.events.ComposableSingletons$CommunityProfileContentEventsViewHolderKt.lambda$-5780142.<anonymous> (CommunityProfileContentEventsViewHolder.kt:86)");
                    }
                    ahh.a(null, 0, 0L, 24, false, aVar, 3072, 23);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(657745752, intValue2, -1, "com.vk.clips.upload.vk.impl.preview.compose.ComposableSingletons$ScreenContentKt.lambda$657745752.<anonymous> (ScreenContent.kt:139)");
                }
                gbh0.c(q630.a.a, aVar2, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 2:
                i8s0.a.C3039a c3039a = (i8s0.a.C3039a) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(c3039a) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1138955347, intValue3, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoCardScreenContentKt.lambda$1138955347.<anonymous> (VideoCardScreenContent.kt:70)");
                    }
                    c3039a.a.d().c(VideoCardViewState.Size.Small, aVar3, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).Y);
                return s3q0.a;
            case 4:
                AccountInfoDto accountInfoDto = (AccountInfoDto) obj;
                String str = (String) obj2;
                CommentsOrder commentsOrder = (CommentsOrder) obj3;
                String i = accountInfoDto.i();
                String e = accountInfoDto.e();
                String C = accountInfoDto.C();
                String f = accountInfoDto.f();
                BaseBoolIntDto B = accountInfoDto.B();
                BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
                boolean z = B == baseBoolIntDto;
                boolean z2 = accountInfoDto.u() == baseBoolIntDto;
                UserNameType.a aVar4 = UserNameType.Companion;
                List<AccountInfoSettingsDto> W = accountInfoDto.W();
                String str2 = null;
                if (W != null) {
                    Iterator<T> it = W.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            if (((AccountInfoSettingsDto) obj4).e() == AccountInfoSettingsNameDto.IM_USER_NAME_TYPE) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    AccountInfoSettingsDto accountInfoSettingsDto = (AccountInfoSettingsDto) obj4;
                    if (accountInfoSettingsDto != null) {
                        str2 = accountInfoSettingsDto.f();
                    }
                }
                aVar4.getClass();
                UserNameType a = UserNameType.a.a(str2);
                if (a == null) {
                    a = UserNameType.VK;
                }
                return new GetAccountSettingsRequest.Result(i, e, C, f, str, z, z2, commentsOrder, a);
            case 5:
                String str3 = (String) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar5.J(str3) ? 4 : 2;
                }
                if (aVar5.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(511689025, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.RadioMiddle.<anonymous>.<anonymous> (MusicStandaloneBottomPlayer.kt:444)");
                    }
                    q630 E = ahn.E(q630.a.a, "title");
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    q630 d = defpackage.j0.d(1.0f, E, false);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.J;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str3, d, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar5, (intValue4 & 14) | 100663296, 48, 5880);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            default:
                return new w6w0.a((VmojiCharacterModel) obj, (VmojiStickerPacksModel) obj2, (List) obj3);
        }
    }
}

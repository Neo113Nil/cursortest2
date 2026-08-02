package xsna;

import android.graphics.PointF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.log.L;
import com.vk.music.player.PlayState;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.gxe;
import xsna.lh6;
import xsna.xn50;

/* compiled from: AudioRestrictionInteractorImpl.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow4 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0193, code lost:
    
        if (r0 == null) goto L71;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Long f;
        Long g;
        Long p;
        Long e;
        Long f2;
        Long g2;
        Long d;
        DeactivationWithMessage deactivationWithMessage = null;
        Integer valueOf = null;
        deactivationWithMessage = null;
        int i = 0;
        r2 = false;
        boolean z = false;
        i = 0;
        switch (this.b) {
            case 0:
                break;
            case 1:
                CartFragment cartFragment = (CartFragment) this.receiver;
                cartFragment.getClass();
                xn50.a.c(cartFragment, (rv9) obj);
                break;
            case 2:
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
                gxe gxeVar = (gxe) this.receiver;
                List<UsersFieldsDto> list = gxe.d;
                gxeVar.getClass();
                Owner a = new k2r0().a(usersUserFullDto);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                UsersUserCountersDto R = usersUserFullDto.R();
                long j = 0;
                linkedHashMap.put("clips", Long.valueOf((R == null || (d = R.d()) == null) ? 0L : d.longValue()));
                UsersUserCountersDto R2 = usersUserFullDto.R();
                linkedHashMap.put("clips_views", Long.valueOf((R2 == null || (g2 = R2.g()) == null) ? 0L : g2.longValue()));
                UsersUserCountersDto R3 = usersUserFullDto.R();
                linkedHashMap.put("clips_likes", Long.valueOf((R3 == null || (f2 = R3.f()) == null) ? 0L : f2.longValue()));
                UsersUserCountersDto R4 = usersUserFullDto.R();
                linkedHashMap.put("clips_followers", Long.valueOf((R4 == null || (e = R4.e()) == null) ? 0L : e.longValue()));
                UsersUserCountersDto R5 = usersUserFullDto.R();
                if (R5 != null && (p = R5.p()) != null) {
                    j = p.longValue();
                }
                linkedHashMap.put("lives", Long.valueOf(j));
                boolean f3 = epx.f(usersUserFullDto.T2(), Boolean.TRUE);
                String J2 = usersUserFullDto.J2();
                FriendsFriendStatusStatusDto V0 = usersUserFullDto.V0();
                int i2 = V0 != null ? V0.i() : 0;
                String description = usersUserFullDto.getDescription();
                if (description != null) {
                    if (drm0.N(description)) {
                        description = null;
                        break;
                    }
                }
                description = usersUserFullDto.N2();
                String str = description;
                String l0 = usersUserFullDto.l0();
                if (l0 != null) {
                    if (drm0.N(l0)) {
                        l0 = null;
                    }
                    if (l0 != null) {
                        DeactivationWithMessage.a aVar = new DeactivationWithMessage.a();
                        aVar.b(l0);
                        DeactivationWithMessage a2 = aVar.a();
                        DeactivationWithMessage.a aVar2 = new DeactivationWithMessage.a();
                        Deactivation.Reason reason = a2.b;
                        int h = reason.h();
                        Deactivation.Reason.Companion.getClass();
                        aVar2.a = Deactivation.Reason.a.a(h);
                        int i3 = gxe.a.$EnumSwitchMapping$0[reason.ordinal()];
                        if (i3 == 1) {
                            valueOf = Integer.valueOf(R.string.clips_profile_deactivation_reason_banned);
                        } else if (i3 == 2) {
                            valueOf = Integer.valueOf(R.string.clips_profile_deactivation_reason_deleted);
                        }
                        if (valueOf != null) {
                            aVar2.c = valueOf.intValue();
                        }
                        deactivationWithMessage = aVar2.a();
                    }
                }
                ClipGridParams.Data.Profile profile = new ClipGridParams.Data.Profile(new ClipsAuthor(a, linkedHashMap, f3 ? 1 : 0, J2, i2, -1, 0, str, deactivationWithMessage));
                UsersUserCountersDto R6 = usersUserFullDto.R();
                int longValue = (R6 == null || (g = R6.g()) == null) ? 0 : (int) g.longValue();
                UsersUserCountersDto R7 = usersUserFullDto.R();
                if (R7 != null && (f = R7.f()) != null) {
                    i = (int) f.longValue();
                }
                break;
            case 3:
                com.vk.im.ui.components.dialogs_list.c cVar = (com.vk.im.ui.components.dialogs_list.c) this.receiver;
                cVar.h.h.Hb((ProfilesInfo) obj);
                cVar.B(cVar);
                break;
            case 4:
                ((s6y0) this.receiver).a(((Number) obj).floatValue());
                break;
            case 5:
                j03.j(((ax00) this.receiver).i.a.requireContext(), (Throwable) obj);
                break;
            case 6:
                PointF pointF = (PointF) obj;
                utk0 utk0Var = ((yn40) this.receiver).s;
                utk0Var.i(null, lh6.a.a((lh6.a) utk0Var.getValue(), pointF.x, pointF.y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, null, 252));
                break;
            case 7:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 8:
                b080 b080Var = (b080) this.receiver;
                b080Var.getClass();
                xn50.a.c(b080Var, (a080) obj);
                break;
            case 9:
                break;
            case 10:
                u2b0 u2b0Var = ((feb0) this.receiver).a;
                if (((MusicTrack) obj).equals(u2b0Var.b()) && u2b0Var.m0() == PlayState.PAUSED) {
                    z = true;
                }
                break;
            case 11:
                ((View) this.receiver).setBackgroundResource(((Number) obj).intValue());
                break;
            default:
                L.i((Throwable) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow4(Object obj, int i) {
        super(1, obj, rw4.class, "map", "map(Lcom/vk/api/generated/audio/dto/AudioRestrictionInfoDto;)Lcom/vk/music/offline/configs/api/domain/model/AudioRestrictionInfo;", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, gxe.class, "userFullDtoToHeaderModel", "userFullDtoToHeaderModel(Lcom/vk/api/generated/users/dto/UsersUserFullDto;)Lcom/vk/clips/viewer/impl/grid/models/ClipsGridHeaderModel;", 0);
                break;
            case 3:
                super(1, obj, com.vk.im.ui.components.dialogs_list.c.class, "onLoadMemberSuccess", "onLoadMemberSuccess(Lcom/vk/im/engine/models/ProfilesInfo;)V", 0);
                break;
            case 4:
            case 5:
            case 8:
            case 11:
            default:
                break;
            case 6:
                super(1, obj, yn40.class, "handleTiltUpdate", "handleTiltUpdate(Landroid/graphics/PointF;)V", 0);
                break;
            case 7:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, com.vk.photos.root.photoflow.presentation.g.class, "isCurrentUser", "isCurrentUser(Lcom/vk/photos/root/photoflow/presentation/PhotoFlowState;)Z", 0);
                break;
            case 10:
                super(1, obj, feb0.class, "isPaused", "isPaused(Lcom/vk/dto/music/MusicTrack;)Z", 0);
                break;
            case 12:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}

package xsna;

import com.vk.api.generated.apps.dto.AppsRequestFromItemDto;
import com.vk.api.generated.apps.dto.AppsRequestItemDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.games.model.GamesCatalogSection;
import com.vk.games.model.GamesCatalogUser;
import java.util.List;

/* compiled from: GamesCatalogCollectionsMapper.kt */
/* loaded from: classes17.dex */
public final class eat {

    /* compiled from: GamesCatalogCollectionsMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseSexDto.values().length];
            try {
                iArr[BaseSexDto.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseSexDto.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final GamesCatalogUser a(UsersUserFullDto usersUserFullDto) {
        UserId s1 = usersUserFullDto.s1();
        BaseSexDto L2 = usersUserFullDto.L2();
        int i = L2 == null ? -1 : a.$EnumSwitchMapping$0[L2.ordinal()];
        return new GamesCatalogUser(s1, i != 1 ? i != 2 ? GamesCatalogUser.BaseSex.UNKNOWN : GamesCatalogUser.BaseSex.FEMALE : GamesCatalogUser.BaseSex.MALE, usersUserFullDto.D0(), usersUserFullDto.x1(), usersUserFullDto.X1(), usersUserFullDto.i2(), usersUserFullDto.r2());
    }

    public static final GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo b(AppsRequestItemDto appsRequestItemDto, sbt sbtVar, izs<? super Long, UsersUserFullDto> izsVar) {
        AppsRequestFromItemDto appsRequestFromItemDto;
        Integer i = appsRequestItemDto.i();
        int intValue = i != null ? i.intValue() : -1;
        Long g = appsRequestItemDto.g();
        long longValue = g != null ? g.longValue() : -1L;
        Integer e = appsRequestItemDto.e();
        int intValue2 = e != null ? e.intValue() : -1;
        String j = appsRequestItemDto.j();
        List<AppsRequestFromItemDto> f = appsRequestItemDto.f();
        if (f != null && (appsRequestFromItemDto = (AppsRequestFromItemDto) j5g.a0(f)) != null) {
            intValue = appsRequestFromItemDto.getId();
            longValue = appsRequestFromItemDto.e();
            intValue2 = appsRequestFromItemDto.d();
            j = appsRequestFromItemDto.f();
        }
        int i2 = intValue;
        int i3 = intValue2;
        String str = j;
        UsersUserFullDto invoke = izsVar.invoke(Long.valueOf(longValue));
        String type = appsRequestItemDto.getType();
        GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo.Type type2 = epx.f(type, "request") ? GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo.Type.Request : epx.f(type, "invite") ? GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo.Type.Invite : GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo.Type.Unknown;
        boolean z = appsRequestItemDto.n() == AppsRequestItemDto.UnreadDto.UNREAD;
        if (invoke != null) {
            return new GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo(sbtVar, a(invoke), type2, appsRequestItemDto.l(), z, i2, Long.valueOf(longValue), i3, str, appsRequestItemDto.k());
        }
        return null;
    }
}

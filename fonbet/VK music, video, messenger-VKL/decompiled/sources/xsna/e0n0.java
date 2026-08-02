package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.donut.dto.DonutDonatorSubscriptionInfoDto;
import com.vk.api.generated.donut.dto.DonutGetSubscriptionsResponseDto;
import com.vk.api.generated.donut.dto.DonutSubscriptionMethodInfoDto;
import com.vk.api.generated.donut.dto.DonutSubscriptionMethodInfoSubtitleDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.actions.ActionOpenUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.kyn;

/* compiled from: SubscriptionsFromDtoMapper.kt */
/* loaded from: classes18.dex */
public final class e0n0 {

    /* compiled from: SubscriptionsFromDtoMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DonutDonatorSubscriptionInfoDto.StatusDto.values().length];
            try {
                iArr[DonutDonatorSubscriptionInfoDto.StatusDto.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutDonatorSubscriptionInfoDto.StatusDto.EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DonutSubscriptionMethodInfoSubtitleDto.TypeDto.values().length];
            try {
                iArr2[DonutSubscriptionMethodInfoSubtitleDto.TypeDto.CHANGE_CARD_WITH_MASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DonutSubscriptionMethodInfoSubtitleDto.TypeDto.CHANGE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q5o a(DonutGetSubscriptionsResponseDto donutGetSubscriptionsResponseDto) {
        kyn kynVar;
        c1o c1oVar;
        Object obj;
        c1o c1oVar2;
        v2o v2oVar;
        String str;
        Object obj2;
        kyn.a bVar;
        if (donutGetSubscriptionsResponseDto.f() == null && donutGetSubscriptionsResponseDto.d() == null) {
            return new q5o(null, EmptyList.b);
        }
        DonutSubscriptionMethodInfoDto e = donutGetSubscriptionsResponseDto.e();
        if (e != null) {
            List<BaseImageDto> e2 = e.e();
            ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
            for (BaseImageDto baseImageDto : e2) {
                arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
            }
            new Image(arrayList);
            String g = e.g();
            DonutSubscriptionMethodInfoSubtitleDto f = e.f();
            int i = a.$EnumSwitchMapping$1[f.f().ordinal()];
            if (i == 1) {
                bVar = new kyn.a.b(f.e(), f.d());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new kyn.a.C3217a(f.e());
            }
            String url = e.d().getUrl();
            kynVar = new kyn(g, bVar, url != null ? new ActionOpenUrl(url, null, 2, null) : null);
        } else {
            kynVar = null;
        }
        List<DonutDonatorSubscriptionInfoDto> g2 = donutGetSubscriptionsResponseDto.g();
        ArrayList arrayList2 = new ArrayList();
        for (DonutDonatorSubscriptionInfoDto donutDonatorSubscriptionInfoDto : g2) {
            List<UsersUserFullDto> f2 = donutGetSubscriptionsResponseDto.f();
            List<GroupsGroupFullDto> d = donutGetSubscriptionsResponseDto.d();
            if (f2 != null) {
                Iterator<T> it = f2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (epx.f(((UsersUserFullDto) obj2).s1(), donutDonatorSubscriptionInfoDto.q())) {
                        break;
                    }
                }
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj2;
                if (usersUserFullDto != null) {
                    c1oVar2 = new c1o(usersUserFullDto.s1(), rq.a(usersUserFullDto, new StringBuilder(), ' '), usersUserFullDto.r2(), new VerifyInfo(usersUserFullDto.R2() == BaseBoolIntDto.YES, false, false, false, false, false, 62, null));
                    c1oVar = c1oVar2;
                    if (c1oVar == null) {
                        v2oVar = null;
                    } else {
                        String g3 = donutDonatorSubscriptionInfoDto.g();
                        String e3 = donutDonatorSubscriptionInfoDto.e();
                        int i2 = a.$EnumSwitchMapping$0[donutDonatorSubscriptionInfoDto.f().ordinal()];
                        if (i2 == 1) {
                            str = SignalingProtocol.KEY_ACTIVE;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "expiring";
                        }
                        v2oVar = new v2o(c1oVar, g3, e3, str, donutDonatorSubscriptionInfoDto.d(), kynVar != null);
                    }
                    if (v2oVar != null) {
                        arrayList2.add(v2oVar);
                    }
                }
            }
            if (d != null) {
                Iterator<T> it2 = d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (fkq0.e(((GroupsGroupFullDto) obj).P0()).equals(donutDonatorSubscriptionInfoDto.q())) {
                        break;
                    }
                }
                GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj;
                if (groupsGroupFullDto != null) {
                    c1oVar2 = new c1o(fkq0.e(groupsGroupFullDto.P0()), groupsGroupFullDto.y1(), groupsGroupFullDto.V1(), new VerifyInfo(groupsGroupFullDto.O2() == BaseBoolIntDto.YES, false, false, false, false, false, 62, null));
                    c1oVar = c1oVar2;
                    if (c1oVar == null) {
                    }
                    if (v2oVar != null) {
                    }
                }
            }
            c1oVar = null;
            if (c1oVar == null) {
            }
            if (v2oVar != null) {
            }
        }
        return new q5o(kynVar, arrayList2);
    }
}

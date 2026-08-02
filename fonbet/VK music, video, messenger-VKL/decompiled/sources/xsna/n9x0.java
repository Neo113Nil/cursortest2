package xsna;

import android.graphics.Color;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.badges.dto.BadgesBadgeLabelDto;
import com.vk.api.generated.badges.dto.BadgesBadgePriceDto;
import com.vk.api.generated.badges.dto.BadgesBadgeStyleDto;
import com.vk.api.generated.badges.dto.BadgesBadgeUnlockInfoDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.wall.dto.WallGetByIdExtendedResponseDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.dto.badges.BadgeImage;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.badges.BadgeUnlockInfo;
import com.vk.dto.badges.UnlockButton;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WallGetByIdResponseDtoToNewsEntryMapper.kt */
/* loaded from: classes3.dex */
public final class n9x0 {
    public final r9x0 a;

    public n9x0(zax0 zax0Var, ru0 ru0Var) {
        this.a = new r9x0(zax0Var, ru0Var);
    }

    public static NewsEntry a(n9x0 n9x0Var, WallGetByIdExtendedResponseDto wallGetByIdExtendedResponseDto) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        n9x0Var.getClass();
        WallWallItemDto wallWallItemDto = (WallWallItemDto) j5g.a0(wallGetByIdExtendedResponseDto.f());
        if (wallWallItemDto == null) {
            return null;
        }
        return n9x0Var.a.a(wallWallItemDto, c(wallGetByIdExtendedResponseDto.i()), b(wallGetByIdExtendedResponseDto.d()), pn00.n(linkedHashMap, b590.a(new b590(), null, wallGetByIdExtendedResponseDto.g(), wallGetByIdExtendedResponseDto.e(), 3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SparseArray b(List list) {
        Iterator it;
        BadgesBadgeDto badgesBadgeDto;
        Integer num;
        BadgeUnlockInfo badgeUnlockInfo;
        Integer num2;
        Integer num3;
        Integer num4;
        int i;
        String f;
        int i2;
        int i3;
        Integer valueOf;
        UnlockButton unlockButton;
        String str;
        Integer e;
        SparseArray sparseArray = new SparseArray();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BadgesBadgeDto badgesBadgeDto2 = (BadgesBadgeDto) it2.next();
                int id = badgesBadgeDto2.getId();
                String title = badgesBadgeDto2.getTitle();
                String description = badgesBadgeDto2.getDescription();
                if (description == null) {
                    description = "";
                }
                BadgeImage badgeImage = new BadgeImage(badgesBadgeDto2.e().d());
                Integer g = badgesBadgeDto2.g();
                BadgesBadgeDto.LockStatusDto i4 = badgesBadgeDto2.i();
                int i5 = i4 == null ? -1 : iz5.$EnumSwitchMapping$0[i4.ordinal()];
                BadgeItem.BadgeLockStatus badgeLockStatus = i5 != 1 ? i5 != 2 ? i5 != 3 ? BadgeItem.BadgeLockStatus.NONE : BadgeItem.BadgeLockStatus.UNLOCKED : BadgeItem.BadgeLockStatus.LOCKED : BadgeItem.BadgeLockStatus.NONE;
                BadgesBadgePriceDto j = badgesBadgeDto2.j();
                int d = j != null ? j.d() : 0;
                BadgesBadgePriceDto j2 = badgesBadgeDto2.j();
                Integer f2 = j2 != null ? j2.f() : null;
                BadgesBadgePriceDto j3 = badgesBadgeDto2.j();
                int intValue = (j3 == null || (e = j3.e()) == null) ? 0 : e.intValue();
                BadgesBadgeLabelDto f3 = badgesBadgeDto2.f();
                String d2 = f3 != null ? f3.d() : null;
                if (d2 == null) {
                    d2 = "";
                }
                BadgesBadgeUnlockInfoDto l = badgesBadgeDto2.l();
                if (l != null) {
                    String title2 = l.getTitle();
                    String e2 = l.e();
                    BaseLinkButtonDto d3 = l.d();
                    if (d3 != null) {
                        BaseLinkButtonActionDto e3 = d3.e();
                        if (e3 != null) {
                            String url = e3.getUrl();
                            if (url == null) {
                                url = "";
                            }
                            str = url;
                        } else {
                            str = null;
                        }
                        String title3 = d3.getTitle();
                        it = it2;
                        String str2 = title3 == null ? "" : title3;
                        badgesBadgeDto = badgesBadgeDto2;
                        num = null;
                        unlockButton = new UnlockButton(str2, str, null);
                    } else {
                        it = it2;
                        badgesBadgeDto = badgesBadgeDto2;
                        num = null;
                        unlockButton = null;
                    }
                    badgeUnlockInfo = new BadgeUnlockInfo(title2, e2, unlockButton);
                } else {
                    it = it2;
                    badgesBadgeDto = badgesBadgeDto2;
                    num = null;
                    badgeUnlockInfo = null;
                }
                List<BadgesBadgeStyleDto> k = badgesBadgeDto.k();
                if (k != null) {
                    Iterator it3 = k.iterator();
                    num3 = num;
                    Integer num5 = num3;
                    num4 = num5;
                    while (it3.hasNext()) {
                        BadgesBadgeStyleDto badgesBadgeStyleDto = (BadgesBadgeStyleDto) it3.next();
                        String d4 = badgesBadgeStyleDto.d();
                        if (d4 != null && d4.length() != 0) {
                            try {
                                i = Color.parseColor(d4);
                            } catch (IllegalArgumentException unused) {
                            }
                            f = badgesBadgeStyleDto.f();
                            if (f != null && f.length() != 0) {
                                try {
                                    i2 = Color.parseColor(f);
                                } catch (IllegalArgumentException unused2) {
                                }
                                Iterator it4 = it3;
                                i3 = iz5.$EnumSwitchMapping$1[badgesBadgeStyleDto.e().ordinal()];
                                Integer num6 = num;
                                if (i3 != 1) {
                                    valueOf = Integer.valueOf(i);
                                    num5 = Integer.valueOf(i2);
                                } else {
                                    if (i3 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Integer valueOf2 = Integer.valueOf(i);
                                    num4 = Integer.valueOf(i2);
                                    num3 = valueOf2;
                                    valueOf = num6;
                                }
                                num = valueOf;
                                it3 = it4;
                            }
                            i2 = 0;
                            Iterator it42 = it3;
                            i3 = iz5.$EnumSwitchMapping$1[badgesBadgeStyleDto.e().ordinal()];
                            Integer num62 = num;
                            if (i3 != 1) {
                            }
                            num = valueOf;
                            it3 = it42;
                        }
                        i = 0;
                        f = badgesBadgeStyleDto.f();
                        if (f != null) {
                            i2 = Color.parseColor(f);
                            Iterator it422 = it3;
                            i3 = iz5.$EnumSwitchMapping$1[badgesBadgeStyleDto.e().ordinal()];
                            Integer num622 = num;
                            if (i3 != 1) {
                            }
                            num = valueOf;
                            it3 = it422;
                        }
                        i2 = 0;
                        Iterator it4222 = it3;
                        i3 = iz5.$EnumSwitchMapping$1[badgesBadgeStyleDto.e().ordinal()];
                        Integer num6222 = num;
                        if (i3 != 1) {
                        }
                        num = valueOf;
                        it3 = it4222;
                    }
                    Integer num7 = num;
                    num = num5;
                    num2 = num7;
                } else {
                    num2 = num;
                    num3 = num2;
                    num4 = num3;
                }
                BadgeItem.BadgeStyle badgeStyle = new BadgeItem.BadgeStyle(num, num4, num2, num3);
                Boolean n = badgesBadgeDto.n();
                boolean booleanValue = n != null ? n.booleanValue() : false;
                String d5 = badgesBadgeDto.d();
                BadgeItem badgeItem = new BadgeItem(id, title, description, badgeImage, g, badgeLockStatus, d, f2, Integer.valueOf(intValue), null, d2, badgeUnlockInfo, booleanValue, badgeStyle, false, d5 == null ? "" : d5, 16384, null);
                sparseArray.put(badgeItem.b, badgeItem);
                it2 = it;
            }
        }
        return sparseArray;
    }

    public static ArrayMap c(List list) {
        ArrayMap arrayMap = new ArrayMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ReactionSet q = o19.q((LikesReactionSetDto) it.next());
                arrayMap.put(q.b, q);
            }
        }
        return arrayMap;
    }
}

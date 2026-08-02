package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.owners.dto.OwnersContentTabBaseDto;
import com.vk.api.generated.owners.dto.OwnersContentTabCollectionDto;
import com.vk.api.generated.owners.dto.OwnersContentTabDonutDto;
import com.vk.api.generated.owners.dto.OwnersContentTabMainDto;
import com.vk.api.generated.owners.dto.OwnersContentTabPostsDto;
import com.vk.api.generated.owners.dto.OwnersContentTabShortVideosDto;
import com.vk.api.generated.owners.dto.OwnersContentTabVideosDto;
import com.vk.api.generated.owners.dto.OwnersContentTabsConfigurationDto;
import com.vk.api.generated.owners.dto.OwnersGetContentTabsResponseDto;
import com.vk.dto.group.GroupContentTabCollectionType;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunityTabSettingMapper.kt */
/* loaded from: classes18.dex */
public final class r3i {
    public static ArrayList a(OwnersContentTabBaseDto ownersContentTabBaseDto) {
        List<String> f;
        List<String> S;
        ArrayList arrayList = new ArrayList();
        if (ownersContentTabBaseDto != null && (f = ownersContentTabBaseDto.f()) != null && (S = j5g.S(f, 1)) != null) {
            for (String str : S) {
                GroupContentTabType.Companion.getClass();
                arrayList.add(GroupContentTabType.a.a(str));
            }
        }
        return arrayList;
    }

    public static boolean b(OwnersContentTabBaseDto ownersContentTabBaseDto) {
        List<String> f;
        return (ownersContentTabBaseDto == null || (f = ownersContentTabBaseDto.f()) == null || !f.isEmpty()) ? false : true;
    }

    public static List c(OwnersGetContentTabsResponseDto ownersGetContentTabsResponseDto) {
        GroupContentTabSetting groupContentTabSetting;
        GroupContentTabSetting groupContentTabSetting2;
        GroupContentTabSetting groupContentTabSetting3;
        GroupContentTabSetting groupContentTabSetting4;
        GroupContentTabSetting groupContentTabSetting5;
        GroupContentTabType a;
        List<String> f;
        String str;
        Boolean e;
        Boolean d;
        OwnersContentTabsConfigurationDto d2;
        String str2;
        GroupContentTabType a2;
        List<String> f2;
        String str3;
        Boolean e2;
        Boolean d3;
        OwnersContentTabsConfigurationDto d4;
        String str4;
        GroupContentTabType a3;
        List<String> f3;
        Boolean e3;
        Boolean d5;
        OwnersContentTabsConfigurationDto d6;
        String str5;
        GroupContentTabType a4;
        List<String> f4;
        Boolean e4;
        Boolean d7;
        OwnersContentTabsConfigurationDto d8;
        String str6;
        GroupContentTabType a5;
        List<String> f5;
        Boolean e5;
        Boolean d9;
        OwnersContentTabsConfigurationDto d10;
        OwnersContentTabMainDto e6 = (ownersGetContentTabsResponseDto == null || (d10 = ownersGetContentTabsResponseDto.d()) == null) ? null : d10.e();
        String str7 = "";
        if (e6 != null) {
            boolean b = b(e6.d());
            if (b) {
                a5 = GroupContentTabType.MAIN_WALL;
            } else {
                GroupContentTabType.a aVar = GroupContentTabType.Companion;
                OwnersContentTabBaseDto d11 = e6.d();
                if (d11 == null || (f5 = d11.f()) == null || (str6 = (String) j5g.Y(f5)) == null) {
                    str6 = "";
                }
                aVar.getClass();
                a5 = GroupContentTabType.a.a(str6);
            }
            GroupContentTabType groupContentTabType = a5;
            ArrayList a6 = a(e6.d());
            OwnersContentTabBaseDto d12 = e6.d();
            boolean booleanValue = (d12 == null || (d9 = d12.d()) == null) ? false : d9.booleanValue();
            OwnersContentTabBaseDto d13 = e6.d();
            groupContentTabSetting = new GroupContentTabSetting(groupContentTabType, a6, booleanValue, (d13 == null || (e5 = d13.e()) == null) ? false : e5.booleanValue(), null, null, null, b, 112, null);
        } else {
            groupContentTabSetting = null;
        }
        OwnersContentTabPostsDto f6 = (ownersGetContentTabsResponseDto == null || (d8 = ownersGetContentTabsResponseDto.d()) == null) ? null : d8.f();
        if (f6 != null) {
            boolean b2 = b(f6.d());
            if (b2) {
                a4 = GroupContentTabType.WALL;
            } else {
                GroupContentTabType.a aVar2 = GroupContentTabType.Companion;
                OwnersContentTabBaseDto d14 = f6.d();
                if (d14 == null || (f4 = d14.f()) == null || (str5 = (String) j5g.Y(f4)) == null) {
                    str5 = "";
                }
                aVar2.getClass();
                a4 = GroupContentTabType.a.a(str5);
            }
            GroupContentTabType groupContentTabType2 = a4;
            ArrayList a7 = a(f6.d());
            OwnersContentTabBaseDto d15 = f6.d();
            boolean booleanValue2 = (d15 == null || (d7 = d15.d()) == null) ? false : d7.booleanValue();
            OwnersContentTabBaseDto d16 = f6.d();
            groupContentTabSetting2 = new GroupContentTabSetting(groupContentTabType2, a7, booleanValue2, (d16 == null || (e4 = d16.e()) == null) ? false : e4.booleanValue(), null, null, null, b2, 112, null);
        } else {
            groupContentTabSetting2 = null;
        }
        OwnersContentTabDonutDto d17 = (ownersGetContentTabsResponseDto == null || (d6 = ownersGetContentTabsResponseDto.d()) == null) ? null : d6.d();
        if (d17 != null) {
            boolean b3 = b(d17.d());
            if (b3) {
                a3 = GroupContentTabType.DONUT_WALL;
            } else {
                GroupContentTabType.a aVar3 = GroupContentTabType.Companion;
                OwnersContentTabBaseDto d18 = d17.d();
                if (d18 == null || (f3 = d18.f()) == null || (str4 = (String) j5g.Y(f3)) == null) {
                    str4 = "";
                }
                aVar3.getClass();
                a3 = GroupContentTabType.a.a(str4);
            }
            GroupContentTabType groupContentTabType3 = a3;
            ArrayList a8 = a(d17.d());
            OwnersContentTabBaseDto d19 = d17.d();
            boolean booleanValue3 = (d19 == null || (d5 = d19.d()) == null) ? false : d5.booleanValue();
            OwnersContentTabBaseDto d20 = d17.d();
            groupContentTabSetting3 = new GroupContentTabSetting(groupContentTabType3, a8, booleanValue3, (d20 == null || (e3 = d20.e()) == null) ? false : e3.booleanValue(), null, null, null, b3, 112, null);
        } else {
            groupContentTabSetting3 = null;
        }
        OwnersContentTabShortVideosDto g = (ownersGetContentTabsResponseDto == null || (d4 = ownersGetContentTabsResponseDto.d()) == null) ? null : d4.g();
        if (g != null) {
            boolean b4 = b(g.d());
            if (b4) {
                a2 = GroupContentTabType.SHORT_VIDEOS;
            } else {
                GroupContentTabType.a aVar4 = GroupContentTabType.Companion;
                OwnersContentTabBaseDto d21 = g.d();
                if (d21 == null || (f2 = d21.f()) == null || (str2 = (String) j5g.Y(f2)) == null) {
                    str2 = "";
                }
                aVar4.getClass();
                a2 = GroupContentTabType.a.a(str2);
            }
            GroupContentTabType groupContentTabType4 = a2;
            ArrayList a9 = a(g.d());
            OwnersContentTabBaseDto d22 = g.d();
            boolean booleanValue4 = (d22 == null || (d3 = d22.d()) == null) ? false : d3.booleanValue();
            OwnersContentTabBaseDto d23 = g.d();
            boolean booleanValue5 = (d23 == null || (e2 = d23.e()) == null) ? false : e2.booleanValue();
            GroupContentTabSetting.GroupContentTabTabletConfig groupContentTabTabletConfig = new GroupContentTabSetting.GroupContentTabTabletConfig(true, Boolean.FALSE);
            List<OwnersContentTabCollectionDto> f7 = g.f();
            ArrayList arrayList = new ArrayList();
            if (f7 != null) {
                for (OwnersContentTabCollectionDto ownersContentTabCollectionDto : f7) {
                    ArrayList arrayList2 = new ArrayList();
                    List<BaseImageDto> f8 = ownersContentTabCollectionDto.f();
                    if (f8 != null) {
                        for (BaseImageDto baseImageDto : f8) {
                            String url = baseImageDto.getUrl();
                            int width = baseImageDto.getWidth();
                            int height = baseImageDto.getHeight();
                            String id = baseImageDto.getId();
                            GroupContentTabSetting.GroupContentTabCollectionImage.Theme.a aVar5 = GroupContentTabSetting.GroupContentTabCollectionImage.Theme.Companion;
                            BaseImageDto.ThemeDto d24 = baseImageDto.d();
                            if (d24 == null || (str3 = d24.j()) == null) {
                                str3 = "";
                            }
                            aVar5.getClass();
                            GroupContentTabSetting.GroupContentTabCollectionImage.Theme a10 = GroupContentTabSetting.GroupContentTabCollectionImage.Theme.a.a(str3);
                            Boolean e7 = baseImageDto.e();
                            arrayList2.add(new GroupContentTabSetting.GroupContentTabCollectionImage(url, width, height, id, a10, e7 != null ? e7.booleanValue() : false));
                        }
                    }
                    GroupContentTabCollectionType.a aVar6 = GroupContentTabCollectionType.Companion;
                    String d25 = ownersContentTabCollectionDto.d();
                    if (d25 == null) {
                        d25 = "";
                    }
                    aVar6.getClass();
                    OwnersContentTabShortVideosDto ownersContentTabShortVideosDto = g;
                    GroupContentTabCollectionType a11 = GroupContentTabCollectionType.a.a(d25);
                    Integer e8 = ownersContentTabCollectionDto.e();
                    arrayList.add(new GroupContentTabSetting.GroupContentTabCollection(a11, e8 != null ? e8.intValue() : 0, arrayList2));
                    g = ownersContentTabShortVideosDto;
                }
            }
            groupContentTabSetting4 = new GroupContentTabSetting(groupContentTabType4, a9, booleanValue4, booleanValue5, groupContentTabTabletConfig, arrayList, new GroupContentTabSetting.GroupContentTabSpecialValues(g.e()), b4);
        } else {
            groupContentTabSetting4 = null;
        }
        OwnersContentTabVideosDto i = (ownersGetContentTabsResponseDto == null || (d2 = ownersGetContentTabsResponseDto.d()) == null) ? null : d2.i();
        if (i != null) {
            boolean b5 = b(i.d());
            if (b5) {
                a = GroupContentTabType.VIDEOS;
            } else {
                GroupContentTabType.a aVar7 = GroupContentTabType.Companion;
                OwnersContentTabBaseDto d26 = i.d();
                if (d26 != null && (f = d26.f()) != null && (str = (String) j5g.Y(f)) != null) {
                    str7 = str;
                }
                aVar7.getClass();
                a = GroupContentTabType.a.a(str7);
            }
            GroupContentTabType groupContentTabType5 = a;
            ArrayList a12 = a(i.d());
            OwnersContentTabBaseDto d27 = i.d();
            boolean booleanValue6 = (d27 == null || (d = d27.d()) == null) ? false : d.booleanValue();
            OwnersContentTabBaseDto d28 = i.d();
            groupContentTabSetting5 = new GroupContentTabSetting(groupContentTabType5, a12, booleanValue6, (d28 == null || (e = d28.e()) == null) ? false : e.booleanValue(), null, null, null, b5, 112, null);
        } else {
            groupContentTabSetting5 = null;
        }
        return rl3.I(new GroupContentTabSetting[]{groupContentTabSetting, groupContentTabSetting2, groupContentTabSetting3, groupContentTabSetting4, groupContentTabSetting5});
    }
}

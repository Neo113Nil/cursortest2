package xsna;

import com.vk.api.generated.apps.dto.AppsAdsBannerSettingsDto;
import com.vk.api.generated.apps.dto.AppsAdsClosingAdsSettingsDto;
import com.vk.api.generated.apps.dto.AppsAdsSlotsConfigItemDto;
import com.vk.api.generated.apps.dto.AppsAdsSlotsDto;
import com.vk.api.generated.apps.dto.AppsAdsSlotsMobwebInterstitialSettingsDto;
import com.vk.api.generated.apps.dto.AppsAdsSlotsSettingsDto;
import com.vk.api.generated.apps.dto.AppsAdsSlotsSettingsMappingDto;
import com.vk.api.generated.apps.dto.AppsAdsSplashAdsSettingsDto;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: AdvertisementMapper.kt */
/* loaded from: classes6.dex */
public final class c41 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static AdvertisementConfig a(AppsAdsSlotsDto appsAdsSlotsDto) {
        ?? r2;
        Map map;
        Map map2;
        Map map3;
        AdvertisementConfig.SlotConfig slotConfig;
        Map map4;
        Map map5;
        AdvertisementConfig.MobWebSlotConfig mobWebSlotConfig;
        AppsAdsBannerSettingsDto d;
        Integer f;
        AppsAdsBannerSettingsDto d2;
        AppsAdsBannerSettingsDto d3;
        AppsAdsBannerSettingsDto d4;
        List<AppsAdsSlotsSettingsMappingDto> i;
        AppsAdsBannerSettingsDto d5;
        AppsAdsSlotsSettingsDto d6;
        Integer e;
        AppsAdsSlotsSettingsDto d7;
        Integer d8;
        AppsAdsSlotsSettingsDto d9;
        AppsAdsSlotsSettingsDto d10;
        List<AppsAdsSlotsSettingsMappingDto> g;
        AppsAdsSlotsSettingsDto d11;
        Map map6;
        Integer f2;
        List<AppsAdsSlotsSettingsMappingDto> i2;
        Integer e2;
        Integer d12;
        List<AppsAdsSlotsSettingsMappingDto> g2;
        List<AppsAdsSlotsConfigItemDto> d13 = appsAdsSlotsDto.d();
        if (d13 != null) {
            List<AppsAdsSlotsConfigItemDto> list = d13;
            r2 = new ArrayList(c5g.u(list, 10));
            for (AppsAdsSlotsConfigItemDto appsAdsSlotsConfigItemDto : list) {
                int id = appsAdsSlotsConfigItemDto.getId();
                List<Integer> f3 = appsAdsSlotsConfigItemDto.j().f();
                List<AppsAdsSlotsSettingsMappingDto> g3 = appsAdsSlotsConfigItemDto.j().g();
                if (g3 != null) {
                    List<AppsAdsSlotsSettingsMappingDto> list2 = g3;
                    int e3 = on00.e(c5g.u(list2, 10));
                    if (e3 < 16) {
                        e3 = 16;
                    }
                    map = new LinkedHashMap(e3);
                    for (AppsAdsSlotsSettingsMappingDto appsAdsSlotsSettingsMappingDto : list2) {
                        Pair pair = new Pair(Integer.valueOf(appsAdsSlotsSettingsMappingDto.getId()), appsAdsSlotsSettingsMappingDto.d());
                        map.put(pair.i(), pair.j());
                    }
                } else {
                    map = null;
                }
                Map map7 = jgp.b;
                if (map == null) {
                    map = map7;
                }
                int i3 = appsAdsSlotsConfigItemDto.j().i();
                Integer d14 = appsAdsSlotsConfigItemDto.j().d();
                int i4 = 0;
                int intValue = d14 != null ? d14.intValue() : 0;
                Integer e4 = appsAdsSlotsConfigItemDto.j().e();
                int i5 = -1;
                AdvertisementConfig.SlotConfig slotConfig2 = new AdvertisementConfig.SlotConfig(f3, map, 0, intValue, i3, e4 != null ? e4.intValue() : -1);
                List<Integer> f4 = appsAdsSlotsConfigItemDto.f().f();
                List<AppsAdsSlotsSettingsMappingDto> g4 = appsAdsSlotsConfigItemDto.f().g();
                if (g4 != null) {
                    List<AppsAdsSlotsSettingsMappingDto> list3 = g4;
                    int e5 = on00.e(c5g.u(list3, 10));
                    if (e5 < 16) {
                        e5 = 16;
                    }
                    map2 = new LinkedHashMap(e5);
                    for (AppsAdsSlotsSettingsMappingDto appsAdsSlotsSettingsMappingDto2 : list3) {
                        Pair pair2 = new Pair(Integer.valueOf(appsAdsSlotsSettingsMappingDto2.getId()), appsAdsSlotsSettingsMappingDto2.d());
                        map2.put(pair2.i(), pair2.j());
                    }
                } else {
                    map2 = null;
                }
                Map map8 = map2 == null ? map7 : map2;
                int i6 = appsAdsSlotsConfigItemDto.f().i();
                Integer d15 = appsAdsSlotsConfigItemDto.f().d();
                int intValue2 = d15 != null ? d15.intValue() : 0;
                Integer e6 = appsAdsSlotsConfigItemDto.f().e();
                AdvertisementConfig.SlotConfig slotConfig3 = new AdvertisementConfig.SlotConfig(f4, map8, 0, intValue2, i6, e6 != null ? e6.intValue() : -1);
                AppsAdsSlotsSettingsDto i7 = appsAdsSlotsConfigItemDto.i();
                List<Integer> f5 = i7 != null ? i7.f() : null;
                if (f5 == null) {
                    f5 = EmptyList.b;
                }
                List<Integer> list4 = f5;
                AppsAdsSlotsSettingsDto i8 = appsAdsSlotsConfigItemDto.i();
                if (i8 == null || (g2 = i8.g()) == null) {
                    map3 = null;
                } else {
                    List<AppsAdsSlotsSettingsMappingDto> list5 = g2;
                    int e7 = on00.e(c5g.u(list5, 10));
                    if (e7 < 16) {
                        e7 = 16;
                    }
                    map3 = new LinkedHashMap(e7);
                    for (AppsAdsSlotsSettingsMappingDto appsAdsSlotsSettingsMappingDto3 : list5) {
                        Pair pair3 = new Pair(Integer.valueOf(appsAdsSlotsSettingsMappingDto3.getId()), appsAdsSlotsSettingsMappingDto3.d());
                        map3.put(pair3.i(), pair3.j());
                    }
                }
                Map map9 = map3 == null ? map7 : map3;
                AppsAdsSlotsSettingsDto i9 = appsAdsSlotsConfigItemDto.i();
                int i10 = i9 != null ? i9.i() : 0;
                AppsAdsSlotsSettingsDto i11 = appsAdsSlotsConfigItemDto.i();
                int intValue3 = (i11 == null || (d12 = i11.d()) == null) ? 0 : d12.intValue();
                AppsAdsSlotsSettingsDto i12 = appsAdsSlotsConfigItemDto.i();
                AdvertisementConfig.SlotConfig slotConfig4 = new AdvertisementConfig.SlotConfig(list4, map9, 0, intValue3, i10, (i12 == null || (e2 = i12.e()) == null) ? 0 : e2.intValue());
                if (appsAdsSlotsConfigItemDto.d() != null) {
                    List<Integer> g5 = appsAdsSlotsConfigItemDto.d().g();
                    AppsAdsBannerSettingsDto d16 = appsAdsSlotsConfigItemDto.d();
                    if (d16 == null || (i2 = d16.i()) == null) {
                        map6 = null;
                    } else {
                        List<AppsAdsSlotsSettingsMappingDto> list6 = i2;
                        int e8 = on00.e(c5g.u(list6, 10));
                        if (e8 < 16) {
                            e8 = 16;
                        }
                        map6 = new LinkedHashMap(e8);
                        for (AppsAdsSlotsSettingsMappingDto appsAdsSlotsSettingsMappingDto4 : list6) {
                            Pair pair4 = new Pair(Integer.valueOf(appsAdsSlotsSettingsMappingDto4.getId()), appsAdsSlotsSettingsMappingDto4.d());
                            map6.put(pair4.i(), pair4.j());
                        }
                    }
                    Map map10 = map6 == null ? map7 : map6;
                    int d17 = appsAdsSlotsConfigItemDto.d().d();
                    int e9 = appsAdsSlotsConfigItemDto.d().e();
                    AppsAdsBannerSettingsDto d18 = appsAdsSlotsConfigItemDto.d();
                    slotConfig = new AdvertisementConfig.SlotConfig(g5, map10, d17, e9, 0, (d18 == null || (f2 = d18.f()) == null) ? -1 : f2.intValue());
                } else {
                    slotConfig = AdvertisementConfig.SlotConfig.a;
                }
                AdvertisementConfig.SlotConfig slotConfig5 = slotConfig;
                AppsAdsSplashAdsSettingsDto k = appsAdsSlotsConfigItemDto.k();
                List<Integer> f6 = (k == null || (d11 = k.d()) == null) ? null : d11.f();
                if (f6 == null) {
                    f6 = EmptyList.b;
                }
                List<Integer> list7 = f6;
                AppsAdsSplashAdsSettingsDto k2 = appsAdsSlotsConfigItemDto.k();
                if (k2 == null || (d10 = k2.d()) == null || (g = d10.g()) == null) {
                    map4 = null;
                } else {
                    List<AppsAdsSlotsSettingsMappingDto> list8 = g;
                    int e10 = on00.e(c5g.u(list8, 10));
                    if (e10 < 16) {
                        e10 = 16;
                    }
                    map4 = new LinkedHashMap(e10);
                    for (AppsAdsSlotsSettingsMappingDto appsAdsSlotsSettingsMappingDto5 : list8) {
                        Pair pair5 = new Pair(Integer.valueOf(appsAdsSlotsSettingsMappingDto5.getId()), appsAdsSlotsSettingsMappingDto5.d());
                        map4.put(pair5.i(), pair5.j());
                    }
                }
                Map map11 = map4 == null ? map7 : map4;
                AppsAdsSplashAdsSettingsDto k3 = appsAdsSlotsConfigItemDto.k();
                int i13 = (k3 == null || (d9 = k3.d()) == null) ? 0 : d9.i();
                AppsAdsSplashAdsSettingsDto k4 = appsAdsSlotsConfigItemDto.k();
                int intValue4 = (k4 == null || (d7 = k4.d()) == null || (d8 = d7.d()) == null) ? 0 : d8.intValue();
                AppsAdsSplashAdsSettingsDto k5 = appsAdsSlotsConfigItemDto.k();
                AdvertisementConfig.SlotConfig slotConfig6 = new AdvertisementConfig.SlotConfig(list7, map11, 0, intValue4, i13, (k5 == null || (d6 = k5.d()) == null || (e = d6.e()) == null) ? -1 : e.intValue());
                AppsAdsClosingAdsSettingsDto e11 = appsAdsSlotsConfigItemDto.e();
                List<Integer> g6 = (e11 == null || (d5 = e11.d()) == null) ? null : d5.g();
                if (g6 == null) {
                    g6 = EmptyList.b;
                }
                List<Integer> list9 = g6;
                AppsAdsClosingAdsSettingsDto e12 = appsAdsSlotsConfigItemDto.e();
                if (e12 == null || (d4 = e12.d()) == null || (i = d4.i()) == null) {
                    map5 = null;
                } else {
                    List<AppsAdsSlotsSettingsMappingDto> list10 = i;
                    int e13 = on00.e(c5g.u(list10, 10));
                    map5 = new LinkedHashMap(e13 >= 16 ? e13 : 16);
                    for (AppsAdsSlotsSettingsMappingDto appsAdsSlotsSettingsMappingDto6 : list10) {
                        Pair pair6 = new Pair(Integer.valueOf(appsAdsSlotsSettingsMappingDto6.getId()), appsAdsSlotsSettingsMappingDto6.d());
                        map5.put(pair6.i(), pair6.j());
                    }
                }
                Map map12 = map5 == null ? map7 : map5;
                AppsAdsClosingAdsSettingsDto e14 = appsAdsSlotsConfigItemDto.e();
                int d19 = (e14 == null || (d3 = e14.d()) == null) ? 0 : d3.d();
                AppsAdsClosingAdsSettingsDto e15 = appsAdsSlotsConfigItemDto.e();
                if (e15 != null && (d2 = e15.d()) != null) {
                    i4 = d2.e();
                }
                int i14 = i4;
                AppsAdsClosingAdsSettingsDto e16 = appsAdsSlotsConfigItemDto.e();
                if (e16 != null && (d = e16.d()) != null && (f = d.f()) != null) {
                    i5 = f.intValue();
                }
                AdvertisementConfig.SlotConfig slotConfig7 = new AdvertisementConfig.SlotConfig(list9, map12, d19, i14, 0, i5);
                if (appsAdsSlotsConfigItemDto.g() != null) {
                    AppsAdsSlotsMobwebInterstitialSettingsDto g7 = appsAdsSlotsConfigItemDto.g();
                    mobWebSlotConfig = new AdvertisementConfig.MobWebSlotConfig(g7 != null ? g7.getUrl() : null);
                } else {
                    mobWebSlotConfig = new AdvertisementConfig.MobWebSlotConfig(null);
                }
                r2.add(new AdvertisementConfig.ConfigItem(id, slotConfig2, slotConfig3, slotConfig4, slotConfig5, slotConfig6, slotConfig7, mobWebSlotConfig));
            }
        } else {
            r2 = EmptyList.b;
        }
        return new AdvertisementConfig(r2);
    }
}

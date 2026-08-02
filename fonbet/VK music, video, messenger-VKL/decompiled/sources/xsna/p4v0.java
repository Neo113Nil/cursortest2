package xsna;

import com.vk.api.generated.audio.dto.AudioStreamMixSettingsCategoryDto;
import com.vk.api.generated.audio.dto.AudioStreamMixSettingsDto;
import com.vk.api.generated.audio.dto.AudioStreamMixSettingsOptionDto;
import com.vk.music.mixsettings.MixCategoryEntity;
import com.vk.music.mixsettings.MixCategoryType;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VkMixSettingsInfoEntityMapper.kt */
/* loaded from: classes.dex */
public final class p4v0 {

    /* compiled from: VkMixSettingsInfoEntityMapper.kt */
    public static final class a {
        public static MixSettingsEntity a(String str, String str2) {
            if (drm0.N(str)) {
                return null;
            }
            Set<Map.Entry> entrySet = f370.M(new JSONObject(str)).entrySet();
            ArrayList arrayList = new ArrayList(c5g.u(entrySet, 10));
            for (Map.Entry entry : entrySet) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getKey();
                MixCategoryType mixCategoryType = MixCategoryType.BUTTONS;
                ArrayList K = f370.K(new JSONArray(entry.getValue().toString()));
                ArrayList arrayList2 = new ArrayList(c5g.u(K, 10));
                Iterator it = K.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    arrayList2.add(new MixOptionEntity(next.toString(), next.toString(), "", "", true));
                }
                arrayList.add(new MixCategoryEntity(str3, str4, mixCategoryType, arrayList2));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new MixSettingsEntity(str2, "", false, arrayList);
        }

        public static void b(MixSettingsEntity mixSettingsEntity, String str) {
            if (str == null) {
                return;
            }
            HashMap M = f370.M(new JSONObject(str));
            for (MixCategoryEntity mixCategoryEntity : mixSettingsEntity.d()) {
                Object obj = M.get(mixCategoryEntity.getId());
                String obj2 = obj != null ? obj.toString() : null;
                if (obj2 != null && !drm0.N(obj2)) {
                    ArrayList K = f370.K(new JSONArray(obj2));
                    for (MixOptionEntity mixOptionEntity : mixCategoryEntity.d()) {
                        mixOptionEntity.a(K.contains(mixOptionEntity.getId()));
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static MixSettingsEntity a(AudioStreamMixSettingsDto audioStreamMixSettingsDto) {
        ?? r5;
        Object obj;
        ?? r10;
        String title = audioStreamMixSettingsDto.getTitle();
        String f = audioStreamMixSettingsDto.f();
        Boolean e = audioStreamMixSettingsDto.e();
        boolean booleanValue = e != null ? e.booleanValue() : false;
        List<AudioStreamMixSettingsCategoryDto> d = audioStreamMixSettingsDto.d();
        if (d != null) {
            List<AudioStreamMixSettingsCategoryDto> list = d;
            r5 = new ArrayList(c5g.u(list, 10));
            for (AudioStreamMixSettingsCategoryDto audioStreamMixSettingsCategoryDto : list) {
                String id = audioStreamMixSettingsCategoryDto.getId();
                String title2 = audioStreamMixSettingsCategoryDto.getTitle();
                Iterator it = MixCategoryType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((MixCategoryType) obj).i(), audioStreamMixSettingsCategoryDto.getType())) {
                        break;
                    }
                }
                MixCategoryType mixCategoryType = (MixCategoryType) obj;
                if (mixCategoryType == null) {
                    mixCategoryType = MixCategoryType.BUTTONS;
                }
                List<AudioStreamMixSettingsOptionDto> d2 = audioStreamMixSettingsCategoryDto.d();
                if (d2 != null) {
                    List<AudioStreamMixSettingsOptionDto> list2 = d2;
                    r10 = new ArrayList(c5g.u(list2, 10));
                    for (AudioStreamMixSettingsOptionDto audioStreamMixSettingsOptionDto : list2) {
                        String id2 = audioStreamMixSettingsOptionDto.getId();
                        String title3 = audioStreamMixSettingsOptionDto.getTitle();
                        String d3 = audioStreamMixSettingsOptionDto.d();
                        String e2 = audioStreamMixSettingsOptionDto.e();
                        Boolean f2 = audioStreamMixSettingsOptionDto.f();
                        r10.add(new MixOptionEntity(id2, title3, d3, e2, f2 != null ? f2.booleanValue() : false));
                    }
                } else {
                    r10 = EmptyList.b;
                }
                r5.add(new MixCategoryEntity(id, title2, mixCategoryType, r10));
            }
        } else {
            r5 = EmptyList.b;
        }
        return new MixSettingsEntity(title, f, booleanValue, r5);
    }
}

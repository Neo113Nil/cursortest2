package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.gson.Gson;
import com.vk.api.generated.shortVideo.dto.ShortVideoCreateResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCreateShareOnPlatformsDto;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.clips.uploader.api.model.ClipUploaderParams;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClipsUploadApiRequestBuilderImpl.kt */
/* loaded from: classes17.dex */
public final class qbf implements pbf {
    public final nlf a;

    public qbf(nlf nlfVar) {
        this.a = nlfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0184  */
    @Override // xsna.pbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.q<ShortVideoCreateResponseDto> a(com.vk.clips.uploader.api.model.a aVar, boolean z, long j) {
        List<String> list;
        Float f;
        Float f2;
        String str;
        String str2;
        String str3;
        JSONObject jSONObject;
        String str4;
        Integer num;
        String str5;
        List<String> list2;
        String str6;
        Boolean bool;
        List<String> list3;
        Integer num2;
        Boolean bool2;
        Boolean bool3;
        List O0;
        String str7;
        List<UserId> list4;
        String str8;
        vfx vfxVar;
        ArrayList arrayList;
        Set<ShortVideoCreateShareOnPlatformsDto> set;
        ClipUploaderParams.TemplatePublishInfo templatePublishInfo;
        ClipUploaderParams.LinkAttach linkAttach;
        ClipUploaderParams.LinkAttach linkAttach2;
        ClipUploaderParams.Location location;
        ClipUploaderParams.Location location2;
        UserId userId;
        ClipUploaderParams.OrdInfo ordInfo;
        ClipTemplateInfo clipTemplateInfo;
        ClipUploaderParams clipUploaderParams = aVar.b;
        MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem = aVar.c;
        MobileOfficialAppsClipsStat$TypeClipUploadItem a = mobileOfficialAppsClipsStat$TypeClipUploadItem != null ? MobileOfficialAppsClipsStat$TypeClipUploadItem.a(mobileOfficialAppsClipsStat$TypeClipUploadItem, Boolean.valueOf(z)) : null;
        String json = a != null ? new Gson().toJson(a) : null;
        JSONObject put = (clipUploaderParams == null || (clipTemplateInfo = clipUploaderParams.w) == null) ? null : new JSONObject().put("audio_template", clipTemplateInfo.e5());
        JSONObject put2 = (clipUploaderParams == null || (ordInfo = clipUploaderParams.y) == null) ? null : com.vk.movika.sdk.android.defaultplayer.interactive.c.b("is_ads", true).put("advertisers", new JSONArray().put(new JSONObject().put("er_id", ordInfo.c).put("ord_pred_id", ordInfo.b)));
        ClipUploaderData.Author author = aVar.a;
        ClipUploaderData.Author.VkGroup vkGroup = author instanceof ClipUploaderData.Author.VkGroup ? (ClipUploaderData.Author.VkGroup) author : null;
        UserId userId2 = vkGroup != null ? vkGroup.b : null;
        ClipUploaderData.Author.ExternalGroup externalGroup = author instanceof ClipUploaderData.Author.ExternalGroup ? (ClipUploaderData.Author.ExternalGroup) author : null;
        Long valueOf = (externalGroup == null || (userId = externalGroup.b) == null) ? null : Long.valueOf(userId.b);
        String str9 = clipUploaderParams != null ? clipUploaderParams.b : null;
        Float valueOf2 = (clipUploaderParams == null || (location2 = clipUploaderParams.c) == null) ? null : Float.valueOf(location2.b);
        Float valueOf3 = (clipUploaderParams == null || (location = clipUploaderParams.c) == null) ? null : Float.valueOf(location.c);
        String str10 = clipUploaderParams != null ? clipUploaderParams.d : null;
        String str11 = clipUploaderParams != null ? clipUploaderParams.e : null;
        List<String> list5 = clipUploaderParams != null ? clipUploaderParams.f : null;
        Boolean bool4 = clipUploaderParams != null ? clipUploaderParams.g : null;
        Boolean bool5 = clipUploaderParams != null ? clipUploaderParams.i : null;
        List<String> list6 = clipUploaderParams != null ? clipUploaderParams.j : null;
        List<String> list7 = clipUploaderParams != null ? clipUploaderParams.k : null;
        Long l = valueOf;
        Boolean bool6 = clipUploaderParams != null ? clipUploaderParams.l : null;
        String str12 = clipUploaderParams != null ? clipUploaderParams.m : null;
        List<String> list8 = list6;
        Integer num3 = clipUploaderParams != null ? clipUploaderParams.n : null;
        Integer num4 = clipUploaderParams != null ? clipUploaderParams.p : null;
        Boolean bool7 = clipUploaderParams != null ? clipUploaderParams.q : null;
        String str13 = clipUploaderParams != null ? clipUploaderParams.r : null;
        JSONObject jSONObject2 = put;
        List<Long> list9 = clipUploaderParams != null ? clipUploaderParams.s : null;
        Integer num5 = clipUploaderParams != null ? clipUploaderParams.t : null;
        if (clipUploaderParams != null) {
            VideoToClipInfo videoToClipInfo = clipUploaderParams.u;
            list = list7;
            if (videoToClipInfo != null) {
                StringBuilder sb = new StringBuilder();
                f = valueOf2;
                f2 = valueOf3;
                sb.append(videoToClipInfo.b);
                sb.append('_');
                sb.append(videoToClipInfo.c);
                str = sb.toString();
                str2 = (clipUploaderParams != null || (linkAttach2 = clipUploaderParams.v) == null) ? null : linkAttach2.b;
                str3 = (clipUploaderParams != null || (linkAttach = clipUploaderParams.v) == null) ? null : linkAttach.c;
                Integer num6 = clipUploaderParams == null ? clipUploaderParams.C : null;
                if (jSONObject2 == null) {
                    String jSONObject3 = jSONObject2.toString();
                    jSONObject = put2;
                    str4 = jSONObject3;
                } else {
                    jSONObject = put2;
                    str4 = null;
                }
                num = num6;
                str5 = (clipUploaderParams != null || (templatePublishInfo = clipUploaderParams.x) == null) ? null : templatePublishInfo.b;
                if (jSONObject == null) {
                    String jSONObject4 = jSONObject.toString();
                    list2 = list5;
                    str6 = jSONObject4;
                } else {
                    list2 = list5;
                    str6 = null;
                }
                bool = bool4;
                list3 = clipUploaderParams == null ? clipUploaderParams.z : null;
                num2 = clipUploaderParams == null ? clipUploaderParams.A : null;
                bool2 = clipUploaderParams == null ? clipUploaderParams.B : null;
                List<UserId> list10 = clipUploaderParams == null ? clipUploaderParams.D : null;
                bool3 = bool5;
                String str14 = clipUploaderParams == null ? clipUploaderParams.E : null;
                O0 = (clipUploaderParams != null || (set = clipUploaderParams.G) == null) ? null : j5g.O0(set);
                str7 = str14;
                list4 = list10;
                str8 = str6;
                vfx vfxVar2 = new vfx("shortVideo.create", new e630(8), new gub0(1));
                vfxVar2.g(j, PlaybackStateCompat.ACTION_PREPARE, 8589934592L, "file_size");
                if (userId2 != null) {
                    vfx.l(vfxVar2, "group_id", userId2, 8);
                }
                if (str9 != null) {
                    vfx.m(vfxVar2, "description", str9, 5000, 4);
                }
                if (f == null) {
                    vfxVar = vfxVar2;
                    vfxVar.h("latitude", f.floatValue(), -90.0d, 90.0d);
                } else {
                    vfxVar = vfxVar2;
                }
                if (f2 != null) {
                    vfxVar.h("longitude", f2.floatValue(), -180.0d, 180.0d);
                }
                vfx vfxVar3 = vfxVar;
                if (str10 != null) {
                    vfx.m(vfxVar3, "audio_id", str10, 0, 12);
                }
                if (str11 != null) {
                    vfx.m(vfxVar3, "clickable_stickers", str11, 0, 12);
                }
                if (list2 != null) {
                    vfxVar3.i("mask_ids", list2);
                }
                if (bool != null) {
                    vfxVar3.j("wallpost", bool.booleanValue());
                }
                if (bool3 != null) {
                    vfxVar3.j("wallpost_mute_notifications", bool3.booleanValue());
                }
                if (json != null) {
                    vfx.m(vfxVar3, "analytics", json, 0, 12);
                }
                if (list8 != null) {
                    vfxVar3.i("privacy_view", list8);
                }
                if (list != null) {
                    vfxVar3.i("privacy_comment", list);
                }
                if (bool6 != null) {
                    vfxVar3.j("can_make_duet", bool6.booleanValue());
                }
                if (str12 != null) {
                    vfx.m(vfxVar3, "duet_video_id", str12, 0, 12);
                }
                if (num3 != null) {
                    vfx.k(vfxVar3, "mini_app_id", num3.intValue(), 0, 8);
                }
                if (num4 != null) {
                    vfx.k(vfxVar3, "contest_id", num4.intValue(), 0, 8);
                }
                if (bool7 != null) {
                    vfxVar3.j("license_2022_agree", bool7.booleanValue());
                }
                if (str13 != null) {
                    vfx.m(vfxVar3, "create_tag", str13, 0, 12);
                }
                if (list9 != null) {
                    vfxVar3.i("generated_ov_ids", list9);
                }
                if (num5 != null) {
                    vfxVar3.f(num5.intValue(), 0, 2145906000, "publish_date");
                }
                if (str != null) {
                    vfx.m(vfxVar3, "source_video_id", str, 0, 12);
                }
                if (str2 != null) {
                    vfx.m(vfxVar3, "attached_link_url", str2, 0, 12);
                }
                if (str3 != null) {
                    vfx.m(vfxVar3, "attached_link_title", str3, 0, 12);
                }
                if (str4 != null) {
                    vfx.m(vfxVar3, "metainfo", str4, 0, 12);
                }
                if (str5 != null) {
                    vfx.m(vfxVar3, "template_raw_id", str5, 0, 12);
                }
                if (str8 != null) {
                    vfx.m(vfxVar3, "ord_info", str8, 0, 12);
                }
                if (list3 != null) {
                    vfxVar3.i("creation_features", list3);
                }
                if (num2 != null) {
                    vfx.k(vfxVar3, "target_playlist_id", num2.intValue(), 1, 8);
                }
                if (bool2 != null) {
                    vfxVar3.j("is_market_online_booking_enabled", bool2.booleanValue());
                }
                if (list4 != null) {
                    vfx.n(vfxVar3, list4);
                }
                if (str7 != null) {
                    vfx.m(vfxVar3, "attach_to_video_raw_id", str7, 0, 12);
                }
                if (l != null) {
                    vfxVar3.g(l.longValue(), (8 & 4) != 0 ? Long.MIN_VALUE : 1L, Long.MAX_VALUE, "external_group_id");
                }
                if (O0 == null) {
                    List list11 = O0;
                    arrayList = new ArrayList(c5g.u(list11, 10));
                    Iterator it = list11.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ShortVideoCreateShareOnPlatformsDto) it.next()).i());
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    vfxVar3.i("share_on_platforms", arrayList);
                }
                if (num != null) {
                    vfx.k(vfxVar3, "attached_donut_level_id", num.intValue(), 0, 8);
                }
                return this.a.c(vfxVar3);
            }
        } else {
            list = list7;
        }
        f = valueOf2;
        f2 = valueOf3;
        str = null;
        if (clipUploaderParams != null) {
        }
        if (clipUploaderParams != null) {
        }
        if (clipUploaderParams == null) {
        }
        if (jSONObject2 == null) {
        }
        num = num6;
        if (clipUploaderParams != null) {
        }
        if (jSONObject == null) {
        }
        bool = bool4;
        list3 = clipUploaderParams == null ? clipUploaderParams.z : null;
        num2 = clipUploaderParams == null ? clipUploaderParams.A : null;
        bool2 = clipUploaderParams == null ? clipUploaderParams.B : null;
        if (clipUploaderParams == null) {
        }
        bool3 = bool5;
        if (clipUploaderParams == null) {
        }
        if (clipUploaderParams != null) {
        }
        str7 = str14;
        list4 = list10;
        str8 = str6;
        vfx vfxVar22 = new vfx("shortVideo.create", new e630(8), new gub0(1));
        vfxVar22.g(j, PlaybackStateCompat.ACTION_PREPARE, 8589934592L, "file_size");
        if (userId2 != null) {
        }
        if (str9 != null) {
        }
        if (f == null) {
        }
        if (f2 != null) {
        }
        vfx vfxVar32 = vfxVar;
        if (str10 != null) {
        }
        if (str11 != null) {
        }
        if (list2 != null) {
        }
        if (bool != null) {
        }
        if (bool3 != null) {
        }
        if (json != null) {
        }
        if (list8 != null) {
        }
        if (list != null) {
        }
        if (bool6 != null) {
        }
        if (str12 != null) {
        }
        if (num3 != null) {
        }
        if (num4 != null) {
        }
        if (bool7 != null) {
        }
        if (str13 != null) {
        }
        if (list9 != null) {
        }
        if (num5 != null) {
        }
        if (str != null) {
        }
        if (str2 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        if (str5 != null) {
        }
        if (str8 != null) {
        }
        if (list3 != null) {
        }
        if (num2 != null) {
        }
        if (bool2 != null) {
        }
        if (list4 != null) {
        }
        if (str7 != null) {
        }
        if (l != null) {
        }
        if (O0 == null) {
        }
        if (arrayList != null) {
        }
        if (num != null) {
        }
        return this.a.c(vfxVar32);
    }
}

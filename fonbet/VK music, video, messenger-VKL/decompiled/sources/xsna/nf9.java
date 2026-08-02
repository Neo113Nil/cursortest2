package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.dto.stories.entities.stat.DrawingStatInfo;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StorySessionParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.StoryUploadType;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.am9;

/* compiled from: CameraAnalytics.kt */
/* loaded from: classes6.dex */
public final class nf9 implements w8i {
    public static final nf9 b = new nf9();
    public static final bpn0 c = new bpn0(new nd1(3));
    public static final bpn0 d = new bpn0(new fn4(3));

    /* compiled from: CameraAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryUploadType.values().length];
            try {
                iArr[StoryUploadType.PUBLISH_WITH_RECEIVERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryUploadType.PUBLISH_NOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryUploadType.PUBLISH_TO_DIALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(b.d dVar, String str) {
        List c0 = str != null ? drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6) : null;
        if (c0 != null && c0.size() == 2) {
            dVar.b(c0.get(0), "mask_owner_id");
            dVar.b(c0.get(1), "mask_id");
        }
        dVar.b(Integer.valueOf(str != null ? 1 : 0), "has_mask");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x044c  */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67, types: [int] */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.vkontakte.android.data.b$d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b.d b(nf9 nf9Var, StoryPublishEvent storyPublishEvent, am9.a aVar, StoryUploadParams storyUploadParams, CommonUploadParams commonUploadParams, boolean z, izs izsVar, int i) {
        Long id;
        String lowerCase;
        String lowerCase2;
        boolean z2;
        boolean z3;
        String str;
        izs izsVar2;
        String str2;
        String str3;
        JSONArray jSONArray;
        List<DrawingStatInfo> list;
        List<String> list2;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        List<ClickableSticker> list3;
        ClickableStickers clickableStickers;
        List<ClickableSticker> list4;
        boolean z4;
        String str4;
        String str5;
        boolean z5;
        Integer num;
        StorySharingInfo storySharingInfo;
        am9.a aVar2 = (i & 2) != 0 ? null : aVar;
        StoryUploadParams storyUploadParams2 = (i & 4) != 0 ? null : storyUploadParams;
        CommonUploadParams commonUploadParams2 = (i & 8) != 0 ? null : commonUploadParams;
        boolean z6 = (i & 16) != 0 ? false : z;
        izs izsVar3 = (i & 32) != 0 ? null : izsVar;
        nf9Var.getClass();
        ?? dVar = new b.d("story_publish");
        String obj = storyPublishEvent.toString();
        Locale locale = Locale.ROOT;
        dVar.b(obj.toLowerCase(locale), "event_type");
        StorySessionParams storySessionParams = storyUploadParams2 != null ? storyUploadParams2.O : null;
        ky90 e = e().d().e();
        if (storySessionParams == null || (id = storySessionParams.b) == null) {
            id = e().b().getId();
        }
        if (id != null) {
            dVar.b(Long.valueOf(id.longValue()), "story_publisher_session");
        }
        if (storySessionParams == null || (lowerCase = storySessionParams.c) == null) {
            lowerCase = e.a.name().toLowerCase(locale);
        }
        dVar.b(lowerCase, "camera_access_status");
        if (storySessionParams == null || (lowerCase2 = storySessionParams.d) == null) {
            lowerCase2 = e.b.name().toLowerCase(locale);
        }
        dVar.b(lowerCase2, "gallery_access_status");
        String str6 = "creation_entry_point";
        String str7 = "nav_screen";
        if (aVar2 == null) {
            z2 = z6;
            str = "group";
        } else {
            dVar.b(aVar2.e, "story_mode");
            String str8 = aVar2.j;
            z2 = z6;
            if (str8 != null) {
                z3 = true;
                if (brm0.B(str8, "club", false)) {
                    str = "group";
                    str8 = str;
                    dVar.b(str8, "nav_screen");
                    dVar.b(aVar2.a, "creation_entry_point");
                    dVar.b(Boolean.valueOf(aVar2.k), "is_light_on");
                    dVar.b(Boolean.valueOf(aVar2.l), "is_frontal_camera");
                    a(dVar, aVar2.m);
                }
            } else {
                z3 = true;
            }
            if (str8 != null) {
                str = "group";
                if (brm0.B(str8, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, false) == z3) {
                    str8 = CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE;
                }
            } else {
                str = "group";
            }
            dVar.b(str8, "nav_screen");
            dVar.b(aVar2.a, "creation_entry_point");
            dVar.b(Boolean.valueOf(aVar2.k), "is_light_on");
            dVar.b(Boolean.valueOf(aVar2.l), "is_frontal_camera");
            a(dVar, aVar2.m);
        }
        if (storyUploadParams2 == null) {
            izsVar2 = izsVar3;
            str2 = "creation_entry_point";
            str3 = "nav_screen";
        } else {
            dVar.b(storyUploadParams2.f, "camera_type");
            dVar.b(storyUploadParams2.i, "story_mode");
            Boolean bool = storyUploadParams2.l;
            if (bool != null) {
                dVar.b(bool, "is_light_on");
            }
            if (storyUploadParams2.m != null) {
                izsVar2 = izsVar3;
                dVar.b(Long.valueOf(r1.intValue()), "story_length");
            } else {
                izsVar2 = izsVar3;
            }
            ArrayList arrayList = storyUploadParams2.v;
            if (arrayList != null && !arrayList.isEmpty()) {
                dVar.b(Integer.valueOf(arrayList.size()), "questions_count");
            }
            String str9 = storyUploadParams2.q;
            if (str9 != null) {
                dVar.b(str9, "photo_filter");
            }
            Integer num2 = storyUploadParams2.r;
            if (num2 != null) {
                dVar.b(Integer.valueOf(num2.intValue()), "filter_position");
            }
            a(dVar, storyUploadParams2.c);
            StoryStatContainer storyStatContainer = storyUploadParams2.h;
            if (storyStatContainer != null) {
                List<ClickableStickerStatInfo> list5 = storyStatContainer.f;
                List<DrawingStatInfo> list6 = storyStatContainer.d;
                List<String> list7 = storyStatContainer.e;
                List<StickersStatInfo> list8 = storyStatContainer.c;
                dVar.b(Integer.valueOf(!storyStatContainer.b.isEmpty() ? 1 : 0), "has_text");
                dVar.b(storyStatContainer.Ab(), "texts");
                dVar.b(Integer.valueOf(!list8.isEmpty() ? 1 : 0), "has_sticker");
                if (list8.isEmpty()) {
                    list = list6;
                    list2 = list7;
                    str2 = "creation_entry_point";
                    str3 = "nav_screen";
                    jSONArray = null;
                } else {
                    jSONArray = new JSONArray();
                    List<StickersStatInfo> list9 = list8;
                    list = list6;
                    list2 = list7;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list9, 10));
                    Iterator it = list9.iterator();
                    while (it.hasNext()) {
                        StickersStatInfo stickersStatInfo = (StickersStatInfo) it.next();
                        stickersStatInfo.getClass();
                        JSONObject jSONObject = new JSONObject();
                        Iterator it2 = it;
                        String str10 = str6;
                        String str11 = str7;
                        jSONObject.put("id", stickersStatInfo.c);
                        jSONObject.put("pack_id", stickersStatInfo.d);
                        String str12 = stickersStatInfo.b;
                        if (str12 != null) {
                            jSONObject.put("type", str12);
                        }
                        String str13 = stickersStatInfo.e;
                        if (str13 != null) {
                            jSONObject.put(TtmlNode.TAG_STYLE, str13);
                        }
                        arrayList2.add(jSONObject);
                        it = it2;
                        str6 = str10;
                        str7 = str11;
                    }
                    str2 = str6;
                    str3 = str7;
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        jSONArray.put((JSONObject) it3.next());
                    }
                }
                dVar.b(jSONArray, "stickers");
                dVar.b(Integer.valueOf(!list2.isEmpty() ? 1 : 0), "has_emoji");
                if (list2.isEmpty()) {
                    jSONArray2 = null;
                } else {
                    jSONArray2 = new JSONArray();
                    for (Object obj2 : list2) {
                        if (obj2 != null) {
                            jSONArray2.put((String) obj2);
                        }
                    }
                }
                dVar.b(jSONArray2, "emojies");
                dVar.b(Integer.valueOf(!list.isEmpty() ? 1 : 0), "has_graffiti");
                if (list.isEmpty()) {
                    jSONArray3 = null;
                } else {
                    jSONArray3 = new JSONArray();
                    List<DrawingStatInfo> list10 = list;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list10, 10));
                    for (DrawingStatInfo drawingStatInfo : list10) {
                        drawingStatInfo.getClass();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("brush", drawingStatInfo.b);
                        jSONObject2.put("size", drawingStatInfo.c);
                        jSONObject2.put("color", drawingStatInfo.d);
                        arrayList3.add(jSONObject2);
                    }
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        jSONArray3.put((JSONObject) it4.next());
                    }
                }
                dVar.b(jSONArray3, "graffities");
                dVar.b(Integer.valueOf((list5.isEmpty() && ((clickableStickers = storyUploadParams2.j) == null || (list4 = clickableStickers.d) == null || !(list4.isEmpty() ^ true))) ? 0 : 1), "has_clickable_stickers");
                Serializer.c<StoryStatContainer> cVar = StoryStatContainer.CREATOR;
                JSONArray a2 = StoryStatContainer.a.a(list5);
                if (a2 == null) {
                    ArrayList arrayList4 = new ArrayList();
                    ClickableStickers clickableStickers2 = storyUploadParams2.j;
                    if (clickableStickers2 != null && (list3 = clickableStickers2.d) != null) {
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(((ClickableSticker) it5.next()).zb());
                        }
                    }
                    Serializer.c<StoryStatContainer> cVar2 = StoryStatContainer.CREATOR;
                    a2 = StoryStatContainer.a.a(arrayList4);
                }
                dVar.b(a2, "clickable_stickers");
                BackgroundInfo backgroundInfo = storyStatContainer.g;
                if (backgroundInfo != null) {
                    dVar.b(backgroundInfo.b, "background_type");
                    Integer num3 = backgroundInfo.d;
                    if (num3 != null) {
                        dVar.b(Integer.valueOf(num3.intValue()), "background_id");
                    }
                }
            } else {
                str2 = "creation_entry_point";
                str3 = "nav_screen";
            }
            Integer num4 = storyUploadParams2.y;
            if (num4 != null) {
                dVar.b(Integer.valueOf(num4.intValue()), "question_id");
            }
            dVar.b(Integer.valueOf(storyUploadParams2.H ? 1 : 0), "has_verticalization");
            String str14 = storyUploadParams2.I;
            if (str14 != null) {
                dVar.b(str14, "media_aspect_ratio");
            }
            Long l = storyUploadParams2.N;
            if (l != null) {
                dVar.b(Long.valueOf(l.longValue()), "attachment_id");
            }
            Long l2 = storyUploadParams2.M;
            if (l2 != null) {
                dVar.b(Long.valueOf(l2.longValue()), "attachment_owner_id");
            }
            if (brm0.w(storyUploadParams2.K, "my_top_track", true)) {
                dVar.b(1, "is_my_favorite_track");
            }
        }
        if (commonUploadParams2 != null) {
            dVar.b(Boolean.valueOf(commonUploadParams2.c), "is_add_to_news");
            if (!commonUploadParams2.d.isEmpty()) {
                dVar.b(new JSONArray((Collection) commonUploadParams2.d), "receivers");
            }
            String str15 = commonUploadParams2.j;
            if (str15 != null) {
                z4 = true;
                if (brm0.B(str15, "club", false)) {
                    str4 = str;
                    dVar.b(str4, str3);
                    dVar.b(commonUploadParams2.h, str2);
                    str5 = commonUploadParams2.q;
                    if (str5 != null) {
                        dVar.b(1, "is_story_teaser");
                        dVar.b(str5, "story_teaser_type");
                    }
                    if (commonUploadParams2.f == null) {
                        dVar.b(1, "is_reply_to_story");
                        dVar.b(Integer.valueOf(commonUploadParams2.f.b.c), "reply_to_story_id");
                        dVar.b(commonUploadParams2.f.b.d, "reply_to_story_owner_id");
                        z5 = false;
                    } else {
                        z5 = false;
                        dVar.b(0, "is_reply_to_story");
                    }
                    num = commonUploadParams2.l;
                    if (num != null) {
                        dVar.b(Integer.valueOf(num.intValue()), "mini_app_id");
                    }
                    storySharingInfo = commonUploadParams2.g;
                    if (storySharingInfo != null) {
                        int i2 = storySharingInfo.b;
                        if (i2 == 5 || i2 == 18 || i2 == 30) {
                            dVar.b(Integer.valueOf((int) (i2 != 5 ? i2 != 18 ? i2 != 30 ? z5 : 2 : 3 : z4)), "attachment_type");
                            dVar.b(storySharingInfo.c, "attachment_owner_id");
                            dVar.b(storySharingInfo.d, "attachment_id");
                        } else {
                            dVar.b(storySharingInfo.f, "attachment_link_url");
                        }
                    }
                }
            } else {
                z4 = true;
            }
            str4 = (str15 == null || brm0.B(str15, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, false) != z4) ? str15 : CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE;
            dVar.b(str4, str3);
            dVar.b(commonUploadParams2.h, str2);
            str5 = commonUploadParams2.q;
            if (str5 != null) {
            }
            if (commonUploadParams2.f == null) {
            }
            num = commonUploadParams2.l;
            if (num != null) {
            }
            storySharingInfo = commonUploadParams2.g;
            if (storySharingInfo != null) {
            }
        }
        ugg.a(dVar);
        dVar.b(Boolean.valueOf(ij9.a.f()), "has_frontal_camera");
        if (z2) {
            JSONArray jSONArray4 = new JSONArray();
            anz T = fxc0.B().T();
            jSONArray4.put(c("save_stories", ((evl0) c.getValue()).a()));
            jSONArray4.put(c("main_share_live_post", T.y()));
            jSONArray4.put(c("main_share_live_story", T.t()));
            jSONArray4.put(c("privacy_comments_live_group", T.O()));
            dVar.b(jSONArray4, "settings");
        }
        if (izsVar2 != null) {
            izsVar2.invoke(dVar);
        }
        return dVar;
    }

    public static JSONObject c(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("is_enabled", z);
        return jSONObject;
    }

    public static nxi0 e() {
        return (nxi0) d.getValue();
    }

    public static final void f() {
        j(StoryPublishEvent.CHANGE_SETTINGS, null, null, null, null, 46);
    }

    public static void j(StoryPublishEvent storyPublishEvent, am9.a aVar, StoryUploadParams storyUploadParams, CommonUploadParams commonUploadParams, izs izsVar, int i) {
        b(b, storyPublishEvent, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : storyUploadParams, (i & 8) != 0 ? null : commonUploadParams, (i & 16) == 0, (i & 32) != 0 ? null : izsVar, 64).e();
    }

    public static void n(b.d dVar, Integer num) {
        dVar.b(1, "has_clickable_sticker");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "situational_template");
        jSONObject.put("id_value", num);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        dVar.b(jSONArray, "clickable_stickers");
    }

    public final String d(CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams) {
        StoryUploadType storyUploadType = commonUploadParams != null ? commonUploadParams.k : null;
        int i = storyUploadType == null ? -1 : a.$EnumSwitchMapping$0[storyUploadType.ordinal()];
        return b(this, i != 1 ? i != 2 ? i != 3 ? StoryPublishEvent.PUBLISH_WITH_RECEIVERS : StoryPublishEvent.PUBLISH_TO_DIALOG : StoryPublishEvent.PUBLISH_NOW : StoryPublishEvent.PUBLISH_WITH_RECEIVERS, null, storyUploadParams, commonUploadParams, true, null, 98).a.toString();
    }

    public final void g() {
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_EDITOR);
        b(this, StoryPublishEvent.CLICK_TO_DROPPER, aVar, null, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).e();
    }

    public final void h(boolean z, StoryUploadParams storyUploadParams, CommonUploadParams commonUploadParams) {
        if (z) {
            b(this, StoryPublishEvent.OPEN_MUSIC_EDITOR, null, storyUploadParams, commonUploadParams != null ? CommonUploadParams.zb(commonUploadParams, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_EDITOR)) : null, true, null, 98).e();
        } else {
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS;
            am9.a aVar = new am9.a();
            aVar.j = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
            b(this, StoryPublishEvent.OPEN_MUSIC_CAMERA, aVar, null, null, true, null, 108).e();
        }
    }

    public final void i(long j) {
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.ATTACH_GALLERY);
        b.d b2 = b(this, StoryPublishEvent.STORY_VIDEO_DURATION_CROP, aVar, null, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        b2.b(Long.valueOf(j), "story_length");
        b2.b("video", "story_type");
        b2.e();
    }

    public final void k(StoryPublishEvent storyPublishEvent) {
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA);
        b(this, storyPublishEvent, aVar, null, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).e();
    }

    public final void l(long j) {
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.ATTACH_GALLERY);
        b.d b2 = b(this, StoryPublishEvent.OPEN_STORY_VIDEO_DURATION_CROPPER, aVar, null, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        b2.b(Long.valueOf(j), "story_length");
        b2.b("video", "story_type");
        b2.e();
    }

    public final void m() {
        am9.a aVar = new am9.a();
        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_EDITOR);
        b(this, StoryPublishEvent.OPEN_SETTINGS, aVar, null, null, true, null, 108).e();
    }
}

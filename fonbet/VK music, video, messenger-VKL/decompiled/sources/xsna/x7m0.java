package xsna;

import android.location.Location;
import android.text.TextUtils;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoriesInvolvementChoice;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: StoryParamsUtils.kt */
/* loaded from: classes18.dex */
public final class x7m0 {
    public static void a(StoryUploadParams storyUploadParams, CommonUploadParams commonUploadParams, String str, boolean z, wzs wzsVar) {
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        List<StickersStatInfo> list;
        JSONArray Ab;
        boolean z2 = commonUploadParams != null && commonUploadParams.Kb();
        if (storyUploadParams != null) {
            if (!TextUtils.isEmpty(storyUploadParams.c)) {
                wzsVar.invoke("mask_id", storyUploadParams.c);
            }
            Integer num = storyUploadParams.d;
            if (num != null) {
                wzsVar.invoke("section_id", Integer.valueOf(num.intValue()));
            }
            Location location = storyUploadParams.e;
            if (location != null) {
                wzsVar.invoke("latitude", String.valueOf(location.getLatitude()));
                wzsVar.invoke("longitude", String.valueOf(location.getLongitude()));
            }
            StoryUploadParams.CameraType cameraType = storyUploadParams.f;
            if (cameraType != null) {
                wzsVar.invoke("camera_type", cameraType);
            }
            StoryStatContainer storyStatContainer = storyUploadParams.h;
            if (storyStatContainer != null && (Ab = storyStatContainer.Ab()) != null) {
                wzsVar.invoke("texts_info", Ab.toString());
            }
            if (storyUploadParams.g) {
                wzsVar.invoke("live_cover", 1);
            }
            String str5 = storyUploadParams.i;
            Locale locale = Locale.ROOT;
            if (epx.f(str5, "VIDEO_MESSAGE".toLowerCase(locale))) {
                wzsVar.invoke("is_from_message", 1);
            }
            String str6 = storyUploadParams.i;
            if (str6 != null && str6.length() != 0 && !epx.f(storyUploadParams.i, "VIDEO_MESSAGE".toLowerCase(locale))) {
                if (epx.f(storyUploadParams.i, "COLLAGE".toLowerCase(locale))) {
                    wzsVar.invoke("effect", "PHOTO".toLowerCase(locale));
                } else {
                    wzsVar.invoke("effect", storyUploadParams.i);
                }
            }
            ClickableStickers clickableStickers = storyUploadParams.j;
            if (clickableStickers != null && !clickableStickers.d.isEmpty()) {
                String jSONObject = clickableStickers.e5().toString();
                wzsVar.invoke("clickable_stickers", jSONObject);
                L.e("stickers as string: ".concat(jSONObject));
            }
            StoryStatContainer storyStatContainer2 = storyUploadParams.h;
            if (storyStatContainer2 == null || (list = storyStatContainer2.c) == null) {
                arrayList = null;
            } else {
                List<StickersStatInfo> list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((StickersStatInfo) it.next()).c));
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                wzsVar.invoke("sticker_ids", j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62));
            }
            ArrayList arrayList3 = storyUploadParams.v;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                wzsVar.invoke("reply_to_questions", j5g.g0(storyUploadParams.v, StringUtils.COMMA, null, null, 0, w7m0.b, 30));
            }
            Boolean bool = storyUploadParams.n;
            if (bool != null) {
                wzsVar.invoke("no_sound", bool);
            }
            String str7 = storyUploadParams.s;
            if (str7 != null) {
                wzsVar.invoke("music_from_story", str7);
            }
            String str8 = storyUploadParams.q;
            if (str8 != null) {
                wzsVar.invoke("filter_photo", str8);
            }
            Boolean bool2 = storyUploadParams.w;
            if (bool2 != null) {
                wzsVar.invoke("music_cover", bool2);
            }
            Integer num2 = storyUploadParams.x;
            if (num2 != null) {
                wzsVar.invoke("situational_suggest_id", Integer.valueOf(num2.intValue()));
            }
            Integer num3 = storyUploadParams.y;
            if (num3 != null) {
                wzsVar.invoke("question_id", Integer.valueOf(num3.intValue()));
            }
            OrdData ordData = storyUploadParams.z;
            if (ordData != null && (str4 = ordData.c) != null) {
                wzsVar.invoke("ord_external_id", str4);
            }
            OrdData ordData2 = storyUploadParams.z;
            if (ordData2 != null && (str3 = ordData2.d) != null) {
                wzsVar.invoke("ord_erid", str3);
            }
            OrdData ordData3 = storyUploadParams.z;
            wzsVar.invoke("is_authors_ads", ordData3 != null ? Boolean.valueOf(ordData3.b) : null);
            Integer num4 = storyUploadParams.A;
            Integer num5 = storyUploadParams.B;
            if (num4 != null && num5 != null) {
                int intValue = num5.intValue();
                wzsVar.invoke("width", Integer.valueOf(num4.intValue()));
                wzsVar.invoke("height", Integer.valueOf(intValue));
            }
            if (!z2 && (str2 = storyUploadParams.C) != null) {
                wzsVar.invoke("privacy", j5g.g0(Collections.singletonList(str2), StringUtils.COMMA, null, null, 0, null, 62));
            }
            if (storyUploadParams.D != null) {
                wzsVar.invoke("lifetime", Long.valueOf(TimeUnit.HOURS.toSeconds(r4.intValue())));
            }
            String str9 = storyUploadParams.G;
            if (str9 != null) {
                wzsVar.invoke("thumb_hash", str9);
            }
            wzsVar.invoke("is_market_online_booking_enabled", Boolean.valueOf(storyUploadParams.E));
            StoriesInvolvementChoice storiesInvolvementChoice = storyUploadParams.F;
            if (storiesInvolvementChoice != null) {
                wzsVar.invoke("link_text", storiesInvolvementChoice.i());
            }
            String str10 = storyUploadParams.K;
            if (str10 != null) {
                wzsVar.invoke("memory_type", str10);
            }
            String str11 = storyUploadParams.L;
            if (str11 != null) {
                wzsVar.invoke("memory_date", str11);
            }
        }
        if (commonUploadParams != null) {
            wzsVar.invoke("group_id", commonUploadParams.e);
            if (commonUploadParams.Mb()) {
                wzsVar.invoke("reply_to_story", commonUploadParams.f.b.Fb());
            }
            if (z && !commonUploadParams.d.isEmpty()) {
                wzsVar.invoke("peer_ids", TextUtils.join(StringUtils.COMMA, commonUploadParams.d));
            }
            wzsVar.invoke("add_to_news", Integer.valueOf(commonUploadParams.c ? 1 : 0));
            StorySharingInfo storySharingInfo = commonUploadParams.g;
            if (storySharingInfo != null) {
                String str12 = storySharingInfo.e;
                String str13 = storySharingInfo.f;
                wzsVar.invoke("link_text", storySharingInfo.h);
                int i = storySharingInfo.b;
                if (i == 5 || i == 18 || i == 30) {
                    wzsVar.invoke("attach_type", i != 5 ? i != 18 ? i != 30 ? "" : "video" : "photo" : "audio");
                    Long l = storySharingInfo.c;
                    if (l != null) {
                        wzsVar.invoke("attach_owner_id", Long.valueOf(l.longValue()));
                    }
                    Long l2 = storySharingInfo.d;
                    if (l2 != null) {
                        wzsVar.invoke("attach_id", Long.valueOf(l2.longValue()));
                    }
                    if (!TextUtils.isEmpty(str12)) {
                        wzsVar.invoke("attach_access_key", str12);
                    }
                } else if (str13 != null && str13.length() != 0) {
                    wzsVar.invoke("link_url", str13);
                }
            }
            String str14 = commonUploadParams.h;
            if (str14 != null && str14.length() > 0) {
                wzsVar.invoke("entry_point", commonUploadParams.h);
            }
            String str15 = commonUploadParams.j;
            if (str15 != null && str15.length() > 0) {
                wzsVar.invoke("ref", commonUploadParams.j);
            }
            Integer num6 = commonUploadParams.l;
            if (num6 != null) {
                wzsVar.invoke("mini_app_id", Integer.valueOf(num6.intValue()));
            }
            wzsVar.invoke("is_one_time", Integer.valueOf(commonUploadParams.m ? 1 : 0));
            List<Integer> list3 = commonUploadParams.p;
            if (list3 != null) {
                wzsVar.invoke("narrative_ids", j5g.g0(list3, StringUtils.COMMA, null, null, 0, null, 62));
            }
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        wzsVar.invoke("analytics", str);
    }
}

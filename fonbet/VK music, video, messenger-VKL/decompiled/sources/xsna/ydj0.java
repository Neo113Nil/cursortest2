package xsna;

import android.os.Bundle;
import com.ironsource.D1;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.core.serialize.Serializer;
import com.vk.device.store.AppStore;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Link;
import com.vk.dto.newsfeed.Links;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.feedback.StarsFeedback;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticPlayheadReachedUrl;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityMrcUrl;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityOvvUrl;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vk.statistic.TargetPlayheadViewability;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.attachments.AdHideReason;
import com.vkontakte.android.attachments.AdSource;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.DisclaimerType;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ej90;
import xsna.uij0;

/* compiled from: ShitAttachmentParsers.kt */
/* loaded from: classes7.dex */
public final class ydj0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ShitAttachment a(JSONObject jSONObject, Map map, boolean z) {
        Bundle bundle;
        boolean z2;
        EntryHeader entryHeader;
        String str;
        NewsEntryWithAttachments.Cut cut;
        ArrayList arrayList;
        String optString;
        Feedback feedback;
        JSONObject optJSONObject;
        DisclaimerData disclaimerData;
        JSONArray optJSONArray;
        ArrayList arrayList2;
        Feedback feedback2;
        String str2;
        PhotoAttachment photoAttachment;
        JSONObject optJSONObject2;
        VideoAttachment videoAttachment;
        JSONArray optJSONArray2;
        String str3;
        String str4;
        ArrayList arrayList3;
        JSONObject optJSONObject3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        String str10;
        String str11;
        String str12;
        String str13;
        ShitAttachment.LeadForm leadForm;
        int i2;
        String str14;
        String str15;
        String optString2;
        JSONObject optJSONObject4;
        String str16;
        AdsChoices adsChoices;
        String str17;
        EntryHeader entryHeader2;
        JSONObject optJSONObject5;
        Links links;
        PhotoAttachment photoAttachment2;
        VideoAttachment videoAttachment2;
        yg5 yg5Var;
        Link link;
        Link link2;
        Link link3;
        Link link4;
        Link link5;
        ArrayList arrayList4;
        String str18;
        String str19;
        ShitAttachment.LeadForm.MainImage mainImage;
        int i3;
        String str20;
        String str21;
        String str22;
        int i4;
        String str23;
        ShitAttachment.LeadForm.LeadFormBlock.Type type;
        ArrayList arrayList5;
        JSONArray jSONArray;
        ShitAttachment.LeadForm.ContactField contactField;
        JSONArray jSONArray2;
        String str24;
        int i5;
        String str25;
        String str26;
        String str27;
        int i6;
        String str28;
        ArrayList arrayList6;
        String str29;
        int i7;
        int i8;
        VideoAttachment videoAttachment3;
        Owner owner;
        Enum r10;
        DisclaimerData disclaimerData2;
        ArrayList arrayList7;
        JSONArray jSONArray3;
        String str30;
        NewsEntryWithAttachments.Cut cut2;
        JSONArray jSONArray4 = jSONObject.getJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        if (jSONArray4.length() == 0) {
            return null;
        }
        int i9 = jSONObject.getInt("ads_id1");
        int i10 = jSONObject.getInt("ads_id2");
        String optString3 = jSONObject.optString("ads_title");
        String optString4 = jSONObject.optString("ads_debug");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("header");
        EntryHeader n = optJSONObject6 != null ? tci.n(optJSONObject6, map) : null;
        JSONObject jSONObject2 = jSONArray4.getJSONObject(0);
        String optString5 = jSONObject.optString("advertiser_info_url");
        String optString6 = jSONObject.optString("ad_marker");
        int optInt = jSONObject2.optInt("time_to_live");
        if (optInt != 0 && optInt < 2592000) {
            optInt += pvo0.a();
        }
        int i11 = optInt;
        NewsEntryWithAttachments.Cut cut3 = new NewsEntryWithAttachments.Cut(jSONObject2.optInt("short_attach_count", -1), jSONObject2.optInt("compact_attachments_before_cut", -1), (float) jSONObject2.optDouble("short_text_rate", 1.0d), false, 8, null);
        String optString7 = jSONObject2.optString("description");
        JSONObject optJSONObject7 = jSONObject2.optJSONObject("away_params");
        if (optJSONObject7 != null) {
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = optJSONObject7.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, optJSONObject7.optString(next, ""));
            }
            bundle = bundle2;
        } else {
            bundle = null;
        }
        ej90.b bVar = new ej90.b(bundle, cut3.d, uij0.c.a, o25.a().i().U, null, 0, 0, null, null, 480);
        ej90.c cVar = new ej90.c(0);
        ej90 a = ej90.a.a(optString7, bVar, cVar);
        boolean z3 = cVar.a;
        AdSource.a aVar = AdSource.Companion;
        String optString8 = jSONObject.optString("ad_source");
        aVar.getClass();
        AdSource a2 = AdSource.a.a(optString8);
        JSONObject optJSONObject8 = jSONObject.optJSONObject("hide_reasons");
        if (optJSONObject8 != null) {
            JSONArray optJSONArray3 = optJSONObject8.optJSONArray("items");
            if (optJSONArray3 != null) {
                arrayList7 = new ArrayList(optJSONArray3.length());
                int length = optJSONArray3.length();
                z2 = z3;
                int i12 = 0;
                while (i12 < length) {
                    EntryHeader entryHeader3 = n;
                    JSONObject optJSONObject9 = optJSONArray3.optJSONObject(i12);
                    int i13 = i12;
                    if (optJSONObject9 != null) {
                        jSONArray3 = optJSONArray3;
                        str30 = optString3;
                        cut2 = cut3;
                        arrayList7.add(new AdHideReason(optJSONObject9.getInt("id"), optJSONObject9.optString("name"), optJSONObject9.optString("icon")));
                    } else {
                        jSONArray3 = optJSONArray3;
                        str30 = optString3;
                        cut2 = cut3;
                    }
                    i12 = i13 + 1;
                    n = entryHeader3;
                    optJSONArray3 = jSONArray3;
                    optString3 = str30;
                    cut3 = cut2;
                }
            } else {
                z2 = z3;
                arrayList7 = null;
            }
            entryHeader = n;
            str = optString3;
            cut = cut3;
            if (arrayList7 != null) {
                arrayList = new ArrayList();
                for (Object obj : arrayList7) {
                    String str31 = ((AdHideReason) obj).c;
                    if (str31 != null && str31.length() != 0) {
                        arrayList.add(obj);
                    }
                }
                JSONObject optJSONObject10 = jSONObject2.optJSONObject("feedback");
                optString = optJSONObject10 == null ? optJSONObject10.optString("type") : null;
                if (!epx.f(optString, "stars")) {
                    Serializer.c<StarsFeedback> cVar2 = StarsFeedback.CREATOR;
                    feedback = StarsFeedback.a.a(optJSONObject10);
                } else if (epx.f(optString, "buttons")) {
                    Serializer.c<ButtonsFeedback> cVar3 = ButtonsFeedback.CREATOR;
                    feedback = ButtonsFeedback.a.a(optJSONObject10);
                } else {
                    feedback = null;
                }
                optJSONObject = jSONObject2.optJSONObject("disclaimer_img");
                if (optJSONObject == null) {
                    String optString9 = optJSONObject.optString("id");
                    if (optString9 != null) {
                        try {
                            r10 = Enum.valueOf(DisclaimerType.class, optString9.toUpperCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                            r10 = null;
                        }
                        DisclaimerType disclaimerType = (DisclaimerType) r10;
                        if (disclaimerType != null) {
                            Float u = f370.u("image_ratio", optJSONObject);
                            disclaimerData2 = new DisclaimerData(disclaimerType, u != null ? u.floatValue() : 0.1f, optJSONObject.optInt("min_height"));
                            disclaimerData = disclaimerData2;
                        }
                    }
                    disclaimerData2 = null;
                    disclaimerData = disclaimerData2;
                } else {
                    disclaimerData = null;
                }
                String optString10 = jSONObject.optString("recommendation_info");
                String optString11 = jSONObject.optString("ad_url");
                String str32 = "photo_main";
                optJSONArray = jSONObject2.optJSONArray("photo_main");
                if (optJSONArray == null) {
                    arrayList2 = arrayList;
                    feedback2 = feedback;
                    str2 = optString7;
                    photoAttachment = new PhotoAttachment(new Photo(new Image(optJSONArray, null, 2, null)));
                } else {
                    arrayList2 = arrayList;
                    feedback2 = feedback;
                    str2 = optString7;
                    photoAttachment = null;
                }
                optJSONObject2 = jSONObject2.optJSONObject("video");
                if (optJSONObject2 == null) {
                    if (epx.f(jSONObject2.getString("type"), "site")) {
                        videoAttachment3 = pht0.a(jSONObject2, null);
                    } else {
                        VideoFileOld b = com.vk.dto.common.c.b(optJSONObject2);
                        if (map != null && (owner = (Owner) map.get(b.b)) != null) {
                            b.p0 = owner.c;
                            b.q0 = owner.e;
                            b.f1(owner);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        b.b0 = true;
                        videoAttachment3 = new VideoAttachment(b);
                    }
                    videoAttachment = videoAttachment3;
                } else {
                    videoAttachment = null;
                }
                boolean f = epx.f(jSONObject2.optString("type"), "site_slider_special");
                Integer x = f370.x(jSONObject2, "click_area");
                optJSONArray2 = jSONObject2.optJSONArray("cards");
                String str33 = "statistics";
                String str34 = "link_url_target";
                String str35 = "button_open";
                String str36 = "site_description";
                int i14 = i9;
                String str37 = "followers";
                String str38 = "type";
                String str39 = "id";
                String str40 = "button";
                String str41 = "app_id";
                int i15 = i10;
                String str42 = "title";
                if (optJSONArray2 == null) {
                    String str43 = "statistics";
                    String str44 = "link_cta";
                    ArrayList arrayList8 = new ArrayList(optJSONArray2.length());
                    int length2 = optJSONArray2.length();
                    ArrayList arrayList9 = arrayList8;
                    int i16 = 0;
                    while (i16 < length2) {
                        int i17 = length2;
                        JSONObject optJSONObject11 = optJSONArray2.optJSONObject(i16);
                        if (optJSONObject11 != null) {
                            String string = optJSONObject11.getString("link_url");
                            String string2 = optJSONObject11.getString("title");
                            jSONArray2 = optJSONArray2;
                            JSONObject optJSONObject12 = optJSONObject11.optJSONObject("android_app");
                            String optString12 = optJSONObject12 != null ? optJSONObject12.optString("open_url") : null;
                            JSONObject optJSONObject13 = optJSONObject11.optJSONObject("android_app");
                            String optString13 = optJSONObject13 != null ? optJSONObject13.optString(str41) : null;
                            String string3 = optJSONObject11.getString("description");
                            String optString14 = optJSONObject11.optString("followers", optJSONObject11.optString("site_description"));
                            String string4 = optJSONObject11.getString("button");
                            String optString15 = optJSONObject11.optString(str35);
                            str24 = str41;
                            i5 = i16;
                            str25 = str35;
                            float optDouble = (float) optJSONObject11.optDouble(CampaignEx.JSON_KEY_STAR, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                            String optString16 = optJSONObject11.optString(str34);
                            if (optString16 != null) {
                                switch (optString16.hashCode()) {
                                    case -1820761141:
                                        optString16.equals(D1.e);
                                        break;
                                    case -1544407700:
                                        if (optString16.equals("internal_hidden")) {
                                            i8 = 1;
                                            break;
                                        }
                                        break;
                                    case 570410685:
                                        if (optString16.equals("internal")) {
                                            i8 = 2;
                                            break;
                                        }
                                        break;
                                    case 1475610601:
                                        if (optString16.equals("authorize")) {
                                            i8 = 3;
                                            break;
                                        }
                                        break;
                                }
                                str26 = str32;
                                str27 = str34;
                                str28 = str44;
                                ShitAttachment.Card card = new ShitAttachment.Card(string, string2, optString12, optString13, string3, optString14, string4, optString15, optDouble, i8, new PhotoAttachment(new Photo(new Image(optJSONObject11.getJSONArray(str32), null, 2, null))), optJSONObject11.optString("price"), optJSONObject11.optString("old_price"), f370.D(optJSONObject11, str28), null, null, f, x, 49152, null);
                                str29 = str43;
                                JSONArray optJSONArray4 = optJSONObject11.optJSONArray(str29);
                                i7 = i14;
                                i6 = i15;
                                c(optJSONArray4, card, card, i7, i6);
                                arrayList6 = arrayList9;
                                arrayList6.add(card);
                            }
                            i8 = 0;
                            str26 = str32;
                            str27 = str34;
                            str28 = str44;
                            ShitAttachment.Card card2 = new ShitAttachment.Card(string, string2, optString12, optString13, string3, optString14, string4, optString15, optDouble, i8, new PhotoAttachment(new Photo(new Image(optJSONObject11.getJSONArray(str32), null, 2, null))), optJSONObject11.optString("price"), optJSONObject11.optString("old_price"), f370.D(optJSONObject11, str28), null, null, f, x, 49152, null);
                            str29 = str43;
                            JSONArray optJSONArray42 = optJSONObject11.optJSONArray(str29);
                            i7 = i14;
                            i6 = i15;
                            c(optJSONArray42, card2, card2, i7, i6);
                            arrayList6 = arrayList9;
                            arrayList6.add(card2);
                        } else {
                            jSONArray2 = optJSONArray2;
                            str24 = str41;
                            i5 = i16;
                            str25 = str35;
                            str26 = str32;
                            str27 = str34;
                            i6 = i15;
                            str28 = str44;
                            arrayList6 = arrayList9;
                            str29 = str43;
                            i7 = i14;
                        }
                        str44 = str28;
                        str43 = str29;
                        arrayList9 = arrayList6;
                        i14 = i7;
                        i15 = i6;
                        length2 = i17;
                        optJSONArray2 = jSONArray2;
                        str35 = str25;
                        str32 = str26;
                        str34 = str27;
                        i16 = i5 + 1;
                        str41 = str24;
                    }
                    str3 = str35;
                    str4 = str44;
                    str33 = str43;
                    arrayList3 = arrayList9;
                } else {
                    str3 = "button_open";
                    str4 = "link_cta";
                    arrayList3 = null;
                }
                int i18 = i14;
                String str45 = str41;
                String str46 = str34;
                int i19 = i15;
                DisclaimerContent disclaimerContent = (photoAttachment == null || videoAttachment != null) ? DisclaimerContent.TEXT_WITH_CONTENT : arrayList3 != null ? DisclaimerContent.CARDS : DisclaimerContent.TEXT;
                boolean optBoolean = jSONObject.optBoolean("suggest_subscribe");
                Flags p = bu00.p(jSONObject);
                optJSONObject3 = jSONObject2.optJSONObject("lead_form");
                if (optJSONObject3 == null) {
                    i = i19;
                    String string5 = optJSONObject3.getString("lead_form_data");
                    String string6 = optJSONObject3.getString("form_id");
                    String string7 = optJSONObject3.getString("global_form_id");
                    String string8 = optJSONObject3.getString("title");
                    String string9 = optJSONObject3.getString("description");
                    JSONArray jSONArray5 = optJSONObject3.getJSONArray("contact_fields");
                    str6 = str33;
                    str5 = str4;
                    ArrayList arrayList10 = new ArrayList(jSONArray5.length());
                    int length3 = jSONArray5.length();
                    str10 = CampaignEx.JSON_KEY_STAR;
                    int i20 = 0;
                    while (i20 < length3) {
                        int i21 = length3;
                        String string10 = jSONArray5.getString(i20);
                        ShitAttachment.LeadForm.ContactField.Companion.getClass();
                        JSONArray jSONArray6 = jSONArray5;
                        ShitAttachment.LeadForm.ContactField[] values = ShitAttachment.LeadForm.ContactField.values();
                        int i22 = i20;
                        int length4 = values.length;
                        int i23 = 0;
                        while (true) {
                            if (i23 < length4) {
                                contactField = values[i23];
                                int i24 = i23;
                                if (!string10.equals(contactField.h())) {
                                    i23 = i24 + 1;
                                }
                            } else {
                                contactField = ShitAttachment.LeadForm.ContactField.UNSUPPORTED;
                            }
                        }
                        arrayList10.add(contactField);
                        i20 = i22 + 1;
                        length3 = i21;
                        jSONArray5 = jSONArray6;
                    }
                    JSONObject jSONObject3 = optJSONObject3.getJSONObject("main_image");
                    str9 = "link_url";
                    ShitAttachment.LeadForm.MainImage mainImage2 = new ShitAttachment.LeadForm.MainImage(jSONObject3.getString("1080x607"), jSONObject3.getString("480x270"), jSONObject3.getString("320x180"));
                    JSONObject jSONObject4 = optJSONObject3.getJSONObject("result_info");
                    ShitAttachment.LeadForm.ResultInfo resultInfo = new ShitAttachment.LeadForm.ResultInfo(jSONObject4.getString("title"), f370.A("description", jSONObject4), f370.A("site_url", jSONObject4), jSONObject4.optString("site_url_target"), f370.A("phone", jSONObject4), f370.A("promo_code", jSONObject4), jSONObject4.getString("cta_text"));
                    JSONArray jSONArray7 = optJSONObject3.getJSONArray("blocks");
                    if (jSONArray7 != null) {
                        ArrayList arrayList11 = new ArrayList(jSONArray7.length());
                        int length5 = jSONArray7.length();
                        int i25 = 0;
                        while (i25 < length5) {
                            JSONObject optJSONObject14 = jSONArray7.optJSONObject(i25);
                            JSONArray jSONArray8 = jSONArray7;
                            if (optJSONObject14 != null) {
                                str22 = str39;
                                i4 = length5;
                                String string11 = optJSONObject14.getString(str22);
                                mainImage = mainImage2;
                                String string12 = optJSONObject14.getString("text");
                                ShitAttachment.LeadForm.LeadFormBlock.Type.a aVar2 = ShitAttachment.LeadForm.LeadFormBlock.Type.Companion;
                                i3 = i25;
                                str21 = str38;
                                str23 = str40;
                                String string13 = optJSONObject14.getString(str21);
                                aVar2.getClass();
                                str18 = str36;
                                ShitAttachment.LeadForm.LeadFormBlock.Type[] values2 = ShitAttachment.LeadForm.LeadFormBlock.Type.values();
                                str20 = str37;
                                int length6 = values2.length;
                                int i26 = 0;
                                while (true) {
                                    if (i26 < length6) {
                                        type = values2[i26];
                                        int i27 = i26;
                                        if (!string13.equals(type.h())) {
                                            i26 = i27 + 1;
                                        }
                                    } else {
                                        type = ShitAttachment.LeadForm.LeadFormBlock.Type.UNSUPPORTED;
                                    }
                                }
                                ShitAttachment.LeadForm.LeadFormBlock.Type type2 = type;
                                JSONArray jSONArray9 = optJSONObject14.getJSONArray("answers");
                                if (jSONArray9 != null) {
                                    arrayList5 = new ArrayList(jSONArray9.length());
                                    int length7 = jSONArray9.length();
                                    str19 = str42;
                                    int i28 = 0;
                                    while (i28 < length7) {
                                        int i29 = length7;
                                        JSONObject optJSONObject15 = jSONArray9.optJSONObject(i28);
                                        int i30 = i28;
                                        if (optJSONObject15 != null) {
                                            jSONArray = jSONArray9;
                                            arrayList5.add(new ShitAttachment.LeadForm.LeadFormBlock.Answer(optJSONObject15.getString(str22), optJSONObject15.getString("text")));
                                        } else {
                                            jSONArray = jSONArray9;
                                        }
                                        i28 = i30 + 1;
                                        length7 = i29;
                                        jSONArray9 = jSONArray;
                                    }
                                } else {
                                    str19 = str42;
                                    arrayList5 = null;
                                }
                                arrayList11.add(new ShitAttachment.LeadForm.LeadFormBlock(string11, string12, type2, arrayList5));
                            } else {
                                str18 = str36;
                                str19 = str42;
                                mainImage = mainImage2;
                                i3 = i25;
                                str20 = str37;
                                str21 = str38;
                                str22 = str39;
                                i4 = length5;
                                str23 = str40;
                            }
                            str40 = str23;
                            length5 = i4;
                            mainImage2 = mainImage;
                            str37 = str20;
                            str42 = str19;
                            str39 = str22;
                            str38 = str21;
                            jSONArray7 = jSONArray8;
                            i25 = i3 + 1;
                            str36 = str18;
                        }
                        arrayList4 = arrayList11;
                    } else {
                        arrayList4 = null;
                    }
                    str7 = str36;
                    str8 = str42;
                    str11 = str37;
                    str12 = str38;
                    str13 = str40;
                    leadForm = new ShitAttachment.LeadForm(string5, string6, string7, string8, string9, arrayList10, mainImage2, resultInfo, arrayList4, optJSONObject3.getBoolean("is_filled_previously"), new ShitAttachment.LeadForm.Agreement(optJSONObject3.getString("agreement_url"), optJSONObject3.getString("agreement_url_target")), optJSONObject3.getBoolean("required_answers"));
                } else {
                    str5 = str4;
                    str6 = str33;
                    str7 = "site_description";
                    str8 = "title";
                    str9 = "link_url";
                    i = i19;
                    str10 = CampaignEx.JSON_KEY_STAR;
                    str11 = "followers";
                    str12 = str38;
                    str13 = "button";
                    leadForm = null;
                }
                JSONObject optJSONObject16 = jSONObject2.optJSONObject("android_app");
                String optString17 = optJSONObject16 == null ? optJSONObject16.optString(str45) : null;
                JSONObject optJSONObject17 = jSONObject2.optJSONObject("android_app");
                String optString18 = optJSONObject17 == null ? optJSONObject17.optString("open_url") : null;
                if (z) {
                    i2 = 0;
                    JSONObject optJSONObject18 = jSONObject2.optJSONObject("android_app");
                    if (optJSONObject18 != null) {
                        optString2 = optJSONObject18.optString(str45);
                        String str47 = str;
                        str15 = optString2;
                        str14 = str47;
                    } else {
                        str14 = str;
                        str15 = null;
                    }
                } else {
                    optString2 = AppStore.HUAWEI.j();
                    i2 = 0;
                    if (optString18 == null || !drm0.D(optString18, optString2, false)) {
                        optString2 = null;
                    }
                    if (optString2 == null) {
                        str14 = str;
                        str15 = optString17;
                    }
                    String str472 = str;
                    str15 = optString2;
                    str14 = str472;
                }
                optJSONObject4 = jSONObject.optJSONObject("ad_choices");
                if (optJSONObject4 == null) {
                    String str48 = str7;
                    adsChoices = (AdsChoices) AdsChoices.g.a(optJSONObject4);
                    str16 = str48;
                } else {
                    str16 = str7;
                    adsChoices = null;
                }
                String string14 = jSONObject2.getString(str12);
                if (entryHeader != null) {
                    Image image = new Image(jSONObject2.getJSONArray("photo_icon"), null, 2, null);
                    Serializer.c<Owner> cVar4 = Owner.CREATOR;
                    SourcePhoto sourcePhoto = new SourcePhoto(null, image, Owner.a.a(iah0.a(40), image));
                    str17 = str8;
                    entryHeader2 = new EntryHeader(sourcePhoto, new HeaderTitle(null, Collections.singletonList(new Text(cqm0.a(jSONObject2.optString(str17)), null, 2, null)), null, new VerifyInfo(false, false, false, false, false, false, 63, null), false, false, false), null, null, null, null, null, null, null);
                } else {
                    str17 = str8;
                    entryHeader2 = entryHeader;
                }
                String optString19 = jSONObject2.optString(str11);
                String optString20 = jSONObject2.optString(str16);
                int i31 = i2;
                String str49 = str13;
                String optString21 = jSONObject2.optString(str49);
                String string15 = jSONObject2.getString(str9);
                optJSONObject5 = jSONObject2.optJSONObject("links");
                if (optJSONObject5 == null) {
                    Serializer.c<Links> cVar5 = Links.CREATOR;
                    JSONObject optJSONObject19 = optJSONObject5.optJSONObject("header");
                    if (optJSONObject19 != null) {
                        Serializer.c<Link> cVar6 = Link.CREATOR;
                        link = Link.a.a(optJSONObject19);
                    } else {
                        link = null;
                    }
                    JSONObject optJSONObject20 = optJSONObject5.optJSONObject("text");
                    if (optJSONObject20 != null) {
                        Serializer.c<Link> cVar7 = Link.CREATOR;
                        link2 = Link.a.a(optJSONObject20);
                    } else {
                        link2 = null;
                    }
                    JSONObject optJSONObject21 = optJSONObject5.optJSONObject("image");
                    if (optJSONObject21 != null) {
                        Serializer.c<Link> cVar8 = Link.CREATOR;
                        link3 = Link.a.a(optJSONObject21);
                    } else {
                        link3 = null;
                    }
                    JSONObject optJSONObject22 = optJSONObject5.optJSONObject("footer");
                    if (optJSONObject22 != null) {
                        Serializer.c<Link> cVar9 = Link.CREATOR;
                        link4 = Link.a.a(optJSONObject22);
                    } else {
                        link4 = null;
                    }
                    JSONObject optJSONObject23 = optJSONObject5.optJSONObject(str49);
                    if (optJSONObject23 != null) {
                        Serializer.c<Link> cVar10 = Link.CREATOR;
                        link5 = Link.a.a(optJSONObject23);
                    } else {
                        link5 = null;
                    }
                    links = new Links(link, link2, link3, link4, link5);
                } else {
                    links = null;
                }
                String optString22 = jSONObject2.optString(CampaignEx.JSON_KEY_LINK_TYPE);
                String str50 = str14;
                float optDouble2 = (float) jSONObject2.optDouble(str10, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                String optString23 = jSONObject2.optString(str3);
                String string16 = jSONObject2.getString("ad_data");
                int s = hpt0.s(jSONObject2.optString(str46));
                String optString24 = jSONObject2.optString("disclaimer");
                String optString25 = jSONObject2.optString("genre");
                String optString26 = jSONObject2.optString(X3.j.D);
                String optString27 = jSONObject2.optString(str17);
                Image image2 = new Image(jSONObject2.optJSONArray("photo_icon"), null, 2, null);
                String optString28 = jSONObject2.optString("age_restriction");
                boolean optBoolean2 = jSONObject2.optBoolean("is_description_clickable", true);
                NewsEntry.TrackData trackData = new NewsEntry.TrackData(jSONObject.optString("track_code"), 0, 0L, false, false, null, null, 0, 254, null);
                String str51 = optString18;
                UserId userId = new UserId(jSONObject2.optLong("group_id", jSONObject2.optLong("user_id")));
                ArrayList q = arrayList2 == null ? p4g.q(arrayList2) : null;
                String D = f370.D(jSONObject2, str5);
                String D2 = f370.D(jSONObject2, "link_cta_target");
                Integer valueOf = D2 == null ? Integer.valueOf(hpt0.s(D2)) : null;
                Feedback feedback3 = feedback2;
                int i32 = i;
                ShitAttachment shitAttachment = new ShitAttachment(i18, i32, string14, str50, entryHeader2, optString19, optString20, optString21, string15, links, optString22, optDouble2, optString23, string16, null, str15, str51, s, str2, optString24, optString25, optString26, i11, optString27, image2, photoAttachment, videoAttachment, optString28, arrayList3, a, bundle, cut, optBoolean2, optString4, trackData, userId, null, optString5, optString6, z2, q, a2, leadForm, disclaimerData, null, optString10, optString11, disclaimerContent, p, adsChoices, optBoolean, x, D, valueOf, f370.D(jSONObject2, "link_cta_type"), 0, 4112, null);
                photoAttachment2 = photoAttachment;
                videoAttachment2 = videoAttachment;
                c(jSONObject.optJSONArray("ads_statistics"), shitAttachment, shitAttachment, i18, i32);
                c(jSONObject2.optJSONArray(str6), shitAttachment, shitAttachment, i18, i32);
                yg5Var = videoAttachment2 == null ? videoAttachment2.i : null;
                if (yg5Var != null) {
                    ShitAttachment.a.a(shitAttachment, yg5Var);
                }
                Serializer.c<PixelStats> cVar11 = PixelStats.CREATOR;
                AdsItemBlockAdStatPixelDto.TypeDto typeDto = AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION;
                shitAttachment.a0.c = new PixelStats(jSONObject2.optString("ad_data_impression"), typeDto, PixelStats.a.a(typeDto, i18, i32, i31, 24));
                shitAttachment.w = new DeprecatedStatisticUrl(jSONObject2.getString("ad_data_impression"), "impression", i18, i32, -1, shitAttachment);
                if (videoAttachment2 != null) {
                    videoAttachment2.Mb(shitAttachment);
                    s3q0 s3q0Var2 = s3q0.a;
                }
                if (videoAttachment2 != null) {
                    videoAttachment2.o = shitAttachment;
                    s3q0 s3q0Var3 = s3q0.a;
                }
                if (videoAttachment2 != null) {
                    videoAttachment2.b = true;
                    s3q0 s3q0Var4 = s3q0.a;
                }
                if (photoAttachment2 != null) {
                    photoAttachment2.b = true;
                    s3q0 s3q0Var5 = s3q0.a;
                }
                shitAttachment.l0 = dy2.i(shitAttachment.x);
                shitAttachment.g = feedback3;
                return shitAttachment;
            }
        } else {
            z2 = z3;
            entryHeader = n;
            str = optString3;
            cut = cut3;
        }
        arrayList = null;
        JSONObject optJSONObject102 = jSONObject2.optJSONObject("feedback");
        if (optJSONObject102 == null) {
        }
        if (!epx.f(optString, "stars")) {
        }
        optJSONObject = jSONObject2.optJSONObject("disclaimer_img");
        if (optJSONObject == null) {
        }
        String optString102 = jSONObject.optString("recommendation_info");
        String optString112 = jSONObject.optString("ad_url");
        String str322 = "photo_main";
        optJSONArray = jSONObject2.optJSONArray("photo_main");
        if (optJSONArray == null) {
        }
        optJSONObject2 = jSONObject2.optJSONObject("video");
        if (optJSONObject2 == null) {
        }
        boolean f2 = epx.f(jSONObject2.optString("type"), "site_slider_special");
        Integer x2 = f370.x(jSONObject2, "click_area");
        optJSONArray2 = jSONObject2.optJSONArray("cards");
        String str332 = "statistics";
        String str342 = "link_url_target";
        String str352 = "button_open";
        String str362 = "site_description";
        int i142 = i9;
        String str372 = "followers";
        String str382 = "type";
        String str392 = "id";
        String str402 = "button";
        String str412 = "app_id";
        int i152 = i10;
        String str422 = "title";
        if (optJSONArray2 == null) {
        }
        int i182 = i142;
        String str452 = str412;
        String str462 = str342;
        int i192 = i152;
        DisclaimerContent disclaimerContent2 = (photoAttachment == null || videoAttachment != null) ? DisclaimerContent.TEXT_WITH_CONTENT : arrayList3 != null ? DisclaimerContent.CARDS : DisclaimerContent.TEXT;
        boolean optBoolean3 = jSONObject.optBoolean("suggest_subscribe");
        Flags p2 = bu00.p(jSONObject);
        optJSONObject3 = jSONObject2.optJSONObject("lead_form");
        if (optJSONObject3 == null) {
        }
        JSONObject optJSONObject162 = jSONObject2.optJSONObject("android_app");
        if (optJSONObject162 == null) {
        }
        JSONObject optJSONObject172 = jSONObject2.optJSONObject("android_app");
        if (optJSONObject172 == null) {
        }
        if (z) {
        }
        optJSONObject4 = jSONObject.optJSONObject("ad_choices");
        if (optJSONObject4 == null) {
        }
        String string142 = jSONObject2.getString(str12);
        if (entryHeader != null) {
        }
        String optString192 = jSONObject2.optString(str11);
        String optString202 = jSONObject2.optString(str16);
        int i312 = i2;
        String str492 = str13;
        String optString212 = jSONObject2.optString(str492);
        String string152 = jSONObject2.getString(str9);
        optJSONObject5 = jSONObject2.optJSONObject("links");
        if (optJSONObject5 == null) {
        }
        String optString222 = jSONObject2.optString(CampaignEx.JSON_KEY_LINK_TYPE);
        String str502 = str14;
        float optDouble22 = (float) jSONObject2.optDouble(str10, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        String optString232 = jSONObject2.optString(str3);
        String string162 = jSONObject2.getString("ad_data");
        int s2 = hpt0.s(jSONObject2.optString(str462));
        String optString242 = jSONObject2.optString("disclaimer");
        String optString252 = jSONObject2.optString("genre");
        String optString262 = jSONObject2.optString(X3.j.D);
        String optString272 = jSONObject2.optString(str17);
        Image image22 = new Image(jSONObject2.optJSONArray("photo_icon"), null, 2, null);
        String optString282 = jSONObject2.optString("age_restriction");
        boolean optBoolean22 = jSONObject2.optBoolean("is_description_clickable", true);
        NewsEntry.TrackData trackData2 = new NewsEntry.TrackData(jSONObject.optString("track_code"), 0, 0L, false, false, null, null, 0, 254, null);
        String str512 = optString18;
        UserId userId2 = new UserId(jSONObject2.optLong("group_id", jSONObject2.optLong("user_id")));
        if (arrayList2 == null) {
        }
        String D3 = f370.D(jSONObject2, str5);
        String D22 = f370.D(jSONObject2, "link_cta_target");
        if (D22 == null) {
        }
        Feedback feedback32 = feedback2;
        int i322 = i;
        ShitAttachment shitAttachment2 = new ShitAttachment(i182, i322, string142, str502, entryHeader2, optString192, optString202, optString212, string152, links, optString222, optDouble22, optString232, string162, null, str15, str512, s2, str2, optString242, optString252, optString262, i11, optString272, image22, photoAttachment, videoAttachment, optString282, arrayList3, a, bundle, cut, optBoolean22, optString4, trackData2, userId2, null, optString5, optString6, z2, q, a2, leadForm, disclaimerData, null, optString102, optString112, disclaimerContent2, p2, adsChoices, optBoolean3, x2, D3, valueOf, f370.D(jSONObject2, "link_cta_type"), 0, 4112, null);
        photoAttachment2 = photoAttachment;
        videoAttachment2 = videoAttachment;
        c(jSONObject.optJSONArray("ads_statistics"), shitAttachment2, shitAttachment2, i182, i322);
        c(jSONObject2.optJSONArray(str6), shitAttachment2, shitAttachment2, i182, i322);
        if (videoAttachment2 == null) {
        }
        if (yg5Var != null) {
        }
        Serializer.c<PixelStats> cVar112 = PixelStats.CREATOR;
        AdsItemBlockAdStatPixelDto.TypeDto typeDto2 = AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION;
        shitAttachment2.a0.c = new PixelStats(jSONObject2.optString("ad_data_impression"), typeDto2, PixelStats.a.a(typeDto2, i182, i322, i312, 24));
        shitAttachment2.w = new DeprecatedStatisticUrl(jSONObject2.getString("ad_data_impression"), "impression", i182, i322, -1, shitAttachment2);
        if (videoAttachment2 != null) {
        }
        if (videoAttachment2 != null) {
        }
        if (videoAttachment2 != null) {
        }
        if (photoAttachment2 != null) {
        }
        shitAttachment2.l0 = dy2.i(shitAttachment2.x);
        shitAttachment2.g = feedback32;
        return shitAttachment2;
    }

    public static void b(ArrayList arrayList, ShitAttachment shitAttachment, int i, int i2) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.i();
                String str2 = str == null ? "" : str;
                String str3 = (String) pair.j();
                String str4 = str3 == null ? "" : str3;
                shitAttachment.h(new DeprecatedStatisticUrl(str2, str4, i, i2, shitAttachment.Y7(str4), shitAttachment));
            }
        }
    }

    public static void c(JSONArray jSONArray, DeprecatedStatisticInterface deprecatedStatisticInterface, dqa0 dqa0Var, int i, int i2) {
        DeprecatedStatisticUrl deprecatedStatisticPlayheadViewabilityMrcUrl;
        DeprecatedStatisticInterface deprecatedStatisticInterface2 = deprecatedStatisticInterface;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
                smbAdFeatures.getClass();
                Object obj = null;
                AdsItemBlockAdStatPixelDto.TypeDto typeDto = null;
                if (com.vk.toggle.b.A.a(smbAdFeatures)) {
                    String optString = jSONObject.optString("url");
                    String optString2 = jSONObject.optString("type");
                    AdsItemBlockAdStatPixelDto.TypeDto[] values = AdsItemBlockAdStatPixelDto.TypeDto.values();
                    int length2 = values.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            break;
                        }
                        AdsItemBlockAdStatPixelDto.TypeDto typeDto2 = values[i4];
                        if (epx.f(typeDto2.i(), optString2)) {
                            typeDto = typeDto2;
                            break;
                        }
                        i4++;
                    }
                    if (typeDto != null) {
                        int b6 = dqa0Var.b6(typeDto);
                        Serializer.c<PixelStats> cVar = PixelStats.CREATOR;
                        dqa0Var.F7(new PixelStats(optString, typeDto, PixelStats.a.a(typeDto, i, i2, b6, 16)));
                    }
                } else {
                    String optString3 = jSONObject.optString("url");
                    String optString4 = jSONObject.optString("type");
                    if (epx.f(optString4, "playhead_reached_value")) {
                        int Y7 = deprecatedStatisticInterface2.Y7("playhead_reached_value");
                        Integer x = f370.x(jSONObject, "pvalue");
                        deprecatedStatisticInterface2.h(new DeprecatedStatisticPlayheadReachedUrl(optString3, i, i2, Y7, deprecatedStatisticInterface2, x != null ? x.intValue() : jSONObject.getInt("value"), jSONObject.has("pvalue")));
                    } else if (epx.f(optString4, "playhead_viewability_value")) {
                        int Y72 = deprecatedStatisticInterface2.Y7("playhead_viewability_value");
                        Boolean q = f370.q(jSONObject, "ovv");
                        Integer x2 = f370.x(jSONObject, "viewable_percent");
                        int intValue = x2 != null ? x2.intValue() : 50;
                        if (q != null) {
                            Integer x3 = f370.x(jSONObject, "pvalue");
                            deprecatedStatisticPlayheadViewabilityMrcUrl = new DeprecatedStatisticPlayheadViewabilityOvvUrl(optString3, i, i2, Y72, deprecatedStatisticInterface2, q.booleanValue(), intValue, x3 != null ? x3.intValue() : jSONObject.getInt("value"), jSONObject.has("pvalue"));
                            deprecatedStatisticInterface2 = deprecatedStatisticInterface;
                        } else {
                            String D = f370.D(jSONObject, "target");
                            TargetPlayheadViewability.Companion.getClass();
                            Iterator<E> it = TargetPlayheadViewability.h().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (brm0.w(((TargetPlayheadViewability) next).name(), D, true)) {
                                    obj = next;
                                    break;
                                }
                            }
                            TargetPlayheadViewability targetPlayheadViewability = (TargetPlayheadViewability) obj;
                            if (targetPlayheadViewability == null) {
                                targetPlayheadViewability = TargetPlayheadViewability.BANNER;
                            }
                            deprecatedStatisticInterface2 = deprecatedStatisticInterface;
                            deprecatedStatisticPlayheadViewabilityMrcUrl = new DeprecatedStatisticPlayheadViewabilityMrcUrl(optString3, i, i2, Y72, deprecatedStatisticInterface2, targetPlayheadViewability, intValue, jSONObject.getInt("duration"));
                        }
                        deprecatedStatisticInterface2.h(deprecatedStatisticPlayheadViewabilityMrcUrl);
                    } else {
                        DeprecatedStatisticInterface deprecatedStatisticInterface3 = deprecatedStatisticInterface2;
                        deprecatedStatisticInterface2 = deprecatedStatisticInterface3;
                        deprecatedStatisticInterface2.h(new DeprecatedStatisticUrl(optString3, optString4, i, i2, deprecatedStatisticInterface3.Y7(optString4), deprecatedStatisticInterface3));
                    }
                }
            }
        }
    }
}

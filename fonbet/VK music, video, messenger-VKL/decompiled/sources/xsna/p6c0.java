package xsna;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.vk.api.parsers.BadgesParsers;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.badges.BadgePostItem;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.CommentsInfo;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentActivity;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.activities.EventActivity;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.activities.RepostToStoryActivity;
import com.vk.dto.newsfeed.entries.Copyright;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.dto.newsfeed.entries.post.AttachmentsMeta;
import com.vk.dto.newsfeed.entries.post.DonutBadgeInfo;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ej90;
import xsna.uij0;

/* compiled from: PostParser.kt */
/* loaded from: classes18.dex */
public final class p6c0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0927, code lost:
    
        if (r5 == null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0a2d, code lost:
    
        if (r12 == null) goto L391;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x044c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Post a(JSONObject jSONObject, ArrayMap arrayMap, SparseArray sparseArray, Map map, uij0 uij0Var) {
        int optInt;
        Integer num;
        Integer num2;
        int i;
        Owner owner;
        UserId userId;
        UserId userId2;
        String str;
        String str2;
        Bundle bundle;
        Caption caption;
        String str3;
        Bundle bundle2;
        EntryHeader entryHeader;
        DonutBadgeInfo donutBadgeInfo;
        BadgeInfo badgeInfo;
        String str4;
        BadgeItem badgeItem;
        int i2;
        Object obj;
        JSONObject optJSONObject;
        GeoAttachment d;
        String str5;
        Owner owner2;
        CommentsInfo commentsInfo;
        String str6;
        ArrayList arrayList;
        int i3;
        int i4;
        Flags flags;
        BadgesSet badgesSet;
        JSONArray jSONArray;
        BadgesParsers.CounterType counterType;
        int i5;
        JSONObject optJSONObject2;
        Activity activity;
        JSONArray optJSONArray;
        ArrayList arrayList2;
        JSONObject optJSONObject3;
        EasyPromote easyPromote;
        JSONObject optJSONObject4;
        Copyright copyright;
        FeedFeatures feedFeatures;
        Bundle bundle3;
        String str7;
        ej90 c;
        Float f;
        JSONObject optJSONObject5;
        int i6;
        Activity activity2;
        Float f2;
        String str8;
        AttachmentsMeta attachmentsMeta;
        JSONObject optJSONObject6;
        ArrayList arrayList3;
        AttachmentsMeta attachmentsMeta2;
        ReactionSet reactionSet;
        Bundle bundle4;
        String str9;
        NewsfeedCoowners newsfeedCoowners;
        JSONObject optJSONObject7;
        NewsfeedResearch newsfeedResearch;
        UserId userId3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str10;
        Owner owner3;
        Owner owner4;
        JSONArray jSONArray2;
        int i7;
        int i8;
        Bundle bundle5;
        Owner owner5;
        Copyright.Type type;
        ArrayMap arrayMap2;
        int i9;
        T t;
        String string;
        Activity commentsActivity;
        Owner owner6;
        Owner owner7;
        Owner owner8;
        JSONArray optJSONArray2;
        JSONArray optJSONArray3;
        Owner owner9;
        BadgeItem badgeItem2;
        Object obj2;
        Owner owner10;
        int i10;
        String optString = jSONObject.optString("post_type", "post");
        UserId userId4 = jSONObject.has("from_id") ? new UserId(jSONObject.optLong("from_id", jSONObject.optLong("source_id"))) : new UserId(jSONObject.optLong("owner_id", jSONObject.optLong("source_id")));
        Owner owner11 = map != null ? (Owner) map.get(userId4) : null;
        Owner d2 = owner11 != null ? owner11.d() : new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
        if (owner11 != null) {
            d2.x = owner11.x;
        }
        UserId userId5 = new UserId(jSONObject.optLong("owner_id", jSONObject.optLong("to_id", jSONObject.optLong("source_id", userId4.b))));
        String str11 = "post_id";
        if (epx.f(optString, "reply")) {
            int optInt2 = jSONObject.has("reply_post_id") ? jSONObject.optInt("reply_post_id", -1) : jSONObject.optInt("post_id", -1);
            num2 = jSONObject.has("id") ? Integer.valueOf(jSONObject.optInt("id")) : null;
            JSONArray optJSONArray4 = jSONObject.optJSONArray("parents_stack");
            if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                i10 = optInt2;
                num = null;
            } else {
                i10 = optInt2;
                num = Integer.valueOf(optJSONArray4.getInt(0));
            }
            optInt = i10;
        } else {
            optInt = jSONObject.optInt("id", jSONObject.optInt("post_id", -1));
            num = null;
            num2 = null;
        }
        if (!fkq0.c(userId5) && optInt == 0) {
            return null;
        }
        Owner owner12 = map != null ? (Owner) map.get(userId5) : null;
        Integer num3 = num;
        NewsEntry.TrackData trackData = new NewsEntry.TrackData(jSONObject.optString("track_code"), 0, 0L, false, false, null, null, 0, 254, null);
        if (fkq0.b(userId5)) {
            i = optInt;
            owner = d2;
            userId = new UserId(jSONObject.optLong("created_by"));
        } else {
            i = optInt;
            owner = d2;
            userId = UserId.d;
        }
        boolean z = jSONObject.optInt("marked_as_ads", 0) != 0;
        JSONObject optJSONObject8 = jSONObject.optJSONObject("author_ad");
        if (optJSONObject8 != null) {
            String optString2 = optJSONObject8.optString("advertiser_info_url");
            userId2 = userId;
            String optString3 = optJSONObject8.optString("ad_marker");
            s3q0 s3q0Var = s3q0.a;
            str2 = optString3;
            str = optString2;
        } else {
            userId2 = userId;
            str = null;
            str2 = null;
        }
        JSONObject optJSONObject9 = jSONObject.optJSONObject("away_params");
        if (optJSONObject9 != null) {
            bundle = new Bundle();
            Iterator<String> keys = optJSONObject9.keys();
            while (keys.hasNext()) {
                Integer num4 = num2;
                String next = keys.next();
                bundle.putString(next, optJSONObject9.optString(next, ""));
                str11 = str11;
                num2 = num4;
            }
        } else {
            bundle = null;
        }
        String str12 = str11;
        Integer num5 = num2;
        JSONObject optJSONObject10 = jSONObject.optJSONObject("caption");
        if (optJSONObject10 != null) {
            Serializer.c<Caption> cVar = Caption.CREATOR;
            caption = Caption.a.a(optJSONObject10);
            caption.j = (map == null || (owner10 = (Owner) map.get(caption.h)) == null) ? null : owner10.c;
        } else {
            caption = null;
        }
        JSONObject optJSONObject11 = jSONObject.optJSONObject("header");
        EntryHeader n = optJSONObject11 != null ? tci.n(optJSONObject11, map) : null;
        boolean optBoolean = jSONObject.optBoolean("suggest_subscribe");
        JSONObject optJSONObject12 = jSONObject.optJSONObject("donut_badge_info");
        Caption caption2 = caption;
        if (optJSONObject12 != null) {
            entryHeader = n;
            bundle2 = bundle;
            str3 = "";
            donutBadgeInfo = new DonutBadgeInfo(optJSONObject12.optString("amount"), optJSONObject12.optString("background_color"), optJSONObject12.optString("comment_text"));
        } else {
            str3 = "";
            bundle2 = bundle;
            entryHeader = n;
            donutBadgeInfo = null;
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("badge_info");
        if (optJSONObject13 != null) {
            boolean optBoolean2 = optJSONObject13.optBoolean("is_disabled");
            BadgeItem.BadgeLockStatus.a aVar = BadgeItem.BadgeLockStatus.Companion;
            int optInt3 = optJSONObject13.optInt("lock_status");
            aVar.getClass();
            BadgeItem.BadgeLockStatus a = BadgeItem.BadgeLockStatus.a.a(optInt3);
            JSONObject optJSONObject14 = optJSONObject13.optJSONObject("unlock_info");
            badgeInfo = new BadgeInfo(optBoolean2, a, optJSONObject14 != null ? BadgesParsers.a(optJSONObject14) : null);
        } else {
            badgeInfo = null;
        }
        Serializer.c<Counters> cVar2 = Counters.CREATOR;
        String str13 = str3;
        Counters a2 = Counters.a.a(jSONObject);
        NewsEntryWithAttachments.Cut f3 = y64.f(jSONObject);
        ArrayList e = y64.e(jSONObject, map, f3);
        boolean e2 = e(f3, e);
        Flags p = bu00.p(jSONObject);
        JSONObject optJSONObject15 = jSONObject.optJSONObject("reposts");
        if (optJSONObject15 != null) {
            str4 = "reply_post_id";
            p.Ab(4L, optJSONObject15.optInt("user_reposted") == 1 && !userId5.equals(z230.b.c()) && userId5.equals(userId4));
            s3q0 s3q0Var2 = s3q0.a;
        } else {
            str4 = "reply_post_id";
        }
        if (!p.zb(64L)) {
            t6g0 t6g0Var = t6g0.b;
            p.Ab(64L, t6g0.b().g0(userId5));
        }
        int optInt4 = jSONObject.optInt("badge_id", 0);
        String a3 = cqm0.a(jSONObject.optString("donut_miniapp_url"));
        if (!epx.f(optString, "reply") || optInt4 == 0) {
            badgeItem = null;
        } else {
            if (sparseArray != null) {
                int size = sparseArray.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        obj2 = null;
                        break;
                    }
                    obj2 = sparseArray.valueAt(i11);
                    int i12 = size;
                    if (((BadgeItem) obj2).b == optInt4) {
                        break;
                    }
                    i11++;
                    size = i12;
                }
                badgeItem2 = (BadgeItem) obj2;
            } else {
                badgeItem2 = null;
            }
            p.Ab(4294967296L, true);
            badgeItem = badgeItem2;
        }
        String optString4 = jSONObject.optString("text");
        boolean optBoolean3 = jSONObject.optBoolean("zoom_text");
        int optInt5 = jSONObject.optInt("date");
        Iterator it = e.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = optInt5;
                obj = null;
                break;
            }
            obj = it.next();
            i2 = optInt5;
            if (((EntryAttachment) obj).b instanceof GeoAttachment) {
                break;
            }
            optInt5 = i2;
        }
        if (obj != null || (optJSONObject = jSONObject.optJSONObject("geo")) == null || (d = com.vkontakte.android.attachments.a.d(optJSONObject)) == null) {
            str5 = str4;
        } else {
            if (e2) {
                str5 = str4;
                d.l = 1;
            } else {
                str5 = str4;
            }
            e.add(new EntryAttachment(d, null, null, null, 14, null));
        }
        UserId userId6 = new UserId(jSONObject.optLong("signer_id"));
        Owner owner13 = (!fkq0.c(userId6) || map == null) ? null : (Owner) map.get(userId6);
        JSONObject optJSONObject16 = jSONObject.optJSONObject("comments");
        if (optJSONObject16 != null) {
            JSONObject optJSONObject17 = optJSONObject16.optJSONObject("donut");
            owner2 = owner13;
            commentsInfo = new CommentsInfo(optJSONObject17 != null ? vj90.f(optJSONObject17) : null);
        } else {
            owner2 = owner13;
            commentsInfo = null;
        }
        String optString5 = jSONObject.optString("reaction_set_id");
        ReactionSet reactionSet2 = (arrayMap == null || optString5 == null || optString5.length() == 0) ? null : (ReactionSet) arrayMap.get(optString5);
        ItemReactions p2 = tci.p(jSONObject, reactionSet2);
        CommentsInfo commentsInfo2 = commentsInfo;
        JSONObject optJSONObject18 = jSONObject.optJSONObject("badges");
        if (optJSONObject18 != null) {
            str6 = "donut";
            JSONArray optJSONArray5 = optJSONObject18.optJSONArray("counters");
            boolean optBoolean4 = optJSONObject18.optBoolean("is_disabled");
            ArrayList arrayList6 = new ArrayList();
            arrayList = e;
            if (optJSONArray5 != null) {
                int length = optJSONArray5.length();
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < length) {
                    int i16 = length;
                    JSONObject jSONObject2 = optJSONArray5.getJSONObject(i13);
                    int i17 = i13;
                    try {
                        jSONArray = optJSONArray5;
                        try {
                            counterType = BadgesParsers.CounterType.valueOf(jSONObject2.optString("type").toUpperCase(Locale.ROOT));
                        } catch (Exception unused) {
                            counterType = BadgesParsers.CounterType.TOTAL;
                            int optInt6 = jSONObject2.optInt("value");
                            i5 = BadgesParsers.a.$EnumSwitchMapping$0[counterType.ordinal()];
                            flags = p;
                            if (i5 != 1) {
                            }
                            i13 = i17 + 1;
                            length = i16;
                            optJSONArray5 = jSONArray;
                            p = flags;
                        }
                    } catch (Exception unused2) {
                        jSONArray = optJSONArray5;
                    }
                    int optInt62 = jSONObject2.optInt("value");
                    i5 = BadgesParsers.a.$EnumSwitchMapping$0[counterType.ordinal()];
                    flags = p;
                    if (i5 != 1) {
                        int optInt7 = jSONObject2.optInt("badge_id");
                        if (sparseArray != null) {
                            u4q0 u4q0Var = zik0.a;
                            BadgeItem badgeItem3 = (BadgeItem) sparseArray.get(optInt7);
                            if (badgeItem3 != null) {
                                arrayList6.add(new BadgePostItem(badgeItem3, optInt62));
                            }
                        }
                    } else if (i5 == 2) {
                        i14 = optInt62;
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i15 = optInt62;
                    }
                    i13 = i17 + 1;
                    length = i16;
                    optJSONArray5 = jSONArray;
                    p = flags;
                }
                i3 = i14;
                i4 = i15;
            } else {
                i3 = 0;
                i4 = 0;
            }
            flags = p;
            badgesSet = new BadgesSet(optJSONObject18.optInt("id"), new UserId(optJSONObject18.optLong("owner_id")), optJSONObject18.optInt("type"), arrayList6, i3, i4, optBoolean4);
            optJSONObject2 = jSONObject.optJSONObject("activity");
            if (optJSONObject2 != null && (string = optJSONObject2.getString("type")) != null) {
                switch (string.hashCode()) {
                    case -602415628:
                        if (string.equals("comments")) {
                            JSONArray jSONArray3 = optJSONObject2.getJSONArray("comments");
                            int length2 = jSONArray3.length();
                            ArrayList arrayList7 = new ArrayList(length2);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            ArrayList arrayList8 = new ArrayList(length2);
                            UserId userId7 = optJSONObject2.has("post_author_id") ? new UserId(optJSONObject2.optLong("post_author_id")) : null;
                            int length3 = jSONArray3.length();
                            int i18 = 0;
                            while (i18 < length3) {
                                Comment a4 = oa0.a(jSONArray3.getJSONObject(i18), reactionSet2, map);
                                UserId userId8 = a4.d;
                                int i19 = length3;
                                UserId userId9 = a4.c;
                                arrayList7.add(a4);
                                if (map != null && (owner8 = (Owner) map.get(userId9)) != null) {
                                    linkedHashMap.put(userId9, owner8);
                                    arrayList8.add(owner8.e);
                                }
                                if (map != null && (owner7 = (Owner) map.get(userId8)) != null) {
                                    linkedHashMap.put(userId8, owner7);
                                }
                                i18++;
                                length3 = i19;
                            }
                            if (userId7 != null && map != null && (owner6 = (Owner) map.get(userId7)) != null) {
                                linkedHashMap.put(userId7, owner6);
                            }
                            commentsActivity = new CommentsActivity(arrayList7, linkedHashMap, arrayList8, userId7, false, null, 48, null);
                            activity = commentsActivity;
                            break;
                        }
                        break;
                    case 96891546:
                        if (string.equals(NotificationCompat.CATEGORY_EVENT)) {
                            JSONObject jSONObject3 = optJSONObject2.getJSONObject(NotificationCompat.CATEGORY_EVENT);
                            int i20 = jSONObject3.getInt("time");
                            String optString6 = jSONObject3.optString(RTCStatsConstants.KEY_ADDRESS);
                            int optInt8 = jSONObject3.optInt("member_status");
                            String optString7 = jSONObject3.optString("text");
                            String optString8 = jSONObject3.optString("button_text");
                            ArrayList arrayList9 = new ArrayList();
                            if (map != null && (optJSONArray2 = jSONObject3.optJSONArray("friends")) != null) {
                                int length4 = optJSONArray2.length();
                                for (int i21 = 0; i21 < length4; i21++) {
                                    Owner owner14 = (Owner) map.get(new UserId(optJSONArray2.getLong(i21)));
                                    arrayList9.add(owner14 != null ? owner14.e : null);
                                }
                            }
                            activity = new EventActivity(i20, optString6, optInt8, optString7, optString8, arrayList9);
                            break;
                        }
                        break;
                    case 102974396:
                        if (string.equals("likes")) {
                            JSONObject jSONObject4 = optJSONObject2.getJSONObject("likes");
                            ArrayList arrayList10 = new ArrayList();
                            if (map != null && (optJSONArray3 = jSONObject4.optJSONArray("user_ids")) != null) {
                                int length5 = optJSONArray3.length();
                                for (int i22 = 0; i22 < length5; i22++) {
                                    Owner owner15 = (Owner) map.get(new UserId(optJSONArray3.getLong(i22)));
                                    arrayList10.add(owner15 != null ? owner15.e : null);
                                }
                            }
                            commentsActivity = new LikesActivity(jSONObject4.optString("text"), arrayList10, null, null, null, 28, null);
                            activity = commentsActivity;
                            break;
                        }
                        break;
                    case 326863773:
                        if (string.equals("repost_to_story")) {
                            activity = new RepostToStoryActivity();
                            break;
                        }
                        break;
                    case 950398559:
                        if (string.equals("comment")) {
                            JSONObject jSONObject5 = optJSONObject2.getJSONObject("comment");
                            ArrayList arrayList11 = new ArrayList(1);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Comment a5 = oa0.a(jSONObject5, reactionSet2, map);
                            UserId userId10 = a5.c;
                            arrayList11.add(a5);
                            ArrayList arrayList12 = new ArrayList(1);
                            if (map != null && (owner9 = (Owner) map.get(userId10)) != null) {
                                linkedHashMap2.put(userId10, owner9);
                                arrayList12.add(owner9.e);
                            }
                            activity = new CommentActivity(arrayList11, linkedHashMap2, arrayList12);
                            break;
                        }
                        break;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                optJSONArray = jSONObject.optJSONArray("copy_history");
                if (optJSONArray != null) {
                    JSONObject optJSONObject19 = optJSONArray.optJSONObject(0);
                    if (optJSONObject19 != null) {
                        Flags flags2 = flags;
                        i9 = 1;
                        flags2.Ab(32L, true);
                        arrayMap2 = arrayMap;
                        Post b = b(optJSONObject19, arrayMap2, sparseArray, map, 16);
                        if (b != null) {
                            flags = flags2;
                            b.l.Ab(17592186044416L, true);
                            t = b;
                        } else {
                            flags = flags2;
                            t = 0;
                        }
                        ref$ObjectRef.element = t;
                        s3q0 s3q0Var3 = s3q0.a;
                    } else {
                        arrayMap2 = arrayMap;
                        i9 = 1;
                    }
                    JSONObject optJSONObject20 = optJSONArray.optJSONObject(i9);
                    if (optJSONObject20 != null) {
                        Post post = (Post) ref$ObjectRef.element;
                        if (post != null) {
                            post.D = b(optJSONObject20, arrayMap2, sparseArray, map, 16);
                            s3q0 s3q0Var4 = s3q0.a;
                        }
                        s3q0 s3q0Var5 = s3q0.a;
                    }
                }
                if (jSONObject.has("reply_owner_id")) {
                    String str14 = "https://" + a0a.d + "/wall" + jSONObject.getInt("reply_owner_id") + '_' + jSONObject.getInt(str5);
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    EntryAttachment entryAttachment = new EntryAttachment(new LinkAttachment(str14, context.getResources().getString(R.string.wall_post_reply), str13), null, null, null, 14, null);
                    T t2 = ref$ObjectRef.element;
                    if (t2 == 0) {
                        arrayList2 = arrayList;
                        arrayList2.add(entryAttachment);
                        optJSONObject3 = jSONObject.optJSONObject("ads_easy_promote");
                        if (optJSONObject3 != null) {
                            Serializer.c<EasyPromote> cVar3 = EasyPromote.CREATOR;
                            easyPromote = EasyPromote.a.a(optJSONObject3);
                        } else {
                            easyPromote = null;
                        }
                        JSONObject optJSONObject21 = jSONObject.optJSONObject("poster");
                        Poster d3 = optJSONObject21 != null ? d(optJSONObject21, map) : null;
                        optJSONObject4 = jSONObject.optJSONObject("copyright");
                        if (optJSONObject4 != null) {
                            Serializer.c<Copyright> cVar4 = Copyright.CREATOR;
                            String optString9 = optJSONObject4.optString("link");
                            if (optString9 != null) {
                                String optString10 = optJSONObject4.optString("name");
                                UserId userId11 = new UserId(optJSONObject4.optLong("id"));
                                Owner owner16 = map != null ? (Owner) map.get(userId11) : null;
                                try {
                                    type = Copyright.Type.valueOf(optJSONObject4.optString("type").toUpperCase(Locale.ROOT));
                                } catch (Exception unused3) {
                                    type = Copyright.Type.UNKNOWN;
                                }
                                copyright = new Copyright(optString9, userId11, optString10, owner16, type, optJSONObject4.optString("name"));
                                Flags flags3 = flags;
                                flags3.Ab(67108864L, jSONObject.optBoolean("is_favorite"));
                                flags3.Ab(549755813888L, jSONObject.optBoolean("is_deleted"));
                                ej90.c cVar5 = new ej90.c(0);
                                feedFeatures = FeedFeatures.PARSE_LINKS;
                                feedFeatures.getClass();
                                if (com.vk.toggle.b.A.a(feedFeatures)) {
                                    Serializer.c<Post> cVar6 = Post.CREATOR;
                                    bundle3 = bundle2;
                                    str7 = optString4;
                                    c = Post.a.c(str7, bundle3, f3.d, uij0Var, cVar5);
                                } else {
                                    c = null;
                                    bundle3 = bundle2;
                                    str7 = optString4;
                                }
                                flags3.Ab(68719476736L, cVar5.a);
                                JSONObject optJSONObject22 = jSONObject.optJSONObject(str6);
                                PostDonut f4 = optJSONObject22 == null ? vj90.f(optJSONObject22) : null;
                                int optInt9 = jSONObject.optInt("carousel_offset");
                                if (jSONObject.has("thumbs_max_height")) {
                                    f = null;
                                } else {
                                    float optDouble = (float) jSONObject.optDouble("thumbs_max_height");
                                    if (optDouble < 1.0E-4f) {
                                        optDouble = 1.0E-4f;
                                    }
                                    f = Float.valueOf(optDouble);
                                }
                                String optString11 = jSONObject.optString("subtitle");
                                String optString12 = jSONObject.optString("translation_lang");
                                optJSONObject5 = jSONObject.optJSONObject("attachments_meta");
                                EasyPromote easyPromote2 = easyPromote;
                                if (optJSONObject5 == null) {
                                    String optString13 = optJSONObject5.optString("primary_mode");
                                    i6 = optInt9;
                                    Locale locale = Locale.ROOT;
                                    AttachmentsMeta.PrimaryMode valueOf = AttachmentsMeta.PrimaryMode.valueOf(optString13.toUpperCase(locale));
                                    activity2 = activity;
                                    f2 = f;
                                    str8 = optString11;
                                    float optDouble2 = (float) optJSONObject5.optDouble("carousel_ratio", 1.0d);
                                    AttachmentsMeta.CarouselLayout valueOf2 = AttachmentsMeta.CarouselLayout.valueOf(optJSONObject5.optString("carousel_layout", "ROUNDED").toUpperCase(locale));
                                    Double t3 = f370.t(optJSONObject5, "ratio");
                                    attachmentsMeta = new AttachmentsMeta(valueOf, optDouble2, valueOf2, t3 != null ? Float.valueOf((float) t3.doubleValue()) : null);
                                } else {
                                    i6 = optInt9;
                                    activity2 = activity;
                                    f2 = f;
                                    str8 = optString11;
                                    attachmentsMeta = null;
                                }
                                Serializer.c<Post> cVar7 = Post.CREATOR;
                                flags3.Ab(137438953472L, Post.a.a(arrayList2, attachmentsMeta, optString));
                                flags3.Ab(2199023255552L, !jSONObject.has("check_sign") ? jSONObject.getBoolean("check_sign") : false);
                                optJSONObject6 = jSONObject.optJSONObject("coowners");
                                if (optJSONObject6 == null) {
                                    Serializer.c<NewsfeedCoowners> cVar8 = NewsfeedCoowners.CREATOR;
                                    JSONObject optJSONObject23 = optJSONObject6.optJSONObject("coowner_post_id");
                                    if (optJSONObject23 != null) {
                                        attachmentsMeta2 = attachmentsMeta;
                                        reactionSet = reactionSet2;
                                        userId3 = new UserId(optJSONObject23.optLong("owner_id"));
                                    } else {
                                        attachmentsMeta2 = attachmentsMeta;
                                        reactionSet = reactionSet2;
                                        userId3 = null;
                                    }
                                    JSONObject optJSONObject24 = optJSONObject6.optJSONObject("coowner_post_id");
                                    Integer valueOf3 = optJSONObject24 != null ? Integer.valueOf(optJSONObject24.optInt(str12)) : null;
                                    boolean optBoolean5 = optJSONObject6.optBoolean("is_owner");
                                    boolean optBoolean6 = optJSONObject6.optBoolean("is_coowner");
                                    JSONArray optJSONArray6 = optJSONObject6.optJSONArray("list");
                                    if (optJSONArray6 != null) {
                                        arrayList4 = new ArrayList(optJSONArray6.length());
                                        int length6 = optJSONArray6.length();
                                        int i23 = 0;
                                        while (i23 < length6) {
                                            JSONObject optJSONObject25 = optJSONArray6.optJSONObject(i23);
                                            ArrayList arrayList13 = arrayList2;
                                            if (optJSONObject25 != null) {
                                                jSONArray2 = optJSONArray6;
                                                if (map != null) {
                                                    i7 = length6;
                                                    i8 = i23;
                                                    owner5 = (Owner) map.get(new UserId(optJSONObject25.optLong("owner_id")));
                                                } else {
                                                    i7 = length6;
                                                    i8 = i23;
                                                }
                                                owner5 = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                                                bundle5 = bundle3;
                                                arrayList4.add(new NewsfeedCoowners.CoownerStatus(owner5, cqm0.a(optJSONObject25.optString("status")), optJSONObject25.optBoolean("can_subscribe", true), optJSONObject25.optBoolean("is_subscribed", false)));
                                            } else {
                                                jSONArray2 = optJSONArray6;
                                                i7 = length6;
                                                i8 = i23;
                                                bundle5 = bundle3;
                                            }
                                            i23 = i8 + 1;
                                            arrayList2 = arrayList13;
                                            optJSONArray6 = jSONArray2;
                                            length6 = i7;
                                            bundle3 = bundle5;
                                        }
                                    } else {
                                        arrayList4 = null;
                                    }
                                    arrayList3 = arrayList2;
                                    bundle4 = bundle3;
                                    List list = arrayList4;
                                    if (arrayList4 == null) {
                                        list = EmptyList.b;
                                    }
                                    List list2 = list;
                                    JSONArray optJSONArray7 = optJSONObject6.optJSONArray("requests");
                                    if (optJSONArray7 != null) {
                                        arrayList5 = new ArrayList(optJSONArray7.length());
                                        int length7 = optJSONArray7.length();
                                        int i24 = 0;
                                        while (i24 < length7) {
                                            JSONObject optJSONObject26 = optJSONArray7.optJSONObject(i24);
                                            if (optJSONObject26 != null) {
                                                if (map == null || (owner3 = (Owner) map.get(new UserId(optJSONObject26.optLong("owner_id")))) == null) {
                                                    owner3 = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                                                }
                                                if (map != null) {
                                                    str10 = str7;
                                                    owner4 = (Owner) map.get(new UserId(optJSONObject26.optLong("coowner_id")));
                                                } else {
                                                    str10 = str7;
                                                }
                                                owner4 = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                                                arrayList5.add(new NewsfeedCoowners.CoownerRequest(owner3, owner4, optJSONObject26.optString("request_rejected_privacy_link")));
                                            } else {
                                                str10 = str7;
                                            }
                                            i24++;
                                            str7 = str10;
                                        }
                                    } else {
                                        arrayList5 = null;
                                    }
                                    str9 = str7;
                                    List list3 = arrayList5;
                                    if (arrayList5 == null) {
                                        list3 = EmptyList.b;
                                    }
                                    newsfeedCoowners = new NewsfeedCoowners(optBoolean5, optBoolean6, userId3, valueOf3, list2, list3);
                                } else {
                                    arrayList3 = arrayList2;
                                    attachmentsMeta2 = attachmentsMeta;
                                    reactionSet = reactionSet2;
                                    bundle4 = bundle3;
                                    str9 = str7;
                                    newsfeedCoowners = null;
                                }
                                optJSONObject7 = jSONObject.optJSONObject("research");
                                if (optJSONObject7 == null) {
                                    Serializer.c<NewsfeedResearch> cVar9 = NewsfeedResearch.CREATOR;
                                    newsfeedResearch = NewsfeedResearch.a.a(optJSONObject7);
                                } else {
                                    newsfeedResearch = null;
                                }
                                flags3.Ab(70368744177664L, jSONObject.optBoolean("is_blacklisted", false));
                                return new Post(flags3, userId5, i, owner, userId2, owner2, i2, str9, optString, num5, num3, optBoolean3, caption2, entryHeader != null ? pwu.b(owner) : entryHeader, arrayList3, attachmentsMeta2, commentsInfo2, activity2, (Post) ref$ObjectRef.element, a2, z, str, str2, easyPromote2, optBoolean, bundle4, trackData, d3, f3, copyright, c, owner12, f4, i6, f2, str8, reactionSet, p2, badgesSet, null, optString12, uij0Var, badgeItem, donutBadgeInfo, badgeInfo, a3, newsfeedCoowners, newsfeedResearch, 0, 128, null);
                            }
                        }
                        copyright = null;
                        Flags flags32 = flags;
                        flags32.Ab(67108864L, jSONObject.optBoolean("is_favorite"));
                        flags32.Ab(549755813888L, jSONObject.optBoolean("is_deleted"));
                        ej90.c cVar52 = new ej90.c(0);
                        feedFeatures = FeedFeatures.PARSE_LINKS;
                        feedFeatures.getClass();
                        if (com.vk.toggle.b.A.a(feedFeatures)) {
                        }
                        flags32.Ab(68719476736L, cVar52.a);
                        JSONObject optJSONObject222 = jSONObject.optJSONObject(str6);
                        if (optJSONObject222 == null) {
                        }
                        int optInt92 = jSONObject.optInt("carousel_offset");
                        if (jSONObject.has("thumbs_max_height")) {
                        }
                        String optString112 = jSONObject.optString("subtitle");
                        String optString122 = jSONObject.optString("translation_lang");
                        optJSONObject5 = jSONObject.optJSONObject("attachments_meta");
                        EasyPromote easyPromote22 = easyPromote;
                        if (optJSONObject5 == null) {
                        }
                        Serializer.c<Post> cVar72 = Post.CREATOR;
                        flags32.Ab(137438953472L, Post.a.a(arrayList2, attachmentsMeta, optString));
                        flags32.Ab(2199023255552L, !jSONObject.has("check_sign") ? jSONObject.getBoolean("check_sign") : false);
                        optJSONObject6 = jSONObject.optJSONObject("coowners");
                        if (optJSONObject6 == null) {
                        }
                        optJSONObject7 = jSONObject.optJSONObject("research");
                        if (optJSONObject7 == null) {
                        }
                        flags32.Ab(70368744177664L, jSONObject.optBoolean("is_blacklisted", false));
                        return new Post(flags32, userId5, i, owner, userId2, owner2, i2, str9, optString, num5, num3, optBoolean3, caption2, entryHeader != null ? pwu.b(owner) : entryHeader, arrayList3, attachmentsMeta2, commentsInfo2, activity2, (Post) ref$ObjectRef.element, a2, z, str, str2, easyPromote22, optBoolean, bundle4, trackData, d3, f3, copyright, c, owner12, f4, i6, f2, str8, reactionSet, p2, badgesSet, null, optString122, uij0Var, badgeItem, donutBadgeInfo, badgeInfo, a3, newsfeedCoowners, newsfeedResearch, 0, 128, null);
                    }
                    ((Post) t2).z.add(entryAttachment);
                }
                arrayList2 = arrayList;
                optJSONObject3 = jSONObject.optJSONObject("ads_easy_promote");
                if (optJSONObject3 != null) {
                }
                JSONObject optJSONObject212 = jSONObject.optJSONObject("poster");
                if (optJSONObject212 != null) {
                }
                optJSONObject4 = jSONObject.optJSONObject("copyright");
                if (optJSONObject4 != null) {
                }
                copyright = null;
                Flags flags322 = flags;
                flags322.Ab(67108864L, jSONObject.optBoolean("is_favorite"));
                flags322.Ab(549755813888L, jSONObject.optBoolean("is_deleted"));
                ej90.c cVar522 = new ej90.c(0);
                feedFeatures = FeedFeatures.PARSE_LINKS;
                feedFeatures.getClass();
                if (com.vk.toggle.b.A.a(feedFeatures)) {
                }
                flags322.Ab(68719476736L, cVar522.a);
                JSONObject optJSONObject2222 = jSONObject.optJSONObject(str6);
                if (optJSONObject2222 == null) {
                }
                int optInt922 = jSONObject.optInt("carousel_offset");
                if (jSONObject.has("thumbs_max_height")) {
                }
                String optString1122 = jSONObject.optString("subtitle");
                String optString1222 = jSONObject.optString("translation_lang");
                optJSONObject5 = jSONObject.optJSONObject("attachments_meta");
                EasyPromote easyPromote222 = easyPromote;
                if (optJSONObject5 == null) {
                }
                Serializer.c<Post> cVar722 = Post.CREATOR;
                flags322.Ab(137438953472L, Post.a.a(arrayList2, attachmentsMeta, optString));
                flags322.Ab(2199023255552L, !jSONObject.has("check_sign") ? jSONObject.getBoolean("check_sign") : false);
                optJSONObject6 = jSONObject.optJSONObject("coowners");
                if (optJSONObject6 == null) {
                }
                optJSONObject7 = jSONObject.optJSONObject("research");
                if (optJSONObject7 == null) {
                }
                flags322.Ab(70368744177664L, jSONObject.optBoolean("is_blacklisted", false));
                return new Post(flags322, userId5, i, owner, userId2, owner2, i2, str9, optString, num5, num3, optBoolean3, caption2, entryHeader != null ? pwu.b(owner) : entryHeader, arrayList3, attachmentsMeta2, commentsInfo2, activity2, (Post) ref$ObjectRef.element, a2, z, str, str2, easyPromote222, optBoolean, bundle4, trackData, d3, f3, copyright, c, owner12, f4, i6, f2, str8, reactionSet, p2, badgesSet, null, optString1222, uij0Var, badgeItem, donutBadgeInfo, badgeInfo, a3, newsfeedCoowners, newsfeedResearch, 0, 128, null);
            }
            activity = null;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            optJSONArray = jSONObject.optJSONArray("copy_history");
            if (optJSONArray != null) {
            }
            if (jSONObject.has("reply_owner_id")) {
            }
            arrayList2 = arrayList;
            optJSONObject3 = jSONObject.optJSONObject("ads_easy_promote");
            if (optJSONObject3 != null) {
            }
            JSONObject optJSONObject2122 = jSONObject.optJSONObject("poster");
            if (optJSONObject2122 != null) {
            }
            optJSONObject4 = jSONObject.optJSONObject("copyright");
            if (optJSONObject4 != null) {
            }
            copyright = null;
            Flags flags3222 = flags;
            flags3222.Ab(67108864L, jSONObject.optBoolean("is_favorite"));
            flags3222.Ab(549755813888L, jSONObject.optBoolean("is_deleted"));
            ej90.c cVar5222 = new ej90.c(0);
            feedFeatures = FeedFeatures.PARSE_LINKS;
            feedFeatures.getClass();
            if (com.vk.toggle.b.A.a(feedFeatures)) {
            }
            flags3222.Ab(68719476736L, cVar5222.a);
            JSONObject optJSONObject22222 = jSONObject.optJSONObject(str6);
            if (optJSONObject22222 == null) {
            }
            int optInt9222 = jSONObject.optInt("carousel_offset");
            if (jSONObject.has("thumbs_max_height")) {
            }
            String optString11222 = jSONObject.optString("subtitle");
            String optString12222 = jSONObject.optString("translation_lang");
            optJSONObject5 = jSONObject.optJSONObject("attachments_meta");
            EasyPromote easyPromote2222 = easyPromote;
            if (optJSONObject5 == null) {
            }
            Serializer.c<Post> cVar7222 = Post.CREATOR;
            flags3222.Ab(137438953472L, Post.a.a(arrayList2, attachmentsMeta, optString));
            flags3222.Ab(2199023255552L, !jSONObject.has("check_sign") ? jSONObject.getBoolean("check_sign") : false);
            optJSONObject6 = jSONObject.optJSONObject("coowners");
            if (optJSONObject6 == null) {
            }
            optJSONObject7 = jSONObject.optJSONObject("research");
            if (optJSONObject7 == null) {
            }
            flags3222.Ab(70368744177664L, jSONObject.optBoolean("is_blacklisted", false));
            return new Post(flags3222, userId5, i, owner, userId2, owner2, i2, str9, optString, num5, num3, optBoolean3, caption2, entryHeader != null ? pwu.b(owner) : entryHeader, arrayList3, attachmentsMeta2, commentsInfo2, activity2, (Post) ref$ObjectRef2.element, a2, z, str, str2, easyPromote2222, optBoolean, bundle4, trackData, d3, f3, copyright, c, owner12, f4, i6, f2, str8, reactionSet, p2, badgesSet, null, optString12222, uij0Var, badgeItem, donutBadgeInfo, badgeInfo, a3, newsfeedCoowners, newsfeedResearch, 0, 128, null);
        }
        flags = p;
        arrayList = e;
        str6 = "donut";
        badgesSet = null;
        optJSONObject2 = jSONObject.optJSONObject("activity");
        if (optJSONObject2 != null) {
            switch (string.hashCode()) {
                case -602415628:
                    break;
                case 96891546:
                    break;
                case 102974396:
                    break;
                case 326863773:
                    break;
                case 950398559:
                    break;
            }
            Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
            optJSONArray = jSONObject.optJSONArray("copy_history");
            if (optJSONArray != null) {
            }
            if (jSONObject.has("reply_owner_id")) {
            }
            arrayList2 = arrayList;
            optJSONObject3 = jSONObject.optJSONObject("ads_easy_promote");
            if (optJSONObject3 != null) {
            }
            JSONObject optJSONObject21222 = jSONObject.optJSONObject("poster");
            if (optJSONObject21222 != null) {
            }
            optJSONObject4 = jSONObject.optJSONObject("copyright");
            if (optJSONObject4 != null) {
            }
            copyright = null;
            Flags flags32222 = flags;
            flags32222.Ab(67108864L, jSONObject.optBoolean("is_favorite"));
            flags32222.Ab(549755813888L, jSONObject.optBoolean("is_deleted"));
            ej90.c cVar52222 = new ej90.c(0);
            feedFeatures = FeedFeatures.PARSE_LINKS;
            feedFeatures.getClass();
            if (com.vk.toggle.b.A.a(feedFeatures)) {
            }
            flags32222.Ab(68719476736L, cVar52222.a);
            JSONObject optJSONObject222222 = jSONObject.optJSONObject(str6);
            if (optJSONObject222222 == null) {
            }
            int optInt92222 = jSONObject.optInt("carousel_offset");
            if (jSONObject.has("thumbs_max_height")) {
            }
            String optString112222 = jSONObject.optString("subtitle");
            String optString122222 = jSONObject.optString("translation_lang");
            optJSONObject5 = jSONObject.optJSONObject("attachments_meta");
            EasyPromote easyPromote22222 = easyPromote;
            if (optJSONObject5 == null) {
            }
            Serializer.c<Post> cVar72222 = Post.CREATOR;
            flags32222.Ab(137438953472L, Post.a.a(arrayList2, attachmentsMeta, optString));
            flags32222.Ab(2199023255552L, !jSONObject.has("check_sign") ? jSONObject.getBoolean("check_sign") : false);
            optJSONObject6 = jSONObject.optJSONObject("coowners");
            if (optJSONObject6 == null) {
            }
            optJSONObject7 = jSONObject.optJSONObject("research");
            if (optJSONObject7 == null) {
            }
            flags32222.Ab(70368744177664L, jSONObject.optBoolean("is_blacklisted", false));
            return new Post(flags32222, userId5, i, owner, userId2, owner2, i2, str9, optString, num5, num3, optBoolean3, caption2, entryHeader != null ? pwu.b(owner) : entryHeader, arrayList3, attachmentsMeta2, commentsInfo2, activity2, (Post) ref$ObjectRef22.element, a2, z, str, str2, easyPromote22222, optBoolean, bundle4, trackData, d3, f3, copyright, c, owner12, f4, i6, f2, str8, reactionSet, p2, badgesSet, null, optString122222, uij0Var, badgeItem, donutBadgeInfo, badgeInfo, a3, newsfeedCoowners, newsfeedResearch, 0, 128, null);
        }
        activity = null;
        Ref$ObjectRef ref$ObjectRef222 = new Ref$ObjectRef();
        optJSONArray = jSONObject.optJSONArray("copy_history");
        if (optJSONArray != null) {
        }
        if (jSONObject.has("reply_owner_id")) {
        }
        arrayList2 = arrayList;
        optJSONObject3 = jSONObject.optJSONObject("ads_easy_promote");
        if (optJSONObject3 != null) {
        }
        JSONObject optJSONObject212222 = jSONObject.optJSONObject("poster");
        if (optJSONObject212222 != null) {
        }
        optJSONObject4 = jSONObject.optJSONObject("copyright");
        if (optJSONObject4 != null) {
        }
        copyright = null;
        Flags flags322222 = flags;
        flags322222.Ab(67108864L, jSONObject.optBoolean("is_favorite"));
        flags322222.Ab(549755813888L, jSONObject.optBoolean("is_deleted"));
        ej90.c cVar522222 = new ej90.c(0);
        feedFeatures = FeedFeatures.PARSE_LINKS;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
        }
        flags322222.Ab(68719476736L, cVar522222.a);
        JSONObject optJSONObject2222222 = jSONObject.optJSONObject(str6);
        if (optJSONObject2222222 == null) {
        }
        int optInt922222 = jSONObject.optInt("carousel_offset");
        if (jSONObject.has("thumbs_max_height")) {
        }
        String optString1122222 = jSONObject.optString("subtitle");
        String optString1222222 = jSONObject.optString("translation_lang");
        optJSONObject5 = jSONObject.optJSONObject("attachments_meta");
        EasyPromote easyPromote222222 = easyPromote;
        if (optJSONObject5 == null) {
        }
        Serializer.c<Post> cVar722222 = Post.CREATOR;
        flags322222.Ab(137438953472L, Post.a.a(arrayList2, attachmentsMeta, optString));
        flags322222.Ab(2199023255552L, !jSONObject.has("check_sign") ? jSONObject.getBoolean("check_sign") : false);
        optJSONObject6 = jSONObject.optJSONObject("coowners");
        if (optJSONObject6 == null) {
        }
        optJSONObject7 = jSONObject.optJSONObject("research");
        if (optJSONObject7 == null) {
        }
        flags322222.Ab(70368744177664L, jSONObject.optBoolean("is_blacklisted", false));
        return new Post(flags322222, userId5, i, owner, userId2, owner2, i2, str9, optString, num5, num3, optBoolean3, caption2, entryHeader != null ? pwu.b(owner) : entryHeader, arrayList3, attachmentsMeta2, commentsInfo2, activity2, (Post) ref$ObjectRef222.element, a2, z, str, str2, easyPromote222222, optBoolean, bundle4, trackData, d3, f3, copyright, c, owner12, f4, i6, f2, str8, reactionSet, p2, badgesSet, null, optString1222222, uij0Var, badgeItem, donutBadgeInfo, badgeInfo, a3, newsfeedCoowners, newsfeedResearch, 0, 128, null);
    }

    public static /* synthetic */ Post b(JSONObject jSONObject, ArrayMap arrayMap, SparseArray sparseArray, Map map, int i) {
        if ((i & 2) != 0) {
            arrayMap = null;
        }
        if ((i & 4) != 0) {
            sparseArray = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        return a(jSONObject, arrayMap, sparseArray, map, uij0.c.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 com.vk.feed.core.models.attachment.EntryAttachment, still in use, count: 6, list:
          (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) from 0x0240: MOVE (r22v0 com.vk.feed.core.models.attachment.EntryAttachment) = (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) (LINE:577)
          (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) from 0x026c: MOVE (r22v3 com.vk.feed.core.models.attachment.EntryAttachment) = (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) (LINE:621)
          (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) from 0x0259: MOVE (r22v4 com.vk.feed.core.models.attachment.EntryAttachment) = (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) (LINE:602)
          (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) from 0x0246: MOVE (r22v5 com.vk.feed.core.models.attachment.EntryAttachment) = (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) (LINE:583)
          (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) from 0x0061: PHI (r4v16 com.vk.feed.core.models.attachment.EntryAttachment) = (r4v0 com.vk.feed.core.models.attachment.EntryAttachment), (r4v22 com.vk.feed.core.models.attachment.EntryAttachment) binds: [B:32:0x0055, B:60:0x010d] A[DONT_GENERATE, DONT_INLINE]
          (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) from 0x0034: MOVE (r22v12 com.vk.feed.core.models.attachment.EntryAttachment) = (r4v0 com.vk.feed.core.models.attachment.EntryAttachment) (LINE:53)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.vk.feed.core.models.attachment.EntryAttachmentPayload] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.vk.feed.core.models.attachment.EntryAttachmentMeta] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [com.vk.feed.core.models.actions.HeaderAction] */
    /* JADX WARN: Type inference failed for: r4v21, types: [com.vk.feed.core.models.actions.HeaderAction] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.vk.feed.core.models.attachment.FullAttachmentStyle] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.vk.feed.core.models.attachment.UnderMediaAttachmentStyle] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.vk.feed.core.models.attachment.AttachmentStyle] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.vk.feed.core.models.attachment.OnMediaAttachmentStyle] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.vk.feed.core.models.attachment.ChipAttachmentStyle] */
    public static com.vk.feed.core.models.attachment.EntryAttachment c(org.json.JSONObject r32, java.util.Map r33) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.p6c0.c(org.json.JSONObject, java.util.Map):com.vk.feed.core.models.attachment.EntryAttachment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Poster d(JSONObject jSONObject, Map map) {
        int i;
        int i2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("bkg_id");
        UserId userId = new UserId(jSONObject.optLong("bkg_owner_id"));
        Owner owner = map != null ? (Owner) map.get(userId) : null;
        try {
            i = Color.parseColor(jSONObject.optString("main_color"));
        } catch (Exception unused) {
            i = -1;
        }
        int i3 = i;
        try {
            i2 = Color.parseColor(jSONObject.optString("text_color"));
        } catch (Exception unused2) {
            i2 = -16777216;
        }
        int i4 = i2;
        JSONArray optJSONArray = jSONObject.optJSONArray("layers");
        int i5 = 2;
        Image image = new Image(optJSONArray != null ? optJSONArray.optJSONArray(0) : null, str, i5, objArr3 == true ? 1 : 0);
        Image image2 = new Image(optJSONArray != null ? optJSONArray.optJSONArray(1) : null, objArr2 == true ? 1 : 0, i5, objArr == true ? 1 : 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("constants");
        return new Poster(optInt, userId, i3, i4, image, image2, new Poster.Constants(optJSONObject.optInt("max_symbols", 160), optJSONObject.optInt("range_threshold", 104), (float) optJSONObject.optDouble("font_size_ratio_range_1", 0.0666700005531311d), (float) optJSONObject.optDouble("line_height_ratio_range_1", 0.07777000218629837d), (float) optJSONObject.optDouble("font_size_ratio_range_2", 0.0611100010573864d), (float) optJSONObject.optDouble("line_height_ratio_range_2", 0.07221999764442444d), optJSONObject.optInt("upload_gen_timeout", 5)), !jSONObject.optBoolean("is_hidden", false), owner, jSONObject.optString("access_hash"), jSONObject.optString("background_name"));
    }

    public static boolean e(NewsEntryWithAttachments.Cut cut, List list) {
        int i = cut.c;
        int i2 = cut.b;
        if (i2 >= 0) {
            EntryAttachment entryAttachment = (EntryAttachment) j5g.k0(list);
            if (i2 < list.size() + ((entryAttachment != null ? entryAttachment.b : null) instanceof GeoAttachment ? -1 : 0)) {
                return true;
            }
        } else if (i >= 0 && i < list.size()) {
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if ((((EntryAttachment) it.next()).c instanceof CompactAttachmentStyle) && i < (i3 = i3 + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(NewsEntryWithAttachments newsEntryWithAttachments) {
        return e(newsEntryWithAttachments.Hb(), newsEntryWithAttachments.Gb());
    }
}

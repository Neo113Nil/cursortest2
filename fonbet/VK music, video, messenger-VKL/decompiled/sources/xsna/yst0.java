package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.EntryDescription;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.xod;

/* compiled from: VideosParser.kt */
/* loaded from: classes18.dex */
public final class yst0 {

    /* compiled from: VideosParser.kt */
    public static final class a implements w8i {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024e  */
    /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Videos a(String str, Map map, JSONObject jSONObject) {
        Caption caption;
        Caption caption2;
        String str2;
        NewsEntryWithAttachments.Cut cut;
        ArrayList arrayList;
        NewsEntry.TrackData trackData;
        JSONArray optJSONArray;
        boolean z;
        int i;
        long j;
        Caption caption3;
        EasyPromote easyPromote;
        Owner owner;
        boolean z2;
        long j2;
        ?? r15;
        String str3;
        String str4;
        EntryHeader entryHeader;
        Object obj;
        EntryDescription entryDescription;
        EntryHeader entryHeader2;
        int i2;
        Object obj2;
        Owner owner2;
        JSONObject optJSONObject;
        EntryHeader entryHeader3;
        JSONArray jSONArray;
        JSONArray optJSONArray2;
        JSONObject optJSONObject2;
        ArrayList arrayList2;
        ThemedColor themedColor;
        HeaderTitle headerTitle;
        HeaderTitle headerTitle2;
        HeaderTitle headerTitle3;
        HeaderTitle headerTitle4;
        VerifyInfo verifyInfo;
        HeaderTitle headerTitle5;
        HeaderTitle headerTitle6;
        SourcePhoto sourcePhoto;
        Owner owner3;
        a aVar = new a();
        NewsEntryWithAttachments.Cut f = y64.f(jSONObject);
        ArrayList e = y64.e(jSONObject, map, f);
        NewsEntry.TrackData trackData2 = new NewsEntry.TrackData(jSONObject.optString("track_code"), 0, 0L, false, false, null, null, 0, 254, null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("caption");
        if (optJSONObject3 != null) {
            Serializer.c<Caption> cVar = Caption.CREATOR;
            Caption a2 = Caption.a.a(optJSONObject3);
            a2.j = (map == null || (owner3 = (Owner) map.get(a2.h)) == null) ? null : owner3.c;
            caption = a2;
        } else {
            caption = null;
        }
        String a3 = cqm0.a(jSONObject.optString("title"));
        long optLong = jSONObject.optLong("source_id");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("header");
        EntryHeader n = optJSONObject4 != null ? tci.n(optJSONObject4, map) : null;
        if (((n == null || (sourcePhoto = n.b) == null) ? null : sourcePhoto.d()) == null && epx.f(str, "video") && (optJSONObject = jSONObject.optJSONObject("video")) != null) {
            JSONArray optJSONArray3 = optJSONObject.optJSONArray("items");
            if (optJSONArray3 != null) {
                int length = optJSONArray3.length();
                caption2 = caption;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    JSONObject jSONObject2 = optJSONArray3.getJSONObject(i3);
                    int i5 = i3;
                    str2 = a3;
                    long optLong2 = jSONObject2.optLong("owner_id");
                    if (optLong2 == optLong) {
                        jSONArray = optJSONArray3;
                        cut = f;
                        if (epx.f(jSONObject2.optString("type"), "music_video") && (optJSONArray2 = jSONObject2.optJSONArray("main_artists")) != null && (optJSONObject2 = optJSONArray2.optJSONObject(0)) != null) {
                            String optString = optJSONObject2.optString("name");
                            JSONArray optJSONArray4 = optJSONObject2.optJSONArray("photo");
                            if (optJSONArray4 != null) {
                                arrayList = e;
                                arrayList2 = new ArrayList(optJSONArray4.length());
                                int length2 = optJSONArray4.length();
                                trackData = trackData2;
                                int i6 = 0;
                                while (i6 < length2) {
                                    int i7 = length2;
                                    JSONObject jSONObject3 = optJSONArray4.getJSONObject(i6);
                                    arrayList2.add(new ImageSize(jSONObject3.optString("url"), jSONObject3.optInt("width"), jSONObject3.optInt("height"), null, (char) 0, false, 56, null));
                                    i6++;
                                    length2 = i7;
                                    optJSONArray4 = optJSONArray4;
                                }
                            } else {
                                arrayList = e;
                                trackData = trackData2;
                                arrayList2 = null;
                            }
                            Image image = new Image(arrayList2);
                            List singletonList = Collections.singletonList(new Owner(new UserId(optLong2), null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194302, null));
                            ImageSize Cb = image.Cb(50, true, true);
                            SourcePhoto sourcePhoto2 = new SourcePhoto(singletonList, image, Cb != null ? Cb.d.d : null);
                            List singletonList2 = Collections.singletonList(new UserId(optLong));
                            if (n != null && (headerTitle6 = n.c) != null) {
                                List<Text> list = headerTitle6.c;
                                Text text = list != null ? (Text) j5g.a0(list) : null;
                                if (text != null) {
                                    themedColor = text.c;
                                    entryHeader3 = n == null ? EntryHeader.a(n, sourcePhoto2, new HeaderTitle(singletonList2, Collections.singletonList(new Text(optString, themedColor)), (n != null || (headerTitle5 = n.c) == null) ? null : headerTitle5.d, (n != null || (headerTitle4 = n.c) == null || (verifyInfo = headerTitle4.e) == null) ? new VerifyInfo(false, false, false, false, false, false, 63, null) : verifyInfo, n == null && (headerTitle3 = n.c) != null && headerTitle3.f, n == null && (headerTitle2 = n.c) != null && headerTitle2.g, n == null && (headerTitle = n.c) != null && headerTitle.h), null, IronSourceError.ERROR_CODE_INIT_FAILED) : null;
                                    if (entryHeader3 != null) {
                                        n = entryHeader3;
                                    }
                                }
                            }
                            themedColor = null;
                            if (n == null) {
                            }
                            if (entryHeader3 != null) {
                            }
                        }
                    } else {
                        jSONArray = optJSONArray3;
                        cut = f;
                    }
                    i3 = i5 + 1;
                    length = i4;
                    a3 = str2;
                    optJSONArray3 = jSONArray;
                    f = cut;
                    e = e;
                    trackData2 = trackData2;
                }
            } else {
                caption2 = caption;
            }
            str2 = a3;
            cut = f;
            arrayList = e;
            trackData = trackData2;
            entryHeader3 = n;
            if (entryHeader3 != null) {
            }
        } else {
            caption2 = caption;
            str2 = a3;
            cut = f;
            arrayList = e;
            trackData = trackData2;
        }
        boolean optBoolean = jSONObject.optBoolean("suggest_subscribe");
        ibr0 pe = ((ClipsViewerComponent) ((k7m) m7m.f(aVar)).a(fpf0.a(ClipsViewerComponent.class))).pe();
        long optLong3 = jSONObject.optLong("source_id");
        Owner owner4 = map != null ? (Owner) map.get(new UserId(optLong3)) : null;
        int optInt = jSONObject.optInt("date");
        JSONObject optJSONObject5 = jSONObject.optJSONObject(jSONObject.optString("type"));
        if ((optJSONObject5 == null || (optJSONArray = optJSONObject5.optJSONArray("items")) == null) && (optJSONArray = jSONObject.optJSONArray("items")) == null) {
            optJSONArray = new JSONArray();
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject(DatabaseHelper.ITEM_COLUMN_NAME);
        if (optJSONObject6 != null) {
            optJSONArray.put(optJSONObject6);
        }
        boolean optBoolean2 = jSONObject.optBoolean("ads_easy_promote_three_dots");
        JSONObject optJSONObject7 = jSONObject.optJSONObject("ads_easy_promote");
        if (optJSONObject7 != null) {
            Serializer.c<EasyPromote> cVar2 = EasyPromote.CREATOR;
            EasyPromote a4 = EasyPromote.a.a(optJSONObject7);
            z = optBoolean2;
            Owner owner5 = owner4;
            i = optInt;
            j = optLong3;
            caption3 = caption2;
            owner = owner5;
            easyPromote = a4;
        } else {
            z = optBoolean2;
            Owner owner6 = owner4;
            i = optInt;
            j = optLong3;
            caption3 = caption2;
            easyPromote = null;
            owner = owner6;
        }
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("privacy_text");
        String optString4 = jSONObject.optString("description");
        JSONArray optJSONArray5 = jSONObject.optJSONArray("buttons");
        if (optJSONArray5 != null) {
            Serializer.c<LinkButton> cVar3 = LinkButton.CREATOR;
            z2 = optBoolean;
            r15 = new ArrayList(optJSONArray5.length());
            int length3 = optJSONArray5.length();
            j2 = j;
            int i8 = 0;
            while (i8 < length3) {
                r15.add(new LinkButton(optJSONArray5.getJSONObject(i8)));
                i8++;
                optJSONArray5 = optJSONArray5;
            }
        } else {
            z2 = optBoolean;
            j2 = j;
            r15 = EmptyList.b;
        }
        EntryDescription entryDescription2 = new EntryDescription(optString2, optString3, optString4, r15);
        String str5 = entryDescription2.b;
        if ((str5 == null || drm0.N(str5)) && (((str3 = entryDescription2.c) == null || drm0.N(str3)) && (((str4 = entryDescription2.d) == null || drm0.N(str4)) && entryDescription2.e.isEmpty()))) {
            entryHeader = n;
            obj = null;
            entryDescription = null;
        } else {
            entryDescription = entryDescription2;
            entryHeader = n;
            obj = null;
        }
        ArrayList arrayList3 = new ArrayList(optJSONArray.length());
        int length4 = optJSONArray.length();
        int i9 = 0;
        while (i9 < length4) {
            JSONObject optJSONObject8 = optJSONArray.optJSONObject(i9);
            if (optJSONObject8 != null) {
                VideoFileOld b = com.vk.dto.common.c.b(optJSONObject8);
                if (map != null && (owner2 = (Owner) map.get(b.b)) != null) {
                    b.p0 = owner2.c;
                    b.q0 = owner2.e;
                    b.f1(owner2);
                }
                if (g620.f().c(b)) {
                    ClipVideoFile clipVideoFile = (ClipVideoFile) b;
                    MusicTrack musicTrack = clipVideoFile.D1;
                    entryHeader2 = entryHeader;
                    i2 = length4;
                    obj2 = null;
                    clipVideoFile.U1 = xod.a.a(pe, clipVideoFile.m, null, false, 14);
                    clipVideoFile.V1 = pe.b(musicTrack != null ? musicTrack.d : null);
                    clipVideoFile.W1 = pe.c(musicTrack);
                    ClickableStickers clickableStickers = clipVideoFile.C1;
                    if (clickableStickers != null) {
                        Iterator it = clickableStickers.K3().iterator();
                        while (it.hasNext()) {
                            Good good = (Good) it.next();
                            good.M = map != null ? (Owner) map.get(good.c) : null;
                        }
                    }
                } else {
                    entryHeader2 = entryHeader;
                    i2 = length4;
                    obj2 = obj;
                }
                arrayList3.add(new EntryAttachment(new VideoAttachment(b), null, null, null, 14, null));
            } else {
                entryHeader2 = entryHeader;
                i2 = length4;
                obj2 = obj;
            }
            i9++;
            length4 = i2;
            obj = obj2;
            entryHeader = entryHeader2;
        }
        EntryHeader entryHeader4 = entryHeader;
        Videos videos = new Videos(j2, owner, i, arrayList3, caption3, str2, entryHeader4 == null ? pwu.b(owner) : entryHeader4, str, cut, arrayList, trackData, entryDescription, z2, 0, easyPromote, 8192, null);
        videos.Sb(2, z2);
        videos.Sb(4, z);
        return videos;
    }
}

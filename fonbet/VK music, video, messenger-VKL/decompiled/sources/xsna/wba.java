package xsna;

import com.coremedia.iso.boxes.MetaBox;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockAnchorInfo;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.block.CatalogBlockStatInfo;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogAdBanner;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.section.CatalogSectionStyle;
import com.vk.catalog2.common.dto.api.video.CatalogPinnedVideoInfo;
import com.vk.core.serialize.Serializer;
import com.vk.libvideo.author.VideoPinType;
import com.vk.log.L;
import io.jsonwebtoken.Claims;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CatalogParser.kt */
/* loaded from: classes16.dex */
public final class wba {
    public final com.vk.catalog2.common.dto.api.hint.a a = new com.vk.catalog2.common.dto.api.hint.a();

    public static ArrayList a(JSONObject jSONObject) {
        ArrayList arrayList;
        CatalogButton.b bVar = CatalogButton.b;
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        Object a = bVar.a(optJSONObject);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    } catch (Exception e) {
                        L.i(e);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? new ArrayList() : arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0175, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatalogBlock b(String str, JSONObject jSONObject) {
        Object obj;
        Meta meta;
        int length;
        int i;
        Object a;
        JSONArray optJSONArray;
        CatalogBlockStatInfo catalogBlockStatInfo;
        CatalogDataType catalogDataType;
        String str2;
        String str3;
        String str4;
        List list;
        JSONArray optJSONArray2;
        List list2;
        VideoPinType videoPinType;
        CatalogPinnedVideoInfo catalogPinnedVideoInfo;
        int i2;
        String str5;
        String str6;
        String str7;
        Object a2;
        CatalogBadge catalogBadge;
        CatalogDataType I = znk0.I(jSONObject.optString("data_type"));
        CatalogLayout.c cVar = CatalogLayout.k;
        Object obj2 = CatalogLayout.l;
        if (jSONObject.has(TtmlNode.TAG_LAYOUT)) {
            try {
                obj = cVar.a(jSONObject.getJSONObject(TtmlNode.TAG_LAYOUT));
            } catch (JSONException e) {
                L.i(e);
            }
            if (obj != null) {
                obj2 = obj;
            }
            CatalogLayout catalogLayout = (CatalogLayout) obj2;
            ArrayList a3 = a(jSONObject);
            JSONArray f = f("item_badges", jSONObject);
            Meta.a aVar = Meta.l;
            if (jSONObject.has(MetaBox.TYPE)) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(MetaBox.TYPE);
                    aVar.getClass();
                    meta = new Meta(jSONObject2);
                } catch (JSONException e2) {
                    L.i(e2);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                length = f.length();
                for (i = 0; i < length; i++) {
                    JSONObject jSONObject3 = f.getJSONObject(i);
                    String C = f370.C("item_id", "", jSONObject3);
                    CatalogBadge.a aVar2 = CatalogBadge.d;
                    if (jSONObject3.has("badge")) {
                        try {
                            a2 = aVar2.a(jSONObject3.getJSONObject("badge"));
                        } catch (JSONException e3) {
                            L.i(e3);
                        }
                        catalogBadge = (CatalogBadge) a2;
                        if (!drm0.N(C) && catalogBadge != null) {
                            linkedHashMap.put(C, catalogBadge);
                        }
                    }
                    a2 = null;
                    catalogBadge = (CatalogBadge) a2;
                    if (!drm0.N(C)) {
                        linkedHashMap.put(C, catalogBadge);
                    }
                }
                String optString = jSONObject.optString("id");
                String str8 = "ref";
                String optString2 = jSONObject.optString("ref", jSONObject.optString("id"));
                String optString3 = jSONObject.optString("next_from", null);
                String optString4 = jSONObject.optString("url", null);
                CatalogBadge.a aVar3 = CatalogBadge.d;
                if (jSONObject.has("badge")) {
                    try {
                        a = aVar3.a(jSONObject.getJSONObject("badge"));
                    } catch (JSONException e4) {
                        L.i(e4);
                    }
                    CatalogBadge catalogBadge2 = (CatalogBadge) a;
                    String optString5 = jSONObject.optString("track_code", null);
                    ArrayList d = d(jSONObject);
                    CatalogBlockItemsData catalogBlockItemsData = new CatalogBlockItemsData(I, jSONObject);
                    String D = f370.D(jSONObject, "hint_id");
                    String D2 = f370.D(jSONObject, "action_button_color");
                    String optString6 = jSONObject.optString("subtype", BuildConfig.FLAVOR);
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("stat_infos");
                    CatalogBlockStatInfo catalogBlockStatInfo2 = optJSONArray3 == null ? new CatalogBlockStatInfo(optJSONArray3) : null;
                    optJSONArray = jSONObject.optJSONArray("anchor_info");
                    if (optJSONArray == null) {
                        Serializer.c<CatalogBlockAnchorInfo> cVar2 = CatalogBlockAnchorInfo.CREATOR;
                        catalogBlockStatInfo = catalogBlockStatInfo2;
                        catalogDataType = I;
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        int length2 = optJSONArray.length();
                        str2 = optString;
                        int i3 = 0;
                        while (i3 < length2) {
                            int i4 = length2;
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                            JSONArray jSONArray = optJSONArray;
                            if (optJSONObject != null) {
                                i2 = i3;
                                str5 = D;
                                str6 = D2;
                                str7 = str8;
                                arrayList.add(new CatalogBlockAnchorInfo(f370.D(optJSONObject, "tag"), f370.D(optJSONObject, "token"), f370.D(optJSONObject, str8), f370.D(optJSONObject, "product_data")));
                            } else {
                                i2 = i3;
                                str5 = D;
                                str6 = D2;
                                str7 = str8;
                            }
                            i3 = i2 + 1;
                            length2 = i4;
                            optJSONArray = jSONArray;
                            D = str5;
                            D2 = str6;
                            str8 = str7;
                        }
                        str3 = D;
                        str4 = D2;
                        list = j5g.O0(arrayList);
                    } else {
                        catalogBlockStatInfo = catalogBlockStatInfo2;
                        catalogDataType = I;
                        str2 = optString;
                        str3 = D;
                        str4 = D2;
                    }
                    list = EmptyList.b;
                    optJSONArray2 = jSONObject.optJSONArray("pinned_videos");
                    if (optJSONArray2 == null) {
                        Serializer.c<CatalogPinnedVideoInfo> cVar3 = CatalogPinnedVideoInfo.CREATOR;
                        ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
                        int length3 = optJSONArray2.length();
                        for (int i5 = 0; i5 < length3; i5++) {
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i5);
                            if (optJSONObject2 != null) {
                                String D3 = f370.D(optJSONObject2, "video_raw_id");
                                if (D3 == null) {
                                    catalogPinnedVideoInfo = null;
                                } else {
                                    String optString7 = optJSONObject2.optString("pin_type");
                                    if (optString7 != null) {
                                        switch (optString7.hashCode()) {
                                            case 96673:
                                                if (optString7.equals("all")) {
                                                    videoPinType = VideoPinType.ALL;
                                                    break;
                                                }
                                                break;
                                            case 114240:
                                                if (optString7.equals(Claims.SUBJECT)) {
                                                    videoPinType = VideoPinType.SUBSCRIBERS;
                                                    break;
                                                }
                                                break;
                                            case 3056464:
                                                if (optString7.equals("clip")) {
                                                    videoPinType = VideoPinType.CLIP;
                                                    break;
                                                }
                                                break;
                                            case 2123524558:
                                                if (optString7.equals("non_sub")) {
                                                    videoPinType = VideoPinType.NON_SUBSCRIBERS;
                                                    break;
                                                }
                                                break;
                                        }
                                        catalogPinnedVideoInfo = new CatalogPinnedVideoInfo(D3, videoPinType);
                                    }
                                    videoPinType = null;
                                    catalogPinnedVideoInfo = new CatalogPinnedVideoInfo(D3, videoPinType);
                                }
                                arrayList2.add(catalogPinnedVideoInfo);
                            }
                        }
                        list2 = j5g.V(arrayList2);
                    } else {
                        list2 = EmptyList.b;
                    }
                    return new CatalogBlock(str2, catalogDataType, optString2, str, optString3, optString4, catalogBadge2, catalogLayout, a3, optString5, d, catalogBlockItemsData, str3, linkedHashMap, meta, str4, optString6, catalogBlockStatInfo, null, list, list2, SQLiteDatabase.OPEN_PRIVATECACHE, null);
                }
                a = null;
                CatalogBadge catalogBadge22 = (CatalogBadge) a;
                String optString52 = jSONObject.optString("track_code", null);
                ArrayList d2 = d(jSONObject);
                CatalogBlockItemsData catalogBlockItemsData2 = new CatalogBlockItemsData(I, jSONObject);
                String D4 = f370.D(jSONObject, "hint_id");
                String D22 = f370.D(jSONObject, "action_button_color");
                String optString62 = jSONObject.optString("subtype", BuildConfig.FLAVOR);
                JSONArray optJSONArray32 = jSONObject.optJSONArray("stat_infos");
                if (optJSONArray32 == null) {
                }
                optJSONArray = jSONObject.optJSONArray("anchor_info");
                if (optJSONArray == null) {
                }
                list = EmptyList.b;
                optJSONArray2 = jSONObject.optJSONArray("pinned_videos");
                if (optJSONArray2 == null) {
                }
                return new CatalogBlock(str2, catalogDataType, optString2, str, optString3, optString4, catalogBadge22, catalogLayout, a3, optString52, d2, catalogBlockItemsData2, str3, linkedHashMap, meta, str4, optString62, catalogBlockStatInfo, null, list, list2, SQLiteDatabase.OPEN_PRIVATECACHE, null);
            }
            meta = null;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            length = f.length();
            while (i < length) {
            }
            String optString8 = jSONObject.optString("id");
            String str82 = "ref";
            String optString22 = jSONObject.optString("ref", jSONObject.optString("id"));
            String optString32 = jSONObject.optString("next_from", null);
            String optString42 = jSONObject.optString("url", null);
            CatalogBadge.a aVar32 = CatalogBadge.d;
            if (jSONObject.has("badge")) {
            }
            a = null;
            CatalogBadge catalogBadge222 = (CatalogBadge) a;
            String optString522 = jSONObject.optString("track_code", null);
            ArrayList d22 = d(jSONObject);
            CatalogBlockItemsData catalogBlockItemsData22 = new CatalogBlockItemsData(I, jSONObject);
            String D42 = f370.D(jSONObject, "hint_id");
            String D222 = f370.D(jSONObject, "action_button_color");
            String optString622 = jSONObject.optString("subtype", BuildConfig.FLAVOR);
            JSONArray optJSONArray322 = jSONObject.optJSONArray("stat_infos");
            if (optJSONArray322 == null) {
            }
            optJSONArray = jSONObject.optJSONArray("anchor_info");
            if (optJSONArray == null) {
            }
            list = EmptyList.b;
            optJSONArray2 = jSONObject.optJSONArray("pinned_videos");
            if (optJSONArray2 == null) {
            }
            return new CatalogBlock(str2, catalogDataType, optString22, str, optString32, optString42, catalogBadge222, catalogLayout, a3, optString522, d22, catalogBlockItemsData22, str3, linkedHashMap2, meta, str4, optString622, catalogBlockStatInfo, null, list, list2, SQLiteDatabase.OPEN_PRIVATECACHE, null);
        }
        obj = null;
        if (obj != null) {
        }
        CatalogLayout catalogLayout2 = (CatalogLayout) obj2;
        ArrayList a32 = a(jSONObject);
        JSONArray f2 = f("item_badges", jSONObject);
        Meta.a aVar4 = Meta.l;
        if (jSONObject.has(MetaBox.TYPE)) {
        }
        meta = null;
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        length = f2.length();
        while (i < length) {
        }
        String optString82 = jSONObject.optString("id");
        String str822 = "ref";
        String optString222 = jSONObject.optString("ref", jSONObject.optString("id"));
        String optString322 = jSONObject.optString("next_from", null);
        String optString422 = jSONObject.optString("url", null);
        CatalogBadge.a aVar322 = CatalogBadge.d;
        if (jSONObject.has("badge")) {
        }
        a = null;
        CatalogBadge catalogBadge2222 = (CatalogBadge) a;
        String optString5222 = jSONObject.optString("track_code", null);
        ArrayList d222 = d(jSONObject);
        CatalogBlockItemsData catalogBlockItemsData222 = new CatalogBlockItemsData(I, jSONObject);
        String D422 = f370.D(jSONObject, "hint_id");
        String D2222 = f370.D(jSONObject, "action_button_color");
        String optString6222 = jSONObject.optString("subtype", BuildConfig.FLAVOR);
        JSONArray optJSONArray3222 = jSONObject.optJSONArray("stat_infos");
        if (optJSONArray3222 == null) {
        }
        optJSONArray = jSONObject.optJSONArray("anchor_info");
        if (optJSONArray == null) {
        }
        list = EmptyList.b;
        optJSONArray2 = jSONObject.optJSONArray("pinned_videos");
        if (optJSONArray2 == null) {
        }
        return new CatalogBlock(str2, catalogDataType, optString222, str, optString322, optString422, catalogBadge2222, catalogLayout2, a32, optString5222, d222, catalogBlockItemsData222, str3, linkedHashMap22, meta, str4, optString6222, catalogBlockStatInfo, null, list, list2, SQLiteDatabase.OPEN_PRIVATECACHE, null);
    }

    public static ArrayList d(JSONObject jSONObject) {
        ArrayList arrayList;
        JSONArray optJSONArray = jSONObject.optJSONArray("listen_events");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (optString != null) {
                    arrayList.add(optString);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList != null ? arrayList : new ArrayList();
    }

    public static JSONArray f(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        return optJSONArray == null ? new JSONArray() : optJSONArray;
    }

    public final hda c(JSONObject jSONObject) throws IllegalStateException {
        ArrayList arrayList;
        CatalogExtendedData catalogExtendedData = new CatalogExtendedData(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("catalog");
        JSONArray f = f("sections", jSONObject2);
        String optString = jSONObject2.optString("default_section");
        ArrayList arrayList2 = new ArrayList(f.length());
        int length = f.length();
        for (int i = 0; i < length; i++) {
            arrayList2.add(e(f.getJSONObject(i)));
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject("header");
        CatalogSection e = optJSONObject != null ? e(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("footer");
        CatalogSection e2 = optJSONObject2 != null ? e(optJSONObject2) : null;
        String optString2 = jSONObject2.optString("pinned_section");
        CatalogButton.b bVar = CatalogButton.b;
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            int length2 = optJSONArray.length();
            arrayList = new ArrayList(length2);
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i2);
                if (optJSONObject3 != null) {
                    try {
                        Object a = bVar.a(optJSONObject3);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    } catch (Exception e3) {
                        L.i(e3);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList3 = arrayList;
        if (arrayList2.isEmpty()) {
            throw new IllegalStateException("Catalog sections are empty!");
        }
        return new hda(new CatalogCatalog(arrayList2, optString, e, e2, optString2, arrayList3, false, 64, null), catalogExtendedData, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatalogSection e(JSONObject jSONObject) {
        ArrayList arrayList;
        CatalogAdBanner catalogAdBanner;
        Object a;
        Object a2;
        Object a3;
        String optString = jSONObject.optString("id");
        JSONArray optJSONArray = jSONObject.optJSONArray("blocks");
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(b(optString, optJSONArray.getJSONObject(i)));
            }
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        ArrayList a4 = a(jSONObject);
        String D = f370.D(jSONObject, "data_type");
        CatalogDataType catalogDataType = null;
        if (D != null) {
            catalogAdBanner = null;
            catalogDataType = znk0.I(D);
        } else {
            catalogAdBanner = null;
        }
        String D2 = f370.D(jSONObject, CampaignEx.JSON_KEY_ICON_URL);
        JSONObject optJSONObject = jSONObject.optJSONObject("ad_banner");
        CatalogAdBanner catalogAdBanner2 = optJSONObject != null ? new CatalogAdBanner(optJSONObject.optInt("slot_id")) : catalogAdBanner;
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("next_from");
        String optString4 = jSONObject.optString("url");
        CatalogBadge.a aVar = CatalogBadge.d;
        if (jSONObject.has("badge")) {
            try {
                a = aVar.a(jSONObject.getJSONObject("badge"));
            } catch (JSONException e) {
                L.i(e);
            }
            CatalogBadge catalogBadge = (CatalogBadge) a;
            ArrayList d = d(jSONObject);
            com.vk.catalog2.common.dto.api.hint.a aVar2 = this.a;
            if (jSONObject.has("hint")) {
                try {
                    a2 = aVar2.a(jSONObject.getJSONObject("hint"));
                } catch (JSONException e2) {
                    L.i(e2);
                }
                CatalogHint catalogHint = (CatalogHint) a2;
                CatalogSectionStyle.a aVar3 = CatalogSectionStyle.d;
                if (jSONObject.has(TtmlNode.TAG_STYLE)) {
                    try {
                        a3 = aVar3.a(jSONObject.getJSONObject(TtmlNode.TAG_STYLE));
                    } catch (JSONException e3) {
                        L.i(e3);
                    }
                    return new CatalogSection(optString, catalogDataType, optString2, optString3, optString4, catalogBadge, d, arrayList2, a4, catalogHint, (CatalogSectionStyle) a3, null, catalogAdBanner2, D2, 2048, null);
                }
                a3 = null;
                return new CatalogSection(optString, catalogDataType, optString2, optString3, optString4, catalogBadge, d, arrayList2, a4, catalogHint, (CatalogSectionStyle) a3, null, catalogAdBanner2, D2, 2048, null);
            }
            a2 = null;
            CatalogHint catalogHint2 = (CatalogHint) a2;
            CatalogSectionStyle.a aVar32 = CatalogSectionStyle.d;
            if (jSONObject.has(TtmlNode.TAG_STYLE)) {
            }
            a3 = null;
            return new CatalogSection(optString, catalogDataType, optString2, optString3, optString4, catalogBadge, d, arrayList2, a4, catalogHint2, (CatalogSectionStyle) a3, null, catalogAdBanner2, D2, 2048, null);
        }
        a = catalogAdBanner;
        CatalogBadge catalogBadge2 = (CatalogBadge) a;
        ArrayList d2 = d(jSONObject);
        com.vk.catalog2.common.dto.api.hint.a aVar22 = this.a;
        if (jSONObject.has("hint")) {
        }
        a2 = null;
        CatalogHint catalogHint22 = (CatalogHint) a2;
        CatalogSectionStyle.a aVar322 = CatalogSectionStyle.d;
        if (jSONObject.has(TtmlNode.TAG_STYLE)) {
        }
        a3 = null;
        return new CatalogSection(optString, catalogDataType, optString2, optString3, optString4, catalogBadge2, d2, arrayList2, a4, catalogHint22, (CatalogSectionStyle) a3, null, catalogAdBanner2, D2, 2048, null);
    }
}

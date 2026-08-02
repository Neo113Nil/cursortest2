package xsna;

import android.util.ArrayMap;
import com.google.android.gms.internal.measurement.zznn;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.stories.model.clickable.ClickableLink;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickableQuestion;
import com.vk.dto.stories.model.clickable.ClickableReply;
import com.vk.dto.stories.model.clickable.ClickableServiceYcItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.feed.core.models.OverlayImage;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderBadge;
import com.vk.feed.core.models.header.HeaderIcon;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClipMetaCenteredView.kt */
/* loaded from: classes2.dex */
public final class tci implements nk50, q701, o320 {
    public static final jai b = new jai(-381519788, new sci(0), false);
    public static final tci c = new tci();
    public static final /* synthetic */ tci d = new tci();
    public static t9o e;
    public static boolean f;

    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(efz.a(i, i2, "index: ", ", size: "));
        }
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(efz.a(i, i2, "index: ", ", size: "));
        }
    }

    public static final void e(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder a = odj.a(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            a.append(i3);
            throw new IndexOutOfBoundsException(a.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(efz.a(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final q630 f(q630 q630Var, anr anrVar) {
        return q630Var.g(new p3q0(anrVar, a5x.a));
    }

    public static ojz g(ojz ojzVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ojzVar.a;
        }
        if ((i & 2) != 0) {
            z2 = ojzVar.b;
        }
        return (z == ojzVar.a && z2 == ojzVar.b) ? ojzVar : new ojz(z, z2);
    }

    public static k9l0 i(int i, int i2, List list) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        List<ClickableSticker> list2;
        List<ClickableSticker> a;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nov novVar = (nov) it.next();
            if (aal0.h(novVar) && (a = aal0.a(novVar)) != null) {
                arrayList.addAll(a);
            }
        }
        ClickableStickers clickableStickers = arrayList.isEmpty() ? null : new ClickableStickers(i, i2, arrayList);
        int i13 = 0;
        if (clickableStickers == null || (list2 = clickableStickers.d) == null) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            i4 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (ClickableSticker clickableSticker : list2) {
                if (clickableSticker instanceof ClickableHashtag) {
                    i4++;
                } else if (clickableSticker instanceof ClickableMention) {
                    UserId userId = ((ClickableMention) clickableSticker).e;
                    if (userId != null) {
                        hashSet.add(userId);
                    }
                } else if (clickableSticker instanceof ClickableQuestion) {
                    i14++;
                } else if (clickableSticker instanceof ClickableMusic) {
                    i17++;
                } else if (clickableSticker instanceof ClickableMarketItem) {
                    Good good = ((ClickableMarketItem) clickableSticker).j;
                    if (good == null || !good.V) {
                        i18++;
                    } else {
                        i19++;
                    }
                } else if (clickableSticker instanceof ClickableReply) {
                    i20++;
                } else if (clickableSticker instanceof ClickableLink) {
                    if (epx.f(((ClickableLink) clickableSticker).j, Boolean.TRUE)) {
                        i16++;
                    } else {
                        i15++;
                    }
                } else if (clickableSticker instanceof ClickableServiceYcItem) {
                    i21++;
                } else if (clickableSticker instanceof ClickableGeo) {
                    i22++;
                }
            }
            i3 = i15;
            i11 = i21;
            i12 = i22;
            i6 = i14;
            i5 = i16;
            i7 = i17;
            i8 = i18;
            i10 = i19;
            i9 = i20;
        }
        Iterator it2 = list.iterator();
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (it2.hasNext()) {
            int i26 = i3;
            nov novVar2 = (nov) it2.next();
            HashSet hashSet2 = hashSet;
            if (novVar2 instanceof yjm0) {
                i13++;
            } else if (novVar2 instanceof g4m0) {
                i23++;
            } else if (novVar2 instanceof r8m0) {
                i24++;
            } else if (novVar2 instanceof abm0) {
                i25++;
            }
            i3 = i26;
            hashSet = hashSet2;
        }
        return new k9l0(hashSet, i4, i3, i5, i6, i7, i8, i9, i13, i23, i24, i10, i11, i12, i25);
    }

    public static final ArrayList j(ArrayList arrayList, List list) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            VideoFile videoFile = (VideoFile) obj2;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((VideoFile) obj).a1(), videoFile.a1())) {
                    break;
                }
            }
            if (obj == null) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final nb9 k(mm50 mm50Var) {
        return rsr.i(new jil0(new q60(1, mm50Var, mm50.class, "events", "events(Lkotlin/jvm/functions/Function1;)Lcom/vk/mvi/Clearable;", 0, 11), null));
    }

    public static final h1m l(mm50 mm50Var) {
        return new h1m(rsr.i(new jil0(new ptb(1, mm50Var, mm50.class, "states", "states(Lkotlin/jvm/functions/Function1;)Lcom/vk/mvi/Clearable;", 0, 3), null)), new gkc0(mm50Var, 12));
    }

    public static final q630 m(q630 q630Var, izs izsVar) {
        return q630Var.g(new e7j(izsVar, a5x.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.feed.core.models.actions.HeaderAction] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [com.vk.dto.user.SocialButtonType] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.vk.feed.core.models.header.HeaderIcon] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.vk.dto.newsfeed.Owner] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [com.vk.feed.core.models.actions.HeaderAction] */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.vk.dto.common.ThemedColor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EntryHeader n(JSONObject jSONObject, Map map) {
        SourcePhoto sourcePhoto;
        HeaderTitle headerTitle;
        HeaderBadge headerBadge;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        ?? r25;
        JSONObject optJSONObject;
        ?? r26;
        ?? r6;
        UserId userId;
        Image image;
        JSONArray optJSONArray;
        Text text;
        ThemedColor themedColor;
        JSONObject optJSONObject2;
        List list;
        ?? singletonList;
        List list2;
        VerifyInfo verifyInfo;
        ?? singletonList2;
        ArrayList arrayList2;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("photo");
        int i = 2;
        OverlayImage overlayImage = null;
        boolean z = false;
        boolean z2 = false;
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("source_ids")) {
                JSONArray jSONArray = optJSONObject3.getJSONArray("source_ids");
                singletonList2 = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    singletonList2.add(new UserId(jSONArray.getLong(i2)));
                }
            } else {
                singletonList2 = optJSONObject3.has("source_id") ? Collections.singletonList(new UserId(optJSONObject3.optLong("source_id"))) : 0;
            }
            if (singletonList2 != 0) {
                arrayList2 = new ArrayList();
                Iterator it = ((Iterable) singletonList2).iterator();
                while (it.hasNext()) {
                    Owner owner = map != null ? (Owner) map.get((UserId) it.next()) : null;
                    if (owner != null) {
                        arrayList2.add(owner);
                    }
                }
            } else {
                arrayList2 = null;
            }
            JSONArray optJSONArray2 = optJSONObject3.optJSONArray("sizes");
            sourcePhoto = new SourcePhoto(arrayList2, optJSONArray2 != null ? new Image(optJSONArray2, z2 ? 1 : 0, i, z ? 1 : 0) : null, optJSONObject3.optString(CampaignEx.JSON_KEY_IMAGE_URL));
        } else {
            sourcePhoto = null;
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("title");
        if (optJSONObject4 != null) {
            if (optJSONObject4.has("source_ids")) {
                JSONArray jSONArray2 = optJSONObject4.getJSONArray("source_ids");
                singletonList = new ArrayList(jSONArray2.length());
                int length2 = jSONArray2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    singletonList.add(new UserId(jSONArray2.getLong(i3)));
                }
            } else if (optJSONObject4.has("source_id")) {
                singletonList = Collections.singletonList(new UserId(optJSONObject4.optLong("source_id")));
            } else {
                list = null;
                if (!optJSONObject4.has("text")) {
                    Serializer.c<Text> cVar = Text.CREATOR;
                    list2 = Collections.singletonList(Text.a.a(optJSONObject4.getJSONObject("text")));
                } else if (map == null || list == null) {
                    list2 = null;
                } else {
                    List list3 = list;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        Owner owner2 = (Owner) map.get((UserId) it2.next());
                        arrayList3.add(new Text(owner2 != null ? owner2.c : null, null));
                    }
                    list2 = arrayList3;
                }
                UserId userId2 = list == null ? (UserId) j5g.a0(list) : null;
                Owner owner3 = (userId2 != null || map == null) ? null : (Owner) map.get(userId2);
                headerTitle = new HeaderTitle(list, list2, owner3 == null ? owner3.k : null, (owner3 != null || (verifyInfo = owner3.f) == null) ? new VerifyInfo(false, false, false, false, false, false, 63, null) : verifyInfo, owner3 == null && owner3.i(256), owner3 == null && owner3.i(8192), owner3 == null && owner3.i(16384));
            }
            list = singletonList;
            if (!optJSONObject4.has("text")) {
            }
            if (list == null) {
            }
            if (userId2 != null) {
            }
            headerTitle = new HeaderTitle(list, list2, owner3 == null ? owner3.k : null, (owner3 != null || (verifyInfo = owner3.f) == null) ? new VerifyInfo(false, false, false, false, false, false, 63, null) : verifyInfo, owner3 == null && owner3.i(256), owner3 == null && owner3.i(8192), owner3 == null && owner3.i(16384));
        } else {
            headerTitle = null;
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("badge");
        if (optJSONObject5 != null) {
            JSONObject optJSONObject6 = optJSONObject5.optJSONObject("text");
            if (optJSONObject6 != null) {
                Serializer.c<Text> cVar2 = Text.CREATOR;
                text = Text.a.a(optJSONObject6);
            } else {
                text = null;
            }
            JSONObject optJSONObject7 = optJSONObject5.optJSONObject(L2.g);
            if (optJSONObject7 == null || (optJSONObject2 = optJSONObject7.optJSONObject("color")) == null) {
                themedColor = null;
            } else {
                String a = cqm0.a(optJSONObject2.optString("light"));
                Integer a2 = a != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", a) : null;
                String a3 = cqm0.a(optJSONObject2.optString("dark"));
                themedColor = new ThemedColor(a2, a3 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", a3) : null);
            }
            headerBadge = new HeaderBadge(text, themedColor);
        } else {
            headerBadge = null;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("descriptions");
        if (optJSONArray3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int length3 = optJSONArray3.length();
            for (int i4 = 0; i4 < length3; i4++) {
                JSONObject optJSONObject8 = optJSONArray3.optJSONObject(i4);
                if (optJSONObject8 != null) {
                    arrayList4.add(vj90.c(optJSONObject8, map));
                }
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        JSONObject optJSONObject9 = jSONObject.optJSONObject("overlay_image");
        if (optJSONObject9 != null) {
            Serializer.c<OverlayImage> cVar3 = OverlayImage.CREATOR;
            JSONObject optJSONObject10 = optJSONObject9.optJSONObject("image");
            if (optJSONObject10 == null || !optJSONObject10.has("source_id")) {
                str = "dark";
                str2 = "light";
                userId = null;
            } else {
                str = "dark";
                str2 = "light";
                userId = new UserId(optJSONObject10.optLong("source_id"));
            }
            Owner owner4 = (userId == null || map == null) ? null : (Owner) map.get(userId);
            if (owner4 == null || (image = owner4.g) == null) {
                JSONObject optJSONObject11 = optJSONObject9.optJSONObject("image");
                if (optJSONObject11 == null || (optJSONArray = optJSONObject11.optJSONArray("sizes")) == null) {
                    str3 = null;
                    image = null;
                } else {
                    str3 = null;
                    image = new Image(optJSONArray, false ? 1 : 0, 2, false ? 1 : 0);
                }
            } else {
                str3 = null;
            }
            JSONObject optJSONObject12 = optJSONObject9.optJSONObject("image");
            String optString = optJSONObject12 != null ? optJSONObject12.optString(CampaignEx.JSON_KEY_IMAGE_URL) : str3;
            JSONObject optJSONObject13 = optJSONObject9.optJSONObject("image");
            String optString2 = optJSONObject13 != null ? optJSONObject13.optString("name") : str3;
            JSONObject optJSONObject14 = optJSONObject9.optJSONObject("action");
            overlayImage = new OverlayImage(image, optString, optString2, optJSONObject14 != null ? HeaderAction.a.a(optJSONObject14, map) : str3);
        } else {
            str = "dark";
            str2 = "light";
            str3 = null;
        }
        String a4 = cqm0.a(jSONObject.optString("warning"));
        ?? valueOf = jSONObject.has("date") ? Integer.valueOf(jSONObject.optInt("date")) : str3;
        JSONObject optJSONObject15 = jSONObject.optJSONObject("title");
        if (optJSONObject15 != null) {
            Object userId3 = optJSONObject15.has("source_id") ? new UserId(optJSONObject15.optLong("source_id")) : str3;
            ?? r2 = (userId3 == null || map == null) ? str3 : (Owner) map.get(userId3);
            if (r2 != null) {
                r25 = r2.s;
                optJSONObject = jSONObject.optJSONObject("icon");
                if (optJSONObject == null) {
                    String optString3 = optJSONObject.optString("name");
                    JSONObject optJSONObject16 = optJSONObject.optJSONObject("color");
                    if (optJSONObject16 != null) {
                        String a5 = cqm0.a(optJSONObject16.optString(str2));
                        ?? a6 = a5 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", a5) : str3;
                        String a7 = cqm0.a(optJSONObject16.optString(str));
                        r6 = new ThemedColor(a6, a7 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", a7) : str3);
                    } else {
                        r6 = str3;
                    }
                    JSONObject optJSONObject17 = optJSONObject.optJSONObject("action");
                    r26 = new HeaderIcon(optString3, r6, optJSONObject17 != null ? HeaderAction.a.a(optJSONObject17, map) : str3, cqm0.a(optJSONObject.optString("accessibility_text")));
                } else {
                    r26 = str3;
                }
                return new EntryHeader(sourcePhoto, headerTitle, headerBadge, arrayList, overlayImage, a4, valueOf, r25, r26);
            }
        }
        r25 = str3;
        optJSONObject = jSONObject.optJSONObject("icon");
        if (optJSONObject == null) {
        }
        return new EntryHeader(sourcePhoto, headerTitle, headerBadge, arrayList, overlayImage, a4, valueOf, r25, r26);
    }

    public static final ItemReactions o(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("reactions");
        Integer num = null;
        if (optJSONObject == null) {
            return null;
        }
        TreeSet treeSet = new TreeSet(ItemReactions.j);
        JSONArray optJSONArray = optJSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                treeSet.add(new ItemReaction(jSONObject2.optInt("id"), jSONObject2.optInt("count")));
            }
        }
        try {
            num = f370.x(optJSONObject, "user_reaction");
        } catch (Throwable unused) {
        }
        return new ItemReactions(p4g.q(treeSet), optJSONObject.optInt("count"), 0, num);
    }

    public static final ItemReactions p(JSONObject jSONObject, ReactionSet reactionSet) {
        ReactionMeta d2;
        JSONObject optJSONObject = jSONObject.optJSONObject("reactions");
        Integer num = null;
        if (optJSONObject == null) {
            return null;
        }
        TreeSet treeSet = new TreeSet(ItemReactions.j);
        JSONArray optJSONArray = optJSONObject.optJSONArray("items");
        int i = 0;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i2 = 0;
            while (i < length) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                ItemReaction itemReaction = new ItemReaction(jSONObject2.optInt("id"), jSONObject2.optInt("count"));
                treeSet.add(itemReaction);
                i2 += itemReaction.c * ((reactionSet == null || (d2 = c2f0.d(reactionSet, itemReaction.b)) == null) ? 1 : d2.f());
                i++;
            }
            i = i2;
        }
        try {
            num = f370.x(optJSONObject, "user_reaction");
        } catch (Throwable unused) {
        }
        return new ItemReactions(p4g.q(treeSet), optJSONObject.optInt("count"), i, num);
    }

    public static final ReactionSet q(JSONObject jSONObject) {
        String optString = jSONObject.optString("reaction_set_id");
        if (optString == null || optString.length() == 0) {
            return null;
        }
        return (ReactionSet) r(jSONObject).get(optString);
    }

    public static final ArrayMap r(JSONObject jSONObject) {
        ArrayMap arrayMap = new ArrayMap();
        JSONArray optJSONArray = jSONObject.optJSONArray("reaction_sets");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                ReactionSet d2 = h1f0.d(optJSONArray.getJSONObject(i));
                arrayMap.put(d2.b, d2);
            }
        }
        return arrayMap;
    }

    public static final xm00 s(utk0 utk0Var, izs izsVar) {
        return new xm00(utk0Var, izsVar);
    }

    public static final big0 t(GroupsGroupFullDto groupsGroupFullDto) {
        return new big0(16, fkq0.e(groupsGroupFullDto.P0()), x(groupsGroupFullDto.V1(), groupsGroupFullDto.B1(), groupsGroupFullDto.R1()), groupsGroupFullDto.y1(), groupsGroupFullDto.y1());
    }

    public static final big0 u(UsersUserDto usersUserDto) {
        UserId j = usersUserDto.j();
        String f2 = usersUserDto.f();
        String k = usersUserDto.k();
        boolean b2 = fkq0.b(usersUserDto.j());
        return new big0(j, x(usersUserDto.u(), usersUserDto.o(), usersUserDto.p()), f2, k, usersUserDto.f() + ' ' + usersUserDto.k(), b2);
    }

    public static final big0 v(UsersUserFullDto usersUserFullDto) {
        UserId s1 = usersUserFullDto.s1();
        boolean b2 = fkq0.b(usersUserFullDto.s1());
        return new big0(s1, x(usersUserFullDto.r2(), usersUserFullDto.X1(), usersUserFullDto.o2()), usersUserFullDto.D0(), usersUserFullDto.x1(), usersUserFullDto.K0(), b2);
    }

    public static final yks0 w(nlh0 nlh0Var) {
        if (nlh0Var instanceof cls0) {
            return ((cls0) nlh0Var).a;
        }
        throw new IllegalStateException("VideoFileControllerAdapter must be used as SdkVideoFileController");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String x(String str, String str2, String str3) {
        String str4;
        if (str != null) {
            if (drm0.N(str)) {
                str = null;
            }
            if (str != null) {
                str4 = str.concat("&cs=72x0");
                if (str4 == null && str4.length() != 0) {
                    return str4;
                }
                if (str2 != null) {
                    if (drm0.N(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        return str2;
                    }
                }
                if (str3 != null || drm0.N(str3)) {
                    str3 = null;
                }
                return str3 != null ? "" : str3;
            }
        }
        str4 = null;
        if (str4 == null) {
        }
        if (str2 != null) {
        }
        if (str3 != null) {
        }
        str3 = null;
        if (str3 != null) {
        }
    }

    public static final q630 y(q630 q630Var, zpx0 zpx0Var) {
        return q630Var.g(new o4x(zpx0Var, a5x.a));
    }

    @Override // xsna.nk50
    public ovj c() {
        return hqu0.b();
    }

    @Override // xsna.o320
    public String d(i420 i420Var, String str) {
        if (i420Var instanceof b9z) {
            return super.h((b9z) i420Var, str);
        }
        if (!(i420Var instanceof ogq0)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(X3.j.d);
        UserId userId = ((ogq0) i420Var).b;
        sb.append(fkq0.b(userId) ? "club" : "id");
        sb.append(Math.abs(userId.b));
        sb.append('|');
        int i = 0;
        int P = drm0.P(str, '(', 0, 6) + 1;
        int L = drm0.L(str, ')', P, 4);
        if (P != -1 && P != str.length()) {
            i = P;
        }
        if (L == -1) {
            L = str.length();
        }
        sb.append(str.substring(i, L));
        sb.append(']');
        return sb.toString();
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzA());
    }
}

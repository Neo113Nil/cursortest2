package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.os.Parcelable;
import com.vk.api.base.Document;
import com.vk.api.video.VideoSave;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.Poll;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.dto.PostingOrd;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.onelog.NetworkClass;
import xsna.lxn0;

/* compiled from: PostingDraftStorage.kt */
/* loaded from: classes4.dex */
public final class bfc0 {
    public static final String[] b = {"draft_id"};
    public static final String[] c = {"ALTER TABLE draft ADD COLUMN poster_owner_id INTEGER;", "ALTER TABLE draft ADD COLUMN poster_bg_path TEXT;", "ALTER TABLE draft ADD COLUMN poster_text_color INTEGER;"};
    public final bpn0 a;

    public bfc0(Context context) {
        this.a = new bpn0(new kp40(context, 1));
    }

    public static final String a() {
        lxn0.a c2 = new lxn0("draft").c("draft_id");
        c2.d = true;
        lxn0.a d = c2.d("uid");
        d.f = true;
        lxn0.a d2 = d.d("updated_ts");
        d2.f = true;
        lxn0.a d3 = d2.e("text").e("attachments").e("geo").e("author").d("postpone");
        d3.g = "0";
        lxn0.a d4 = d3.d("export_fb");
        d4.g = "0";
        lxn0.a d5 = d4.d("export_tw");
        d5.g = "0";
        lxn0.a d6 = d5.d("is_ad");
        d6.g = "0";
        lxn0.a d7 = d6.d("only_friends");
        d7.g = String.valueOf(PostingVisibilityMode.ALL.h());
        lxn0.a d8 = d7.d("signed");
        d8.g = "0";
        lxn0.a d9 = d8.d("comments_closed");
        d9.g = "0";
        lxn0.a d10 = d9.d("notifications_disabled");
        d10.g = "0";
        lxn0.a d11 = d10.d("poster_background_id").d("poster_owner_id").e("poster_bg_path").d("poster_text_color").e("copyright").d("paid_duration_id").d("grid_layout");
        d11.g = "1";
        return d11.e("advertising_ord").e("images_crops").a.a();
    }

    public static ContentValues b(lec0 lec0Var) {
        String jSONObject;
        String jSONObject2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("updated_ts", Long.valueOf(lec0Var.c.getTime()));
        contentValues.put("text", lec0Var.d);
        List<Attachment> list = lec0Var.e;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (Parcelable parcelable : list) {
                if (parcelable instanceof tec0) {
                    jSONArray.put(((tec0) parcelable).Q3());
                }
            }
            String jSONArray2 = jSONArray.toString();
            if (jSONArray2 != null) {
                contentValues.put("attachments", jSONArray2);
            }
        }
        GeoAttachment geoAttachment = lec0Var.f;
        if (geoAttachment == null || (jSONObject2 = geoAttachment.Q3().toString()) == null) {
            contentValues.putNull("geo");
        } else {
            contentValues.put("geo", jSONObject2);
        }
        Target target = lec0Var.l;
        if (target != null && (jSONObject = target.e5().toString()) != null) {
            contentValues.put("author", jSONObject);
        }
        Date date = lec0Var.m;
        if (date != null) {
            contentValues.put("postpone", Long.valueOf(date.getTime()));
        }
        contentValues.put("paid_duration_id", lec0Var.t);
        contentValues.put("copyright", lec0Var.g);
        contentValues.put("export_fb", Boolean.valueOf(lec0Var.n));
        contentValues.put("export_tw", Boolean.valueOf(lec0Var.o));
        contentValues.put("only_friends", Integer.valueOf(lec0Var.p.ordinal()));
        contentValues.put("signed", Boolean.valueOf(lec0Var.q));
        contentValues.put("comments_closed", Boolean.valueOf(lec0Var.r));
        contentValues.put("notifications_disabled", Boolean.valueOf(lec0Var.s));
        contentValues.put("poster_background_id", lec0Var.h);
        UserId userId = lec0Var.i;
        contentValues.put("poster_owner_id", userId != null ? Long.valueOf(userId.b) : null);
        contentValues.put("poster_bg_path", lec0Var.j);
        contentValues.put("poster_text_color", lec0Var.k);
        contentValues.put("grid_layout", lec0Var.u);
        PostingOrd postingOrd = lec0Var.v;
        contentValues.put("advertising_ord", postingOrd != null ? new JSONObject().put("is_add_ord", postingOrd.b).put("pred_id_ord", postingOrd.c).put("er_id_ord", postingOrd.d).toString() : null);
        contentValues.put("images_crops", GsonHolder.a().toJson(lec0Var.w));
        return contentValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.vk.dto.common.id.UserId, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static ArrayList c(JSONArray jSONArray) {
        Poll poll;
        Attachment attachment;
        Good good;
        Attachment attachment2;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            ?? r6 = 0;
            r6 = 0;
            r6 = 0;
            r6 = 0;
            r6 = 0;
            r6 = 0;
            switch (jSONObject.optInt("type")) {
                case 1:
                    attachment2 = new GeoAttachment(jSONObject);
                    r6 = attachment2;
                    break;
                case 2:
                    r6 = PhotoAttachment.Fb(jSONObject);
                    break;
                case 3:
                    Serializer.c<PendingPhotoAttachment> cVar = PendingPhotoAttachment.CREATOR;
                    attachment2 = new PendingPhotoAttachment(jSONObject.optString("file_uri"));
                    r6 = attachment2;
                    break;
                case 4:
                    Serializer.c<AudioAttachment> cVar2 = AudioAttachment.CREATOR;
                    attachment = new AudioAttachment(new MusicTrack(jSONObject.optJSONObject("track")));
                    r6 = attachment;
                    break;
                case 5:
                    r6 = VideoAttachment.Gb(jSONObject);
                    break;
                case 6:
                    Serializer.c<PendingVideoAttachment> cVar3 = PendingVideoAttachment.CREATOR;
                    attachment2 = new PendingVideoAttachment(com.vk.dto.common.c.b(jSONObject.optJSONObject("video")), VideoSave.Target.POST, obr.g().a().y());
                    r6 = attachment2;
                    break;
                case 7:
                    Serializer.c<DocumentAttachment> cVar4 = DocumentAttachment.CREATOR;
                    attachment = new DocumentAttachment(new Document(jSONObject.optJSONObject("doc")));
                    r6 = attachment;
                    break;
                case 8:
                    Serializer.c<PendingDocumentAttachment> cVar5 = PendingDocumentAttachment.CREATOR;
                    attachment = new PendingDocumentAttachment(new Document(jSONObject.optJSONObject("doc")));
                    r6 = attachment;
                    break;
                case 9:
                    Serializer.c<PollAttachment> cVar6 = PollAttachment.CREATOR;
                    try {
                        if (jSONObject.has("poll")) {
                            Serializer.c<Poll> cVar7 = Poll.CREATOR;
                            poll = Poll.a.b(jSONObject.getJSONObject("poll"));
                        } else {
                            Serializer.c<Poll> cVar8 = Poll.CREATOR;
                            poll = Poll.a.b(jSONObject);
                        }
                    } catch (JSONException e) {
                        L.i(e);
                        poll = null;
                    }
                    if (poll == null) {
                        break;
                    } else {
                        attachment2 = new PollAttachment(poll);
                        r6 = attachment2;
                        break;
                    }
                case 10:
                    r6 = y64.i(jSONObject);
                    break;
                case 11:
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = MarketAttachment.g;
                    JSONObject optJSONObject = jSONObject.optJSONObject(NetworkClass.GOOD);
                    if (optJSONObject != null) {
                        try {
                            good = new Good(optJSONObject, null);
                        } catch (JSONException e2) {
                            com.vk.metrics.eventtracking.b.a.a(e2);
                            good = null;
                        }
                        attachment = new MarketAttachment(good);
                        r6 = attachment;
                        break;
                    }
                    break;
                case 13:
                    r6 = AlbumAttachment.Jb(jSONObject);
                    break;
                case 14:
                    Serializer.c<ArticleAttachment> cVar9 = ArticleAttachment.CREATOR;
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("article");
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("owner");
                    Serializer.c<Owner> cVar10 = Owner.CREATOR;
                    attachment2 = new ArticleAttachment(vj90.a(optJSONObject2, Owner.a.c(optJSONObject3)));
                    r6 = attachment2;
                    break;
                case 15:
                    Serializer.c<MarketLinkAttachment> cVar11 = MarketLinkAttachment.CREATOR;
                    String optString = jSONObject.optString("author");
                    if (optString.length() > 0) {
                        r6 = new MarketLinkAttachment(optString, jSONObject.optString("url"));
                        break;
                    }
                    break;
                case 16:
                    try {
                        Serializer.c<MarketMessageOwnerAttachment> cVar12 = MarketMessageOwnerAttachment.CREATOR;
                        String optString2 = jSONObject.optString("owner_title");
                        if (optString2.length() > 0) {
                            attachment2 = new MarketMessageOwnerAttachment(r6, optString2, 1, r6);
                            r6 = attachment2;
                            break;
                        }
                    } catch (Exception e3) {
                        L.i(e3);
                        break;
                    }
                    break;
            }
            if (r6 != 0) {
                arrayList.add(r6);
            }
        }
        return arrayList;
    }
}

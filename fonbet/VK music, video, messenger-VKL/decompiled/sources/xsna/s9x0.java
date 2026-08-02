package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.log.L;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: WallLike.java */
/* loaded from: classes4.dex */
public final class s9x0 extends rsg0<t9x0> {

    @Nullable
    public ReactionSet s;

    public s9x0(boolean z, @Nullable Integer num, UserId userId, int i, int i2, int i3, String str, @Nullable UserId userId2, @Nullable String str2) {
        super(z ? "likes.add" : "likes.delete");
        String str3;
        this.s = null;
        if (z && num != null) {
            C(num.intValue(), "reaction_id");
        }
        if (i2 == 3) {
            F(userId, "owner_id");
            C(i, "post_id");
            K("type", "post_ads");
            C(i, "item_id");
        } else if (i2 == 0) {
            F(userId, "owner_id");
            C(i, "item_id");
            K("type", "post");
        } else if (i2 == 1) {
            K("type", "photo");
            F(userId, "owner_id");
            C(i, "item_id");
            if (!TextUtils.isEmpty(str)) {
                K("access_key", str);
            }
        } else if (i2 == 2 || i2 == 6) {
            K("type", "video");
            F(userId, "owner_id");
            C(i, "item_id");
            if (!TextUtils.isEmpty(str)) {
                K("access_key", str);
            }
        } else if (i2 == 4) {
            if (i3 != 1) {
                if (i3 == 2 || i3 == 6) {
                    if (str2 != null) {
                        K("screen_mode", str2);
                    }
                    str3 = "video_";
                } else if (i3 != 9) {
                    str3 = "";
                }
                K("type", str3.concat("comment"));
                F(userId, "owner_id");
                C(i, "item_id");
            }
            str3 = "photo_";
            K("type", str3.concat("comment"));
            F(userId, "owner_id");
            C(i, "item_id");
        }
        if (userId2 == null || !fkq0.c(userId2)) {
            return;
        }
        F(userId2, "group_id");
    }

    public static s9x0 F0(c6z c6zVar, boolean z, @Nullable Integer num, String str) {
        VideoAttachment Nb;
        PhotoAttachment Mb;
        Integer num2;
        if (!(c6zVar instanceof Post)) {
            if (c6zVar instanceof PromoPost) {
                Post post = ((PromoPost) c6zVar).n;
                s9x0 s9x0Var = new s9x0(z, num, post.m, post.n, 3, -1, "", UserId.d, null);
                if (!TextUtils.isEmpty(str)) {
                    s9x0Var.K("track_code", str);
                }
                return s9x0Var;
            }
            if ((c6zVar instanceof Photos) && (Mb = ((Photos) c6zVar).Mb()) != null) {
                Photo photo = Mb.l;
                return new s9x0(z, num, photo.e, photo.c, 1, -1, photo.v, UserId.d, null);
            }
            if (!(c6zVar instanceof Videos) || (Nb = ((Videos) c6zVar).Nb()) == null) {
                return null;
            }
            VideoFile videoFile = Nb.k;
            s9x0 s9x0Var2 = new s9x0(z, num, videoFile.I0(), videoFile.o0(), 2, -1, videoFile.C1(), UserId.d, null);
            if (!TextUtils.isEmpty(str)) {
                s9x0Var2.K("track_code", str);
            }
            return s9x0Var2;
        }
        Post post2 = (Post) c6zVar;
        if (post2.hc() && (num2 = post2.u) != null) {
            s9x0 s9x0Var3 = new s9x0(z, num, post2.m, num2.intValue(), 4, -1, "", UserId.d, null);
            if (!TextUtils.isEmpty(str)) {
                s9x0Var3.K("track_code", str);
            }
            return s9x0Var3;
        }
        EntryAttachment entryAttachment = null;
        if (!post2.lc()) {
            return H0(post2, z, num, str);
        }
        ArrayList<EntryAttachment> arrayList = post2.z;
        if (arrayList.size() > 0) {
            entryAttachment = arrayList.get(0);
        }
        EntryAttachment entryAttachment2 = entryAttachment;
        if (entryAttachment2 == null) {
            L.l("Can't like post as market because it does not satisfy the contract: " + post2);
            return H0(post2, z, num, str);
        }
        Attachment attachment = entryAttachment2.b;
        if (arrayList.size() != 1 || !(attachment instanceof MarketAttachment)) {
            L.l("Can't like post as market because it does not satisfy the contract: " + post2);
            return H0(post2, z, num, str);
        }
        Good good = ((MarketAttachment) attachment).f;
        s9x0 s9x0Var4 = new s9x0(z ? "likes.add" : "likes.delete");
        s9x0Var4.s = null;
        s9x0Var4.K("type", "market");
        s9x0Var4.D(good.b, "item_id");
        s9x0Var4.F(good.c, "owner_id");
        if (z && num != null) {
            s9x0Var4.C(num.intValue(), "reaction_id");
        }
        return s9x0Var4;
    }

    public static s9x0 H0(Post post, boolean z, @Nullable Integer num, String str) {
        s9x0 s9x0Var = new s9x0(z, num, post.m, post.n, 0, -1, "", UserId.d, null);
        if (!TextUtils.isEmpty(str)) {
            s9x0Var.K("track_code", str);
        }
        return s9x0Var;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            int i = jSONObject2.getInt("likes");
            int optInt = jSONObject2.optInt("reposts", -1);
            jSONObject2.optInt("reposted_post_id", -1);
            return new t9x0(i, optInt, tci.p(jSONObject2, this.s), jSONObject2.optBoolean("suggest_subscribe", false));
        } catch (Exception e) {
            L.i(e);
            return null;
        }
    }
}

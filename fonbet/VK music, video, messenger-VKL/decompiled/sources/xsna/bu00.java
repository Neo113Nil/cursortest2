package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.ByteString;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketCommunityReviewFriendDto;
import com.vk.articles.ArticleFragment;
import com.vk.articles.api.preload.QueryParameters;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.ecomm.reviews.model.reviewfriends.ReviewFriendsModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: MarketButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class bu00 implements iz20, ksn0 {
    public static final jai b = new jai(1034956784, new xbi(), false);

    public static final ReviewFriendsModel a(MarketCommunityReviewFriendDto marketCommunityReviewFriendDto) {
        String str;
        UserId e = marketCommunityReviewFriendDto.e();
        String str2 = marketCommunityReviewFriendDto.f() + ' ' + marketCommunityReviewFriendDto.d();
        Integer n = marketCommunityReviewFriendDto.n();
        int intValue = n != null ? n.intValue() : 0;
        String k = marketCommunityReviewFriendDto.k();
        if (k == null || (str = k.concat("&cs=72x0")) == null) {
            str = "";
        }
        return new ReviewFriendsModel(e, str2, intValue, str, marketCommunityReviewFriendDto.l());
    }

    public static final int b(List list, Class cls) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getClass() == cls) {
                i++;
            }
        }
        return i;
    }

    public static final q630 c(q630 q630Var, izs izsVar) {
        return q630Var.g(new mho(izsVar));
    }

    public static final q630 e(q630 q630Var, izs izsVar) {
        return q630Var.g(new ljo(izsVar));
    }

    public static final q630 f(q630 q630Var, izs izsVar) {
        return q630Var.g(new mjo(izsVar));
    }

    public static String i(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte c = byteString.c(i);
            if (c == 34) {
                sb.append("\\\"");
            } else if (c == 39) {
                sb.append("\\'");
            } else if (c != 92) {
                switch (c) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (c < 32 || c > 126) {
                            sb.append('\\');
                            sb.append((char) (((c >>> 6) & 3) + 48));
                            sb.append((char) (((c >>> 3) & 7) + 48));
                            sb.append((char) ((c & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final Pair j() {
        VKTheme C = dhr0.C();
        dhr0.a.getClass();
        ehr0 ehr0Var = dhr0.e;
        VKTheme vKTheme = ehr0Var.a;
        VKTheme vKTheme2 = ehr0Var.b;
        return (C.equals(vKTheme) || C.equals(vKTheme2)) ? new Pair(ehr0Var.a, vKTheme2) : new Pair(dhr0.z(), dhr0.u());
    }

    public static final Object k(kzw kzwVar) {
        return kzwVar.getValue();
    }

    public static final boolean l(qtd0 qtd0Var) {
        return qtd0Var.ka() || qtd0Var.H7() || qtd0Var.C6();
    }

    public static final void m(eik0 eik0Var, Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("performance_reporter_skip_measuring", false)) {
            return;
        }
        eik0Var.b();
    }

    public static final void o(Bundle bundle) {
        bundle.putBoolean("performance_reporter_skip_measuring", true);
    }

    public static Flags p(JSONObject jSONObject) {
        String optString;
        JSONObject optJSONObject;
        Flags flags = new Flags(0L, 1 == true ? 1 : 0, null);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("comments");
        if (optJSONObject2 != null) {
            flags.Ab(2L, optJSONObject2.optInt("can_post", 1) == 1);
            flags.Ab(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, optJSONObject2.optBoolean("groups_can_post", false));
            flags.Ab(16777216L, optJSONObject2.optInt("can_open", 0) == 1);
            flags.Ab(33554432L, optJSONObject2.optInt("can_close", 0) == 1);
            flags.Ab(4294967296L, optJSONObject2.optInt("can_view", 1) == 1);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("likes");
        if (optJSONObject3 != null) {
            flags.Ab(1L, optJSONObject3.optInt("can_publish") == 1);
            flags.Ab(8L, optJSONObject3.optInt("user_likes") == 1);
            flags.Ab(274877906944L, optJSONObject3.optBoolean("repost_disabled", false));
        }
        if (!flags.zb(1L) && (optJSONObject = jSONObject.optJSONObject("reposts")) != null) {
            flags.Ab(1L, optJSONObject.optInt("user_reposted") == 1);
        }
        flags.Ab(128L, jSONObject.optInt("can_edit") == 1);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("push_subscription");
        if (optJSONObject4 != null) {
            flags.Ab(PlaybackStateCompat.ACTION_SET_REPEAT_MODE, true);
            flags.Ab(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, optJSONObject4.optBoolean("is_subscribed"));
        }
        flags.Ab(64L, jSONObject.optInt("can_delete") == 1);
        flags.Ab(512L, jSONObject.optInt("friends_only") == 1);
        flags.Ab(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, jSONObject.optInt("can_pin") == 1);
        flags.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, jSONObject.optInt("is_pinned") == 1);
        if (!flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
            flags.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, jSONObject.optInt("fixed") == 1);
        }
        flags.Ab(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, jSONObject.optInt("final_post") == 1);
        String optString2 = jSONObject.optString("post_type");
        if ("postpone".equals(optString2)) {
            flags.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, true);
            flags.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_URI, jSONObject.optInt("twitter_export") == 1);
            flags.Ab(PlaybackStateCompat.ACTION_PREPARE, jSONObject.optInt("facebook_export") == 1);
        }
        flags.Ab(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, "suggest".equals(optString2));
        flags.Ab(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, "draft".equals(optString2));
        JSONObject optJSONObject5 = jSONObject.optJSONObject("post_source");
        if (optJSONObject5 != null && (optString = optJSONObject5.optString("data")) != null && optString.equals("profile_photo")) {
            flags.Ab(256L, true);
        }
        if (jSONObject.has("suggest_subscribe")) {
            flags.Ab(PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED, true);
        }
        if (jSONObject.optBoolean("trending")) {
            flags.Ab(8388608L, true);
        }
        if (jSONObject.optBoolean("is_favorite")) {
            flags.Ab(67108864L, true);
        }
        flags.Ab(536870912L, jSONObject.optInt("can_view_stats") == 1);
        flags.Ab(134217728L, jSONObject.optBoolean("is_archived", false));
        flags.Ab(268435456L, jSONObject.optBoolean("can_archive", false));
        flags.Ab(16L, jSONObject.optBoolean("can_doubt_category", false));
        JSONObject optJSONObject6 = jSONObject.optJSONObject("donut");
        if (optJSONObject6 != null) {
            flags.Ab(1073741824L, optJSONObject6.optBoolean("can_publish_free_copy", false));
        }
        flags.Ab(2147483648L, jSONObject.optInt("best_friends_only") == 1);
        flags.Ab(8589934592L, jSONObject.optBoolean("can_ignore", false));
        flags.Ab(34359738368L, jSONObject.optBoolean("hide_likes", false));
        flags.Ab(281474976710656L, jSONObject.has("is_added_to_main_tab"));
        flags.Ab(562949953421312L, jSONObject.optBoolean("is_added_to_main_tab", false));
        flags.Ab(1125899906842624L, jSONObject.optBoolean("ads_easy_promote_three_dots", false));
        return flags;
    }

    public static void q(TextView textView, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setText("");
        } else {
            ucp ucpVar = ucp.a;
            textView.setText(ucp.j(charSequence, null));
        }
    }

    public static boolean r(Context context, Article article, SnippetAttachment snippetAttachment, QueryParameters queryParameters, String str, boolean z) {
        if (!article.g() && !article.k()) {
            cvk.u(article.i() ? R.string.article_banned : article.Q8() ? R.string.article_protected : article.j() ? R.string.article_deleted : R.string.error, false);
            return false;
        }
        int i = ArticleFragment.E0;
        Activity h = e3m.h(context);
        if (h != null) {
            HashSet hashSet = iah0.a;
            if (!fnj.d(h) && !iah0.n(h)) {
                p90.d(h);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("article", article);
        bundle.putInt("theme", R.style.WhiteTheme);
        bundle.putBoolean("from_web_event", false);
        bundle.putBoolean("start_tts_playing", z);
        if (snippetAttachment != null) {
            bundle.putParcelable("parent_snippet", snippetAttachment);
        }
        if (queryParameters != null) {
            bundle.putParcelable("query_parameters", queryParameters);
        }
        if (str != null) {
            bundle.putString("track_code", str);
        }
        oz50 oz50Var = new oz50(ArticleFragment.class, null, bundle);
        oz50Var.s(true);
        oz50Var.k(context);
        return true;
    }

    public static /* synthetic */ void s(Context context, Article article, QueryParameters queryParameters, int i) {
        if ((i & 8) != 0) {
            queryParameters = null;
        }
        r(context, article, null, queryParameters, null, false);
    }

    public static final Image t(List list) {
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        return new Image(arrayList);
    }

    public static final String u(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    @Override // xsna.ksn0
    public Integer d() {
        return Integer.valueOf(R.string.video_tab_filter);
    }

    @Override // xsna.ksn0
    public Integer g() {
        return null;
    }

    @Override // xsna.ksn0
    public Integer h() {
        return Integer.valueOf(R.drawable.vk_icon_video_square_outline_20);
    }

    @Override // xsna.iz20
    public void n(dw20 dw20Var) {
        Dialog dialog = dw20Var.s;
        dhr0.u0(dialog != null ? dialog.getWindow() : null, NavigationBarStyle.DARK);
    }
}

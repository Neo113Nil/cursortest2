package xsna;

import android.graphics.Color;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.D1;
import com.ironsource.Y3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachCurator;
import com.vk.dto.attaches.AttachDeleted;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachMarketRejectInfo;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachUnsupported;
import com.vk.dto.attaches.AttachWidget;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.attaches.Merchant;
import com.vk.dto.attaches.Product;
import com.vk.dto.attaches.VideoPreview;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Currency;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.gift.Animation;
import com.vk.dto.common.gift.GiftAnimation;
import com.vk.dto.common.gift.GiftBackground;
import com.vk.dto.common.gift.GiftBaseUrlConfig;
import com.vk.dto.common.gift.GiftCard;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.common.gift.GiftSticker;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.GiftVotesAttachment;
import com.vk.dto.common.gift.ImageStatus;
import com.vk.dto.common.gift.ImageStatusPack;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.music.Genre;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.nft.NftMeta;
import com.vk.dto.polls.Poll;
import com.vk.dto.stereo.StereoRoom;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.ButtonActionType;
import com.vk.im.engine.models.CallState;
import com.vk.im.engine.models.LinkTarget;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AMP;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
import com.vk.im.engine.models.attaches.AttachGroupCallFinished;
import com.vk.im.engine.models.attaches.AttachGroupCallInProgress;
import com.vk.im.engine.models.attaches.AttachHighlight;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachRoom;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.AuthorAd;
import com.vk.im.engine.models.attaches.ButtonIconType;
import com.vk.im.engine.models.attaches.CallParticipants;
import com.vk.im.engine.models.attaches.ImageScaleType;
import com.vk.im.engine.models.attaches.VmojiAttach;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniAppButton;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.attaches.miniapp.UserStack;
import com.vk.im.engine.models.content.PodcastEpisode;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.users.User;
import com.vk.log.L;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.aay;

/* compiled from: AttachApiParser.kt */
/* loaded from: classes2.dex */
public final class w04 {

    /* compiled from: AttachApiParser.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static AttachWallReply A(JSONObject jSONObject) {
        Integer N;
        AttachWallReply attachWallReply = new AttachWallReply();
        attachWallReply.b = 0;
        attachWallReply.c = AttachSyncState.DONE;
        attachWallReply.e = jSONObject.optInt("id", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("parents_stack");
        attachWallReply.f = (optJSONArray == null || (N = rl3.N(f370.I(optJSONArray))) == null) ? 0 : N.intValue();
        attachWallReply.g = jSONObject.optInt("post_id", 0);
        UserId userId = new UserId(jSONObject.optLong("owner_id", 0L));
        attachWallReply.d = userId;
        attachWallReply.h = esv.b(userId);
        attachWallReply.i = esv.a(attachWallReply.d).b;
        attachWallReply.j = jSONObject.optString("text", "");
        attachWallReply.k = jSONObject.optString("access_key", "");
        return attachWallReply;
    }

    public static AttachCurator B(JSONObject jSONObject) {
        ImageList imageList;
        if (jSONObject.has("photo")) {
            Set<ImageSizeKey> set = plw.a;
            imageList = plw.a(jSONObject.getJSONArray("photo"), plw.a);
        } else {
            imageList = new ImageList(null, 1, null);
        }
        return new AttachCurator(jSONObject.optString("id"), jSONObject.optString("name"), imageList, jSONObject.optString("url"), null, 0, null, 112, null);
    }

    public static AttachImage C(JSONObject jSONObject) {
        ImageList c;
        AttachImage attachImage = new AttachImage();
        attachImage.b = 0;
        attachImage.c = AttachSyncState.DONE;
        attachImage.e = jSONObject.getLong("id");
        attachImage.o = jSONObject.getInt("album_id");
        attachImage.d = new UserId(jSONObject.getLong("owner_id"));
        long j = attachImage.d.b;
        if (jSONObject.has("user_id")) {
            j = jSONObject.getLong("user_id");
        }
        UserId userId = new UserId(j);
        attachImage.p = userId;
        if (userId.b == 100) {
            attachImage.p = attachImage.d;
        }
        attachImage.k = jSONObject.optLong("date", 0L) * 1000;
        boolean has = jSONObject.has("sizes");
        if (has) {
            Set<ImageSizeKey> set = plw.a;
            c = plw.a(jSONObject.getJSONArray("sizes"), plw.a);
        } else {
            if (has) {
                throw new NoWhenBranchMatchedException();
            }
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            c = ImageList.a.c(400, 400, "https://" + a0a.d + "/images/camera_400.png");
        }
        attachImage.q = c;
        NftMeta nftMeta = null;
        attachImage.r = new ImageList(null, 1, null);
        attachImage.s = jSONObject.optString("text", "");
        attachImage.t = jSONObject.optString("access_key", "");
        JSONObject optJSONObject = jSONObject.optJSONObject("restrictions");
        PhotoRestriction photoRestriction = optJSONObject != null ? (PhotoRestriction) PhotoRestriction.f.a(optJSONObject) : null;
        attachImage.v = photoRestriction;
        attachImage.u = photoRestriction != null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("nft");
        if (optJSONObject2 != null) {
            Serializer.c<NftMeta> cVar2 = NftMeta.CREATOR;
            nftMeta = NftMeta.a.a(optJSONObject2);
        }
        attachImage.w = nftMeta;
        attachImage.x = jSONObject.optBoolean("is_donut", false);
        attachImage.y = f370.D(jSONObject, "blur_mask");
        attachImage.z = f370.z(jSONObject, "blurred_id");
        return attachImage;
    }

    public static AttachPodcastEpisode D(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("podcast_info");
        int optInt = jSONObject.optInt("id", 0);
        UserId userId = new UserId(jSONObject.optLong("owner_id", 0L));
        String optString = jSONObject.optString("artist", "");
        String optString2 = jSONObject.optString("title", "");
        int optInt2 = jSONObject.optInt("content_restricted", 0);
        MusicTrack.AssistantData assistantData = null;
        String optString3 = optJSONObject3 != null ? optJSONObject3.optString("restriction_description") : null;
        LinkButton linkButton = (optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("restriction_button")) == null) ? null : new LinkButton(optJSONObject2);
        Image image = (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("cover")) == null || (optJSONArray = optJSONObject.optJSONArray("sizes")) == null) ? null : new Image(optJSONArray, null, 2, null);
        boolean optBoolean = optJSONObject3 != null ? optJSONObject3.optBoolean("is_donut") : false;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("audio_voice_assistant");
        if (optJSONObject4 != null) {
            Serializer.c<MusicTrack.AssistantData> cVar = MusicTrack.AssistantData.CREATOR;
            assistantData = MusicTrack.AssistantData.a.a(optJSONObject4);
        }
        return new AttachPodcastEpisode(0, null, new PodcastEpisode(optInt, userId, optString, optString2, optInt2, optString3, linkButton, image, optBoolean, assistantData), 3, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x03c0 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:17:0x0076, B:20:0x0081, B:23:0x0089, B:5:0x03c0, B:7:0x03cd, B:24:0x00af, B:27:0x00b7, B:28:0x00c1, B:31:0x00c9, B:32:0x00d3, B:35:0x00db, B:36:0x00e5, B:39:0x00ed, B:40:0x00f7, B:43:0x00ff, B:44:0x0127, B:47:0x012f, B:48:0x0139, B:51:0x0141, B:52:0x014b, B:55:0x0153, B:56:0x015d, B:59:0x0165, B:61:0x0188, B:62:0x018e, B:64:0x01a6, B:67:0x01ae, B:68:0x01be, B:71:0x01c6, B:72:0x01d0, B:75:0x01da, B:76:0x01e4, B:79:0x01ee, B:80:0x0201, B:83:0x020b, B:84:0x0215, B:87:0x021f, B:88:0x0229, B:91:0x0233, B:92:0x0239, B:95:0x0243, B:96:0x024d, B:99:0x0257, B:100:0x0261, B:103:0x026b, B:104:0x0275, B:107:0x027f, B:109:0x028f, B:110:0x0291, B:111:0x02b6, B:114:0x02c0, B:115:0x02ca, B:118:0x02d4, B:119:0x02de, B:122:0x02e8, B:123:0x02f2, B:126:0x02fc, B:127:0x0311, B:130:0x031b, B:131:0x0325, B:134:0x032f, B:135:0x0339, B:138:0x0343, B:139:0x034e, B:142:0x0357, B:143:0x0360, B:146:0x0369, B:147:0x0372, B:150:0x037b, B:151:0x0380, B:154:0x0389, B:155:0x0392, B:158:0x039b, B:3:0x03a4), top: B:16:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x03cd A[Catch: Exception -> 0x00ac, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ac, blocks: (B:17:0x0076, B:20:0x0081, B:23:0x0089, B:5:0x03c0, B:7:0x03cd, B:24:0x00af, B:27:0x00b7, B:28:0x00c1, B:31:0x00c9, B:32:0x00d3, B:35:0x00db, B:36:0x00e5, B:39:0x00ed, B:40:0x00f7, B:43:0x00ff, B:44:0x0127, B:47:0x012f, B:48:0x0139, B:51:0x0141, B:52:0x014b, B:55:0x0153, B:56:0x015d, B:59:0x0165, B:61:0x0188, B:62:0x018e, B:64:0x01a6, B:67:0x01ae, B:68:0x01be, B:71:0x01c6, B:72:0x01d0, B:75:0x01da, B:76:0x01e4, B:79:0x01ee, B:80:0x0201, B:83:0x020b, B:84:0x0215, B:87:0x021f, B:88:0x0229, B:91:0x0233, B:92:0x0239, B:95:0x0243, B:96:0x024d, B:99:0x0257, B:100:0x0261, B:103:0x026b, B:104:0x0275, B:107:0x027f, B:109:0x028f, B:110:0x0291, B:111:0x02b6, B:114:0x02c0, B:115:0x02ca, B:118:0x02d4, B:119:0x02de, B:122:0x02e8, B:123:0x02f2, B:126:0x02fc, B:127:0x0311, B:130:0x031b, B:131:0x0325, B:134:0x032f, B:135:0x0339, B:138:0x0343, B:139:0x034e, B:142:0x0357, B:143:0x0360, B:146:0x0369, B:147:0x0372, B:150:0x037b, B:151:0x0380, B:154:0x0389, B:155:0x0392, B:158:0x039b, B:3:0x03a4), top: B:16:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Attach E(JSONObject jSONObject, f1e0 f1e0Var) {
        Attach attach;
        String optString = jSONObject.optString("type", "");
        if (optString != null) {
            try {
                switch (optString.hashCode()) {
                    case -2000418763:
                        if (!optString.equals("wall_reply")) {
                            break;
                        } else {
                            attach = A(jSONObject.getJSONObject("wall_reply"));
                            break;
                        }
                    case -1890252483:
                        if (!optString.equals("sticker")) {
                            break;
                        } else {
                            attach = u(jSONObject.getJSONObject("sticker"));
                            break;
                        }
                    case -1409097913:
                        if (!optString.equals("artist")) {
                            break;
                        } else {
                            attach = e(jSONObject);
                            break;
                        }
                    case -1359492551:
                        if (!optString.equals("mini_app")) {
                            break;
                        } else {
                            attach = s(jSONObject.getJSONObject("mini_app"));
                            break;
                        }
                    case -1313337277:
                        if (!optString.equals("video_message")) {
                            break;
                        } else {
                            attach = y(jSONObject.getJSONObject("video_message"), f1e0Var);
                            break;
                        }
                    case -1165870106:
                        if (!optString.equals("question")) {
                            break;
                        } else {
                            attach = new AttachQuestion(jSONObject.getJSONObject("question"));
                            break;
                        }
                    case -1081306052:
                        if (!optString.equals("market")) {
                            break;
                        } else {
                            attach = r(jSONObject.getJSONObject("market"));
                            break;
                        }
                    case -932326641:
                        if (!optString.equals("ugc_sticker")) {
                            break;
                        } else {
                            attach = w(jSONObject.getJSONObject("ugc_sticker"));
                            break;
                        }
                    case -788047292:
                        if (!optString.equals("widget")) {
                            break;
                        } else {
                            attach = new AttachWidget(jSONObject.getJSONObject("widget").toString(), 0, null, null, 14, null);
                            break;
                        }
                    case -732377866:
                        if (!optString.equals("article")) {
                            break;
                        } else {
                            attach = f(jSONObject.getJSONObject("article"));
                            break;
                        }
                    case -578391861:
                        if (!optString.equals("channel_message")) {
                            break;
                        } else {
                            attach = i(jSONObject.getJSONObject("channel_message"), f1e0Var);
                            break;
                        }
                    case -405568764:
                        if (!optString.equals("podcast")) {
                            break;
                        } else {
                            attach = D(jSONObject.getJSONObject("podcast"));
                            break;
                        }
                    case -147294874:
                        if (!optString.equals("group_call_in_progress")) {
                            break;
                        } else {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("group_call_in_progress");
                            CallParticipants a2 = m89.a(jSONObject2.optJSONObject(SignalingProtocol.KEY_PARTICIPANTS), f1e0Var);
                            if (a2 == null) {
                                a2 = CallParticipants.d;
                            }
                            CallParticipants callParticipants = a2;
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            attach = new AttachGroupCallInProgress(0, null, null, callParticipants, Peer.a.b(jSONObject2.getLong("initiator_id")), f370.D(jSONObject2, ApiProtocol.KEY_JOIN_LINK), f370.D(jSONObject2, "vk_join_link"), 7, null);
                            break;
                        }
                    case -81138070:
                        if (!optString.equals("channel_stub")) {
                            break;
                        } else {
                            attach = j(jSONObject.getJSONObject("channel_stub"));
                            break;
                        }
                    case 99640:
                        if (!optString.equals("doc")) {
                            break;
                        } else {
                            attach = l(jSONObject.getJSONObject("doc"));
                            break;
                        }
                    case 3045982:
                        if (!optString.equals(NotificationCompat.CATEGORY_CALL)) {
                            break;
                        } else {
                            attach = h(jSONObject.getJSONObject(NotificationCompat.CATEGORY_CALL), f1e0Var);
                            break;
                        }
                    case 3172656:
                        if (!optString.equals("gift")) {
                            break;
                        } else {
                            attach = n(jSONObject);
                            break;
                        }
                    case 3321850:
                        if (!optString.equals("link")) {
                            break;
                        } else {
                            attach = p(jSONObject.getJSONObject("link"), f1e0Var);
                            break;
                        }
                    case 3446719:
                        if (!optString.equals("poll")) {
                            break;
                        } else {
                            attach = t(jSONObject.getJSONObject("poll"), f1e0Var);
                            break;
                        }
                    case 3506395:
                        if (!optString.equals(SignalingProtocol.KEY_ROOM)) {
                            break;
                        } else {
                            JSONObject jSONObject3 = jSONObject.getJSONObject(SignalingProtocol.KEY_ROOM);
                            Serializer.c<StereoRoom> cVar2 = StereoRoom.CREATOR;
                            attach = new AttachRoom(StereoRoom.a.a(jSONObject3, jgp.b));
                            break;
                        }
                    case 3641802:
                        if (!optString.equals("wall")) {
                            break;
                        } else {
                            attach = z(jSONObject.getJSONObject("wall"), f1e0Var);
                            break;
                        }
                    case 91412680:
                        if (!optString.equals("graffiti")) {
                            break;
                        } else {
                            attach = o(jSONObject.getJSONObject("graffiti"));
                            break;
                        }
                    case 93166550:
                        if (!optString.equals("audio")) {
                            break;
                        } else {
                            attach = new AttachAudio(new MusicTrack(jSONObject.getJSONObject("audio")));
                            break;
                        }
                    case 96891546:
                        if (!optString.equals(NotificationCompat.CATEGORY_EVENT)) {
                            break;
                        } else {
                            JSONObject jSONObject4 = jSONObject.getJSONObject(NotificationCompat.CATEGORY_EVENT);
                            long y = f370.y(jSONObject4, "id", 0L);
                            Serializer.c<Peer> cVar3 = Peer.CREATOR;
                            f1e0Var.c(Peer.a.b(y));
                            attach = new AttachEvent(0, null, Peer.a.c(y), null, (jSONObject4.has("time") ? jSONObject4.getInt("time") : 0) * 1000, jSONObject4.optString(RTCStatsConstants.KEY_ADDRESS), null, 75, null);
                            break;
                        }
                    case 106642994:
                        if (!optString.equals("photo")) {
                            break;
                        } else {
                            attach = C(jSONObject.getJSONObject("photo"));
                            break;
                        }
                    case 109770997:
                        if (!optString.equals("story")) {
                            break;
                        } else {
                            attach = v(jSONObject.getJSONObject("story"));
                            break;
                        }
                    case 112202875:
                        if (!optString.equals("video")) {
                            break;
                        } else {
                            attach = x(jSONObject.getJSONObject("video"), f1e0Var);
                            break;
                        }
                    case 190908443:
                        if (!optString.equals("audio_playlist")) {
                            break;
                        } else {
                            JSONObject jSONObject5 = jSONObject.getJSONObject("audio_playlist");
                            f1e0Var.c(com.vk.dto.common.a.a(new UserId(jSONObject5.optLong("owner_id"))));
                            attach = new AttachPlaylist(new Playlist(jSONObject5), 0, null, null, 0L, 30, null);
                            break;
                        }
                    case 753371668:
                        if (!optString.equals("app_action")) {
                            break;
                        } else {
                            attach = d(jSONObject.getJSONObject("app_action"));
                            break;
                        }
                    case 1126448022:
                        if (!optString.equals("curator")) {
                            break;
                        } else {
                            attach = B(jSONObject.getJSONObject("curator"));
                            break;
                        }
                    case 1316097182:
                        if (!optString.equals("audio_message")) {
                            break;
                        } else {
                            attach = g(jSONObject.getJSONObject("audio_message"));
                            break;
                        }
                    case 1370898167:
                        if (!optString.equals("donut_link")) {
                            break;
                        } else {
                            attach = m(jSONObject.getJSONObject("donut_link"), f1e0Var);
                            break;
                        }
                    case 1750452338:
                        if (!optString.equals("narrative")) {
                            break;
                        } else {
                            JSONObject jSONObject6 = jSONObject.getJSONObject("narrative");
                            long j = jSONObject6.getLong("owner_id");
                            Serializer.c<Peer> cVar4 = Peer.CREATOR;
                            f1e0Var.c(Peer.a.b(j));
                            Serializer.c<Narrative> cVar5 = Narrative.CREATOR;
                            attach = new AttachHighlight(Narrative.a.c(jSONObject6, null, null), 0, null, 6, null);
                            break;
                        }
                }
                if (attach != null) {
                    f1e0Var.c(com.vk.dto.common.a.a(attach.q()));
                }
                if (attach != null) {
                    return new AttachDeleted(0, AttachSyncState.DONE, UserId.d, a(optString));
                }
                return attach;
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.q(e);
                return new AttachDeleted(0, AttachSyncState.DONE, UserId.d, a(optString));
            }
        }
        AttachUnsupported attachUnsupported = new AttachUnsupported("Unknown attach: " + jSONObject);
        attachUnsupported.b = 0;
        attachUnsupported.c = AttachSyncState.DONE;
        attach = attachUnsupported;
        if (attach != null) {
        }
        if (attach != null) {
        }
    }

    public static void F(JSONObject jSONObject, f1e0 f1e0Var, List list) throws VKApiIllegalResponseException {
        if (jSONObject.has("geo")) {
            list.add(q(jSONObject.getJSONObject("geo")));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("attachments");
        if (optJSONArray != null) {
            List list2 = list;
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                list2.add(E(optJSONArray.getJSONObject(i), f1e0Var));
            }
        }
    }

    public static Owner G(Group group) {
        Object obj;
        UserId userId = new UserId(-group.b);
        String str = group.c;
        ImageList imageList = group.e;
        String Fb = imageList.Fb();
        Iterator it = imageList.Kb().b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ImageSize) obj).c7()) {
                break;
            }
        }
        ImageSize imageSize = (ImageSize) obj;
        String str2 = imageSize != null ? imageSize.d.d : null;
        VerifyInfo q9 = group.q9();
        List<com.vk.dto.common.im.Image> list = imageList.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (com.vk.dto.common.im.Image image : list) {
            String str3 = image.d;
            boolean z = image.e;
            arrayList.add(new ImageSize(str3, image.b, image.c, Boolean.valueOf(z), ImageSize.b.d(image.b, image.c, z), false, 32, null));
        }
        return new Owner(userId, str, str2, Fb, q9, new Image(arrayList), null, null, null, null, null, null, null, false, false, false, false, null, group.m, null, group.u, false, 2883520, null);
    }

    public static Owner H(User user) {
        Object obj;
        UserId userId = new UserId(user.b);
        String str = user.o + ' ' + user.p;
        ImageList imageList = user.h;
        String Fb = imageList.Fb();
        Iterator it = imageList.Kb().b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ImageSize) obj).c7()) {
                break;
            }
        }
        ImageSize imageSize = (ImageSize) obj;
        String str2 = imageSize != null ? imageSize.d.d : null;
        VerifyInfo verifyInfo = new VerifyInfo(user.l, false, false, false, false, false, 62, null);
        List<com.vk.dto.common.im.Image> list = imageList.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (com.vk.dto.common.im.Image image : list) {
            String str3 = image.d;
            boolean z = image.e;
            arrayList.add(new ImageSize(str3, image.b, image.c, Boolean.valueOf(z), ImageSize.b.d(image.b, image.c, z), false, 32, null));
        }
        return new Owner(userId, str, str2, Fb, verifyInfo, new Image(arrayList), user.s, null, null, user.F, user.g, user.o, user.p, false, false, false, false, null, 0, null, null, false, 4186496, null);
    }

    public static int a(String str) {
        switch (str.hashCode()) {
            case -2000418763:
                return !str.equals("wall_reply") ? 19 : 22;
            case -1890252483:
                return !str.equals("sticker") ? 19 : 17;
            case -1409097913:
                return !str.equals("artist") ? 19 : 24;
            case -1359492551:
                return !str.equals("mini_app") ? 19 : 28;
            case -1165870106:
                return !str.equals("question") ? 19 : 39;
            case -1081306052:
                return !str.equals("market") ? 19 : 12;
            case -732377866:
                return !str.equals("article") ? 19 : 1;
            case -578391861:
                return !str.equals("channel_message") ? 19 : 42;
            case -405568764:
                return !str.equals("podcast") ? 19 : 23;
            case -81138070:
                return !str.equals("channel_stub") ? 19 : 41;
            case 99640:
                return !str.equals("doc") ? 19 : 5;
            case 3045982:
                return !str.equals(NotificationCompat.CATEGORY_CALL) ? 19 : 4;
            case 3172656:
                return !str.equals("gift") ? 19 : 43;
            case 3321850:
                return !str.equals("link") ? 19 : 10;
            case 3446719:
                return !str.equals("poll") ? 19 : 16;
            case 3641802:
                return !str.equals("wall") ? 19 : 21;
            case 91412680:
                return !str.equals("graffiti") ? 19 : 8;
            case 93166550:
                return !str.equals("audio") ? 19 : 2;
            case 96891546:
                return !str.equals(NotificationCompat.CATEGORY_EVENT) ? 19 : 27;
            case 106642994:
                return !str.equals("photo") ? 19 : 9;
            case 109770997:
                return !str.equals("story") ? 19 : 18;
            case 112202875:
                return !str.equals("video") ? 19 : 20;
            case 190908443:
                return !str.equals("audio_playlist") ? 19 : 15;
            case 1316097182:
                return !str.equals("audio_message") ? 19 : 3;
            case 1370898167:
                return !str.equals("donut_link") ? 19 : 32;
            default:
                return 19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Attach attach, ProfilesSimpleInfo profilesSimpleInfo) {
        String str;
        ImageList C8;
        String name;
        String str2;
        ImageList C82;
        ImageList C83;
        String name2;
        Map map;
        ArrayList arrayList;
        VerifyInfo q9;
        Map map2;
        VerifyInfo q92;
        ImageList C84;
        com.vk.dto.common.im.Image image;
        String str3;
        ClipVideoFile clipVideoFile;
        Owner G;
        CoOwnerItem zb;
        ImageList C85;
        ArrayList arrayList2;
        Object obj;
        ImageList C86;
        LinkedHashMap linkedHashMap = profilesSimpleInfo.e;
        ?? r3 = profilesSimpleInfo.g;
        LinkedHashMap linkedHashMap2 = profilesSimpleInfo.b;
        if (profilesSimpleInfo.isEmpty()) {
            return;
        }
        PlaylistOwner playlistOwner = null;
        r6 = null;
        r6 = null;
        String str4 = null;
        r6 = null;
        r6 = null;
        Owner H = null;
        Article article = null;
        playlistOwner = null;
        if (!(attach instanceof AttachVideo)) {
            if (attach instanceof AttachVideoMsg) {
                VideoFile videoFile = ((AttachVideoMsg) attach).b;
                Object obj2 = (User) linkedHashMap2.get(Long.valueOf(videoFile.I0().b));
                Object obj3 = obj2;
                if (obj2 == null) {
                    obj3 = linkedHashMap.get(Long.valueOf(videoFile.I0().b));
                }
                User user = obj3 instanceof qtd0 ? (qtd0) obj3 : null;
                videoFile.N8(user != null ? user.name() : null);
                if (user != null && (C84 = user.C8()) != null && (image = (com.vk.dto.common.im.Image) ixj0.m(C84.b)) != null) {
                    str4 = image.d;
                }
                videoFile.F9(str4);
                videoFile.Z7();
                return;
            }
            if (attach instanceof AttachWall) {
                AttachWall attachWall = (AttachWall) attach;
                qtd0 zb2 = profilesSimpleInfo.zb(com.vk.dto.common.a.a(attachWall.f));
                attachWall.z = (zb2 == null || (q92 = zb2.q9()) == null) ? attachWall.z : q92.b;
                Iterator<T> it = attachWall.o.iterator();
                while (it.hasNext()) {
                    b((Attach) it.next(), profilesSimpleInfo);
                }
                return;
            }
            if (attach instanceof AttachHighlight) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                AttachHighlight attachHighlight = (AttachHighlight) attach;
                Peer b = Peer.a.b(attachHighlight.g.b);
                Peer.Type type = b.c;
                long j = b.d;
                int i = a.$EnumSwitchMapping$0[type.ordinal()];
                if (i == 1) {
                    User user2 = (User) linkedHashMap2.get(Long.valueOf(j));
                    if (user2 != null) {
                        H = H(user2);
                    }
                } else if (i != 2) {
                    L.G(yq.b(b, "Unsupported owner "));
                } else {
                    Group group = (Group) linkedHashMap.get(Long.valueOf(j));
                    if (group != null) {
                        H = G(group);
                    }
                }
                attachHighlight.b = Narrative.zb(attachHighlight.b, H, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                return;
            }
            if (attach instanceof AttachDonutLink) {
                AttachDonutLink attachDonutLink = (AttachDonutLink) attach;
                qtd0 zb3 = profilesSimpleInfo.zb(attachDonutLink.e);
                List<AttachDonutLink.Friend> list = attachDonutLink.l;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (AttachDonutLink.Friend friend : list) {
                        Long valueOf = Long.valueOf(friend.b);
                        Peer.Type type2 = Peer.Type.USER;
                        qtd0 qtd0Var = (type2 == null || (map2 = (Map) r3.get(type2)) == null) ? null : (qtd0) map2.get(valueOf);
                        ImageList C87 = qtd0Var != null ? qtd0Var.C8() : null;
                        if (C87 == null) {
                            C87 = null;
                        }
                        AttachDonutLink.Friend friend2 = C87 != null ? new AttachDonutLink.Friend(friend.b, C87) : null;
                        if (friend2 != null) {
                            arrayList.add(friend2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                attachDonutLink.f = zb3 != null ? zb3.name() : null;
                attachDonutLink.i = zb3 != null ? zb3.C8() : null;
                attachDonutLink.g = (zb3 == null || (q9 = zb3.q9()) == null) ? attachDonutLink.g : q9.b;
                attachDonutLink.l = arrayList;
                return;
            }
            if (attach instanceof AttachEvent) {
                AttachEvent attachEvent = (AttachEvent) attach;
                Long valueOf2 = Long.valueOf(com.vk.dto.common.a.a(attachEvent.d).d);
                Peer.Type type3 = Peer.Type.GROUP;
                qtd0 qtd0Var2 = (type3 == null || (map = (Map) r3.get(type3)) == null) ? null : (qtd0) map.get(valueOf2);
                attachEvent.e = qtd0Var2 != null ? qtd0Var2.name() : null;
                attachEvent.h = qtd0Var2 != null ? qtd0Var2.C8() : null;
                return;
            }
            if (attach instanceof AttachPoll) {
                AttachPoll attachPoll = (AttachPoll) attach;
                Poll poll = attachPoll.d;
                UserId userId = poll.r;
                if (!profilesSimpleInfo.isEmpty()) {
                    qtd0 Ab = profilesSimpleInfo.Ab(Long.valueOf(userId.b));
                    String str5 = (Ab == null || (name2 = Ab.name()) == null) ? "" : name2;
                    String Fb = (Ab == null || (C83 = Ab.C8()) == null) ? null : C83.Fb();
                    Owner owner = new Owner(userId, str5, null, Fb == null ? "" : Fb, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194292, null);
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put(userId, owner);
                    for (UserId userId2 : poll.u) {
                        qtd0 Ab2 = profilesSimpleInfo.Ab(Long.valueOf(userId2.b));
                        if (Ab2 == null || (str2 = Ab2.name()) == null) {
                            str2 = "";
                        }
                        String Fb2 = (Ab2 == null || (C82 = Ab2.C8()) == null) ? null : C82.Fb();
                        linkedHashMap3.put(userId2, new Owner(userId2, str2, null, Fb2 == null ? "" : Fb2, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194292, null));
                    }
                    poll = Poll.zb(poll, null, null, null, 0, 0L, false, null, linkedHashMap3, owner, 1048575);
                }
                attachPoll.d = poll;
                return;
            }
            if (!(attach instanceof AttachLink)) {
                if (attach instanceof AttachPlaylist) {
                    AttachPlaylist attachPlaylist = (AttachPlaylist) attach;
                    UserId userId3 = attachPlaylist.e;
                    qtd0 zb4 = profilesSimpleInfo.zb(com.vk.dto.common.a.a(userId3));
                    if (zb4 != null && (zb4.t1() || zb4.Va())) {
                        playlistOwner = new PlaylistOwner(userId3, zb4.name(), null, zb4.B3(), null, null, zb4.C8().Kb(), 52, null);
                    }
                    attachPlaylist.b.q = playlistOwner;
                    return;
                }
                return;
            }
            AttachLink attachLink = (AttachLink) attach;
            Article article2 = attachLink.v;
            if (article2 != null) {
                UserId userId4 = article2.c;
                qtd0 Ab3 = profilesSimpleInfo.Ab(Long.valueOf(userId4.b));
                String str6 = (Ab3 == null || (name = Ab3.name()) == null) ? "" : name;
                String Fb3 = (Ab3 == null || (C8 = Ab3.C8()) == null) ? null : C8.Fb();
                String str7 = Fb3 == null ? "" : Fb3;
                Group group2 = Ab3 instanceof Group ? (Group) Ab3 : null;
                article = Article.a(article2, new Owner(userId4, str6, null, str7, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, (group2 == null || (str = group2.u) == null) ? "" : str, false, 3145716, null), 1048511);
            }
            attachLink.v = article;
            return;
        }
        AttachVideo attachVideo = (AttachVideo) attach;
        if (attachVideo.b.s() != null) {
            return;
        }
        VideoFile videoFile2 = attachVideo.b;
        UserId I0 = ((AttachVideo) attach).b.I0();
        qtd0 zb5 = profilesSimpleInfo.zb(com.vk.dto.common.a.a(I0));
        String name3 = zb5 != null ? zb5.name() : null;
        String Fb4 = (zb5 == null || (C86 = zb5.C8()) == null) ? null : C86.Fb();
        if (zb5 != null && (C85 = zb5.C8()) != null && (arrayList2 = C85.Kb().b) != null) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((ImageSize) obj).c7()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ImageSize imageSize = (ImageSize) obj;
            if (imageSize != null) {
                str3 = imageSize.d.d;
                VerifyInfo q93 = zb5 == null ? zb5.q9() : null;
                boolean z = zb5 instanceof Group;
                Group group3 = !z ? (Group) zb5 : null;
                String str8 = group3 == null ? group3.u : null;
                Group group4 = !z ? (Group) zb5 : null;
                videoFile2.f1(new Owner(I0, name3, str3, Fb4, q93, null, null, null, null, null, null, null, null, false, false, false, false, null, group4 == null ? group4.m : 0, null, str8, false, 2883552, null));
                VideoFile videoFile3 = attachVideo.b;
                clipVideoFile = !(videoFile3 instanceof ClipVideoFile) ? (ClipVideoFile) videoFile3 : null;
                if (clipVideoFile == null) {
                    List<CoOwnerItem> list2 = clipVideoFile.N1;
                    ArrayList arrayList3 = new ArrayList();
                    for (CoOwnerItem coOwnerItem : list2) {
                        CoOwnerItem.StatusDto statusDto = coOwnerItem.c;
                        UserId userId5 = coOwnerItem.b;
                        if (statusDto != CoOwnerItem.StatusDto.PENDING) {
                            if (fkq0.d(userId5)) {
                                User user3 = (User) linkedHashMap2.get(Long.valueOf(userId5.b));
                                if (user3 != null) {
                                    G = H(user3);
                                    if (G != null) {
                                        zb = CoOwnerItem.zb(coOwnerItem, null, G, null, 27);
                                        if (zb == null) {
                                            arrayList3.add(zb);
                                        }
                                    }
                                }
                                G = null;
                                if (G != null) {
                                }
                            } else {
                                Group group5 = (Group) linkedHashMap.get(Long.valueOf(fkq0.a(userId5).b));
                                if (group5 != null) {
                                    G = G(group5);
                                    if (G != null) {
                                    }
                                }
                                G = null;
                                if (G != null) {
                                }
                            }
                        }
                        zb = null;
                        if (zb == null) {
                        }
                    }
                    attachVideo.b = ClipVideoFile.Kb(clipVideoFile, false, null, null, arrayList3, null, null, null, 8355839);
                    return;
                }
                return;
            }
        }
        str3 = null;
        if (zb5 == null) {
        }
        boolean z2 = zb5 instanceof Group;
        if (!z2) {
        }
        if (group3 == null) {
        }
        if (!z2) {
        }
        videoFile2.f1(new Owner(I0, name3, str3, Fb4, q93, null, null, null, null, null, null, null, null, false, false, false, false, null, group4 == null ? group4.m : 0, null, str8, false, 2883552, null));
        VideoFile videoFile32 = attachVideo.b;
        if (!(videoFile32 instanceof ClipVideoFile)) {
        }
        if (clipVideoFile == null) {
        }
    }

    public static CallState c(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 519990829) {
                if (hashCode != 1080382802) {
                    if (hashCode == 2125579825 && str.equals("canceled_by_receiver")) {
                        return CallState.DECLINED;
                    }
                } else if (str.equals("reached")) {
                    return CallState.DONE;
                }
            } else if (str.equals("canceled_by_initiator")) {
                return CallState.CANCELLED;
            }
        }
        return CallState.ERROR;
    }

    public static MiniAppSnippetDataAttach d(JSONObject jSONObject) {
        UserId userId;
        JSONObject optJSONObject = jSONObject.optJSONObject("application");
        UserStack userStack = null;
        ApiApplication apiApplication = optJSONObject != null ? new ApiApplication(optJSONObject) : null;
        String string = jSONObject.getString("type");
        String string2 = jSONObject.getString("title");
        String optString = jSONObject.optString("description");
        Set<ImageSizeKey> set = plw.a;
        ImageList a2 = plw.a(jSONObject.optJSONArray("icons"), plw.a);
        String optString2 = jSONObject.optString("button_text");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        long j = (apiApplication == null || (userId = apiApplication.b) == null) ? 0L : userId.b;
        Serializer.c<MiniAppSnippetDataAttach> cVar = MiniAppSnippetDataAttach.CREATOR;
        MiniAppSnippetDataAttach.Type type = MiniAppSnippetDataAttach.Type.GAME;
        if (!string.equals(type.h())) {
            type = MiniAppSnippetDataAttach.Type.APP;
        }
        MiniAppSnippetDataAttach.Type type2 = type;
        if (optJSONObject2 != null) {
            String string3 = optJSONObject2.getString("description");
            JSONArray jSONArray = optJSONObject2.getJSONArray("items");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getJSONObject(i).optJSONArray("items"));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JSONArray jSONArray2 = (JSONArray) it.next();
                Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                arrayList2.add(ImageList.a.d(jSONArray2));
            }
            userStack = new UserStack(string3, arrayList2);
        }
        return new MiniAppSnippetDataAttach(j, string2, type2, optString, optString2, null, apiApplication, a2, userStack, null, null, 0, null, null, 15872, null);
    }

    public static AttachArtist e(JSONObject jSONObject) {
        ImageList imageList;
        JSONObject jSONObject2 = jSONObject.getJSONObject("artist");
        if (jSONObject2.has("photo")) {
            Set<ImageSizeKey> set = plw.a;
            imageList = plw.a(jSONObject2.getJSONArray("photo"), plw.a);
        } else {
            imageList = new ImageList(null, 1, null);
        }
        ImageList imageList2 = imageList;
        List a2 = aay.a.a(jSONObject, "audios", MusicTrack.e0);
        if (a2 == null) {
            a2 = EmptyList.b;
        }
        List list = a2;
        List a3 = aay.a.a(jSONObject2, "genres", Genre.d);
        if (a3 == null) {
            a3 = EmptyList.b;
        }
        return new AttachArtist(jSONObject2.optString("id"), jSONObject2.optString("name"), imageList2, jSONObject2.optBoolean("is_album_cover"), null, 0, null, jSONObject2.optString("track_code"), jSONObject2.optBoolean("can_play"), list, a3, 112, null);
    }

    public static AttachArticle f(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject("photo");
        if (optJSONObject == null || (jSONArray = optJSONObject.optJSONArray("sizes")) == null) {
            jSONArray = new JSONArray();
        }
        AttachArticle attachArticle = new AttachArticle();
        attachArticle.b = 0;
        attachArticle.c = AttachSyncState.DONE;
        attachArticle.e = jSONObject.optLong("id", 0L);
        attachArticle.d = new UserId(jSONObject.optLong("owner_id", 0L));
        attachArticle.f = jSONObject.optString("state", "available");
        attachArticle.g = jSONObject.optString("title", "");
        attachArticle.h = jSONObject.optString("subtitle", "");
        attachArticle.i = jSONObject.optLong("published_date", 0L) * 1000;
        attachArticle.j = jSONObject.optString("url", "");
        attachArticle.k = jSONObject.optString("view_url", "");
        attachArticle.l = jSONObject.optBoolean("is_favorite", false);
        attachArticle.m = jSONObject.optInt("views", 0);
        attachArticle.n = plw.a(jSONArray, plw.a);
        attachArticle.o = jSONObject.optString("access_key", "");
        attachArticle.p = jSONObject.optBoolean("can_report", true);
        attachArticle.q = jSONObject.optBoolean("no_footer", false);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("donut");
        ArticleDonut articleDonut = null;
        ArticleDonut.Placeholder placeholder = null;
        if (optJSONObject2 != null) {
            boolean optBoolean = optJSONObject2.optBoolean("is_donut");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("placeholder");
            if (optJSONObject3 != null) {
                String optString = optJSONObject3.optString("text");
                String optString2 = optJSONObject3.optString("description");
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("button");
                placeholder = new ArticleDonut.Placeholder(optString, optString2, optJSONObject4 != null ? new LinkButton(optJSONObject4) : null);
            }
            articleDonut = new ArticleDonut(optBoolean, placeholder);
        }
        attachArticle.r = articleDonut;
        return attachArticle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static AttachAudioMsg g(JSONObject jSONObject) {
        int i;
        AttachAudioMsg attachAudioMsg = new AttachAudioMsg();
        attachAudioMsg.b = 0;
        attachAudioMsg.c = AttachSyncState.DONE;
        attachAudioMsg.e = jSONObject.getLong("id");
        attachAudioMsg.d = new UserId(jSONObject.getLong("owner_id"));
        attachAudioMsg.C0(jSONObject.getInt("duration"));
        JSONArray jSONArray = jSONObject.getJSONArray("waveform");
        byte[] bArr = new byte[jSONArray.length()];
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (jSONArray.getInt(i2) & 255);
        }
        attachAudioMsg.g = bArr;
        attachAudioMsg.h = jSONObject.getString("link_ogg");
        attachAudioMsg.i = jSONObject.getString("link_mp3");
        attachAudioMsg.l = jSONObject.has("transcript") ? jSONObject.getString("transcript") : "";
        String string = jSONObject.has("transcript_state") ? jSONObject.getString("transcript_state") : "unavailable";
        switch (string.hashCode()) {
            case -1715163493:
                if (string.equals("uninitialized")) {
                    i = -1;
                    break;
                }
                i = 0;
                break;
            case -753541113:
                if (string.equals("in_progress")) {
                    i = 1;
                    break;
                }
                i = 0;
                break;
            case -665462704:
                string.equals("unavailable");
                i = 0;
                break;
            case 3089282:
                if (string.equals("done")) {
                    i = 2;
                    break;
                }
                i = 0;
                break;
            default:
                i = 0;
                break;
        }
        attachAudioMsg.m = i;
        attachAudioMsg.n = jSONObject.has("transcript_update_time");
        attachAudioMsg.p = jSONObject.has("transcript_rate_enabled") ? jSONObject.getBoolean("transcript_rate_enabled") : false;
        attachAudioMsg.j = "";
        attachAudioMsg.k = jSONObject.optString("access_key", "");
        return attachAudioMsg;
    }

    public static AttachWithId h(JSONObject jSONObject, f1e0 f1e0Var) {
        CallParticipants a2 = m89.a(jSONObject.optJSONObject(SignalingProtocol.KEY_PARTICIPANTS), f1e0Var);
        if (a2 != null) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new AttachGroupCallFinished(0, null, null, a2, Peer.a.b(jSONObject.getLong("initiator_id")), c(jSONObject.getString("state")), jSONObject.optInt("duration", 0), 7, null);
        }
        AttachCall attachCall = new AttachCall();
        attachCall.b = 0;
        attachCall.c = AttachSyncState.DONE;
        attachCall.d = new UserId(jSONObject.optLong("owner_id", 0L));
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        attachCall.f = Peer.a.b(jSONObject.getLong("initiator_id"));
        attachCall.g = jSONObject.optInt("duration", 0);
        attachCall.h = jSONObject.optBoolean("video", false);
        attachCall.e = c(jSONObject.getString("state"));
        attachCall.i = jSONObject.optBoolean("has_social_connection");
        return attachCall;
    }

    public static AttachChannelMessage i(JSONObject jSONObject, f1e0 f1e0Var) {
        String str;
        String optString;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton;
        MsgFromChannel a2 = s1b.a(jSONObject, f1e0Var);
        JSONObject optJSONObject = jSONObject.optJSONObject("channel_info");
        MsgFromChannel.b bVar = a2.I;
        UserId userId = bVar.c;
        Peer peer = a2.O;
        long j = a2.d;
        String str2 = bVar.a;
        String zb = a2.T.zb();
        List<Attach> list = a2.E;
        MsgFromChannel.b bVar2 = a2.I;
        String str3 = bVar2.j;
        PostDonut postDonut = bVar2.g;
        ImageList imageList = null;
        Action action = (postDonut == null || (placeholder = postDonut.c) == null || (linkButton = placeholder.c) == null) ? null : linkButton.c;
        ActionOpenUrl actionOpenUrl = action instanceof ActionOpenUrl ? (ActionOpenUrl) action : null;
        if (actionOpenUrl == null || (str = actionOpenUrl.c) == null) {
            str = "";
        }
        String str4 = str;
        int i = bVar2.r;
        String optString2 = optJSONObject != null ? optJSONObject.optString("title") : null;
        if (optJSONObject != null && (optString = optJSONObject.optString("photo_base")) != null) {
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            imageList = ImageList.a.a(optString);
        }
        return new AttachChannelMessage(userId, j, peer, str2, zb, list, str3, str4, i, postDonut, imageList, optString2);
    }

    public static AttachChannelStub j(JSONObject jSONObject) {
        String string = jSONObject.getString("type");
        AttachChannelStub.Type.Companion.getClass();
        return new AttachChannelStub(AttachChannelStub.Type.a.a(string), jSONObject.optInt("height"), jSONObject.optInt("width"), jSONObject.optString("title"), jSONObject.optString("artist"), jSONObject.optLong("size"), jSONObject.optString("ext"));
    }

    public static AttachComments k(JSONObject jSONObject) {
        return new AttachComments(jSONObject.has("count") ? jSONObject.getInt("count") : 0, (jSONObject.has("can_view") ? jSONObject.getInt("can_view") : 0) == 1, (jSONObject.has("can_post") ? jSONObject.getInt("can_post") : 0) == 1, (jSONObject.has("can_open") ? jSONObject.getInt("can_open") : 0) == 1, (jSONObject.has("can_close") ? jSONObject.getInt("can_close") : 0) == 1);
    }

    public static AttachDoc l(JSONObject jSONObject) {
        ImageList a2;
        ArrayList o;
        String str;
        JSONObject optJSONObject;
        AttachDoc attachDoc = new AttachDoc();
        attachDoc.b = 0;
        attachDoc.c = AttachSyncState.DONE;
        attachDoc.e = jSONObject.getLong("id");
        attachDoc.d = new UserId(jSONObject.getLong("owner_id"));
        attachDoc.g = jSONObject.optString("title", "");
        attachDoc.h = jSONObject.optLong("size", 0L);
        attachDoc.i = jSONObject.optInt("type", 8);
        attachDoc.j = jSONObject.optString("ext", "");
        attachDoc.k = jSONObject.optString("url", "");
        attachDoc.m = jSONObject.optLong("date", 0L) * 1000;
        attachDoc.s = jSONObject.optString("access_key", "");
        attachDoc.t = jSONObject.optInt("is_unsafe", 0) == 1;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("preview");
        JSONArray optJSONArray = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("photo")) == null) ? null : optJSONObject.optJSONArray("sizes");
        if (optJSONArray == null) {
            a2 = new ImageList(null, 1, null);
        } else {
            Set<ImageSizeKey> set = plw.a;
            a2 = plw.a(optJSONArray, EmptySet.b);
        }
        attachDoc.n = a2;
        attachDoc.p = new ImageList(null, 1, null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("preview");
        JSONObject optJSONObject4 = optJSONObject3 != null ? optJSONObject3.optJSONObject("video") : null;
        if (optJSONObject4 == null) {
            o = new ArrayList(0);
        } else {
            VideoPreview videoPreview = new VideoPreview();
            videoPreview.b = optJSONObject4.getInt("width");
            videoPreview.c = optJSONObject4.getInt("height");
            videoPreview.d = optJSONObject4.optLong("file_size", 0L);
            videoPreview.e = optJSONObject4.optString("src", "");
            o = e43.o(videoPreview);
        }
        attachDoc.o = o;
        VideoPreview videoPreview2 = (VideoPreview) j5g.a0(o);
        if (videoPreview2 == null || (str = videoPreview2.e) == null) {
            str = "";
        }
        attachDoc.l = str;
        attachDoc.q = new ArrayList();
        attachDoc.r = "";
        return attachDoc;
    }

    public static AttachDonutLink m(JSONObject jSONObject, f1e0 f1e0Var) {
        ArrayList arrayList;
        JSONArray optJSONArray;
        UserId userId = new UserId(jSONObject.has("owner_id") ? jSONObject.getLong("owner_id") : 0L);
        f1e0Var.c(com.vk.dto.common.a.a(userId));
        Peer a2 = com.vk.dto.common.a.a(userId);
        JSONObject optJSONObject = jSONObject.optJSONObject("donors");
        Action action = null;
        int i = 0;
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("friends")) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                long j = optJSONArray.getLong(i2);
                Serializer.c<Peer> cVar = Peer.CREATOR;
                f1e0Var.c(Peer.a.b(j));
                arrayList2.add(new AttachDonutLink.Friend(j, new ImageList(null, 1, null)));
            }
            arrayList = arrayList2;
        }
        String optString = jSONObject.optString("text");
        int i3 = optJSONObject != null ? optJSONObject.has("count") ? optJSONObject.getInt("count") : 0 : 0;
        if (optJSONObject != null && optJSONObject.has("friends_count")) {
            i = optJSONObject.getInt("friends_count");
        }
        int i4 = i;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("button");
        LinkButton linkButton = optJSONObject2 != null ? new LinkButton(optJSONObject2) : null;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("action");
        if (optJSONObject3 != null) {
            Action.b bVar = Action.b;
            action = Action.a.a(optJSONObject3);
        }
        return new AttachDonutLink(0, null, userId, a2, null, false, optString, null, i3, i4, arrayList, linkButton, action, 3, null);
    }

    public static AttachGift n(JSONObject jSONObject) {
        GiftAnimation giftAnimation;
        JSONObject jSONObject2 = jSONObject.getJSONObject("gift");
        Serializer.c<AttachGift> cVar = AttachGift.CREATOR;
        long j = jSONObject2.getLong("id");
        Serializer.c<GiftRarity> cVar2 = GiftRarity.CREATOR;
        GiftRarity a2 = GiftRarity.a.a(jSONObject2.optJSONObject("rarity"));
        Serializer.c<GiftSticker> cVar3 = GiftSticker.CREATOR;
        Integer x = f370.x(jSONObject2, "stickers_product_id");
        GiftSticker giftSticker = x != null ? new GiftSticker(x.intValue(), jSONObject2.optBoolean("is_stickers_style", false)) : null;
        int optInt = jSONObject2.optInt("random_sticker_pack_attempt_id", 0);
        Serializer.c<GiftBackground> cVar4 = GiftBackground.CREATOR;
        List b = GiftBackground.a.b(jSONObject2.optJSONArray("backgrounds"));
        Serializer.c<GiftAnimation> cVar5 = GiftAnimation.CREATOR;
        JSONObject optJSONObject = jSONObject2.optJSONObject("animation");
        if (optJSONObject == null) {
            giftAnimation = null;
        } else {
            String valueOf = String.valueOf(j);
            Serializer.c<Animation> cVar6 = Animation.CREATOR;
            giftAnimation = new GiftAnimation(valueOf, Animation.a.a(optJSONObject), 0, 4, null);
        }
        GiftType.a aVar = GiftType.Companion;
        String optString = jSONObject2.optString("type");
        aVar.getClass();
        GiftType a3 = GiftType.a.a(optString);
        Serializer.c<ImageStatus> cVar7 = ImageStatus.CREATOR;
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("image_status");
        ImageStatus imageStatus = optJSONObject2 != null ? new ImageStatus(optJSONObject2.getString("url"), optJSONObject2.getInt("pack_id"), optJSONObject2.getInt("status_id")) : null;
        Serializer.c<ImageStatusPack> cVar8 = ImageStatusPack.CREATOR;
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("image_status_pack");
        ImageStatusPack imageStatusPack = optJSONObject3 != null ? new ImageStatusPack(optJSONObject3.getString("url"), optJSONObject3.getInt("pack_id")) : null;
        String optString2 = jSONObject2.optString("entry_id");
        Serializer.c<GiftBaseUrlConfig> cVar9 = GiftBaseUrlConfig.CREATOR;
        GiftBaseUrlConfig a4 = GiftBaseUrlConfig.a.a(jSONObject2.optJSONObject("base_url_config"));
        Serializer.c<GiftCard> cVar10 = GiftCard.CREATOR;
        GiftCard a5 = GiftCard.a.a(jSONObject2.optJSONObject("gift_card"));
        Serializer.c<GiftVotesAttachment> cVar11 = GiftVotesAttachment.CREATOR;
        AttachGift attachGift = new AttachGift(j, 0, null, null, null, a2, giftSticker, Integer.valueOf(optInt), giftAnimation, b, a3, imageStatus, imageStatusPack, optString2, a4, a5, GiftVotesAttachment.a.a(jSONObject2.optJSONObject("votes_attachment")), 30, null);
        Pattern pattern = nfw.a;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Matcher matcher = nfw.b.matcher(next);
                if (matcher.matches() && matcher.groupCount() == 2) {
                    arrayList.add(new com.vk.dto.common.im.Image(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(1)), jSONObject2.getString(next), false));
                }
            }
            arrayList.trimToSize();
            attachGift.f = new ImageList(arrayList);
            return attachGift;
        } catch (NumberFormatException | JSONException e) {
            throw new VKApiIllegalResponseException("Unable to parse imageList", e);
        }
    }

    public static AttachGraffiti o(JSONObject jSONObject) {
        long j = jSONObject.has("id") ? jSONObject.getLong("id") : 0L;
        int i = jSONObject.has("width") ? jSONObject.getInt("width") : 0;
        int i2 = jSONObject.has("height") ? jSONObject.getInt("height") : 0;
        String optString = jSONObject.optString("url");
        if (optString == null) {
            optString = "";
        }
        if (j == 0 || i <= 0 || i2 <= 0 || optString.length() == 0) {
            return null;
        }
        AttachGraffiti attachGraffiti = new AttachGraffiti();
        attachGraffiti.b = 0;
        attachGraffiti.c = AttachSyncState.DONE;
        attachGraffiti.e = j;
        attachGraffiti.d = new UserId(jSONObject.has("owner_id") ? jSONObject.getLong("owner_id") : 0L);
        attachGraffiti.f = new ImageList(new com.vk.dto.common.im.Image(i, i2, optString, false));
        attachGraffiti.g = new ImageList(null, 1, null);
        attachGraffiti.h = jSONObject.has("access_key") ? jSONObject.getString("access_key") : "";
        return attachGraffiti;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AttachLink p(JSONObject jSONObject, f1e0 f1e0Var) {
        JSONArray jSONArray;
        ImageScaleType imageScaleType;
        String str;
        int i;
        LinkTarget linkTarget;
        AMP amp;
        int i2;
        Article article;
        Product product;
        Product product2;
        VmojiAttach vmojiAttach;
        VmojiAttach vmojiAttach2;
        float f;
        int i3;
        String str2;
        String str3;
        JSONObject optJSONObject = jSONObject.optJSONObject("photo");
        if (optJSONObject == null || (jSONArray = optJSONObject.optJSONArray("sizes")) == null) {
            jSONArray = new JSONArray();
        }
        List<com.vk.dto.common.im.Image> list = plw.a(jSONArray, plw.a).b;
        String optString = optJSONObject != null ? optJSONObject.optString("vertical_align") : null;
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1383228885) {
                if (hashCode != -1364013995) {
                    if (hashCode == 115029 && optString.equals("top")) {
                        imageScaleType = ImageScaleType.TOP_CROP;
                    }
                } else if (optString.equals(TtmlNode.CENTER)) {
                    imageScaleType = ImageScaleType.CENTER_CROP;
                }
            } else if (optString.equals("bottom")) {
                imageScaleType = ImageScaleType.BOTTOM_CROP;
            }
            ButtonActionType buttonActionType = ButtonActionType.OPEN_URL;
            String string = jSONObject.getString("url");
            LinkTarget linkTarget2 = LinkTarget.DEFAULT;
            ButtonIconType buttonIconType = ButtonIconType.NONE;
            if (jSONObject.has("button")) {
                str = "";
                i = 0;
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("button");
                str = jSONObject2.optString("title", "");
                if (jSONObject2.has("action")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("action");
                    String optString2 = jSONObject3.optString("type", "");
                    if (epx.f(optString2, "join_group_and_open_url")) {
                        buttonActionType = ButtonActionType.JOIN_GROUP_AND_OPEN_URL;
                    } else {
                        epx.f(optString2, "open_url");
                    }
                    String optString3 = jSONObject3.optString("url", "");
                    i = jSONObject3.optInt("group_id", 0);
                    String optString4 = jSONObject3.optString("target", "");
                    if (epx.f(optString4, D1.e)) {
                        linkTarget2 = LinkTarget.EXTERNAL;
                    } else if (epx.f(optString4, "internal")) {
                        linkTarget2 = LinkTarget.INTERNAL;
                    }
                    string = optString3;
                } else {
                    i = 0;
                }
                if (epx.f(jSONObject2.optString("icon"), "play")) {
                    buttonIconType = ButtonIconType.PLAY;
                }
            }
            if (jSONObject.has("amp")) {
                linkTarget = linkTarget2;
                amp = null;
            } else {
                JSONObject jSONObject4 = jSONObject.getJSONObject("amp");
                linkTarget = linkTarget2;
                amp = new AMP(jSONObject4.optString("url"), jSONObject4.optInt("views"), jSONObject4.optBoolean("is_favorite"));
            }
            if (jSONObject.has("preview_article")) {
                i2 = i;
                article = null;
            } else {
                JSONObject jSONObject5 = jSONObject.getJSONObject("preview_article");
                i2 = i;
                f1e0Var.c(com.vk.dto.common.a.a(new UserId(f370.y(jSONObject5, "owner_id", 0L))));
                article = vj90.a(jSONObject5, null);
            }
            if (jSONObject.has("product")) {
                product = null;
            } else {
                JSONObject jSONObject6 = jSONObject.getJSONObject("product");
                JSONObject jSONObject7 = jSONObject6.getJSONObject("price");
                int optInt = jSONObject7.optInt("amount");
                int optInt2 = jSONObject7.optInt("old_amount");
                int optInt3 = jSONObject7.optInt("discount_rate");
                String optString5 = jSONObject7.getJSONObject(InAppPurchaseMetaData.KEY_CURRENCY).optString("name");
                int optInt4 = jSONObject6.optInt("orders_count");
                Merchant.a aVar = Merchant.Companion;
                String optString6 = jSONObject6.optString("merchant");
                aVar.getClass();
                String lowerCase = optString6 != null ? optString6.toLowerCase(Locale.ROOT) : null;
                Merchant merchant = Merchant.ALIEXPRESS;
                if (!epx.f(lowerCase, merchant.h().toLowerCase(Locale.ROOT))) {
                    merchant = Merchant.NONE;
                }
                product = new Product(optInt, optString5, optInt2, optInt4, optInt3, merchant);
            }
            if (!jSONObject.has("vmoji_avatar")) {
                vmojiAttach = new VmojiAttach(true, Integer.valueOf(Color.parseColor(f370.D(jSONObject.getJSONObject("vmoji_avatar"), L2.g))));
                product2 = product;
            } else if (jSONObject.has("stickers_pack")) {
                product2 = product;
                vmojiAttach = new VmojiAttach(jSONObject.getJSONObject("stickers_pack").getBoolean("is_vmoji"), null, 2, null);
            } else {
                product2 = product;
                vmojiAttach = null;
            }
            if (jSONObject.has(CampaignEx.JSON_KEY_STAR)) {
                vmojiAttach2 = vmojiAttach;
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                i3 = 0;
            } else {
                vmojiAttach2 = vmojiAttach;
                f = (float) jSONObject.getJSONObject(CampaignEx.JSON_KEY_STAR).optDouble("stars");
                i3 = jSONObject.getJSONObject(CampaignEx.JSON_KEY_STAR).optInt("reviews_count", 0);
            }
            if (jSONObject.has("seller_product")) {
                str2 = null;
                str3 = null;
            } else {
                JSONObject jSONObject8 = jSONObject.getJSONObject("seller_product");
                String optString7 = jSONObject8.optString("owner_name");
                str3 = jSONObject8.optString("favicon_link");
                str2 = optString7;
            }
            Article article2 = article;
            AttachLink attachLink = new AttachLink();
            attachLink.b = 0;
            attachLink.c = AttachSyncState.DONE;
            attachLink.e = jSONObject.getString("url");
            attachLink.f = jSONObject.getString("title");
            attachLink.g = jSONObject.optString("caption", "");
            attachLink.h = jSONObject.optString("description", "");
            attachLink.i = new ImageList(list);
            attachLink.j = imageScaleType;
            attachLink.k = f;
            attachLink.l = i3;
            attachLink.m = str2;
            attachLink.n = str3;
            attachLink.o = str;
            attachLink.p = buttonActionType;
            attachLink.q = string;
            attachLink.r = i2;
            attachLink.s = buttonIconType;
            attachLink.t = linkTarget;
            attachLink.u = amp;
            attachLink.v = article2;
            attachLink.w = product2;
            attachLink.x = vmojiAttach2;
            return attachLink;
        }
        imageScaleType = ImageScaleType.CENTER_CROP;
        ButtonActionType buttonActionType2 = ButtonActionType.OPEN_URL;
        String string2 = jSONObject.getString("url");
        LinkTarget linkTarget22 = LinkTarget.DEFAULT;
        ButtonIconType buttonIconType2 = ButtonIconType.NONE;
        if (jSONObject.has("button")) {
        }
        if (jSONObject.has("amp")) {
        }
        if (jSONObject.has("preview_article")) {
        }
        if (jSONObject.has("product")) {
        }
        if (!jSONObject.has("vmoji_avatar")) {
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_STAR)) {
        }
        if (jSONObject.has("seller_product")) {
        }
        Article article22 = article;
        AttachLink attachLink2 = new AttachLink();
        attachLink2.b = 0;
        attachLink2.c = AttachSyncState.DONE;
        attachLink2.e = jSONObject.getString("url");
        attachLink2.f = jSONObject.getString("title");
        attachLink2.g = jSONObject.optString("caption", "");
        attachLink2.h = jSONObject.optString("description", "");
        attachLink2.i = new ImageList(list);
        attachLink2.j = imageScaleType;
        attachLink2.k = f;
        attachLink2.l = i3;
        attachLink2.m = str2;
        attachLink2.n = str3;
        attachLink2.o = str;
        attachLink2.p = buttonActionType2;
        attachLink2.q = string2;
        attachLink2.r = i2;
        attachLink2.s = buttonIconType2;
        attachLink2.t = linkTarget;
        attachLink2.u = amp;
        attachLink2.v = article22;
        attachLink2.w = product2;
        attachLink2.x = vmojiAttach2;
        return attachLink2;
    }

    public static AttachMap q(JSONObject jSONObject) {
        Pair pair;
        String str;
        String str2;
        String optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("place");
        Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        JSONObject optJSONObject2 = jSONObject.optJSONObject(Y3.f);
        if (optJSONObject2 != null) {
            pair = new Pair(Double.valueOf(optJSONObject2.optDouble("latitude", ConnectivityTracker.DEFAULT_UPLINK_BITRATE)), Double.valueOf(optJSONObject2.optDouble("longitude", ConnectivityTracker.DEFAULT_UPLINK_BITRATE)));
        } else {
            List c0 = drm0.c0(jSONObject.optString(Y3.f), new String[]{" "}, 0, 6);
            try {
                pair = new Pair(Double.valueOf(Double.parseDouble((String) c0.get(0))), Double.valueOf(Double.parseDouble((String) c0.get(1))));
            } catch (Exception unused) {
                pair = new Pair(valueOf, valueOf);
            }
        }
        AttachMap attachMap = new AttachMap();
        attachMap.b = 0;
        attachMap.c = AttachSyncState.DONE;
        attachMap.e = ((Number) pair.i()).doubleValue();
        attachMap.f = ((Number) pair.j()).doubleValue();
        String str3 = "";
        if (optJSONObject == null || (str = optJSONObject.optString("title")) == null) {
            str = "";
        }
        attachMap.g = str;
        if (optJSONObject == null || (str2 = optJSONObject.optString("country")) == null) {
            str2 = "";
        }
        attachMap.h = str2;
        if (optJSONObject != null && (optString = optJSONObject.optString("city")) != null) {
            str3 = optString;
        }
        attachMap.i = str3;
        return attachMap;
    }

    public static AttachMarket r(JSONObject jSONObject) {
        Price price;
        String str;
        String str2;
        String str3;
        Currency currency;
        Currency currency2;
        ArrayList arrayList = new ArrayList();
        String optString = jSONObject.optString("thumb_photo", "");
        int i = 0;
        if (!drm0.N(optString)) {
            arrayList.add(new com.vk.dto.common.im.Image(400, 400, optString, false));
        }
        AttachMarket attachMarket = new AttachMarket();
        attachMarket.b = 0;
        attachMarket.c = AttachSyncState.DONE;
        attachMarket.e = jSONObject.getLong("id");
        attachMarket.f = jSONObject.optString("title", "");
        attachMarket.g = jSONObject.optString("description", "");
        attachMarket.d = new UserId(jSONObject.getLong("owner_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("price");
        if (optJSONObject != null) {
            Serializer.c<Price> cVar = Price.CREATOR;
            price = Price.a.a(optJSONObject);
        } else {
            price = null;
        }
        if (price == null || (str = price.e) == null) {
            str = "";
        }
        attachMarket.l = str;
        if (price == null || (str2 = price.f) == null) {
            str2 = "";
        }
        attachMarket.m = str2;
        if (price == null || (str3 = price.i) == null) {
            str3 = "";
        }
        attachMarket.n = str3;
        attachMarket.h = price != null ? price.b : 0L;
        attachMarket.i = price != null ? price.c : 0L;
        if (price != null && (currency2 = price.d) != null) {
            i = currency2.b;
        }
        attachMarket.j = i;
        attachMarket.k = (price == null || (currency = price.d) == null) ? "" : currency.c;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("reject_info");
        attachMarket.o = optJSONObject2 != null ? (AttachMarketRejectInfo) AttachMarketRejectInfo.h.a(optJSONObject2) : null;
        attachMarket.q = new ImageList(arrayList);
        attachMarket.r = jSONObject.optString("access_key", "");
        attachMarket.p = jSONObject.optBoolean("is_price_list_service");
        attachMarket.s = jSONObject.optBoolean("is_owner");
        attachMarket.t = jSONObject.optBoolean("is_adult");
        attachMarket.u = jSONObject.optBoolean("is_hardblocked");
        xuo0.a.getClass();
        attachMarket.v = xuo0.a();
        attachMarket.w = jSONObject.optString("market_url");
        return attachMarket;
    }

    public static AttachMiniApp s(JSONObject jSONObject) {
        ApiApplication apiApplication = new ApiApplication(jSONObject.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP));
        String optString = jSONObject.optString("title", null);
        if (optString == null) {
            optString = apiApplication.c;
        }
        String optString2 = jSONObject.optString("description", null);
        if (optString2 == null) {
            optString2 = apiApplication.g;
        }
        Set<ImageSizeKey> set = plw.a;
        ImageList a2 = plw.a(jSONObject.optJSONArray("images"), plw.a);
        String optString3 = jSONObject.optString("button_text");
        if (optString3 == null) {
            optString3 = "";
        }
        Serializer.c<AttachMiniAppButton> cVar = AttachMiniAppButton.CREATOR;
        JSONObject optJSONObject = jSONObject.optJSONObject("button");
        return new AttachMiniApp(apiApplication, optString, optString2, a2, optString3, optJSONObject != null ? new AttachMiniAppButton(optJSONObject) : null, 0, null, null, 448, null);
    }

    public static AttachPoll t(JSONObject jSONObject, f1e0 f1e0Var) {
        AttachSyncState attachSyncState = AttachSyncState.DONE;
        xuo0.a.getClass();
        long a2 = xuo0.a();
        try {
            Serializer.c<Poll> cVar = Poll.CREATOR;
            Poll a3 = Poll.a.a(jSONObject, null);
            f1e0Var.c(com.vk.dto.common.a.a(a3.r));
            Iterator<T> it = a3.u.iterator();
            while (it.hasNext()) {
                f1e0Var.c(com.vk.dto.common.a.a((UserId) it.next()));
            }
            return new AttachPoll(0, attachSyncState, a3, a2);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    public static AttachSticker u(JSONObject jSONObject) {
        AttachSticker attachSticker = new AttachSticker();
        attachSticker.b = 0;
        attachSticker.c = AttachSyncState.DONE;
        attachSticker.e = jSONObject.getLong("sticker_id");
        attachSticker.f = jSONObject.getInt("product_id");
        StickerItem stickerItem = StickerItem.l;
        attachSticker.g = StickerItem.a.a(jSONObject);
        attachSticker.h = "";
        return attachSticker;
    }

    public static AttachStory v(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("photo");
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("first_frame")) == null) {
            optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("image") : null;
            if (optJSONArray == null) {
                optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray("sizes") : null;
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
            }
        }
        int i = jSONObject.has("id") ? jSONObject.getInt("id") : 0;
        int i2 = jSONObject.has("owner_id") ? jSONObject.getInt("owner_id") : 0;
        if (i == 0) {
            throw new VKApiIllegalResponseException("Expect story's id to be <> 0");
        }
        if (i2 == 0) {
            throw new VKApiIllegalResponseException("Expect story's ownerId to be <> 0");
        }
        ImageList a2 = plw.a(optJSONArray, plw.a);
        StoryEntry storyEntry = new StoryEntry(jSONObject);
        VideoFile videoFile = storyEntry.n;
        long j = 0;
        if (videoFile != null && !videoFile.isEmpty()) {
            xuo0.a.getClass();
            j = xuo0.a();
        }
        return new AttachStory(storyEntry, 0, null, new ImageList(null, 1, null), a2, null, null, null, j, 230, null);
    }

    public static AttachUgcSticker w(JSONObject jSONObject) {
        AttachUgcSticker attachUgcSticker = new AttachUgcSticker(0, null, null, 0L, null, 31, null);
        attachUgcSticker.b = 0;
        attachUgcSticker.c = AttachSyncState.DONE;
        attachUgcSticker.e = jSONObject.getLong("id");
        attachUgcSticker.d = new UserId(jSONObject.getLong("owner_id"));
        Serializer.c<UGCStickerModel> cVar = UGCStickerModel.CREATOR;
        attachUgcSticker.f = UGCStickerModel.a.a(jSONObject);
        return attachUgcSticker;
    }

    public static AttachVideo x(JSONObject jSONObject, f1e0 f1e0Var) {
        long a2;
        ImageList imageList;
        ImageList imageList2;
        VideoFileOld b = com.vk.dto.common.c.b(jSONObject);
        f1e0Var.c(com.vk.dto.common.a.a(b.b));
        ClipVideoFile clipVideoFile = b instanceof ClipVideoFile ? (ClipVideoFile) b : null;
        if (clipVideoFile != null) {
            Iterator<T> it = clipVideoFile.N1.iterator();
            while (it.hasNext()) {
                f1e0Var.c(com.vk.dto.common.a.a(((CoOwnerItem) it.next()).b));
            }
        }
        if (b.isEmpty()) {
            a2 = 0;
        } else {
            xuo0.a.getClass();
            a2 = xuo0.a();
        }
        if (jSONObject.has("first_frame")) {
            Set<ImageSizeKey> set = plw.a;
            imageList = plw.a(jSONObject.getJSONArray("first_frame"), EmptySet.b);
        } else {
            imageList = new ImageList(null, 1, null);
        }
        ImageList imageList3 = imageList;
        if (jSONObject.has("image")) {
            Set<ImageSizeKey> set2 = plw.a;
            imageList2 = plw.a(jSONObject.getJSONArray("image"), EmptySet.b);
        } else {
            imageList2 = new ImageList(nfw.a(jSONObject, 1.7777777777777777d));
        }
        return new AttachVideo(b, imageList2, imageList3, a2, null, 0, 0, 0L, 0, 0L, null, null, null, null, null, 32752, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r1.equals("in_progress") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AttachVideoMsg y(JSONObject jSONObject, f1e0 f1e0Var) {
        long a2;
        ImageList imageList;
        ImageList imageList2;
        VideoFileOld b = com.vk.dto.common.c.b(jSONObject);
        f1e0Var.c(com.vk.dto.common.a.a(b.b));
        String string = jSONObject.has("transcript_state") ? jSONObject.getString("transcript_state") : "unavailable";
        int optInt = jSONObject.optInt("shape_id");
        if (b.isEmpty()) {
            a2 = 0;
        } else {
            xuo0.a.getClass();
            a2 = xuo0.a();
        }
        long j = a2;
        int i = 1;
        if (jSONObject.has("first_frame")) {
            Set<ImageSizeKey> set = plw.a;
            imageList = plw.a(jSONObject.getJSONArray("first_frame"), EmptySet.b);
        } else {
            imageList = new ImageList(null, 1, null);
        }
        switch (string.hashCode()) {
            case -1715163493:
                if (string.equals("uninitialized")) {
                    i = -1;
                    break;
                }
                i = 0;
                break;
            case -753541113:
                break;
            case -665462704:
                string.equals("unavailable");
                i = 0;
                break;
            case 3089282:
                if (string.equals("done")) {
                    i = 2;
                    break;
                }
                i = 0;
                break;
            default:
                i = 0;
                break;
        }
        int i2 = i;
        if (jSONObject.has("image")) {
            Set<ImageSizeKey> set2 = plw.a;
            imageList2 = plw.a(jSONObject.getJSONArray("image"), EmptySet.b);
        } else {
            imageList2 = new ImageList(nfw.a(jSONObject, 1.0d));
        }
        AttachVideoMsg attachVideoMsg = new AttachVideoMsg(b, optInt, imageList2, imageList, j, null, null, 0, null, null, null, i2, false, false, false, null, 63456, null);
        attachVideoMsg.r = jSONObject.has("transcript") ? jSONObject.getString("transcript") : "";
        return attachVideoMsg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AttachWall z(JSONObject jSONObject, f1e0 f1e0Var) {
        EmptyList emptyList;
        JSONArray optJSONArray;
        AttachWall attachWall = new AttachWall();
        attachWall.b = 0;
        attachWall.c = AttachSyncState.DONE;
        attachWall.e = jSONObject.optInt("id", 0);
        attachWall.h = (jSONObject.has("marked_as_ads") ? jSONObject.getInt("marked_as_ads") : 0) != 0;
        attachWall.i = jSONObject.has("marked_as_author_ad") ? jSONObject.getBoolean("marked_as_author_ad") : false;
        JSONObject optJSONObject = jSONObject.optJSONObject("author_ad");
        attachWall.j = optJSONObject == null ? null : new AuthorAd(optJSONObject.has("advertiser_info_url") ? optJSONObject.getString("advertiser_info_url") : "", optJSONObject.has("ad_marker") ? optJSONObject.getString("ad_marker") : "");
        attachWall.d = new UserId(jSONObject.optLong("to_id", 0L));
        UserId userId = new UserId(jSONObject.optLong("from_id", 0L));
        attachWall.f = userId;
        f1e0Var.c(com.vk.dto.common.a.a(userId));
        if (!fkq0.c(attachWall.d)) {
            attachWall.d = new UserId(jSONObject.optLong("owner_id", 0L));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("coowners");
        if (optJSONObject2 == null || (optJSONArray = optJSONObject2.optJSONArray("list")) == null) {
            emptyList = EmptyList.b;
        } else {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new UserId(optJSONArray.getJSONObject(i).optLong("owner_id", UserId.d.b)));
            }
            emptyList = arrayList;
        }
        attachWall.g = emptyList;
        attachWall.r = jSONObject.optString("post_type", "post");
        attachWall.k = esv.b(attachWall.d);
        attachWall.l = esv.a(attachWall.d).b;
        attachWall.m = jSONObject.optString("text", "");
        attachWall.p = jSONObject.has("date") ? jSONObject.getLong("date") : 0L;
        attachWall.n = jSONObject.optString("access_key", "");
        attachWall.u = jSONObject.optBoolean("suggest_subscribe");
        F(jSONObject, f1e0Var, attachWall.o);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("copy_history");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            while (true) {
                length2--;
                if (-1 >= length2) {
                    break;
                }
                arrayList2.add(z(optJSONArray2.getJSONObject(length2), f1e0Var));
            }
            Object Y = j5g.Y(arrayList2);
            Iterator it = arrayList2.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                AttachWall attachWall2 = (AttachWall) next;
                AttachWall attachWall3 = (AttachWall) Y;
                if (i2 == 0) {
                    Y = attachWall2;
                } else {
                    attachWall2.getClass();
                    AttachWall attachWall4 = new AttachWall(attachWall2);
                    attachWall4.o.add(attachWall3);
                    Y = attachWall4;
                }
                i2 = i3;
            }
            attachWall.o.add((AttachWall) Y);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("donut");
        attachWall.s = optJSONObject3 != null ? vj90.f(optJSONObject3) : null;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("textlive");
        if (optJSONObject4 != null) {
            attachWall.t = new AttachWall.TextLive(optJSONObject4.optString("title"), optJSONObject4.getString("url"));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("comments");
        attachWall.v = optJSONObject5 != null ? k(optJSONObject5) : null;
        JSONObject optJSONObject6 = jSONObject.optJSONObject("reposts");
        attachWall.w = (optJSONObject6 == null || !optJSONObject6.has("count")) ? 0 : optJSONObject6.getInt("count");
        attachWall.x = tci.p(jSONObject, null);
        JSONObject optJSONObject7 = jSONObject.optJSONObject("views");
        attachWall.y = (optJSONObject7 == null || !optJSONObject7.has("count")) ? 0 : optJSONObject7.getInt("count");
        attachWall.A = jSONObject.optBoolean("is_deleted", false);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b = Peer.a.b(jSONObject.optLong("signer_id", 0L));
        attachWall.B = b;
        f1e0Var.c(b);
        attachWall.C = jSONObject.optString("track_code", "");
        attachWall.E = jSONObject.optString("deleted_details", "");
        attachWall.D = jSONObject.optString("deleted_reason", "");
        return attachWall;
    }
}

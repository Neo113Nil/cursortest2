package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachDeleted;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.music.Thumb;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.im.engine.models.CallState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.attaches.AttachHighlight;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.MsgPartTwoRowSnippetItem;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.mso0;
import xsna.ru30;

/* compiled from: MsgWithPartBuilder.kt */
/* loaded from: classes2.dex */
public final class o140 {
    public static final List<CallState> a = e43.l(CallState.CANCELLED, CallState.DECLINED);

    /* compiled from: MsgWithPartBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdapterEntryType.values().length];
            try {
                iArr[AdapterEntryType.TYPE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdapterEntryType.TYPE_SERVICE_UNSUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL_REDESIGNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdapterEntryType.TYPE_EMPTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdapterEntryType.TYPE_KEYBOARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CAROUSEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdapterEntryType.TYPE_REACTIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_SENDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_HEADER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_TEXT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AdapterEntryType.TYPE_NESTED_FORWARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AdapterEntryType.TYPE_REPLY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AdapterEntryType.TYPE_USER_NAME.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DELETED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AdapterEntryType.TYPE_BOX_PHOTO_VIDEO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AdapterEntryType.TYPE_BOX_DOC_PREVIEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AdapterEntryType.TYPE_BLOCKED_POST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PHOTO.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIO_COMPACT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEO.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AdapterEntryType.TYPE_EXTERNAL_VIDEO.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PUBLIC_VIDEO.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[AdapterEntryType.TYPE_INTERACTIVE_VIDEO.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEO_MSG.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEO_AUTOPLAY.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GIF_AUTOPLAY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MAP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[AdapterEntryType.TYPE_STICKER.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[AdapterEntryType.TYPE_UGC_STICKER.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[AdapterEntryType.TYPE_POPUP_STICKER.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GIFT.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_OWNER.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_TEXT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_COLLAPSE_TEXT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_BUTTON.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_REPLY.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_PLACEHOLDER.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DONATE_PLACEHOLDER_REDESIGN.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DONATE_BUTTON.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_WALL_POST_TEXT.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[AdapterEntryType.TYPE_TWO_ROW_SNIPPET.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DOC_SIMPLE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DOC_PREVIEW.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LINK_SMALL.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LINK_LARGE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LINK_EXTERNAL_MARKET.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LINK_PRODUCT.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MARKET_SMALL.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MARKET_LARGE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MARKET_BLOCKED.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIOMSG.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEOMSG_TRANSCRIPT.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MSG_TRANSCRIPT_RATE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GRAFFITI.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PLAYLIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PLAYLIST_COMPACT.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ARTICLE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CALL.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GROUP_CALL.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[AdapterEntryType.TYPE_NESTED_STORY.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[AdapterEntryType.TYPE_STORY.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[AdapterEntryType.TYPE_POLL.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PODCAST_EPISODE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PODCAST_EPISODE_RESTRICTED.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ARTIST.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ARTIST_COMPACT.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[AdapterEntryType.TYPE_EVENT.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MINI_APP.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[AdapterEntryType.TYPE_UNSUPPORTED.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CURATOR.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DONUT_LINK.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WIDGET.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[AdapterEntryType.TYPE_HIGHLIGHT.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VMOJI_CHARACTER_LINK.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VMOJI_PACK_LINK.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[AdapterEntryType.TYPE_APP_ACTION.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIEWS_AND_TIME.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[AdapterEntryType.TYPE_QUESTION.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[AdapterEntryType.TYPE_COMMENTS_BUTTON.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_POST_HEADER.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ROOM.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_CHANNEL_MSG_HEADER.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_CHANNEL_MSG_UNAVAILABLE.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FAKE_NEWS.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_PHOTO_VIDEO.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC_PREVIEW.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO_COMPACT.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nsr0 A(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachUgcSticker attachUgcSticker = (AttachUgcSticker) attach;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_UGC_STICKER;
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        com.vk.im.engine.models.messages.a aVar = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
        boolean D3 = aVar != null ? aVar.D3(AttachStory.class, false) : false;
        UGCStickerModel uGCStickerModel = attachUgcSticker.f;
        int i2 = msg.b;
        du30 du30Var = new du30(null, new jr30(0), uk30Var.q, uk30Var.Q, a2, false, i, D3, uGCStickerModel, i2, adapterEntryType, uk30Var.V);
        du30Var.n = msg;
        du30Var.o = nestedMsg;
        du30Var.p = attach;
        return a(du30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 B(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_VIDEO;
        int i2 = msg.b;
        boolean e = uk30Var.e(a2, false);
        abi0 abi0Var = uk30Var.V;
        g34 g34Var = uk30Var.P;
        int xb = attach.xb();
        return a(new bs30(msg, new q0x(false, false, i, e, false, null, msg, new jr30(0), (AttachWithImage) attach, a2, g34Var, i2, xb, adapterEntryType, abi0Var), nestedMsg, adapterEntryType, null), msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 C(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        boolean Ib = msg.Ib();
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        long Fb = msg.Fb();
        vk30 vk30Var = uk30Var.a;
        boolean z = true;
        BubbleColors c = vk30Var.c(Fb, a2, true);
        BubbleColors c2 = vk30Var.c(Fb, a2, false);
        boolean z2 = msg instanceof MsgFromUser;
        if (!z2 && !(msg instanceof MsgFromChannel)) {
            z = false;
        }
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_VIDEO_AUTOPLAY;
        AttachWithVideo attachWithVideo = (AttachWithVideo) attach;
        int i2 = msg.b;
        UserId q = attach.q();
        abi0 abi0Var = uk30Var.V;
        gl8 b = vk30Var.b(c, i, Ib);
        gl8 b2 = vk30Var.b(c2, i, Ib);
        boolean e = uk30Var.e(a2, false);
        qtd0 Bb = uk30Var.e.Bb(com.vk.dto.common.a.a(attach.q()));
        g34 g34Var = uk30Var.P;
        hzm0 hzm0Var = uk30Var.Y;
        boolean z3 = uk30Var.y;
        io2 io2Var = uk30Var.Z;
        Peer peer = uk30Var.l;
        MsgFromUser msgFromUser = z2 ? (MsgFromUser) msg : null;
        return a(new bs30(msg, new t4w(e, false, false, i, false, null, z, false, msg, new jr30(0), i2, b, b2, Bb, new ww(14, uk30Var, attach), g34Var, hzm0Var, a2, q, Ib, Fb, adapterEntryType, attachWithVideo, abi0Var, z3, io2Var, peer, msgFromUser != null ? msgFromUser.cc() : false, uk30Var.N), nestedMsg, adapterEntryType, uk30Var.S), msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nsr0 D(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachVideoMsg D6;
        vk30 vk30Var = uk30Var.a;
        Integer num = null;
        com.vk.im.engine.models.messages.a aVar = nestedMsg != null ? nestedMsg : msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
        if (attach instanceof AttachVideoMsg) {
            num = Integer.valueOf(((AttachVideoMsg) attach).c);
        } else if (aVar != null && aVar.F0() && (D6 = aVar.D6()) != null) {
            num = Integer.valueOf(D6.c);
        }
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        boolean Ib = msg.Ib();
        long Fb = msg.Fb();
        BubbleColors c = vk30Var.c(Fb, a2, true);
        BubbleColors c2 = vk30Var.c(Fb, a2, false);
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_VIDEO_MSG;
        return a(new bs30(msg, new o4w(uk30Var.e(a2, false), false, false, i, msg, nestedMsg, new jr30(0), vk30Var.b(c, i, Ib), vk30Var.b(c2, i, Ib), a2, c.D, c2.D, uk30Var.d, cdi.z(num, uk30Var.b), Ib, Fb, msg.b, (AttachVideoMsg) attach, uk30Var.P, num, uk30Var.E, adapterEntryType, uk30Var.V, null), nestedMsg, adapterEntryType, null), msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 E(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_WALL_POST_BUTTON;
        nu30 nu30Var = new nu30(adapterEntryType);
        nu30Var.c = msg;
        nu30Var.d = nestedMsg;
        nu30Var.e = attach;
        return a(nu30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 F(int i, Attach attach, Msg msg, uk30 uk30Var) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_WALL_POST_COLLAPSE_TEXT;
        pu30 pu30Var = new pu30(((AttachWall) attach).o.size(), adapterEntryType);
        pu30Var.d = attach;
        return a(pu30Var, msg, attach, adapterEntryType, i, null, null, false, null, uk30Var, 480);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public static final nsr0 G(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        Collection singletonList;
        DisplayNameFormatter displayNameFormatter = uk30Var.f0;
        ProfilesInfo profilesInfo = uk30Var.e;
        AttachWall attachWall = (AttachWall) attach;
        if (attachWall.g.isEmpty() || !BuildInfo.s()) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            qtd0 Bb = profilesInfo.Bb(Peer.a.b(attachWall.f.b));
            singletonList = Bb == null ? EmptyList.b : Collections.singletonList(new ru30.a(Bb, displayNameFormatter.i(Bb)));
        } else {
            Collection<UserId> collection = attachWall.g;
            singletonList = new ArrayList();
            for (UserId userId : collection) {
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                qtd0 Bb2 = profilesInfo.Bb(Peer.a.b(userId.b));
                ru30.a aVar = Bb2 == null ? null : new ru30.a(Bb2, displayNameFormatter.i(Bb2));
                if (aVar != null) {
                    singletonList.add(aVar);
                }
            }
        }
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_WALL_POST_OWNER;
        Collection collection2 = singletonList;
        ru30 ru30Var = new ru30(collection2, adapterEntryType, attachWall.f, attachWall.p, msg.i, uk30Var.a.a(), attachWall.A);
        ru30Var.l = attach;
        ru30Var.j = msg;
        ru30Var.k = nestedMsg;
        return a(ru30Var, msg, attach, adapterEntryType, i, null, null, false, null, uk30Var, 480);
    }

    public static final nsr0 H(int i, Attach attach, Msg msg, uk30 uk30Var) {
        tu30 tu30Var;
        String str;
        PostDonut.Placeholder placeholder;
        AttachWall attachWall = (AttachWall) attach;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_WALL_POST_PLACEHOLDER;
        PostDonut postDonut = attachWall.s;
        if ((postDonut != null ? postDonut.c : null) != null) {
            if (postDonut == null || (placeholder = postDonut.c) == null || (str = placeholder.b) == null) {
                str = "";
            }
            tu30Var = new tu30(str, R.drawable.vk_icon_donut_outline_28, adapterEntryType);
        } else {
            tu30Var = new tu30(attachWall.m, R.drawable.vk_icon_delete_outline_28, adapterEntryType);
        }
        tu30Var.f = attach;
        return a(tu30Var, msg, attach, adapterEntryType, i, null, null, false, null, uk30Var, 480);
    }

    public static final nsr0 I(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_WALL_POST_REPLY;
        vu30 vu30Var = new vu30(new jr30(0), ((AttachWallReply) attach).j, i, adapterEntryType, null);
        vu30Var.g = msg;
        vu30Var.h = nestedMsg;
        vu30Var.i = attach;
        return a(vu30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 J(int i, Attach attach, Msg msg, CharSequence charSequence, uk30 uk30Var) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_WALL_POST_TEXT;
        yu30 yu30Var = new yu30(charSequence, msg.b, adapterEntryType, uk30Var.V, new jr30(0));
        yu30Var.g = attach;
        return a(yu30Var, msg, (AttachWall) attach, adapterEntryType, i, charSequence, null, false, null, uk30Var, 448);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nsr0 a(ir30 ir30Var, Msg msg, Attach attach, AdapterEntryType adapterEntryType, int i, CharSequence charSequence, List list, boolean z, NestedMsg nestedMsg, uk30 uk30Var, int i2) {
        boolean z2;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar;
        boolean z3;
        boolean z4;
        boolean z5;
        ProfilesInfo profilesInfo;
        boolean z6;
        CharSequence charSequence2;
        Spanned spanned;
        String str;
        String str2;
        long b;
        Peer peer;
        y060 y060Var;
        ProfilesInfo profilesInfo2;
        boolean z7;
        long j;
        boolean z8;
        boolean z9;
        BubbleColors bubbleColors;
        BubbleColors bubbleColors2;
        boolean z10;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a aVar;
        a.e eVar;
        a.C1165a c1165a;
        a.c cVar2;
        a.b bVar;
        String string;
        int i3 = (i2 & 16) != 0 ? 0 : i;
        CharSequence charSequence3 = (i2 & 32) != 0 ? null : charSequence;
        List list2 = (i2 & 64) != 0 ? EmptyList.b : list;
        boolean z11 = (i2 & 128) != 0 ? false : z;
        NestedMsg nestedMsg2 = (i2 & 256) != 0 ? null : nestedMsg;
        Peer peer2 = uk30Var.l;
        ProfilesInfo profilesInfo3 = uk30Var.e;
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar2 = uk30Var.h0;
        vk30 vk30Var = uk30Var.a;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a2 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer2);
        Peer peer3 = uk30Var.l;
        boolean a3 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, peer3);
        boolean Ib = msg.Ib();
        long Fb = msg.Fb();
        List list3 = list2;
        if ((msg instanceof MsgFromUser) && msg.Qb()) {
            MsgFromUser msgFromUser = (MsgFromUser) msg;
            z2 = z11;
            cVar = a2;
            z3 = true;
            if (com.vk.im.engine.models.messages.a.Q7(msgFromUser, new gzn(17), true) == null && com.vk.im.engine.models.messages.a.Q7(msgFromUser, new u620(4), true) == null && !msg.D) {
                z4 = true;
                BubbleColors c = vk30Var.c(Fb, a3, z3);
                BubbleColors c2 = vk30Var.c(Fb, a3, false);
                qtd0 Bb = profilesInfo3.Bb(msg.getFrom());
                StringBuilder sb = new StringBuilder();
                z5 = msg instanceof MsgFromChannel;
                if (z5) {
                    z6 = z5;
                    DisplayNameFormatter displayNameFormatter = uk30Var.f0;
                    displayNameFormatter.getClass();
                    profilesInfo = profilesInfo3;
                    displayNameFormatter.h(Bb, UserNameCase.NOM, sb, DisplayNameFormatter.NameOrder.START_WITH_FIRSTNAME);
                } else {
                    profilesInfo = profilesInfo3;
                    z6 = z5;
                }
                if (charSequence3 != null) {
                    charSequence2 = ((list3.isEmpty() && attach == null) || aVar2 == null) ? "" : aVar2.a.getString(R.string.vkim_accessibility_msg_with_attaches);
                } else {
                    charSequence2 = charSequence3;
                }
                spanned = !(charSequence3 instanceof Spanned) ? (Spanned) charSequence3 : null;
                if (spanned == null) {
                    str = "";
                    int length = spanned.getSpans(0, spanned.length(), URLSpan.class).length;
                    if (length != 0) {
                        if (length != 1) {
                            if (aVar2 != null) {
                                string = aVar2.a.getString(R.string.vkim_accessibility_markdown_links);
                                str2 = string;
                            }
                            str2 = str;
                        } else {
                            if (aVar2 != null) {
                                string = aVar2.a.getString(R.string.vkim_accessibility_markdown_link);
                                str2 = string;
                            }
                            str2 = str;
                        }
                        bw30.a.getClass();
                        b = bw30.b(msg);
                        if (nestedMsg2 != null) {
                            peer = peer3;
                            y060Var = new y060(nestedMsg2.f, nestedMsg2.g8(), nestedMsg2.S0(), nestedMsg2.F0(), nestedMsg2.D3(AttachGift.class, false), nestedMsg2.m, nestedMsg2.U9(), uk30Var.c0.a(nestedMsg2));
                        } else {
                            peer = peer3;
                            y060Var = null;
                        }
                        boolean e = uk30Var.e(a3, false);
                        gl8 b2 = vk30Var.b(c2, i3, Ib);
                        gl8 b3 = vk30Var.b(c, i3, Ib);
                        ev9 ev9Var = uk30Var.R;
                        if (adapterEntryType == AdapterEntryType.TYPE_CAROUSEL && uk30Var.h(z4)) {
                            profilesInfo2 = profilesInfo;
                            z7 = a3;
                            j = b;
                            z8 = true;
                        } else {
                            profilesInfo2 = profilesInfo;
                            z7 = a3;
                            j = b;
                            z8 = false;
                        }
                        boolean z12 = uk30Var.t;
                        boolean z13 = uk30Var.u;
                        boolean z14 = uk30Var.v;
                        boolean z15 = uk30Var.q;
                        boolean Jb = msg.Jb(peer);
                        qtd0 Bb2 = profilesInfo2.Bb(z6 ? ((MsgFromChannel) msg).O : msg.getFrom());
                        if (attach != null) {
                            int xb = attach.xb();
                            AttachPlaylist attachPlaylist = attach instanceof AttachPlaylist ? (AttachPlaylist) attach : null;
                            z9 = z4;
                            if (attachPlaylist != null) {
                                bubbleColors = c;
                                bubbleColors2 = c2;
                                z10 = z12;
                                eVar = new a.e(attachPlaylist.getTitle(), attachPlaylist.b.i, attachPlaylist.j(), attachPlaylist.i());
                            } else {
                                bubbleColors = c;
                                bubbleColors2 = c2;
                                z10 = z12;
                                eVar = null;
                            }
                            AttachDoc attachDoc = attach instanceof AttachDoc ? (AttachDoc) attach : null;
                            if (attachDoc != null) {
                                c1165a = new a.C1165a(attachDoc.b, attachDoc.j, attachDoc.g, attachDoc.h);
                            } else {
                                AttachChannelStub attachChannelStub = attach instanceof AttachChannelStub ? (AttachChannelStub) attach : null;
                                c1165a = attachChannelStub != null ? new a.C1165a(attachChannelStub.i, attachChannelStub.h, attachChannelStub.e, attachChannelStub.g) : null;
                            }
                            AttachLink attachLink = attach instanceof AttachLink ? (AttachLink) attach : null;
                            a.d dVar = attachLink != null ? new a.d(attachLink.f, attachLink.e) : null;
                            AttachWallReply attachWallReply = attach instanceof AttachWallReply ? (AttachWallReply) attach : null;
                            a.g gVar = attachWallReply != null ? new a.g(attachWallReply.j) : null;
                            AttachQuestion attachQuestion = attach instanceof AttachQuestion ? (AttachQuestion) attach : null;
                            a.f fVar = attachQuestion != null ? new a.f(attachQuestion.d) : null;
                            AttachGraffiti attachGraffiti = attach instanceof AttachGraffiti ? (AttachGraffiti) attach : null;
                            if (attachGraffiti != null) {
                                Image Ab = attachGraffiti.f.Ab();
                                cVar2 = new a.c(Ab != null ? Integer.valueOf(Ab.b) : null);
                            } else {
                                cVar2 = null;
                            }
                            AttachGift attachGift = attach instanceof AttachGift ? (AttachGift) attach : null;
                            if (attachGift != null) {
                                bVar = new a.b(attachGift.r != null);
                            } else {
                                bVar = null;
                            }
                            aVar = new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a(xb, eVar, c1165a, gVar, dVar, fVar, cVar2, bVar);
                        } else {
                            z9 = z4;
                            bubbleColors = c;
                            bubbleColors2 = c2;
                            z10 = z12;
                            aVar = null;
                        }
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar2 = new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f(adapterEntryType, charSequence3, i3, y060Var, e, z2, j, cVar, aVar, bubbleColors, bubbleColors2, z7, b3, b2, z8, z9, z13, z14, z10, z15, Jb, Bb2, ev9Var, sb.toString(), charSequence2, str2, uk30Var.T, uk30Var.U, uk30Var.V, -1073290992, 143);
                        fVar2.R = msg;
                        fVar2.S = nestedMsg2;
                        return new nsr0(fVar2, ir30Var);
                    }
                } else {
                    str = "";
                }
                str2 = str;
                bw30.a.getClass();
                b = bw30.b(msg);
                if (nestedMsg2 != null) {
                }
                boolean e2 = uk30Var.e(a3, false);
                gl8 b22 = vk30Var.b(c2, i3, Ib);
                gl8 b32 = vk30Var.b(c, i3, Ib);
                ev9 ev9Var2 = uk30Var.R;
                if (adapterEntryType == AdapterEntryType.TYPE_CAROUSEL) {
                }
                profilesInfo2 = profilesInfo;
                z7 = a3;
                j = b;
                z8 = false;
                boolean z122 = uk30Var.t;
                boolean z132 = uk30Var.u;
                boolean z142 = uk30Var.v;
                boolean z152 = uk30Var.q;
                boolean Jb2 = msg.Jb(peer);
                qtd0 Bb22 = profilesInfo2.Bb(z6 ? ((MsgFromChannel) msg).O : msg.getFrom());
                if (attach != null) {
                }
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar22 = new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f(adapterEntryType, charSequence3, i3, y060Var, e2, z2, j, cVar, aVar, bubbleColors, bubbleColors2, z7, b32, b22, z8, z9, z132, z142, z10, z152, Jb2, Bb22, ev9Var2, sb.toString(), charSequence2, str2, uk30Var.T, uk30Var.U, uk30Var.V, -1073290992, 143);
                fVar22.R = msg;
                fVar22.S = nestedMsg2;
                return new nsr0(fVar22, ir30Var);
            }
        } else {
            z2 = z11;
            cVar = a2;
            z3 = true;
        }
        z4 = false;
        BubbleColors c3 = vk30Var.c(Fb, a3, z3);
        BubbleColors c22 = vk30Var.c(Fb, a3, false);
        qtd0 Bb3 = profilesInfo3.Bb(msg.getFrom());
        StringBuilder sb2 = new StringBuilder();
        z5 = msg instanceof MsgFromChannel;
        if (z5) {
        }
        if (charSequence3 != null) {
        }
        if (!(charSequence3 instanceof Spanned)) {
        }
        if (spanned == null) {
        }
        str2 = str;
        bw30.a.getClass();
        b = bw30.b(msg);
        if (nestedMsg2 != null) {
        }
        boolean e22 = uk30Var.e(a3, false);
        gl8 b222 = vk30Var.b(c22, i3, Ib);
        gl8 b322 = vk30Var.b(c3, i3, Ib);
        ev9 ev9Var22 = uk30Var.R;
        if (adapterEntryType == AdapterEntryType.TYPE_CAROUSEL) {
        }
        profilesInfo2 = profilesInfo;
        z7 = a3;
        j = b;
        z8 = false;
        boolean z1222 = uk30Var.t;
        boolean z1322 = uk30Var.u;
        boolean z1422 = uk30Var.v;
        boolean z1522 = uk30Var.q;
        boolean Jb22 = msg.Jb(peer);
        qtd0 Bb222 = profilesInfo2.Bb(z6 ? ((MsgFromChannel) msg).O : msg.getFrom());
        if (attach != null) {
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar222 = new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f(adapterEntryType, charSequence3, i3, y060Var, e22, z2, j, cVar, aVar, bubbleColors, bubbleColors2, z7, b322, b222, z8, z9, z1322, z1422, z10, z1522, Jb22, Bb222, ev9Var22, sb2.toString(), charSequence2, str2, uk30Var.T, uk30Var.U, uk30Var.V, -1073290992, 143);
        fVar222.R = msg;
        fVar222.S = nestedMsg2;
        return new nsr0(fVar222, ir30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final nsr0 b(AdapterEntryType adapterEntryType, Msg msg, NestedMsg nestedMsg, int i, List list, CharSequence charSequence, uk30 uk30Var) {
        Object obj;
        NestedMsg nestedMsg2;
        Iterator it;
        AttachVideoMsg D6;
        DisplayNameFormatter displayNameFormatter = uk30Var.f0;
        Peer peer = uk30Var.l;
        ProfilesInfo profilesInfo = uk30Var.e;
        boolean z = false;
        switch (a.$EnumSwitchMapping$0[adapterEntryType.ordinal()]) {
            case 1:
                return y(msg, charSequence == null ? "" : charSequence, i, null, list, uk30Var, 8);
            case 2:
                AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_SERVICE_UNSUPPORTED;
                return a(new ls30(new jr30(0), i, adapterEntryType2, null), msg, null, adapterEntryType2, i, null, null, false, null, uk30Var, 480);
            case 3:
                return l(i, null, msg, uk30Var);
            case 4:
                AdapterEntryType adapterEntryType3 = AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL_REDESIGNED;
                return a(new lt30((com.vk.im.engine.models.messages.a) msg, adapterEntryType3), msg, null, adapterEntryType3, 0, null, null, false, nestedMsg, uk30Var, PsExtractor.VIDEO_STREAM_MASK);
            case 5:
                AdapterEntryType adapterEntryType4 = AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL;
                lt30 lt30Var = new lt30((com.vk.im.engine.models.messages.a) msg, adapterEntryType4);
                lt30Var.d = null;
                return a(lt30Var, msg, null, adapterEntryType4, i, null, null, false, nestedMsg, uk30Var, 224);
            case 6:
                AdapterEntryType adapterEntryType5 = AdapterEntryType.TYPE_EMPTY;
                return a(new aq30(new jr30(0), i, msg.b, adapterEntryType5, null), msg, null, adapterEntryType5, i, null, null, false, null, uk30Var, 480);
            case 7:
                AdapterEntryType adapterEntryType6 = AdapterEntryType.TYPE_KEYBOARD;
                return a(new lr30(uk30Var.q, msg instanceof com.vk.im.engine.models.messages.a ? ((com.vk.im.engine.models.messages.a) msg).V2() : null, msg.c, msg.d, adapterEntryType6), msg, null, adapterEntryType6, i, null, null, false, null, uk30Var, 480);
            case 8:
                boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, peer);
                AdapterEntryType adapterEntryType7 = AdapterEntryType.TYPE_CAROUSEL;
                boolean z2 = msg instanceof com.vk.im.engine.models.messages.a;
                qo30 qo30Var = new qo30(uk30Var.e(a2, false), z2 ? !msg.i : false, z2 ? ((com.vk.im.engine.models.messages.a) msg).U4() : null, msg.c, msg.d, a2, adapterEntryType7);
                qo30Var.i = msg;
                return a(qo30Var, msg, null, adapterEntryType7, i, null, null, false, null, uk30Var, 480);
            case 9:
                return w(msg, i, uk30Var);
            case 10:
                Peer peer2 = nestedMsg != null ? nestedMsg.f : null;
                qtd0 Bb = profilesInfo.Bb(peer2);
                Integer valueOf = (nestedMsg == null || nestedMsg.p) ? null : Integer.valueOf(nestedMsg.d);
                if (peer2 == null) {
                    peer2 = Peer.Unknown.e;
                }
                Peer peer3 = peer2;
                long j = nestedMsg != null ? nestedMsg.m : 0L;
                String name = Bb != null ? Bb.name() : null;
                String str = name == null ? "" : name;
                displayNameFormatter.getClass();
                return a(new qq30(peer3, j, str, displayNameFormatter.e(Bb, UserNameCase.NOM), Bb != null ? Bb.C8() : null, Bb != null ? Bb.n9() : false, valueOf), msg, null, AdapterEntryType.TYPE_FWD_SENDER, i, null, null, false, nestedMsg, uk30Var, 224);
            case 11:
                com.vk.im.engine.models.messages.a aVar = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
                return a(new oq30(aVar != null ? aVar.U9() : 0), msg, null, AdapterEntryType.TYPE_FWD_HEADER, 1, null, null, false, nestedMsg, uk30Var, 224);
            case 12:
                CharSequence charSequence2 = charSequence == null ? "" : charSequence;
                if (msg instanceof MsgFromUser) {
                    ucp ucpVar = ucp.a;
                    z = com.vk.im.ui.components.viewcontrollers.msg_list.a.a((MsgFromUser) msg);
                }
                boolean z3 = z;
                AdapterEntryType adapterEntryType8 = AdapterEntryType.TYPE_FWD_TEXT;
                return a(new au30(uk30Var.I, uk30Var.J, charSequence2, z3, 1, msg.b, k9q0.n(msg), adapterEntryType8, uk30Var.V, null, 10289), msg, null, adapterEntryType8, 1, charSequence2, null, z3, null, uk30Var, 320);
            case 13:
                if (nestedMsg == null) {
                    throw new IllegalStateException("Nested forward message is null");
                }
                ArrayList arrayList = nestedMsg.k;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        obj = arrayList.get(i2);
                        if (((NestedMsg) obj).b == NestedMsg.Type.FWD) {
                            nestedMsg2 = (NestedMsg) obj;
                            if (nestedMsg2 != null || (r2 = nestedMsg2.f) == null) {
                                Peer peer4 = nestedMsg.f;
                            }
                            Peer peer5 = peer4;
                            qtd0 Bb2 = profilesInfo.Bb(peer5);
                            NestedMsg nestedMsg3 = nestedMsg2 == null ? nestedMsg2 : null;
                            CharSequence a3 = nestedMsg3 == null ? uk30Var.c0.a(nestedMsg3) : null;
                            Set a4 = d.a.a(msg, Integer.valueOf(nestedMsg.c));
                            int i3 = nestedMsg.c;
                            ImageList C8 = Bb2 == null ? Bb2.C8() : null;
                            String name2 = Bb2 == null ? Bb2.name() : null;
                            String str2 = name2 != null ? "" : name2;
                            CharSequence i4 = displayNameFormatter.i(Bb2);
                            boolean k8 = nestedMsg2 != null ? nestedMsg2.k8() : false;
                            Set set = a4;
                            List O0 = j5g.O0(set);
                            ArrayList arrayList2 = new ArrayList();
                            it = set.iterator();
                            while (it.hasNext()) {
                                qtd0 Bb3 = profilesInfo.Bb((Peer) it.next());
                                ImageList C82 = Bb3 != null ? Bb3.C8() : null;
                                if (C82 != null) {
                                    arrayList2.add(C82);
                                }
                            }
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d dVar = new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d(i3, peer5, C8, str2, i4, k8, a3, O0, arrayList2, nestedMsg.U9(), false);
                            dVar.n = msg;
                            return a(dVar, msg, null, AdapterEntryType.TYPE_NESTED_FORWARD, 1, null, list, false, nestedMsg, uk30Var, 160);
                        }
                    }
                }
                obj = null;
                nestedMsg2 = (NestedMsg) obj;
                if (nestedMsg2 != null) {
                }
                Peer peer42 = nestedMsg.f;
                Peer peer52 = peer42;
                qtd0 Bb22 = profilesInfo.Bb(peer52);
                if (nestedMsg2 == null) {
                }
                if (nestedMsg3 == null) {
                }
                Set a42 = d.a.a(msg, Integer.valueOf(nestedMsg.c));
                int i32 = nestedMsg.c;
                if (Bb22 == null) {
                }
                if (Bb22 == null) {
                }
                if (name2 != null) {
                }
                CharSequence i42 = displayNameFormatter.i(Bb22);
                boolean k82 = nestedMsg2 != null ? nestedMsg2.k8() : false;
                Set set2 = a42;
                List O02 = j5g.O0(set2);
                ArrayList arrayList22 = new ArrayList();
                it = set2.iterator();
                while (it.hasNext()) {
                }
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d dVar2 = new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d(i32, peer52, C8, str2, i42, k82, a3, O02, arrayList22, nestedMsg.U9(), false);
                dVar2.n = msg;
                return a(dVar2, msg, null, AdapterEntryType.TYPE_NESTED_FORWARD, 1, null, list, false, nestedMsg, uk30Var, 160);
            case 14:
                boolean Ib = msg.Ib();
                boolean a5 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, peer);
                long Fb = msg.Fb();
                vk30 vk30Var = uk30Var.a;
                BubbleColors c = vk30Var.c(Fb, a5, true);
                BubbleColors c2 = vk30Var.c(Fb, a5, false);
                com.vk.im.engine.models.messages.a aVar2 = nestedMsg != null ? nestedMsg : msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
                Integer valueOf2 = (aVar2 == null || !aVar2.F0() || (D6 = aVar2.D6()) == null) ? null : Integer.valueOf(D6.c);
                MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
                NestedMsg pa = msgFromUser != null ? msgFromUser.pa() : null;
                boolean z4 = (pa == null || !pa.k8() || pa.o) ? false : true;
                AdapterEntryType adapterEntryType9 = AdapterEntryType.TYPE_REPLY;
                return a(new it30(null, msg, i, nestedMsg, cdi.z(valueOf2, uk30Var.b), uk30Var.d, a5, c.D, c2.D, vk30Var.b(c, i, Ib), vk30Var.b(c2, i, Ib), new ProfilesSimpleInfo(), uk30Var.S, Fb, valueOf2, msg.b, Ib, z4, adapterEntryType9), msg, null, adapterEntryType9, i, null, null, false, nestedMsg, uk30Var, 224);
            case 15:
                qtd0 Bb4 = profilesInfo.Bb(msg.getFrom());
                AdapterEntryType adapterEntryType10 = AdapterEntryType.TYPE_USER_NAME;
                return a(new hu30(msg.getFrom(), Bb4, Bb4 != null && o25.b(o25.a()) && Bb4.t1() && Bb4.q9().b, adapterEntryType10), msg, null, adapterEntryType10, i, null, null, false, null, uk30Var, 480);
            case 16:
                AdapterEntryType adapterEntryType11 = AdapterEntryType.TYPE_DELETED;
                Object a0 = j5g.a0(list);
                return a(new np30(new jr30(0), i, list.size(), a0 instanceof AttachDeleted ? (AttachDeleted) a0 : null, adapterEntryType11, null), msg, null, adapterEntryType11, i, null, null, false, null, uk30Var, 480);
            case 17:
                boolean z5 = msg instanceof MsgFromUser;
                boolean z6 = z5 || (msg instanceof MsgFromChannel);
                AdapterEntryType adapterEntryType12 = AdapterEntryType.TYPE_BOX_PHOTO_VIDEO;
                return a(new no30(false, false, i, msg, new jr30(0), list, nestedMsg, uk30Var.P, msg.b, adapterEntryType12, null, z5 ? ((com.vk.im.engine.models.messages.a) msg).A4(false) : false, z6), msg, null, adapterEntryType12, i, null, null, false, nestedMsg, uk30Var, 224);
            case 18:
                AdapterEntryType adapterEntryType13 = AdapterEntryType.TYPE_BOX_DOC_PREVIEW;
                return a(new lo30(false, false, i, msg, new jr30(0), list, nestedMsg, msg.b, uk30Var.P, adapterEntryType13, null), msg, null, adapterEntryType13, i, null, null, false, nestedMsg, uk30Var, 224);
            case 19:
                return f(i, null, msg, charSequence != null ? charSequence : "", uk30Var);
            default:
                throw new UnsupportedOperationException("Unknown type " + adapterEntryType + JwtParser.SEPARATOR_CHAR);
        }
    }

    public static nsr0 c(AdapterEntryType adapterEntryType, Msg msg, NestedMsg nestedMsg, int i, List list, CharSequence charSequence, uk30 uk30Var, int i2) {
        if ((i2 & 4) != 0) {
            nestedMsg = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        if ((i2 & 16) != 0) {
            list = EmptyList.b;
        }
        if ((i2 & 32) != 0) {
            charSequence = null;
        }
        return b(adapterEntryType, msg, nestedMsg, i, list, charSequence, uk30Var);
    }

    public static final nsr0 d(AdapterEntryType adapterEntryType, Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachArtist attachArtist = (AttachArtist) attach;
        StringBuilder sb = new StringBuilder();
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar = uk30Var.h0;
        if (aVar != null) {
            aVar.a.getString(R.string.vkim_msg_list_artist_redesign_desc);
        }
        String r = rli0.r(rli0.y(rli0.j(new ulp0(new i5g(attachArtist.l), new zsw(10)), new b4r(17)), 2), ", ", null, 62);
        if (!drm0.N(r)) {
            sb.append(" · ".concat(r));
        }
        String sb2 = sb.toString();
        boolean z = msg instanceof MsgFromUser;
        boolean z2 = z || (msg instanceof MsgFromChannel);
        jr30 jr30Var = new jr30(0);
        String str = attachArtist.c;
        boolean z3 = attachArtist.e;
        ImageList imageList = attachArtist.d;
        List<MusicTrack> list = attachArtist.k;
        MsgFromUser msgFromUser = z ? (MsgFromUser) msg : null;
        boolean p3 = msgFromUser != null ? msgFromUser.p3() : false;
        MsgFromUser msgFromUser2 = z ? (MsgFromUser) msg : null;
        boolean k8 = msgFromUser2 != null ? msgFromUser2.k8() : false;
        kq4 kq4Var = uk30Var.K;
        Peer peer = uk30Var.h;
        int i2 = msg.b;
        MsgFromUser msgFromUser3 = z ? (MsgFromUser) msg : null;
        xn30 xn30Var = new xn30(jr30Var, str, i2, sb2, peer, z3, imageList, list, kq4Var, adapterEntryType, null, z, z2, false, k8, p3, false, false, i, msgFromUser3 != null ? msgFromUser3.A4(false) : false);
        xn30Var.v = msg;
        xn30Var.w = nestedMsg;
        xn30Var.x = attach;
        return a(xn30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nsr0 e(AdapterEntryType adapterEntryType, Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachAudio attachAudio = (AttachAudio) attach;
        boolean z = msg instanceof MsgFromUser;
        boolean z2 = msg instanceof MsgFromChannel;
        com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) (nestedMsg == 0 ? msg : nestedMsg);
        MusicTrack musicTrack = attachAudio.b;
        String str = musicTrack.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i2 = musicTrack.g;
        long j = attachAudio.f;
        Peer peer = uk30Var.h;
        kq4 kq4Var = uk30Var.K;
        MsgFromUser msgFromUser = z ? (MsgFromUser) msg : null;
        boolean p3 = msgFromUser != null ? msgFromUser.p3() : false;
        MsgFromUser msgFromUser2 = z ? (MsgFromUser) msg : null;
        boolean k8 = msgFromUser2 != null ? msgFromUser2.k8() : false;
        boolean z3 = z || z2;
        MusicTrack musicTrack2 = attachAudio.b;
        int i3 = msg.b;
        MsgFromUser msgFromUser3 = z ? (MsgFromUser) msg : null;
        co30 co30Var = new co30(musicTrack2, new jr30(0), peer, kq4Var, aVar, str2, i2, j, i3, z, z3, false, k8, p3, adapterEntryType, null, false, false, i, msgFromUser3 != null ? msgFromUser3.A4(false) : false);
        co30Var.v = msg;
        co30Var.w = nestedMsg;
        co30Var.x = attach;
        return a(co30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 f(int i, Attach attach, Msg msg, CharSequence charSequence, uk30 uk30Var) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_BLOCKED_POST;
        jo30 jo30Var = new jo30(uk30Var.I, charSequence, i, msg.b, k9q0.n(msg), adapterEntryType, false);
        jo30Var.i = attach;
        return a(jo30Var, msg, null, adapterEntryType, i, charSequence, null, false, null, uk30Var, 448);
    }

    public static final nsr0 g(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachDoc attachDoc = (AttachDoc) attach;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_DOC_PREVIEW;
        ImageList imageList = attachDoc.p;
        ImageList imageList2 = attachDoc.n;
        boolean x5 = attachDoc.x5();
        int i2 = attachDoc.b;
        String str = attachDoc.j;
        long j = attachDoc.h;
        int i3 = msg.b;
        abi0 abi0Var = uk30Var.V;
        g34 g34Var = uk30Var.P;
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        pp30 pp30Var = new pp30(false, false, i, false, msgFromUser != null ? msgFromUser.A4(false) : false, new jr30(0), g34Var, imageList, imageList2, x5, i2, str, j, i3, adapterEntryType, null, abi0Var);
        pp30Var.s = msg;
        pp30Var.t = nestedMsg;
        pp30Var.u = attach;
        return a(pp30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 h(int i, Attach attach, Msg msg, uk30 uk30Var) {
        PostDonut postDonut;
        String str;
        PostDonut.Snippet snippet;
        PostDonut.Snippet snippet2;
        if (attach instanceof AttachWall) {
            postDonut = ((AttachWall) attach).s;
        } else {
            if (!(attach instanceof AttachChannelMessage)) {
                throw new IllegalStateException("Unknown type of attach was passed for donate button: " + attach.getClass());
            }
            postDonut = ((AttachChannelMessage) attach).k;
        }
        PostDonut.Paywall paywall = postDonut != null ? postDonut.g : null;
        LinkButton linkButton = (paywall == null || (snippet2 = paywall.d) == null) ? null : snippet2.e;
        if (linkButton == null || (str = linkButton.b) == null) {
            str = (paywall == null || (snippet = paywall.d) == null) ? null : snippet.c;
            if (str == null) {
                str = "";
            }
        }
        String str2 = str;
        Action action = linkButton != null ? linkButton.c : null;
        String str3 = action instanceof ActionOpenUrl ? ((ActionOpenUrl) action).c : null;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_DONATE_BUTTON;
        return a(new tp30(new jr30(0), str2, str3, msg.d, adapterEntryType, null, i), msg, attach, adapterEntryType, i, null, null, false, null, uk30Var, 480);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r4 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final nsr0 i(int i, Attach attach, Msg msg, uk30 uk30Var) {
        PostDonut postDonut;
        String str;
        ImageList imageList;
        String str2;
        boolean z = attach instanceof AttachChannelMessage;
        if (attach instanceof AttachWall) {
            postDonut = ((AttachWall) attach).s;
        } else {
            if (!z) {
                throw new IllegalStateException("Unknown type of attach was passed for donate message: " + attach.getClass());
            }
            postDonut = ((AttachChannelMessage) attach).k;
        }
        PostDonut.Paywall paywall = postDonut != null ? postDonut.g : null;
        PostDonut.Snippet snippet = paywall != null ? paywall.d : null;
        LinkButton linkButton = snippet != null ? snippet.e : null;
        if (snippet == null || (str = snippet.c) == null) {
            str = paywall != null ? paywall.c : null;
        }
        com.vk.dto.common.Image image = snippet != null ? snippet.f : null;
        if (image != null) {
            ArrayList Fb = image.Fb();
            ArrayList arrayList = new ArrayList(c5g.u(Fb, 10));
            Iterator it = Fb.iterator();
            while (it.hasNext()) {
                ImageSize imageSize = (ImageSize) it.next();
                Image image2 = imageSize.d;
                arrayList.add(new Image(image2.b, image2.c, image2.d, imageSize.c7()));
            }
            imageList = new ImageList(new ArrayList(arrayList));
        } else {
            imageList = null;
        }
        Action action = linkButton != null ? linkButton.c : null;
        String str3 = action instanceof ActionOpenUrl ? ((ActionOpenUrl) action).c : null;
        if (linkButton != null) {
            String str4 = linkButton.b;
            str2 = str4;
        }
        str2 = "";
        CharSequence charSequence = str2;
        if (uk30Var.G.c().G()) {
            v1o v1oVar = uk30Var.d0;
            charSequence = y1o.b(v1oVar.b.parse(str2), v1oVar.a);
        }
        CharSequence charSequence2 = charSequence;
        String str5 = str == null ? "" : str;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_DONATE_PLACEHOLDER_REDESIGN;
        boolean z2 = msg.i;
        int i2 = msg.b;
        com.vk.im.engine.models.dialogs.c cVar = uk30Var.d.b;
        return a(new vp30(new jr30(0), str5, charSequence2, str3, imageList, z2, i2, z, cVar.equals(c.C1124c.c) || cVar.equals(c.g.c), adapterEntryType, null, false, false, i), msg, attach, adapterEntryType, i, null, null, false, null, uk30Var, 480);
    }

    public static final nsr0 j(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachDoc attachDoc = (AttachDoc) attach;
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        long Fb = msg.Fb();
        vk30 vk30Var = uk30Var.a;
        BubbleColors c = vk30Var.c(Fb, a2, true);
        BubbleColors c2 = vk30Var.c(Fb, a2, false);
        boolean Ib = msg.Ib();
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_DOC_SIMPLE;
        int i2 = attachDoc.b;
        boolean h0 = attachDoc.h0();
        String str = attachDoc.j;
        long j = attachDoc.h;
        DownloadState downloadState = attachDoc.f;
        String str2 = attachDoc.g;
        boolean Ib2 = msg.Ib();
        int i3 = msg.b;
        rp30 rp30Var = new rp30(new jr30(0), i, vk30Var.b(c, i, Ib), vk30Var.b(c2, i, Ib), false, i2, h0, str, j, downloadState, str2, uk30Var.P, i3, a2, Ib2, Fb, adapterEntryType, null);
        rp30Var.t = msg;
        rp30Var.u = nestedMsg;
        rp30Var.v = attach;
        return a(rp30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 k(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachVideo attachVideo = (AttachVideo) attach;
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        boolean z = msg instanceof MsgFromUser;
        boolean z2 = z || (msg instanceof MsgFromChannel);
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_EXTERNAL_VIDEO;
        int duration = attachVideo.b.getDuration();
        String platform = attachVideo.b.getPlatform();
        String str = platform == null ? "" : platform;
        String title = attachVideo.b.getTitle();
        String str2 = title == null ? "" : title;
        ImageList imageList = attachVideo.c;
        int i2 = msg.b;
        VideoRestriction O = attachVideo.b.O();
        abi0 abi0Var = uk30Var.V;
        boolean e = uk30Var.e(a2, false);
        MsgFromUser msgFromUser = z ? (MsgFromUser) msg : null;
        gq30 gq30Var = new gq30(adapterEntryType, i, e, false, false, false, null, msgFromUser != null ? msgFromUser.A4(false) : false, z2, false, i2, duration, str, str2, a2, imageList, O, new jr30(0), abi0Var);
        gq30Var.u = msg;
        gq30Var.v = nestedMsg;
        gq30Var.w = attach;
        return a(gq30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 l(int i, Attach attach, Msg msg, uk30 uk30Var) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_FWD_TIME;
        sq30 sq30Var = new sq30(new jr30(0), i, adapterEntryType, null);
        sq30Var.f = attach;
        return a(sq30Var, msg, null, adapterEntryType, i, null, null, false, null, uk30Var, 480);
    }

    public static final nsr0 m(int i, Attach attach, Msg msg, uk30 uk30Var) {
        AttachWall attachWall = (AttachWall) attach;
        String r = rli0.r(rli0.y(rli0.j(new i5g(drm0.Q(attachWall.m)), new fo20(2)), 2), "\n", null, 62);
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_FWD_WALL_POST_TEXT;
        CharSequence a2 = o040.a(uk30Var.i0, r, 14);
        com.vk.im.ui.formatters.a aVar = uk30Var.g0;
        vq30 vq30Var = new vq30(adapterEntryType, msg.b, a2, aVar != null ? aVar.c(attachWall.o) : null, uk30Var.V);
        vq30Var.g = attach;
        return a(vq30Var, msg, attach, adapterEntryType, i, null, null, false, null, uk30Var, 480);
    }

    public static final nsr0 n(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_GIF_AUTOPLAY;
        AttachDoc attachDoc = (AttachDoc) attach;
        int i2 = msg.b;
        abi0 abi0Var = uk30Var.V;
        g34 g34Var = uk30Var.P;
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        return a(new bs30(msg, new g4w(false, false, i, msgFromUser != null ? msgFromUser.A4(false) : false, msg, new jr30(0), attachDoc, i2, g34Var, adapterEntryType, null, abi0Var), nestedMsg, adapterEntryType, null), msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 o(Attach attach, Msg msg, NestedMsg nestedMsg, int i, CharSequence charSequence, uk30 uk30Var) {
        Peer peer = uk30Var.l;
        AttachGift attachGift = (AttachGift) attach;
        ProfilesSimpleInfo profilesSimpleInfo = uk30Var.f;
        qtd0 Ab = profilesSimpleInfo.Ab(Long.valueOf(msg.c));
        boolean z = Ab != null && Ab.t1() && bu00.l(Ab);
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_GIFT;
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, peer);
        long j = msg.c;
        br30 br30Var = new br30(new jr30(0), charSequence, i, (User) profilesSimpleInfo.b.get(Long.valueOf(j)), a2, j, peer.d, (z || uk30Var.B) ? false : true, adapterEntryType, null);
        br30Var.l = msg;
        br30Var.m = nestedMsg;
        br30Var.n = attach;
        return a(br30Var, msg, attachGift, adapterEntryType, i, charSequence, null, false, nestedMsg, uk30Var, PsExtractor.AUDIO_STREAM);
    }

    public static final nsr0 p(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachLink attachLink = (AttachLink) attach;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_LINK_LARGE;
        nr30 nr30Var = new nr30(new jr30(0), i, attachLink.i, attachLink.s, attachLink.o, attachLink.f, attachLink.g, attachLink.e, attachLink.u != null, attachLink.v != null, attachLink.j, adapterEntryType, null);
        nr30Var.o = msg;
        nr30Var.p = nestedMsg;
        nr30Var.q = attach;
        return a(nr30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 q(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachLink attachLink = (AttachLink) attach;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_LINK_SMALL;
        rr30 rr30Var = new rr30(new jr30(0), i, attachLink.e, attachLink.f, adapterEntryType, null);
        rr30Var.h = msg;
        rr30Var.i = nestedMsg;
        rr30Var.j = attach;
        return a(rr30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 r(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachMap attachMap = (AttachMap) attach;
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        long Fb = msg.Fb();
        boolean Ib = msg.Ib();
        vk30 vk30Var = uk30Var.a;
        BubbleColors c = vk30Var.c(Fb, a2, true);
        BubbleColors c2 = vk30Var.c(Fb, a2, false);
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_MAP;
        double d = attachMap.e;
        double d2 = attachMap.f;
        int i2 = msg.b;
        abi0 abi0Var = uk30Var.V;
        tr30 tr30Var = new tr30(false, false, i, false, null, new jr30(0), vk30Var.b(c, i, Ib), vk30Var.b(c2, i, Ib), d, d2, i2, a2, Ib, Fb, adapterEntryType, abi0Var);
        tr30Var.r = msg;
        tr30Var.s = nestedMsg;
        tr30Var.t = attach;
        return a(tr30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nsr0 s(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        boolean z;
        PostDonut postDonut;
        AttachImage attachImage = (AttachImage) attach;
        boolean z2 = msg instanceof MsgFromUser;
        boolean z3 = z2 || (msg instanceof MsgFromChannel);
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_PHOTO;
        int i2 = attachImage.b;
        ImageList imageList = attachImage.q;
        ImageList imageList2 = attachImage.r;
        PhotoRestriction photoRestriction = attachImage.v;
        long j = attachImage.e;
        UserId userId = attachImage.d;
        int i3 = msg.b;
        abi0 abi0Var = uk30Var.V;
        g34 g34Var = uk30Var.P;
        boolean A4 = z2 ? ((com.vk.im.engine.models.messages.a) msg).A4(false) : false;
        ImFeatures imFeatures = ImFeatures.BLUR_POST;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures) && attachImage.x) {
            PostDonut.Paywall paywall = null;
            MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
            if (msgFromChannel != null && (postDonut = msgFromChannel.I.g) != null) {
                paywall = postDonut.g;
            }
            if (paywall != null) {
                z = true;
                rs30 rs30Var = new rs30(false, false, i, false, false, new jr30(0), g34Var, i2, imageList, imageList2, i3, photoRestriction, j, userId, adapterEntryType, null, A4, z3, false, abi0Var, z);
                rs30Var.w = msg;
                rs30Var.x = nestedMsg;
                rs30Var.y = attach;
                return a(rs30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
            }
        }
        z = false;
        rs30 rs30Var2 = new rs30(false, false, i, false, false, new jr30(0), g34Var, i2, imageList, imageList2, i3, photoRestriction, j, userId, adapterEntryType, null, A4, z3, false, abi0Var, z);
        rs30Var2.w = msg;
        rs30Var2.x = nestedMsg;
        rs30Var2.y = attach;
        return a(rs30Var2, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        if (r3 == null) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.vk.im.engine.models.messages.MsgFromUser] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.vk.im.engine.models.messages.a] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.vk.im.engine.models.messages.MsgFromUser] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.vk.im.engine.models.messages.a] */
    /* JADX WARN: Type inference failed for: r6v18, types: [com.vk.im.engine.models.messages.MsgFromUser] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final nsr0 t(AdapterEntryType adapterEntryType, Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        mso0 bVar;
        ImageList imageList;
        List<Thumb> list;
        String str;
        String str2;
        ImageList imageList2;
        com.vk.dto.common.Image image;
        com.vk.dto.common.Image Kb;
        Artist artist;
        ChatSettings chatSettings = uk30Var.m;
        AttachPlaylist attachPlaylist = (AttachPlaylist) attach;
        boolean z = msg instanceof MsgFromUser;
        boolean z2 = z || (msg instanceof MsgFromChannel);
        String title = attachPlaylist.getTitle();
        List<Thumb> list2 = attachPlaylist.b.p;
        ImageList h = qxm0.h(list2 != null ? (Thumb) j5g.a0(list2) : null);
        ImageList h2 = qxm0.h(attachPlaylist.b.m);
        boolean j = attachPlaylist.j();
        boolean i2 = attachPlaylist.i();
        Playlist playlist = attachPlaylist.b;
        boolean z3 = playlist.k;
        String str3 = playlist.i;
        List<MusicTrack> list3 = playlist.y;
        String str4 = chatSettings != null ? chatSettings.b : null;
        if (playlist.d == 0) {
            PlaylistOwner playlistOwner = playlist.q;
            str4 = playlistOwner != null ? playlistOwner.e : null;
        } else {
            str4 = attachPlaylist.i() ? "" : "";
        }
        ucp ucpVar = ucp.a;
        String obj = ucp.i(attachPlaylist.b.h).toString();
        AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_PLAYLIST_COMPACT;
        boolean z4 = adapterEntryType == adapterEntryType2;
        if (attachPlaylist.b.d == 0 || attachPlaylist.j()) {
            imageList = h;
            bVar = new mso0.b(z4 ? 4 : 3);
        } else {
            imageList = h;
            attachPlaylist.i();
            bVar = mso0.a.a;
        }
        List<Thumb> a2 = bVar.a(attachPlaylist);
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar = uk30Var.h0;
        if (aVar != null) {
            Context context = aVar.a;
            list = a2;
            Playlist playlist2 = attachPlaylist.b;
            boolean z5 = adapterEntryType == adapterEntryType2;
            int i3 = playlist2.v;
            str = obj;
            if (xx1.u(playlist2)) {
                str2 = z5 ? playlist2.i : znk0.g(context.getString(R.string.vkim_msg_list_chat_playlist_desc), enj.f(R.plurals.vkim_msg_list_playlist_tracks, i3, context));
            } else if (!playlist2.Gb()) {
                if (playlist2.Eb()) {
                    if (z5) {
                        String string = context.getString(R.string.vkim_msg_list_album_desc);
                        String str5 = playlist2.o;
                        if (str5 == null) {
                            str5 = "";
                        }
                        str2 = znk0.g(string, str5);
                    } else {
                        str2 = znk0.g(context.getString(R.string.vkim_msg_list_album_desc), String.valueOf(playlist2.l));
                    }
                }
                str2 = "";
            } else if (z5) {
                String string2 = context.getString(R.string.vkim_msg_list_playlist_desc);
                PlaylistOwner playlistOwner2 = playlist2.q;
                String str6 = playlistOwner2 != null ? playlistOwner2.e : null;
                if (str6 == null) {
                    str6 = "";
                }
                str2 = znk0.g(string2, str6);
            } else {
                str2 = znk0.g(context.getString(R.string.vkim_msg_list_playlist_desc), enj.f(R.plurals.vkim_msg_list_playlist_tracks, i3, context));
            }
        } else {
            list = a2;
            str = obj;
            str2 = null;
        }
        String str7 = str2 != null ? str2 : "";
        if (chatSettings == null || (imageList2 = chatSettings.c) == null) {
            image = null;
            imageList2 = new ImageList(null, 1, null);
        } else {
            image = null;
        }
        if (attachPlaylist.i()) {
            List<Artist> list4 = attachPlaylist.b.r;
            if (list4 != null && (artist = (Artist) j5g.a0(list4)) != null) {
                Kb = artist.f;
            }
            Kb = image;
        } else {
            Playlist playlist3 = attachPlaylist.b;
            if (playlist3.d == 0) {
                PlaylistOwner playlistOwner3 = playlist3.q;
                if (playlistOwner3 != null) {
                    Kb = playlistOwner3.h;
                }
                Kb = image;
            } else {
                if (attachPlaylist.j()) {
                    Kb = imageList2.Kb();
                }
                Kb = image;
            }
        }
        Peer peer = uk30Var.h;
        int i4 = msg.b;
        ?? r4 = z ? (MsgFromUser) msg : image;
        boolean p3 = r4 != null ? r4.p3() : false;
        ?? r6 = z ? (MsgFromUser) msg : image;
        boolean k8 = r6 != null ? r6.k8() : false;
        kq4 kq4Var = uk30Var.K;
        ?? r5 = image;
        if (z) {
            r5 = (MsgFromUser) msg;
        }
        ts30 ts30Var = new ts30(new jr30(0), title, list, h2, imageList, j, i2, str3, list3, z3, str4, str, str7, peer, Kb, i4, kq4Var, z, z2, false, k8, p3, i, adapterEntryType, null, false, false, r5 != 0 ? r5.A4(false) : false);
        ts30Var.D = msg;
        ts30Var.E = nestedMsg;
        ts30Var.F = attach;
        return a(ts30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nsr0 u(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachSticker attachSticker = (AttachSticker) attach;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_POPUP_STICKER;
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        com.vk.im.engine.models.messages.a aVar = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
        boolean D3 = aVar != null ? aVar.D3(AttachStory.class, false) : false;
        StickerItem stickerItem = attachSticker.g;
        int i2 = msg.b;
        d2l0 d2l0Var = uk30Var.Q;
        boolean z = uk30Var.q;
        abi0 abi0Var = uk30Var.V;
        ct30 ct30Var = new ct30(null, new jr30(0), z, a2, d2l0Var, false, i, adapterEntryType, D3, i2, stickerItem, uk30Var.P, attachSticker.b, abi0Var);
        ct30Var.p = msg;
        ct30Var.q = nestedMsg;
        ct30Var.r = attach;
        return a(ct30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 v(AdapterEntryType adapterEntryType, Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        AttachVideo attachVideo = (AttachVideo) attach;
        VideoFile videoFile = attachVideo.b;
        boolean z = msg instanceof MsgFromUser;
        boolean z2 = msg instanceof MsgFromChannel;
        boolean z3 = (z2 && msg.c == videoFile.I0().b) ? false : true;
        boolean z4 = z || z2;
        int i2 = msg.b;
        boolean e = uk30Var.e(a2, false);
        abi0 abi0Var = uk30Var.V;
        String title = videoFile.getTitle();
        String P = videoFile.P();
        if (P == null) {
            P = "";
        }
        String str = P;
        int L8 = videoFile.L8();
        boolean z5 = videoFile.Y().b;
        boolean w = gpt0.w(videoFile);
        ImageList imageList = attachVideo.f;
        ImageList imageList2 = attachVideo.c;
        ImageList imageList3 = attachVideo.d;
        String platform = attachVideo.getPlatform();
        boolean v = videoFile.v();
        boolean q0 = videoFile.q0();
        boolean z0 = videoFile.z0();
        boolean c = fxc0.B().c(videoFile);
        MsgFromUser msgFromUser = z ? (MsgFromUser) msg : null;
        return a(new bs30(msg, new j4w(adapterEntryType, attachVideo, false, false, e, i, msgFromUser != null ? msgFromUser.A4(false) : false, z4, msg, a2, i2, new jr30(0), title, str, L8, z5, w, videoFile, imageList, imageList2, imageList3, platform, v, z0, q0, c, abi0Var, z3, z), nestedMsg, adapterEntryType, null), msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    public static final nsr0 w(Msg msg, int i, uk30 uk30Var) {
        boolean z;
        if (msg instanceof MsgFromUser) {
            ucp ucpVar = ucp.a;
            z = com.vk.im.ui.components.viewcontrollers.msg_list.a.a((MsgFromUser) msg);
        } else {
            z = false;
        }
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_REACTIONS;
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        boolean z2 = uk30Var.w;
        boolean z3 = uk30Var.x;
        boolean z4 = z;
        List<Integer> list = uk30Var.i;
        rxd0 rxd0Var = uk30Var.S;
        ChatSettings chatSettings = uk30Var.m;
        return a(new gt30(null, msg, new jr30(0), a2, z2, z3, list, false, z4, new ProfilesSimpleInfo(), rxd0Var, false, chatSettings != null ? chatSettings.m : false, i, c4g0.t(uk30Var.d), adapterEntryType), msg, null, adapterEntryType, i, null, null, z4, null, uk30Var, 352);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nsr0 x(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        AttachSticker attachSticker = (AttachSticker) attach;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_STICKER;
        boolean a2 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, uk30Var.l);
        com.vk.im.engine.models.messages.a aVar = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
        boolean D3 = aVar != null ? aVar.D3(AttachStory.class, false) : false;
        StickerItem stickerItem = attachSticker.g;
        int i2 = msg.b;
        st30 st30Var = new st30(null, new jr30(0), uk30Var.q, a2, uk30Var.Q, false, i, adapterEntryType, D3, i2, stickerItem, uk30Var.V);
        st30Var.n = msg;
        st30Var.o = nestedMsg;
        st30Var.p = attach;
        return a(st30Var, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nsr0 y(Msg msg, CharSequence charSequence, int i, Attach attach, List list, uk30 uk30Var, int i2) {
        boolean z;
        CharSequence charSequence2;
        ArrayList arrayList;
        Object obj;
        AttachMiniApp attachMiniApp;
        Uri g;
        Pair pair;
        Object obj2;
        Attach attach2 = (i2 & 8) != 0 ? null : attach;
        List list2 = (i2 & 16) != 0 ? EmptyList.b : list;
        boolean z2 = false;
        if (msg instanceof MsgFromUser) {
            ucp ucpVar = ucp.a;
            z = com.vk.im.ui.components.viewcontrollers.msg_list.a.a((MsgFromUser) msg);
        } else {
            z = false;
        }
        Map map = jgp.b;
        if (!list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof AttachMiniApp) {
                    arrayList2.add(obj3);
                }
            }
            if (!arrayList2.isEmpty()) {
                charSequence2 = charSequence;
                List b0 = drm0.b0(charSequence2, new char[]{' '}, 0, 6);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : b0) {
                    String str = (String) obj4;
                    ArrayList a2 = e43.a("vk.com", "vk.ru");
                    if (!a2.contains(a0a.d)) {
                        a2.add(a0a.d);
                    }
                    if (!a2.isEmpty()) {
                        Iterator it = a2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (brm0.B(str, "https://" + ((String) it.next()) + '/', false)) {
                                    arrayList3.add(obj4);
                                    break;
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    String lastPathSegment = jeq0.g(str2).getLastPathSegment();
                    if (lastPathSegment == null) {
                        arrayList = arrayList2;
                    } else {
                        if (brm0.B(lastPathSegment, MBridgeConstans.DYNAMIC_VIEW_WX_APP, z2)) {
                            String g0 = drm0.g0(lastPathSegment, MBridgeConstans.DYNAMIC_VIEW_WX_APP, lastPathSegment);
                            Iterator it3 = arrayList2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    arrayList = arrayList2;
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it3.next();
                                arrayList = arrayList2;
                                if (g0.equals(String.valueOf(((AttachMiniApp) obj2).b.b.b))) {
                                    break;
                                }
                                arrayList2 = arrayList;
                            }
                            attachMiniApp = (AttachMiniApp) obj2;
                        } else {
                            arrayList = arrayList2;
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it4.next();
                                String str3 = ((AttachMiniApp) obj).b.H;
                                if (lastPathSegment.equals((str3 == null || (g = jeq0.g(str3)) == null) ? null : g.getLastPathSegment())) {
                                    break;
                                }
                            }
                            attachMiniApp = (AttachMiniApp) obj;
                        }
                        if (attachMiniApp != null) {
                            pair = new Pair(str2, chx0.c(attachMiniApp.b));
                            if (pair == null) {
                                arrayList4.add(pair);
                            }
                            arrayList2 = arrayList;
                            z2 = false;
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                    arrayList2 = arrayList;
                    z2 = false;
                }
                map = pn00.s(arrayList4);
                Map map2 = map;
                AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_TEXT;
                au30 au30Var = new au30(uk30Var.I, uk30Var.J, charSequence2, z, i, msg.b, k9q0.n(msg), adapterEntryType, uk30Var.V, map2, 2097);
                au30Var.n = attach2;
                return a(au30Var, msg, null, adapterEntryType, i, charSequence, null, z, null, uk30Var, 320);
            }
        }
        charSequence2 = charSequence;
        Map map22 = map;
        AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_TEXT;
        au30 au30Var2 = new au30(uk30Var.I, uk30Var.J, charSequence2, z, i, msg.b, k9q0.n(msg), adapterEntryType2, uk30Var.V, map22, 2097);
        au30Var2.n = attach2;
        return a(au30Var2, msg, null, adapterEntryType2, i, charSequence, null, z, null, uk30Var, 320);
    }

    public static final nsr0 z(Attach attach, Msg msg, NestedMsg nestedMsg, int i, uk30 uk30Var) {
        MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType msgPartTwoRowSnippetItemType;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType msgPartTwoRowSnippetItemType2 = MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType.Unknown;
        if (attach instanceof AttachWall) {
            str = ((AttachWall) attach).m;
            msgPartTwoRowSnippetItemType = MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType.AttachWall;
            str2 = "";
        } else if (attach instanceof AttachPoll) {
            str2 = ((AttachPoll) attach).d.d;
            msgPartTwoRowSnippetItemType = MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType.AttachPoll;
            str = "";
        } else {
            if (attach instanceof AttachHighlight) {
                Narrative narrative = ((AttachHighlight) attach).b;
                boolean z2 = narrative.h;
                Owner owner = narrative.f;
                String str5 = owner != null ? owner.h : null;
                String str6 = owner != null ? owner.c : null;
                msgPartTwoRowSnippetItemType = MsgPartTwoRowSnippetItem.MsgPartTwoRowSnippetItemType.AttachHighlight;
                z = z2;
                str = "";
                str2 = str;
                str3 = str6;
                str4 = str5;
                AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_TWO_ROW_SNIPPET;
                MsgPartTwoRowSnippetItem msgPartTwoRowSnippetItem = new MsgPartTwoRowSnippetItem(new jr30(0), i, str, str2, z, str4, str3, msgPartTwoRowSnippetItemType, adapterEntryType, null);
                msgPartTwoRowSnippetItem.l = msg;
                msgPartTwoRowSnippetItem.m = nestedMsg;
                msgPartTwoRowSnippetItem.n = attach;
                return a(msgPartTwoRowSnippetItem, msg, attach, adapterEntryType, i, null, null, false, nestedMsg, uk30Var, 224);
            }
            msgPartTwoRowSnippetItemType = msgPartTwoRowSnippetItemType2;
            str = "";
            str2 = str;
        }
        z = false;
        str4 = null;
        str3 = null;
        AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_TWO_ROW_SNIPPET;
        MsgPartTwoRowSnippetItem msgPartTwoRowSnippetItem2 = new MsgPartTwoRowSnippetItem(new jr30(0), i, str, str2, z, str4, str3, msgPartTwoRowSnippetItemType, adapterEntryType2, null);
        msgPartTwoRowSnippetItem2.l = msg;
        msgPartTwoRowSnippetItem2.m = nestedMsg;
        msgPartTwoRowSnippetItem2.n = attach;
        return a(msgPartTwoRowSnippetItem2, msg, attach, adapterEntryType2, i, null, null, false, nestedMsg, uk30Var, 224);
    }
}

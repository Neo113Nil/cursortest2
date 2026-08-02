package xsna;

import androidx.car.app.hardware.common.CarZone;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhStyle;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import ru.ok.android.api.json.JsonToken;

/* compiled from: VhStyleHelper.kt */
/* loaded from: classes2.dex */
public final class mvr0 {

    /* compiled from: VhStyleHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdapterEntryType.values().length];
            try {
                iArr[AdapterEntryType.TYPE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdapterEntryType.TYPE_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_COLLAPSE_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DELETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MSG_TRANSCRIPT_RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_WALL_POST_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEOMSG_TRANSCRIPT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_OWNER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_TEXT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PHOTO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEO.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AdapterEntryType.TYPE_EXTERNAL_VIDEO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEO_MSG.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AdapterEntryType.TYPE_BOX_PHOTO_VIDEO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MAP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_PHOTO_VIDEO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC_PREVIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GIFT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DOC_PREVIEW.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GIF_AUTOPLAY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEO_AUTOPLAY.ordinal()] = 24;
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
                iArr[AdapterEntryType.TYPE_BOX_DOC_PREVIEW.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[AdapterEntryType.TYPE_STICKER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[AdapterEntryType.TYPE_UGC_STICKER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[AdapterEntryType.TYPE_POPUP_STICKER.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GRAFFITI.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[AdapterEntryType.TYPE_POLL.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ARTICLE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_PLACEHOLDER.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DONATE_PLACEHOLDER_REDESIGN.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[AdapterEntryType.TYPE_QUESTION.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[AdapterEntryType.TYPE_NESTED_FORWARD.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VMOJI_PACK_LINK.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LINK_LARGE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LINK_EXTERNAL_MARKET.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MARKET_LARGE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PLAYLIST.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ARTIST.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[AdapterEntryType.TYPE_STORY.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[AdapterEntryType.TYPE_NESTED_STORY.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PODCAST_EPISODE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CURATOR.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LINK_PRODUCT.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[AdapterEntryType.TYPE_EVENT.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MINI_APP.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DONUT_LINK.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIOMSG.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[AdapterEntryType.TYPE_HIGHLIGHT.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VMOJI_CHARACTER_LINK.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[AdapterEntryType.TYPE_APP_ACTION.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MARKET_BLOCKED.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ROOM.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[AdapterEntryType.TYPE_SERVICE_UNSUPPORTED.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIO.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIO_COMPACT.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_REPLY.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[AdapterEntryType.TYPE_TWO_ROW_SNIPPET.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DOC_SIMPLE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LINK_SMALL.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MARKET_SMALL.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[AdapterEntryType.TYPE_UNSUPPORTED.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CALL.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GROUP_CALL.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[AdapterEntryType.TYPE_REPLY.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO_COMPACT.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PODCAST_EPISODE_RESTRICTED.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_SENDER.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_TIME.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_BUTTON.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL_REDESIGNED.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[AdapterEntryType.TYPE_KEYBOARD.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CAROUSEL.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DISAPPEARED.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WIDGET.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PLAYLIST_COMPACT.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ARTIST_COMPACT.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIEWS_AND_TIME.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[AdapterEntryType.TYPE_COMMENTS_BUTTON.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DONATE_BUTTON.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_HEADER.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[AdapterEntryType.TYPE_USER_NAME.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[AdapterEntryType.TYPE_REACTIONS.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_POST_HEADER.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[AdapterEntryType.TYPE_BLOCKED_POST.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_CHANNEL_MSG_HEADER.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_CHANNEL_MSG_UNAVAILABLE.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FAKE_NEWS.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final VhStyle a(AdapterEntryType adapterEntryType) {
        switch (a.$EnumSwitchMapping$0[adapterEntryType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return VhStyle.AUDIOMSG_TRANSCRIPT;
            case 10:
                return VhStyle.VIDEOMSG_TRANSCRIPT;
            case 11:
                return VhStyle.WALLPOST_HEADER;
            case 12:
                return VhStyle.TEXT;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                return VhStyle.IMAGE;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return VhStyle.SNIPPET;
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                return VhStyle.TWO_LINE;
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                return VhStyle.FWD_SENDER;
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                return VhStyle.FWD_TIME;
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                return VhStyle.BUTTON;
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
            case 79:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
            case IMAGES_IMAGE_LOADED_VALUE:
            case 82:
            case 83:
            case 84:
            case 85:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                return VhStyle.EMPTY;
            case 87:
            case 88:
                return VhStyle.HEADER;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return VhStyle.REACTIONS;
            case 90:
                return VhStyle.AUDIOMSG_TRANSCRIPT;
            case JsonToken.BEGIN_ARRAY /* 91 */:
                return VhStyle.BLOCKED;
            case 92:
                return VhStyle.CHANNEL_MSG_HEADER;
            case JsonToken.END_ARRAY /* 93 */:
                return VhStyle.CHANNEL_MSG_UNAVAILABLE;
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                return VhStyle.FAKE_NEWS;
            default:
                throw new IllegalArgumentException("Unknown viewType: " + adapterEntryType);
        }
    }
}

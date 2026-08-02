package xsna;

import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.dto.music.AudioStream;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.playback.PlayableType;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningEvent;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningNavInfo;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningPlayEvent;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningStopEvent;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioAdvListeningItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioAudioListeningItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioBookListeningItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioListeningItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPodcastListeningItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioRadioListeningItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.agl0;
import xsna.fi90;
import xsna.kw40;
import xsna.xua0;

/* compiled from: PayloadBuilder.kt */
/* loaded from: classes3.dex */
public final class hs90 {
    public final fi90 a;

    /* compiled from: PayloadBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayableType.values().length];
            try {
                iArr[PlayableType.MUSIC_TRACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayableType.SNIPPET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hs90(fi90 fi90Var) {
        this.a = fi90Var;
    }

    public final CommonAudioStat$TypeAudioListeningItem a(iwa0 iwa0Var) {
        CommonAudioStat$TypeAudioListeningItem.RepeatMode repeatMode;
        CommonAudioStat$TypeAudioListeningItem.StreamingType streamingType;
        CommonAudioStat$TypeAudioListeningItem.RepeatMode repeatMode2;
        String str;
        CommonAudioStat$AudioListeningStopEvent.Subtype subtype;
        CommonAudioStat$AudioListeningEvent a2;
        CommonAudioStat$TypeAudioAudioListeningItem.ContentType contentType;
        String string;
        String str2;
        String string2;
        String str3;
        String str4;
        Uri g;
        CommonAudioStat$AudioListeningPlayEvent.Subtype subtype2;
        q4b0 q4b0Var = iwa0Var.b.b;
        String str5 = q4b0Var.a.y;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        kw40 kw40Var = iwa0Var.a;
        mw40 mw40Var = kw40Var.a;
        long j = mw40Var.c;
        long j2 = mw40Var.d;
        boolean z = iwa0Var.j;
        int i = (int) ((z && (kw40Var instanceof kw40.c)) ? q4b0Var.d / 1000 : mw40Var.a / 1000);
        int i2 = (int) (kw40Var instanceof kw40.b ? mw40Var.a / 1000 : mw40Var.b / 1000);
        String str7 = iwa0Var.d;
        int i3 = (z && ((kw40Var instanceof kw40.b) || (kw40Var instanceof kw40.c))) ? 100 : (int) (iwa0Var.e * 100);
        int i4 = (int) (iwa0Var.g * 100);
        CommonAudioStat$TypeAudioListeningItem.Shuffle shuffle = iwa0Var.h ? CommonAudioStat$TypeAudioListeningItem.Shuffle.ON : CommonAudioStat$TypeAudioListeningItem.Shuffle.OFF;
        int i5 = fi90.a.$EnumSwitchMapping$0[iwa0Var.i.ordinal()];
        if (i5 == 1) {
            repeatMode = CommonAudioStat$TypeAudioListeningItem.RepeatMode.OFF;
        } else if (i5 == 2) {
            repeatMode = CommonAudioStat$TypeAudioListeningItem.RepeatMode.ONE;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            repeatMode = CommonAudioStat$TypeAudioListeningItem.RepeatMode.ALL;
        }
        CommonAudioStat$TypeAudioListeningItem.Autorecoms autorecoms = CommonAudioStat$TypeAudioListeningItem.Autorecoms.OFF;
        c63 c63Var = c63.a;
        CommonAudioStat$TypeAudioListeningItem.AppState appState = !c63.f ? CommonAudioStat$TypeAudioListeningItem.AppState.BACKGROUND_STATE : CommonAudioStat$TypeAudioListeningItem.AppState.ACTIVE_STATE;
        fi90 fi90Var = this.a;
        if (iwa0Var.f) {
            boolean a3 = fi90Var.d.d().a(iwa0Var.b.b.a);
            com.vk.core.utils.newtork.b.a.getClass();
            streamingType = (a3 && com.vk.core.utils.newtork.b.d()) ? CommonAudioStat$TypeAudioListeningItem.StreamingType.ONLINE_CACHE : a3 ? CommonAudioStat$TypeAudioListeningItem.StreamingType.OFFLINE : CommonAudioStat$TypeAudioListeningItem.StreamingType.ONLINE;
        } else {
            streamingType = CommonAudioStat$TypeAudioListeningItem.StreamingType.ONLINE;
        }
        CommonAudioStat$TypeAudioListeningItem.StreamingType streamingType2 = streamingType;
        CommonAudioStat$AudioListeningNavInfo l = uzp.l(iwa0Var.c, iwa0Var.b.b);
        CommonAudioStat$TypeAudioListeningItem.ListeningType listeningType = CommonAudioStat$TypeAudioListeningItem.ListeningType.TYPE_AUDIO_AUDIO_LISTENING_ITEM;
        fi90 fi90Var2 = this.a;
        kw40 kw40Var2 = iwa0Var.a;
        cwa0 cwa0Var = fi90Var2.e;
        if (kw40Var2 instanceof kw40.b) {
            xua0 xua0Var = ((kw40.b) kw40Var2).b;
            CommonAudioStat$AudioListeningPlayEvent.Type type = CommonAudioStat$AudioListeningPlayEvent.Type.START;
            repeatMode2 = repeatMode;
            if (xua0Var.equals(xua0.e.a)) {
                subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.PLAY_BTN;
            } else if (xua0Var.equals(xua0.f.a)) {
                subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.REPEAT;
            } else if (xua0Var.equals(xua0.h.a)) {
                subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.MIX_AND_PLAY_BTN;
            } else if (xua0Var.equals(xua0.a.a)) {
                subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.SESSION_TERMINATED_AUTOSTART;
            } else if (xua0Var.equals(xua0.d.a)) {
                subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.HEARTBEAT;
            } else if (xua0Var instanceof xua0.c) {
                subtype2 = ((xua0.c) xua0Var).a == 0 ? CommonAudioStat$AudioListeningPlayEvent.Subtype.FASTPLAY_LIST_BTN : CommonAudioStat$AudioListeningPlayEvent.Subtype.FASTPLAY_AUDIO_BTN;
            } else if (xua0Var instanceof xua0.b) {
                subtype2 = ((xua0.b) xua0Var).a ? CommonAudioStat$AudioListeningPlayEvent.Subtype.AUTOPLAY_ERROR : CommonAudioStat$AudioListeningPlayEvent.Subtype.AUTOPLAY;
            } else {
                if (xua0Var instanceof xua0.k) {
                    int i6 = ((xua0.k) xua0Var).a;
                    if (i6 == 0) {
                        str = str6;
                        subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.VOICE;
                    } else if (i6 == 1) {
                        str = str6;
                        subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.NEXT_VOICE;
                    } else if (i6 != 2) {
                        L l2 = L.a;
                        l2.getClass();
                        if (L.m(LoggerOutputTarget.NONE)) {
                            str = str6;
                        } else {
                            str = str6;
                            L.u(l2, L.LogType.e, new Object[]{lhg.a(i6, "Unknown event trigger voice type: ")});
                        }
                        subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.VOICE;
                    } else {
                        str = str6;
                        subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.PREV_VOICE;
                    }
                } else {
                    str = str6;
                    if (xua0Var instanceof xua0.i) {
                        int i7 = ((xua0.i) xua0Var).a;
                        if (i7 == 0) {
                            subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.NEXT_BTN;
                        } else if (i7 == 1) {
                            subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.PREV_BTN;
                        } else if (i7 == 2) {
                            subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.NEXT_BY_SYSTEM;
                        } else if (i7 != 3) {
                            L l3 = L.a;
                            l3.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l3, L.LogType.e, new Object[]{lhg.a(i7, "Unknown event trigger skip type: ")});
                            }
                            subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.NEXT_BTN;
                        } else {
                            subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.PREV_BY_SYSTEM;
                        }
                    } else if (xua0Var instanceof xua0.g) {
                        xua0.g gVar = (xua0.g) xua0Var;
                        int i8 = gVar.b;
                        int i9 = gVar.a;
                        boolean z2 = i8 == 0;
                        if (i9 == 0) {
                            subtype2 = z2 ? CommonAudioStat$AudioListeningPlayEvent.Subtype.PULL_SLIDER_FORWARD : CommonAudioStat$AudioListeningPlayEvent.Subtype.PULL_SLIDER_BACK;
                        } else if (i9 != 1) {
                            L l4 = L.a;
                            l4.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l4, L.LogType.w, new Object[]{lhg.a(i9, "Unknown event trigger seek type: ")});
                            }
                            subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.PULL_SLIDER_FORWARD;
                        } else {
                            subtype2 = z2 ? CommonAudioStat$AudioListeningPlayEvent.Subtype.SEEK_TAP_FORWARD : CommonAudioStat$AudioListeningPlayEvent.Subtype.SEEK_TAP_BACK;
                        }
                    } else {
                        if (!xua0Var.equals(xua0.j.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        subtype2 = CommonAudioStat$AudioListeningPlayEvent.Subtype.UNHANDLED_ON_CLIENT;
                    }
                }
                a2 = cwa0.a(new CommonAudioStat$AudioListeningPlayEvent(type, subtype2));
            }
            str = str6;
            a2 = cwa0.a(new CommonAudioStat$AudioListeningPlayEvent(type, subtype2));
        } else {
            repeatMode2 = repeatMode;
            str = str6;
            if (kw40Var2 instanceof kw40.a) {
                a2 = cwa0.a(new CommonAudioStat$AudioListeningStopEvent(CommonAudioStat$AudioListeningStopEvent.Type.PAUSE, cwa0Var.a.a(((kw40.a) kw40Var2).b)));
            } else {
                if (!(kw40Var2 instanceof kw40.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                agl0 agl0Var = ((kw40.c) kw40Var2).b;
                CommonAudioStat$AudioListeningStopEvent.Type type2 = CommonAudioStat$AudioListeningStopEvent.Type.END;
                if (agl0Var.equals(agl0.d.a)) {
                    subtype = CommonAudioStat$AudioListeningStopEvent.Subtype.ERROR;
                } else if (agl0Var.equals(agl0.c.a)) {
                    subtype = CommonAudioStat$AudioListeningStopEvent.Subtype.AUTOPLAY;
                } else if (agl0Var.equals(agl0.e.a)) {
                    subtype = CommonAudioStat$AudioListeningStopEvent.Subtype.REPEAT;
                } else if (agl0Var.equals(agl0.a.a)) {
                    subtype = CommonAudioStat$AudioListeningStopEvent.Subtype.CHANGE_SOURCE;
                } else if (agl0Var.equals(agl0.b.a)) {
                    subtype = CommonAudioStat$AudioListeningStopEvent.Subtype.CLOSE;
                } else if (agl0Var instanceof agl0.f) {
                    int i10 = ((agl0.f) agl0Var).a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    L l5 = L.a;
                                    l5.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l5, L.LogType.e, new Object[]{lhg.a(i10, "Unknown event trigger skip type: ")});
                                    }
                                    subtype = CommonAudioStat$AudioListeningStopEvent.Subtype.NEXT;
                                }
                            }
                        }
                        subtype = CommonAudioStat$AudioListeningStopEvent.Subtype.PREV;
                    }
                    subtype = CommonAudioStat$AudioListeningStopEvent.Subtype.NEXT;
                } else {
                    if (!agl0Var.equals(agl0.g.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    subtype = CommonAudioStat$AudioListeningStopEvent.Subtype.UNHANDLED_ON_CLIENT;
                }
                a2 = cwa0.a(new CommonAudioStat$AudioListeningStopEvent(type2, subtype));
            }
        }
        boolean z3 = iwa0Var.j;
        boolean z4 = iwa0Var.k;
        AudioStream audioStream = iwa0Var.l;
        String str8 = audioStream != null ? audioStream.b : null;
        CommonAudioStat$TypeAudioListeningItem.StreamingUrlType streamingUrlType = epx.f(str8, AudioStreamDto.TypeDto.DASH.j()) ? CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.DASH : epx.f(str8, AudioStreamDto.TypeDto.HLS_RANGE.j()) ? CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.HLS_RANGE : epx.f(str8, AudioStreamDto.TypeDto.HLS_TS.j()) ? CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.HLS_TS : epx.f(str8, AudioStreamDto.TypeDto.HLS.j()) ? CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.HLS : CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.MUSIC_SOURCE_MP3;
        AudioStream audioStream2 = iwa0Var.l;
        CommonAudioStat$TypeAudioListeningItem commonAudioStat$TypeAudioListeningItem = new CommonAudioStat$TypeAudioListeningItem(str, j, j2, i, i2, str7, i3, i4, shuffle, repeatMode2, z3, z4, autorecoms, appState, streamingType2, listeningType, a2, null, null, l, streamingUrlType, (audioStream2 == null || (str4 = audioStream2.c) == null || (g = jeq0.g(str4)) == null) ? null : g.getHost(), null, null, null, null, null, 130416640, null);
        p4b0 p4b0Var = iwa0Var.b;
        q4b0 q4b0Var2 = p4b0Var.b;
        MusicTrack musicTrack = q4b0Var2.a;
        if (p4b0Var.a) {
            return CommonAudioStat$TypeAudioListeningItem.a(commonAudioStat$TypeAudioListeningItem, CommonAudioStat$TypeAudioListeningItem.ListeningType.TYPE_AUDIO_ADV_LISTENING_ITEM, null, null, null, new CommonAudioStat$TypeAudioAdvListeningItem(p4b0Var.c.a, CommonAudioStat$TypeAudioAdvListeningItem.ContentType.AUDIO_ADV), null, 100630527);
        }
        if (musicTrack.Tb()) {
            MusicTrack musicTrack2 = q4b0Var2.a;
            Bundle bundle = musicTrack2.v;
            int parseInt = (bundle == null || (string2 = bundle.getString("contentId")) == null || (str3 = (String) drm0.c0(string2, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6).get(1)) == null) ? musicTrack2.b : Integer.parseInt(str3);
            MusicTrack musicTrack3 = q4b0Var2.a;
            Bundle bundle2 = musicTrack3.v;
            long parseLong = (bundle2 == null || (string = bundle2.getString("contentId")) == null || (str2 = (String) drm0.c0(string, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6).get(0)) == null) ? musicTrack3.c.b : Long.parseLong(str2);
            int i11 = q4b0Var2.f;
            int i12 = a.$EnumSwitchMapping$0[q4b0Var2.b.ordinal()];
            if (i12 == 1) {
                contentType = CommonAudioStat$TypeAudioAudioListeningItem.ContentType.MUSIC_TRACK;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                contentType = CommonAudioStat$TypeAudioAudioListeningItem.ContentType.MUSIC_SNIPPET;
            }
            return CommonAudioStat$TypeAudioListeningItem.a(commonAudioStat$TypeAudioListeningItem, listeningType, new CommonAudioStat$TypeAudioAudioListeningItem(parseInt, parseLong, contentType, Integer.valueOf(i11)), null, null, null, null, 129990655);
        }
        if (musicTrack.Wb()) {
            return CommonAudioStat$TypeAudioListeningItem.a(commonAudioStat$TypeAudioListeningItem, CommonAudioStat$TypeAudioListeningItem.ListeningType.TYPE_AUDIO_RADIO_LISTENING_ITEM, null, null, null, null, new CommonAudioStat$TypeAudioRadioListeningItem(musicTrack.b, CommonAudioStat$TypeAudioRadioListeningItem.ContentType.RADIO), 67076095);
        }
        if (musicTrack.Vb()) {
            CommonAudioStat$TypeAudioListeningItem.ListeningType listeningType2 = CommonAudioStat$TypeAudioListeningItem.ListeningType.TYPE_AUDIO_PODCAST_LISTENING_ITEM;
            MusicTrack musicTrack4 = q4b0Var2.a;
            int i13 = musicTrack4.b;
            return CommonAudioStat$TypeAudioListeningItem.a(commonAudioStat$TypeAudioListeningItem, listeningType2, null, new CommonAudioStat$TypeAudioPodcastListeningItem(i13, musicTrack4.c.b, i13, CommonAudioStat$TypeAudioPodcastListeningItem.ContentType.PODCAST_EPISODE, null, Integer.valueOf(q4b0Var2.f), 16, null), null, null, null, 125796351);
        }
        if (!musicTrack.Mb()) {
            throw new IllegalStateException("Unsupported playable type to build an analytics event upon.Must be one of: [music_track, radio, podcast, audiobook, ads]");
        }
        CommonAudioStat$TypeAudioListeningItem.ListeningType listeningType3 = CommonAudioStat$TypeAudioListeningItem.ListeningType.TYPE_AUDIO_BOOK_LISTENING_ITEM;
        Integer num = q4b0Var2.a.d0;
        int intValue = num != null ? num.intValue() : 0;
        AudioBookChapter audioBookChapter = q4b0Var2.a.O;
        return CommonAudioStat$TypeAudioListeningItem.a(commonAudioStat$TypeAudioListeningItem, listeningType3, null, null, new CommonAudioStat$TypeAudioBookListeningItem(intValue, CommonAudioStat$TypeAudioBookListeningItem.ContentType.AUDIOBOOK_CHAPTER, audioBookChapter != null ? audioBookChapter.b : null, Integer.valueOf(q4b0Var2.f)), null, null, 117407743);
    }
}

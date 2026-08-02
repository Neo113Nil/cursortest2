package xsna;

import com.google.protobuf.FloatValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.vk.reefton.dto.DeviceState;
import com.vk.reefton.dto.ReefBuildType;
import com.vk.reefton.dto.ReefContentQuality;
import com.vk.reefton.dto.ReefContentType;
import com.vk.reefton.dto.ReefLocationSource;
import com.vk.reefton.dto.ReefRequestReason;
import com.vk.reefton.dto.network.ReefMobileNetworkDataState;
import com.vk.reefton.dto.network.ReefNetworkType;
import com.vk.reefton.protocol.ReefProtocol$ApplicationState;
import com.vk.reefton.protocol.ReefProtocol$ContentState;
import com.vk.reefton.protocol.ReefProtocol$DeviceState;
import com.vk.reefton.protocol.ReefProtocol$Event;
import com.vk.reefton.protocol.ReefProtocol$LocationState;
import com.vk.reefton.protocol.ReefProtocol$NetworkState;
import com.vk.reefton.protocol.ReefProtocol$NetworkType;
import com.vk.reefton.protocol.a;
import com.vk.reefton.protocol.b;
import com.vk.reefton.protocol.c;
import com.vk.reefton.protocol.d;
import com.vk.reefton.protocol.e;
import com.vk.reefton.protocol.f;
import com.vk.reefton.protocol.g;
import com.vk.reefton.protocol.h;
import com.vk.reefton.protocol.i;
import com.vk.reefton.protocol.j;
import com.vk.reefton.protocol.k;
import com.vk.reefton.protocol.l;
import com.vk.reefton.protocol.m;
import com.vk.reefton.protocol.p;
import com.vk.reefton.protocol.q;
import com.vk.reefton.protocol.r;
import com.vk.reefton.protocol.s;
import com.vk.reefton.protocol.t;
import com.vk.reefton.protocol.u;
import com.vk.reefton.protocol.v;
import com.vk.reefton.protocol.w;
import com.vk.reefton.protocol.x;
import com.vk.reefton.protocol.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReefProtobufSerializer.kt */
/* loaded from: classes5.dex */
public final class kof0 implements hnf0 {

    /* compiled from: ReefProtobufSerializer.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[ReefRequestReason.values().length];
            try {
                iArr[ReefRequestReason.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReefRequestReason.BUFFERING_UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReefRequestReason.NETWORK_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReefRequestReason.REACHABILITY_CHANGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReefRequestReason.HEARTBEAT_PLAYER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReefRequestReason.HEARTBEAT_APP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ReefRequestReason.PLAYBACK_STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ReefRequestReason.PLAYBACK_START.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ReefRequestReason.PLAYBACK_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ReefRequestReason.PLAYBACK_PAUSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ReefRequestReason.PLAYBACK_RESUME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ReefRequestReason.BUFFERING_STARTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ReefRequestReason.BUFFERING_ENDED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ReefRequestReason.BITRATE_CHANGED_MANUALLY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ReefRequestReason.BITRATE_CHANGED_AUTOMATICALLY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ReefRequestReason.BITRATE_CHANGED_ACTUAL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ReefRequestReason.PLAYBACK_SEEK_START.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ReefRequestReason.PLAYBACK_SEEK_END.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ReefRequestReason.UX_PLAYBACK_PLAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ReefRequestReason.APP_WAKEUP.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ReefRequestReason.APP_BACKGROUND.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ReefRequestReason.AUDIO_FRAGMENT_LOADED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ReefRequestReason.AUDIO_FRAGMENT_STALLED.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ReefRequestReason.IMAGES_IMAGE_LOADED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ReefBuildType.values().length];
            try {
                iArr2[ReefBuildType.BETA.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[ReefBuildType.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[ReefBuildType.RELEASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DeviceState.Type.values().length];
            try {
                iArr3[DeviceState.Type.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[DeviceState.Type.TABLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ReefContentType.values().length];
            try {
                iArr4[ReefContentType.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[ReefContentType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[ReefContentType.GIF.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[ReefContentType.LIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[ReefContentType.CLIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr4[ReefContentType.STORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ReefContentQuality.values().length];
            try {
                iArr5[ReefContentQuality.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[ReefContentQuality.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[ReefContentQuality.P144.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[ReefContentQuality.P240.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[ReefContentQuality.P360.ordinal()] = 5;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[ReefContentQuality.P480.ordinal()] = 6;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[ReefContentQuality.P720.ordinal()] = 7;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[ReefContentQuality.P1080.ordinal()] = 8;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[ReefContentQuality.P1440.ordinal()] = 9;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[ReefContentQuality.P2160.ordinal()] = 10;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[ReefMobileNetworkDataState.values().length];
            try {
                iArr6[ReefMobileNetworkDataState.DATA_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[ReefMobileNetworkDataState.DATA_DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[ReefMobileNetworkDataState.DATA_CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[ReefMobileNetworkDataState.DATA_CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[ReefMobileNetworkDataState.DATA_SUSPENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused50) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[ReefNetworkType.values().length];
            try {
                iArr7[ReefNetworkType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr7[ReefNetworkType.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr7[ReefNetworkType.WIFI.ordinal()] = 3;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr7[ReefNetworkType.EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr7[ReefNetworkType.GPRS.ordinal()] = 5;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr7[ReefNetworkType.LTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr7[ReefNetworkType.EHRPD.ordinal()] = 7;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr7[ReefNetworkType.HSDPA.ordinal()] = 8;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr7[ReefNetworkType.HSUPA.ordinal()] = 9;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr7[ReefNetworkType.CDMA.ordinal()] = 10;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr7[ReefNetworkType.CDMAEVDOREV0.ordinal()] = 11;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr7[ReefNetworkType.CDMAEVDOREVA.ordinal()] = 12;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr7[ReefNetworkType.CDMAEVDOREVB.ordinal()] = 13;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr7[ReefNetworkType.WCDMA_UMTS.ordinal()] = 14;
            } catch (NoSuchFieldError unused64) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[ReefLocationSource.values().length];
            try {
                iArr8[ReefLocationSource.GPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr8[ReefLocationSource.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr8[ReefLocationSource.PASSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused67) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    public static com.vk.reefton.protocol.c b(dnf0 dnf0Var) {
        c.a u = com.vk.reefton.protocol.c.u();
        u.s(d(dnf0Var.a));
        u.h(dnf0Var.i);
        u.n(String.valueOf(dnf0Var.b));
        u.o(String.valueOf(dnf0Var.c));
        List<sof0> list = dnf0Var.m;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f((sof0) it.next()));
        }
        u.b(arrayList);
        u.m(dnf0Var.j);
        u.g(dnf0Var.l);
        u.r(dnf0Var.k);
        Integer num = dnf0Var.d;
        if (num != null) {
            u.c(Int32Value.newBuilder().setValue(num.intValue()).build());
        }
        Integer num2 = dnf0Var.h;
        if (num2 != null) {
            u.d(Int32Value.newBuilder().setValue(num2.intValue()).build());
        }
        Long l = dnf0Var.e;
        if (l != null) {
            u.f(Int32Value.newBuilder().setValue((int) l.longValue()).build());
        }
        Integer num3 = dnf0Var.f;
        if (num3 != null) {
            u.q(Int32Value.newBuilder().setValue(num3.intValue()).build());
        }
        Integer num4 = dnf0Var.g;
        if (num4 != null) {
            u.p(Int32Value.newBuilder().setValue(num4.intValue()).build());
        }
        return u.build();
    }

    public static ReefProtocol$LocationState c(azz azzVar) {
        int i = a.$EnumSwitchMapping$7[azzVar.a.ordinal()];
        ReefProtocol$LocationState.Source source = i != 1 ? i != 2 ? i != 3 ? ReefProtocol$LocationState.Source.GPS : ReefProtocol$LocationState.Source.PASSIVE : ReefProtocol$LocationState.Source.NETWORK : ReefProtocol$LocationState.Source.GPS;
        ReefProtocol$LocationState.a p = ReefProtocol$LocationState.p();
        p.m(source);
        p.f(azzVar.g);
        Float f = azzVar.e;
        if (f != null) {
            p.b(FloatValue.newBuilder().setValue(f.floatValue()).build());
        }
        Long l = azzVar.d;
        if (l != null) {
            p.d(Int64Value.newBuilder().setValue(l.longValue()).build());
        }
        Double d = azzVar.b;
        if (d != null) {
            p.g(FloatValue.newBuilder().setValue((float) d.doubleValue()));
        }
        Double d2 = azzVar.c;
        if (d2 != null) {
            p.h(FloatValue.newBuilder().setValue((float) d2.doubleValue()).build());
        }
        Float f2 = azzVar.f;
        if (f2 != null) {
            p.n(FloatValue.newBuilder().setValue(f2.floatValue()).build());
        }
        Float f3 = azzVar.h;
        if (f3 != null) {
            p.c(FloatValue.newBuilder().setValue(f3.floatValue()).build());
        }
        return p.build();
    }

    public static ReefProtocol$NetworkType d(ReefNetworkType reefNetworkType) {
        switch (a.$EnumSwitchMapping$6[reefNetworkType.ordinal()]) {
            case 1:
                return ReefProtocol$NetworkType.UNKNOWN;
            case 2:
                return ReefProtocol$NetworkType.OTHER;
            case 3:
                return ReefProtocol$NetworkType.WIFI;
            case 4:
                return ReefProtocol$NetworkType.EDGE;
            case 5:
                return ReefProtocol$NetworkType.GPRS;
            case 6:
                return ReefProtocol$NetworkType.LTE;
            case 7:
                return ReefProtocol$NetworkType.EHRPD;
            case 8:
                return ReefProtocol$NetworkType.HSDPA;
            case 9:
                return ReefProtocol$NetworkType.HSUPA;
            case 10:
                return ReefProtocol$NetworkType.CDMA;
            case 11:
                return ReefProtocol$NetworkType.CDMAEVDORev0;
            case 12:
                return ReefProtocol$NetworkType.CDMAEVDORevA;
            case 13:
                return ReefProtocol$NetworkType.CDMAEVDORevB;
            case 14:
                return ReefProtocol$NetworkType.WcdmaUmts;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ReefProtocol$ContentState.Quality e(ReefContentQuality reefContentQuality) {
        switch (a.$EnumSwitchMapping$4[reefContentQuality.ordinal()]) {
            case 1:
                return ReefProtocol$ContentState.Quality.UNKNOWN;
            case 2:
                return ReefProtocol$ContentState.Quality.AUTO;
            case 3:
                return ReefProtocol$ContentState.Quality.P144;
            case 4:
                return ReefProtocol$ContentState.Quality.P240;
            case 5:
                return ReefProtocol$ContentState.Quality.P360;
            case 6:
                return ReefProtocol$ContentState.Quality.P480;
            case 7:
                return ReefProtocol$ContentState.Quality.P720;
            case 8:
                return ReefProtocol$ContentState.Quality.P1080;
            case 9:
                return ReefProtocol$ContentState.Quality.P1440;
            case 10:
                return ReefProtocol$ContentState.Quality.P2160;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static com.vk.reefton.protocol.u f(sof0 sof0Var) {
        u.a n = com.vk.reefton.protocol.u.n();
        Integer num = sof0Var.a;
        if (num != null) {
            n.b(num.intValue());
        }
        Integer num2 = sof0Var.c;
        if (num2 != null) {
            n.c(num2.intValue());
        }
        Integer num3 = sof0Var.b;
        if (num3 != null) {
            n.f(num3.intValue());
        }
        rof0 rof0Var = sof0Var.e;
        if (rof0Var != null) {
            v.a f = com.vk.reefton.protocol.v.f();
            Integer num4 = rof0Var.a;
            if (num4 != null) {
                f.b(Int32Value.newBuilder().setValue(num4.intValue()).build());
            }
            Integer num5 = rof0Var.b;
            if (num5 != null) {
                f.c(Int32Value.newBuilder().setValue(num5.intValue()).build());
            }
            n.d(f);
        } else {
            tof0 tof0Var = sof0Var.d;
            if (tof0Var != null) {
                w.a n2 = com.vk.reefton.protocol.w.n();
                Integer num6 = tof0Var.b;
                if (num6 != null) {
                    n2.b(Int32Value.newBuilder().setValue(num6.intValue()).build());
                }
                Integer num7 = tof0Var.c;
                if (num7 != null) {
                    n2.c(Int32Value.newBuilder().setValue(num7.intValue()).build());
                }
                Integer num8 = tof0Var.d;
                if (num8 != null) {
                    n2.d(Int32Value.newBuilder().setValue(num8.intValue()).build());
                }
                Integer num9 = tof0Var.e;
                if (num9 != null) {
                    n2.f(Int32Value.newBuilder().setValue(num9.intValue()).build());
                }
                Integer num10 = tof0Var.a;
                if (num10 != null) {
                    n2.g(Int32Value.newBuilder().setValue(num10.intValue()).build());
                }
                Integer num11 = tof0Var.f;
                if (num11 != null) {
                    n2.h(Int32Value.newBuilder().setValue(num11.intValue()).build());
                }
                n.g(n2);
            }
        }
        eof0 eof0Var = sof0Var.f;
        if (eof0Var != null) {
            p.a f2 = com.vk.reefton.protocol.p.f();
            Integer num12 = eof0Var.a;
            if (num12 != null) {
                f2.c(Int32Value.newBuilder().setValue(num12.intValue()).build());
            }
            Integer num13 = eof0Var.b;
            if (num13 != null) {
                f2.b(Int32Value.newBuilder().setValue(num13.intValue()).build());
            }
            n.h(f2.build());
        }
        return n.build();
    }

    @Override // xsna.hnf0
    public final byte[] a(List<vof0> list) {
        ReefProtocol$Event.Type type;
        ReefProtocol$NetworkState.MobileNetworkDataState mobileNetworkDataState;
        ReefProtocol$ContentState.Type type2;
        g.a d = com.vk.reefton.protocol.g.d();
        List<vof0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (vof0 vof0Var : list2) {
            switch (a.$EnumSwitchMapping$0[vof0Var.h.ordinal()]) {
                case 1:
                    type = ReefProtocol$Event.Type.UNKNOWN;
                    break;
                case 2:
                    type = ReefProtocol$Event.Type.UNKNOWN;
                    break;
                case 3:
                    type = ReefProtocol$Event.Type.NETWORK_TYPE_CHANGE;
                    break;
                case 4:
                    type = ReefProtocol$Event.Type.NETWORK_TYPE_CHANGE;
                    break;
                case 5:
                    type = ReefProtocol$Event.Type.PLAYBACK_HEARTBEAT;
                    break;
                case 6:
                    type = ReefProtocol$Event.Type.APP_HEARTBEAT;
                    break;
                case 7:
                    type = ReefProtocol$Event.Type.PLAYBACK_STOP;
                    break;
                case 8:
                    type = ReefProtocol$Event.Type.PLAYBACK_PLAY;
                    break;
                case 9:
                    type = ReefProtocol$Event.Type.PLAYBACK_ERROR;
                    break;
                case 10:
                    type = ReefProtocol$Event.Type.PLAYBACK_PAUSE;
                    break;
                case 11:
                    type = ReefProtocol$Event.Type.PLAYBACK_RESUME;
                    break;
                case 12:
                    type = ReefProtocol$Event.Type.PLAYBACK_BUFFERING_START;
                    break;
                case 13:
                    type = ReefProtocol$Event.Type.PLAYBACK_BUFFERING_STOP;
                    break;
                case 14:
                    type = ReefProtocol$Event.Type.PLAYBACK_BITRATE_CHANGE;
                    break;
                case 15:
                    type = ReefProtocol$Event.Type.PLAYBACK_BITRATE_CHANGE;
                    break;
                case 16:
                    type = ReefProtocol$Event.Type.PLAYBACK_BITRATE_CHANGE_ACTUAL;
                    break;
                case 17:
                    type = ReefProtocol$Event.Type.PLAYBACK_SEEK_START;
                    break;
                case 18:
                    type = ReefProtocol$Event.Type.PLAYBACK_SEEK_STOP;
                    break;
                case 19:
                    type = ReefProtocol$Event.Type.UX_PLAYBACK_PLAY;
                    break;
                case 20:
                    type = ReefProtocol$Event.Type.APP_WAKEUP;
                    break;
                case 21:
                    type = ReefProtocol$Event.Type.APP_BACKGROUND;
                    break;
                case 22:
                    type = ReefProtocol$Event.Type.AUDIO_FRAGMENT_LOADED;
                    break;
                case 23:
                    type = ReefProtocol$Event.Type.AUDIO_FRAGMENT_STALLED;
                    break;
                case 24:
                    type = ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            ReefProtocol$Event.a G = ReefProtocol$Event.G();
            G.t(vof0Var.a);
            G.E(type);
            G.B(vof0Var.c);
            G.C(vof0Var.d);
            G.D(vof0Var.e);
            G.d(vof0Var.g);
            G.A(vof0Var.b);
            G.h(vof0Var.f);
            for (wof0 wof0Var : j5g.O0(vof0Var.j)) {
                if (wof0Var instanceof uya0) {
                    uya0 uya0Var = (uya0) wof0Var;
                    s.a A = com.vk.reefton.protocol.s.A();
                    A.p(uya0Var.b);
                    Integer num = uya0Var.c;
                    if (num != null) {
                        A.b(Int32Value.newBuilder().setValue(num.intValue()).build());
                    }
                    ReefContentQuality reefContentQuality = uya0Var.d;
                    if (reefContentQuality != null) {
                        A.v(e(reefContentQuality));
                    }
                    if (uya0Var.h != null) {
                        A.c(r7.floatValue());
                    }
                    Long l = uya0Var.l;
                    if (l != null) {
                        A.d(Int64Value.newBuilder().setValue(l.longValue()).build());
                    }
                    Long l2 = uya0Var.m;
                    if (l2 != null) {
                        A.f(Int64Value.newBuilder().setValue(l2.longValue()).build());
                    }
                    Long l3 = uya0Var.j;
                    if (l3 != null) {
                        A.h(Int64Value.newBuilder().setValue(l3.longValue()).build());
                    }
                    Long l4 = uya0Var.k;
                    if (l4 != null) {
                        A.m(Int64Value.newBuilder().setValue(l4.longValue()).build());
                    }
                    Integer num2 = uya0Var.i;
                    if (num2 != null) {
                        A.g(Int32Value.newBuilder().setValue(num2.intValue()).build());
                    }
                    String str = uya0Var.a;
                    if (str != null) {
                        A.n(str);
                    }
                    Long l5 = uya0Var.g;
                    if (l5 != null) {
                        A.y(l5.longValue());
                    }
                    if (uya0Var.f != null) {
                        A.t(r7.longValue());
                    }
                    Integer num3 = uya0Var.n;
                    if (num3 != null) {
                        A.s(num3.intValue());
                    }
                    zmf0 zmf0Var = uya0Var.o;
                    if (zmf0Var != null) {
                        b.a n = com.vk.reefton.protocol.b.n();
                        n.o();
                        n.q(zmf0Var.a);
                        n.p(zmf0Var.b);
                        n.b(zmf0Var.c);
                        n.m();
                        n.n();
                        A.q(n.build());
                    }
                    A.o(uya0Var.p);
                    ReefContentQuality reefContentQuality2 = uya0Var.e;
                    if (reefContentQuality2 != null) {
                        A.u(e(reefContentQuality2));
                    }
                    A.x(uya0Var.q);
                    A.w(uya0Var.r);
                    ReefContentQuality reefContentQuality3 = uya0Var.s;
                    if (reefContentQuality3 != null) {
                        A.r(e(reefContentQuality3));
                    }
                    G.y(A.build());
                } else if (wof0Var instanceof bwa0) {
                    bwa0 bwa0Var = (bwa0) wof0Var;
                    f.a f = com.vk.reefton.protocol.f.f();
                    f.b(bwa0Var.a);
                    f.c(bwa0Var.b);
                    G.p(f.build());
                } else if (wof0Var instanceof k560) {
                    k560 k560Var = (k560) wof0Var;
                    int i = a.$EnumSwitchMapping$5[k560Var.h.ordinal()];
                    if (i == 1) {
                        mobileNetworkDataState = ReefProtocol$NetworkState.MobileNetworkDataState.DATA_UNKNOWN;
                    } else if (i == 2) {
                        mobileNetworkDataState = ReefProtocol$NetworkState.MobileNetworkDataState.DATA_DISCONNECTED;
                    } else if (i == 3) {
                        mobileNetworkDataState = ReefProtocol$NetworkState.MobileNetworkDataState.DATA_CONNECTING;
                    } else if (i == 4) {
                        mobileNetworkDataState = ReefProtocol$NetworkState.MobileNetworkDataState.DATA_CONNECTED;
                    } else {
                        if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mobileNetworkDataState = ReefProtocol$NetworkState.MobileNetworkDataState.DATA_SUSPENDED;
                    }
                    ReefProtocol$NetworkState.a G2 = ReefProtocol$NetworkState.G();
                    G2.t(d(k560Var.a));
                    List<dnf0> list3 = k560Var.r;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(b((dnf0) it.next()));
                    }
                    G2.b(arrayList2);
                    List<dnf0> list4 = k560Var.p;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(b((dnf0) it2.next()));
                    }
                    G2.c(arrayList3);
                    List<dnf0> list5 = k560Var.q;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list5, 10));
                    Iterator<T> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(b((dnf0) it3.next()));
                    }
                    G2.d(arrayList4);
                    G2.n(k560Var.g);
                    List<uof0> list6 = k560Var.i;
                    ArrayList arrayList5 = new ArrayList(c5g.u(list6, 10));
                    for (uof0 uof0Var : list6) {
                        m.a f2 = com.vk.reefton.protocol.m.f();
                        f2.b(String.valueOf(uof0Var.a.intValue()));
                        f2.c(String.valueOf(uof0Var.b.intValue()));
                        arrayList5.add(f2.build());
                    }
                    G2.f(arrayList5);
                    G2.r(mobileNetworkDataState);
                    G2.o(k560Var.y);
                    Integer num4 = k560Var.c;
                    if (num4 != null) {
                        G2.p(num4.intValue());
                    }
                    Integer num5 = k560Var.d;
                    if (num5 != null) {
                        G2.A(num5.intValue());
                    }
                    Integer num6 = k560Var.b;
                    if (num6 != null) {
                        G2.E(num6.intValue());
                    }
                    Long l6 = k560Var.j;
                    if (l6 != null) {
                        G2.B(l6.longValue());
                    }
                    Long l7 = k560Var.k;
                    if (l7 != null) {
                        G2.v(l7.longValue());
                    }
                    Long l8 = k560Var.l;
                    if (l8 != null) {
                        G2.C(l8.longValue());
                    }
                    Long l9 = k560Var.m;
                    if (l9 != null) {
                        G2.w(l9.longValue());
                    }
                    Long l10 = k560Var.n;
                    if (l10 != null) {
                        G2.D(l10.longValue());
                    }
                    Long l11 = k560Var.o;
                    if (l11 != null) {
                        G2.x(l11.longValue());
                    }
                    String str2 = k560Var.f;
                    if (str2 != null) {
                        G2.s(str2);
                    }
                    String str3 = k560Var.e;
                    if (str3 != null) {
                        G2.z(str3);
                    }
                    Boolean bool = k560Var.s;
                    if (bool != null) {
                        G2.h(bool.booleanValue());
                    }
                    Boolean bool2 = k560Var.t;
                    if (bool2 != null) {
                        G2.m(bool2.booleanValue());
                    }
                    Integer num7 = k560Var.u;
                    if (num7 != null) {
                        G2.q(num7.intValue());
                    }
                    Integer num8 = k560Var.v;
                    if (num8 != null) {
                        G2.y(num8.intValue());
                    }
                    String str4 = k560Var.w;
                    if (str4 != null) {
                        G2.u(str4);
                    }
                    List<sof0> list7 = k560Var.x;
                    if (list7 != null) {
                        List<sof0> list8 = list7;
                        ArrayList arrayList6 = new ArrayList(c5g.u(list8, 10));
                        Iterator<T> it4 = list8.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(f((sof0) it4.next()));
                        }
                        G2.g(arrayList6);
                    }
                    G.w(G2.build());
                } else if (wof0Var instanceof azz) {
                    G.u(c((azz) wof0Var));
                } else if (wof0Var instanceof fhr) {
                    fhr fhrVar = (fhr) wof0Var;
                    azz azzVar = fhrVar.a;
                    if (azzVar != null) {
                        G.v(c(azzVar));
                    }
                    azz azzVar2 = fhrVar.b;
                    if (azzVar2 != null) {
                        G.q(c(azzVar2));
                    }
                } else if (wof0Var instanceof ykj) {
                    ykj ykjVar = (ykj) wof0Var;
                    switch (a.$EnumSwitchMapping$3[ykjVar.a.ordinal()]) {
                        case 1:
                            type2 = ReefProtocol$ContentState.Type.UNDEFINED;
                            break;
                        case 2:
                            type2 = ReefProtocol$ContentState.Type.VIDEO;
                            break;
                        case 3:
                            type2 = ReefProtocol$ContentState.Type.GIF;
                            break;
                        case 4:
                            type2 = ReefProtocol$ContentState.Type.LIVE;
                            break;
                        case 5:
                            type2 = ReefProtocol$ContentState.Type.CLIP;
                            break;
                        case 6:
                            type2 = ReefProtocol$ContentState.Type.STORY;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    ReefProtocol$ContentState.a o = ReefProtocol$ContentState.o();
                    o.h(e(ykjVar.f));
                    o.m(type2);
                    if (ykjVar.d != null) {
                        o.b(r6.longValue());
                    }
                    Integer num9 = ykjVar.e;
                    if (num9 != null) {
                        o.c(num9.intValue());
                    }
                    String str5 = ykjVar.c;
                    if (str5 != null) {
                        o.d(str5);
                    }
                    String str6 = ykjVar.b;
                    if (str6 != null) {
                        o.f(str6);
                    }
                    Long l12 = ykjVar.g;
                    if (l12 != null) {
                        o.g(l12.longValue());
                    }
                    G.n(o.build());
                } else if (wof0Var instanceof plc) {
                    plc plcVar = (plc) wof0Var;
                    d.a f3 = com.vk.reefton.protocol.d.f();
                    f3.b(plcVar.a);
                    f3.c(plcVar.b);
                    G.m(f3.build());
                } else if (wof0Var instanceof dy90) {
                    dy90 dy90Var = (dy90) wof0Var;
                    r.a m = com.vk.reefton.protocol.r.m();
                    m.g(dy90Var.c);
                    m.c(dy90Var.b);
                    m.b(dy90Var.a);
                    m.f(dy90Var.d);
                    m.d(dy90Var.e);
                    G.x(m.build());
                } else if (wof0Var instanceof DeviceState) {
                    DeviceState deviceState = (DeviceState) wof0Var;
                    int i2 = a.$EnumSwitchMapping$2[deviceState.b.ordinal()];
                    ReefProtocol$DeviceState.Type type3 = i2 != 1 ? i2 != 2 ? ReefProtocol$DeviceState.Type.UNKNOWN : ReefProtocol$DeviceState.Type.TABLET : ReefProtocol$DeviceState.Type.PHONE;
                    ReefProtocol$DeviceState.a s = ReefProtocol$DeviceState.s();
                    s.c(deviceState.a);
                    s.n(deviceState.e);
                    s.o(deviceState.f);
                    s.h(deviceState.c);
                    s.m(deviceState.d);
                    s.q(type3);
                    s.g(deviceState.k);
                    s.f(deviceState.l);
                    s.b(deviceState.m);
                    s.d(deviceState.n);
                    String str7 = deviceState.j;
                    if (str7 != null) {
                        s.p(str7);
                    }
                    G.o(s.build());
                    int i3 = a.$EnumSwitchMapping$1[deviceState.i.ordinal()];
                    ReefProtocol$ApplicationState.BuildType buildType = i3 != 1 ? i3 != 2 ? i3 != 3 ? ReefProtocol$ApplicationState.BuildType.UNKNOWN : ReefProtocol$ApplicationState.BuildType.PRODUCTION : ReefProtocol$ApplicationState.BuildType.DEVELOPMENT : ReefProtocol$ApplicationState.BuildType.BETA;
                    ReefProtocol$ApplicationState.a g = ReefProtocol$ApplicationState.g();
                    g.b(deviceState.h);
                    g.d(deviceState.g);
                    g.c(buildType);
                    G.f(g.build());
                } else if (wof0Var instanceof yof0) {
                    List<zof0> list9 = ((yof0) wof0Var).a;
                    ArrayList arrayList7 = new ArrayList(c5g.u(list9, 10));
                    for (zof0 zof0Var : list9) {
                        y.a m2 = com.vk.reefton.protocol.y.m();
                        m2.d(zof0Var.a);
                        m2.c(Int32Value.newBuilder().setValue(zof0Var.e.intValue()).build());
                        m2.b(zof0Var.d);
                        m2.f(Int32Value.newBuilder().setValue(zof0Var.c.intValue()).build());
                        m2.g(FloatValue.newBuilder().setValue(zof0Var.b.floatValue()).build());
                        arrayList7.add(m2.build());
                    }
                    G.b(arrayList7);
                } else if (wof0Var instanceof kkv) {
                    i.a d2 = com.vk.reefton.protocol.i.d();
                    ArrayList<pnf0> arrayList8 = ((kkv) wof0Var).a;
                    if (arrayList8 != null) {
                        ArrayList arrayList9 = new ArrayList(c5g.u(arrayList8, 10));
                        for (pnf0 pnf0Var : arrayList8) {
                            h.a D = com.vk.reefton.protocol.h.D();
                            Integer num10 = pnf0Var.a;
                            if (num10 != null) {
                                D.v(num10.intValue());
                            }
                            Integer num11 = pnf0Var.b;
                            if (num11 != null) {
                                D.b(num11.intValue());
                            }
                            Integer num12 = pnf0Var.c;
                            if (num12 != null) {
                                D.y(num12.intValue());
                            }
                            Integer num13 = pnf0Var.d;
                            if (num13 != null) {
                                D.A(num13.intValue());
                            }
                            Integer num14 = pnf0Var.e;
                            if (num14 != null) {
                                D.w(num14.intValue());
                            }
                            Boolean bool3 = pnf0Var.f;
                            if (bool3 != null) {
                                D.p(bool3.booleanValue());
                            }
                            String str8 = pnf0Var.g;
                            if (str8 != null) {
                                D.t(str8);
                            }
                            String str9 = pnf0Var.h;
                            if (str9 != null) {
                                D.m(str9);
                            }
                            String str10 = pnf0Var.i;
                            if (str10 != null) {
                                D.h(str10);
                            }
                            Integer num15 = pnf0Var.j;
                            if (num15 != null) {
                                D.n(num15.intValue());
                            }
                            String str11 = pnf0Var.k;
                            if (str11 != null) {
                                D.o(str11);
                            }
                            Boolean bool4 = pnf0Var.l;
                            if (bool4 != null) {
                                D.s(bool4.booleanValue());
                            }
                            String str12 = pnf0Var.m;
                            if (str12 != null) {
                                D.u(str12);
                            }
                            Integer num16 = pnf0Var.n;
                            if (num16 != null) {
                                D.d(num16.intValue());
                            }
                            Integer num17 = pnf0Var.o;
                            if (num17 != null) {
                                D.z(num17.intValue());
                            }
                            Integer num18 = pnf0Var.p;
                            if (num18 != null) {
                                D.x(num18.intValue());
                            }
                            Integer num19 = pnf0Var.q;
                            if (num19 != null) {
                                D.c(num19.intValue());
                            }
                            String str13 = pnf0Var.r;
                            if (str13 != null) {
                                D.B(str13);
                            }
                            Boolean bool5 = pnf0Var.s;
                            if (bool5 != null) {
                                D.r(bool5.booleanValue());
                            }
                            Integer num20 = pnf0Var.t;
                            if (num20 != null) {
                                D.g(num20.intValue());
                            }
                            Boolean bool6 = pnf0Var.u;
                            if (bool6 != null) {
                                D.q(bool6.booleanValue());
                            }
                            String str14 = pnf0Var.v;
                            if (str14 != null) {
                                D.f(str14);
                            }
                            arrayList9.add(D.build());
                        }
                        d2.b(arrayList9);
                    }
                    G.r(d2.build());
                } else if (wof0Var instanceof yzq0) {
                    x.a d3 = com.vk.reefton.protocol.x.d();
                    HashMap<String, Boolean> hashMap = ((yzq0) wof0Var).a;
                    if (hashMap != null) {
                        e.a d4 = com.vk.reefton.protocol.e.d();
                        Iterator<T> it5 = hashMap.entrySet().iterator();
                        while (it5.hasNext()) {
                            Map.Entry entry = (Map.Entry) it5.next();
                            q.a f4 = com.vk.reefton.protocol.q.f();
                            f4.b((String) entry.getKey());
                            f4.c(((Boolean) entry.getValue()).booleanValue());
                            d4.b(f4.build());
                        }
                        d3.b(d4.build());
                    }
                    G.F(d3.build());
                } else if (wof0Var instanceof mof0) {
                    mof0 mof0Var = (mof0) wof0Var;
                    t.a g2 = com.vk.reefton.protocol.t.g();
                    r600 r600Var = mof0Var.a;
                    if (r600Var != null) {
                        l.a r = com.vk.reefton.protocol.l.r();
                        r.b(r600Var.a);
                        r.q(r600Var.b);
                        r.o(r600Var.c);
                        r.m(r600Var.d);
                        r.p(r600Var.e);
                        r.d(r600Var.f);
                        r.f(r600Var.g);
                        r.g(r600Var.h);
                        r.h(r600Var.i);
                        r.n(r600Var.j);
                        g2.b(r.build());
                    }
                    Long l13 = mof0Var.b;
                    if (l13 != null) {
                        g2.d(l13.longValue());
                    }
                    String str15 = mof0Var.c;
                    if (str15 != null) {
                        g2.f(str15);
                    }
                    G.z(g2.build());
                } else if (wof0Var instanceof hs4) {
                    hs4 hs4Var = (hs4) wof0Var;
                    a.C1757a p = com.vk.reefton.protocol.a.p();
                    p.g(hs4Var.a);
                    p.b(hs4Var.b);
                    p.n(hs4Var.d);
                    Integer num21 = hs4Var.e;
                    p.h(num21 != null ? num21.intValue() : -1);
                    Integer num22 = hs4Var.f;
                    p.m(num22 != null ? num22.intValue() : -1);
                    Integer num23 = hs4Var.g;
                    p.c(num23 != null ? num23.intValue() : -1);
                    p.f(hs4Var.c);
                    Integer num24 = hs4Var.h;
                    p.d(num24 != null ? num24.intValue() : -1);
                    G.g(p.build());
                } else {
                    if (!(wof0Var instanceof pnw)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k.a d5 = com.vk.reefton.protocol.k.d();
                    ArrayList<qnf0> arrayList10 = ((pnw) wof0Var).a;
                    if (arrayList10 != null) {
                        ArrayList arrayList11 = new ArrayList(c5g.u(arrayList10, 10));
                        for (qnf0 qnf0Var : arrayList10) {
                            j.a u = com.vk.reefton.protocol.j.u();
                            u.b(qnf0Var.a);
                            String str16 = qnf0Var.h;
                            if (str16 == null) {
                                str16 = "";
                            }
                            u.s(str16);
                            u.m(qnf0Var.b);
                            u.n(qnf0Var.c);
                            Integer num25 = qnf0Var.i;
                            u.o(num25 != null ? num25.intValue() : -1);
                            String str17 = qnf0Var.j;
                            if (str17 == null) {
                                str17 = "";
                            }
                            u.g(str17);
                            u.f(qnf0Var.d.intValue());
                            u.h(qnf0Var.e.intValue());
                            String str18 = qnf0Var.k;
                            if (str18 == null) {
                                str18 = "";
                            }
                            u.p(str18);
                            String str19 = qnf0Var.l;
                            u.c(str19 != null ? str19 : "");
                            Integer num26 = qnf0Var.m;
                            u.d(num26 != null ? num26.intValue() : -1);
                            u.r(qnf0Var.f);
                            u.q(qnf0Var.g);
                            arrayList11.add(u.build());
                        }
                        d5.b(arrayList11);
                    }
                    G.s(d5.build());
                }
            }
            arrayList.add(G.build());
        }
        d.b(arrayList);
        return d.build().toByteArray();
    }
}

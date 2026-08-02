package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.av20;
import xsna.dw20;
import xsna.kz20;

/* compiled from: VideoSettingsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class fgt0 extends kq6 {
    public final Activity c;
    public final d3b0 d;
    public final ebs0 e;
    public final dz20 f;
    public final c g;
    public final bpn0 h = new bpn0(new lqs0(this, 5));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoSettingsBottomSheet.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a AUDIO;
        public static final a AUTO_PLAY;
        public static final a FULLSCREEN_LOCK;
        public static final a QUALITY;
        public static final a SPEED;
        public static final a SUBTITLE;
        public static final a TRAFFIC_SAVING;
        private final int iconResId;
        private final int id;
        private final int nameResId;

        static {
            a aVar = new a("QUALITY", 0, R.id.video_quality, R.drawable.vk_icon_settings_outline_28, R.string.video_playback_quality);
            QUALITY = aVar;
            a aVar2 = new a("SUBTITLE", 1, R.id.video_subtitles, R.drawable.vk_icon_subtitles_outline_28, R.string.video_playback_subtitles);
            SUBTITLE = aVar2;
            a aVar3 = new a(SignalingProtocol.MEDIA_OPTION_AUDIO, 2, R.id.video_audio, R.drawable.vk_icon_playlist_outline_28, R.string.video_playback_audio);
            AUDIO = aVar3;
            a aVar4 = new a("SPEED", 3, R.id.video_playback_speed, R.drawable.vk_icon_play_speed_outline_28, R.string.video_playback_speed);
            SPEED = aVar4;
            a aVar5 = new a("FULLSCREEN_LOCK", 4, R.id.video_settings_fullscreen_lock, R.drawable.vk_icon_lock_outline_28, R.string.video_settings_fullscreen_lock);
            FULLSCREEN_LOCK = aVar5;
            a aVar6 = new a("TRAFFIC_SAVING", 5, R.id.video_traffic_saving, R.drawable.vk_icon_smartphone_outline_28, R.string.video_traffic_saving);
            TRAFFIC_SAVING = aVar6;
            a aVar7 = new a("AUTO_PLAY", 6, R.id.video_auto_play, R.drawable.vk_icon_video_circle_outline_28, R.string.video_auto_play);
            AUTO_PLAY = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2, int i3, int i4) {
            this.id = i2;
            this.iconResId = i3;
            this.nameResId = i4;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconResId;
        }

        public final int i() {
            return this.nameResId;
        }
    }

    /* compiled from: VideoSettingsBottomSheet.kt */
    public static final class b {
        public final a a;
        public final CharSequence b;
        public final boolean c;
        public final boolean d;

        public b(a aVar, CharSequence charSequence, boolean z, boolean z2, int i) {
            z = (i & 4) != 0 ? true : z;
            z2 = (i & 8) != 0 ? false : z2;
            this.a = aVar;
            this.b = charSequence;
            this.c = z;
            this.d = z2;
        }
    }

    /* compiled from: VideoSettingsBottomSheet.kt */
    public static final class c {
        public final int a;
        public final boolean b;
        public final String c;
        public final one.video.player.tracks.b d;
        public final boolean e;
        public final int f;
        public final LinkedHashMap g;
        public final Boolean h;
        public final boolean i;
        public final Boolean j;
        public final Boolean k;
        public final boolean l;

        public c(int i, boolean z, String str, one.video.player.tracks.b bVar, boolean z2, int i2, LinkedHashMap linkedHashMap, Boolean bool, boolean z3, Boolean bool2, Boolean bool3, boolean z4) {
            this.a = i;
            this.b = z;
            this.c = str;
            this.d = bVar;
            this.e = z2;
            this.f = i2;
            this.g = linkedHashMap;
            this.h = bool;
            this.i = z3;
            this.j = bool2;
            this.k = bool3;
            this.l = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && this.g.equals(cVar.g) && epx.f(this.h, cVar.h) && this.i == cVar.i && this.j.equals(cVar.j) && epx.f(this.k, cVar.k) && this.l == cVar.l;
        }

        public final int hashCode() {
            int b = qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            one.video.player.tracks.b bVar = this.d;
            int b2 = uf3.b(this.g, shy.a(this.f, qoy.b((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e), 31), 31);
            Boolean bool = this.h;
            int hashCode2 = (this.j.hashCode() + qoy.b((b2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.i)) * 31;
            Boolean bool2 = this.k;
            return Boolean.hashCode(this.l) + ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoSettingsParams(currentQuality=");
            sb.append(this.a);
            sb.append(", enableQuality=");
            sb.append(this.b);
            sb.append(", currentAudioLabel=");
            sb.append(this.c);
            sb.append(", currentSubtitles=");
            sb.append(this.d);
            sb.append(", hasSubtitles=");
            sb.append(this.e);
            sb.append(", currentPlaybackSpeed=");
            sb.append(this.f);
            sb.append(", qualityNameplates=");
            sb.append(this.g);
            sb.append(", isTrafficSavingEnable=");
            sb.append(this.h);
            sb.append(", isSoundOnlyQuality=");
            sb.append(this.i);
            sb.append(", isFullscreenLockEnabled=");
            sb.append(this.j);
            sb.append(", isAutoPlayEnabled=");
            sb.append(this.k);
            sb.append(", enablePlaybackSpeed=");
            return defpackage.q0.a(sb, this.l, ')');
        }
    }

    /* compiled from: VideoSettingsBottomSheet.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.QUALITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SUBTITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.SPEED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.TRAFFIC_SAVING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.FULLSCREEN_LOCK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.AUTO_PLAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fgt0(FragmentActivity fragmentActivity, d3b0 d3b0Var, ebs0 ebs0Var, kz20.b bVar, c cVar) {
        this.c = fragmentActivity;
        this.d = d3b0Var;
        this.e = ebs0Var;
        this.f = bVar;
        this.g = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    @Override // xsna.kq6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dw20 a() {
        String str;
        String sb;
        CharSequence t;
        Boolean bool;
        b bVar;
        Boolean bool2;
        b bVar2;
        c cVar = this.g;
        int i = cVar.a;
        String str2 = cVar.c;
        d3b0 d3b0Var = this.d;
        final boolean z = str2 != null && d().a(d3b0Var);
        boolean z2 = cVar.e;
        one.video.player.tracks.b bVar3 = cVar.d;
        Activity activity = this.c;
        if (!z2) {
            sb = activity.getString(R.string.video_playback_subtitles_none);
        } else if (bVar3 == null) {
            sb = activity.getString(R.string.video_playback_subtitles_off);
        } else {
            boolean z3 = bVar3.d;
            String str3 = ((who0) bVar3.c).c;
            if (str3 == null) {
                str3 = "";
            }
            String displayLanguage = new Locale(str3, "").getDisplayLanguage();
            if (displayLanguage.length() > 0) {
                displayLanguage = displayLanguage.substring(0, 1).toUpperCase(Locale.ROOT).concat(displayLanguage.substring(1));
            }
            if (!z3) {
                str = displayLanguage;
                a aVar = a.QUALITY;
                if (fxc0.B().J().l0()) {
                    gpt0 gpt0Var = gpt0.a;
                    if (epx.f(gpt0.A(d3b0Var), Boolean.TRUE)) {
                        i = -6;
                    }
                    t = gpt0.t(activity, i, cVar.g);
                } else {
                    gpt0 gpt0Var2 = gpt0.a;
                    if (cVar.i) {
                        i = -6;
                    }
                    QualitySettingsType t0 = fxc0.B().t0();
                    boolean z4 = cVar.b;
                    int i2 = R.string.video_quality_new_other;
                    if (z4) {
                        if (emi.q(t0)) {
                            i2 = R.string.video_quality_new_auto;
                        } else if (emi.s(t0)) {
                            i2 = R.string.video_quality_new_high;
                        } else if (emi.r(t0)) {
                            i2 = R.string.video_quality_new_econom;
                        }
                    }
                    t = gpt0.u(activity, true, i, i2);
                }
                b bVar4 = new b(aVar, t, cVar.b, false, 8);
                b bVar5 = new b(a.SUBTITLE, str, cVar.e, false, 8);
                b bVar6 = str2 == null ? new b(a.AUDIO, str2, false, z, 4) : null;
                b bVar7 = new b(a.SPEED, activity.getString(cVar.f), cVar.l, false, 8);
                b bVar8 = !cVar.j.equals(Boolean.TRUE) ? new b(a.FULLSCREEN_LOCK, activity.getString(R.string.video_settings_fullscreen_lock_subtitle), false, false, 12) : null;
                bool = cVar.h;
                if (bool == null) {
                    bVar = new b(a.TRAFFIC_SAVING, activity.getString(bool.booleanValue() ? R.string.video_traffic_saving_enabled : R.string.video_traffic_saving_disabled), false, false, 12);
                } else {
                    bVar = null;
                }
                bool2 = cVar.k;
                if (bool2 == null) {
                    bVar2 = new b(a.AUTO_PLAY, bool2.booleanValue() ? activity.getString(R.string.video_auto_play_value_enabled) : activity.getString(R.string.video_auto_play_value_disabled), false, false, 12);
                } else {
                    bVar2 = null;
                }
                List I = rl3.I(new b[]{bVar4, bVar5, bVar6, bVar7, bVar8, bVar, bVar2});
                av20.a aVar2 = new av20.a();
                dhr0.a.getClass();
                int i3 = dhr0.u().c;
                aVar2.d(R.layout.actions_popup_double_item, LayoutInflater.from(new l7s(activity, dhr0.u().c)));
                aVar2.d = new ggt0(this);
                aVar2.c(new sc8(this, 4));
                av20 b2 = aVar2.b();
                b2.setItems(I);
                return ((dw20.b) dw20.a.k(new dw20.b(activity, null).a0(new x2j0(this, 16)).d0(new gzs() { // from class: xsna.dgt0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        fgt0 fgt0Var = fgt0.this;
                        fgt0Var.f.Ff("video_playback_settings");
                        if (z) {
                            fgt0Var.d().c();
                        }
                        return s3q0.a;
                    }
                }).f0(new egt0(this, 0)), b2, 4)).I0("video_playback_settings");
            }
            StringBuilder b3 = v1v.b(displayLanguage, ' ');
            b3.append(activity.getString(R.string.video_subtitle_auto_suffix));
            sb = b3.toString();
        }
        str = sb;
        a aVar3 = a.QUALITY;
        if (fxc0.B().J().l0()) {
        }
        b bVar42 = new b(aVar3, t, cVar.b, false, 8);
        b bVar52 = new b(a.SUBTITLE, str, cVar.e, false, 8);
        if (str2 == null) {
        }
        b bVar72 = new b(a.SPEED, activity.getString(cVar.f), cVar.l, false, 8);
        if (!cVar.j.equals(Boolean.TRUE)) {
        }
        bool = cVar.h;
        if (bool == null) {
        }
        bool2 = cVar.k;
        if (bool2 == null) {
        }
        List I2 = rl3.I(new b[]{bVar42, bVar52, bVar6, bVar72, bVar8, bVar, bVar2});
        av20.a aVar22 = new av20.a();
        dhr0.a.getClass();
        int i32 = dhr0.u().c;
        aVar22.d(R.layout.actions_popup_double_item, LayoutInflater.from(new l7s(activity, dhr0.u().c)));
        aVar22.d = new ggt0(this);
        aVar22.c(new sc8(this, 4));
        av20 b22 = aVar22.b();
        b22.setItems(I2);
        return ((dw20.b) dw20.a.k(new dw20.b(activity, null).a0(new x2j0(this, 16)).d0(new gzs() { // from class: xsna.dgt0
            @Override // xsna.gzs
            public final Object invoke() {
                fgt0 fgt0Var = fgt0.this;
                fgt0Var.f.Ff("video_playback_settings");
                if (z) {
                    fgt0Var.d().c();
                }
                return s3q0.a;
            }
        }).f0(new egt0(this, 0)), b22, 4)).I0("video_playback_settings");
    }

    public final k640 d() {
        return (k640) this.h.getValue();
    }
}

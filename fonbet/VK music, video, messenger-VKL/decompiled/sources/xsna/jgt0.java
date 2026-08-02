package xsna;

import android.app.Activity;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Locale;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.cri;
import xsna.dt1;
import xsna.fgt0;
import xsna.kz20;
import xsna.q630;

/* compiled from: VideoSettingsBottomSheetRedesign.kt */
/* loaded from: classes2.dex */
public final class jgt0 {
    public final Activity a;
    public final d3b0 b;
    public final ebs0 c;
    public final dz20 d;
    public final fgt0.c e;
    public gzs<s3q0> f;
    public final bpn0 g = new bpn0(new gbt0(this, 2));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoSettingsBottomSheetRedesign.kt */
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
        private final String testTag;

        static {
            a aVar = new a("QUALITY", 0, R.id.video_quality, R.drawable.vk_icon_settings_outline_28, R.string.video_playback_quality, "video_settings_quality");
            QUALITY = aVar;
            a aVar2 = new a("SUBTITLE", 1, R.id.video_subtitles, R.drawable.vk_icon_subtitles_outline_28, R.string.video_playback_subtitles, "video_settings_subtitle");
            SUBTITLE = aVar2;
            a aVar3 = new a(SignalingProtocol.MEDIA_OPTION_AUDIO, 2, R.id.video_audio, R.drawable.vk_icon_playlist_outline_28, R.string.video_playback_audio, "video_settings_audio");
            AUDIO = aVar3;
            a aVar4 = new a("SPEED", 3, R.id.video_playback_speed, R.drawable.vk_icon_play_speed_outline_28, R.string.video_playback_speed, "video_settings_speed");
            SPEED = aVar4;
            a aVar5 = new a("FULLSCREEN_LOCK", 4, R.id.video_settings_fullscreen_lock, R.drawable.vk_icon_lock_outline_28, R.string.video_settings_fullscreen_lock, "video_settings_fullscreen_lock");
            FULLSCREEN_LOCK = aVar5;
            a aVar6 = new a("TRAFFIC_SAVING", 5, R.id.video_traffic_saving, R.drawable.vk_icon_smartphone_outline_28, R.string.video_traffic_saving, "video_settings_traffic_saving");
            TRAFFIC_SAVING = aVar6;
            a aVar7 = new a("AUTO_PLAY", 6, R.id.video_auto_play, R.drawable.vk_icon_video_circle_outline_28, R.string.video_auto_play, "video_settings_auto_play");
            AUTO_PLAY = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2, int i3, int i4, String str2) {
            this.id = i2;
            this.iconResId = i3;
            this.nameResId = i4;
            this.testTag = str2;
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

        public final String j() {
            return this.testTag;
        }
    }

    /* compiled from: VideoSettingsBottomSheetRedesign.kt */
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(u11.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SettingsWrapper(settings=");
            sb.append(this.a);
            sb.append(", value=");
            sb.append((Object) this.b);
            sb.append(", enabled=");
            sb.append(this.c);
            sb.append(", highlight=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VideoSettingsBottomSheetRedesign.kt */
    public static final /* synthetic */ class c {
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

    public jgt0(FragmentActivity fragmentActivity, d3b0 d3b0Var, ebs0 ebs0Var, kz20.b bVar, fgt0.c cVar) {
        this.a = fragmentActivity;
        this.b = d3b0Var;
        this.c = ebs0Var;
        this.d = bVar;
        this.e = cVar;
    }

    public final void a(b bVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        androidx.compose.runtime.a M = aVar.M(340134144);
        if (androidx.compose.runtime.b.d()) {
            i2 = i;
            androidx.compose.runtime.b.f(340134144, i2, -1, "com.vk.libvideo.bottomsheet.VideoSettingsBottomSheetRedesign.SettingsItem (VideoSettingsBottomSheetRedesign.kt:172)");
        } else {
            i2 = i;
        }
        a aVar2 = bVar.a;
        q630 E = ahn.E(q630.a.a, aVar2.j());
        lg90 a2 = pg90.a(aVar2.h(), 0, M);
        Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
        M.K(1108986550);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().b;
        M.j();
        com.vk.core.compose.component.cell.content.x a3 = com.vk.core.compose.component.cell.content.f.a(a2, size, j, null, null, M, 196664, 24);
        com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.d.b.a(d370.N(aVar2.i(), 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        CharSequence charSequence = bVar.b;
        com.vk.core.compose.component.cell.content.y0 y0Var = null;
        if (charSequence.length() <= 0) {
            charSequence = null;
        }
        if (charSequence == null) {
            M.K(1109267378);
            M.j();
            h1Var = null;
        } else {
            M.K(1109267379);
            com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(charSequence.toString(), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M = M;
            M.j();
            h1Var = b2;
        }
        androidx.compose.runtime.a aVar3 = M;
        com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(a4, h1Var, null, null, aVar3, 196608, 28);
        androidx.compose.runtime.a aVar4 = aVar3;
        if (bVar.d) {
            aVar4.K(1109407344);
            y0Var = o.c.a(com.vk.core.compose.component.cell.content.j.a(BadgeAppearance.Design.Accent, aVar4), null, null, null, null, aVar4, 62);
            aVar4 = aVar4;
            aVar4.j();
        } else {
            aVar4.K(1109554718);
            aVar4.j();
        }
        androidx.compose.runtime.a aVar5 = aVar4;
        wiu0.b(E, bVar.c, a3, a5, y0Var, gzsVar, null, aVar5, 0, 64);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = aVar5.s();
        if (s != null) {
            s.d = new k77(i2, 7, this, bVar, gzsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        CharSequence t;
        Throwable th;
        String str;
        String string;
        boolean booleanValue;
        Boolean bool;
        b bVar;
        Boolean bool2;
        b bVar2;
        fgt0.c cVar = this.e;
        int i3 = cVar.a;
        androidx.compose.runtime.a M = aVar.M(2001841187);
        if (androidx.compose.runtime.b.d()) {
            i2 = i;
            androidx.compose.runtime.b.f(2001841187, i2, -1, "com.vk.libvideo.bottomsheet.VideoSettingsBottomSheetRedesign.VideoSettingsContent (VideoSettingsBottomSheetRedesign.kt:151)");
        } else {
            i2 = i;
        }
        boolean J = M.J(cVar);
        Object x = M.x();
        Object obj = a.C0011a.a;
        if (J || x == obj) {
            a aVar2 = a.QUALITY;
            boolean l0 = fxc0.B().J().l0();
            Activity activity = this.a;
            if (l0) {
                gpt0 gpt0Var = gpt0.a;
                if (cVar.i) {
                    i3 = -6;
                }
                QualitySettingsType t0 = fxc0.B().t0();
                boolean z2 = cVar.b;
                int i4 = R.string.video_quality_new_other;
                if (z2) {
                    if (emi.q(t0)) {
                        i4 = R.string.video_quality_new_auto;
                    } else if (emi.s(t0)) {
                        i4 = R.string.video_quality_new_high;
                    } else if (emi.r(t0)) {
                        i4 = R.string.video_quality_new_econom;
                    }
                }
                t = gpt0.u(activity, true, i3, i4);
            } else {
                gpt0 gpt0Var2 = gpt0.a;
                if (epx.f(gpt0.A(this.b), Boolean.TRUE)) {
                    i3 = -6;
                }
                t = gpt0.t(activity, i3, cVar.g);
            }
            b bVar3 = new b(aVar2, t, cVar.b, false, 8);
            a aVar3 = a.SUBTITLE;
            boolean z3 = cVar.e;
            one.video.player.tracks.b bVar4 = cVar.d;
            if (!z3) {
                string = activity.getString(R.string.video_playback_subtitles_none);
            } else if (bVar4 == null) {
                string = activity.getString(R.string.video_playback_subtitles_off);
            } else {
                boolean z4 = bVar4.d;
                String str2 = ((who0) bVar4.c).c;
                th = null;
                if (str2 == null) {
                    str2 = "";
                }
                String displayLanguage = new Locale(str2, "").getDisplayLanguage();
                String str3 = displayLanguage.length() > 0 ? ((Object) String.valueOf(displayLanguage.charAt(0)).toUpperCase(Locale.ROOT)) + displayLanguage.substring(1) : displayLanguage;
                if (z4) {
                    StringBuilder b2 = v1v.b(str3, ' ');
                    b2.append(activity.getString(R.string.video_subtitle_auto_suffix));
                    str3 = b2.toString();
                }
                str = str3;
                b bVar5 = new b(aVar3, str, cVar.e, false, 8);
                String str4 = cVar.c;
                b bVar6 = str4 == null ? new b(a.AUDIO, str4, false, z, 4) : th;
                b bVar7 = new b(a.SPEED, activity.getString(cVar.f), cVar.l, false, 8);
                Boolean bool3 = cVar.j;
                booleanValue = bool3.booleanValue();
                Throwable th2 = bool3;
                if (!booleanValue) {
                    th2 = th;
                }
                b bVar8 = th2 == null ? new b(a.FULLSCREEN_LOCK, activity.getString(R.string.video_settings_fullscreen_lock_subtitle), false, false, 12) : th;
                bool = cVar.h;
                if (bool == null) {
                    bVar = new b(a.TRAFFIC_SAVING, activity.getString(bool.booleanValue() ? R.string.video_traffic_saving_enabled : R.string.video_traffic_saving_disabled), false, false, 12);
                } else {
                    bVar = th;
                }
                bool2 = cVar.k;
                if (bool2 == null) {
                    bVar2 = new b(a.AUTO_PLAY, activity.getString(bool2.booleanValue() ? R.string.video_auto_play_value_enabled : R.string.video_auto_play_value_disabled), false, false, 12);
                } else {
                    bVar2 = th;
                }
                x = rl3.I(new b[]{bVar3, bVar5, bVar6, bVar7, bVar8, bVar, bVar2});
                M.R(x);
            }
            str = string;
            th = null;
            b bVar52 = new b(aVar3, str, cVar.e, false, 8);
            String str42 = cVar.c;
            if (str42 == null) {
            }
            b bVar72 = new b(a.SPEED, activity.getString(cVar.f), cVar.l, false, 8);
            Boolean bool32 = cVar.j;
            booleanValue = bool32.booleanValue();
            Throwable th22 = bool32;
            if (!booleanValue) {
            }
            if (th22 == null) {
            }
            bool = cVar.h;
            if (bool == null) {
            }
            bool2 = cVar.k;
            if (bool2 == null) {
            }
            x = rl3.I(new b[]{bVar3, bVar52, bVar6, bVar72, bVar8, bVar, bVar2});
            M.R(x);
        } else {
            th = null;
        }
        List<b> list = (List) x;
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
        int hashCode = Long.hashCode(n34.n(M));
        sy90 D = M.D();
        q630 c2 = qri.c(M, q630.a.a);
        cri.h7.getClass();
        LayoutNode.a aVar4 = cri.a.b;
        if (M.N() == null) {
            n34.r();
            throw th;
        }
        M.H();
        if (M.L()) {
            M.I(aVar4);
        } else {
            M.f();
        }
        k9q0.w(M, a2, cri.a.f);
        k9q0.w(M, D, cri.a.e);
        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(M, cri.a.h);
        k9q0.w(M, c2, cri.a.d);
        M.K(698365534);
        for (b bVar9 : list) {
            boolean y = M.y(this) | M.y(bVar9) | M.J(gzsVar);
            Object x2 = M.x();
            if (y || x2 == obj) {
                x2 = new sdr(this, bVar9, gzsVar, 6);
                M.R(x2);
            }
            a(bVar9, (gzs) x2, M, 0);
        }
        if (gp.d(M)) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new no0(i2, 2, this, gzsVar, z);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-197967454);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-197967454, i, -1, "com.vk.libvideo.bottomsheet.VideoSettingsBottomSheetRedesign.VkThemeRedesign (VideoSettingsBottomSheetRedesign.kt:132)");
            }
            M.K(-657987114);
            jaiVar2 = jaiVar;
            rrv0.e(true, null, null, null, null, null, jaiVar2, M, 1572870, 62);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r85(this, jaiVar2, i, 12);
        }
    }
}

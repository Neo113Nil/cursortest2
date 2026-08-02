package xsna;

import android.content.Intent;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayerMode;

/* compiled from: AudioPlayerNotificationClickStatsSender.kt */
/* loaded from: classes3.dex */
public final class ws4 {
    public final u750 a;
    public final PlayerMode b = PlayerMode.AUDIO;

    /* compiled from: AudioPlayerNotificationClickStatsSender.kt */
    public static final class a {
        public final boolean a;
        public final Intent b;
        public final Boolean c;

        public a(boolean z, Intent intent, Boolean bool) {
            this.a = z;
            this.b = intent;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
            Boolean bool = this.c;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationStatParams(isScreenOnAndLocked=");
            sb.append(this.a);
            sb.append(", intent=");
            sb.append(this.b);
            sb.append(", isMusic=");
            return tn.a(sb, this.c, ')');
        }
    }

    /* compiled from: AudioPlayerNotificationClickStatsSender.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoopMode.values().length];
            try {
                iArr[LoopMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoopMode.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoopMode.TRACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ws4(u750 u750Var) {
        this.a = u750Var;
    }

    public static boolean a(a aVar) {
        Boolean bool = aVar.c;
        Intent intent = aVar.b;
        if (epx.f(bool, Boolean.TRUE)) {
            return epx.f(intent.getStringExtra("music_notification"), "notification") || b(intent);
        }
        return false;
    }

    public static boolean b(Intent intent) {
        return epx.f(intent.getStringExtra("player_widget"), "small_player_widget") || epx.f(intent.getStringExtra("player_widget"), "big_player_widget");
    }
}

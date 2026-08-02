package xsna;

import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.domain.model.MixData;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;

/* compiled from: MusicVkMixSettingsAction.kt */
/* loaded from: classes3.dex */
public interface ue50 extends kj50 {

    /* compiled from: MusicVkMixSettingsAction.kt */
    public static final class a implements ue50 {
        public final MixSettings b;

        public a(MixSettings mixSettings) {
            this.b = mixSettings;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b.equals(((a) obj).b);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "AcceptClick(options=" + this.b + ", closeAfter=true)";
        }
    }

    /* compiled from: MusicVkMixSettingsAction.kt */
    public static final class b implements ue50 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1875881922;
        }

        public final String toString() {
            return "CloseAction";
        }
    }

    /* compiled from: MusicVkMixSettingsAction.kt */
    public static final class c implements ue50 {
        public final MixData b;
        public final MusicBottomSheetLaunchPoint c;

        public c(MixData mixData, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
            this.b = mixData;
            this.c = musicBottomSheetLaunchPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Init(mixData=" + this.b + ", launchPoint=" + this.c + ')';
        }
    }

    /* compiled from: MusicVkMixSettingsAction.kt */
    public static final class d implements ue50 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 449690576;
        }

        public final String toString() {
            return "RetryClick";
        }
    }
}

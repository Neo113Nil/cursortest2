package xsna;

import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;

/* compiled from: MusicVkMixSettingsPatch.kt */
/* loaded from: classes3.dex */
public interface ye50 extends xl50 {

    /* compiled from: MusicVkMixSettingsPatch.kt */
    public static final class a implements ye50 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2117985274;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: MusicVkMixSettingsPatch.kt */
    public static final class b implements ye50 {
        public final MixSettings b;

        public b(MixSettings mixSettings) {
            this.b = mixSettings;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loaded(settings=" + this.b + ')';
        }
    }

    /* compiled from: MusicVkMixSettingsPatch.kt */
    public static final class c implements ye50 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1384988334;
        }

        public final String toString() {
            return "Loading";
        }
    }
}

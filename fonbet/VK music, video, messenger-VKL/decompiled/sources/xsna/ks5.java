package xsna;

import com.vk.dto.common.im.ImageList;
import com.vkontakte.android.R;

/* compiled from: AvatarState.kt */
/* loaded from: classes16.dex */
public abstract class ks5 {

    /* compiled from: AvatarState.kt */
    public static final class a extends ks5 {
        public final int a = R.drawable.vk_icon_avatar_placeholder_sad_persik_alt_150;
    }

    /* compiled from: AvatarState.kt */
    public static final class b extends ks5 {
        public final ImageList a;

        public b(ImageList imageList) {
            this.a = imageList;
        }
    }

    /* compiled from: AvatarState.kt */
    public static final class c extends ks5 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 130127133;
        }

        public final String toString() {
            return "Locked";
        }
    }

    /* compiled from: AvatarState.kt */
    public static final class d extends ks5 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 719747595;
        }

        public final String toString() {
            return "None";
        }
    }
}

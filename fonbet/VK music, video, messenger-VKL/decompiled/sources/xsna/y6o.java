package xsna;

import com.vkontakte.android.R;
import java.security.SecureRandom;
import java.util.ArrayList;

/* compiled from: DoubleTapAnimationRepositoryV2.kt */
/* loaded from: classes18.dex */
public final class y6o {
    public final cfl a;
    public final com.vk.movika.sdk.base.asset.b b;
    public final n900<a> c = new n900<>(819200);
    public final ArrayList<a> d = e43.a(new a(Integer.valueOf(cn70.b(120))));
    public final SecureRandom e = new SecureRandom();

    /* compiled from: DoubleTapAnimationRepositoryV2.kt */
    public static final class a {
        public final Integer a;

        public a(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a.equals(aVar.a);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + ((this.a.hashCode() + shy.a(R.raw.red_like_v3, 1103101051, 31)) * 31);
        }

        public final String toString() {
            return oq.b(new StringBuilder("AnimationSticker(animationName=like_v3, animationResource=2131886233, size="), this.a, ", animateSceneInteraction=true)");
        }
    }

    public y6o(cfl cflVar) {
        this.a = cflVar;
        this.b = new com.vk.movika.sdk.base.asset.b(cflVar);
    }
}

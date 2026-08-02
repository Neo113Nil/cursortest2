package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import java.util.List;

/* compiled from: ShareStoryViewState.kt */
/* loaded from: classes16.dex */
public final class e9j0 implements ao50 {
    public final fi50 a;

    /* compiled from: ShareStoryViewState.kt */
    public static final class a implements fm50<c9j0> {
        public final yzt0<List<hfz>> a;
        public final yzt0<b> b;
        public final yzt0<Integer> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }
    }

    /* compiled from: ShareStoryViewState.kt */
    public static final class b {
        public final StoryPrivacyType a;
        public final boolean b;

        public b(StoryPrivacyType storyPrivacyType, boolean z) {
            this.a = storyPrivacyType;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Privacy(privacy=");
            sb.append(this.a);
            sb.append(", isGroup=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public e9j0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}

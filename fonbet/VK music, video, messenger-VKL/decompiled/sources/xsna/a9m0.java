package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoryPrivacyAction.kt */
/* loaded from: classes16.dex */
public abstract class a9m0 implements kj50 {

    /* compiled from: StoryPrivacyAction.kt */
    public static final class a extends a9m0 {
        public final StoryPrivacyType b;

        public a(StoryPrivacyType storyPrivacyType) {
            this.b = storyPrivacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChoosePrivacy(type=" + this.b + ')';
        }
    }

    /* compiled from: StoryPrivacyAction.kt */
    public static final class b extends a9m0 {
        public static final b b = new b();
    }

    /* compiled from: StoryPrivacyAction.kt */
    public static final class c extends a9m0 {
        public static final c b = new c();
    }

    /* compiled from: StoryPrivacyAction.kt */
    public static final class d extends a9m0 {
        public static final d b = new d();
    }

    /* compiled from: StoryPrivacyAction.kt */
    public static final class e extends a9m0 {
        public static final e b = new e();
    }

    /* compiled from: StoryPrivacyAction.kt */
    public static final class f extends a9m0 {
        public final List<UserId> b;

        public f(List<UserId> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("OpenHiddenFriendsFragment(excludedFriends="), this.b);
        }
    }

    /* compiled from: StoryPrivacyAction.kt */
    public static final class g extends a9m0 {
        public static final g b = new g();
    }

    /* compiled from: StoryPrivacyAction.kt */
    public static final class h extends a9m0 {
        public final StoryPrivacyType b;
        public final ArrayList c;

        public h(StoryPrivacyType storyPrivacyType, ArrayList arrayList) {
            this.b = storyPrivacyType;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b == hVar.b && epx.f(this.c, hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateBestFriends(selectedPrivacyType=");
            sb.append(this.b);
            sb.append(", bestFriends=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    /* compiled from: StoryPrivacyAction.kt */
    public static final class i extends a9m0 {
        public final ArrayList b;

        public i(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("UpdateExcludedFriends(excludedFriends="), this.b);
        }
    }
}

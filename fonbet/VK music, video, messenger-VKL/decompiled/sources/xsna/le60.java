package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.SocialButtonType;

/* compiled from: NewsfeedCoownersListSideEffect.kt */
/* loaded from: classes17.dex */
public abstract class le60 {

    /* compiled from: NewsfeedCoownersListSideEffect.kt */
    public static abstract class a extends le60 {

        /* compiled from: NewsfeedCoownersListSideEffect.kt */
        /* renamed from: xsna.le60$a$a, reason: collision with other inner class name */
        public static final class C3263a extends a {
            public static final C3263a a = new C3263a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3263a);
            }

            public final int hashCode() {
                return 1559719633;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: NewsfeedCoownersListSideEffect.kt */
        public static final class b extends a {
            public final UserId a;

            public b(UserId userId) {
                this.a = userId;
            }
        }
    }

    /* compiled from: NewsfeedCoownersListSideEffect.kt */
    public static final class b extends le60 {
        public final UserId a;
        public final boolean b;
        public final SocialButtonType c;
        public final String d;

        public b(UserId userId, boolean z, SocialButtonType socialButtonType, String str) {
            this.a = userId;
            this.b = z;
            this.c = socialButtonType;
            this.d = str;
        }
    }
}

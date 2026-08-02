package xsna;

import com.vk.im.edu.common.api.model.EduRoleType;
import java.util.Collections;

/* compiled from: EduRoleDto.kt */
/* loaded from: classes2.dex */
public final class p6p {

    /* compiled from: EduRoleDto.kt */
    public static final class a {

        /* compiled from: EduRoleDto.kt */
        /* renamed from: xsna.p6p$a$a, reason: collision with other inner class name */
        public static final class C3494a {
            public final int a;
            public final EduRoleType b;

            public C3494a() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3494a)) {
                    return false;
                }
                C3494a c3494a = (C3494a) obj;
                return this.a == c3494a.a && this.b == c3494a.b;
            }

            public final int hashCode() {
                return (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
            }

            public final String toString() {
                return "EduRoleDetailDto(roleSort=" + this.a + ", roleCode=" + this.b + ", details=null)";
            }

            public C3494a(int i) {
                EduRoleType eduRoleType = EduRoleType.UNKNOWN;
                this.a = Integer.MAX_VALUE;
                this.b = eduRoleType;
            }
        }

        static {
            Collections.singletonList(new C3494a(0));
        }

        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6p)) {
            return false;
        }
        ((p6p) obj).getClass();
        return true;
    }

    public final int hashCode() {
        Long.hashCode(0L);
        throw null;
    }

    public final String toString() {
        return "EduRoleDto(userId=0, mainRoles=null, mainRoleCode=null, organizations=null)";
    }
}

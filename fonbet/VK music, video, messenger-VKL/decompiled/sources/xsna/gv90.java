package xsna;

import android.content.Context;
import com.vk.search.models.VkRelation;

/* compiled from: PeopleLocalizedParamsDescriptionMapper.kt */
/* loaded from: classes5.dex */
public final class gv90 extends b920 {

    /* compiled from: PeopleLocalizedParamsDescriptionMapper.kt */
    public static final class a implements cxz<VkRelation> {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // xsna.cxz
        public final String a(Context context, Object obj) {
            return ((VkRelation) obj).a(context, this.a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("RelationshipsDescriptionResolver(isMale="), this.a, ')');
        }
    }
}

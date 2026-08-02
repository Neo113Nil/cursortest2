package xsna;

import com.vk.im.engine.models.dialogs.RecommendedFolder;
import java.util.List;

/* compiled from: FoldersRecommendedListLoader.kt */
/* loaded from: classes18.dex */
public abstract class x1s {

    /* compiled from: FoldersRecommendedListLoader.kt */
    public static final class a extends x1s {
        public final List<RecommendedFolder> a;

        public a(List<RecommendedFolder> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Data(folders="), this.a);
        }
    }

    /* compiled from: FoldersRecommendedListLoader.kt */
    public static final class b extends x1s {
        public static final b a = new b();
    }
}

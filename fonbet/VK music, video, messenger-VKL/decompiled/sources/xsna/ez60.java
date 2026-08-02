package xsna;

import com.vk.feed.settings.api.domain.model.FilteredSourceType;

/* compiled from: NewsfeedSettingsEvent.kt */
/* loaded from: classes18.dex */
public abstract class ez60 {

    /* compiled from: NewsfeedSettingsEvent.kt */
    public static final class a extends ez60 {
        public final FilteredSourceType a;
        public final int b;

        public a(FilteredSourceType filteredSourceType, int i) {
            this.a = filteredSourceType;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FilteredSourcesCounterChanged(sourceType=");
            sb.append(this.a);
            sb.append(", value=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: NewsfeedSettingsEvent.kt */
    public static abstract class b extends ez60 {

        /* compiled from: NewsfeedSettingsEvent.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: NewsfeedSettingsEvent.kt */
        /* renamed from: xsna.ez60$b$b, reason: collision with other inner class name */
        public static final class C2842b extends b {
            public static final C2842b a = new C2842b();
        }
    }
}

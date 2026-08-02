package xsna;

import com.vk.dto.stories.model.GifItem;
import com.vk.dto.stories.model.GifWithQueryData;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: GifSearchState.kt */
/* loaded from: classes15.dex */
public final class czt {
    public List<GifItem> a;
    public GifWithQueryData b;
    public a c;
    public boolean d;

    /* compiled from: GifSearchState.kt */
    public static final class a {
        public final Throwable a;
        public final boolean b;

        public a(Throwable th, boolean z) {
            this.a = th;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ErrorState(throwable=");
            sb.append(this.a);
            sb.append(", isReload=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public czt() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czt)) {
            return false;
        }
        czt cztVar = (czt) obj;
        return epx.f(this.a, cztVar.a) && epx.f(this.b, cztVar.b) && epx.f(this.c, cztVar.c) && this.d == cztVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        a aVar = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifSearchState(recentGifs=");
        sb.append(this.a);
        sb.append(", currentGifData=");
        sb.append(this.b);
        sb.append(", errorState=");
        sb.append(this.c);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public czt(Object obj) {
        EmptyList emptyList = EmptyList.b;
        GifWithQueryData gifWithQueryData = new GifWithQueryData("", emptyList);
        this.a = emptyList;
        this.b = gifWithQueryData;
        this.c = null;
        this.d = false;
    }
}

package xsna;

import com.vk.api.photos.PhotosGetAlbums;
import com.vk.dto.common.id.UserId;
import java.util.LinkedHashMap;

/* compiled from: AllAlbumsObservableFactory.kt */
/* loaded from: classes4.dex */
public final class pt1 {
    public static final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: AllAlbumsObservableFactory.kt */
    public static final class a {
        public final UserId a;
        public final yea0 b;

        public a(UserId userId, yea0 yea0Var) {
            this.a = userId;
            this.b = yea0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + qoy.b(Long.hashCode(this.a.b) * 31, 31, true);
        }

        public final String toString() {
            return "Descriptor(oid=" + this.a + ", needSystem=true, params=" + this.b + ')';
        }
    }

    public static io.reactivex.rxjava3.core.q a(UserId userId, yea0 yea0Var) {
        a aVar = new a(userId, yea0Var);
        LinkedHashMap linkedHashMap = a;
        io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) linkedHashMap.get(aVar);
        if (qVar != null) {
            return qVar;
        }
        io.reactivex.rxjava3.internal.operators.observable.x1 k0 = new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.y0(new PhotosGetAlbums(userId, true, yea0Var), null, null, 3), new ot1(aVar, 0)).k0();
        linkedHashMap.put(aVar, k0);
        return k0;
    }
}

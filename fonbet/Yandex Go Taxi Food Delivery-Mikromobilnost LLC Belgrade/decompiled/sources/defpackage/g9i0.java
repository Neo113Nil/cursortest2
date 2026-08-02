package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lg9i0;", "", "", "getId", "()Ljava/lang/String;", "id", "Lorg/json/JSONObject;", "getData", "()Lorg/json/JSONObject;", Constants.KEY_DATA, "Y3", "a", "b", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g9i0 {

    /* renamed from: Y3, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg9i0$a;", "", "<init>", "()V", "", "id", "Lorg/json/JSONObject;", Constants.KEY_DATA, "Lg9i0;", "a", "(Ljava/lang/String;Lorg/json/JSONObject;)Lg9i0;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g9i0$a, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final g9i0 a(String id, JSONObject data) {
            return new b(id, data);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lg9i0$b;", "Lg9i0;", "", "id", "Lorg/json/JSONObject;", Constants.KEY_DATA, "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "a", "()Ljava/lang/String;", "b", "()Lorg/json/JSONObject;", "c", "(Ljava/lang/String;Lorg/json/JSONObject;)Lg9i0$b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lorg/json/JSONObject;", "getData", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements g9i0 {

        /* renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* renamed from: b, reason: from kotlin metadata */
        private final JSONObject data;

        public b(String str, JSONObject jSONObject) {
            this.id = str;
            this.data = jSONObject;
        }

        public static b d(b bVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.id;
            }
            if ((i & 2) != 0) {
                jSONObject = bVar.data;
            }
            bVar.getClass();
            return new b(str, jSONObject);
        }

        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final JSONObject getData() {
            return this.data;
        }

        public final b c(String id, JSONObject data) {
            return new b(id, data);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return jl40.l(this.id, bVar.id) && jl40.l(this.data, bVar.data);
        }

        @Override // defpackage.g9i0
        public final JSONObject getData() {
            return this.data;
        }

        @Override // defpackage.g9i0
        public final String getId() {
            return this.id;
        }

        public final int hashCode() {
            return this.data.hashCode() + (this.id.hashCode() * 31);
        }

        public final String toString() {
            return "Ready(id=" + this.id + ", data=" + this.data + ')';
        }
    }

    JSONObject getData();

    String getId();
}

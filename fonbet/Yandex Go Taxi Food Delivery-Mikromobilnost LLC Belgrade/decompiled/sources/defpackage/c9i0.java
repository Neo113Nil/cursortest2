package defpackage;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lc9i0;", "", "", "getId", "()Ljava/lang/String;", "id", "Lorg/json/JSONObject;", "c", "()Lorg/json/JSONObject;", "divData", "getMetadata", kju0.j, "X3", "a", "b", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c9i0 {

    /* renamed from: X3, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc9i0$a;", "", "<init>", "()V", "", "id", "Lorg/json/JSONObject;", "divData", kju0.j, "Lc9i0;", "a", "(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lc9i0;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: c9i0$a, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public static c9i0 b(Companion companion, String str, JSONObject jSONObject, JSONObject jSONObject2, int i, Object obj) {
            if ((i & 4) != 0) {
                jSONObject2 = null;
            }
            companion.getClass();
            return new b(str, jSONObject, jSONObject2);
        }

        public final c9i0 a(String id, JSONObject divData, JSONObject metadata) {
            return new b(id, divData, metadata);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lc9i0$b;", "Lc9i0;", "", "id", "Lorg/json/JSONObject;", "divData", kju0.j, "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lorg/json/JSONObject;", "c", "()Lorg/json/JSONObject;", "getMetadata", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements c9i0 {

        /* renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* renamed from: b, reason: from kotlin metadata */
        private final JSONObject divData;

        /* renamed from: c, reason: from kotlin metadata */
        private final JSONObject metadata;

        public b(String str, JSONObject jSONObject, JSONObject jSONObject2) {
            this.id = str;
            this.divData = jSONObject;
            this.metadata = jSONObject2;
        }

        @Override // defpackage.c9i0
        /* renamed from: c, reason: from getter */
        public final JSONObject getDivData() {
            return this.divData;
        }

        @Override // defpackage.c9i0
        public final String getId() {
            return this.id;
        }

        @Override // defpackage.c9i0
        public final JSONObject getMetadata() {
            return this.metadata;
        }
    }

    /* renamed from: c */
    JSONObject getDivData();

    String getId();

    JSONObject getMetadata();
}

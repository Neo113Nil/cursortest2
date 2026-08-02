package com.yandex.div.storage;

import defpackage.c9i0;
import defpackage.jl40;
import defpackage.kju0;
import defpackage.omk;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wmk;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0015\u0013\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH'¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/DivDataRepository;", "", "Lcom/yandex/div/storage/DivDataRepository$b;", "payload", "Lcom/yandex/div/storage/b;", "c", "(Lcom/yandex/div/storage/DivDataRepository$b;)Lcom/yandex/div/storage/b;", "", "", "ids", "b", "(Ljava/util/List;)Lcom/yandex/div/storage/b;", "getAll", "()Lcom/yandex/div/storage/b;", "Lkotlin/Function1;", "Lc9i0;", "", "predicate", "Lwmk;", "a", "(Ltls;)Lwmk;", "ActionOnError", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DivDataRepository {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "", "(Ljava/lang/String;I)V", "ABORT_TRANSACTION", "SKIP_ELEMENT", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ActionOnError {
        ABORT_TRANSACTION,
        SKIP_ELEMENT
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/storage/DivDataRepository$a;", "", "", "id", "Lomk;", "divData", "Lorg/json/JSONObject;", kju0.j, "<init>", "(Ljava/lang/String;Lomk;Lorg/json/JSONObject;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lomk;", "()Lomk;", "c", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* renamed from: b, reason: from kotlin metadata */
        private final omk divData;

        /* renamed from: c, reason: from kotlin metadata */
        private final JSONObject metadata;

        public a(String str, omk omkVar, JSONObject jSONObject) {
            this.id = str;
            this.divData = omkVar;
            this.metadata = jSONObject;
        }

        /* renamed from: a, reason: from getter */
        public final omk getDivData() {
            return this.divData;
        }

        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: c, reason: from getter */
        public final JSONObject getMetadata() {
            return this.metadata;
        }
    }

    wmk a(tls predicate);

    com.yandex.div.storage.b b(List<String> ids);

    com.yandex.div.storage.b c(b payload);

    com.yandex.div.storage.b getAll();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\u000fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010\u0015¨\u0006("}, d2 = {"Lcom/yandex/div/storage/DivDataRepository$b;", "", "", "Lc9i0;", "divs", "", "", "Lorg/json/JSONObject;", "templates", "sourceType", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)V", "a", "()Ljava/util/List;", "b", "()Ljava/util/Map;", "c", "()Ljava/lang/String;", "d", "()Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "e", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lcom/yandex/div/storage/DivDataRepository$b;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "h", "Ljava/util/Map;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "Ljava/lang/String;", CoreConstants.PushMessage.SERVICE_TYPE, "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "g", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: from kotlin metadata */
        private final List<c9i0> divs;

        /* renamed from: b, reason: from kotlin metadata */
        private final Map<String, JSONObject> templates;

        /* renamed from: c, reason: from kotlin metadata */
        private final String sourceType;

        /* renamed from: d, reason: from kotlin metadata */
        private final ActionOnError actionOnError;

        public /* synthetic */ b(List list, Map map, String str, ActionOnError actionOnError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? kotlin.collections.b.f() : map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ActionOnError.ABORT_TRANSACTION : actionOnError);
        }

        public static b f(b bVar, List list, Map map, String str, ActionOnError actionOnError, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bVar.divs;
            }
            if ((i & 2) != 0) {
                map = bVar.templates;
            }
            if ((i & 4) != 0) {
                str = bVar.sourceType;
            }
            if ((i & 8) != 0) {
                actionOnError = bVar.actionOnError;
            }
            bVar.getClass();
            return new b(list, map, str, actionOnError);
        }

        public final List<c9i0> a() {
            return this.divs;
        }

        public final Map<String, JSONObject> b() {
            return this.templates;
        }

        /* renamed from: c, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        /* renamed from: d, reason: from getter */
        public final ActionOnError getActionOnError() {
            return this.actionOnError;
        }

        public final b e(List<? extends c9i0> divs, Map<String, ? extends JSONObject> templates, String sourceType, ActionOnError actionOnError) {
            return new b(divs, templates, sourceType, actionOnError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return jl40.l(this.divs, bVar.divs) && jl40.l(this.templates, bVar.templates) && jl40.l(this.sourceType, bVar.sourceType) && this.actionOnError == bVar.actionOnError;
        }

        public final ActionOnError g() {
            return this.actionOnError;
        }

        public final List<c9i0> h() {
            return this.divs;
        }

        public final int hashCode() {
            int d = unr0.d(this.divs.hashCode() * 31, 31, this.templates);
            String str = this.sourceType;
            return this.actionOnError.hashCode() + ((d + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String i() {
            return this.sourceType;
        }

        public final Map<String, JSONObject> j() {
            return this.templates;
        }

        public final String toString() {
            return "Payload(divs=" + this.divs + ", templates=" + this.templates + ", sourceType=" + this.sourceType + ", actionOnError=" + this.actionOnError + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends c9i0> list, Map<String, ? extends JSONObject> map, String str, ActionOnError actionOnError) {
            this.divs = list;
            this.templates = map;
            this.sourceType = str;
            this.actionOnError = actionOnError;
        }
    }
}

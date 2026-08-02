package defpackage;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lhgy0;", "", "a", "b", "c", "Lhgy0$a;", "Lhgy0$b;", "Lhgy0$c;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface hgy0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhgy0$a;", "Lhgy0;", "<init>", "()V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements hgy0 {
        public static final a a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhgy0$b;", "Lhgy0;", "<init>", "()V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements hgy0 {
        public static final b a = new b();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhgy0$c;", "Lhgy0;", "", "source", "", "extendExistingTemplates", "", "", "templates", "<init>", "(Ljava/lang/String;ZLjava/util/Map;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "()Z", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements hgy0 {

        /* renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* renamed from: b, reason: from kotlin metadata */
        private final boolean extendExistingTemplates;

        /* renamed from: c, reason: from kotlin metadata */
        private final Map<String, byte[]> templates;

        public c(String str, boolean z, Map<String, byte[]> map) {
            this.source = str;
            this.extendExistingTemplates = z;
            this.templates = map;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getExtendExistingTemplates() {
            return this.extendExistingTemplates;
        }

        /* renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Map<String, byte[]> c() {
            return this.templates;
        }
    }
}

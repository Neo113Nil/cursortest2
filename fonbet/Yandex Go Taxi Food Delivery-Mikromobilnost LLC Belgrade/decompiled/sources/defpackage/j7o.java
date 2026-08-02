package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\r"}, d2 = {"Lj7o;", "", "", "shortReason", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "a", "()Ljava/util/Map;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j7o {

    /* renamed from: a, reason: from kotlin metadata */
    private final String shortReason;

    /* renamed from: b, reason: from kotlin metadata */
    private final String details;

    public /* synthetic */ j7o(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.details;
        if (str != null) {
            linkedHashMap.put("details", str);
        }
        return linkedHashMap;
    }

    /* renamed from: b, reason: from getter */
    public final String getShortReason() {
        return this.shortReason;
    }

    public j7o(String str, String str2) {
        this.shortReason = str;
        this.details = str2;
    }
}

package defpackage;

import com.yandex.go.superapp.api.loading_tracker.EatsKitOpenType;
import java.util.LinkedHashMap;

/* loaded from: classes14.dex */
public final class gdn {
    public boolean b;
    public String d;
    public final LinkedHashMap a = new LinkedHashMap();
    public EatsKitOpenType c = EatsKitOpenType.CACHE;

    public final void a() {
        this.a.clear();
        this.b = false;
        this.c = EatsKitOpenType.CACHE;
        this.d = null;
    }
}

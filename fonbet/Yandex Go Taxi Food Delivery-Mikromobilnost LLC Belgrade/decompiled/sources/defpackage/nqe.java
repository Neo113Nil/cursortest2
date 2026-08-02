package defpackage;

import kotlin.collections.builders.MapBuilder;

/* loaded from: classes2.dex */
public final class nqe extends wtf0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nqe(String str) {
        super("Core.SendTextRequestFailed", r0.j());
        MapBuilder mapBuilder = new MapBuilder();
        if (str != null) {
            mapBuilder.put("msg", str);
        }
    }

    public nqe() {
        this(null);
    }
}

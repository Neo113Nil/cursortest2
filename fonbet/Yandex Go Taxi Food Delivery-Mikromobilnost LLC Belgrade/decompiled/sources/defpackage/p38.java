package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class p38 {
    public final List a;

    public p38(List list) {
        if (list == null || list.isEmpty()) {
            ny61.g("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.a = ly3.w(list);
    }
}

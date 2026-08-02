package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class m3m implements jwi0 {
    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        if (str.equals("DocumentVisualEventsTracker")) {
            return p3m.Companion.serializer();
        }
        return null;
    }
}

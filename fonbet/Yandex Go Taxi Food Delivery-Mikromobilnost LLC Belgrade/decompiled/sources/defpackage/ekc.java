package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ekc extends clc {
    public ekc(String str, png pngVar, List list, Boolean bool) {
        super("registerPlatformCapability", new dkc(str, pngVar, list, bool));
    }

    @Override // defpackage.clc
    public final String d(zcx zcxVar) {
        return zcxVar.c(this.b, dkc.Companion.serializer());
    }
}

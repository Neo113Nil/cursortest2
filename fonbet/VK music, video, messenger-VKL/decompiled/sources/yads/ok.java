package yads;

import android.media.AudioAttributes;

/* loaded from: classes10.dex */
public final class ok {
    public final AudioAttributes a;

    public ok(pk pkVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(pkVar.b).setFlags(pkVar.c).setUsage(pkVar.d);
        int i = mc3.a;
        if (i >= 29) {
            mk.a(usage, pkVar.e);
        }
        if (i >= 32) {
            nk.a(usage, pkVar.f);
        }
        this.a = usage.build();
    }
}

package xsna;

import java.util.Map;

/* compiled from: MyTargetParcerImpl.kt */
/* loaded from: classes17.dex */
public final class ns50 implements ms50 {
    public final bjx a;
    public final yix b;

    public ns50(bjx bjxVar, yix yixVar) {
        this.a = bjxVar;
        this.b = yixVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // xsna.ms50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final os50 a(String str, izs<? super Throwable, s3q0> izsVar) {
        p5z0 p5z0Var;
        bjx bjxVar;
        Map b = dt.b("stories_playhead_v2", "1");
        try {
            bjxVar = this.a;
        } catch (Throwable th) {
            izsVar.invoke(th);
        }
        if (bjxVar != null) {
            p5z0Var = bjxVar.a(str, "VK_CLIPS_FEED", b);
            if (p5z0Var != null) {
                return null;
            }
            return new os50(p5z0Var, new aq50(p5z0Var, this.b));
        }
        p5z0Var = null;
        if (p5z0Var != null) {
        }
    }
}

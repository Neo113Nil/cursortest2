package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class yu3 extends Lambda implements gzs {
    public final /* synthetic */ zu3 b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu3(zu3 zu3Var, ArrayList arrayList) {
        super(0);
        this.b = zu3Var;
        this.c = arrayList;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onAdsLoaded(this.c);
        return s3q0.a;
    }
}

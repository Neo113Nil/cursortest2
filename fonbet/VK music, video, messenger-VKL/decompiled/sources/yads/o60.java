package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class o60 extends Lambda implements gzs {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(Context context) {
        super(0);
        this.b = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new z70(x92.d.a(this.b).a, new ArrayList());
    }
}

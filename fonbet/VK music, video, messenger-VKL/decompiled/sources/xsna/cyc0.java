package xsna;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Lambda;

/* compiled from: PreferenceDataStoreDelegate.android.kt */
/* loaded from: classes12.dex */
public final class cyc0 extends Lambda implements gzs<File> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ dyc0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyc0(Context context, dyc0 dyc0Var) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = dyc0Var;
    }

    @Override // xsna.gzs
    public final File invoke() {
        return fd01.a(this.$applicationContext, this.this$0.b);
    }
}

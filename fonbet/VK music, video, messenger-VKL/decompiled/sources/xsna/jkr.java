package xsna;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Lambda;

/* compiled from: FirebaseSessionsComponent.kt */
/* loaded from: classes.dex */
public final class jkr extends Lambda implements gzs<File> {
    final /* synthetic */ Context $appContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkr(Context context) {
        super(0);
        this.$appContext = context;
    }

    @Override // xsna.gzs
    public final File invoke() {
        return fd01.a(this.$appContext, dti0.a);
    }
}

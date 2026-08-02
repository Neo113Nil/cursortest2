package xsna;

import org.chromium.base.Callback;
import org.chromium.base.Promise;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class j4e0 implements Callback {
    public final /* synthetic */ Promise b;

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void lambda$bind$0(Object obj) {
        this.b.reject((Exception) obj);
    }
}

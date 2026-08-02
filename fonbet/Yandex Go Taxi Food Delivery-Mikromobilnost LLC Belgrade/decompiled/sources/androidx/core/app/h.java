package androidx.core.app;

import android.content.Intent;

/* loaded from: classes10.dex */
public final class h implements i {
    public final Intent a;
    public final int b;
    public final /* synthetic */ JobIntentService c;

    public h(JobIntentService jobIntentService, Intent intent, int i) {
        this.c = jobIntentService;
        this.a = intent;
        this.b = i;
    }

    @Override // androidx.core.app.i
    public final void e() {
        this.c.stopSelf(this.b);
    }

    @Override // androidx.core.app.i
    public final Intent getIntent() {
        return this.a;
    }
}

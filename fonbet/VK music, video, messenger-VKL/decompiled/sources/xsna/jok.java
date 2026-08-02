package xsna;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes11.dex */
public final class jok implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ kok f;

    public jok(kok kokVar, int i, Uri uri, boolean z, Bundle bundle) {
        this.f = kokVar;
        this.b = i;
        this.c = uri;
        this.d = z;
        this.e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.b.onRelationshipValidationResult(this.b, this.c, this.d, this.e);
    }
}

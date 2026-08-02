package xsna;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: AlbumsDataProvider.kt */
/* loaded from: classes15.dex */
public final class hm1 extends ContentObserver {
    public final /* synthetic */ im1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm1(im1 im1Var, Handler handler) {
        super(handler);
        this.a = im1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.b();
    }
}

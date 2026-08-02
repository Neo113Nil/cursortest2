package xsna;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes11.dex */
public final class wrx0 extends ContentObserver {
    public final /* synthetic */ nm8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrx0(nm8 nm8Var, Handler handler) {
        super(handler);
        this.a = nm8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.f(s3q0.a);
    }
}

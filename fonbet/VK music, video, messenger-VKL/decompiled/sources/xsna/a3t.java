package xsna;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: GalleryChangeObserver.kt */
/* loaded from: classes4.dex */
public final class a3t extends ContentObserver {
    public final /* synthetic */ y2t a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3t(y2t y2tVar, Handler handler) {
        super(handler);
        this.a = y2tVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.invoke();
    }
}

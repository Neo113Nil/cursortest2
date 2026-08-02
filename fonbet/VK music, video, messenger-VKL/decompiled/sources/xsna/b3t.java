package xsna;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: GalleryChangeObserver.kt */
/* loaded from: classes15.dex */
public final class b3t extends ContentObserver {
    public final /* synthetic */ sdr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3t(sdr sdrVar, Handler handler) {
        super(handler);
        this.a = sdrVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.invoke();
    }
}

package androidx.loader.content;

import android.database.ContentObserver;
import android.os.Handler;
import defpackage.ryy;

/* loaded from: classes10.dex */
public final class Loader$ForceLoadContentObserver extends ContentObserver {
    final /* synthetic */ ryy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Loader$ForceLoadContentObserver(ryy ryyVar) {
        super(new Handler());
        this.this$0 = ryyVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        ryy ryyVar = this.this$0;
        if (ryyVar.b) {
            ryyVar.b();
        } else {
            ryyVar.e = true;
        }
    }
}

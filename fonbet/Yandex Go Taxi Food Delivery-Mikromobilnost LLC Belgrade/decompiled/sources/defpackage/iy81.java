package defpackage;

import com.google.android.gms.common.api.internal.GoogleApiManager;

/* loaded from: classes.dex */
public final class iy81 implements zg4 {
    public final /* synthetic */ GoogleApiManager a;

    public iy81(GoogleApiManager googleApiManager) {
        this.a = googleApiManager;
    }

    @Override // defpackage.zg4
    public final void a(boolean z) {
        GoogleApiManager googleApiManager = this.a;
        googleApiManager.zar.sendMessage(googleApiManager.zar.obtainMessage(1, Boolean.valueOf(z)));
    }
}

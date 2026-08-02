package xsna;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.z640;

/* compiled from: LockedOrientationDelegateImpl.kt */
/* loaded from: classes7.dex */
public final class a000 implements yzz, zzz {
    public final Context b;
    public volatile boolean e;
    public volatile float i;
    public io.reactivex.rxjava3.disposables.c c = EmptyDisposable.INSTANCE;
    public final ArrayList d = new ArrayList();
    public final Uri f = Settings.System.getUriFor("accelerometer_rotation");
    public final a g = new a();
    public z640 h = z640.a.a;

    /* compiled from: LockedOrientationDelegateImpl.kt */
    public static final class a extends ContentObserver {
        public a() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            a000 a000Var = a000.this;
            boolean z2 = Settings.System.getInt(a000Var.b.getContentResolver(), "accelerometer_rotation", 0) == 1;
            a000Var.e = z2;
            if (z2) {
                return;
            }
            a000 a000Var2 = a000.this;
            a000Var2.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            a000Var2.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public a000(Context context) {
        this.b = context;
    }

    @Override // xsna.yzz
    public final void a() {
        e(this.i);
    }

    @Override // xsna.zzz
    public final void b(j6m j6mVar) {
        this.d.remove(j6mVar);
    }

    @Override // xsna.zzz
    public final float c() {
        return this.i;
    }

    @Override // xsna.zzz
    public final void d(j6m j6mVar) {
        this.d.add(j6mVar);
        j6mVar.v0(this.i);
    }

    @Override // xsna.yzz
    public final void disable() {
        this.h = z640.a.a;
        this.b.getContentResolver().unregisterContentObserver(this.g);
        this.c.dispose();
    }

    public final void e(float f) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((j6m) it.next()).v0(f);
        }
    }

    @Override // xsna.zzz
    public final boolean isHorizontal() {
        float f = this.i;
        return f == 270.0f || f == 90.0f;
    }
}

package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import defpackage.bvf0;
import defpackage.ci9;
import defpackage.cvw;
import defpackage.dse;
import defpackage.ese;
import defpackage.f851;
import defpackage.ffx;
import defpackage.fse;
import defpackage.hz40;
import defpackage.ike;
import defpackage.ja30;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rol0;
import defpackage.sb2;
import defpackage.tje;
import defpackage.tx40;
import defpackage.wls;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class p implements ja30 {
    public static final /* synthetic */ int x = 0;
    public final Context a;
    public ike b;
    public final tx40 c = androidx.compose.runtime.f.f(1.0f);
    public pzt0 w;

    public p(Context context) {
        this.a = context;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    @Override // defpackage.ja30
    public final float getScaleFactor() {
        n4u0 n4u0Var;
        if (this.w == null) {
            Context context = this.a;
            hz40 hz40Var = f851.a;
            synchronized (hz40Var) {
                try {
                    Object d = hz40Var.d(context);
                    if (d == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        final kotlinx.coroutines.channels.a a = sb2.a(-1, null, null, 6);
                        final Handler createAsync = Handler.createAsync(Looper.getMainLooper());
                        d = kotlinx.coroutines.flow.e.R(new rol0(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(createAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                            @Override // android.database.ContentObserver
                            public void onChange(boolean selfChange, Uri uri) {
                                ci9.this.d(zy11.a);
                            }
                        }, a, context, null)), bvf0.b(), wsr0.a(xsr0.a, 3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        hz40Var.o(context, d);
                    }
                    n4u0Var = (n4u0) d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c.setFloatValue(((Number) n4u0Var.getValue()).floatValue());
            ike ikeVar = this.b;
            if (ikeVar == null) {
                ny61.r("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.w = tje.N(ikeVar, null, null, new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(n4u0Var, this, null), 3);
        }
        return this.c.getFloatValue();
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }
}

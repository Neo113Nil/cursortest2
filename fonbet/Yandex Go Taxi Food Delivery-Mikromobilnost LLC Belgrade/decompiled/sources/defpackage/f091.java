package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.service.zai;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;

/* loaded from: classes.dex */
public final class f091 extends ukt {
    public final qdy0 a0;

    public f091(Context context, Looper looper, y2c y2cVar, qdy0 qdy0Var, t4e t4eVar, yx60 yx60Var) {
        super(context, looper, SubsamplingScaleImageView.ORIENTATION_270, y2cVar, t4eVar, yx60Var);
        this.a0 = qdy0Var;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof zai ? (zai) queryLocalInterface : new zai(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Feature[] f() {
        return nz81.b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle g() {
        qdy0 qdy0Var = this.a0;
        qdy0Var.getClass();
        Bundle bundle = new Bundle();
        String str = qdy0Var.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean m() {
        return true;
    }
}

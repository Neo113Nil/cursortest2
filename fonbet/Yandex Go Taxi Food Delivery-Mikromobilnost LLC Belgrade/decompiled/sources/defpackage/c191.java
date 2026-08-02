package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p000authapi.zbn;

/* loaded from: classes11.dex */
public final class c191 extends ukt {
    public final Bundle a0;

    public c191(Context context, Looper looper, y2c y2cVar, t4e t4eVar, yx60 yx60Var) {
        super(context, looper, 223, y2cVar, t4eVar, yx60Var);
        this.a0 = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return queryLocalInterface instanceof zbn ? (zbn) queryLocalInterface : new zbn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Feature[] f() {
        return q091.e;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle g() {
        return this.a0;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean p() {
        return true;
    }
}

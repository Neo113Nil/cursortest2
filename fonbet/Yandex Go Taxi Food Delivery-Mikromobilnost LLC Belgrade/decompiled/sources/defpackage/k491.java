package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.auth.zzp;
import com.google.android.gms.internal.fido.zzz;

/* loaded from: classes11.dex */
public final class k491 extends ukt {
    public final /* synthetic */ int a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k491(Context context, Looper looper, int i, y2c y2cVar, t4e t4eVar, yx60 yx60Var, int i2) {
        super(context, looper, i, y2cVar, t4eVar, yx60Var);
        this.a0 = i2;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        switch (this.a0) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
                return queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzz(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
                return queryLocalInterface2 instanceof zzp ? (zzp) queryLocalInterface2 : new zzp(iBinder);
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public Feature[] f() {
        switch (this.a0) {
            case 1:
                return new Feature[]{yl91.c, yl91.b, yl91.a};
            default:
                return super.f();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public Bundle g() {
        switch (this.a0) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
                return bundle;
            default:
                return super.g();
        }
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        switch (this.a0) {
            case 0:
                return 13000000;
            default:
                return 17895000;
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        switch (this.a0) {
            case 0:
                return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
            default:
                return "com.google.android.gms.auth.account.data.IGoogleAuthService";
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        switch (this.a0) {
            case 0:
                return "com.google.android.gms.fido.u2f.zeroparty.START";
            default:
                return "com.google.android.gms.auth.account.authapi.START";
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public boolean m() {
        switch (this.a0) {
            case 1:
                return true;
            default:
                return super.m();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean p() {
        switch (this.a0) {
        }
        return true;
    }
}

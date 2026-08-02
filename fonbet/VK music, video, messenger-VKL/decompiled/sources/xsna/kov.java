package xsna;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Base64;
import com.vk.auth.api.models.AuthResult;
import com.vk.dto.common.id.UserId;
import com.vk.silentauth.host.SilentAuthService;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeDebugStatsItem;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.pgn0;

/* compiled from: ISilentAuthInfoProvider.java */
/* loaded from: classes5.dex */
public abstract class kov extends Binder implements IInterface {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Type inference failed for: r1v16, types: [xsna.wdx0] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Object obj;
        Signature[] signatureArr;
        Signature signature;
        anj0 anj0Var;
        wdx0 wdx0Var;
        wdx0 wdx0Var2;
        String str;
        vdx0 vdx0Var;
        AuthResult authResult;
        String string;
        String string2;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.vk.silentauth.ISilentAuthInfoProvider");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.vk.silentauth.ISilentAuthInfoProvider");
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            if (bundle != null) {
                long j = bundle.getLong("user_id");
                gzs<s3q0> gzsVar = fkq0.a;
                UserId userId = new UserId(j);
                String string3 = bundle.getString("uuid");
                if (string3 != null && (string = bundle.getString("hash")) != null && (string2 = bundle.getString("client_device_id")) != null) {
                    anj0Var = new anj0(userId, string3, string, string2, bundle.getString("client_external_device_id"));
                    wdx0Var = e370.f;
                    if (wdx0Var == null) {
                        wdx0Var = null;
                    }
                    int i3 = pgn0.a.a;
                    UserId userId2 = wdx0Var.c().b;
                    wdx0Var2 = e370.f;
                    if (wdx0Var2 == null) {
                        wdx0Var2 = null;
                    }
                    str = wdx0Var2.c().a;
                    if (str != null && anj0Var != null && anj0Var.a.equals(userId2)) {
                        vdx0Var = e370.e;
                        if (vdx0Var == null) {
                            vdx0Var = null;
                        }
                        authResult = (AuthResult) new io.reactivex.rxjava3.internal.operators.observable.e0(vdx0Var.e().k(str, anj0Var.c, anj0Var.b, anj0Var.d, anj0Var.e)).c();
                        if (authResult != null) {
                            ?? r1 = e370.f;
                            r3 = r1 != 0 ? r1 : null;
                            h7r0 h7r0Var = new h7r0(authResult.f, authResult.q, authResult.s, authResult.d, authResult.b, authResult.c);
                            r3.getClass();
                            wdx0.d().t(h7r0Var);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                }
            }
            anj0Var = null;
            wdx0Var = e370.f;
            if (wdx0Var == null) {
            }
            int i32 = pgn0.a.a;
            UserId userId22 = wdx0Var.c().b;
            wdx0Var2 = e370.f;
            if (wdx0Var2 == null) {
            }
            str = wdx0Var2.c().a;
            if (str != null) {
                vdx0Var = e370.e;
                if (vdx0Var == null) {
                }
                authResult = (AuthResult) new io.reactivex.rxjava3.internal.operators.observable.e0(vdx0Var.e().k(str, anj0Var.c, anj0Var.b, anj0Var.d, anj0Var.e)).c();
                if (authResult != null) {
                }
            }
            parcel2.writeNoException();
            return true;
        }
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        tmj0 tmj0Var = (tmj0) this;
        new x6l(new SchemeStatSak$TypeDebugStatsItem("superappkit_silent_auth_start", null, null, new JSONObject().put("is_cold_start", SilentAuthService.c).toString(), 6, null), false).q();
        PackageManager packageManager = tmj0Var.b;
        Iterator it = packageManager.getInstalledPackages(64).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((PackageInfo) obj).packageName, readString)) {
                break;
            }
        }
        PackageInfo packageInfo = (PackageInfo) obj;
        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && (signature = (Signature) rl3.O(signatureArr)) != null) {
            bnj0.a.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            r3 = Base64.encodeToString(messageDigest.digest(), 0);
        }
        String str2 = r3;
        if (readInt == 0) {
            throw new RemoteException("appId should not be 0");
        }
        if (readString == null || readString2 == null || readString3 == null) {
            throw new RemoteException("None of the arguments (packageName, digestHash, uuid) should not be null");
        }
        String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null || !rl3.G(packagesForUid, readString)) {
            throw new RemoteException("We can't recognize you");
        }
        if (!readString2.equals(str2)) {
            throw new RemoteException("Invalid apk hash. Don't try to trick me ;)");
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            List f = tmj0Var.f(readInt, readString, str2, readString3, readString4, readString5);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            parcel2.writeNoException();
            if (f == null) {
                parcel2.writeInt(-1);
                return true;
            }
            int size = f.size();
            parcel2.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                Parcelable parcelable = (Parcelable) f.get(i4);
                if (parcelable != null) {
                    parcel2.writeInt(1);
                    parcelable.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
            }
            return true;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

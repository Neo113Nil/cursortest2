package xsna;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import xsna.glx;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public interface bov extends IInterface {

    /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
    public static abstract class a extends com.google.android.gms.internal.auth_blockstore.zzb implements bov {
        public static final /* synthetic */ int a = 0;

        /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
        /* renamed from: xsna.bov$a$a, reason: collision with other inner class name */
        public static class C2617a extends com.google.android.gms.internal.auth_blockstore.zza implements bov {
            @Override // xsna.bov
            public final void D(@NonNull ClearRestoreCredentialRequest clearRestoreCredentialRequest, @NonNull glx.b bVar) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.auth_blockstore.zzc.zzb(obtainAndWriteInterfaceToken, clearRestoreCredentialRequest);
                com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, bVar);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // xsna.bov
            public final void F0(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull ilx ilxVar) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.auth_blockstore.zzc.zzb(obtainAndWriteInterfaceToken, getRestoreCredentialRequest);
                com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, ilxVar);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // xsna.bov
            public final void z1(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull hlx hlxVar) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.auth_blockstore.zzc.zzb(obtainAndWriteInterfaceToken, createRestoreCredentialRequest);
                com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, hlxVar);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }
    }

    void D(@NonNull ClearRestoreCredentialRequest clearRestoreCredentialRequest, @NonNull glx.b bVar) throws RemoteException;

    void F0(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull ilx ilxVar) throws RemoteException;

    void z1(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull hlx hlxVar) throws RemoteException;
}

package xsna;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.GetCredentialRequest;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public interface knv extends IInterface {

    /* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
    public static abstract class a extends com.google.android.gms.internal.identity_credentials.zzb implements knv {
        public static final /* synthetic */ int a = 0;

        /* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
        /* renamed from: xsna.knv$a$a, reason: collision with other inner class name */
        public static class C3191a extends com.google.android.gms.internal.identity_credentials.zza implements knv {
            @Override // xsna.knv
            public final void W(@NonNull bhx bhxVar, @NonNull GetCredentialRequest getCredentialRequest) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, bhxVar);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, getCredentialRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }
    }

    void W(@NonNull bhx bhxVar, @NonNull GetCredentialRequest getCredentialRequest) throws RemoteException;
}

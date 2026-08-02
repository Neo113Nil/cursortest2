package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes.dex */
public interface wf7 {
    @NonNull
    Task<Boolean> deleteBytes(@NonNull DeleteBytesRequest deleteBytesRequest);

    @NonNull
    Task<Boolean> isEndToEndEncryptionAvailable();

    @NonNull
    Task<RetrieveBytesResponse> retrieveBytes(@NonNull RetrieveBytesRequest retrieveBytesRequest);

    @NonNull
    Task<Integer> storeBytes(@NonNull StoreBytesData storeBytesData);
}

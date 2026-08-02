package com.yandex.passport.internal.credentials;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.n0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bf\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yandex/passport/internal/credentials/ClientCredentials;", "Lcom/yandex/passport/api/n0;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "", "getEncryptedId", "()Ljava/lang/String;", "encryptedId", "getEncryptedSecret", "encryptedSecret", "getDecryptedId", "decryptedId", "getDecryptedSecret", "decryptedSecret", "Factory", "com/yandex/passport/internal/credentials/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ClientCredentials extends n0, Parcelable {
    public static final a Factory = a.a;

    String getDecryptedId();

    String getDecryptedSecret();

    @Override // com.yandex.passport.api.n0
    String getEncryptedId();

    @Override // com.yandex.passport.api.n0
    String getEncryptedSecret();

    Bundle toBundle();
}

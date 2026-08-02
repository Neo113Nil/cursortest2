package xsna;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;

/* compiled from: MasterKeys.java */
/* loaded from: classes.dex */
public final class fk10 {

    @NonNull
    public static final KeyGenParameterSpec a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
}

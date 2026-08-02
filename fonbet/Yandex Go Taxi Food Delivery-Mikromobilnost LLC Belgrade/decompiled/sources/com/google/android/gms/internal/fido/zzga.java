package com.google.android.gms.internal.fido;

import defpackage.jva1;
import defpackage.ny61;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes11.dex */
final class zzga extends jva1 implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    public zzga() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA_256);
            this.zza = messageDigest;
            this.zzb = messageDigest.getDigestLength();
            this.zzd = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.zzc = z;
        } catch (NoSuchAlgorithmException e) {
            ny61.f(e);
            throw null;
        }
    }

    @Override // defpackage.jva1
    public final g g() {
        if (this.zzc) {
            try {
                return new g((MessageDigest) this.zza.clone(), this.zzb);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new g(MessageDigest.getInstance(this.zza.getAlgorithm()), this.zzb);
        } catch (NoSuchAlgorithmException e) {
            ny61.f(e);
            return null;
        }
    }

    public final String toString() {
        return this.zzd;
    }
}

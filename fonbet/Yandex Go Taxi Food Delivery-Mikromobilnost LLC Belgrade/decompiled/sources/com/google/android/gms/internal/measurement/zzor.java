package com.google.android.gms.internal.measurement;

import defpackage.v43;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;

/* loaded from: classes.dex */
final class zzor extends IllegalArgumentException {
    public zzor(int i, int i2) {
        super(v43.a(i2, i, BlobHeaderStructure.BLOB_VERSION, "Unpaired surrogate at index ", " of "));
    }
}

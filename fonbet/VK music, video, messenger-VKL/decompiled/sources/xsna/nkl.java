package xsna;

import android.util.Base64;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class nkl implements zhn0 {
    @Override // xsna.zhn0
    public final Object get() {
        byte[] bArr = new byte[12];
        okl.i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}

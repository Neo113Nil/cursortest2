package yads;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class zk0 implements pn0 {
    @Override // yads.pn0
    public final void a(ad0 ad0Var) {
    }

    @Override // yads.pn0
    public final int b() {
        return 1;
    }

    @Override // yads.pn0
    public final byte[] c() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // yads.pn0
    public final k20 d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // yads.pn0
    public final ln0 a(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // yads.pn0
    public final void b(byte[] bArr) {
    }

    @Override // yads.pn0
    public final void c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // yads.pn0
    public final on0 a() {
        throw new IllegalStateException();
    }

    @Override // yads.pn0
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // yads.pn0
    public final Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // yads.pn0
    public final boolean a(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // yads.pn0
    public final void a(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // yads.pn0
    public final void release() {
    }
}

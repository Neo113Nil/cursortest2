package xsna;

import java.util.Collections;
import java.util.Set;
import xsna.taz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xbz0 implements taz0 {
    @Override // xsna.taz0
    public final void a(String str, String str2, long j, long j2, e7z0 e7z0Var, boolean z) {
    }

    @Override // xsna.taz0
    public final void b(long j) {
    }

    @Override // xsna.taz0
    public final void a(long j) {
    }

    @Override // xsna.taz0
    public final Set b() {
        return Collections.EMPTY_SET;
    }

    @Override // xsna.taz0
    public final taz0.a a() {
        return new a();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements taz0.a {
        @Override // xsna.taz0.a
        public final bez0 a() {
            throw new Exception("Cannot read data from empty iterator");
        }

        @Override // xsna.taz0.a
        public final boolean moveToNext() {
            return false;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}

package xsna;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: AudioRecordViewState.kt */
/* loaded from: classes2.dex */
public abstract class qv4 {

    /* compiled from: AudioRecordViewState.kt */
    public static abstract class a extends qv4 {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public boolean a() {
            return this.a;
        }
    }

    /* compiled from: AudioRecordViewState.kt */
    public static final class b extends a {
        public final Uri c;
        public final byte[] d;
        public final long e;
        public final float f;
        public final boolean g;
        public final boolean h;

        public b(Uri uri, byte[] bArr, long j, float f, boolean z, boolean z2) {
            super(z2, false);
            this.c = uri;
            this.d = bArr;
            this.e = j;
            this.f = f;
            this.g = z;
            this.h = z2;
        }

        public static b b(b bVar, float f, boolean z, boolean z2, int i) {
            Uri uri = bVar.c;
            byte[] bArr = bVar.d;
            long j = bVar.e;
            if ((i & 8) != 0) {
                f = bVar.f;
            }
            float f2 = f;
            if ((i & 16) != 0) {
                z = bVar.g;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = bVar.h;
            }
            bVar.getClass();
            return new b(uri, bArr, j, f2, z3, z2);
        }

        @Override // xsna.qv4.a
        public final boolean a() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (epx.f(this.c, bVar.c) && Arrays.equals(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + qoy.b(io.reactivex.rxjava3.subjects.b.a(this.f, bh10.a((Arrays.hashCode(this.d) + (this.c.hashCode() * 31)) * 31, 31, this.e), 31), 31, this.g);
        }

        public final String toString() {
            return "Draft(source=" + this.c + ", durationSec=" + this.e + ", progress=" + this.f + ", isPlaying=" + this.g + ", inCancelArea=" + this.h + ", waveData=" + Arrays.toString(this.d) + ')';
        }
    }

    /* compiled from: AudioRecordViewState.kt */
    public static final class c extends qv4 {
        public static final c a = new c();

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: AudioRecordViewState.kt */
    public static final class d extends a {
        public final byte[] c;
        public final int d;
        public final long e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;

        public d() {
            this(0);
        }

        public static d b(d dVar, byte[] bArr, int i, long j, boolean z, boolean z2, int i2) {
            if ((i2 & 1) != 0) {
                bArr = dVar.c;
            }
            byte[] bArr2 = bArr;
            if ((i2 & 2) != 0) {
                i = dVar.d;
            }
            int i3 = i;
            long j2 = (i2 & 4) != 0 ? dVar.e : j;
            boolean z3 = (i2 & 8) != 0 ? dVar.f : z;
            boolean z4 = (i2 & 16) != 0 ? dVar.g : true;
            boolean z5 = (i2 & 32) != 0 ? dVar.h : true;
            boolean z6 = (i2 & 64) != 0 ? dVar.i : true;
            boolean z7 = (i2 & 128) != 0 ? dVar.j : z2;
            dVar.getClass();
            return new d(bArr2, i3, j2, z3, z4, z5, z6, z7);
        }

        @Override // xsna.qv4.a
        public final boolean a() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Arrays.equals(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.j == dVar.j && this.i == dVar.i) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + qoy.b(qoy.b(qoy.b(qoy.b(bh10.a(((Arrays.hashCode(this.c) * 31) + this.d) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.j);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Recording(isHandsFree="), this.g, ')');
        }

        public /* synthetic */ d(int i) {
            this(new byte[0], 0, 0L, false, false, false, false, false);
        }

        public d(byte[] bArr, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            super(z5, !z2);
            this.c = bArr;
            this.d = i;
            this.e = j;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = z4;
            this.j = z5;
        }
    }
}

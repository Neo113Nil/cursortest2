package xsna;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import androidx.work.NetworkType;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: Constraints.kt */
/* loaded from: classes.dex */
public final class p6j {
    public static final p6j j = new p6j();
    public final NetworkType a;
    public final b560 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set<a> i;

    /* compiled from: Constraints.kt */
    /* loaded from: classes12.dex */
    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(Uri uri, boolean z) {
            this.a = uri;
            this.b = z;
        }

        public final Uri a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }
    }

    public p6j() {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        EmptySet emptySet = EmptySet.b;
        this.b = new b560(null);
        this.a = networkType;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = emptySet;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    @SuppressLint({"NewApi"})
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p6j.class.equals(obj.getClass())) {
            return false;
        }
        p6j p6jVar = (p6j) obj;
        if (this.c == p6jVar.c && this.d == p6jVar.d && this.e == p6jVar.e && this.f == p6jVar.f && this.g == p6jVar.g && this.h == p6jVar.h && epx.f(a(), p6jVar.a()) && this.a == p6jVar.a) {
            return epx.f(this.i, p6jVar.i);
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int b = fw3.b((i + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.i);
        NetworkRequest a2 = a();
        return b + (a2 != null ? a2.hashCode() : 0);
    }

    @SuppressLint({"NewApi"})
    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public p6j(b560 b560Var, NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set<a> set) {
        this.b = b560Var;
        this.a = networkType;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    @SuppressLint({"NewApi"})
    public p6j(p6j p6jVar) {
        this.c = p6jVar.c;
        this.d = p6jVar.d;
        this.b = p6jVar.b;
        this.a = p6jVar.a;
        this.e = p6jVar.e;
        this.f = p6jVar.f;
        this.i = p6jVar.i;
        this.g = p6jVar.g;
        this.h = p6jVar.h;
    }
}

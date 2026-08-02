package xsna;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;

/* compiled from: VkStatEvent.kt */
/* loaded from: classes11.dex */
public final class lrk0 extends agr0 {
    public final SchemeStat$EventBenchmarkMain.b a;

    public lrk0(SchemeStat$EventBenchmarkMain.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.rrk0
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrk0) && this.a.equals(((lrk0) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatBenchmarkEvent(event=" + this.a + ", storeImmediately=false)";
    }
}

package xsna;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;

/* compiled from: CreationContextStat.kt */
/* loaded from: classes14.dex */
public final class kbk {
    public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ kbk(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, int i, boolean z) {
        this(creationEntryPoint, i, z, false);
    }

    public final boolean a() {
        return this.c;
    }

    public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbk)) {
            return false;
        }
        kbk kbkVar = (kbk) obj;
        return this.a == kbkVar.a && this.b == kbkVar.b && this.c == kbkVar.c && this.d == kbkVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContextStat(entryPoint=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", createdCameraBypass=");
        sb.append(this.c);
        sb.append(", doNotOpenClipsTabOnFinish=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public kbk(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, int i, boolean z, boolean z2) {
        this.a = creationEntryPoint;
        this.b = i;
        this.c = z;
        this.d = z2;
    }
}

package xsna;

import com.vk.clips.viewer.edit.presentation.model.OrdVS;
import java.util.List;

/* compiled from: ClipEditSdkViewState.kt */
/* loaded from: classes17.dex */
public final class euc implements lm50 {
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;
    public final d9k0 f;
    public final OrdVS g;
    public final duc h;
    public final ksc i;
    public final r8d j;

    public euc(String str, String str2, List list, boolean z, d9k0 d9k0Var, OrdVS ordVS, duc ducVar, ksc kscVar, r8d r8dVar) {
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = z;
        this.f = d9k0Var;
        this.g = ordVS;
        this.h = ducVar;
        this.i = kscVar;
        this.j = r8dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euc)) {
            return false;
        }
        euc eucVar = (euc) obj;
        return epx.f(this.b, eucVar.b) && epx.f(this.c, eucVar.c) && epx.f(this.d, eucVar.d) && this.e == eucVar.e && epx.f(this.f, eucVar.f) && epx.f(this.g, eucVar.g) && epx.f(this.h, eucVar.h) && epx.f(this.i, eucVar.i) && epx.f(this.j, eucVar.j);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        d9k0 d9k0Var = this.f;
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((b + (d9k0Var == null ? 0 : d9k0Var.hashCode())) * 31)) * 31)) * 31;
        ksc kscVar = this.i;
        int hashCode2 = (hashCode + (kscVar == null ? 0 : kscVar.hashCode())) * 31;
        r8d r8dVar = this.j;
        return hashCode2 + (r8dVar != null ? r8dVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipEditSdkViewState(coverUrl=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", hashtags=");
        mr.c(", isUploading=", sb, this.d);
        sb.append(this.e);
        sb.append(", snackbarViewState=");
        sb.append(this.f);
        sb.append(", ordVS=");
        sb.append(this.g);
        sb.append(", videoAttachState=");
        sb.append(this.h);
        sb.append(", coauthorsState=");
        sb.append(this.i);
        sb.append(", overlayDialogState=");
        sb.append(this.j);
        sb.append(')');
        return sb.toString();
    }
}

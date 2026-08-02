package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: ChatSettingsState.kt */
/* loaded from: classes2.dex */
public final class zyb {
    public final DialogExt a;
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ohm i;
    public final boolean j;
    public final Throwable k;

    public zyb(DialogExt dialogExt, Peer peer, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ohm ohmVar, boolean z7, Throwable th) {
        this.a = dialogExt;
        this.b = peer;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = ohmVar;
        this.j = z7;
        this.k = th;
    }

    public static zyb a(zyb zybVar, DialogExt dialogExt, boolean z, boolean z2, ohm ohmVar, boolean z3, Throwable th, int i) {
        if ((i & 1) != 0) {
            dialogExt = zybVar.a;
        }
        DialogExt dialogExt2 = dialogExt;
        Peer peer = zybVar.b;
        boolean z4 = zybVar.c;
        boolean z5 = (i & 8) != 0 ? zybVar.d : z;
        boolean z6 = (i & 16) != 0 ? zybVar.e : true;
        boolean z7 = (i & 32) != 0 ? zybVar.f : true;
        boolean z8 = (i & 64) != 0 ? zybVar.g : true;
        boolean z9 = (i & 128) != 0 ? zybVar.h : z2;
        ohm ohmVar2 = (i & 256) != 0 ? zybVar.i : ohmVar;
        boolean z10 = (i & 512) != 0 ? zybVar.j : z3;
        Throwable th2 = (i & 1024) != 0 ? zybVar.k : th;
        zybVar.getClass();
        return new zyb(dialogExt2, peer, z4, z5, z6, z7, z8, z9, ohmVar2, z10, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyb)) {
            return false;
        }
        zyb zybVar = (zyb) obj;
        return epx.f(this.a, zybVar.a) && epx.f(this.b, zybVar.b) && this.c == zybVar.c && this.d == zybVar.d && this.e == zybVar.e && this.f == zybVar.f && this.g == zybVar.g && this.h == zybVar.h && epx.f(this.i, zybVar.i) && this.j == zybVar.j && epx.f(this.k, zybVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + qoy.b(qr.a(this.i.b, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(bh10.a(this.a.hashCode() * 31, 31, this.b.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatSettingsState(dialogExt=");
        sb.append(this.a);
        sb.append(", currentMember=");
        sb.append(this.b);
        sb.append(", isVkMe=");
        sb.append(this.c);
        sb.append(", isInitLoad=");
        sb.append(this.d);
        sb.append(", isObserving=");
        sb.append(this.e);
        sb.append(", isInitSuccess=");
        sb.append(this.f);
        sb.append(", isInitError=");
        sb.append(this.g);
        sb.append(", isUpdateLoad=");
        sb.append(this.h);
        sb.append(", membersList=");
        sb.append(this.i);
        sb.append(", isFullMemberList=");
        sb.append(this.j);
        sb.append(", error=");
        return oq.c(sb, this.k, ')');
    }

    public /* synthetic */ zyb(DialogExt dialogExt, Peer peer, boolean z, int i) {
        this(dialogExt, peer, (i & 4) != 0 ? false : z, false, false, false, false, false, new ohm(), true, new Throwable());
    }
}

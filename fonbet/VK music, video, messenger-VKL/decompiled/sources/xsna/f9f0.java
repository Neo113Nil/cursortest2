package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import java.util.List;
import xsna.i9f0;
import xsna.t6v;

/* compiled from: RecentAndHintsDialogsGetCmd.kt */
/* loaded from: classes2.dex */
public final class f9f0 extends le6<a> {
    public final int b;
    public final Source c;
    public final boolean d = true;
    public final String e = "l4o0";

    /* compiled from: RecentAndHintsDialogsGetCmd.kt */
    public static final class a {
        public final List<Dialog> a;
        public final ProfilesInfo b;

        public a(List<Dialog> list, ProfilesInfo profilesInfo) {
            this.a = list;
            this.b = profilesInfo;
        }
    }

    public f9f0(int i, Source source) {
        this.b = i;
        this.c = source;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        boolean z = this.d;
        String str = this.e;
        int i = this.b;
        i9f0.a aVar = (i9f0.a) w2wVar.L0(this, new i9f0(i, this.c, z, str));
        ArrayList arrayList = aVar.a;
        ProfilesInfo profilesInfo = aVar.b;
        int size = arrayList.size();
        int i2 = this.b;
        if (size == i2) {
            return new a(arrayList, profilesInfo);
        }
        t6v.a aVar2 = (t6v.a) w2wVar.L0(this, new t6v(i2, this.c, w2wVar.getConfig().n, this.d, this.e));
        ArrayList arrayList2 = new ArrayList(aVar2.a);
        g5g.D(arrayList2, true, new g9f0(1, arrayList, List.class, "contains", "contains(Ljava/lang/Object;)Z", 0));
        List H0 = j5g.H0(j5g.u0(arrayList2, arrayList), i);
        profilesInfo.Hb(aVar2.b);
        return new a(H0, profilesInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9f0)) {
            return false;
        }
        f9f0 f9f0Var = (f9f0) obj;
        return this.b == f9f0Var.b && this.c == f9f0Var.c && this.d == f9f0Var.d && epx.f(this.e, f9f0Var.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentAndHintsDialogsGetCmd(limit=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return tq.f(sb, this.e, ')');
    }
}

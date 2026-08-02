package xsna;

import com.vk.im.engine.models.LongPollType;
import java.util.ArrayList;

/* compiled from: DialogsFoldersReorderCmd.kt */
/* loaded from: classes18.dex */
public final class mqm extends xl6<s3q0> {
    public final ArrayList b;

    public mqm(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-folder-common";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        w2wVar.c1(true, LongPollType.MESSAGES);
        ArrayList arrayList = this.b;
        bz2.c(new mg20(arrayList), null);
        w2wVar.I0().b().c().q(arrayList);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqm) && epx.f(this.b, ((mqm) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("DialogsFoldersReorderCmd(order="), this.b);
    }
}

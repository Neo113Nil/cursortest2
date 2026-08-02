package xsna;

import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.d5h;
import xsna.h7u0;
import xsna.z4h;

/* compiled from: CommunityInternalMenuItem.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class f5h extends FunctionReferenceImpl implements gzs<s3q0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final s3q0 invoke() {
        d5h.c cVar = (d5h.c) this.receiver;
        int i = d5h.c.t;
        or1 or1Var = new or1(cVar.itemView.getContext());
        or1Var.b(new rc4(cVar, 4), cVar.itemView.getContext().getString(R.string.open));
        or1Var.b(new sc4(cVar, 4), cVar.itemView.getContext().getString(R.string.copy));
        or1Var.b(new o4(cVar, 6), cVar.itemView.getContext().getString(R.string.share));
        h7u0.a c = or1Var.c();
        String str = ((z4h.a) cVar.m).d;
        if (str == null) {
            str = "";
        }
        c.h0(str);
        c.m();
        return s3q0.a;
    }
}

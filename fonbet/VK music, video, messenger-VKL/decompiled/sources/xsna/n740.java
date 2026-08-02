package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.multiplecoownership.model.MultipleCoownershipType;
import kotlin.NoWhenBranchMatchedException;
import xsna.k740;
import xsna.q740;
import xsna.v740;

/* compiled from: MultipleCoownershipFeature.kt */
/* loaded from: classes3.dex */
public final class n740 extends wk50<z740, w740, k740, q740> {
    public final f4z f;

    /* compiled from: MultipleCoownershipFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MultipleCoownershipType.values().length];
            try {
                iArr[MultipleCoownershipType.Approve.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultipleCoownershipType.Reject.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n740(k740.b bVar, r740 r740Var) {
        super(bVar, r740Var);
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(w740 w740Var, k740 k740Var) {
        w740 w740Var2 = w740Var;
        k740 k740Var2 = k740Var;
        UserId userId = w740Var2.d;
        if (k740Var2 instanceof k740.b) {
            T(new q740.a());
            return;
        }
        if (k740Var2 instanceof k740.c) {
            T(new q740.b(((k740.c) k740Var2).b));
            return;
        }
        if (!k740Var2.equals(k740.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = a.$EnumSwitchMapping$0[w740Var2.c.ordinal()];
        if (i == 1) {
            U(new v740.a.C3873a(userId));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            U(new v740.a.b(userId));
        }
    }

    public final void U(v740 v740Var) {
        this.f.b(v740Var);
    }
}

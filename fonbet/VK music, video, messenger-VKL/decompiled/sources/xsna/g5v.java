package xsna;

import com.vk.dto.messages.MsgIdType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import xsna.f5v;

/* compiled from: HighlightMessageMediator.kt */
/* loaded from: classes2.dex */
public final class g5v implements f5v {
    public final LinkedHashSet a = new LinkedHashSet();
    public Pair<Integer, ? extends MsgIdType> b;

    /* compiled from: HighlightMessageMediator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgIdType.values().length];
            try {
                iArr[MsgIdType.CNV_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgIdType.LOCAL_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.f5v
    public final void a(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar) {
        this.a.remove(aVar);
    }

    @Override // xsna.f5v
    public final void b(f5v.a aVar) {
        this.a.add(aVar);
    }

    @Override // xsna.f5v
    public final boolean c(Integer num, Integer num2) {
        Pair<Integer, ? extends MsgIdType> pair = this.b;
        if (pair == null) {
            return false;
        }
        if (num == null && num2 == null) {
            return false;
        }
        if (pair.j() == MsgIdType.CNV_ID) {
            int intValue = pair.i().intValue();
            if (num != null && intValue == num.intValue()) {
                return true;
            }
        }
        if (pair.j() == MsgIdType.LOCAL_ID) {
            int intValue2 = pair.i().intValue();
            if (num2 != null && intValue2 == num2.intValue()) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        bpn0 bpn0Var = i0q0.a;
        Pair<Integer, ? extends MsgIdType> pair = this.b;
        if (pair == null) {
            return;
        }
        g(pair, false);
        this.b = null;
    }

    public final void e(MsgIdType msgIdType, int i) {
        bpn0 bpn0Var = i0q0.a;
        Pair<Integer, ? extends MsgIdType> pair = new Pair<>(Integer.valueOf(i), msgIdType);
        this.b = pair;
        g(pair, true);
    }

    public final void f() {
        this.a.clear();
    }

    public final void g(Pair<Integer, ? extends MsgIdType> pair, boolean z) {
        int i = a.$EnumSwitchMapping$0[pair.j().ordinal()];
        LinkedHashSet linkedHashSet = this.a;
        if (i == 1) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((f5v.a) it.next()).T3(pair.i().intValue(), z);
            }
        } else {
            if (i != 2) {
                throw new UnsupportedOperationException("Unknown type " + pair.j());
            }
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                ((f5v.a) it2.next()).J1(pair.i().intValue(), z);
            }
        }
    }
}

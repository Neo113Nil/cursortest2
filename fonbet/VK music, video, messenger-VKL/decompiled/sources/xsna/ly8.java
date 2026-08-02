package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import xsna.pda;

/* compiled from: CachedScrollPositionDelegate.kt */
/* loaded from: classes16.dex */
public final class ly8 implements oda<UIBlockList> {
    public final pda a;

    public ly8(pda pdaVar, mcv mcvVar) {
        this.a = pdaVar;
    }

    @Override // xsna.oda
    public final void a(UIBlock uIBlock, btf0 btf0Var) {
        this.a.c((UIBlockList) uIBlock, btf0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // xsna.oda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final btf0 b(UIBlockList uIBlockList) {
        btf0 btf0Var;
        xtw xtwVar;
        int i;
        pda pdaVar = this.a;
        pda.a b = pdaVar.b(uIBlockList);
        btf0 btf0Var2 = btf0.c;
        if (b != null) {
            UIBlock uIBlock = b.a;
            if (uIBlock != uIBlockList) {
                if ((uIBlock instanceof UIBlockList) && uIBlockList.Bb(uIBlock)) {
                    ArrayList<UIBlock> arrayList = ((UIBlockList) uIBlock).y;
                    ArrayList<UIBlock> arrayList2 = uIBlockList.y;
                    if (arrayList2.size() >= arrayList.size()) {
                        Iterable W0 = j5g.W0(arrayList);
                        if (!(W0 instanceof Collection) || !((Collection) W0).isEmpty()) {
                            Iterator it = W0.iterator();
                            do {
                                ztw ztwVar = (ztw) it;
                                if (ztwVar.b.hasNext()) {
                                    xtwVar = (xtw) ztwVar.next();
                                    i = xtwVar.a;
                                }
                            } while (arrayList2.get(i).Bb((UIBlock) xtwVar.b));
                        }
                    }
                }
            }
            btf0Var = b.b;
            if (b != null) {
                if (epx.f(btf0Var, btf0Var2)) {
                    pdaVar.a(uIBlockList);
                    return btf0Var;
                }
                if (uIBlockList != b.a || !epx.f(b.b, btf0Var)) {
                    pdaVar.c(uIBlockList, btf0Var);
                    return btf0Var;
                }
            }
            return btf0Var;
        }
        btf0Var = btf0Var2;
        if (b != null) {
        }
        return btf0Var;
    }
}

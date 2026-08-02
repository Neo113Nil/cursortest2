package xsna;

import com.vk.superapp.multiaccount.impl.ui.relateduser.RelatedUserStackView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.o340;

/* compiled from: MultiAccountSwitcherAdapter.kt */
/* loaded from: classes6.dex */
public final class p340 implements o340.b {
    public final /* synthetic */ o340 a;

    public p340(o340 o340Var) {
        this.a = o340Var;
    }

    @Override // xsna.o340.b
    public final void a() {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.a.f.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            RelatedUserStackView relatedUserStackView = (RelatedUserStackView) ((WeakReference) it.next()).get();
            if (relatedUserStackView != null) {
                arrayList.add(relatedUserStackView);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            RelatedUserStackView relatedUserStackView2 = (RelatedUserStackView) it2.next();
            if (relatedUserStackView2.h.size() > 1) {
                zmp0.a(relatedUserStackView2, relatedUserStackView2.l);
                relatedUserStackView2.d.setVisibility(8);
                awt0.v(relatedUserStackView2.g, true);
            }
        }
    }
}

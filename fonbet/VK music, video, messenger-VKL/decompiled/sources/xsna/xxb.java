package xsna;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.im.design.view.component.ChatProfileTabsContainerLayoutV2;
import com.vk.im.ui.components.chat_profile.tabs.ChatProfileTabsContainerLayout;
import com.vkontakte.android.R;
import xsna.nwb;

/* compiled from: ChatProfileTabsItemDelegate.kt */
/* loaded from: classes2.dex */
public final class xxb extends p1u0<nwb.l> {
    public final kkm a;

    /* compiled from: ChatProfileTabsItemDelegate.kt */
    public static final class a extends vfz<nwb.l> {
        public final ConstraintLayout l;
        public final kkm m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(eyn0 eyn0Var, kkm kkmVar) {
            super(eyn0Var.getView());
            this.l = (ConstraintLayout) eyn0Var;
            this.m = kkmVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, xsna.eyn0] */
        @Override // xsna.vfz
        public final void V5() {
            this.l.n(this.m);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.constraintlayout.widget.ConstraintLayout, xsna.eyn0] */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(nwb.l lVar) {
            kkm kkmVar = this.m;
            ?? r1 = this.l;
            r1.n(kkmVar);
            r1.f3(lVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, xsna.eyn0] */
        @Override // xsna.vfz
        public final void a6() {
            this.l.o(this.m);
        }
    }

    public xxb(kkm kkmVar) {
        this.a = kkmVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends nwb.l> b(ViewGroup viewGroup) {
        boolean t = BuildInfo.t();
        kkm kkmVar = this.a;
        return !t ? new a((ChatProfileTabsContainerLayoutV2) bwt0.I(R.layout.vkim_chat_profile_adapter_tabs_item_v2, viewGroup, false), kkmVar) : new a((ChatProfileTabsContainerLayout) bwt0.I(R.layout.vkim_chat_profile_adapter_tabs_item, viewGroup, false), kkmVar);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof nwb.l;
    }
}

package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vkontakte.android.R;

/* compiled from: LoadingAttachViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class tsz extends p1u0<etz> {
    public final kkm a;

    /* compiled from: LoadingAttachViewTypeDelegate.kt */
    public final class a extends vfz<etz> {
        public final VkSpinner l;
        public final bpn0 m;

        public a(View view) {
            super(view);
            this.l = (VkSpinner) view.findViewById(R.id.vkim_progress);
            this.m = new bpn0(new xbh(view, 1));
        }

        @Override // xsna.vfz
        public final void V5() {
            kkm kkmVar;
            if (!BuildInfo.t() || ((Boolean) this.m.getValue()).booleanValue() || (kkmVar = tsz.this.a) == null) {
                return;
            }
            kkmVar.a(this.l, "progressTint", new zl9(kkmVar, R.attr.vk_ui_icon_accent));
        }

        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(etz etzVar) {
        }

        @Override // xsna.vfz
        public final void a6() {
            kkm kkmVar;
            if (!BuildInfo.t() || ((Boolean) this.m.getValue()).booleanValue() || (kkmVar = tsz.this.a) == null) {
                return;
            }
            kkmVar.h(this.l);
        }
    }

    public tsz(kkm kkmVar) {
        this.a = kkmVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends etz> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.vkim_history_attach_loading, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof etz;
    }
}

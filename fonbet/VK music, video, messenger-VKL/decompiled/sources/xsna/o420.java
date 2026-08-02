package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.view.disableable.DisableableRelativeLayout;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.RichEditText;
import com.vkontakte.android.R;

/* compiled from: MentionsController.kt */
/* loaded from: classes2.dex */
public final class o420 {
    public final b25 a;
    public final View b;
    public final ChatFragment.i c;
    public boolean d;
    public CoordinatorLayout e;
    public VkBottomSheetBehavior<RecyclerView> f;
    public boolean g;
    public final shm h;
    public final v420 i;

    /* compiled from: MentionsController.kt */
    public final class a {
        public a() {
        }

        public final void a() {
            o420 o420Var = o420.this;
            o420Var.h.X0();
            o420Var.g = false;
            o420Var.e();
        }
    }

    public o420(a1w a1wVar, b25 b25Var, long j, DisableableRelativeLayout disableableRelativeLayout, ChatFragment.i iVar) {
        this.a = b25Var;
        this.b = disableableRelativeLayout;
        this.c = iVar;
        this.i = new v420((RichEditText) disableableRelativeLayout.findViewById(R.id.writebar_edit), new a());
        shm shmVar = new shm(a1wVar, b25Var, j);
        this.h = shmVar;
        shmVar.r = new g2z(this);
    }

    public final void a() {
        this.h.G0();
    }

    public final void b() {
        this.h.H0();
    }

    public final void c() {
        this.h.V0();
    }

    public final void d() {
        this.h.W0();
    }

    public final void e() {
        if (ChatFragment.this.isAdded()) {
            View view = this.b;
            Context context = view.getContext();
            bpn0 bpn0Var = enj.a;
            Activity h = e3m.h(context);
            boolean z = this.g && (iah0.s(h) || fnj.d(h));
            if (z || this.d) {
                boolean z2 = this.d;
                if (!z2 && !z2) {
                    View inflate = ((ViewStub) view.findViewById(R.id.mentions_container_stub)).inflate();
                    ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.mentions_container);
                    viewGroup.addView(this.h.F0(viewGroup, null));
                    this.e = (CoordinatorLayout) inflate.findViewById(R.id.mentions_cl);
                    VkBottomSheetBehavior<RecyclerView> vkBottomSheetBehavior = (VkBottomSheetBehavior) ((CoordinatorLayout.f) viewGroup.getLayoutParams()).a;
                    this.f = vkBottomSheetBehavior;
                    if (vkBottomSheetBehavior == null) {
                        vkBottomSheetBehavior = null;
                    }
                    vkBottomSheetBehavior.q = new p420(this);
                    VkBottomSheetBehavior<RecyclerView> vkBottomSheetBehavior2 = this.f;
                    (vkBottomSheetBehavior2 == null ? null : vkBottomSheetBehavior2).h = true;
                    if (vkBottomSheetBehavior2 == null) {
                        vkBottomSheetBehavior2 = null;
                    }
                    vkBottomSheetBehavior2.J(4);
                    VkBottomSheetBehavior<RecyclerView> vkBottomSheetBehavior3 = this.f;
                    if (vkBottomSheetBehavior3 == null) {
                        vkBottomSheetBehavior3 = null;
                    }
                    vkBottomSheetBehavior3.I(iah0.a(160));
                    this.d = true;
                }
                CoordinatorLayout coordinatorLayout = this.e;
                if (coordinatorLayout == null) {
                    coordinatorLayout = null;
                }
                coordinatorLayout.setVisibility(z ? 0 : 8);
                if (z) {
                    return;
                }
                CoordinatorLayout coordinatorLayout2 = this.e;
                (coordinatorLayout2 != null ? coordinatorLayout2 : null).postDelayed(new nx3(this, 9), 300L);
            }
        }
    }
}

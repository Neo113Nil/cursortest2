package xsna;

import com.vk.lists.AbstractPaginatedView;
import com.vkontakte.android.R;

/* compiled from: PollEditorScreen.kt */
/* loaded from: classes17.dex */
public final class jpb0 extends AbstractPaginatedView.i {
    public final /* synthetic */ hpb0 a;

    public jpb0(hpb0 hpb0Var) {
        this.a = hpb0Var;
    }

    @Override // com.vk.lists.AbstractPaginatedView.i
    public final void b() {
        hpb0 hpb0Var = this.a;
        f4m.s(0, hpb0Var.i());
        f4m.r(0, hpb0Var.i());
        hpb0Var.i().setBackgroundResource(0);
    }

    @Override // com.vk.lists.AbstractPaginatedView.i
    public final void c() {
        e();
    }

    @Override // com.vk.lists.AbstractPaginatedView.i
    public final void d(Throwable th) {
        e();
    }

    public final void e() {
        hpb0 hpb0Var = this.a;
        float f = 16;
        f4m.s(iah0.a(f), hpb0Var.i());
        f4m.r(iah0.a(f), hpb0Var.i());
        hpb0Var.i().setBackgroundResource(R.drawable.gray_border_bg_radius_4);
    }
}

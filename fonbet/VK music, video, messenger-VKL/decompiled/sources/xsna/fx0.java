package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.clips.design.view.component.user.ClipUserView;
import com.vk.core.ui.image.VKImageController;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdsItemMainOverlayContainer.kt */
/* loaded from: classes17.dex */
public final class fx0 implements vut0 {
    public final Object b;
    public final /* synthetic */ VKImageController<ImageView> c;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ VKImageController c;
        public final /* synthetic */ rzt0 d;

        public a(View view, VKImageController vKImageController, rzt0 rzt0Var) {
            this.b = view;
            this.c = vKImageController;
            this.d = rzt0Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            ClipUserView.a.C0573a c0573a = (ClipUserView.a.C0573a) this.d;
            ClipUserView.b bVar = c0573a.a;
            View view2 = this.b;
            String e = bVar != null ? bVar.e(view2.getHeight()) : null;
            VKImageController.b bVar2 = VKImageController.b.q;
            gko gkoVar = c0573a.b;
            this.c.f(e, VKImageController.b.a(bVar2, gkoVar != null ? gko.b(gkoVar.a, view2.getContext()) : null, null, null, 65499));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fx0(VKImageController<? extends ImageView> vKImageController) {
        this.c = vKImageController;
        this.b = msy.a(LazyThreadSafetyMode.NONE, new s1(vKImageController, 2));
    }

    @Override // xsna.vut0
    public final void c(rzt0 rzt0Var) {
        if (!(rzt0Var instanceof ClipUserView.a.C0573a)) {
            f4m.j(getView());
            return;
        }
        getView().setVisibility(0);
        View view = getView();
        int height = view.getHeight();
        VKImageController<ImageView> vKImageController = this.c;
        if (height != 0) {
            ClipUserView.a.C0573a c0573a = (ClipUserView.a.C0573a) rzt0Var;
            ClipUserView.b bVar = c0573a.a;
            String e = bVar != null ? bVar.e(view.getHeight()) : null;
            VKImageController.b bVar2 = VKImageController.b.q;
            gko gkoVar = c0573a.b;
            vKImageController.f(e, VKImageController.b.a(bVar2, gkoVar != null ? gko.b(gkoVar.a, view.getContext()) : null, null, null, 65499));
            return;
        }
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a(view, vKImageController, rzt0Var));
            return;
        }
        ClipUserView.a.C0573a c0573a2 = (ClipUserView.a.C0573a) rzt0Var;
        ClipUserView.b bVar3 = c0573a2.a;
        String e2 = bVar3 != null ? bVar3.e(view.getHeight()) : null;
        VKImageController.b bVar4 = VKImageController.b.q;
        gko gkoVar2 = c0573a2.b;
        vKImageController.f(e2, VKImageController.b.a(bVar4, gkoVar2 != null ? gko.b(gkoVar2.a, view.getContext()) : null, null, null, 65499));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vut0
    public final View getView() {
        return (View) this.b.getValue();
    }
}

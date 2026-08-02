package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import com.vk.masks.MasksController;
import com.vk.masks.MasksView;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import xsna.i3x0;

/* compiled from: VoipEffectController.kt */
/* loaded from: classes7.dex */
public abstract class rnw0 implements qnw0, tmg0 {
    public final Context b;
    public final xgw0 c;
    public final tnw0 d;
    public final a000 e;
    public final MasksController.MasksCatalogType f;
    public final MasksWrap g;
    public final bzb0 h;
    public final View i;
    public final View j;
    public final VoipActionMultiLineView k;
    public final View l;
    public final fot m;
    public TextureView n;
    public Mask o;
    public Mask p;
    public io.reactivex.rxjava3.disposables.c q;
    public final EmptyList r;
    public final List<View> s;

    public rnw0(Context context, xgw0 xgw0Var, tnw0 tnw0Var, a000 a000Var, int i, MasksController.MasksCatalogType masksCatalogType) {
        this.b = context;
        this.c = xgw0Var;
        this.d = tnw0Var;
        this.e = a000Var;
        this.f = masksCatalogType;
        MasksWrap masksWrap = new MasksWrap(context, null, 6);
        masksWrap.setOrientationDelegate(a000Var);
        masksWrap.setUsersBridge(xwk.e());
        masksWrap.setLinksBridge(xwk.d());
        this.g = masksWrap;
        dhr0.a.getClass();
        this.h = new bzb0(new l7s(context, dhr0.u().c));
        View findViewById = xgw0Var.findViewById(R.id.virtual_background_cancel);
        this.i = findViewById;
        View findViewById2 = xgw0Var.findViewById(R.id.virtual_background_save);
        this.j = findViewById2;
        VoipActionMultiLineView voipActionMultiLineView = (VoipActionMultiLineView) xgw0Var.findViewById(R.id.mirroring);
        this.k = voipActionMultiLineView;
        View findViewById3 = xgw0Var.findViewById(R.id.mirroring_divider);
        this.l = findViewById3;
        this.m = new fot(context, new onw0(this), null);
        this.r = EmptyList.b;
        this.s = e43.l(findViewById2, findViewById);
        masksWrap.setMasksView((MasksView) xgw0Var.findViewById(i));
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.i = 0;
        bVar.t = 0;
        bVar.v = 0;
        bVar.l = 0;
        masksWrap.setLayoutParams(bVar);
        xgw0Var.addView(masksWrap);
        masksWrap.getMasksView().setTranslationY(iah0.a(158));
        MasksView masksView = masksWrap.getMasksView();
        bwt0.p0(masksView.e, false);
        MasksView.c cVar = masksView.d;
        ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = e3m.a(R.dimen.camera_masks_section_view_height, masksView.getContext());
        cVar.setLayoutParams(layoutParams2);
        masksWrap.setCamera1View(new pnw0(this));
        jjc.g(findViewById, new vhs0(this, 13));
        jjc.g(findViewById2, new mmm0(this, 24));
        if (this instanceof qrw0) {
            return;
        }
        voipActionMultiLineView.setVisibility(0);
        findViewById3.setVisibility(0);
        voipActionMultiLineView.setSwitchListener(new dx00(this, 1));
        tnw0Var.e().e().d().a0(asu0.a.d()).subscribe(new vyv0(new pst0(this, 5), 3));
    }

    @Override // xsna.qnw0
    public final void b() {
        c();
    }

    public final void c() {
        Mask mask = this.o;
        tnw0 tnw0Var = this.d;
        if (mask == null) {
            int i = MasksWrap.e0;
            this.g.I(true);
        } else {
            tnw0Var.a(mask);
        }
        tnw0Var.b.invoke().tn();
    }

    @Override // xsna.qnw0
    public final void clear() {
        this.g.n();
        TextureView textureView = this.n;
        if (textureView != null) {
            this.d.e().d(textureView);
            this.c.removeView(textureView);
        }
        this.n = null;
        io.reactivex.rxjava3.disposables.c cVar = this.q;
        if (cVar != null) {
            cVar.dispose();
        }
        this.q = null;
        this.h.a();
        e();
        this.e.b(this);
    }

    public boolean d() {
        return true;
    }

    public final void g() {
        if (d()) {
            this.g.s(this.f);
        }
        tnw0 tnw0Var = this.d;
        i3x0.b e = tnw0Var.e();
        a000 a000Var = this.e;
        TextureViewRenderer f = e.f(this.b, new ehl(a000Var, zzz.class, "currentAngle", "getCurrentAngle()F", 0));
        f.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.nnw0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return rnw0.this.m.a.onTouchEvent(motionEvent);
            }
        });
        this.c.addView(f, 0);
        this.n = f;
        this.q = io.reactivex.rxjava3.kotlin.c.f(2, tnw0Var.e().b(), null, new zzs0(5), new cus0(this, 11));
        a000Var.d(this);
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.s;
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return this.r;
    }

    public void e() {
    }

    public void f(String str) {
    }
}

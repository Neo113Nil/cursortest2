package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vkontakte.android.R;
import xsna.ghw0;
import xsna.t70;
import xsna.wu;

/* compiled from: ToggleMenuAction.kt */
/* loaded from: classes7.dex */
public final class s0p0 extends vu<t70.b> {
    public final ihw0 e;
    public io.reactivex.rxjava3.disposables.c f;

    /* compiled from: ToggleMenuAction.kt */
    public static final class a implements wu.a {
        public final Integer a;
        public final Integer b;
        public final int c;

        public a(Integer num, Integer num2, Integer num3) {
            this.a = num2;
            this.b = num3;
            this.c = num != null ? num.intValue() : R.drawable.vk_icon_menu_outline_28;
        }

        @Override // xsna.wu.a
        public final Integer a() {
            return this.a;
        }

        @Override // xsna.wu.a
        public final Integer b() {
            return Integer.valueOf(this.c);
        }

        @Override // xsna.wu.a
        public final Integer c() {
            return this.b;
        }
    }

    public s0p0(wu.a aVar, ihw0 ihw0Var) {
        super(aVar == null ? new a(null, null, null) : aVar, null);
        this.e = ihw0Var;
    }

    @Override // xsna.ku
    public final void d(View view) {
        this.e.a(ghw0.s.a);
    }

    @Override // xsna.ku
    public final void f() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.ku
    public final void g(View view, Object obj) {
        bwt0.p0((ImageView) view, ((t70.b) obj).a);
    }

    @Override // xsna.wu, xsna.ku
    /* renamed from: p */
    public final void h(ImageView imageView) {
        super.h(imageView);
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = new io.reactivex.rxjava3.internal.operators.observable.y(this.e.b.U(new wii0(new kpr(28), 8)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new qw40(new kvm0(this, 4), 23));
    }
}

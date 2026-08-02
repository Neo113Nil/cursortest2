package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.h1x0;
import xsna.jtw0;

/* compiled from: VoipShareQRCodeModalDialog.kt */
/* loaded from: classes7.dex */
public final class c2x0 extends dw20 {
    public static final int o1 = iah0.a(200);
    public View f1;
    public View g1;
    public View h1;
    public View i1;
    public View j1;
    public final io.reactivex.rxjava3.disposables.b k1 = new io.reactivex.rxjava3.disposables.b();
    public final jtw0 l1 = new jtw0(new bpn0(new w0o0(14)));
    public final h1x0 m1 = new h1x0(new bpn0(new x1c0(18)));
    public final io.reactivex.rxjava3.subjects.f<ndw0> n1 = new io.reactivex.rxjava3.subjects.f<>();

    /* compiled from: VoipShareQRCodeModalDialog.kt */
    public static final class a extends dw20.b {
        public final String e;

        public a(String str, Context context) {
            super(context, tzp0.a(null, 3));
            this.e = str;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c2x0 c2x0Var = new c2x0();
            c2x0Var.setArguments(yfb.b(new Pair("key_join_link", this.e)));
            return c2x0Var;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jtw0 jtw0Var = this.l1;
        jtw0Var.c();
        h1x0 h1x0Var = this.m1;
        h1x0Var.c();
        io.reactivex.rxjava3.subjects.f<ndw0> fVar = this.n1;
        jtw0Var.a(fVar.b0(jtw0.a.class));
        h1x0Var.a(fVar.b0(h1x0.a.class));
        fVar.onNext(jtw0.a.C3146a.a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.l1.e();
        this.m1.e();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.k1.dispose();
        super.onDestroyView();
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_share_qr_code_view, (ViewGroup) null, false);
        bwt0.i0(inflate.findViewById(R.id.close_btn), new f6m0(this, 22));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.qr_code);
        this.f1 = inflate.findViewById(R.id.qr_code_progress_bar);
        View findViewById = inflate.findViewById(R.id.share_QR_btn);
        findViewById.setEnabled(false);
        bwt0.i0(findViewById, new qum0(8, this, imageView));
        this.g1 = findViewById;
        this.h1 = inflate.findViewById(R.id.share_QR_icon);
        this.i1 = inflate.findViewById(R.id.share_QR_text);
        this.j1 = inflate.findViewById(R.id.share_QR_progress_bar);
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new bt90(this, 1));
        asu0 asu0Var = asu0.a;
        this.k1.b(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(vVar.q(asu0Var.c()).m(asu0Var.d()), new jsb0(new cbt0(this, 15), 19)), new lg4(this, 8)), new w9l0(18), new hto0(10, imageView, this)));
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}

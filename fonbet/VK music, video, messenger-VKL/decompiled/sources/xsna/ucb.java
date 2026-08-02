package xsna;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: ChannelSnackbarViewer.kt */
/* loaded from: classes16.dex */
public final class ucb implements h9k0 {
    public final gzs<Context> a;
    public ikv0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public ucb(gzs<? extends Context> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.h9k0
    public final void a(int i, d7k0 d7k0Var) {
        c(this.a.invoke().getString(i), d7k0Var);
    }

    @Override // xsna.h9k0
    public final void b(int i, int i2) {
        gzs<Context> gzsVar = this.a;
        ikv0.a aVar = new ikv0.a(gzsVar.invoke());
        aVar.u = new ikv0.d(gzsVar.invoke().getString(i2), (String) null, (ikv0.d.a) null, 6);
        aVar.t = new ikv0.c.C3058c(i, Integer.valueOf(R.attr.vk_ui_icon_secondary), (Size) null, 12);
        this.b = aVar.n();
    }

    @Override // xsna.h9k0
    public final void c(String str, d7k0 d7k0Var) {
        gzs<Context> gzsVar = this.a;
        ikv0.a aVar = new ikv0.a(gzsVar.invoke());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        if (d7k0Var != null) {
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, gzsVar.invoke().getString(d7k0Var.a), d7k0Var.b);
        }
        this.b = aVar.n();
    }

    @Override // xsna.h9k0
    public final void d(int i) {
        f(this.a.invoke().getString(i));
    }

    @Override // xsna.h9k0
    public final void e(String str, d7k0 d7k0Var) {
        gzs<Context> gzsVar = this.a;
        ikv0.a aVar = new ikv0.a(gzsVar.invoke());
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        if (d7k0Var != null) {
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, gzsVar.invoke().getString(d7k0Var.a), d7k0Var.b);
        }
        aVar.n();
    }

    @Override // xsna.h9k0
    public final void f(String str) {
        ikv0.a aVar = new ikv0.a(this.a.invoke());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        this.b = aVar.n();
    }

    @Override // xsna.h9k0
    public final void g(String str) {
        ikv0.a aVar = new ikv0.a(this.a.invoke());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_secondary), (Size) null, 12);
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        this.b = aVar.n();
    }
}

package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.util.Size;
import android.view.View;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.dynamic_loader.b;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.e3m;
import xsna.hqo;
import xsna.ikv0;

/* compiled from: DefaultDynamicLibViewDelegate.kt */
/* loaded from: classes18.dex */
public abstract class vdl<UseCase extends hqo> implements jqo<UseCase> {
    public final Context a;
    public final View b;
    public final ProgressBar c;
    public final View d;
    public final boolean e;
    public final iqo<UseCase> f;
    public ikv0 g;
    public VkContextMenu h;
    public androidx.appcompat.app.d i;
    public androidx.appcompat.app.d j;

    /* JADX WARN: Multi-variable type inference failed */
    public vdl(Context context, View view, ProgressBar progressBar, View view2, boolean z, iqo<? super UseCase> iqoVar) {
        this.a = context;
        this.b = view;
        this.c = progressBar;
        this.d = view2;
        this.e = z;
        this.f = iqoVar;
    }

    @Override // xsna.jqo
    public final void a(DynamicException.GooglePlay googlePlay) {
        cvk.w(j(googlePlay), false);
    }

    @Override // xsna.jqo
    public void b(boolean z) {
        View view = this.b;
        if (view != null) {
            view.setAlpha(0.5f);
        }
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            bwt0.p0(progressBar, z);
        }
        View view2 = this.d;
        if (view2 != null) {
            bwt0.p0(view2, !z);
        }
    }

    @Override // xsna.jqo
    public final void c(int i) {
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }

    @Override // xsna.jqo
    public final void d(b.AbstractC0762b abstractC0762b, z90 z90Var) {
        View view;
        CharSequence k = k(abstractC0762b);
        if (k == null || (view = this.b) == null) {
            return;
        }
        androidx.appcompat.app.d dVar = this.i;
        if (dVar != null) {
            dVar.hide();
        }
        this.i = n(view, k.toString(), null, new z8f(this, z90Var));
    }

    @Override // xsna.jqo
    public void e() {
        View view = this.b;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            bwt0.p0(progressBar, false);
        }
        View view2 = this.d;
        if (view2 != null) {
            bwt0.p0(view2, false);
        }
    }

    @Override // xsna.jqo
    public void f(hqo hqoVar, com.vk.movika.sdk.base.ui.r rVar) {
        VkContextMenu vkContextMenu = this.h;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.h = null;
        View view = this.b;
        if (view != null) {
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            VkContextMenu.c.d(bVar, this.a.getString(R.string.dynamic_lib_action_cancel).toString(), null, false, new vq6(8, this, rVar), 30);
            this.h = bVar.l(false);
        }
    }

    @Override // xsna.jqo
    public final void g() {
        ikv0 ikv0Var = this.g;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.g = null;
        VkContextMenu vkContextMenu = this.h;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.h = null;
        androidx.appcompat.app.d dVar = this.i;
        if (dVar != null) {
            dVar.hide();
        }
        this.i = null;
        androidx.appcompat.app.d dVar2 = this.j;
        if (dVar2 != null) {
            dVar2.hide();
        }
        this.j = null;
    }

    @Override // xsna.jqo
    public final void h(Throwable th, gzs gzsVar) {
        ikv0 ikv0Var = this.g;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.g = null;
        String j = j(th);
        if (j == null) {
            return;
        }
        Context context = this.a;
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(j, (String) null, (ikv0.d.a) null, 6);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_outline_28, (Integer) null, (Size) null, 14);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.dynamic_lib_action_repeat), new udl(0, gzsVar));
        this.g = aVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jqo
    public final void i(hqo hqoVar, rh4 rh4Var) {
        View view;
        CharSequence m = m(hqoVar);
        CharSequence l = l(hqoVar);
        if (m == null || (view = this.b) == null) {
            return;
        }
        iqo<UseCase> iqoVar = this.f;
        if (iqoVar.b(hqoVar)) {
            iqoVar.a(hqoVar);
            androidx.appcompat.app.d dVar = this.j;
            if (dVar != null) {
                dVar.hide();
            }
            this.j = n(view, m.toString(), l != null ? l.toString() : null, new m9(13, this, rh4Var));
        }
    }

    public String j(Throwable th) {
        if (th instanceof DynamicException.Cancellation) {
            return null;
        }
        boolean z = th instanceof DynamicException.GooglePlay;
        Context context = this.a;
        return z ? context.getString(R.string.dynamic_lib_error_play_store) : th instanceof DynamicException.Network ? context.getString(R.string.dynamic_lib_error_network) : th instanceof DynamicException.Storage ? context.getString(R.string.dynamic_lib_error_storage) : th instanceof DynamicException.Session ? context.getString(R.string.dynamic_lib_error_session) : ((th instanceof DynamicException.Queuing) || (th instanceof DynamicException.Unknown)) ? context.getString(R.string.dynamic_lib_error_unknown) : context.getString(R.string.dynamic_lib_error_unknown);
    }

    public CharSequence k(b.AbstractC0762b abstractC0762b) {
        return null;
    }

    public CharSequence l(UseCase usecase) {
        return null;
    }

    public CharSequence m(UseCase usecase) {
        return null;
    }

    public final androidx.appcompat.app.d n(View view, String str, String str2, izs<? super View, s3q0> izsVar) {
        Tooltip.WindowStyle windowStyle = this.e ? Tooltip.WindowStyle.FULLSCREEN : Tooltip.WindowStyle.DEFAULT_FLOATING;
        int i = Tooltip.n;
        RectF G = bwt0.G(view);
        vw0 vw0Var = new vw0(izsVar, 5);
        e3m.a aVar = e3m.a;
        Context context = this.a;
        return Tooltip.a.a(context, str, str2, G, windowStyle, vw0Var, null, null, context.getColor(R.color.vk_white), context.getColor(R.color.vk_gray_800), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, null, 0, null, 5000L, null, null, null, null, 534772928);
    }

    public vdl(Context context, View view, ProgressBar progressBar, int i) {
        this(context, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : progressBar, null, false, new tdl());
    }
}

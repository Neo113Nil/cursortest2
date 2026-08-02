package xsna;

import android.content.Context;
import android.util.Size;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ikv0;
import xsna.itk0;
import xsna.mut0;
import xsna.yt;

/* compiled from: ViewVideoDynamicPollRenderer.kt */
/* loaded from: classes16.dex */
public final class k2u0 implements lis0 {
    public final LinearLayout a;
    public final cim0 b;
    public final utk0 c = vtk0.a(null);
    public ComposeView d;

    public k2u0(LinearLayout linearLayout, cim0 cim0Var) {
        this.a = linearLayout;
        this.b = cim0Var;
    }

    @Override // xsna.lis0
    public final void a(itk0 itk0Var) {
        if (this.d == null) {
            LinearLayout linearLayout = this.a;
            ComposeView composeView = new ComposeView(linearLayout.getContext(), null, 6);
            composeView.setViewCompositionStrategy(mut0.c.a);
            composeView.setContent(new jai(408468814, new uxb(this, 11), true));
            linearLayout.addView(composeView, -1, -2);
            this.d = composeView;
        }
        boolean equals = itk0Var.equals(itk0.a.a);
        utk0 utk0Var = this.c;
        if (equals) {
            utk0Var.setValue(null);
        } else {
            if (!(itk0Var instanceof itk0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            itk0.b bVar = (itk0.b) itk0Var;
            y0u0 y0u0Var = new y0u0(bVar.b, bVar.c);
            utk0Var.getClass();
            utk0Var.i(null, y0u0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, xsna.ikv0] */
    @Override // xsna.lis0
    public final void b() {
        LinearLayout linearLayout = this.a;
        if (linearLayout.isAttachedToWindow()) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Context context = linearLayout.getContext();
            dy0 dy0Var = new dy0(28, this, ref$ObjectRef);
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
            aVar.u = new ikv0.d(context.getString(R.string.video_dynamic_actual_poll_snack_message), (String) null, (ikv0.d.a) null, 6);
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.video_dynamic_actual_poll_snack_cancel), new com.vk.movika.sdk.base.logic.interactor.p(dy0Var, 26));
            ref$ObjectRef.element = aVar.n();
            this.b.invoke(yt.c.a);
        }
    }

    @Override // xsna.lis0
    public final void destroy() {
        this.a.removeView(this.d);
        ComposeView composeView = this.d;
        if (composeView != null) {
            composeView.s();
        }
    }
}

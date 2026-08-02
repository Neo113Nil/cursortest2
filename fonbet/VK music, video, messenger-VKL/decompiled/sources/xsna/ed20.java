package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorComponent;
import com.vk.im.engine.di.ImCommonCommandsFactoryComponent;
import com.vkontakte.android.R;

/* compiled from: MessageViewsViewHolderDelegate.kt */
/* loaded from: classes2.dex */
public final class ed20 implements cpj0 {
    public final int b;
    public final long c;
    public gc20 d;

    public ed20(int i, long j) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.cpj0
    public final void a(ViewGroup viewGroup, brj0 brj0Var, izs<? super brj0, s3q0> izsVar) {
        viewGroup.removeAllViews();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.im_message_action_views, viewGroup, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        imageView.setImageDrawable(krv0.f(R.drawable.vk_icon_view_outline_28, R.attr.vk_ui_icon_accent, imageView.getContext()));
        this.d = new gc20(this.b, this.c, new sxi((ShimmerFrameLayout) inflate.findViewById(R.id.shimmer), (TextView) inflate.findViewById(R.id.title)), new xc20(new rc20(((ImCmdCoroutinesExecutorComponent) ((k7m) m7m.c(inflate)).a(fpf0.a(ImCmdCoroutinesExecutorComponent.class))).g(), ((ImCommonCommandsFactoryComponent) ((k7m) m7m.c(inflate)).mo408a(fpf0.a(ImCommonCommandsFactoryComponent.class))).w7(), new pli(10))));
        inflate.setOnClickListener(new dd20(0, izsVar, brj0Var));
    }

    @Override // xsna.cpj0
    public final void b() {
        gc20 gc20Var = this.d;
        if (gc20Var != null) {
            zvj.c(gc20Var.e, null);
        }
        this.d = null;
    }
}

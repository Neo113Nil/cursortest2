package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ironsource.InterfaceC4319fe;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FaveEmptyPlaceholderHolder.kt */
/* loaded from: classes4.dex */
public final class vnq extends rp6<wnq, NewsEntry> {
    public static final /* synthetic */ int K = 0;
    public final ViewGroup E;
    public final TextView F;
    public final TextView G;
    public final VkSimpleButton H;
    public final VkSimpleButton I;
    public final View J;

    /* compiled from: FaveEmptyPlaceholderHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<View, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            vnq vnqVar = (vnq) this.receiver;
            int i = vnq.K;
            vnqVar.getClass();
            p870.f().e(InterfaceC4319fe.a.b, null);
            return s3q0.a;
        }
    }

    /* compiled from: FaveEmptyPlaceholderHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<View, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            vnq vnqVar = (vnq) this.receiver;
            int i = vnq.K;
            vnqVar.X6(NewsfeedExternalAction.Navigation.d.a);
            return s3q0.a;
        }
    }

    public vnq(ViewGroup viewGroup) {
        super(R.layout.fave_empty_holder, viewGroup);
        this.D = t980.a;
        this.E = (ViewGroup) this.itemView.findViewById(R.id.fl_root_container);
        this.F = (TextView) this.itemView.findViewById(R.id.tv_fave_empty_title);
        this.G = (TextView) this.itemView.findViewById(R.id.tv_fave_empty_description);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.tv_clear_filter);
        this.H = vkSimpleButton;
        VkSimpleButton vkSimpleButton2 = (VkSimpleButton) this.itemView.findViewById(R.id.tv_action_button);
        this.I = vkSimpleButton2;
        this.J = this.itemView.findViewById(R.id.v_fave_empty_top_divider);
        jjc.g(vkSimpleButton, new a(1, this, vnq.class, "onClearButtonClicked", "onClearButtonClicked(Landroid/view/View;)V", 0));
        jjc.g(vkSimpleButton2, new b(1, this, vnq.class, "onActionButtonClicked", "onActionButtonClicked(Landroid/view/View;)V", 0));
    }

    @Override // xsna.rp6
    public final void R6(wnq wnqVar) {
        wnq wnqVar2 = wnqVar;
        f4m.v(wnqVar2.h, this.E);
        boolean z = wnqVar2.j;
        TextView textView = this.F;
        bwt0.p0(textView, z);
        textView.setText(wnqVar2.i);
        this.G.setText(wnqVar2.k);
        bwt0.p0(this.H, wnqVar2.l);
        boolean z2 = wnqVar2.n;
        VkSimpleButton vkSimpleButton = this.I;
        bwt0.p0(vkSimpleButton, z2);
        vkSimpleButton.setText(wnqVar2.m);
        bwt0.p0(this.J, wnqVar2.o);
    }
}

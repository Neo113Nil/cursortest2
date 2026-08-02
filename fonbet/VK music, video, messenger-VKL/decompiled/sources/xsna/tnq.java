package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FaveEmptyHolder.kt */
/* loaded from: classes18.dex */
public final class tnq extends vif0<snq> {
    public static final /* synthetic */ int t = 0;
    public final ViewGroup n;
    public final TextView o;
    public final TextView p;
    public final VkSimpleButton q;
    public final VkSimpleButton r;
    public final View s;

    /* compiled from: FaveEmptyHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<View, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            tnq tnqVar = (tnq) this.receiver;
            int i = tnq.t;
            snq snqVar = (snq) tnqVar.m;
            if (snqVar != null && (snqVar instanceof qnq)) {
                enq.a.getClass();
                enq.e(null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: FaveEmptyHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<View, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            tnq tnqVar = (tnq) this.receiver;
            int i = tnq.t;
            snq snqVar = (snq) tnqVar.m;
            if (snqVar == null || !(snqVar instanceof ynq)) {
                return s3q0.a;
            }
            throw null;
        }
    }

    public tnq(ViewGroup viewGroup) {
        super(viewGroup, R.layout.fave_empty_holder, 0);
        this.n = (ViewGroup) this.itemView.findViewById(R.id.fl_root_container);
        this.o = (TextView) this.itemView.findViewById(R.id.tv_fave_empty_title);
        this.p = (TextView) this.itemView.findViewById(R.id.tv_fave_empty_description);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.tv_clear_filter);
        this.q = vkSimpleButton;
        VkSimpleButton vkSimpleButton2 = (VkSimpleButton) this.itemView.findViewById(R.id.tv_action_button);
        this.r = vkSimpleButton2;
        this.s = this.itemView.findViewById(R.id.v_fave_empty_top_divider);
        jjc.g(vkSimpleButton, new a(1, this, tnq.class, "onClearButtonClicked", "onClearButtonClicked(Landroid/view/View;)V", 0));
        jjc.g(vkSimpleButton2, new b(1, this, tnq.class, "onActionButtonClicked", "onActionButtonClicked(Landroid/view/View;)V", 0));
    }

    @Override // xsna.vif0
    public final void i6(snq snqVar) {
        snq snqVar2 = snqVar;
        boolean z = snqVar2 instanceof qnq;
        ViewGroup viewGroup = this.n;
        if (!z) {
            if (snqVar2 instanceof ynq) {
                f4m.v(0, viewGroup);
                throw null;
            }
            return;
        }
        qnq qnqVar = (qnq) snqVar2;
        f4m.v(qnqVar.b, viewGroup);
        TextView textView = this.o;
        textView.setVisibility(8);
        textView.setText("");
        this.p.setText(qnqVar.a);
        this.q.setVisibility(qnqVar.c ? 0 : 8);
        this.r.setVisibility(8);
        this.s.setVisibility(8);
    }
}

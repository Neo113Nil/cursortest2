package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.Attachment;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: CommonHolder.kt */
/* loaded from: classes4.dex */
public abstract class ikg<T extends Attachment> extends m56<T> implements View.OnClickListener, blc0 {
    public static final int K = iah0.a(52);
    public final VKImageView D;
    public final TextView E;
    public final TextView F;
    public final View G;
    public View.OnClickListener H;
    public e6o I;
    public e6o J;

    public ikg(ViewGroup viewGroup) {
        super(R.layout.post_attach_common, viewGroup);
        this.D = (VKImageView) this.itemView.findViewById(R.id.attach_icon);
        this.E = (TextView) this.itemView.findViewById(R.id.attach_title);
        this.F = (TextView) this.itemView.findViewById(R.id.attach_subtitle);
        this.G = this.itemView.findViewById(R.id.attach_common_remove_button);
        X6();
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.G, z);
        int i = z ? K : 0;
        f4m.r(i, this.E);
        f4m.r(i, this.F);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.I = s6oVar.a(this, baVar);
        View.OnClickListener onClickListener = this.H;
        if (onClickListener != null) {
            this.J = s6oVar.a(onClickListener, baVar);
        }
        X6();
    }

    public final void X6() {
        View.OnClickListener onClickListener = this.I;
        if (onClickListener == null) {
            bpn0 bpn0Var = jjc.a;
            onClickListener = new q01(this, 2);
        }
        this.itemView.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.H;
        if (onClickListener2 != null) {
            e6o e6oVar = this.J;
            if (e6oVar != null) {
                onClickListener2 = e6oVar;
            }
            this.G.setOnClickListener(onClickListener2);
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.H = onClickListener;
        s6o s6oVar = this.q;
        this.J = s6oVar != null ? s6oVar.a(onClickListener, s6oVar.e) : null;
        X6();
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}

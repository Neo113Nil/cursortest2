package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.Peer;
import com.vkontakte.android.R;

/* compiled from: WriteRestrictionViewHolderDelegate.kt */
/* loaded from: classes2.dex */
public final class x2y0 implements cpj0 {
    public final long b;
    public final long c;
    public final v2y0 d;
    public View e;
    public o2y0 f;

    public x2y0(long j, long j2, v2y0 v2y0Var) {
        this.b = j;
        this.c = j2;
        this.d = v2y0Var;
    }

    @Override // xsna.cpj0
    public final void a(ViewGroup viewGroup, brj0 brj0Var, izs<? super brj0, s3q0> izsVar) {
        viewGroup.removeAllViews();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.im_write_restriction_action_views, viewGroup, true);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.f = new o2y0(this.b, Peer.a.b(this.c), new w2y0((ShimmerFrameLayout) inflate.findViewById(R.id.shimmer), (ImageView) inflate.findViewById(R.id.im_write_restriction_icon), (TextView) inflate.findViewById(R.id.im_write_restriction_title)), this.d, new bzb0(viewGroup.getContext()));
        jjc.g(inflate, new dm(izsVar, brj0Var, this));
        this.e = inflate;
    }

    @Override // xsna.cpj0
    public final void b() {
        View view = this.e;
        if (view != null) {
            view.setOnClickListener(null);
        }
        o2y0 o2y0Var = this.f;
        if (o2y0Var != null) {
            zvj.c(o2y0Var.g, null);
        }
        this.e = null;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2y0)) {
            return false;
        }
        x2y0 x2y0Var = (x2y0) obj;
        return this.b == x2y0Var.b && this.c == x2y0Var.c && epx.f(this.d, x2y0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + bh10.a(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return "WriteRestrictionViewHolderDelegate(dialogId=" + this.b + ", userId=" + this.c + ", interactor=" + this.d + ')';
    }
}

package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.community.tool.view.header.actionbuttons.OnMeasureCustomActionsView;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import org.chromium.net.NetError;

/* compiled from: CommunityActionButtonsItem.kt */
/* loaded from: classes5.dex */
public final class fpg extends we6 {
    public final gpg g;
    public final wvw h;
    public final h7v i;
    public final ibd j;
    public final izs<CommunityProfileAction, s3q0> k;
    public final izs<View, s3q0> l;
    public final int m = NetError.ERR_CERT_INVALID;
    public int n;
    public int o;

    /* compiled from: CommunityActionButtonsItem.kt */
    public static final class a extends vif0<fpg> {
        public static final /* synthetic */ int p = 0;
        public final b3h n;
        public final jpg o;

        public a(b3h b3hVar, int i, int i2, h7v h7vVar, izs<? super CommunityProfileAction, s3q0> izsVar) {
            super(b3hVar.a);
            this.n = b3hVar;
            this.o = new jpg(h7vVar, izsVar);
            f4m.y(i, this.itemView);
            f4m.v(i2, this.itemView);
            bwt0.Z(R.attr.vk_ui_background_content, this.itemView);
        }

        @Override // xsna.vif0
        public final void i6(fpg fpgVar) {
            fpg fpgVar2 = fpgVar;
            f4m.y(fpgVar2.n, this.itemView);
            f4m.v(fpgVar2.o, this.itemView);
            ibd ibdVar = fpgVar2.j;
            this.o.a(this.n, fpgVar2.g, ibdVar, false);
            izs<View, s3q0> izsVar = fpgVar2.l;
            if (izsVar != null) {
                izsVar.invoke(this.itemView);
            }
        }
    }

    public fpg(gpg gpgVar, wvw wvwVar, h7v h7vVar, ibd ibdVar, yte yteVar, izs izsVar) {
        this.g = gpgVar;
        this.h = wvwVar;
        this.i = h7vVar;
        this.j = ibdVar;
        this.k = yteVar;
        this.l = izsVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        int i = a.p;
        int i2 = this.n;
        int i3 = this.o;
        View b = tf3.b(viewGroup, R.layout.item_community_header_action_buttons_view, viewGroup, false);
        u11.h(-1, -2, b);
        return new a(new b3h((OnMeasureCustomActionsView) b, this.h), i2, i3, this.i, this.k);
    }

    @Override // xsna.we6
    public final int h() {
        return this.m;
    }
}

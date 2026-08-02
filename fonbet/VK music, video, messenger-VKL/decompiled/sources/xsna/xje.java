package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.clips.attachments.api.publish.links.ClipsLinksAttachEntryParams;
import com.vk.clips.attachments.impl.publish.links.edit.helper.EditLinkHideReason;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.mk50;
import xsna.tzp0;

/* compiled from: ClipsLinksEditBottomSheet.kt */
/* loaded from: classes16.dex */
public final class xje extends tl50<fke, jke, uje> {
    public static final b j1;
    public static final /* synthetic */ qcy<Object>[] k1;
    public final nf3 i1 = new nf3();

    /* compiled from: ClipsLinksEditBottomSheet.kt */
    public static final class a extends wpi {
        public final ClipsLinksAttachEntryParams g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ClipsLinksAttachEntryParams clipsLinksAttachEntryParams) {
            super(context, new tzp0.c.a(new yje(), true));
            xje.j1.getClass();
            this.g = clipsLinksAttachEntryParams;
            K0(16);
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            xje xjeVar = new xje();
            xjeVar.setArguments(yfb.b(new Pair("link_input_params", this.g)));
            return xjeVar;
        }
    }

    /* compiled from: ClipsLinksEditBottomSheet.kt */
    public static final class b {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(xje.class, "contentView", "getContentView()Lcom/vk/clips/attachments/impl/publish/links/edit/view/ClipsLinksEditContentView;", 0);
        fpf0.a.getClass();
        k1 = new qcy[]{mutablePropertyReference1Impl};
        j1 = new b();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        eke ekeVar = new eke(requireContext(), this, false);
        qcy<Object> qcyVar = k1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = ekeVar;
        return new mk50.c(((eke) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((eke) this.i1.getValue(this, k1[0])).f((jke) ao50Var, new ou1(1, this, xje.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 1));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((fke) vk50Var).f.a(new wje(this, 0), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        bo(EditLinkHideReason.ClickOutside.b);
        return super.a0();
    }

    public final void bo(EditLinkHideReason editLinkHideReason) {
        getParentFragmentManager().k0(yfb.b(new Pair("hide_reason", editLinkHideReason)), "links_key");
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("link_input_params", ClipsLinksAttachEntryParams.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("link_input_params");
            if (!(parcelable3 instanceof ClipsLinksAttachEntryParams)) {
                parcelable3 = null;
            }
            parcelable = (ClipsLinksAttachEntryParams) parcelable3;
        }
        ClipsLinksAttachEntryParams clipsLinksAttachEntryParams = (ClipsLinksAttachEntryParams) parcelable;
        if (clipsLinksAttachEntryParams == null) {
            clipsLinksAttachEntryParams = new ClipsLinksAttachEntryParams("", "", "", "");
        }
        return new fke(clipsLinksAttachEntryParams);
    }
}

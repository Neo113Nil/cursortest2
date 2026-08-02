package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.mk50;
import xsna.tzp0;

/* compiled from: ClipsCoauthorsSelectorBottomSheet.kt */
/* loaded from: classes16.dex */
public final class wmd extends tl50<bnd, gnd, vmd> implements w8i {
    public static final /* synthetic */ qcy<Object>[] l1;
    public static final tzp0.c.a m1;
    public final nf3 i1 = new nf3();
    public final Object j1;
    public final Object k1;

    /* compiled from: ClipsCoauthorsSelectorBottomSheet.kt */
    public static final class a extends wpi {
        public final ClipsCoauthorsSelectorInputParams g;

        public a(Context context, ClipsCoauthorsSelectorInputParams clipsCoauthorsSelectorInputParams) {
            super(context, wmd.m1);
            this.g = clipsCoauthorsSelectorInputParams;
            K0(32);
            c(new a470());
            F0(true);
            x(0);
            I(true);
            p(true);
            if (clipsCoauthorsSelectorInputParams.b) {
                dhr0.a.getClass();
                u0(dhr0.u().c);
            }
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            wmd wmdVar = new wmd();
            Bundle bundle = new Bundle();
            bundle.putParcelable("input_params", this.g);
            wmdVar.setArguments(bundle);
            return wmdVar;
        }
    }

    /* compiled from: ClipsCoauthorsSelectorBottomSheet.kt */
    public static final class b implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_COAUTHORS_PICKER;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(wmd.class, "contentView", "getContentView()Lcom/vk/clips/coauthors/selector/ui/ClipsCoauthorsSelectorContentView;", 0);
        fpf0.a.getClass();
        l1 = new qcy[]{mutablePropertyReference1Impl};
        m1 = new tzp0.c.a(new b(), false);
    }

    public wmd() {
        ra raVar = new ra(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j1 = msy.a(lazyThreadSafetyMode, raVar);
        this.k1 = msy.a(lazyThreadSafetyMode, new h20(this, 15));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        and andVar = new and(requireContext(), this, ((ClipsCoauthorsSelectorInputParams) this.j1.getValue()).b);
        qcy<Object> qcyVar = l1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = andVar;
        return new mk50.c(((and) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((and) this.i1.getValue(this, l1[0])).f((gnd) ao50Var, new qi3(1, this, wmd.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        bnd bndVar = new bnd((ClipsCoauthorsSelectorInputParams) this.j1.getValue(), ((ClipsCoauthorsInternalComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(ClipsCoauthorsInternalComponent.class))).Df());
        bndVar.h.a(new dg(this, 22), this);
        return bndVar;
    }
}

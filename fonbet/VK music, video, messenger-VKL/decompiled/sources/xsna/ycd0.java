package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.donut.DonutLevel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.mk50;

/* compiled from: PrivacyEditDonutLevelsBottomSheet.kt */
/* loaded from: classes18.dex */
public final class ycd0 extends tl50<add0, ldd0, zcd0> {
    public static final /* synthetic */ qcy<Object>[] m1 = {new MutablePropertyReference1Impl(ycd0.class, "contentView", "getContentView()Lcom/vk/donut/privacy/levels/levelsbottomsheet/PrivacyEditDonutLevelsBottomSheetView;", 0), p5j.a(0, ycd0.class, "onSelectedLevel", "getOnSelectedLevel()Lkotlin/jvm/functions/Function1;", fpf0.a)};
    public final nf3 i1 = new nf3();
    public final nf3 j1 = new nf3();
    public final Object k1;
    public final Object l1;

    /* compiled from: PrivacyEditDonutLevelsBottomSheet.kt */
    public static final class a extends kmu0 {
        public final ArrayList h;
        public final DonutLevel i;
        public final r9c0 j;

        public a(Context context, DonutLevel donutLevel, ArrayList arrayList, r9c0 r9c0Var) {
            super(context, tzp0.a(null, 3));
            this.h = arrayList;
            this.i = donutLevel;
            this.j = r9c0Var;
            s(enj.e(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent, context));
            t();
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            v0(R.string.donut_levels_bottom_sheet_title);
            J();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ycd0 ycd0Var = new ycd0();
            ycd0Var.setArguments(yfb.b(new Pair("donut_levels", this.h), new Pair("donut_level", this.i)));
            qcy<Object> qcyVar = ycd0.m1[1];
            ycd0Var.j1.c = this.j;
            return ycd0Var;
        }
    }

    public ycd0() {
        wf40 wf40Var = new wf40(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k1 = msy.a(lazyThreadSafetyMode, wf40Var);
        this.l1 = msy.a(lazyThreadSafetyMode, new lo10(this, 23));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        fdd0 fdd0Var = new fdd0(requireContext(), this);
        vq.b(-1, -2, fdd0Var.d);
        qcy<Object>[] qcyVarArr = m1;
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = fdd0Var;
        this.e0 = new jgj(((fdd0) nf3Var.getValue(this, qcyVarArr[0])).c(), 0, 0, 62);
        return new mk50.c(((fdd0) nf3Var.getValue(this, qcyVarArr[0])).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((fdd0) this.i1.getValue(this, m1[0])).f((ldd0) ao50Var, new p5e(1, this, ycd0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((add0) vk50Var).h.a(new yo20(1, this, ycd0.class, "handleSideEffect", "handleSideEffect(Lcom/vk/donut/privacy/levels/levelsbottomsheet/PrivacyEditBottomSheetSideEffect;)V", 0, 5), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new add0((DonutLevel) this.l1.getValue(), (List) this.k1.getValue());
    }
}

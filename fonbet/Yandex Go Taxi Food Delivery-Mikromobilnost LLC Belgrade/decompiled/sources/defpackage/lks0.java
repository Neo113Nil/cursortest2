package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.LinkedHashMap;
import kotlin.Pair;
import skeletor.render.SkeletonBlock;
import skeletor.render.SkeletonContentView;

/* loaded from: classes10.dex */
public final class lks0 implements n86 {
    public final jtr0 a;
    public final LinkedHashMap b;
    public final /* synthetic */ SkeletonContentView c;

    public lks0(SkeletonContentView skeletonContentView) {
        this.c = skeletonContentView;
        jtr0 jtr0Var = new jtr0();
        jtr0Var.a.o = true;
        this.a = (jtr0) jtr0Var.d(1.0f);
        this.b = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1 == null) goto L11;
     */
    @Override // defpackage.n86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Context context, int i, int i2, int i3, int i4, int i5, Integer num, String str, boolean z) {
        String str2;
        wls0 wls0Var;
        tls tlsVar;
        SkeletonContentView skeletonContentView = this.c;
        if (str != null) {
            wls0Var = skeletonContentView.skeletonProxy;
            str2 = (wls0Var == null || (tlsVar = wls0Var.c) == null) ? null : (String) tlsVar.invoke(str);
        }
        str2 = str;
        int J = d6z.J(0, str2);
        if (i4 == 0 || i5 == 0) {
            return;
        }
        Pair pair = new Pair(Integer.valueOf(i4), Integer.valueOf(i5));
        LinkedHashMap linkedHashMap = this.b;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linkedHashMap.get(pair);
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(i4, i5);
            linkedHashMap.put(pair, marginLayoutParams);
        }
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.leftMargin = i;
        SkeletonBlock skeletonBlock = new SkeletonBlock(context, null, 2, null);
        skeletonBlock.setLayoutParams(marginLayoutParams);
        if (str != null) {
            float rint = ((float) Math.rint(((J & SkeletonContentView.HUNDRED_PERCENTS_ALPHA) / 4.27819E9f) * 100.0f)) / 100.0f;
            jtr0 jtr0Var = this.a;
            jtr0Var.a.o = z;
            jtr0 jtr0Var2 = (jtr0) jtr0Var.d(rint);
            ktr0 ktr0Var = jtr0Var2.a;
            ktr0Var.e = (ktr0Var.e & ModalContentViewContainer.BASE_SHADOW_COLOR) | (16777215 & J);
            jtr0 jtr0Var3 = (jtr0) jtr0Var2.e(0.8f);
            int J2 = d6z.J(15, str2);
            ktr0 ktr0Var2 = jtr0Var3.a;
            ktr0Var2.d = J2;
            ktr0Var2.m = 0.0f;
            skeletonBlock.setShimmer(((jtr0) jtr0Var3.f(2000L)).a());
        }
        if (num != null) {
            skeletonBlock.setCorners(num.intValue());
        }
        skeletonContentView.addView(skeletonBlock);
    }
}

package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes9.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    private static final /* synthetic */ b[] p;
    public final int f;
    public final int g;
    private final int h;

    @Nullable
    private final sg.bigo.ads.ca.b i;
    private final int j;
    private final int k;
    private final int l = -1;
    private final int m = 134217728;
    private final int n = 1;
    private final int o = 8;

    static {
        b bVar = new b("WHITE", 0, null, d.b, -10525849, 2, 1, 1);
        a = bVar;
        sg.bigo.ads.ca.b a2 = sg.bigo.ads.ca.b.a(1, 1, sg.bigo.ads.bv.b.a(-16777216, 0.3f));
        int i = d.a;
        b bVar2 = new b("DKGRAY_TRANSLUCENT", 1, a2, i, i, 0, 2, 2);
        b = bVar2;
        sg.bigo.ads.ca.b a3 = sg.bigo.ads.ca.b.a(1, 1, sg.bigo.ads.bv.b.a(-16777216, 0.3f));
        int i2 = d.a;
        b bVar3 = new b("MAIN_COLOR_TRANSLUCENT", 2, a3, i2, i2, 0, 2, 2);
        c = bVar3;
        sg.bigo.ads.ca.b a4 = sg.bigo.ads.ca.b.a(4, 2, sg.bigo.ads.bv.b.a(-16777216, 0.3f));
        int i3 = d.a;
        b bVar4 = new b("LTGRAY_BLUR", 3, a4, i3, i3, 0, 2, 2);
        d = bVar4;
        sg.bigo.ads.ca.b a5 = sg.bigo.ads.ca.b.a(4, 2, sg.bigo.ads.bv.b.a(-16777216, 0.3f));
        int i4 = d.a;
        b bVar5 = new b("MAIN_COLOR_BLUR", 4, a5, i4, i4, 0, 2, 2);
        e = bVar5;
        p = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    /* JADX WARN: Incorrect types in method signature: (Lsg/bigo/ads/ca/b;IIIIIII)V */
    private b(String str, int i, @Nullable sg.bigo.ads.ca.b bVar, int i2, int i3, int i4, int i5, int i6) {
        this.i = bVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.j = i5;
        this.k = i6;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) p.clone();
    }

    public final void a(View view) {
        if (view != null) {
            sg.bigo.ads.as.a.a(view, sg.bigo.ads.common.utils.f.a(view.getContext(), this.j));
        }
    }

    public final void b(View view) {
        if (view != null) {
            sg.bigo.ads.as.a.a(view, sg.bigo.ads.common.utils.f.a(view.getContext(), this.h));
        }
    }

    public final void a(TextView textView, TextView textView2) {
        Context context;
        if (textView == null && textView2 == null) {
            return;
        }
        if (textView != null) {
            context = textView.getContext();
            textView.setTextColor(this.f);
        } else {
            context = null;
        }
        if (textView2 != null) {
            if (context == null) {
                context = textView2.getContext();
            }
            textView2.setTextColor(this.g);
        }
        sg.bigo.ads.ca.b bVar = this.i;
        if (bVar == null) {
            if (textView != null) {
                textView.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            }
            if (textView2 != null) {
                textView2.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                return;
            }
            return;
        }
        int a2 = sg.bigo.ads.common.utils.f.a(context, bVar.a);
        int a3 = sg.bigo.ads.common.utils.f.a(context, bVar.b);
        int a4 = sg.bigo.ads.common.utils.f.a(context, bVar.c);
        if (textView != null) {
            textView.setShadowLayer(a2, a3, a4, bVar.d);
        }
        if (textView2 != null) {
            textView2.setShadowLayer(a2, a3, a4, bVar.d);
        }
    }

    public final void a(RoundedImageView roundedImageView) {
        if (roundedImageView == null) {
            return;
        }
        roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.f.a(roundedImageView.getContext(), this.o));
    }
}

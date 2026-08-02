package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredPosition;

/* loaded from: classes4.dex */
public final class buz0 {
    public final Context a;
    public String b;
    public String d;
    public int e;
    public int f;
    public int l;
    public int p;
    public Integer q;
    public rbv r;
    public Integer s;
    public Integer t;
    public String c = "";
    public sls g = new bgc(12);
    public final sls h = new bgc(12);
    public tls i = new f0z0(19);
    public TooltipCommon$PreferredGravity j = TooltipCommon$PreferredGravity.CENTER;
    public TooltipCommon$PreferredPosition k = TooltipCommon$PreferredPosition.AUTO;
    public boolean m = true;
    public boolean n = true;
    public int o = 10;

    public buz0(Context context) {
        this.a = context;
        this.e = rje.a(context, ung0.ybColor_button_primaryNormal);
        this.f = rje.a(context, ung0.ybColor_textIcon_primaryInverted);
    }

    public final cuz0 a() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        int i = this.e;
        int i2 = this.f;
        sls slsVar = this.g;
        tls tlsVar = this.i;
        TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity = this.j;
        TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition = this.k;
        int i3 = this.l;
        boolean z = this.m;
        boolean z2 = this.n;
        Integer num = this.s;
        Integer num2 = this.t;
        int i4 = this.o;
        int i5 = this.p;
        Integer num3 = this.q;
        return new cuz0(i, i2, i3, i5, i4, slsVar, this.h, tlsVar, this.r, this.a, tooltipCommon$PreferredGravity, tooltipCommon$PreferredPosition, num, num2, num3, str, str2, str3, z, z2);
    }

    public final void b(sls slsVar) {
        this.g = slsVar;
    }

    public final void c() {
        this.o = 12;
    }

    public final void d(tls tlsVar) {
        this.i = new uwl0(28, tlsVar);
    }

    public final void e() {
        this.m = false;
    }

    public final void f(boolean z) {
        this.n = z;
    }

    public final void g(Tooltip$PreferredGravity tooltip$PreferredGravity) {
        TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity;
        int i = auz0.b[tooltip$PreferredGravity.ordinal()];
        if (i == 1) {
            tooltipCommon$PreferredGravity = TooltipCommon$PreferredGravity.START;
        } else if (i == 2) {
            tooltipCommon$PreferredGravity = TooltipCommon$PreferredGravity.CENTER;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            tooltipCommon$PreferredGravity = TooltipCommon$PreferredGravity.END;
        }
        this.j = tooltipCommon$PreferredGravity;
    }

    public final void h(rbv rbvVar) {
        this.r = rbvVar;
    }

    public final void i(Text text) {
        CharSequence a;
        this.d = (text == null || (a = d.a(this.a, text)) == null) ? null : a.toString();
    }

    public final void j(int i) {
        this.l = i;
    }

    public final void k(Tooltip$PreferredPosition tooltip$PreferredPosition) {
        TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition;
        int i = auz0.a[tooltip$PreferredPosition.ordinal()];
        if (i == 1) {
            tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.TOP;
        } else if (i == 2) {
            tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.BOTTOM;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.AUTO;
        }
        this.k = tooltipCommon$PreferredPosition;
    }

    public final void l(Text text) {
        this.c = d.a(this.a, text).toString();
    }

    public final void m(int i) {
        this.t = Integer.valueOf(i);
    }

    public final void n(int i) {
        this.f = rje.a(this.a, i);
    }

    public final void o(Text text) {
        this.b = d.a(this.a, text).toString();
    }

    public final void p(int i) {
        this.s = Integer.valueOf(i);
    }
}

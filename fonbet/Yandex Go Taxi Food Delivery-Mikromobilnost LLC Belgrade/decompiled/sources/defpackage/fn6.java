package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import com.yandex.div.core.view2.errors.VariableMonitorView;
import com.yandex.div.core.view2.errors.d;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.summary.mobilityhub.interactor.k;
import com.yandex.go.taxi.summary.mobilityhub.mapper.e;
import defpackage.ywg;
import java.util.LinkedHashMap;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.go_platform.GoPlatformActivity;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class fn6 implements pqt {
    public final Object a;
    public Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public fn6(n3g n3gVar, w030 w030Var) {
        this.d = n3gVar;
        this.a = w030Var;
        h3g h3gVar = (h3g) n3gVar.z;
        h3g h3gVar2 = (h3g) n3gVar.A;
        l3g l3gVar = (l3g) n3gVar.B;
        l3g l3gVar2 = (l3g) n3gVar.C;
        c0j c0jVar = new c0j(h3gVar, h3gVar2, l3gVar, l3gVar2, 27);
        h3g h3gVar3 = (h3g) n3gVar.u;
        h3g h3gVar4 = (h3g) n3gVar.w;
        h3g h3gVar5 = (h3g) n3gVar.x;
        xvf0 xvf0Var = n3gVar.d;
        l3g l3gVar3 = (l3g) n3gVar.y;
        l3g l3gVar4 = (l3g) n3gVar.s;
        this.e = new jl00(new di20(h3gVar3, (l3g) n3gVar.v, new epf(h3gVar3, h3gVar4, h3gVar5, xvf0Var, l3gVar3, c0jVar, l3gVar4, 24), 5), 12);
        qcz0 qcz0Var = new qcz0((h3g) n3gVar.H, 22);
        this.f = qcz0Var;
        h3g h3gVar6 = (h3g) n3gVar.L;
        l3g l3gVar5 = (l3g) n3gVar.M;
        h3g h3gVar7 = (h3g) n3gVar.N;
        h3g h3gVar8 = (h3g) n3gVar.O;
        h3g h3gVar9 = (h3g) n3gVar.P;
        l3g l3gVar6 = (l3g) n3gVar.F;
        lok0 lok0Var = new lok0(h3gVar, h3gVar6, l3gVar5, h3gVar7, h3gVar8, h3gVar9, l3gVar6, 10);
        l3g l3gVar7 = (l3g) n3gVar.S;
        xvf0 xvf0Var2 = n3gVar.f;
        gpx0 gpx0Var = new gpx0((xvf0) l3gVar7, (xvf0) l3gVar4, xvf0Var2, 24, (byte) 0);
        ibz0 ibz0Var = new ibz0((h3g) n3gVar.T, s1v.a, 23);
        n3w n3wVar = n3gVar.a;
        h3g h3gVar10 = (h3g) n3gVar.K;
        h3g h3gVar11 = (h3g) n3gVar.I;
        kdv0 kdv0Var = new kdv0(n3wVar, h3gVar10, qcz0Var, h3gVar11, (l3g) n3gVar.Q, l3gVar4, (l3g) n3gVar.R, xvf0Var2, gpx0Var, ibz0Var, (y1u) n3gVar.V);
        xvf0 xvf0Var3 = n3gVar.e;
        xvf0 xvf0Var4 = n3gVar.g;
        z9n z9nVar = new z9n((xvf0) h3gVar11, xvf0Var3, (v7p) lok0Var, xvf0Var4, 23);
        g6 g6Var = new g6(h3gVar10, l3gVar6, l3gVar3, h3gVar7, l3gVar4, 4);
        dby0 dby0Var = new dby0((h3g) n3gVar.U, h3gVar6, (h3g) n3gVar.X, 29);
        m3g m3gVar = (m3g) n3gVar.G;
        this.b = n3w.a(new oc31(new ik0(n3wVar, (n3w) n3gVar.D, l3gVar6, m3gVar, h3gVar4, qcz0Var, h3gVar11, (h3g) n3gVar.J, new ut(h3gVar10, m3gVar, qcz0Var, l3gVar2, h3gVar11, xvf0Var, l3gVar3, lok0Var, xvf0Var3, kdv0Var, z9nVar, g6Var, new prq((xvf0) n3wVar, (xvf0) h3gVar10, (xvf0) m3gVar, n3gVar.W, (v7p) dby0Var, 28), new rct0(h3gVar10, l3gVar6, new z0s0((l3g) n3gVar.Y, 13), l3gVar4, (l3g) n3gVar.Z)), xvf0Var3, xvf0Var2, (m3g) n3gVar.a0, new x0z(h3gVar3, xvf0Var, l3gVar4, (l3g) n3gVar.b0, 14), (l3g) n3gVar.c0, xvf0Var4, (h3g) n3gVar.d0)));
        this.c = n3w.a(new kc31(new vx0((h3g) n3gVar.e0, (h3g) n3gVar.z, (m3g) n3gVar.f0)));
        this.h = n3w.a(new g2v(new s14(n3gVar.u, n3gVar.w, n3gVar.x, n3gVar.d, n3gVar.y, (xvf0) new epf((h3g) n3gVar.z, (l3g) n3gVar.p0, (l3g) n3gVar.C, (h3g) n3gVar.N, (h3g) n3gVar.L, new xat((h3g) n3gVar.A, 19), (l3g) n3gVar.B, 25), n3gVar.h, n3gVar.k, (v7p) this.f, n3gVar.b, n3gVar.E, n3gVar.q0, n3gVar.r0, n3gVar.s, n3gVar.i)));
        this.i = new vu(n3gVar.o0, (xvf0) this.h, n3w.a(new f2v(new dt20((h3g) n3gVar.u, new f9t((h3g) n3gVar.z, (l3g) n3gVar.v, 21), (m3g) n3gVar.s0, (m3g) n3gVar.t0, 1))), 14);
        this.j = n3w.a(w030Var);
        int i = 28;
        this.k = new flx0((l3g) n3gVar.y, new qcz0((h3g) n3gVar.P, i), i);
        this.g = new ubq0((h3g) n3gVar.z, (n3w) this.j, (qcz0) this.f, n3gVar.b, (n3w) n3gVar.E, (flx0) this.k, n3w.a(new za11(new hwo0((qcz0) this.f, n3gVar.b, (h3g) n3gVar.z0, (n3w) n3gVar.E, 28))));
        this.l = n3w.a(new aw20(new dt9((l3g) n3gVar.B0)));
    }

    public void a(View view) {
        ((LinearLayout) this.e).addView(view);
    }

    public Bitmap b() {
        Drawable drawable;
        hgr0 hgr0Var;
        Drawable drawable2;
        hgr0 hgr0Var2;
        RobotoTextView robotoTextView = (RobotoTextView) this.f;
        if (((Drawable) this.h) == null && (drawable2 = (Drawable) this.b) != null) {
            a aVar = (a) this.j;
            if (aVar != null && (hgr0Var2 = (hgr0) this.k) != null) {
                drawable2 = aVar.e(drawable2, hgr0Var2.a, hgr0Var2.b, hgr0Var2.c, hgr0Var2.d, true);
            }
            gn6 gn6Var = (gn6) this.g;
            if (gn6Var != null) {
                drawable2 = gn6Var.c(drawable2);
            }
            this.h = drawable2;
        }
        ((LinearLayout) this.e).setBackground((Drawable) this.h);
        if (robotoTextView != null) {
            if (((Drawable) this.i) == null && (drawable = (Drawable) this.c) != null) {
                a aVar2 = (a) this.j;
                if (aVar2 != null && (hgr0Var = (hgr0) this.k) != null) {
                    drawable = aVar2.e(drawable, hgr0Var.a, hgr0Var.b, hgr0Var.c, hgr0Var.d, true);
                }
                gn6 gn6Var2 = (gn6) this.l;
                if (gn6Var2 != null) {
                    drawable = gn6Var2.c(drawable);
                }
                this.i = drawable;
            }
            robotoTextView.setBackground((Drawable) this.i);
        }
        ((View) this.d).forceLayout();
        xw31.r((View) this.d);
        Bitmap createBitmap = Bitmap.createBitmap(((View) this.d).getWidth(), ((View) this.d).getHeight(), Bitmap.Config.ARGB_8888);
        synchronized (((Canvas) this.a)) {
            ((Canvas) this.a).setBitmap(createBitmap);
            ((View) this.d).draw((Canvas) this.a);
        }
        return createBitmap;
    }

    public void c(zwg zwgVar, LinkedHashMap linkedHashMap) {
        ((AppCompatTextView) this.g).setText(zwgVar.a);
        ((d) this.f).b(linkedHashMap);
        final ywg ywgVar = zwgVar.b;
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.j;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.h;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.i;
        SwitchCompat switchCompat = (SwitchCompat) this.b;
        LinearLayout linearLayout = (LinearLayout) this.k;
        String str = ywgVar.d;
        String str2 = ywgVar.f;
        String str3 = ywgVar.a;
        boolean z = ywgVar.b;
        linearLayout.setVisibility(0);
        switchCompat.setText("Hot Reload");
        switchCompat.setChecked(z);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.div.core.view2.debugview.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                ((DebugViewModelProvider$renderDetailsViewModel$2) ywg.this.c).invoke(Boolean.valueOf(z2));
            }
        });
        ((AppCompatTextView) this.c).setText("Hot Reload");
        appCompatTextView2.setText(str3);
        appCompatTextView2.setVisibility(0);
        if (!String.valueOf(appCompatEditText.getText()).equals(str2)) {
            appCompatEditText.setText(str2);
        }
        appCompatEditText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.div.core.view2.debugview.DetailsViewHolder$bindHotReload$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                ((DebugViewModelProvider$renderDetailsViewModel$4) ywg.this.g).invoke(String.valueOf(s));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        ((LinearLayout) this.e).setVisibility(z ? 0 : 8);
        appCompatTextView.setVisibility(str != null ? 0 : 8);
        if (str == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ClickableSpan() { // from class: com.yandex.div.core.view2.debugview.DetailsViewHolder$bindHotReload$clickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                ((DebugViewModelProvider$renderDetailsViewModel$3) ywg.this.e).invoke();
            }
        }, 0, str.length(), 33);
        appCompatTextView.setText(spannableString);
    }

    public fn6 d() {
        return new fn6((Canvas) this.a, (Drawable) this.b, (Drawable) this.c, (View) this.d, (LinearLayout) this.e, (RobotoTextView) this.f, (gn6) this.g, (hn6) this.l, (Drawable) this.h, (Drawable) this.i, (a) this.j, (hgr0) this.k);
    }

    public Drawable e() {
        return (Drawable) this.h;
    }

    public Drawable f() {
        return (Drawable) this.i;
    }

    public LinearLayout g() {
        return (LinearLayout) this.l;
    }

    public k h() {
        n3g n3gVar = (n3g) this.d;
        i6r i6rVar = (i6r) n3gVar.m;
        ah00 B = ((c0g) i6rVar).B();
        q5z.h(B);
        fvr fvrVar = (fvr) n3gVar.d.get();
        b W5 = ((c0g) i6rVar).W5();
        q5z.h(W5);
        po21 C6 = ((c0g) i6rVar).C6();
        q5z.h(C6);
        return new k(B, fvrVar, W5, C6);
    }

    public amp0 i() {
        n3g n3gVar = (n3g) this.d;
        lhq0 lhq0Var = (lhq0) n3gVar.h.get();
        i6r i6rVar = (i6r) n3gVar.m;
        return new amp0(lhq0Var, ((c0g) i6rVar).z.o(), ((c0g) i6rVar).x0());
    }

    public void j(Drawable drawable) {
        this.b = drawable;
    }

    public void k(Drawable drawable) {
        this.c = drawable;
    }

    public void l(Drawable drawable) {
        this.h = drawable;
    }

    public void m(Drawable drawable) {
        this.i = drawable;
    }

    public void n(gn6 gn6Var) {
        this.g = gn6Var;
    }

    public void o(hn6 hn6Var) {
        this.l = hn6Var;
    }

    public void p(a aVar, hgr0 hgr0Var) {
        this.j = aVar;
        this.k = hgr0Var;
    }

    public void q(CharSequence charSequence) {
        RobotoTextView robotoTextView = (RobotoTextView) this.f;
        if (robotoTextView != null) {
            robotoTextView.setText(charSequence);
        }
    }

    public o7r0 r() {
        pho T1 = ((c0g) ((i6r) ((n3g) this.d).m)).T1();
        q5z.h(T1);
        return new o7r0(T1);
    }

    public e s() {
        n3g n3gVar = (n3g) this.d;
        i6r i6rVar = (i6r) n3gVar.m;
        pdc F1 = ((c0g) i6rVar).F1();
        q5z.h(F1);
        k7x0 s6 = ((c0g) i6rVar).s6();
        q5z.h(s6);
        xdf o1 = ((c0g) i6rVar).o1();
        q5z.h(o1);
        c b = ((c0g) i6rVar).b();
        q5z.h(b);
        zuj0 c = ((c0g) i6rVar).c();
        q5z.h(c);
        yp2 yp2Var = (yp2) ((c0g) i6rVar).z.kk.get();
        q5z.h(yp2Var);
        return new e(F1, s6, o1, b, c, yp2Var, (lhq0) n3gVar.h.get(), n3gVar.a());
    }

    public fn6(Canvas canvas, Drawable drawable, Drawable drawable2, View view, LinearLayout linearLayout, RobotoTextView robotoTextView, gn6 gn6Var, hn6 hn6Var, Drawable drawable3, Drawable drawable4, a aVar, hgr0 hgr0Var) {
        this.a = canvas;
        this.b = drawable;
        this.c = drawable2;
        this.d = view;
        this.e = linearLayout;
        this.f = robotoTextView;
        this.g = gn6Var;
        this.l = hn6Var;
        this.h = drawable3;
        this.i = drawable4;
        this.j = aVar;
        this.k = hgr0Var;
    }

    public fn6(Canvas canvas, Context context, boolean z) {
        this.a = canvas;
        View inflate = LayoutInflater.from(context).inflate(iph0.map_object_bubble, (ViewGroup) null);
        this.d = inflate;
        this.e = (LinearLayout) inflate.findViewById(ddh0.content);
        if (z) {
            RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(ddh0.overlay);
            this.f = robotoTextView;
            if (robotoTextView != null) {
                robotoTextView.setVisibility(0);
                return;
            }
            return;
        }
        this.f = null;
    }

    public fn6(Context context, tls tlsVar, sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.d = slsVar2;
        d dVar = new d(tlsVar);
        this.f = dVar;
        VariableMonitorView variableMonitorView = new VariableMonitorView(context, dVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(0, 0, com.yandex.div.core.view2.divs.a.p(8, context.getResources().getDisplayMetrics()), 0);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_menu_close_clear_cancel);
        imageView.setOnClickListener(new com.yandex.div.core.view2.debugview.e(0, this));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_menu_save);
        imageView2.setOnClickListener(new com.yandex.div.core.view2.debugview.e(1, this));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        SwitchCompat switchCompat = new SwitchCompat(context);
        switchCompat.setTextColor(-1);
        switchCompat.setThumbTextPadding(com.yandex.div.core.view2.divs.a.p(8, context.getResources().getDisplayMetrics()));
        this.b = switchCompat;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setGravity(3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        appCompatTextView.setLayoutParams(layoutParams);
        this.c = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setTextColor(-3355444);
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.setGravity(3);
        this.h = appCompatTextView2;
        AppCompatEditText appCompatEditText = new AppCompatEditText(context);
        appCompatEditText.setTextColor(-1);
        appCompatEditText.setTextSize(12.0f);
        appCompatEditText.setHintTextColor(-3355444);
        appCompatEditText.setHint("server address");
        this.i = appCompatEditText;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setTextColor(-16776961);
        appCompatTextView3.setTextSize(12.0f);
        appCompatTextView3.setGravity(3);
        appCompatTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        appCompatTextView3.setVisibility(8);
        this.j = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
        appCompatTextView4.setTextColor(-3355444);
        appCompatTextView4.setTextSize(12.0f);
        appCompatTextView4.setGravity(3);
        appCompatTextView4.setText("Listening at:");
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(appCompatTextView4);
        linearLayout2.addView(appCompatEditText, new ViewGroup.LayoutParams(-2, -2));
        this.e = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setVisibility(8);
        linearLayout3.addView(switchCompat, new ViewGroup.LayoutParams(-1, -2));
        linearLayout3.addView(linearLayout2);
        linearLayout3.addView(appCompatTextView2);
        linearLayout3.addView(appCompatTextView3);
        this.k = linearLayout3;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(context);
        appCompatTextView5.setTextColor(-1);
        appCompatTextView5.setGravity(3);
        this.g = appCompatTextView5;
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout4.addView(linearLayout3, new ViewGroup.LayoutParams(-1, -2));
        linearLayout4.addView(appCompatTextView5);
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        linearLayout5.addView(linearLayout, new LinearLayout.LayoutParams(com.yandex.div.core.view2.divs.a.p(32, linearLayout5.getRootView().getResources().getDisplayMetrics()), -2));
        linearLayout5.addView(linearLayout4, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout6 = new LinearLayout(context);
        int p = com.yandex.div.core.view2.divs.a.p(8, linearLayout6.getResources().getDisplayMetrics());
        linearLayout6.setPadding(p, p, p, p);
        linearLayout6.setOrientation(1);
        linearLayout6.setBackgroundColor(Color.argb(186, 0, 0, 0));
        linearLayout6.setElevation(linearLayout6.getResources().getDimension(vsg0.div_shadow_elevation));
        linearLayout6.addView(linearLayout5, new LinearLayout.LayoutParams(-1, -2));
        linearLayout6.addView(variableMonitorView, new LinearLayout.LayoutParams(-1, -2));
        this.l = linearLayout6;
    }

    public /* synthetic */ fn6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        this.a = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
        this.c = obj6;
        this.h = obj7;
        this.i = obj8;
        this.j = obj9;
        this.k = obj10;
        this.g = obj11;
        this.l = obj12;
    }

    public fn6(zzf zzfVar, GoPlatformActivity goPlatformActivity) {
        this.a = zzfVar;
        n3w a = n3w.a(goPlatformActivity);
        this.d = a;
        xvf0 b = i5m.b(a);
        this.e = b;
        int i = 18;
        this.f = new edf0(b, i);
        this.b = i5m.b(new lf(i5m.b((n3w) this.d), zzfVar.S, 4));
        this.c = new axy(zzfVar.L0, (xvf0) zzfVar.T0, (xvf0) zzfVar.A3, (xvf0) new bwy(zzfVar.d0, i), zzfVar.N0, 3);
        this.h = i5m.b(hqt.a);
        this.i = i5m.b(new xj((edf0) this.f, (xvf0) this.b, zzfVar.W0, zzfVar.dc, zzfVar.T0, (axy) this.c, zzfVar.D3, zzfVar.N0, (xvf0) this.h, zzfVar.S0, i5m.b(s660.a), 0));
        this.j = i5m.b(new dk(zzfVar.w0, (xvf0) this.e, zzfVar.W0, (xvf0) this.b, zzfVar.a0, zzfVar.n5, zzfVar.N7, zzfVar.D3, (xvf0) this.h, zzfVar.S0, 0));
        this.k = i5m.b((n3w) this.d);
        xvf0 b2 = i5m.b(new x((xvf0) this.h, i));
        this.g = b2;
        this.l = i5m.b(new x7y0(new xj(zzfVar.c, (xvf0) this.e, zzfVar.Y, zzfVar.d0, b2, zzfVar.n, zzfVar.s0, zzfVar.B1, zzfVar.e, zzfVar.A1, zzfVar.Ri, 17), 17));
    }
}

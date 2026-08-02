package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Objects;
import xsna.ydz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class q8z0 extends FrameLayout implements View.OnTouchListener {
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final LinearLayout e;
    public final LinearLayout f;
    public final TextView g;
    public final qpk0 h;
    public final TextView i;
    public final c1z0 j;
    public final boolean k;
    public final HashMap l;
    public String m;
    public ydz0.b n;
    public boolean o;

    public q8z0(Context context, c1z0 c1z0Var, boolean z) {
        super(context);
        this.l = new HashMap();
        this.o = false;
        TextView textView = new TextView(context);
        this.b = textView;
        this.c = new TextView(context);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        this.e = new LinearLayout(context);
        TextView textView3 = new TextView(context);
        this.g = textView3;
        qpk0 qpk0Var = new qpk0(context);
        this.h = qpk0Var;
        TextView textView4 = new TextView(context);
        this.i = textView4;
        this.f = new LinearLayout(context);
        c1z0.n(textView, "title_text");
        c1z0.n(textView2, "description_text");
        c1z0.n(textView3, "disclaimer_text");
        c1z0.n(qpk0Var, "stars_view");
        c1z0.n(textView4, "votes_text");
        this.j = c1z0Var;
        this.k = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(k6z0 k6z0Var, ydz0.b bVar) {
        char c;
        char c2;
        boolean z = k6z0Var.l;
        boolean z2 = k6z0Var.f;
        boolean z3 = k6z0Var.e;
        boolean z4 = k6z0Var.b;
        boolean z5 = k6z0Var.j;
        boolean z6 = k6z0Var.k;
        boolean z7 = k6z0Var.a;
        boolean z8 = k6z0Var.m;
        boolean z9 = this.o;
        TextView textView = this.i;
        qpk0 qpk0Var = this.h;
        TextView textView2 = this.d;
        TextView textView3 = this.c;
        TextView textView4 = this.b;
        HashMap hashMap = this.l;
        if (!z9) {
            if (z8) {
                setOnClickListener(new c98(bVar, 22));
                c1z0.h(this, -1, -3806472);
                return;
            }
            this.n = bVar;
            textView4.setOnTouchListener(this);
            textView3.setOnTouchListener(this);
            textView2.setOnTouchListener(this);
            qpk0Var.setOnTouchListener(this);
            textView.setOnTouchListener(this);
            setOnTouchListener(this);
            hashMap.put(textView4, Boolean.valueOf(z7));
            String str = this.m;
            if (str == null) {
                str = "";
            }
            switch (str.hashCode()) {
                case 117588:
                    if (str.equals("web")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 109770977:
                    if (str.equals(X3.i.U)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1223953944:
                    if (str.equals("webform")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 2:
                    hashMap.put(textView3, Boolean.valueOf(z5));
                    break;
                case 1:
                    hashMap.put(textView3, Boolean.valueOf(z6));
                    break;
            }
            hashMap.put(textView2, Boolean.valueOf(z4));
            hashMap.put(qpk0Var, Boolean.valueOf(z3));
            hashMap.put(textView, Boolean.valueOf(z2));
            hashMap.put(this, Boolean.valueOf(z));
            return;
        }
        this.n = bVar;
        textView4.setOnTouchListener(this);
        textView3.setOnTouchListener(this);
        textView2.setOnTouchListener(this);
        qpk0Var.setOnTouchListener(this);
        textView.setOnTouchListener(this);
        setOnTouchListener(this);
        if (z8) {
            Boolean bool = Boolean.TRUE;
            hashMap.put(textView4, bool);
            hashMap.put(textView2, bool);
            hashMap.put(qpk0Var, bool);
            hashMap.put(textView, bool);
            hashMap.put(textView3, bool);
            hashMap.put(this, bool);
            c1z0.h(this, -1, -3806472);
            return;
        }
        hashMap.put(textView4, Boolean.valueOf(z7));
        String str2 = this.m;
        if (str2 == null) {
            str2 = "";
        }
        switch (str2.hashCode()) {
            case 117588:
                if (str2.equals("web")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 109770977:
                if (str2.equals(X3.i.U)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1223953944:
                if (str2.equals("webform")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 2:
                hashMap.put(textView3, Boolean.valueOf(z5));
                break;
            case 1:
                hashMap.put(textView3, Boolean.valueOf(z6));
                break;
        }
        hashMap.put(textView2, Boolean.valueOf(z4));
        hashMap.put(qpk0Var, Boolean.valueOf(z3));
        hashMap.put(textView, Boolean.valueOf(z2));
        hashMap.put(this, Boolean.valueOf(z));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        z9z0 z9z0Var;
        boolean z = this.o;
        HashMap hashMap = this.l;
        if (!z) {
            if (hashMap.containsKey(view)) {
                if (((Boolean) hashMap.get(view)).booleanValue()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        setBackgroundColor(-3806472);
                        return true;
                    }
                    if (action == 1) {
                        setBackgroundColor(-1);
                        ydz0.b bVar = this.n;
                        if (bVar != null) {
                            bVar.a(view, new akz0());
                        }
                    } else if (action == 3) {
                        setBackgroundColor(-1);
                        return true;
                    }
                }
                return true;
            }
            return false;
        }
        if (hashMap.containsKey(view)) {
            if (((Boolean) hashMap.get(view)).booleanValue()) {
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    setBackgroundColor(-3806472);
                    return true;
                }
                if (action2 == 1) {
                    setBackgroundColor(-1);
                    int i = 2;
                    if (motionEvent.getAction() == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float f = sqe0.b(view).widthPixels;
                        float f2 = sqe0.b(view).heightPixels;
                        view.getLocationOnScreen(new int[2]);
                        z9z0Var = new c7z0((r6[0] + x) / f, (r6[1] + y) / f2);
                    } else {
                        z9z0Var = null;
                    }
                    if (z9z0Var == null) {
                        z9z0Var = new y9z0();
                    }
                    if (view == this.b) {
                        i = 1;
                    } else if (view == this.c) {
                        i = Objects.equals(this.m, X3.i.U) ? 1024 : 512;
                    } else if (view != this.d) {
                        i = view == this.h ? 16 : view == this.i ? 32 : 2048;
                    }
                    viy0 viy0Var = new viy0(i, z9z0Var);
                    ydz0.b bVar2 = this.n;
                    if (bVar2 != null) {
                        bVar2.a(view, viy0Var);
                        return true;
                    }
                } else if (action2 == 3) {
                    setBackgroundColor(-1);
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void setBanner(@NonNull tez0 tez0Var) {
        this.m = tez0Var.p;
        String str = tez0Var.f;
        TextView textView = this.b;
        textView.setText(str);
        String str2 = tez0Var.c;
        TextView textView2 = this.d;
        textView2.setText(str2);
        float c = tez0Var.c();
        qpk0 qpk0Var = this.h;
        qpk0Var.setRating(c);
        String valueOf = String.valueOf(tez0Var.f());
        TextView textView3 = this.i;
        textView3.setText(valueOf);
        this.o = tez0Var.T.c;
        String str3 = tez0Var.p;
        str3.getClass();
        char c2 = 65535;
        switch (str3.hashCode()) {
            case 117588:
                if (str3.equals("web")) {
                    c2 = 0;
                    break;
                }
                break;
            case 109770977:
                if (str3.equals(X3.i.U)) {
                    c2 = 1;
                    break;
                }
                break;
            case 1223953944:
                if (str3.equals("webform")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        LinearLayout linearLayout = this.e;
        TextView textView4 = this.c;
        switch (c2) {
            case 0:
            case 2:
                c1z0.n(textView4, "domain_text");
                linearLayout.setVisibility(8);
                textView4.setText(tez0Var.o);
                linearLayout.setVisibility(8);
                textView4.setTextColor(-16733198);
                break;
            case 1:
                c1z0.n(textView4, "category_text");
                String str4 = tez0Var.l;
                String str5 = tez0Var.n;
                String b = TextUtils.isEmpty(str4) ? "" : go9.b("", str4);
                if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(str5)) {
                    b = fo8.a(b, ", ");
                }
                if (!TextUtils.isEmpty(str5)) {
                    b = fo8.a(b, str5);
                }
                if (TextUtils.isEmpty(b)) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setText(b);
                    textView4.setVisibility(0);
                }
                linearLayout.setVisibility(0);
                linearLayout.setGravity(16);
                if (tez0Var.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    qpk0Var.setVisibility(0);
                    if (tez0Var.f() > 0) {
                        textView3.setVisibility(0);
                    } else {
                        textView3.setVisibility(8);
                    }
                } else {
                    qpk0Var.setVisibility(8);
                    textView3.setVisibility(8);
                }
                textView4.setTextColor(-3355444);
                break;
        }
        boolean isEmpty = TextUtils.isEmpty(tez0Var.g);
        TextView textView5 = this.g;
        if (isEmpty) {
            textView5.setVisibility(8);
        } else {
            textView5.setVisibility(0);
            textView5.setText(tez0Var.g);
        }
        if (this.k) {
            textView.setTextSize(2, 32.0f);
            textView2.setTextSize(2, 24.0f);
            textView5.setTextSize(2, 18.0f);
            textView4.setTextSize(2, 18.0f);
            return;
        }
        textView.setTextSize(2, 20.0f);
        textView2.setTextSize(2, 16.0f);
        textView5.setTextSize(2, 14.0f);
        textView4.setTextSize(2, 16.0f);
    }
}

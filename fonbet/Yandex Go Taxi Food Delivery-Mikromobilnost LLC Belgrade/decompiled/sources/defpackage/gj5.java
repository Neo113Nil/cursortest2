package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.b;
import com.yandex.go.design.view.GoImageView;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public final class gj5 extends lys implements t7u {
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public final /* synthetic */ int S = 1;
    public eiy T;
    public eiy U;
    public epu V;
    public Object W;

    public gj5(yc30 yc30Var) {
        super(yc30Var);
        aiy aiyVar = aiy.a;
        this.T = aiyVar;
        this.U = aiyVar;
        this.V = new dpu(yc30Var.d, null);
        this.W = new auy0(yc30Var.e);
        this.a.setClickable(false);
        xw31.N(c.h(8, this.a), yc30Var.b);
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 1:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        Drawable mutate;
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                yi5 yi5Var = (yi5) obj;
                yc30 yc30Var = (yc30) ((zo31) obj2);
                this.T = lob1.g(yi5Var.e);
                h911 h911Var = yi5Var.h;
                this.U = lob1.g(h911Var);
                obm obmVar = yi5Var.c;
                Drawable drawable = null;
                drawable = null;
                this.V = obmVar != null ? new cpu(yc30Var.c, yc30Var.d) : new dpu(yc30Var.d, null);
                if (obmVar != null && (mutate = obmVar.b.mutate()) != null) {
                    Context context = yc30Var.a.getContext();
                    kdc kdcVar = h911Var.a;
                    mutate.setTintList(kdcVar != null ? ColorStateList.valueOf(s8o.m(kdcVar, context)) : null);
                    drawable = mutate;
                }
                GoImageView goImageView = yc30Var.c;
                ConstraintLayout constraintLayout = yc30Var.a;
                goImageView.setImageDrawable(drawable);
                yc30Var.g.setText(yi5Var.a);
                yc30Var.f.setText(yi5Var.b);
                if (!constraintLayout.isAttachedToWindow()) {
                    OneShotPreDrawListener.add(constraintLayout, new tqs(3, this, yi5Var));
                    break;
                } else {
                    d0(yi5Var);
                    break;
                }
            default:
                xyy0 xyy0Var = (xyy0) obj;
                this.W = xyy0Var;
                this.T = lob1.g(xyy0Var.c);
                this.U = lob1.g(xyy0Var.c);
                ((f640) ((zo31) obj2)).b.setText(xyy0Var.a);
                break;
        }
    }

    public SpannableStringBuilder c0(yi5 yi5Var, int i, int i2) {
        List<ib11> A0 = a.A0(yi5Var.d.a, i);
        v1u v1uVar = yi5Var.d;
        int size = (v1uVar.a.size() - A0.size()) + v1uVar.c;
        Context context = ((yc30) ((zo31) this.R)).a.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (ib11 ib11Var : A0) {
            spannableStringBuilder.append(fh4.f(context, ib11Var.b, ib11Var.c, ib11Var.d));
            spannableStringBuilder.append((CharSequence) " ");
        }
        CharSequence c = bt11.c(size, context);
        if (c != null) {
            spannableStringBuilder.append(c);
        }
        List A02 = a.A0(v1uVar.d, i2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) " ");
        int i3 = 0;
        for (Object obj : A02) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            spannableStringBuilder2.append((CharSequence) obj);
            if (i3 != scc.f(A02)) {
                spannableStringBuilder2.append((CharSequence) Extension.FIX_SPACE);
            }
            i3 = i4;
        }
        return spannableStringBuilder2;
    }

    public void d0(yi5 yi5Var) {
        auy0 auy0Var = (auy0) this.W;
        List list = yi5Var.d.d;
        CharSequence charSequence = "";
        int i = 3;
        while (true) {
            if (i > 0) {
                charSequence = c0(yi5Var, i, list.size());
                if (auy0Var.e(charSequence)) {
                    break;
                } else {
                    i--;
                }
            } else {
                for (int size = list.size(); size > 0; size--) {
                    charSequence = c0(yi5Var, 1, size);
                    if (auy0Var.e(charSequence)) {
                        break;
                    }
                }
            }
        }
        ((yc30) ((zo31) this.R)).e.setText(charSequence);
        this.a.setContentDescription(yi5Var.f);
    }

    @Override // defpackage.t7u
    public final eiy g() {
        switch (this.S) {
        }
        return this.T;
    }

    @Override // defpackage.t7u
    public final eiy k() {
        switch (this.S) {
        }
        return this.U;
    }

    @Override // defpackage.t7u
    public final epu x() {
        switch (this.S) {
            case 0:
                return this.V;
            default:
                return (dpu) this.V;
        }
    }

    public gj5(f640 f640Var, tls tlsVar) {
        super(f640Var);
        aiy aiyVar = aiy.a;
        this.T = aiyVar;
        this.U = aiyVar;
        this.V = new dpu(f640Var.c, null);
        ButtonComponent buttonComponent = f640Var.b;
        buttonComponent.setDebounceClickListener(new y7x0(22, this, tlsVar));
        b.p(buttonComponent, new ifq0(10, this));
    }
}

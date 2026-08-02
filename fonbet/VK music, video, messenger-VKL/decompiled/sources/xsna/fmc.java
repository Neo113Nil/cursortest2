package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipBannerAdMenuAdapter.kt */
/* loaded from: classes4.dex */
public final class fmc extends zoj0<imc, RecyclerView.e0> {
    public z960 e;
    public WeakReference<VkContextMenu> f;
    public boolean g;
    public boolean h;
    public int i;
    public final Object j;
    public final Object k;
    public final Object l;

    public fmc() {
        a44 a44Var = new a44(5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, a44Var);
        this.k = msy.a(lazyThreadSafetyMode, new de4(5));
        this.l = msy.a(lazyThreadSafetyMode, new ee4(3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    public static void L0(fmc fmcVar, int i, int i2, int i3, int i4, int i5) {
        int intValue = ((Number) fmcVar.j.getValue()).intValue();
        if ((i5 & 16) != 0) {
            i4 = ((Number) fmcVar.k.getValue()).intValue();
        }
        int i6 = i4;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        CharSequence text = context.getText(i2);
        Context context2 = e43.a;
        fmcVar.K0(i, text, m33.a(i3, context2 != null ? context2 : null), intValue, i6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public static void N0(fmc fmcVar, int i, String str, int i2) {
        int intValue = ((Number) fmcVar.j.getValue()).intValue();
        int intValue2 = ((Number) fmcVar.k.getValue()).intValue();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        fmcVar.K0(i, str, m33.a(i2, context), intValue, intValue2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void K0(int i, CharSequence charSequence, Drawable drawable, int i2, int i3) {
        if (this.h) {
            this.i = Math.max(this.i, an10.b(((TextPaint) this.l.getValue()).measureText(charSequence.toString())));
        }
        if (!this.g) {
            x0(new hmc(i, charSequence, false, drawable, i2, i3));
        } else {
            this.g = false;
            x0(new hmc(i, charSequence, true, drawable, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        imc imcVar = (imc) this.c.c(i);
        if (imcVar instanceof hmc) {
            return 1;
        }
        return imcVar != null ? 2 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        imc imcVar = (imc) this.c.c(i);
        if (imcVar == null) {
            return;
        }
        if (!(e0Var instanceof dpv) || !(imcVar instanceof hmc)) {
            if (e0Var instanceof kbo0) {
                ((kbo0) e0Var).V5(imcVar);
            }
        } else {
            dpv dpvVar = (dpv) e0Var;
            dpvVar.q = this.f;
            dpvVar.p = this.e;
            dpvVar.V5(imcVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i != 1 ? i != 2 ? new wfp(viewGroup) : new kbo0(viewGroup) : new dpv(viewGroup);
    }
}

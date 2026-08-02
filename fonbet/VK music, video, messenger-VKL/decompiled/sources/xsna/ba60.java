package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsEntryActionsRedesignAdapter.kt */
/* loaded from: classes4.dex */
public final class ba60 extends zoj0<fb60, RecyclerView.e0> {
    public z960 e;
    public WeakReference<VkContextMenu> f;
    public int g;
    public boolean h;
    public final Object i;
    public boolean j;
    public final Object k;
    public final Object l;

    public ba60() {
        se0 se0Var = new se0(28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, se0Var);
        this.k = msy.a(lazyThreadSafetyMode, new te0(28));
        this.l = msy.a(lazyThreadSafetyMode, new c6(21));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    public static void L0(ba60 ba60Var, int i, int i2, int i3, int i4, int i5) {
        int intValue = ((Number) ba60Var.k.getValue()).intValue();
        if ((i5 & 16) != 0) {
            i4 = ((Number) ba60Var.l.getValue()).intValue();
        }
        int i6 = i4;
        ba60Var.getClass();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        CharSequence text = context.getText(i2);
        Context context2 = e43.a;
        ba60Var.K0(i, text, m33.a(i3, context2 != null ? context2 : null), intValue, i6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public static void N0(ba60 ba60Var, int i, String str, int i2) {
        int intValue = ((Number) ba60Var.k.getValue()).intValue();
        int intValue2 = ((Number) ba60Var.l.getValue()).intValue();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ba60Var.K0(i, str, m33.a(i2, context), intValue, intValue2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void K0(int i, CharSequence charSequence, Drawable drawable, int i2, int i3) {
        if (this.h) {
            this.g = Math.max(this.g, an10.b(((TextPaint) this.i.getValue()).measureText(charSequence.toString())));
        }
        if (!this.j) {
            x0(new ua60(i, charSequence, false, drawable, i2, i3));
        } else {
            this.j = false;
            x0(new ua60(i, charSequence, getItemCount() >= 1, drawable, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (((fb60) this.c.c(i)) != null) {
            return r3.a;
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        fb60 fb60Var = (fb60) this.c.c(i);
        if (fb60Var instanceof ua60) {
            return 1;
        }
        return fb60Var != null ? 2 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        fb60 fb60Var = (fb60) this.c.c(i);
        if (fb60Var == null) {
            return;
        }
        if (!(e0Var instanceof epv) || !(fb60Var instanceof ua60)) {
            if (e0Var instanceof lbo0) {
                ((lbo0) e0Var).V5(fb60Var);
            }
        } else {
            epv epvVar = (epv) e0Var;
            epvVar.q = this.f;
            epvVar.p = this.e;
            epvVar.V5(fb60Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i != 1 ? i != 2 ? new wfp(viewGroup) : new lbo0(viewGroup) : new epv(viewGroup);
    }
}

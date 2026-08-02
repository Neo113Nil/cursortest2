package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.b;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class ame0 extends RecyclerView.Adapter implements yle0 {
    public final PreferenceGroup a;
    public ArrayList b;
    public ArrayList c;
    public final ArrayList w;
    public final ii30 y = new ii30(14, this);
    public final Handler x = new Handler(Looper.getMainLooper());

    public ame0(PreferenceScreen preferenceScreen) {
        this.a = preferenceScreen;
        preferenceScreen.b0 = this;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.w = new ArrayList();
        setHasStableIds(preferenceScreen.o0);
        k();
    }

    public final ArrayList f(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.j0.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            CharSequence charSequence = null;
            if (i >= size) {
                int i3 = preferenceGroup.n0;
                if (i3 != Integer.MAX_VALUE && i2 > i3) {
                    Context context = preferenceGroup.a;
                    long j = preferenceGroup.c;
                    poo pooVar = new poo(context, null);
                    pooVar.Z = nuh0.expand_button;
                    int i4 = h4h0.ic_arrow_down_24dp;
                    Context context2 = pooVar.a;
                    Drawable t = vng.t(i4, context2);
                    if (pooVar.C != t) {
                        pooVar.C = t;
                        pooVar.B = 0;
                        pooVar.i();
                    }
                    pooVar.B = i4;
                    String string = context2.getString(j0i0.expand_button_title);
                    if (!TextUtils.equals(string, pooVar.z)) {
                        pooVar.z = string;
                        pooVar.i();
                    }
                    if (999 != pooVar.y) {
                        pooVar.y = 999;
                        ame0 ame0Var = pooVar.b0;
                        if (ame0Var != null) {
                            Handler handler = ame0Var.x;
                            ii30 ii30Var = ame0Var.y;
                            handler.removeCallbacks(ii30Var);
                            handler.post(ii30Var);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Preference preference = (Preference) it.next();
                        CharSequence charSequence2 = preference.z;
                        boolean z = preference instanceof PreferenceGroup;
                        if (z && !TextUtils.isEmpty(charSequence2)) {
                            arrayList3.add((PreferenceGroup) preference);
                        }
                        if (arrayList3.contains(preference.d0)) {
                            if (z) {
                                arrayList3.add((PreferenceGroup) preference);
                            }
                        } else if (!TextUtils.isEmpty(charSequence2)) {
                            charSequence = charSequence == null ? charSequence2 : context2.getString(j0i0.summary_collapsed_preference_list, charSequence, charSequence2);
                        }
                    }
                    pooVar.x(charSequence);
                    pooVar.i0 = j + 1000000;
                    pooVar.x = new y4a0(21, this, preferenceGroup);
                    arrayList.add(pooVar);
                }
                return arrayList;
            }
            Preference B = preferenceGroup.B(i);
            if (B.P) {
                int i5 = preferenceGroup.n0;
                if (i5 == Integer.MAX_VALUE || i2 < i5) {
                    arrayList.add(B);
                } else {
                    arrayList2.add(B);
                }
                if (B instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) B;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.n0 != Integer.MAX_VALUE && preferenceGroup2.n0 != Integer.MAX_VALUE) {
                            ny61.r("Nesting an expandable group inside of another expandable group is not supported!");
                            return null;
                        }
                        Iterator it2 = f(preferenceGroup2).iterator();
                        while (it2.hasNext()) {
                            Preference preference2 = (Preference) it2.next();
                            int i6 = preferenceGroup.n0;
                            if (i6 == Integer.MAX_VALUE || i2 < i6) {
                                arrayList.add(preference2);
                            } else {
                                arrayList2.add(preference2);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
            i++;
        }
    }

    public final void g(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.j0);
        }
        int size = preferenceGroup.j0.size();
        for (int i = 0; i < size; i++) {
            Preference B = preferenceGroup.B(i);
            arrayList.add(B);
            zle0 zle0Var = new zle0(B);
            if (!this.w.contains(zle0Var)) {
                this.w.add(zle0Var);
            }
            if (B instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) B;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    g(arrayList, preferenceGroup2);
                }
            }
            B.b0 = this;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return h(i).e();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        zle0 zle0Var = new zle0(h(i));
        ArrayList arrayList = this.w;
        int indexOf = arrayList.indexOf(zle0Var);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(zle0Var);
        return size;
    }

    public final Preference h(int i) {
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return (Preference) this.c.get(i);
    }

    public final int i(Preference preference) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = (Preference) this.c.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    public final int j(String str) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((Preference) this.c.get(i)).D)) {
                return i;
            }
        }
        return -1;
    }

    public final void k() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).b0 = null;
        }
        ArrayList arrayList = new ArrayList(this.b.size());
        this.b = arrayList;
        PreferenceGroup preferenceGroup = this.a;
        g(arrayList, preferenceGroup);
        this.c = f(preferenceGroup);
        notifyDataSetChanged();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        jme0 jme0Var = (jme0) x0Var;
        Preference h = h(i);
        ColorStateList colorStateList = jme0Var.O;
        View view = jme0Var.a;
        Drawable background = view.getBackground();
        Drawable drawable = jme0Var.N;
        if (background != drawable) {
            WeakHashMap weakHashMap = b.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) jme0Var.W(R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        h.m(jme0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        zle0 zle0Var = (zle0) this.w.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, n2i0.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(n2i0.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = vng.t(R.drawable.list_selector_background, viewGroup.getContext());
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(zle0Var.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap weakHashMap = b.a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = zle0Var.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new jme0(inflate);
    }
}

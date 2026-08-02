package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import defpackage.ame0;
import defpackage.eme0;
import defpackage.fme0;
import defpackage.fog0;
import defpackage.ii30;
import defpackage.j0i0;
import defpackage.jme0;
import defpackage.mbh0;
import defpackage.mle0;
import defpackage.n2i0;
import defpackage.nuh0;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.uvb1;
import defpackage.vng;
import defpackage.xvz;
import defpackage.y4a0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public class Preference implements Comparable<Preference> {
    public CharSequence A;
    public int B;
    public Drawable C;
    public String D;
    public Intent E;
    public final String F;
    public Bundle G;
    public final boolean H;
    public final boolean I;
    public boolean J;
    public final boolean K;
    public final String L;
    public final Object M;
    public boolean N;
    public boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public int Z;
    public final Context a;
    public final int a0;
    public fme0 b;
    public ame0 b0;
    public long c;
    public ArrayList c0;
    public PreferenceGroup d0;
    public boolean e0;
    public OnPreferenceCopyListener f0;
    public mle0 g0;
    public final View.OnClickListener h0;
    public boolean w;
    public y4a0 x;
    public int y;
    public CharSequence z;

    public static class OnPreferenceCopyListener implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        private final Preference mPreference;

        public OnPreferenceCopyListener(Preference preference) {
            this.mPreference = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence g = this.mPreference.g();
            if (!this.mPreference.V || TextUtils.isEmpty(g)) {
                return;
            }
            contextMenu.setHeaderTitle(g);
            contextMenu.add(0, 0, 0, j0i0.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.mPreference.a.getSystemService("clipboard");
            CharSequence g = this.mPreference.g();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", g));
            Context context = this.mPreference.a;
            Toast.makeText(context, context.getString(j0i0.preference_copied, g), 0).show();
            return true;
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.y = Integer.MAX_VALUE;
        this.H = true;
        this.I = true;
        this.K = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.T = true;
        this.W = true;
        this.Z = nuh0.preference;
        this.h0 = new View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Preference.this.t(view);
            }
        };
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2i0.Preference, i, 0);
        this.B = obtainStyledAttributes.getResourceId(n2i0.Preference_icon, obtainStyledAttributes.getResourceId(n2i0.Preference_android_icon, 0));
        int i2 = n2i0.Preference_key;
        int i3 = n2i0.Preference_android_key;
        String string = obtainStyledAttributes.getString(i2);
        this.D = string == null ? obtainStyledAttributes.getString(i3) : string;
        int i4 = n2i0.Preference_title;
        int i5 = n2i0.Preference_android_title;
        CharSequence text = obtainStyledAttributes.getText(i4);
        this.z = text == null ? obtainStyledAttributes.getText(i5) : text;
        int i6 = n2i0.Preference_summary;
        int i7 = n2i0.Preference_android_summary;
        CharSequence text2 = obtainStyledAttributes.getText(i6);
        this.A = text2 == null ? obtainStyledAttributes.getText(i7) : text2;
        this.y = obtainStyledAttributes.getInt(n2i0.Preference_order, obtainStyledAttributes.getInt(n2i0.Preference_android_order, Integer.MAX_VALUE));
        int i8 = n2i0.Preference_fragment;
        int i9 = n2i0.Preference_android_fragment;
        String string2 = obtainStyledAttributes.getString(i8);
        this.F = string2 == null ? obtainStyledAttributes.getString(i9) : string2;
        this.Z = obtainStyledAttributes.getResourceId(n2i0.Preference_layout, obtainStyledAttributes.getResourceId(n2i0.Preference_android_layout, nuh0.preference));
        this.a0 = obtainStyledAttributes.getResourceId(n2i0.Preference_widgetLayout, obtainStyledAttributes.getResourceId(n2i0.Preference_android_widgetLayout, 0));
        this.H = obtainStyledAttributes.getBoolean(n2i0.Preference_enabled, obtainStyledAttributes.getBoolean(n2i0.Preference_android_enabled, true));
        boolean z = obtainStyledAttributes.getBoolean(n2i0.Preference_selectable, obtainStyledAttributes.getBoolean(n2i0.Preference_android_selectable, true));
        this.I = z;
        this.K = obtainStyledAttributes.getBoolean(n2i0.Preference_persistent, obtainStyledAttributes.getBoolean(n2i0.Preference_android_persistent, true));
        int i10 = n2i0.Preference_dependency;
        int i11 = n2i0.Preference_android_dependency;
        String string3 = obtainStyledAttributes.getString(i10);
        this.L = string3 == null ? obtainStyledAttributes.getString(i11) : string3;
        int i12 = n2i0.Preference_allowDividerAbove;
        this.Q = obtainStyledAttributes.getBoolean(i12, obtainStyledAttributes.getBoolean(i12, z));
        int i13 = n2i0.Preference_allowDividerBelow;
        this.R = obtainStyledAttributes.getBoolean(i13, obtainStyledAttributes.getBoolean(i13, z));
        if (obtainStyledAttributes.hasValue(n2i0.Preference_defaultValue)) {
            this.M = p(obtainStyledAttributes, n2i0.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(n2i0.Preference_android_defaultValue)) {
            this.M = p(obtainStyledAttributes, n2i0.Preference_android_defaultValue);
        }
        this.W = obtainStyledAttributes.getBoolean(n2i0.Preference_shouldDisableView, obtainStyledAttributes.getBoolean(n2i0.Preference_android_shouldDisableView, true));
        boolean hasValue = obtainStyledAttributes.hasValue(n2i0.Preference_singleLineTitle);
        this.S = hasValue;
        if (hasValue) {
            this.T = obtainStyledAttributes.getBoolean(n2i0.Preference_singleLineTitle, obtainStyledAttributes.getBoolean(n2i0.Preference_android_singleLineTitle, true));
        }
        this.U = obtainStyledAttributes.getBoolean(n2i0.Preference_iconSpaceReserved, obtainStyledAttributes.getBoolean(n2i0.Preference_android_iconSpaceReserved, false));
        int i14 = n2i0.Preference_isPreferenceVisible;
        this.P = obtainStyledAttributes.getBoolean(i14, obtainStyledAttributes.getBoolean(i14, true));
        int i15 = n2i0.Preference_enableCopying;
        this.V = obtainStyledAttributes.getBoolean(i15, obtainStyledAttributes.getBoolean(i15, false));
        obtainStyledAttributes.recycle();
    }

    public static void v(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                v(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final boolean a(Object obj) {
        return true;
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.D) || (parcelable = bundle.getParcelable(this.D)) == null) {
            return;
        }
        this.e0 = false;
        q(parcelable);
        if (this.e0) {
            return;
        }
        ny61.r("Derived class did not call super.onRestoreInstanceState()");
    }

    public void c(Bundle bundle) {
        if (TextUtils.isEmpty(this.D)) {
            return;
        }
        this.e0 = false;
        Parcelable r = r();
        if (!this.e0) {
            ny61.r("Derived class did not call super.onSaveInstanceState()");
        } else if (r != null) {
            bundle.putParcelable(this.D, r);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.y;
        int i2 = preference2.y;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.z;
        CharSequence charSequence2 = preference2.z;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.z.toString());
    }

    public final Bundle d() {
        if (this.G == null) {
            this.G = new Bundle();
        }
        return this.G;
    }

    public long e() {
        return this.c;
    }

    public final String f(String str) {
        return !z() ? str : this.b.d().getString(this.D, str);
    }

    public CharSequence g() {
        mle0 mle0Var = this.g0;
        return mle0Var != null ? mle0Var.c(this) : this.A;
    }

    public boolean h() {
        return this.H && this.N && this.O;
    }

    public void i() {
        int indexOf;
        ame0 ame0Var = this.b0;
        if (ame0Var == null || (indexOf = ame0Var.c.indexOf(this)) == -1) {
            return;
        }
        ame0Var.notifyItemChanged(indexOf, this);
    }

    public void j(boolean z) {
        ArrayList arrayList = this.c0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.N == z) {
                preference.N = !z;
                preference.j(preference.y());
                preference.i();
            }
        }
    }

    public void k() {
        PreferenceScreen preferenceScreen;
        String str = this.L;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fme0 fme0Var = this.b;
        Preference preference = null;
        if (fme0Var != null && (preferenceScreen = fme0Var.g) != null) {
            preference = preferenceScreen.A(str);
        }
        if (preference == null) {
            StringBuilder x = unr0.x("Dependency \"", str, "\" not found for preference \"");
            x.append(this.D);
            x.append("\" (title: \"");
            ny61.r(xvz.n(x, this.z, "\""));
            return;
        }
        if (preference.c0 == null) {
            preference.c0 = new ArrayList();
        }
        preference.c0.add(this);
        boolean y = preference.y();
        if (this.N == y) {
            this.N = !y;
            j(y());
            i();
        }
    }

    public final void l(fme0 fme0Var) {
        long j;
        this.b = fme0Var;
        if (!this.w) {
            synchronized (fme0Var) {
                j = fme0Var.b;
                fme0Var.b = 1 + j;
            }
            this.c = j;
        }
        if (z()) {
            fme0 fme0Var2 = this.b;
            if ((fme0Var2 != null ? fme0Var2.d() : null).contains(this.D)) {
                s(null);
                return;
            }
        }
        Object obj = this.M;
        if (obj != null) {
            s(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(jme0 jme0Var) {
        Integer num;
        TextView textView;
        ImageView imageView;
        View W;
        boolean z;
        View view = jme0Var.a;
        view.setOnClickListener(this.h0);
        view.setId(0);
        TextView textView2 = (TextView) jme0Var.W(R.id.summary);
        if (textView2 != null) {
            CharSequence g = g();
            if (!TextUtils.isEmpty(g)) {
                textView2.setText(g);
                textView2.setVisibility(0);
                num = Integer.valueOf(textView2.getCurrentTextColor());
                textView = (TextView) jme0Var.W(R.id.title);
                boolean z2 = this.I;
                if (textView != null) {
                    CharSequence charSequence = this.z;
                    if (TextUtils.isEmpty(charSequence)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(charSequence);
                        textView.setVisibility(0);
                        if (this.S) {
                            textView.setSingleLine(this.T);
                        }
                        if (!z2 && h() && num != null) {
                            textView.setTextColor(num.intValue());
                        }
                    }
                }
                imageView = (ImageView) jme0Var.W(R.id.icon);
                boolean z3 = this.U;
                if (imageView != null) {
                    int i = this.B;
                    if (i != 0 || this.C != null) {
                        if (this.C == null) {
                            this.C = vng.t(i, this.a);
                        }
                        Drawable drawable = this.C;
                        if (drawable != null) {
                            imageView.setImageDrawable(drawable);
                        }
                    }
                    if (this.C != null) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(z3 ? 4 : 8);
                    }
                }
                W = jme0Var.W(mbh0.icon_frame);
                if (W == null) {
                    W = jme0Var.W(R.id.icon_frame);
                }
                if (W != null) {
                    if (this.C != null) {
                        W.setVisibility(0);
                    } else {
                        W.setVisibility(z3 ? 4 : 8);
                    }
                }
                if (this.W) {
                    v(view, true);
                } else {
                    v(view, h());
                }
                view.setFocusable(z2);
                view.setClickable(z2);
                jme0Var.Q = this.Q;
                jme0Var.R = this.R;
                z = this.V;
                if (z && this.f0 == null) {
                    this.f0 = new OnPreferenceCopyListener(this);
                }
                view.setOnCreateContextMenuListener(!z ? this.f0 : null);
                view.setLongClickable(z);
                if (z || z2) {
                }
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                view.setBackground(null);
                return;
            }
            textView2.setVisibility(8);
        }
        num = null;
        textView = (TextView) jme0Var.W(R.id.title);
        boolean z22 = this.I;
        if (textView != null) {
        }
        imageView = (ImageView) jme0Var.W(R.id.icon);
        boolean z32 = this.U;
        if (imageView != null) {
        }
        W = jme0Var.W(mbh0.icon_frame);
        if (W == null) {
        }
        if (W != null) {
        }
        if (this.W) {
        }
        view.setFocusable(z22);
        view.setClickable(z22);
        jme0Var.Q = this.Q;
        jme0Var.R = this.R;
        z = this.V;
        if (z) {
            this.f0 = new OnPreferenceCopyListener(this);
        }
        view.setOnCreateContextMenuListener(!z ? this.f0 : null);
        view.setLongClickable(z);
        if (z) {
        }
    }

    public void n() {
    }

    public void o() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.L;
        if (str != null) {
            fme0 fme0Var = this.b;
            Preference preference = null;
            if (fme0Var != null && (preferenceScreen = fme0Var.g) != null) {
                preference = preferenceScreen.A(str);
            }
            if (preference == null || (arrayList = preference.c0) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Object p(TypedArray typedArray, int i) {
        return null;
    }

    public void q(Parcelable parcelable) {
        this.e0 = true;
        if (parcelable == AbsSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        ny61.g("Wrong state class -- expecting Preference State");
    }

    public Parcelable r() {
        this.e0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void s(Object obj) {
    }

    public void t(View view) {
        Intent intent;
        eme0 eme0Var;
        if (h() && this.I) {
            n();
            y4a0 y4a0Var = this.x;
            if (y4a0Var != null) {
                ((PreferenceGroup) y4a0Var.b).n0 = Integer.MAX_VALUE;
                ame0 ame0Var = (ame0) y4a0Var.c;
                Handler handler = ame0Var.x;
                ii30 ii30Var = ame0Var.y;
                handler.removeCallbacks(ii30Var);
                handler.post(ii30Var);
                return;
            }
            fme0 fme0Var = this.b;
            if ((fme0Var == null || (eme0Var = fme0Var.h) == null || !eme0Var.onPreferenceTreeClick(this)) && (intent = this.E) != null) {
                this.a.startActivity(intent);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.z;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(HexString.CHAR_SPACE);
        }
        CharSequence g = g();
        if (!TextUtils.isEmpty(g)) {
            sb.append(g);
            sb.append(HexString.CHAR_SPACE);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public final void u(String str) {
        if (z() && !TextUtils.equals(str, f(null))) {
            SharedPreferences.Editor c = this.b.c();
            c.putString(this.D, str);
            if (this.b.e) {
                return;
            }
            c.apply();
        }
    }

    public final void w(String str) {
        this.D = str;
        if (this.J && TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.D)) {
                ny61.r("Preference does not have a key assigned.");
            } else {
                this.J = true;
            }
        }
    }

    public void x(CharSequence charSequence) {
        if (this.g0 != null) {
            ny61.r("Preference already has a SummaryProvider set.");
        } else {
            if (TextUtils.equals(this.A, charSequence)) {
                return;
            }
            this.A = charSequence;
            i();
        }
    }

    public boolean y() {
        return !h();
    }

    public final boolean z() {
        return (this.b == null || !this.K || TextUtils.isEmpty(this.D)) ? false : true;
    }

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new Parcelable.Creator<BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        };

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, uvb1.b(context, fog0.preferenceStyle, R.attr.preferenceStyle));
    }
}

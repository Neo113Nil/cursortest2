package xsna;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class u33 {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final dpj0<String, Constructor<? extends View>> h = new dpj0<>();
    public final Object[] a = new Object[2];

    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: classes11.dex */
    public static class a implements View.OnClickListener {
        public final View b;
        public final String c;
        public Method d;
        public Context e;

        public a(@NonNull View view, @NonNull String str) {
            this.b = view;
            this.c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            String str;
            Method method;
            if (this.d == null) {
                View view2 = this.b;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.c;
                    if (context == null) {
                        int id = view2.getId();
                        if (id == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        StringBuilder a = t33.a("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        a.append(view2.getClass());
                        a.append(str);
                        throw new IllegalStateException(a.toString());
                    }
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.d = method;
                            this.e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
            }
            try {
                this.d.invoke(this.e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    @NonNull
    public e23 a(Context context, AttributeSet attributeSet) {
        return new e23(context, attributeSet);
    }

    @NonNull
    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @NonNull
    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @NonNull
    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @NonNull
    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final View f(@NonNull Context context, @Nullable View view, @NonNull String str, @NonNull AttributeSet attributeSet) {
        char c2;
        View k33Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.y, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(48, 0);
        obtainStyledAttributes.recycle();
        Context lpjVar = (resourceId == 0 || ((context instanceof lpj) && ((lpj) context).getThemeResId() == resourceId)) ? context : new lpj(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        View view2 = null;
        switch (c2) {
            case 0:
                k33Var = new k33(lpjVar, attributeSet);
                break;
            case 1:
                k33Var = new h23(lpjVar, attributeSet);
                break;
            case 2:
                k33Var = new h33(lpjVar, attributeSet);
                break;
            case 3:
                k33Var = e(lpjVar, attributeSet);
                break;
            case 4:
                k33Var = new AppCompatImageButton(lpjVar, attributeSet);
                break;
            case 5:
                k33Var = new AppCompatSeekBar(lpjVar, attributeSet);
                break;
            case 6:
                k33Var = new AppCompatSpinner(lpjVar, attributeSet);
                break;
            case 7:
                k33Var = d(lpjVar, attributeSet);
                break;
            case '\b':
                k33Var = new s33(lpjVar, attributeSet);
                break;
            case '\t':
                k33Var = new AppCompatImageView(lpjVar, attributeSet);
                break;
            case '\n':
                k33Var = a(lpjVar, attributeSet);
                break;
            case 11:
                k33Var = c(lpjVar, attributeSet);
                break;
            case '\f':
                k33Var = new AppCompatEditText(lpjVar, attributeSet);
                break;
            case '\r':
                k33Var = b(lpjVar, attributeSet);
                break;
            default:
                k33Var = null;
                break;
        }
        if (k33Var == null && context != lpjVar) {
            Object[] objArr = this.a;
            if (str.equals(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = lpjVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = g;
                        if (i < 3) {
                            View g2 = g(lpjVar, str, strArr[i]);
                            if (g2 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = g2;
                            } else {
                                i++;
                            }
                        }
                    }
                } else {
                    View g3 = g(lpjVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = g3;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            k33Var = view2;
        }
        if (k33Var != null) {
            Context context2 = k33Var.getContext();
            if ((context2 instanceof ContextWrapper) && k33Var.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, c);
                String string = obtainStyledAttributes2.getString(0);
                if (string != null) {
                    k33Var.setOnClickListener(new a(k33Var, string));
                }
                obtainStyledAttributes2.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = lpjVar.obtainStyledAttributes(attributeSet, d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    boolean z = obtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    new hut0().d(k33Var, Boolean.valueOf(z));
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = lpjVar.obtainStyledAttributes(attributeSet, e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    iut0.r(k33Var, obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = lpjVar.obtainStyledAttributes(attributeSet, f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    new eut0().d(k33Var, Boolean.valueOf(z2));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return k33Var;
    }

    public final View g(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String concat;
        dpj0<String, Constructor<? extends View>> dpj0Var = h;
        Constructor<? extends View> constructor = dpj0Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            dpj0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.a);
    }
}

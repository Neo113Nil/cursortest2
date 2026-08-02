package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.n4i0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.ycs0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final String[] d = {"android.widget.", "android.view.", "android.webkit."};
    public static final ycs0 e = new ycs0();
    public final Object[] a = new Object[2];

    /* loaded from: classes10.dex */
    public static class DeclaredOnClickListener implements View.OnClickListener {
        private final View mHostView;
        private final String mMethodName;
        private Context mResolvedContext;
        private Method mResolvedMethod;

        public DeclaredOnClickListener(View view, String str) {
            this.mHostView = view;
            this.mMethodName = str;
        }

        private void resolveMethod(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.mMethodName, View.class)) != null) {
                        this.mResolvedMethod = method;
                        this.mResolvedContext = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.mHostView.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.mHostView.getContext().getResources().getResourceEntryName(id) + "'";
            }
            w511.m("Could not find method ", this.mMethodName, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ", this.mHostView.getClass(), str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.mResolvedMethod == null) {
                resolveMethod(this.mHostView.getContext());
            }
            try {
                this.mResolvedMethod.invoke(this.mResolvedContext, view);
            } catch (IllegalAccessException e) {
                ny61.h("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                ny61.h("Could not execute method for android:onClick", e2);
            }
        }
    }

    public AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final View f(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        char c2;
        View appCompatRatingBar;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, n4i0.View, 0, 0);
            int resourceId = z2 ? obtainStyledAttributes.getResourceId(n4i0.View_android_theme, 0) : 0;
            if (z3 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(n4i0.View_theme, 0)) != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
            obtainStyledAttributes.recycle();
            if (resourceId != 0 && (!(context2 instanceof ContextThemeWrapper) || ((ContextThemeWrapper) context2).getThemeResId() != resourceId)) {
                context2 = new ContextThemeWrapper(context2, resourceId);
            }
        }
        if (z4) {
            context2 = TintContextWrapper.wrap(context2);
        }
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
                if (str.equals(PlusPayUiKitInflaterFactory.NAME_BUTTON)) {
                    c2 = HexString.LF;
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
                appCompatRatingBar = new AppCompatRatingBar(context2, attributeSet);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(context2, attributeSet);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case 3:
                appCompatRatingBar = e(context2, attributeSet);
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(context2, attributeSet);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(context2, attributeSet);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(context2, attributeSet);
                break;
            case 7:
                appCompatRatingBar = d(context2, attributeSet);
                break;
            case '\b':
                appCompatRatingBar = new AppCompatToggleButton(context2, attributeSet);
                break;
            case '\t':
                appCompatRatingBar = new AppCompatImageView(context2, attributeSet);
                break;
            case '\n':
                appCompatRatingBar = a(context2, attributeSet);
                break;
            case 11:
                appCompatRatingBar = c(context2, attributeSet);
                break;
            case '\f':
                appCompatRatingBar = new AppCompatEditText(context2, attributeSet);
                break;
            case '\r':
                appCompatRatingBar = b(context2, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != context2) {
            Object[] objArr = this.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = context2;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = d;
                        if (i < 3) {
                            View g = g(context2, str, strArr[i]);
                            if (g != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = g;
                            } else {
                                i++;
                            }
                        }
                    }
                } else {
                    View g2 = g(context2, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = g2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context3 = appCompatRatingBar.getContext();
            if ((context3 instanceof ContextWrapper) && appCompatRatingBar.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, c);
                String string = obtainStyledAttributes2.getString(0);
                if (string != null) {
                    appCompatRatingBar.setOnClickListener(new DeclaredOnClickListener(appCompatRatingBar, string));
                }
                obtainStyledAttributes2.recycle();
            }
        }
        return appCompatRatingBar;
    }

    public final View g(Context context, String str, String str2) {
        String concat;
        ycs0 ycs0Var = e;
        Constructor constructor = (Constructor) ycs0Var.get(str);
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
            ycs0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}

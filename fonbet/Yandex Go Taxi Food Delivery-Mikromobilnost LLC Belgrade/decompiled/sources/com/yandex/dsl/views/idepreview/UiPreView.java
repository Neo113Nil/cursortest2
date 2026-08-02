package com.yandex.dsl.views.idepreview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.d9;
import defpackage.evu0;
import defpackage.fse;
import defpackage.g3i0;
import defpackage.g73;
import defpackage.gea1;
import defpackage.hrv;
import defpackage.irv;
import defpackage.it11;
import defpackage.j73;
import defpackage.jh91;
import defpackage.jl40;
import defpackage.md00;
import defpackage.ms11;
import defpackage.ny61;
import defpackage.nyv;
import defpackage.rxu0;
import defpackage.scc;
import defpackage.tls;
import defpackage.txh0;
import defpackage.w511;
import defpackage.xmg0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/dsl/views/idepreview/UiPreView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "styleRes", "Lkotlin/Function1;", "Lms11;", "Landroid/view/View;", "createUi", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILtls;)V", "Lzy11;", "init", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "core-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class UiPreView extends FrameLayout {
    public UiPreView(Context context, AttributeSet attributeSet, int i, int i2, tls tlsVar) {
        super(context, attributeSet, i);
        int color;
        Context context2 = getContext();
        if (md00.a == Thread.currentThread()) {
            Resources.Theme theme = context2.getTheme();
            TypedValue typedValue = rxu0.a;
            if (!theme.resolveAttribute(R.attr.colorBackground, typedValue, true)) {
                throw new Resources.NotFoundException("Couldn't resolve attribute resource #0x" + ((Object) Integer.toHexString(R.attr.colorBackground)) + " from the theme of this Context.");
            }
            int i3 = typedValue.type;
            if (28 <= i3 && i3 <= 31) {
                color = typedValue.data;
            } else {
                if (i3 != 3 || !evu0.b0(typedValue.string, "res/color/")) {
                    gea1.d(rxu0.a(typedValue));
                    throw null;
                }
                color = context2.getColor(typedValue.resourceId);
            }
        } else {
            TypedValue typedValue2 = rxu0.b;
            synchronized (typedValue2) {
                try {
                    if (!context2.getTheme().resolveAttribute(R.attr.colorBackground, typedValue2, true)) {
                        throw new Resources.NotFoundException("Couldn't resolve attribute resource #0x" + ((Object) Integer.toHexString(R.attr.colorBackground)) + " from the theme of this Context.");
                    }
                    int i4 = typedValue2.type;
                    if (28 <= i4 && i4 <= 31) {
                        color = typedValue2.data;
                    } else {
                        if (i4 != 3 || !evu0.b0(typedValue2.string, "res/color/")) {
                            gea1.d(rxu0.a(typedValue2));
                            throw null;
                        }
                        color = context2.getColor(typedValue2.resourceId);
                    }
                } finally {
                }
            }
        }
        setBackgroundColor(color);
        if (!isInEditMode()) {
            ny61.g("Only intended for use in IDE!");
            throw null;
        }
        try {
            if (tlsVar == null) {
                init(getContext(), attributeSet, i);
                return;
            }
            View root = ((ms11) tlsVar.invoke(jh91.e(i2, getContext()))).getRoot();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = -1;
            addView(root, layoutParams);
        } catch (IllegalArgumentException e) {
            setBackgroundColor(-1);
            View root2 = new nyv(context, e).getRoot();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = -1;
            addView(root2, layoutParams2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0106, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void init(Context context, AttributeSet attrs, int defStyleAttr) {
        Class<?> cls;
        Constructor<?> constructor;
        ms11 ms11Var;
        int i = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g3i0.UiPreView, defStyleAttr, 0);
        String string = obtainStyledAttributes.getString(g3i0.UiPreView_class_fully_qualified_name);
        if (string != null) {
            try {
                cls = Class.forName(string);
            } catch (ClassNotFoundException unused) {
                gea1.d("Did not find the specified class: ".concat(string));
                throw null;
            }
        } else {
            String string2 = obtainStyledAttributes.getString(g3i0.UiPreView_class_package_name_relative);
            if (string2 == null) {
                gea1.d("No class name attribute provided");
                throw null;
            }
            String S = evu0.S(getContext().getResources().getString(txh0.ui_preview_package_name_suffix), context.getPackageName());
            try {
                cls = Class.forName(S + '.' + string2);
            } catch (ClassNotFoundException unused2) {
                String[] stringArray = context.getResources().getStringArray(xmg0.ui_preview_base_package_names);
                Class<?> cls2 = null;
                for (String str : stringArray) {
                    if (cls2 == null) {
                        try {
                            cls2 = Class.forName(str + '.' + string2);
                        } catch (ClassNotFoundException unused3) {
                            cls2 = null;
                        }
                    }
                }
                if (cls2 == null) {
                    gea1.d("Package-name relative class \"" + string2 + "\" not found!\nDid you make a typo?\n\nSearched in the following root packages:\n- " + S + '\n' + j73.L(stringArray, "\n", "- ", null, 60));
                    throw null;
                }
                cls = cls2;
            }
        }
        obtainStyledAttributes.recycle();
        if (cls.isInterface()) {
            w511.g(cls, " is not instantiable because it's an interface!");
            return;
        }
        if (!ms11.class.isAssignableFrom(cls)) {
            w511.g(cls, " is not a subclass of Ui!");
            return;
        }
        try {
            ms11Var = (ms11) cls.getConstructor(Context.class).newInstance(context);
        } catch (NoSuchMethodException unused4) {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i2 = 0;
            loop0: while (true) {
                if (i2 >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i2];
                Iterable g73Var = new g73(1, new d9(19, constructor.getParameterTypes()));
                if ((g73Var instanceof Collection) && ((Collection) g73Var).isEmpty()) {
                    break;
                }
                Iterator it = g73Var.iterator();
                while (true) {
                    irv irvVar = (irv) it;
                    if (!irvVar.c.hasNext()) {
                        break loop0;
                    }
                    hrv hrvVar = (hrv) irvVar.next();
                    int i3 = hrvVar.a;
                    Class cls3 = (Class) hrvVar.b;
                    if (i3 != 0 || !jl40.l(cls3, Context.class)) {
                        if (cls3.isInterface()) {
                        }
                    }
                }
            }
            if (constructor == null) {
                gea1.d("No suitable constructor found. Need one with Context as first parameter, and only interface types for other parameters, if any.");
                throw null;
            }
            ArrayList i4 = scc.i(context);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length2) {
                Class<?> cls4 = parameterTypes[i5];
                int i7 = i6 + 1;
                if (i6 != 0) {
                    i4.add(jl40.l(cls4, fse.class) ? EmptyCoroutineContext.a : Proxy.newProxyInstance(cls4.getClassLoader(), new Class[]{cls4}, new it11(i)));
                }
                i5++;
                i6 = i7;
            }
            Object[] array = i4.toArray(new Object[0]);
            ms11Var = (ms11) constructor.newInstance(Arrays.copyOf(array, array.length));
        }
        View root = ms11Var.getRoot();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = -1;
        addView(root, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object init$lambda$13$lambda$12$lambda$11(Object obj, Method method, Object[] objArr) {
        if (method.getDeclaringClass().getName().equals("kotlinx.coroutines.CoroutineScope")) {
            return EmptyCoroutineContext.a;
        }
        w511.x("Edit mode: stub implementation.");
        return null;
    }

    public UiPreView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28, null);
    }

    public UiPreView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, null, 24, null);
    }

    public UiPreView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null, 16, null);
    }

    public /* synthetic */ UiPreView(Context context, AttributeSet attributeSet, int i, int i2, tls tlsVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : tlsVar);
    }

    public UiPreView(Context context) {
        this(context, null, 0, 0, null, 30, null);
    }
}

package com.lightside.visum.idepreview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.passport.lightside.visum.a;
import com.yandex.passport.lightside.visum.b;
import com.yandex.passport.lightside.visum.c;
import defpackage.d9;
import defpackage.evu0;
import defpackage.fse;
import defpackage.g73;
import defpackage.hrv;
import defpackage.irv;
import defpackage.it11;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jt11;
import defpackage.kzy0;
import defpackage.nea1;
import defpackage.ny61;
import defpackage.rs11;
import defpackage.scc;
import defpackage.tls;
import defpackage.w511;
import defpackage.wj91;
import defpackage.xuj0;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/lightside/visum/idepreview/UiPreView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "styleRes", "Lkotlin/Function1;", "Lrs11;", "Landroid/view/View;", "createUi", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILtls;)V", "Lzy11;", "init", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visum_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public class UiPreView extends FrameLayout {
    public UiPreView(Context context, AttributeSet attributeSet, int i, int i2, tls tlsVar) {
        super(context, attributeSet, i);
        int color;
        Context context2 = getContext();
        TypedValue typedValue = xuj0.a;
        if (kzy0.a == Thread.currentThread()) {
            Resources.Theme theme = context2.getTheme();
            TypedValue typedValue2 = xuj0.a;
            if (!theme.resolveAttribute(R.attr.colorBackground, typedValue2, true)) {
                throw new Resources.NotFoundException("Couldn't resolve attribute resource #0x" + Integer.toHexString(R.attr.colorBackground) + " from the theme of this Context.");
            }
            int i3 = typedValue2.type;
            if (28 <= i3 && i3 < 32) {
                color = typedValue2.data;
            } else {
                if (i3 != 3 || !evu0.b0(typedValue2.string, "res/color/")) {
                    nea1.b(xuj0.a(typedValue2));
                    throw null;
                }
                color = context2.getColor(typedValue2.resourceId);
            }
        } else {
            TypedValue typedValue3 = xuj0.b;
            synchronized (typedValue3) {
                try {
                    if (!context2.getTheme().resolveAttribute(R.attr.colorBackground, typedValue3, true)) {
                        throw new Resources.NotFoundException("Couldn't resolve attribute resource #0x" + Integer.toHexString(R.attr.colorBackground) + " from the theme of this Context.");
                    }
                    int i4 = typedValue3.type;
                    if (28 <= i4 && i4 < 32) {
                        color = typedValue3.data;
                    } else {
                        if (i4 != 3 || !evu0.b0(typedValue3.string, "res/color/")) {
                            nea1.b(xuj0.a(typedValue3));
                            throw null;
                        }
                        color = context2.getColor(typedValue3.resourceId);
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
            View root = ((rs11) tlsVar.invoke(wj91.e(i2, getContext()))).getRoot();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = -1;
            addView(root, layoutParams);
        } catch (IllegalArgumentException e) {
            setBackgroundColor(-1);
            View root2 = new jt11(context, 0, e).getRoot();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = -1;
            addView(root2, layoutParams2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void init(Context context, AttributeSet attrs, int defStyleAttr) {
        Class<?> cls;
        int i;
        Constructor<?> constructor;
        rs11 rs11Var;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, c.UiPreView, defStyleAttr, 0);
        String string = obtainStyledAttributes.getString(c.UiPreView_class_fully_qualified_name);
        if (string != null) {
            try {
                cls = Class.forName(string);
            } catch (ClassNotFoundException unused) {
                nea1.b("Did not find the specified class: ".concat(string));
                throw null;
            }
        } else {
            String string2 = obtainStyledAttributes.getString(c.UiPreView_class_package_name_relative);
            if (string2 == null) {
                nea1.b("No class name attribute provided");
                throw null;
            }
            String S = evu0.S(getContext().getResources().getString(b.ui_preview_package_name_suffix), context.getPackageName());
            try {
                cls = Class.forName(S + '.' + string2);
            } catch (ClassNotFoundException unused2) {
                String[] stringArray = context.getResources().getStringArray(a.ui_preview_base_package_names);
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
                    nea1.b("Package-name relative class \"" + string2 + "\" not found!\nDid you make a typo?\n\nSearched in the following root packages:\n- " + S + '\n' + j73.L(stringArray, "\n", "- ", null, 60));
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
        if (!rs11.class.isAssignableFrom(cls)) {
            w511.g(cls, " is not a subclass of Ui!");
            return;
        }
        try {
            rs11Var = (rs11) cls.getConstructor(Context.class).newInstance(context);
        } catch (NoSuchMethodException unused4) {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i2 = 0;
            loop0: while (true) {
                i = 1;
                if (i2 >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i2];
                Iterable g73Var = new g73(i, new d9(19, constructor.getParameterTypes()));
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
                nea1.b("No suitable constructor found. Need one with Context as first parameter, and only interface types for other parameters, if any.");
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
            rs11Var = (rs11) constructor.newInstance(Arrays.copyOf(array, array.length));
        }
        View root = rs11Var.getRoot();
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

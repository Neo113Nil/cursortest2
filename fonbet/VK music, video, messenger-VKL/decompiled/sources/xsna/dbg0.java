package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import xsna.dbg0;
import xsna.p5s;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class dbg0 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<b, SparseArray<a>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* compiled from: ResourcesCompat.java */
    public static class a {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static final class b {
        public final Resources a;
        public final Resources.Theme b;

        public b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.a.equals(bVar.a) && Objects.equals(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static abstract class c {
        public final void a(final int i) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: xsna.fbg0
                @Override // java.lang.Runnable
                public final void run() {
                    dbg0.c.this.b(i);
                }
            });
        }

        public abstract void b(int i);

        public abstract void c(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes11.dex */
    public static final class d {

        /* compiled from: ResourcesCompat.java */
        public static class a {
            public static final Object a = new Object();
            public static Method b;
            public static boolean c;
        }

        /* compiled from: ResourcesCompat.java */
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
                return;
            }
            synchronized (a.a) {
                if (!a.c) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                        a.b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    a.c = true;
                }
                Method method = a.b;
                if (method != null) {
                    try {
                        method.invoke(theme, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        a.b = null;
                    }
                }
            }
        }
    }

    public static Typeface a(int i, Context context) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, c cVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            m900<String, Typeface> m900Var = aup0.b;
            Typeface typeface2 = m900Var.get(aup0.b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (cVar != null) {
                    new Handler(Looper.getMainLooper()).post(new ebg0(cVar, typeface2));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        p5s.a a2 = p5s.a(resources.getXml(i), resources);
                        if (a2 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (cVar != null) {
                                cVar.a(-3);
                            }
                        } else {
                            typeface = aup0.a(context, a2, resources, i, charSequence2, typedValue.assetCookie, i2, cVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface d2 = aup0.a.d(context, resources, i, charSequence2, i2);
                        if (d2 != null) {
                            m900Var.put(aup0.b(resources, i, charSequence2, i4, i2), d2);
                        }
                        if (cVar != null) {
                            if (d2 != null) {
                                new Handler(Looper.getMainLooper()).post(new ebg0(cVar, d2));
                            } else {
                                cVar.a(-3);
                            }
                        }
                        typeface = d2;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (cVar != null) {
                        cVar.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (cVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (cVar != null) {
            cVar.a(-3);
        }
        if (typeface == null || cVar != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}

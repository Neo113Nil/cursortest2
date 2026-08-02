package xsna;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.d6s;
import xsna.hup0;
import xsna.p5s;

/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes11.dex */
public class dup0 extends bup0 {
    public final Class<?> f;
    public final Constructor<?> g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public dup0() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = j(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = k(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f = cls;
        this.g = constructor;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = method5;
        this.l = method;
    }

    public static Method j(Class cls) throws NoSuchMethodException {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // xsna.bup0, xsna.hup0
    public final Typeface a(Context context, p5s.b bVar, Resources resources, int i) {
        Object obj;
        if (this.h == null) {
            return super.a(context, bVar, resources, i);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            p5s.c[] cVarArr = bVar.a;
            int length = cVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    p5s.c cVar = cVarArr[i2];
                    Context context2 = context;
                    if (g(context2, obj, cVar.a, cVar.e, cVar.b, cVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d))) {
                        i2++;
                        context = context2;
                    } else {
                        try {
                            this.k.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (i(obj)) {
                    return h(obj);
                }
            }
        }
        return null;
    }

    @Override // xsna.hup0
    public final Typeface b(Context context, d6s.b[] bVarArr, int i) {
        Object obj;
        Typeface h;
        boolean z;
        if (bVarArr.length >= 1) {
            try {
                if (this.h != null) {
                    HashMap hashMap = new HashMap();
                    for (d6s.b bVar : bVarArr) {
                        if (bVar.f == 0) {
                            Uri uri = bVar.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, iup0.d(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = bVarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method = this.k;
                            if (i2 < length) {
                                d6s.b bVar2 = bVarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(bVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.i.invoke(obj, byteBuffer, Integer.valueOf(bVar2.b), null, Integer.valueOf(bVar2.c), Integer.valueOf(bVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method.invoke(obj, null);
                            } else if (i(obj) && (h = h(obj)) != null) {
                                return Typeface.create(h, i);
                            }
                        }
                    }
                } else {
                    hup0.a aVar = new hup0.a();
                    int i3 = (i & 1) == 0 ? 400 : IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                    boolean z3 = (i & 2) != 0;
                    d6s.b bVar3 = null;
                    int i4 = Integer.MAX_VALUE;
                    for (d6s.b bVar4 : bVarArr) {
                        int abs = (Math.abs(aVar.a(bVar4) - i3) * 2) + (aVar.b(bVar4) == z3 ? 0 : 1);
                        if (bVar3 == null || i4 > abs) {
                            bVar3 = bVar4;
                            i4 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(bVar3.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(bVar3.c).setItalic(bVar3.d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // xsna.hup0
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (this.h == null) {
            return super.d(context, resources, i, str, i2);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!g(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.k.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (i(obj)) {
                return h(obj);
            }
        }
        return null;
    }

    public final boolean g(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface h(Object obj) {
        throw null;
    }

    public final boolean i(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method k(Class<?> cls) throws NoSuchMethodException {
        throw null;
    }
}

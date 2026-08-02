package xsna;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.soloader.nativeloader.NativeLoader;
import com.facebook.soloader.nativeloader.SystemDelegate;
import java.lang.reflect.InvocationTargetException;
import xsna.tkw;

/* compiled from: Fresco.java */
/* loaded from: classes.dex */
public final class vgs {
    public static mpa0 a = null;
    public static volatile boolean b = false;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (xsna.lhs.d() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        xsna.lhs.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (xsna.lhs.d() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (xsna.lhs.d() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (xsna.lhs.d() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
    
        if (xsna.lhs.d() == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, tkw tkwVar, clo cloVar) {
        if (lhs.d()) {
            lhs.a("Fresco#initialize");
        }
        if (!b) {
            b = true;
        } else if (ahq.a.a(5)) {
            bhq.b(5, vgs.class.getSimpleName(), "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        }
        if (!NativeLoader.isInitialized()) {
            if (lhs.d()) {
                lhs.a("Fresco.initialize->SoLoader.init");
            }
            try {
                try {
                    try {
                        try {
                            Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                        } catch (InvocationTargetException unused) {
                            NativeLoader.initIfUninitialized(new SystemDelegate());
                        }
                    } catch (IllegalAccessException unused2) {
                        NativeLoader.initIfUninitialized(new SystemDelegate());
                    }
                } catch (ClassNotFoundException unused3) {
                    NativeLoader.initIfUninitialized(new SystemDelegate());
                } catch (NoSuchMethodException unused4) {
                    NativeLoader.initIfUninitialized(new SystemDelegate());
                }
            } catch (Throwable th) {
                if (lhs.d()) {
                    lhs.b();
                }
                throw th;
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (tkwVar == null) {
            synchronized (wkw.class) {
                try {
                    if (lhs.d()) {
                        lhs.a("ImagePipelineFactory#initialize");
                    }
                    wkw.i(new tkw(new tkw.a(applicationContext)));
                    if (lhs.d()) {
                        lhs.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            wkw.i(tkwVar);
        }
        if (lhs.d()) {
            lhs.a("Fresco.initializeDrawee");
        }
        mpa0 mpa0Var = new mpa0(applicationContext, cloVar);
        a = mpa0Var;
        SimpleDraweeView.j = mpa0Var;
        if (lhs.d()) {
            lhs.b();
        }
        if (lhs.d()) {
            lhs.b();
        }
    }
}

package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.au8;
import xsna.b020;
import xsna.bme0;
import xsna.bx3;
import xsna.cbg0;
import xsna.cfq0;
import xsna.cu8;
import xsna.dz10;
import xsna.e9r;
import xsna.ez10;
import xsna.ges0;
import xsna.gqm0;
import xsna.jfq0;
import xsna.leq0;
import xsna.mjv;
import xsna.pzm;
import xsna.qt8;
import xsna.rk2;
import xsna.w3q0;
import xsna.wag0;
import xsna.yvk;

/* compiled from: RegistryFactory.java */
/* loaded from: classes12.dex */
public final class orf0 {
    public static Registry a(com.bumptech.glide.a aVar, ArrayList arrayList) {
        mag0 yt8Var;
        mag0 cVar;
        tc7 tc7Var = aVar.b;
        cl3 cl3Var = aVar.e;
        com.bumptech.glide.c cVar2 = aVar.d;
        Context applicationContext = cVar2.getApplicationContext();
        a1u a1uVar = cVar2.g;
        Registry registry = new Registry();
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        rob robVar = registry.g;
        synchronized (robVar) {
            ((ArrayList) robVar.b).add(defaultImageHeaderParser);
        }
        int i = Build.VERSION.SDK_INT;
        q4q q4qVar = new q4q();
        rob robVar2 = registry.g;
        synchronized (robVar2) {
            ((ArrayList) robVar2.b).add(q4qVar);
        }
        Resources resources = applicationContext.getResources();
        ArrayList e = registry.e();
        bu8 bu8Var = new bu8(applicationContext, e, tc7Var, cl3Var);
        ges0 ges0Var = new ges0(tc7Var, new ges0.g());
        com.bumptech.glide.load.resource.bitmap.a aVar2 = new com.bumptech.glide.load.resource.bitmap.a(registry.e(), resources.getDisplayMetrics(), tc7Var, cl3Var);
        if (a1uVar.a.containsKey(x0u.class)) {
            cVar = new h3x();
            yt8Var = new zt8();
        } else {
            yt8Var = new yt8(aVar2);
            cVar = new com.bumptech.glide.load.resource.bitmap.c(aVar2, cl3Var);
        }
        registry.d("Animation", InputStream.class, Drawable.class, new rk2.c(new rk2(e, cl3Var)));
        registry.d("Animation", ByteBuffer.class, Drawable.class, new rk2.b(new rk2(e, cl3Var)));
        oag0 oag0Var = new oag0(applicationContext);
        yb7 yb7Var = new yb7(cl3Var);
        ob7 ob7Var = new ob7();
        xo9 xo9Var = new xo9();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry.b(ByteBuffer.class, new m200());
        registry.b(InputStream.class, new som0(cl3Var));
        registry.d("Bitmap", ByteBuffer.class, Bitmap.class, yt8Var);
        registry.d("Bitmap", InputStream.class, Bitmap.class, cVar);
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new hi90(aVar2));
        }
        registry.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new ges0(tc7Var, new ges0.c()));
        registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, ges0Var);
        w3q0.a<?> aVar3 = w3q0.a.a;
        registry.a(Bitmap.class, Bitmap.class, aVar3);
        registry.d("Bitmap", Bitmap.class, Bitmap.class, new t3q0());
        registry.c(Bitmap.class, yb7Var);
        registry.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ub7(resources, yt8Var));
        registry.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ub7(resources, cVar));
        registry.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new ub7(resources, ges0Var));
        registry.c(BitmapDrawable.class, new vb7(tc7Var, yb7Var));
        registry.d("Animation", InputStream.class, gyt.class, new uom0(e, bu8Var, cl3Var));
        registry.d("Animation", ByteBuffer.class, gyt.class, bu8Var);
        registry.c(gyt.class, new sp(5));
        registry.a(fyt.class, fyt.class, aVar3);
        registry.d("Bitmap", fyt.class, Bitmap.class, new lyt(tc7Var));
        registry.d("legacy_append", Uri.class, Drawable.class, oag0Var);
        registry.d("legacy_append", Uri.class, Bitmap.class, new iag0(oag0Var, tc7Var));
        registry.h(new cu8.a());
        registry.a(File.class, ByteBuffer.class, new au8.b());
        registry.a(File.class, InputStream.class, new e9r.e(new g9r()));
        registry.d("legacy_append", File.class, File.class, new i8r());
        registry.a(File.class, ParcelFileDescriptor.class, new e9r.b(new f9r()));
        registry.a(File.class, File.class, aVar3);
        registry.h(new c.a(cl3Var));
        if (!"robolectric".equals(str)) {
            registry.h(new ParcelFileDescriptorRewinder.a());
        }
        pzm.c cVar3 = new pzm.c(applicationContext);
        pzm.a aVar4 = new pzm.a(applicationContext);
        pzm.b bVar = new pzm.b(applicationContext);
        Class cls = Integer.TYPE;
        registry.a(cls, InputStream.class, cVar3);
        registry.a(Integer.class, InputStream.class, cVar3);
        registry.a(cls, AssetFileDescriptor.class, aVar4);
        registry.a(Integer.class, AssetFileDescriptor.class, aVar4);
        registry.a(cls, Drawable.class, bVar);
        registry.a(Integer.class, Drawable.class, bVar);
        registry.a(Uri.class, InputStream.class, new cbg0.b(applicationContext));
        registry.a(Uri.class, AssetFileDescriptor.class, new cbg0.a(applicationContext));
        wag0.c cVar4 = new wag0.c(resources);
        wag0.a aVar5 = new wag0.a(resources);
        wag0.b bVar2 = new wag0.b(resources);
        registry.a(Integer.class, Uri.class, cVar4);
        registry.a(cls, Uri.class, cVar4);
        registry.a(Integer.class, AssetFileDescriptor.class, aVar5);
        registry.a(cls, AssetFileDescriptor.class, aVar5);
        registry.a(Integer.class, InputStream.class, bVar2);
        registry.a(cls, InputStream.class, bVar2);
        registry.a(String.class, InputStream.class, new yvk.b());
        registry.a(Uri.class, InputStream.class, new yvk.b());
        registry.a(String.class, InputStream.class, new gqm0.c());
        registry.a(String.class, ParcelFileDescriptor.class, new gqm0.b());
        registry.a(String.class, AssetFileDescriptor.class, new gqm0.a());
        registry.a(Uri.class, InputStream.class, new bx3.c(applicationContext.getAssets()));
        registry.a(Uri.class, AssetFileDescriptor.class, new bx3.b(applicationContext.getAssets()));
        registry.a(Uri.class, InputStream.class, new ez10.a(applicationContext));
        registry.a(Uri.class, InputStream.class, new b020.a(applicationContext));
        if (i >= 29) {
            registry.a(Uri.class, InputStream.class, new bme0.c(applicationContext, InputStream.class));
            registry.a(Uri.class, ParcelFileDescriptor.class, new bme0.b(applicationContext, ParcelFileDescriptor.class));
        }
        registry.a(Uri.class, InputStream.class, new leq0.d(contentResolver));
        registry.a(Uri.class, ParcelFileDescriptor.class, new leq0.b(contentResolver));
        registry.a(Uri.class, AssetFileDescriptor.class, new leq0.a(contentResolver));
        registry.a(Uri.class, InputStream.class, new jfq0.a());
        registry.a(URL.class, InputStream.class, new cfq0.a());
        registry.a(Uri.class, File.class, new dz10.a(applicationContext));
        registry.a(e1u.class, InputStream.class, new mjv.a());
        registry.a(byte[].class, ByteBuffer.class, new qt8.a());
        registry.a(byte[].class, InputStream.class, new qt8.d());
        registry.a(Uri.class, Uri.class, aVar3);
        registry.a(Drawable.class, Drawable.class, aVar3);
        registry.d("legacy_append", Drawable.class, Drawable.class, new v3q0());
        registry.i(Bitmap.class, BitmapDrawable.class, new wb7(resources));
        registry.i(Bitmap.class, byte[].class, ob7Var);
        registry.i(Drawable.class, byte[].class, new qjo(tc7Var, ob7Var, xo9Var));
        registry.i(gyt.class, byte[].class, xo9Var);
        ges0 ges0Var2 = new ges0(tc7Var, new ges0.d());
        registry.d("legacy_append", ByteBuffer.class, Bitmap.class, ges0Var2);
        registry.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new ub7(resources, ges0Var2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b1u b1uVar = (b1u) it.next();
            try {
                b1uVar.a();
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(b1uVar.getClass().getName()), e2);
            }
        }
        return registry;
    }
}

package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.vk.photo.editor.domain.LowMemoryException;
import com.vk.photoeditor.engine.PhotoEditorEngine;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.b4p;

/* compiled from: DefaultEditorImageFactory.kt */
/* loaded from: classes4.dex */
public class xdl implements p3p {
    public final n4p a;
    public final HashMap<String, a> b = new HashMap<>();

    /* compiled from: DefaultEditorImageFactory.kt */
    public static final class a {
        public final o3p a;
        public final AtomicInteger b;

        public a(o3p o3pVar) {
            AtomicInteger atomicInteger = new AtomicInteger(1);
            this.a = o3pVar;
            this.b = atomicInteger;
        }
    }

    public xdl(n4p n4pVar) {
        this.a = n4pVar;
    }

    @Override // xsna.b4p
    public final void a(o3p o3pVar) {
        String str = o3pVar.a;
        HashMap<String, a> hashMap = this.b;
        a aVar = hashMap.get(str);
        if (aVar == null || aVar.b.decrementAndGet() != 0) {
            return;
        }
        hashMap.remove(aVar.a.a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0108. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016c  */
    @Override // xsna.b4p
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o3p c(e4p e4pVar, b4p.a aVar) throws LowMemoryException {
        String str;
        HashMap<String, a> hashMap;
        boolean z;
        o3p o3pVar;
        boolean z2;
        String str2;
        Bitmap bitmap;
        boolean z3 = aVar.c;
        int i = aVar.a;
        int i2 = aVar.b;
        String b = pzl.b(e4pVar.getKey(), "#", aVar.d);
        HashMap<String, a> hashMap2 = this.b;
        if (hashMap2.containsKey(b)) {
            a aVar2 = hashMap2.get(b);
            aVar2.b.incrementAndGet();
            return aVar2.a;
        }
        boolean z4 = e4pVar instanceof g4p;
        n4p n4pVar = this.a;
        if (z4) {
            g4p g4pVar = (g4p) e4pVar;
            int width = g4pVar.getWidth();
            String str3 = g4pVar.a;
            BitmapFactory.Options b2 = c4p.b(aVar, width, g4pVar.getHeight());
            if (n4pVar != null) {
                int width2 = g4pVar.getWidth();
                int height = g4pVar.getHeight();
                z2 = z3;
                int width3 = g4pVar.getWidth() / b2.inSampleSize;
                hashMap = hashMap2;
                int height2 = g4pVar.getHeight() / b2.inSampleSize;
                str2 = b;
                StringBuilder a2 = odj.a(width2, height, "Will decode image file: original ", "x", "; resized ");
                a2.append(width3);
                a2.append("x");
                a2.append(height2);
                n4pVar.d(a2.toString());
            } else {
                z2 = z3;
                str2 = b;
                hashMap = hashMap2;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str3, options);
            n3p.a(options.outWidth, options.outHeight);
            Bitmap decodeFile = BitmapFactory.decodeFile(str3, b2);
            if (decodeFile != null) {
                if (!aVar.equals(b4p.a.C2587a.e) && !aVar.equals(b4p.a.b.e) && (decodeFile.getWidth() != i || decodeFile.getHeight() != i2)) {
                    if (n4pVar != null) {
                        StringBuilder a3 = odj.a(decodeFile.getWidth(), decodeFile.getHeight(), "Will scale loaded image from: ", "x", " to: ");
                        a3.append(i);
                        a3.append("x");
                        a3.append(i2);
                        n4pVar.d(a3.toString());
                    }
                    n3p.a(i, i2);
                    decodeFile = Bitmap.createScaledBitmap(decodeFile, i, i2, true);
                }
                Bitmap bitmap2 = decodeFile;
                try {
                    ExifInterface exifInterface = new ExifInterface(str3);
                    Matrix matrix = new Matrix();
                    switch (exifInterface.getAttributeInt("Orientation", 0)) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            int width4 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            n3p.a(width4, height3);
                            bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width4, height3, matrix, true);
                            break;
                        case 3:
                            matrix.postRotate(180.0f);
                            int width42 = bitmap2.getWidth();
                            int height32 = bitmap2.getHeight();
                            n3p.a(width42, height32);
                            bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width42, height32, matrix, true);
                            break;
                        case 4:
                            matrix.postRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            int width422 = bitmap2.getWidth();
                            int height322 = bitmap2.getHeight();
                            n3p.a(width422, height322);
                            bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width422, height322, matrix, true);
                            break;
                        case 5:
                            try {
                                matrix.postRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                int width4222 = bitmap2.getWidth();
                                int height3222 = bitmap2.getHeight();
                                n3p.a(width4222, height3222);
                                bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width4222, height3222, matrix, true);
                            } catch (IOException e) {
                                e = e;
                                if (n4pVar != null) {
                                    n4pVar.b(e);
                                }
                                bitmap = null;
                                if (bitmap != null) {
                                }
                            }
                            break;
                        case 6:
                            matrix.postRotate(90.0f);
                            int width42222 = bitmap2.getWidth();
                            int height32222 = bitmap2.getHeight();
                            n3p.a(width42222, height32222);
                            bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width42222, height32222, matrix, true);
                            break;
                        case 7:
                            matrix.postRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            int width422222 = bitmap2.getWidth();
                            int height322222 = bitmap2.getHeight();
                            n3p.a(width422222, height322222);
                            bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width422222, height322222, matrix, true);
                            break;
                        case 8:
                            matrix.postRotate(-90.0f);
                            int width4222222 = bitmap2.getWidth();
                            int height3222222 = bitmap2.getHeight();
                            n3p.a(width4222222, height3222222);
                            bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width4222222, height3222222, matrix, true);
                            break;
                        default:
                            int width42222222 = bitmap2.getWidth();
                            int height32222222 = bitmap2.getHeight();
                            n3p.a(width42222222, height32222222);
                            bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width42222222, height32222222, matrix, true);
                            break;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                if (bitmap != null) {
                    bitmap2.recycle();
                } else {
                    ld7 ld7Var = new ld7(bitmap);
                    if (z2) {
                        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                        PhotoEditorEngine.d(copy, 1.0f);
                        ld7Var = new ld7(copy);
                        PhotoEditorEngine.f(copy);
                    }
                    str = str2;
                    o3pVar = new o3p(str, g4pVar, ld7Var);
                }
            }
            o3pVar = null;
            str = str2;
        } else {
            str = b;
            hashMap = hashMap2;
            if (!(e4pVar instanceof j4p)) {
                throw new IllegalStateException("Unknown EditorImageLink type!");
            }
            j4p j4pVar = (j4p) e4pVar;
            BitmapFactory.Options b3 = c4p.b(aVar, j4pVar.getWidth(), j4pVar.getHeight());
            if (n4pVar != null) {
                int width5 = j4pVar.getWidth();
                int height4 = j4pVar.getHeight();
                int width6 = j4pVar.getWidth() / b3.inSampleSize;
                int height5 = j4pVar.getHeight() / b3.inSampleSize;
                StringBuilder a4 = odj.a(width5, height4, "Will decode image resource: original ", "x", "; resized ");
                a4.append(width6);
                a4.append("x");
                a4.append(height5);
                n4pVar.d(a4.toString());
            }
            Resources resources = j4pVar.a.getResources();
            int i3 = j4pVar.b;
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, i3, options2);
            n3p.a(options2.outWidth, options2.outHeight);
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i3, b3);
            if (decodeResource == null) {
                o3pVar = null;
            } else {
                if (aVar.equals(b4p.a.C2587a.e) || aVar.equals(b4p.a.b.e) || (decodeResource.getWidth() == i && decodeResource.getHeight() == i2)) {
                    z = true;
                } else {
                    if (n4pVar != null) {
                        StringBuilder a5 = odj.a(decodeResource.getWidth(), decodeResource.getHeight(), "Will scale loaded image from: ", "x", " to: ");
                        a5.append(i);
                        a5.append("x");
                        a5.append(i2);
                        n4pVar.d(a5.toString());
                    }
                    n3p.a(i, i2);
                    z = true;
                    decodeResource = Bitmap.createScaledBitmap(decodeResource, i, i2, true);
                }
                ld7 ld7Var2 = new ld7(decodeResource);
                if (z3) {
                    Bitmap copy2 = decodeResource.copy(Bitmap.Config.ARGB_8888, z);
                    PhotoEditorEngine.d(copy2, 1.0f);
                    ld7Var2 = new ld7(copy2);
                    PhotoEditorEngine.f(copy2);
                }
                o3pVar = new o3p(str, j4pVar, ld7Var2);
            }
        }
        if (o3pVar == null) {
            return null;
        }
        hashMap.put(str, new a(o3pVar));
        return o3pVar;
    }
}

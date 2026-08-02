package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.vk.imageloader.ImageScreenSize;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.photoeditor.engine.PhotoEditorEngine;
import java.io.File;
import java.lang.reflect.Field;
import xsna.b4p;

/* compiled from: VkEditorImageFactory.kt */
/* loaded from: classes15.dex */
public final class rqu0 extends xdl {
    public final zlw c;
    public final boolean d;
    public final s770 e;

    public rqu0(zlw zlwVar, boolean z, n4p n4pVar, s770 s770Var) {
        super(n4pVar);
        this.c = zlwVar;
        this.d = z;
        this.e = s770Var;
    }

    @Override // xsna.xdl, xsna.b4p
    /* renamed from: b */
    public final o3p c(e4p e4pVar, b4p.a aVar) {
        String path;
        Bitmap bitmap;
        if ((aVar.equals(b4p.a.C2587a.e) || aVar.equals(b4p.a.b.e)) && !this.d && (e4pVar instanceof g4p)) {
            g4p g4pVar = (g4p) e4pVar;
            if (epx.f(g4pVar.a, this.c.a())) {
                zlw zlwVar = this.c;
                synchronized (zlwVar) {
                    try {
                        Bitmap bitmap2 = zlwVar.d;
                        if (bitmap2 != null) {
                            if (bitmap2.isRecycled()) {
                            }
                            bitmap = zlwVar.d;
                        }
                        System.gc();
                        Bitmap bitmap3 = zlwVar.d;
                        if (bitmap3 == null || bitmap3.isRecycled()) {
                            if (zlwVar.c) {
                                File file = zlwVar.b;
                                if (file != null) {
                                    path = file.getPath();
                                } else {
                                    MediaStoreEntry mediaStoreEntry = zlwVar.a;
                                    path = mediaStoreEntry != null ? mediaStoreEntry.f().getPath() : null;
                                }
                                if (path != null) {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                    options.inSampleSize = 0;
                                    options.inMutable = true;
                                    options.inScaled = false;
                                    Bitmap decodeFile = BitmapFactory.decodeFile(path, options);
                                    zlwVar.d = decodeFile;
                                    zlwVar.d = zlw.b(decodeFile, path);
                                }
                            } else {
                                File file2 = zlwVar.b;
                                if (file2 != null) {
                                    Uri fromFile = Uri.fromFile(file2);
                                    Field field = mcr0.a;
                                    zlwVar.d = (Bitmap) itg0.e(mcr0.j(fromFile, ImageScreenSize.VERY_BIG));
                                } else {
                                    MediaStoreEntry mediaStoreEntry2 = zlwVar.a;
                                    if (mediaStoreEntry2 != null) {
                                        Uri f = mediaStoreEntry2.f();
                                        Field field2 = mcr0.a;
                                        zlwVar.d = (Bitmap) itg0.e(mcr0.j(f, ImageScreenSize.VERY_BIG));
                                    }
                                }
                            }
                        }
                        if (zlwVar.d != null) {
                            new com.vk.crop.g(zlwVar.d.getWidth(), zlwVar.d.getHeight()).c();
                        }
                        bitmap = zlwVar.d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmap != null) {
                    ld7 ld7Var = new ld7(bitmap);
                    if (aVar.c) {
                        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                        PhotoEditorEngine.d(copy, 1.0f);
                        ld7 ld7Var2 = new ld7(copy);
                        PhotoEditorEngine.f(copy);
                        ld7Var = ld7Var2;
                    }
                    return d(new o3p(g4pVar.b + '#' + aVar.d, e4pVar, ld7Var));
                }
                return null;
            }
        }
        o3p c = super.c(e4pVar, aVar);
        if (c != null) {
            return d(c);
        }
        return null;
    }

    public final o3p d(o3p o3pVar) {
        Bitmap bitmap = o3pVar.c.a;
        s770 s770Var = this.e;
        Bitmap q = s770Var != null ? s770Var.q(bitmap) : null;
        return q != null ? new o3p(o3pVar.a, o3pVar.b, new ld7(q)) : o3pVar;
    }
}

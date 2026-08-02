package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.vk.media.qrcode.QRCodeGenerate;
import com.vk.mediastore.storage.MediaStorage;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e3m;
import xsna.ome0;
import xsna.pk9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nme0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nme0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        File file;
        Integer num;
        Bitmap decodeResource;
        String resourceTypeName;
        int a;
        int i;
        Bitmap a2;
        Bitmap bitmap;
        String path;
        String path2;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                Context context = (Context) obj2;
                ome0.a aVar = (ome0.a) obj;
                StringBuilder sb = new StringBuilder("QrCode_");
                sb.append(aVar.a);
                sb.append('_');
                String str = aVar.b;
                sb.append(str);
                sb.append('_');
                pk9.a aVar2 = aVar.c;
                sb.append(aVar2);
                sb.append("_0");
                String sb2 = sb.toString();
                boolean z = aVar.d;
                if (z) {
                    MediaStorage mediaStorage = MediaStorage.b;
                    file = ((a8r) MediaStorage.c.getValue()).get(sb2);
                } else {
                    file = null;
                }
                if (file != null && com.vk.core.files.a.x(file.getAbsolutePath())) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    return BitmapFactory.decodeFile(file.getPath(), options);
                }
                Uri parse = Uri.parse(str == null ? "" : str);
                if (parse != null) {
                    if (!meq0.d(parse) || !parse.isAbsolute() || (path2 = parse.getPath()) == null || path2.length() <= 0) {
                        parse = null;
                    }
                    if (parse != null && (path = parse.getPath()) != null) {
                        num = arm0.m(10, path.substring(1));
                        if (num == null) {
                            try {
                                resourceTypeName = context.getResources().getResourceTypeName(num.intValue());
                                a = iah0.a(200);
                            } catch (Exception unused) {
                                decodeResource = BitmapFactory.decodeResource(context.getResources(), num.intValue());
                            }
                            if (epx.f(resourceTypeName, "drawable")) {
                                int intValue = num.intValue();
                                e3m.a aVar3 = e3m.a;
                                Drawable a3 = m33.a(intValue, context);
                                if (a3 != null) {
                                    decodeResource = xjo.b(a3, a, a, 4);
                                    String str2 = aVar.a;
                                    i = aVar.e;
                                    boolean z2 = aVar.f;
                                    if (i <= 0) {
                                        i = 512;
                                    }
                                    int i3 = i;
                                    a2 = QRCodeGenerate.b() ? QRCodeGenerate.a(context, str2, i3, decodeResource, z2) : null;
                                    if (a2 == null) {
                                        try {
                                            HashMap hashMap = new HashMap();
                                            hashMap.put(EncodeHintType.MARGIN, 0);
                                            BitMatrix encode = new QRCodeWriter().encode(str2, p7l.a, i3, i3, hashMap);
                                            int width = encode.getWidth();
                                            int height = encode.getHeight();
                                            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                                            try {
                                                int[] iArr = new int[width * height];
                                                for (int i4 = 0; i4 < height; i4++) {
                                                    for (int i5 = 0; i5 < width; i5++) {
                                                        iArr[(i4 * width) + i5] = encode.get(i4, i5) ? aVar2.a : aVar2.b;
                                                    }
                                                }
                                                createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                                                bitmap = createBitmap;
                                            } catch (Throwable th) {
                                                th = th;
                                                a2 = createBitmap;
                                                Log.e(pk9.a, "can't encode qr " + th);
                                                bitmap = a2;
                                                if (decodeResource != null) {
                                                }
                                                if (z) {
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (decodeResource != null) {
                                            decodeResource.recycle();
                                        }
                                        if (z) {
                                            return bitmap;
                                        }
                                        MediaStorage mediaStorage2 = MediaStorage.b;
                                        kbr a4 = ((a8r) MediaStorage.c.getValue()).a(sb2);
                                        a4.g(new fuc0(bitmap, 5));
                                        a4.commit();
                                        return bitmap;
                                    }
                                    bitmap = a2;
                                    if (decodeResource != null) {
                                    }
                                    if (z) {
                                    }
                                }
                            }
                        } else if (str != null && !drm0.N(str)) {
                            Context context2 = e43.a;
                            if (context2 == null) {
                                context2 = null;
                            }
                            z9r0 z9r0Var = new z9r0(context2);
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            z9r0Var.setOnLoadCallback(new y9r0(z9r0Var, ref$ObjectRef, countDownLatch));
                            pro0.c(new rm3(8, z9r0Var, str));
                            countDownLatch.await();
                            decodeResource = (Bitmap) ref$ObjectRef.element;
                            String str22 = aVar.a;
                            i = aVar.e;
                            boolean z22 = aVar.f;
                            if (i <= 0) {
                            }
                            int i32 = i;
                            a2 = QRCodeGenerate.b() ? QRCodeGenerate.a(context, str22, i32, decodeResource, z22) : null;
                            if (a2 == null) {
                            }
                            bitmap = a2;
                            if (decodeResource != null) {
                            }
                            if (z) {
                            }
                        }
                        decodeResource = null;
                        String str222 = aVar.a;
                        i = aVar.e;
                        boolean z222 = aVar.f;
                        if (i <= 0) {
                        }
                        int i322 = i;
                        a2 = QRCodeGenerate.b() ? QRCodeGenerate.a(context, str222, i322, decodeResource, z222) : null;
                        if (a2 == null) {
                        }
                        bitmap = a2;
                        if (decodeResource != null) {
                        }
                        if (z) {
                        }
                    }
                }
                num = null;
                if (num == null) {
                }
                decodeResource = null;
                String str2222 = aVar.a;
                i = aVar.e;
                boolean z2222 = aVar.f;
                if (i <= 0) {
                }
                int i3222 = i;
                a2 = QRCodeGenerate.b() ? QRCodeGenerate.a(context, str2222, i3222, decodeResource, z2222) : null;
                if (a2 == null) {
                }
                bitmap = a2;
                if (decodeResource != null) {
                }
                if (z) {
                }
                break;
            default:
                return ((rhk0) obj2).c.get((ljp0) obj);
        }
    }
}

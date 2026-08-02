package xsna;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: YuvToJpegProcessor.java */
/* loaded from: classes11.dex */
public final class t5y0 implements es9 {
    public static final Rect h = new Rect(0, 0, 0, 0);
    public final int a;
    public final int b;
    public ImageWriter f;
    public final Object c = new Object();
    public boolean d = false;
    public int e = 0;
    public Rect g = h;

    public t5y0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @NonNull
    public static ExifData d(@NonNull alw alwVar) {
        t4q[] t4qVarArr = ExifData.c;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ExifData.b bVar = new ExifData.b();
        String valueOf = String.valueOf(1);
        ArrayList arrayList = bVar.a;
        bVar.c("Orientation", valueOf, arrayList);
        bVar.c("XResolution", "72/1", arrayList);
        bVar.c("YResolution", "72/1", arrayList);
        bVar.c("ResolutionUnit", String.valueOf(2), arrayList);
        bVar.c("YCbCrPositioning", String.valueOf(1), arrayList);
        bVar.c("Make", Build.MANUFACTURER, arrayList);
        bVar.c("Model", Build.MODEL, arrayList);
        alwVar.B().a(bVar);
        bVar.c("ImageWidth", String.valueOf(alwVar.getWidth()), arrayList);
        bVar.c("ImageLength", String.valueOf(alwVar.getHeight()), arrayList);
        ArrayList list = Collections.list(new androidx.camera.core.impl.utils.a(bVar));
        if (!((Map) list.get(1)).isEmpty()) {
            bVar.b("ExposureProgram", String.valueOf(0), list);
            bVar.b("ExifVersion", "0230", list);
            bVar.b("ComponentsConfiguration", "1,2,3,0", list);
            bVar.b("MeteringMode", String.valueOf(0), list);
            bVar.b("LightSource", String.valueOf(0), list);
            bVar.b("FlashpixVersion", "0100", list);
            bVar.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            bVar.b("FileSource", String.valueOf(3), list);
            bVar.b("SceneType", String.valueOf(1), list);
            bVar.b("CustomRendered", String.valueOf(0), list);
            bVar.b("SceneCaptureType", String.valueOf(0), list);
            bVar.b("Contrast", String.valueOf(0), list);
            bVar.b("Saturation", String.valueOf(0), list);
            bVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            bVar.b("GPSVersionID", "2300", list);
            bVar.b("GPSSpeedRef", "K", list);
            bVar.b("GPSTrackRef", "T", list);
            bVar.b("GPSImgDirectionRef", "T", list);
            bVar.b("GPSDestBearingRef", "T", list);
            bVar.b("GPSDestDistanceRef", "K", list);
        }
        return new ExifData(bVar.b, list);
    }

    @Override // xsna.es9
    public final void a(int i, @NonNull Surface surface) {
        obr.f("YuvToJpegProcessor only supports JPEG output format.", i == 256);
        synchronized (this.c) {
            try {
                if (!this.d) {
                    if (this.f != null) {
                        throw new IllegalStateException("Output surface already set.");
                    }
                    try {
                        Object invoke = inw.a.invoke(null, surface, Integer.valueOf(this.b), Integer.valueOf(i));
                        invoke.getClass();
                        this.f = (ImageWriter) invoke;
                    } catch (IllegalAccessException e) {
                        e = e;
                        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", e);
                    } catch (InvocationTargetException e2) {
                        e = e2;
                        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", e);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128 A[Catch: all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0107, blocks: (B:49:0x00dc, B:71:0x0128), top: B:12:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.AutoCloseable, xsna.alw] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // xsna.es9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(@NonNull blw blwVar) {
        ImageWriter imageWriter;
        boolean z;
        Rect rect;
        Image image;
        alw alwVar;
        List<Integer> a2 = blwVar.a();
        int i = 0;
        obr.a("Processing image bundle have single capture id, but found " + a2.size(), a2.size() == 1);
        ugz<alw> b = blwVar.b(a2.get(0).intValue());
        obr.b(b.isDone());
        synchronized (this.c) {
            try {
                imageWriter = this.f;
                z = this.d;
                rect = this.g;
                if (!z) {
                    this.e++;
                }
            } finally {
            }
        }
        alw alwVar2 = null;
        r2 = null;
        r2 = null;
        alwVar2 = null;
        alwVar2 = null;
        r2 = null;
        r2 = null;
        Image image2 = null;
        alwVar2 = null;
        alwVar2 = null;
        try {
            try {
                alw alwVar3 = b.get();
                try {
                    if (z) {
                        alwVar3.close();
                        synchronized (this.c) {
                            if (!z) {
                                try {
                                    int i2 = this.e;
                                    ?? r2 = i2 - 1;
                                    this.e = r2;
                                    image2 = r2;
                                    if (i2 == 0) {
                                        image2 = r2;
                                        if (this.d) {
                                            i = 1;
                                            image2 = r2;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (i != 0) {
                            imageWriter.close();
                        }
                    } else {
                        image = imageWriter.dequeueInputImage();
                        try {
                            alwVar = b.get();
                        } catch (InterruptedException e) {
                            e = e;
                            alwVar2 = alwVar3;
                            if (!z) {
                            }
                            synchronized (this.c) {
                            }
                        } catch (ExecutionException e2) {
                            e = e2;
                            alwVar2 = alwVar3;
                            if (!z) {
                            }
                            synchronized (this.c) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            alwVar2 = alwVar3;
                            synchronized (this.c) {
                            }
                        }
                        try {
                            obr.f("Input image is not expected YUV_420_888 image format", alwVar.getFormat() == 35);
                            YuvImage yuvImage = new YuvImage(ImageUtil.a(alwVar), 17, alwVar.getWidth(), alwVar.getHeight(), null);
                            ?? buffer = image.getPlanes()[0].getBuffer();
                            alwVar3 = buffer.position();
                            yuvImage.compressToJpeg(rect, this.a, new androidx.camera.core.impl.utils.b(new a(buffer), d(alwVar)));
                            alwVar.close();
                            try {
                                buffer.limit(buffer.position());
                                buffer.position(alwVar3);
                                imageWriter.queueInputImage(image);
                                synchronized (this.c) {
                                    if (!z) {
                                        try {
                                            int i3 = this.e;
                                            ?? r22 = i3 - 1;
                                            this.e = r22;
                                            image2 = r22;
                                            if (i3 == 0) {
                                                image2 = r22;
                                                if (this.d) {
                                                    i = 1;
                                                    image2 = r22;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                if (i != 0) {
                                    imageWriter.close();
                                }
                            } catch (InterruptedException e3) {
                                e = e3;
                                if (!z) {
                                    s100.a("YuvToJpegProcessor", "Failed to process YUV -> JPEG", e);
                                    Image dequeueInputImage = imageWriter.dequeueInputImage();
                                    try {
                                        ByteBuffer buffer2 = dequeueInputImage.getPlanes()[i].getBuffer();
                                        buffer2.rewind();
                                        buffer2.limit(i);
                                        imageWriter.queueInputImage(dequeueInputImage);
                                        image = dequeueInputImage;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        image = dequeueInputImage;
                                        synchronized (this.c) {
                                            if (!z) {
                                                try {
                                                    int i4 = this.e;
                                                    this.e = i4 - 1;
                                                    if (i4 == 0 && this.d) {
                                                        i = 1;
                                                    }
                                                } finally {
                                                }
                                            }
                                        }
                                        if (image != null) {
                                            image.close();
                                        }
                                        if (alwVar2 != null) {
                                            alwVar2.close();
                                        }
                                        if (i != 0) {
                                            imageWriter.close();
                                        }
                                        throw th;
                                    }
                                }
                                synchronized (this.c) {
                                    if (!z) {
                                        try {
                                            int i5 = this.e;
                                            this.e = i5 - 1;
                                            if (i5 == 0 && this.d) {
                                                i = 1;
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                if (image != null) {
                                    image.close();
                                }
                                if (alwVar2 != null) {
                                    alwVar2.close();
                                }
                                if (i != 0) {
                                    imageWriter.close();
                                }
                            } catch (ExecutionException e4) {
                                e = e4;
                                if (!z) {
                                }
                                synchronized (this.c) {
                                }
                            }
                        } catch (InterruptedException e5) {
                            e = e5;
                            alwVar2 = alwVar;
                            if (!z) {
                            }
                            synchronized (this.c) {
                            }
                        } catch (ExecutionException e6) {
                            e = e6;
                            alwVar2 = alwVar;
                            if (!z) {
                            }
                            synchronized (this.c) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            alwVar2 = alwVar;
                            synchronized (this.c) {
                            }
                        }
                    }
                } catch (InterruptedException e7) {
                    e = e7;
                    image = image2;
                    alwVar2 = alwVar3;
                    if (!z) {
                    }
                    synchronized (this.c) {
                    }
                } catch (ExecutionException e8) {
                    e = e8;
                    image = image2;
                    alwVar2 = alwVar3;
                    if (!z) {
                    }
                    synchronized (this.c) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    image = image2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (InterruptedException e9) {
            e = e9;
            image = null;
            if (!z) {
            }
            synchronized (this.c) {
            }
        } catch (ExecutionException e10) {
            e = e10;
            image = null;
            if (!z) {
            }
            synchronized (this.c) {
            }
        } catch (Throwable th6) {
            th = th6;
            image = null;
        }
    }

    @Override // xsna.es9
    public final void c(@NonNull Size size) {
        synchronized (this.c) {
            this.g = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /* compiled from: YuvToJpegProcessor.java */
    public static final class a extends OutputStream {
        public final ByteBuffer b;

        public a(@NonNull ByteBuffer byteBuffer) {
            this.b = byteBuffer;
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            ByteBuffer byteBuffer = this.b;
            if (!byteBuffer.hasRemaining()) {
                throw new EOFException("Output ByteBuffer has no bytes remaining.");
            }
            byteBuffer.put((byte) i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            bArr.getClass();
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return;
            }
            ByteBuffer byteBuffer = this.b;
            if (byteBuffer.remaining() >= i2) {
                byteBuffer.put(bArr, i, i2);
                return;
            }
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
    }
}

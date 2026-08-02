package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.c;
import androidx.camera.core.impl.utils.executor.b;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class l6f0 {
    public final Executor a;
    public final CameraCharacteristics b;
    public yzh c;
    public w74 d;
    public s400 e;
    public reu f;
    public yz5 g;
    public v9x h;
    public gly0 i;
    public y9x j;
    public w9x k;
    public l7v l;
    public final a73 m;
    public final boolean n;

    public l6f0(Executor executor, CameraCharacteristics cameraCharacteristics) {
        a73 a73Var = tbj.a;
        if (tbj.a.b(LowMemoryQuirk.class) != null) {
            this.a = new b(executor);
        } else {
            this.a = executor;
        }
        this.b = cameraCharacteristics;
        this.m = a73Var;
        this.n = a73Var.a(IncorrectJpegMetadataQuirk.class);
    }

    public final jdv a(x74 x74Var) {
        m6f0 m6f0Var = x74Var.a;
        k590 k590Var = (k590) this.e.f(x74Var);
        List list = this.d.d;
        d6z.n(!list.isEmpty());
        int intValue = ((Integer) list.get(0)).intValue();
        if ((k590Var.e() == 35 || this.n) && intValue == 256) {
            k590 k590Var2 = (k590) this.f.i(new w64(k590Var, m6f0Var.g));
            this.k.getClass();
            mdl0 mdl0Var = new mdl0(c5b1.a(k590Var2.h().getWidth(), k590Var2.h().getHeight(), 256, 2));
            jdv b = ImageProcessingUtil.b(mdl0Var, (byte[]) k590Var2.c());
            mdl0Var.d();
            Objects.requireNonNull(b);
            dlo d = k590Var2.d();
            Objects.requireNonNull(d);
            Rect b2 = k590Var2.b();
            int f = k590Var2.f();
            Matrix g = k590Var2.g();
            ap7 a = k590Var2.a();
            aas aasVar = (aas) b;
            Size size = new Size(aasVar.getWidth(), aasVar.getHeight());
            aasVar.getFormat();
            k590Var = new r74(b, d, aasVar.getFormat(), size, b2, f, g, a);
        }
        this.j.getClass();
        jdv jdvVar = (jdv) k590Var.c();
        x4r0 x4r0Var = new x4r0(jdvVar, k590Var.h(), new c(jdvVar.G0().b(), jdvVar.G0().getTimestamp(), k590Var.f(), k590Var.g(), jdvVar.G0().d()));
        x4r0Var.c(k590Var.b());
        if (list.size() > 1) {
            m6f0Var.b.n(x4r0Var.getFormat());
        }
        return x4r0Var;
    }

    public final reu b(x74 x74Var) {
        List list = this.d.d;
        d6z.n(!list.isEmpty());
        Integer num = (Integer) list.get(0);
        int intValue = num.intValue();
        d6z.m("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num, a.c(intValue) || intValue == 32);
        m6f0 m6f0Var = x74Var.a;
        r1s r1sVar = m6f0Var.c;
        b8x0 b8x0Var = m6f0Var.b;
        int i = m6f0Var.g;
        r1s r1sVar2 = m6f0Var.d;
        d6z.m("OutputFileOptions cannot be empty", r1sVar != null);
        k590 k590Var = (k590) this.e.f(x74Var);
        if (list.size() <= 1) {
            if (intValue != 32) {
                Objects.requireNonNull(r1sVar);
                return c(k590Var, r1sVar, i);
            }
            Objects.requireNonNull(r1sVar);
            return d(k590Var, r1sVar);
        }
        d6z.m("The number of OutputFileOptions for simultaneous capture should be at least two", (r1sVar == null || r1sVar2 == null) ? false : true);
        if (k590Var.e() != 32) {
            Objects.requireNonNull(r1sVar2);
            reu c = c(k590Var, r1sVar2, i);
            b8x0Var.n(256);
            return c;
        }
        Objects.requireNonNull(r1sVar);
        reu d = d(k590Var, r1sVar);
        b8x0Var.n(32);
        return d;
    }

    public final reu c(k590 k590Var, r1s r1sVar, int i) {
        k590 k590Var2 = (k590) this.f.i(new w64(k590Var, i));
        if (lw01.c(k590Var2.b(), k590Var2.h())) {
            d6z.y(null, a.c(k590Var2.e()));
            this.i.getClass();
            Rect b = k590Var2.b();
            byte[] bArr = (byte[]) k590Var2.c();
            try {
                Bitmap decodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(b, new BitmapFactory.Options());
                dlo d = k590Var2.d();
                Objects.requireNonNull(d);
                Rect rect = new Rect(0, 0, decodeRegion.getWidth(), decodeRegion.getHeight());
                int f = k590Var2.f();
                Matrix g = k590Var2.g();
                RectF rectF = lw01.a;
                Matrix matrix = new Matrix(g);
                matrix.postTranslate(-b.left, -b.top);
                r74 r74Var = new r74(decodeRegion, d, 42, new Size(decodeRegion.getWidth(), decodeRegion.getHeight()), rect, f, matrix, k590Var2.a());
                yz5 yz5Var = this.g;
                t34 t34Var = new t34(r74Var, i);
                yz5Var.getClass();
                k590 b2 = t34Var.b();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) b2.c()).compress(Bitmap.CompressFormat.JPEG, t34Var.a(), byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dlo d2 = b2.d();
                Objects.requireNonNull(d2);
                k590Var2 = new r74(byteArray, d2, (Build.VERSION.SDK_INT < 34 || !sg.g((Bitmap) b2.c())) ? 256 : Constants.INTENT_CONTAINER_ID, b2.h(), b2.b(), b2.f(), b2.g(), b2.a());
            } catch (IOException e) {
                throw new ImageCaptureException(1, "Failed to decode JPEG.", e);
            }
        }
        v9x v9xVar = this.h;
        Objects.requireNonNull(r1sVar);
        c74 c74Var = new c74(k590Var2, r1sVar);
        v9xVar.getClass();
        k590 b3 = c74Var.b();
        r1s a = c74Var.a();
        File d3 = ena1.d(a);
        byte[] bArr2 = (byte[]) b3.c();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(d3);
            try {
                fileOutputStream.write(bArr2, 0, new ivw().a(bArr2));
                fileOutputStream.close();
                dlo d4 = b3.d();
                Objects.requireNonNull(d4);
                int f2 = b3.f();
                try {
                    fg1 fg1Var = dlo.b;
                    androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(d3.toString());
                    dlo dloVar = new dlo(aVar);
                    d4.a(dloVar);
                    int i2 = 3;
                    if (dloVar.b() == 0 && f2 != 0) {
                        if (f2 % 90 != 0) {
                            Locale locale = Locale.US;
                            sgb1.g(5, "dlo");
                            aVar.I("Orientation", String.valueOf(0));
                        } else {
                            int i3 = f2 % 360;
                            int d5 = aVar.d(0, "Orientation");
                            while (i3 < 0) {
                                i3 += 90;
                                switch (d5) {
                                    case 2:
                                        d5 = 5;
                                        break;
                                    case 3:
                                    case 8:
                                        d5 = 6;
                                        break;
                                    case 4:
                                        d5 = 7;
                                        break;
                                    case 5:
                                        d5 = 4;
                                        break;
                                    case 6:
                                        d5 = 1;
                                        break;
                                    case 7:
                                        d5 = 2;
                                        break;
                                    default:
                                        d5 = 8;
                                        break;
                                }
                            }
                            while (i3 > 0) {
                                i3 -= 90;
                                switch (d5) {
                                    case 2:
                                        d5 = 7;
                                        break;
                                    case 3:
                                        d5 = 8;
                                        break;
                                    case 4:
                                        d5 = 5;
                                        break;
                                    case 5:
                                        d5 = 2;
                                        break;
                                    case 6:
                                        d5 = 3;
                                        break;
                                    case 7:
                                        d5 = 4;
                                        break;
                                    case 8:
                                        d5 = 1;
                                        break;
                                    default:
                                        d5 = 6;
                                        break;
                                }
                            }
                            aVar.I("Orientation", String.valueOf(d5));
                        }
                    }
                    if (((s8v) a.w).a) {
                        switch (dloVar.a.d(0, "Orientation")) {
                            case 2:
                                i2 = 1;
                                break;
                            case 3:
                                i2 = 4;
                                break;
                            case 4:
                                break;
                            case 5:
                                i2 = 6;
                                break;
                            case 6:
                                i2 = 5;
                                break;
                            case 7:
                                i2 = 8;
                                break;
                            case 8:
                                i2 = 7;
                                break;
                            default:
                                i2 = 2;
                                break;
                        }
                        aVar.I("Orientation", String.valueOf(i2));
                    }
                    dloVar.c();
                    return new reu(4, ena1.e(d3, a));
                } catch (IOException e2) {
                    throw new ImageCaptureException(1, "Failed to update Exif data", e2);
                }
            } finally {
            }
        } catch (IOException e3) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e3);
        }
    }

    public final reu d(k590 k590Var, r1s r1sVar) {
        int i = 0;
        if (this.c == null) {
            CameraCharacteristics cameraCharacteristics = this.b;
            if (cameraCharacteristics == null) {
                throw new ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (k590Var.a().m() == null) {
                throw new ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult m = k590Var.a().m();
            Objects.requireNonNull(m);
            DngCreator dngCreator = new DngCreator(cameraCharacteristics, m);
            yzh yzhVar = new yzh();
            yzhVar.a = dngCreator;
            this.c = yzhVar;
        }
        yzh yzhVar2 = this.c;
        jdv jdvVar = (jdv) k590Var.c();
        int f = k590Var.f();
        Objects.requireNonNull(r1sVar);
        if (jdvVar == null) {
            ny61.t("Null imageProxy");
            return null;
        }
        yzhVar2.getClass();
        File d = ena1.d(r1sVar);
        DngCreator dngCreator2 = (DngCreator) yzhVar2.a;
        try {
            try {
                try {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(d);
                        if (f == 0) {
                            i = 1;
                        } else if (f == 90) {
                            i = 6;
                        } else if (f == 180) {
                            i = 3;
                        } else if (f == 270) {
                            i = 8;
                        }
                        try {
                            dngCreator2.setOrientation(i);
                            dngCreator2.writeImage(fileOutputStream, jdvVar.f());
                            fileOutputStream.close();
                            jdvVar.close();
                            return new reu(4, ena1.e(d, r1sVar));
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new ImageCaptureException(1, "Failed to write to temp file", e);
                    }
                } catch (IllegalStateException e2) {
                    throw new ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e2);
                }
            } catch (IllegalArgumentException e3) {
                throw new ImageCaptureException(1, "Image with an unsupported format was used", e3);
            }
        } catch (Throwable th3) {
            jdvVar.close();
            throw th3;
        }
    }
}

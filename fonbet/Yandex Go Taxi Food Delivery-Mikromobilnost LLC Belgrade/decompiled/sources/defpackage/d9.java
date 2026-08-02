package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.location.Geocoder;
import coil3.graphics.C0138a;
import coil3.size.Precision;
import coil3.size.Scale;
import com.adjust.sdk.Constants;
import com.yandex.go.accessibility.b;
import com.yandex.go.agreement.router.d;
import com.yandex.go.flex.common.descriptors.action.a;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.collections.builders.ListBuilder;
import kotlinx.serialization.KSerializer;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.r;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes8.dex */
public final /* synthetic */ class d9 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        klo kloVar;
        boolean z;
        Bitmap createBitmap;
        int i;
        int min;
        double max;
        int i2 = 1;
        switch (this.a) {
            case 0:
                h9 h9Var = (h9) this.b;
                List f = h9Var.f();
                lb7 c = h9Var.c();
                HashMap hashMap = new HashMap(f.size());
                List<f9> list = f;
                for (f9 f9Var : list) {
                    if (((KSerializer) hashMap.put(f9Var.a, f9Var.b)) != null) {
                        yci0.m(b64.l("Duplicate key \"", f9Var.a, "\" received in serializer: ", qoi0.a(h9Var.getClass()).d()));
                        return null;
                    }
                }
                HashMap hashMap2 = new HashMap(f.size());
                for (f9 f9Var2 : list) {
                    hashMap2.put(f9Var2.c, f9Var2);
                }
                return new g9(h9Var.e(), hashMap, hashMap2, c);
            case 1:
                return ((b) this.b).a.getContentResolver();
            case 2:
                return bvf0.c(Boolean.valueOf(((cne0) ((lm) this.b).a.getValue()).f("upgrade_account_token_error")));
            case 3:
                return new com.yandex.go.flex.common.descriptors.action.b(((a) this.b).b);
            case 4:
                return ((com.yandex.go.benefits_center.benefits.sdk.descriptors.a) this.b).b;
            case 5:
                return (p2y0) ((com.yandex.go.taxi.order.provider.a) this.b).a.get();
            case 6:
                ((Consumer) this.b).accept(Boolean.TRUE);
                return zy11.a;
            case 7:
                return new f52(Constants.LOGTAG, new da1(0, (ea1) this.b));
            case 8:
                return ((avj0) ((zuj0) this.b)).h(lzh0.adjust_applink);
            case 9:
                return (d) ((com.yandex.go.agreement.domain.a) this.b).e.get();
            case 10:
                return bvf0.c(((k) this.b).Ig());
            case 11:
                return new Geocoder(((com.yandex.mob.a) this.b).a, Locale.getDefault());
            case 12:
                ru.yandex.taxi.locationsdk.locationprovider.android.a aVar = (ru.yandex.taxi.locationsdk.locationprovider.android.a) this.b;
                return new s9z(aVar.a, aVar.b);
            case 13:
                return Long.valueOf(((jtq0) this.b).c().getTime());
            case 14:
                return (OkHttpClient) ((sbc) this.b).invoke();
            case 15:
                return ((Context) ((lb7) this.b).b).getSharedPreferences("app_environment", 0);
            case 16:
                return (adi0) ((i3y) this.b).getValue();
            case 17:
                return new coil3.network.okhttp.internal.a(new gn2(i2, kotlin.a.a((in2) this.b)));
            case 18:
                return new f52("AppMetrica", new da1(i2, (ea1) this.b));
            case 19:
                return new h8(1, (Object[]) this.b);
            case 20:
                ((r) this.b).k.getClass();
                sjh sjhVar = uyj.a;
                return o400.a;
            case 21:
                return fme0.a((Context) ((am2) this.b).a);
            case 22:
                ((wyj) ((xyj) this.b)).getClass();
                return bvf0.a(wyj.f);
            case 23:
                return (Map) ((com.yandex.plus.core.benchmark.a) this.b).b.invoke();
            case 24:
                C0138a c0138a = (C0138a) this.b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                lg70 lg70Var = c0138a.b;
                h06 h06Var = new h06(c0138a.a.source());
                jci0 jci0Var = new jci0(h06Var);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new wp6(jci0Var.peek(), i2), null, options);
                Exception exc = (Exception) h06Var.c;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = zlo.a;
                String str = options.outMimeType;
                c0138a.d.getClass();
                if (str != null && (str.equals("image/jpeg") || str.equals(GlideBitmapDownloader.ACCEPT_WEBP) || str.equals("image/heic") || str.equals("image/heif"))) {
                    androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(new slo(new wp6(jci0Var.peek(), i2)));
                    int d = aVar2.d(1, "Orientation");
                    kloVar = new klo(d == 2 || d == 7 || d == 4 || d == 5, aVar2.n());
                } else {
                    kloVar = klo.c;
                }
                int i3 = kloVar.b;
                boolean z2 = kloVar.a;
                Exception exc2 = (Exception) h06Var.c;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                ColorSpace b = lev.b(lg70Var);
                Context context = lg70Var.a;
                if (b != null) {
                    options.inPreferredColorSpace = (ColorSpace) s8o.p(lg70Var, lev.b);
                }
                options.inPremultiplied = ((Boolean) s8o.p(lg70Var, lev.c)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) s8o.p(lg70Var, lev.a);
                if ((z2 || i3 > 0) && (config == null || sb2.x(config))) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) s8o.p(lg70Var, lev.f)).booleanValue() && config == Bitmap.Config.ARGB_8888 && jl40.l(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i4 = options.outWidth;
                if (i4 <= 0 || (i = options.outHeight) <= 0) {
                    z = z2;
                    options.inSampleSize = 1;
                    options.inScaled = false;
                } else {
                    int i5 = (i3 == 90 || i3 == 270) ? i : i4;
                    if (i3 != 90 && i3 != 270) {
                        i4 = i;
                    }
                    xis0 xis0Var = lg70Var.b;
                    Scale scale = lg70Var.c;
                    uh uhVar = kev.b;
                    long l = y5e.l(i5, i4, xis0Var, scale, (xis0) s8o.p(lg70Var, uhVar));
                    int i6 = (int) (l >> 32);
                    int i7 = i5;
                    int i8 = (int) (l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    int highestOneBit = Integer.highestOneBit(i7 / i6);
                    int highestOneBit2 = Integer.highestOneBit(i4 / i8);
                    int[] iArr = yxg.a;
                    int i9 = iArr[scale.ordinal()];
                    if (i9 == 1) {
                        min = Math.min(highestOneBit, highestOneBit2);
                    } else {
                        if (i9 != 2) {
                            w511.b();
                            return null;
                        }
                        min = Math.max(highestOneBit, highestOneBit2);
                    }
                    if (min < 1) {
                        min = 1;
                    }
                    options.inSampleSize = min;
                    z = z2;
                    double d2 = i7;
                    double d3 = min;
                    double d4 = d2 / d3;
                    double d5 = i4 / d3;
                    xis0 xis0Var2 = (xis0) s8o.p(lg70Var, uhVar);
                    double d6 = i6 / d4;
                    double d7 = i8 / d5;
                    int i10 = iArr[scale.ordinal()];
                    if (i10 == 1) {
                        max = Math.max(d6, d7);
                    } else {
                        if (i10 != 2) {
                            w511.b();
                            return null;
                        }
                        max = Math.min(d6, d7);
                    }
                    if (xis0Var2.a instanceof kkj) {
                        double d8 = ((kkj) r4).a / d4;
                        if (max > d8) {
                            max = d8;
                        }
                    }
                    if (xis0Var2.b instanceof kkj) {
                        double d9 = ((kkj) r0).a / d5;
                        if (max > d9) {
                            max = d9;
                        }
                    }
                    if (lg70Var.d == Precision.INEXACT && max > 1.0d) {
                        max = 1.0d;
                    }
                    boolean z3 = max == 1.0d;
                    options.inScaled = !z3;
                    if (!z3) {
                        if (max > 1.0d) {
                            options.inDensity = m810.a(2.147483647E9d / max);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = m810.a(2.147483647E9d * max);
                        }
                    }
                    i2 = 1;
                }
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(new wp6(jci0Var, i2), null, options);
                    jci0Var.close();
                    Exception exc3 = (Exception) h06Var.c;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (decodeStream == null) {
                        ny61.r("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z || i3 > 0) {
                        Matrix matrix = new Matrix();
                        float width = decodeStream.getWidth() / 2.0f;
                        float height = decodeStream.getHeight() / 2.0f;
                        if (z) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i3 > 0) {
                            matrix.postRotate(i3, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f2 = rectF.left;
                        if (f2 != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f2, -rectF.top);
                        }
                        if (i3 == 90 || i3 == 270) {
                            int height2 = decodeStream.getHeight();
                            int width2 = decodeStream.getWidth();
                            Bitmap.Config config4 = decodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = decodeStream.getWidth();
                            int height3 = decodeStream.getHeight();
                            Bitmap.Config config5 = decodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(createBitmap).drawBitmap(decodeStream, matrix, zlo.a);
                        decodeStream.recycle();
                        decodeStream = createBitmap;
                    }
                    return new wxg(cma1.k(new BitmapDrawable(context.getResources(), decodeStream)), options.inSampleSize > 1 || options.inScaled);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ooc.g(jci0Var, th);
                        throw th2;
                    }
                }
            case 25:
                l16 l16Var = (l16) this.b;
                ListBuilder a = rcc.a();
                pnq0 pnq0Var = l16Var.a;
                a.add(new j6u0(pnq0Var));
                a.add(new j06(pnq0Var, ulo.a));
                return a.j();
            case 26:
                yzc0 yzc0Var = (yzc0) ((am2) this.b).a;
                w040 b2 = h2b1.b(new qhd0(yzc0Var.a, yzc0Var.b));
                oo2 oo2Var = yzc0Var.a;
                b27 f3 = b2.f();
                hnt0 hnt0Var = new hnt0((Context) ((ru2) oo2Var.a).g, b2.f());
                b5d0 b5d0Var = yzc0Var.c;
                ((wyj) ((xyj) ((i3y) oo2Var.b).getValue())).getClass();
                return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.a(f3, hnt0Var, b5d0Var, wyj.e);
            case 27:
                cxq0 cxq0Var = (cxq0) this.b;
                return ((dne0) cxq0Var.c).a(((b03) cxq0Var.b).getApplicationId() + ".LpmSelectedPayment.chargers");
            case 28:
                return ((com.yandex.go.benefits_center.benefits.sdk.descriptors.a) this.b).b;
            default:
                owy0 owy0Var = (owy0) this.b;
                if (owy0Var != null) {
                    owy0Var.a();
                }
                return zy11.a;
        }
    }
}

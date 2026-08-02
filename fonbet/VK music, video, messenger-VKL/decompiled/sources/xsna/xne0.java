package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Size;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.Result;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.qrcode.QRStatsTracker;
import com.vkontakte.android.R;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.ikv0;

/* compiled from: QrParserDelegate.kt */
/* loaded from: classes15.dex */
public final class xne0 implements zne0 {
    public static final int j = iah0.a(72);
    public final GalleryFragmentImpl a;
    public final hne0 b;
    public final boolean c;
    public final PhotoSmallAdapter d;
    public final x3i e;
    public io.reactivex.rxjava3.disposables.c f;
    public final bpn0 g = new bpn0(new x850(this, 20));
    public final bpn0 h = new bpn0(new odc0(this, 7));
    public ikv0 i;

    public xne0(GalleryFragmentImpl galleryFragmentImpl, hne0 hne0Var, boolean z, PhotoSmallAdapter photoSmallAdapter, x3i x3iVar) {
        this.a = galleryFragmentImpl;
        this.b = hne0Var;
        this.c = z;
        this.d = photoSmallAdapter;
        this.e = x3iVar;
    }

    @Override // xsna.zne0
    public final io.reactivex.rxjava3.disposables.c a() {
        return this.f;
    }

    @Override // xsna.zne0
    public final void b(final Uri uri, MediaStoreEntry mediaStoreEntry, int i) {
        this.f = new io.reactivex.rxjava3.internal.operators.single.k(io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.une0
            /* JADX WARN: Not initialized variable reg: 8, insn: 0x007d: MOVE (r6 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:126), block:B:97:0x007c */
            /* JADX WARN: Removed duplicated region for block: B:10:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x011b  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x01c0  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x00bf  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                Throwable th;
                InputStream inputStream;
                InputStream inputStream2;
                Bitmap bitmap;
                Bitmap bitmap2;
                Bitmap decodeFile;
                fy2 e;
                mne0 mne0Var;
                nne0 nne0Var;
                Bitmap createBitmap;
                RGBLuminanceSource rGBLuminanceSource;
                xne0 xne0Var = this;
                Context requireContext = xne0Var.a.requireContext();
                Uri uri2 = uri;
                InputStream inputStream3 = null;
                r6 = null;
                r6 = null;
                nne0 nne0Var2 = null;
                try {
                    if (uri2 == null) {
                        bitmap2 = null;
                    } else {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            inputStream2 = epx.f(uri2.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) ? requireContext.getContentResolver().openInputStream(uri2) : new FileInputStream(uri2.getPath());
                            try {
                                BitmapFactory.decodeStream(inputStream2, null, options);
                                int i2 = options.outWidth;
                                int i3 = options.outHeight;
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inSampleSize = Math.max(i2 / 600, i3 / 600);
                                if (!epx.f(uri2.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                                    decodeFile = BitmapFactory.decodeFile(uri2.getPath(), options2);
                                } else if (gz80.a(29)) {
                                    int i4 = options2.inSampleSize;
                                    decodeFile = requireContext.getContentResolver().loadThumbnail(uri2, new Size(i2 * i4, i3 * i4), null);
                                } else {
                                    decodeFile = MediaStore.Images.Media.getBitmap(requireContext.getContentResolver(), uri2);
                                }
                                bitmap = decodeFile;
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e2) {
                                        xgx0.a.getClass();
                                        xgx0.d(e2);
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                xgx0.a.getClass();
                                xgx0.d(e);
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e4) {
                                        xgx0.a.getClass();
                                        xgx0.d(e4);
                                    }
                                }
                                bitmap = null;
                                bitmap2 = bitmap;
                                if (bitmap2 != null) {
                                }
                                it80.b.getClass();
                                return new it80(nne0Var2);
                            }
                        } catch (Exception e5) {
                            e = e5;
                            inputStream2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream3 == null) {
                                throw th;
                            }
                            try {
                                inputStream3.close();
                                throw th;
                            } catch (IOException e6) {
                                xgx0.a.getClass();
                                xgx0.d(e6);
                                throw th;
                            }
                        }
                        bitmap2 = bitmap;
                    }
                    if (bitmap2 != null) {
                        one0 one0Var = (one0) xne0Var.g.getValue();
                        one0Var.getClass();
                        if (!bitmap2.isRecycled() && (e = one0Var.e()) != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            y1x y1xVar = new y1x(bitmap2);
                            zzmu.zza(zzms.zzb("vision-common"), -1, 1, elapsedRealtime, bitmap2.getHeight(), bitmap2.getWidth(), bitmap2.getAllocationByteCount(), 0);
                            List h = e.h(y1xVar);
                            if (h != null) {
                                mne0Var = new mne0(h, bitmap2.getWidth(), bitmap2.getHeight());
                                ArrayList a = tne0.a(mne0Var == null ? mne0Var.a : null);
                                nne0Var = a == null ? new nne0(bitmap2.getWidth(), bitmap2.getHeight(), a, true) : null;
                                if (nne0Var == null) {
                                    nne0Var2 = nne0Var;
                                } else if (!bitmap2.isRecycled()) {
                                    ArrayList arrayList = new ArrayList();
                                    int i5 = 0;
                                    Bitmap bitmap3 = null;
                                    Result result = null;
                                    while (true) {
                                        if (i5 <= 270) {
                                            if (i5 > 90 && bitmap3 != null) {
                                                bitmap3.recycle();
                                            }
                                            if (i5 == 0) {
                                                createBitmap = bitmap2;
                                            } else {
                                                Matrix matrix = new Matrix();
                                                matrix.postRotate(i5);
                                                createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                                            }
                                            if (createBitmap == null) {
                                                rGBLuminanceSource = null;
                                            } else {
                                                int[] iArr = new int[createBitmap.getHeight() * createBitmap.getWidth()];
                                                createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                                                rGBLuminanceSource = new RGBLuminanceSource(createBitmap.getWidth(), createBitmap.getHeight(), iArr);
                                            }
                                            Result a2 = one0Var.a(rGBLuminanceSource);
                                            if (a2 != null) {
                                                Bitmap bitmap4 = createBitmap;
                                                result = a2;
                                                bitmap3 = bitmap4;
                                                break;
                                            }
                                            i5 += 90;
                                            Bitmap bitmap5 = createBitmap;
                                            result = a2;
                                            bitmap3 = bitmap5;
                                        } else {
                                            break;
                                        }
                                    }
                                    if (bitmap3 != null) {
                                        bitmap3.recycle();
                                    }
                                    if (result != null) {
                                        arrayList.add(result);
                                        nne0Var2 = new nne0(bitmap2.getWidth(), bitmap2.getHeight(), arrayList, false);
                                    }
                                }
                                bitmap2.recycle();
                            }
                        }
                        mne0Var = null;
                        ArrayList a3 = tne0.a(mne0Var == null ? mne0Var.a : null);
                        if (a3 == null) {
                        }
                        if (nne0Var == null) {
                        }
                        bitmap2.recycle();
                    }
                    it80.b.getClass();
                    return new it80(nne0Var2);
                } catch (Throwable th3) {
                    th = th3;
                    inputStream3 = inputStream;
                }
            }
        })).m(io.reactivex.rxjava3.android.schedulers.a.b()), new bi3(mediaStoreEntry, 6)).subscribe(new ubq(new vne0(this, mediaStoreEntry, i, uri, 0), 28), new fl30(new wne0(this, mediaStoreEntry, i), 18));
    }

    public final void c(rne0 rne0Var) {
        if (this.c) {
            Intent intent = new Intent();
            intent.putExtra("qr_code_result", rne0Var.a.toString());
            this.a.Mf(-1, intent);
        } else {
            if (rne0Var == null) {
                d();
                return;
            }
            znv znvVar = (znv) this.h.getValue();
            znvVar.b();
            znvVar.c();
            znvVar.a(e43.a(rne0Var));
        }
    }

    public final void d() {
        l7s u = bwt0.u(this.a.kn());
        ikv0.a aVar = new ikv0.a(u);
        aVar.u = new ikv0.d(u.getString(R.string.qr_scanner_no_qr_found), (String) null, (ikv0.d.a) null, 6);
        aVar.o = Integer.valueOf(j);
        aVar.e = 2000L;
        this.i = aVar.n();
        this.b.b();
        QRStatsTracker.a.b(null, "error_not_found_on_photo");
    }
}

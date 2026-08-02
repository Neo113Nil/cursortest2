package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import com.ybsdk.feature.qr.api.QrCameraType;
import com.ybsdk.feature.qr.api.QrScannerPreviewDependencies;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.MlKitExceptionFiltersConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes11.dex */
public final class kwt implements nlm0 {
    public static final int j = kp50.r(1080);
    public static final int k = kp50.r(1920);
    public static volatile boolean l;
    public final View a;
    public final QrScannerPreviewDependencies b;
    public final i3y c;
    public final Context d;
    public Bitmap e;
    public boolean f;
    public tls g;
    public final n0 h;
    public final n0 i;

    public kwt(View view, QrScannerPreviewDependencies qrScannerPreviewDependencies) {
        this.a = view;
        this.b = qrScannerPreviewDependencies;
        Context context = view.getContext();
        yxf0 yxf0Var = (yxf0) qrScannerPreviewDependencies;
        List<String> filters = ((MlKitExceptionFiltersConfig) ((b) yxf0Var.a).d(rk20.a).getData()).getFilters();
        qpi0 qpi0Var = (qpi0) yxf0Var.b;
        if (!l) {
            try {
                synchronized (qk20.b) {
                    qk20.d(context, dtx0.a);
                }
                l = true;
            } catch (Exception e) {
                List<String> list = filters;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str : list) {
                        String message = e.getMessage();
                        if (message != null && qpi0Var.a(str).h(message)) {
                            l = true;
                            break;
                        }
                    }
                }
                x4c.g("Unexpected exception while initializing MlKit", e, null, Collections.singletonList(lrp0.w), 4);
            }
        }
        this.c = a.b(LazyThreadSafetyMode.NONE, new dnr(29, this));
        this.d = this.a.getContext();
        this.f = true;
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.h = c;
        this.i = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r2 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList g(List list) {
        Object obj;
        String str;
        if (list == null) {
            list = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (fv4 fv4Var : list) {
            vv4 vv4Var = fv4Var.a;
            if (vv4Var.f() == 7) {
                try {
                    String m = vv4Var.m();
                    String str2 = m;
                    if (m == null) {
                        byte[] h = vv4Var.h();
                        byte[] copyOf = h != null ? Arrays.copyOf(h, h.length) : null;
                        str2 = copyOf != null ? new String(copyOf, StandardCharsets.ISO_8859_1) : null;
                    }
                    if (str2 != null) {
                        boolean J = evu0.J(str2);
                        obj = str2;
                    }
                    obj = null;
                } catch (Throwable th) {
                    obj = new Result.Failure(th);
                }
                boolean z = obj instanceof Result.Failure;
                Object obj2 = obj;
                if (z) {
                    obj2 = null;
                }
                str = (String) obj2;
            } else {
                str = vv4Var.m();
                if (str == null || evu0.J(str)) {
                    str = null;
                }
            }
            xlm0 xlm0Var = str != null ? new xlm0(str, fv4Var.b) : null;
            if (xlm0Var != null) {
                arrayList.add(xlm0Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.nlm0
    public final tpr a() {
        return this.i;
    }

    @Override // defpackage.nlm0
    public final void b(Uri uri, tls tlsVar) {
        Object failure;
        mk20 mk20Var;
        mk20 mk20Var2;
        Context context = this.d;
        this.f = false;
        i3y i3yVar = this.c;
        if (((sv4) i3yVar.getValue()) == null) {
            tlsVar.invoke("");
            this.f = true;
            return;
        }
        try {
            String type = context.getContentResolver().getType(uri);
            if (type == null) {
                type = "";
            }
            if (evu0.y(type, "pdf", true)) {
                mk20Var2 = f(uri);
            } else {
                if (!cvu0.x(type, "image/", false)) {
                    throw new IllegalStateException("Not supported mime type: ".concat(type));
                }
                if (((CommonFeatureFlag) ((b) ((yxf0) this.b).a).d(wlp.U).getData()).isEnabled()) {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                    View view = this.a;
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth() + 40, view.getHeight() + 40, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-1);
                    canvas.drawBitmap(bitmap, 20.0f, 20.0f, (Paint) null);
                    bitmap.recycle();
                    mk20Var = new mk20(new gr81(createBitmap), new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), createBitmap.getWidth(), createBitmap.getHeight());
                } else {
                    Bitmap bitmap2 = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                    mk20Var = new mk20(new gr81(bitmap2), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), bitmap2.getWidth(), bitmap2.getHeight());
                }
                mk20Var2 = mk20Var;
            }
            sv4 sv4Var = (sv4) i3yVar.getValue();
            if (sv4Var != null) {
                ((i3a1) sv4Var).d(mk20Var2).b(new h2r(8, this, tlsVar));
            }
            failure = "";
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            x4c.g("Error while processing QR by MlKit", Result.a(failure), null, null, 12);
            tlsVar.invoke("");
        }
        this.f = true;
    }

    @Override // defpackage.nlm0
    public final QrCameraType c() {
        return QrCameraType.GMS;
    }

    @Override // defpackage.nlm0
    public final void d(tls tlsVar) {
        this.g = tlsVar;
    }

    @Override // defpackage.nlm0
    public final t7v e() {
        sv4 sv4Var = (sv4) this.c.getValue();
        return sv4Var != null ? new pk20(Collections.singletonList(sv4Var), this.d.getMainExecutor(), new ot7(4, this, sv4Var)) : new exn(1);
    }

    public final mk20 f(Uri uri) {
        PdfRenderer.Page openPage = new PdfRenderer(this.d.getContentResolver().openFileDescriptor(uri, "r")).openPage(0);
        Bitmap createBitmap = Bitmap.createBitmap(j, k, Bitmap.Config.ARGB_8888);
        this.e = createBitmap;
        openPage.render(createBitmap, null, null, 1);
        return new mk20(new gr81(createBitmap), new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), createBitmap.getWidth(), createBitmap.getHeight());
    }
}

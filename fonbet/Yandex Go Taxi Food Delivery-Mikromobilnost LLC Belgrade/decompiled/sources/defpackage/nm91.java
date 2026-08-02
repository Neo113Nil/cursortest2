package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.NetworkRequest;
import android.os.Build;
import android.webkit.WebSettings;
import coil.view.Scale;
import com.yandex.go.address.models.Address;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.taxi.common_models.net.map_object.Type;
import ru.yandex.taxi.common_models.net.map_object.b0;
import ru.yandex.taxi.common_models.net.map_object.z;

/* loaded from: classes11.dex */
public abstract class nm91 {
    public static final int[] a = {13, 15, 14};

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (defpackage.l76.i(r9, r1, defpackage.jl40.l(r7, r2) ? r0.getWidth() : defpackage.m.e(r7.a, r8), defpackage.jl40.l(r7, r2) ? r0.getHeight() : defpackage.m.e(r7.b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(Drawable drawable, Bitmap.Config config, wis0 wis0Var, Scale scale, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || mga1.e(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    wis0 wis0Var2 = wis0.c;
                }
                return bitmap3;
            }
        }
        Drawable mutate = drawable.mutate();
        Bitmap.Config[] configArr = m.a;
        boolean z2 = mutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z2 ? (BitmapDrawable) mutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? mutate.getIntrinsicWidth() : bitmap2.getWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z2 ? (BitmapDrawable) mutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? mutate.getIntrinsicHeight() : bitmap.getHeight();
        int i = intrinsicHeight > 0 ? intrinsicHeight : 512;
        wis0 wis0Var3 = wis0.c;
        double i2 = l76.i(intrinsicWidth, i, jl40.l(wis0Var, wis0Var3) ? intrinsicWidth : m.e(wis0Var.a, scale), jl40.l(wis0Var, wis0Var3) ? i : m.e(wis0Var.b, scale), scale);
        int a2 = m810.a(intrinsicWidth * i2);
        int a3 = m810.a(i2 * i);
        if (config == null || mga1.e(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(a2, a3, config);
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, a2, a3);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static final int[] b(NetworkRequest networkRequest) {
        int[] capabilities;
        if (Build.VERSION.SDK_INT >= 31) {
            capabilities = networkRequest.getCapabilities();
            return capabilities;
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasCapability(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return a.I0(arrayList);
    }

    public static final b0 c(Address address) {
        z zVar;
        Object obj;
        List conditionalActions = address.getConditionalActions();
        if (conditionalActions != null) {
            List list = conditionalActions;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((hyd) it.next()).b);
            }
            Iterator it2 = tcc.o(arrayList).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((z) obj).a() == Type.POSITION_CONFIRMATION) {
                    break;
                }
            }
            zVar = (z) obj;
        } else {
            zVar = null;
        }
        if (zVar instanceof b0) {
            return (b0) zVar;
        }
        return null;
    }

    public static final int[] d(NetworkRequest networkRequest) {
        int[] transportTypes;
        if (Build.VERSION.SDK_INT >= 31) {
            transportTypes = networkRequest.getTransportTypes();
            return transportTypes;
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasTransport(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return a.I0(arrayList);
    }

    public static final String e(Context context) {
        Object failure;
        try {
            failure = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            skd0.h(PlusLogTag.SDK, "getDefaultUserAgent() failed with exception " + a2.getMessage(), a2);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        return str == null ? "Unknown WebView" : str;
    }
}

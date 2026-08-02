package xsna;

import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;
import xsna.h8z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kly0 extends e1z0 {
    public static ArrayList f(b6z0 b6z0Var, boolean z, h8z0.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (oiz0 oiz0Var : b6z0Var.c) {
            float f = oiz0Var.f;
            long j = z ? 0L : (long) (oiz0Var.h * 1000.0f);
            b6z0 a = b6z0Var.a();
            a.c.add(new z1z0(oiz0Var.a, oiz0Var.b, oiz0Var.d));
            arrayList.add(new v3z0(f, j, f, new yy4(11, a, bVar)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kly0 g(b6z0 b6z0Var, b6z0 b6z0Var2, b2z0 b2z0Var, mrc0 mrc0Var) {
        String str;
        k0z0 sqe0Var;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j;
        k0z0 alb0Var;
        String str2 = b2z0Var != null ? b2z0Var.c : "";
        final float f = 50.0f;
        try {
            if (str2.contains("=")) {
                Uri parse = Uri.parse("https://my.target.com/?".concat(str2));
                String queryParameter = parse.getQueryParameter("algorithm");
                Objects.requireNonNull(queryParameter);
                str = queryParameter.toLowerCase(Locale.ROOT);
                if ("point-100".equals(str)) {
                    String queryParameter2 = parse.getQueryParameter("percent-point");
                    Objects.requireNonNull(queryParameter2);
                    f = Float.parseFloat(queryParameter2);
                }
            } else {
                str = str2.toLowerCase(Locale.ROOT);
            }
        } catch (Throwable th) {
            th.toString();
            str = "";
        }
        int hashCode = str.hashCode();
        boolean z2 = false;
        if (hashCode != 0) {
            z = true;
            if (hashCode != 457220915) {
                if (hashCode == 1563312180 && str.equals("point-100")) {
                    alb0Var = new k0z0() { // from class: xsna.ily0
                        @Override // xsna.k0z0
                        public final Float a(View view) {
                            boolean h = kly0.h(view);
                            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (!h) {
                                int height = (int) ((f * view.getHeight()) / 100.0f);
                                Rect rect = new Rect();
                                if (view.getLocalVisibleRect(rect) && rect.top <= height && height <= rect.bottom) {
                                    f2 = 100.0f;
                                }
                            }
                            return Float.valueOf(f2);
                        }
                    };
                    sqe0Var = alb0Var;
                }
            } else if (str.equals("max-height-point")) {
                alb0Var = new alb0(12);
                sqe0Var = alb0Var;
            }
            if (b2z0Var != null) {
                arrayList = Collections.EMPTY_LIST;
                arrayList2 = arrayList;
                j = 100000;
            } else {
                ArrayList f2 = f(b6z0Var, z, mrc0Var);
                ArrayList f3 = f(b6z0Var2, z, mrc0Var);
                z2 = b2z0Var.a;
                arrayList = f2;
                arrayList2 = f3;
                j = b2z0Var.b;
            }
            return new kly0(z2, j, arrayList, arrayList2, sqe0Var);
        }
        str.equals("");
        sqe0Var = new sqe0(8);
        z = false;
        if (b2z0Var != null) {
        }
        return new kly0(z2, j, arrayList, arrayList2, sqe0Var);
    }

    public static boolean h(View view) {
        if (view.getParent() == null || view.getWindowVisibility() != 0 || view.getVisibility() != 0 || view.getAlpha() < 0.5f) {
            return true;
        }
        return view.getHeight() <= 0 || view.getWidth() <= 0;
    }
}

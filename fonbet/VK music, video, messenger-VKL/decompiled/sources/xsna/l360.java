package xsna;

import android.util.Size;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: NetworkImageMetricsListener.kt */
/* loaded from: classes.dex */
public final class l360 implements w7g0 {
    @Override // xsna.w7g0
    public final void c(uhd0 uhd0Var, Throwable th) {
        o360.b().f(uhd0Var.r().l().toString(), false);
    }

    @Override // xsna.w7g0
    public final void d(uhd0 uhd0Var) {
        o360.b().f(uhd0Var.r().l().toString(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    @Override // xsna.yhd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(uhd0 uhd0Var, String str, Map<String, String> map) {
        Size size;
        String str2;
        if (map == null) {
            map = jgp.b;
        }
        SchemeStat$TypeNetworkImagesItem.ImageFormat imageFormat = null;
        if (str.equals("NetworkFetchProducer")) {
            o360 b = o360.b();
            String uri = uhd0Var.r().l().toString();
            String str3 = map.get("is_requeued");
            b.e(str3 != null ? Boolean.valueOf(Boolean.parseBoolean(str3)) : null, uri);
            return;
        }
        if (str.equals("DecodeProducer")) {
            o360 b2 = o360.b();
            String uri2 = uhd0Var.r().l().toString();
            String str4 = map.get("encodedImageSize");
            if (str4 != null) {
                List b0 = drm0.b0(str4, new char[]{'x'}, 0, 6);
                if (b0.size() != 2) {
                    b0 = null;
                }
                if (b0 != null) {
                    List list = b0;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(arm0.m(10, (String) it.next()));
                    }
                    Integer num = (Integer) arrayList.get(0);
                    Integer num2 = (Integer) arrayList.get(1);
                    if (num != null && num2 != null) {
                        size = new Size(num.intValue(), num2.intValue());
                        str2 = map.get("imageFormat");
                        siw siwVar = hgl.a;
                        if (!epx.f(str2, "JPEG")) {
                            imageFormat = SchemeStat$TypeNetworkImagesItem.ImageFormat.JPEG;
                        } else if (epx.f(str2, "HEIF")) {
                            imageFormat = SchemeStat$TypeNetworkImagesItem.ImageFormat.HEIF;
                        } else if (epx.f(str2, "WEBP_SIMPLE") || epx.f(str2, "WEBP_LOSSLESS") || epx.f(str2, "WEBP_EXTENDED") || epx.f(str2, "WEBP_EXTENDED_WITH_ALPHA") || epx.f(str2, "WEBP_ANIMATED")) {
                            imageFormat = SchemeStat$TypeNetworkImagesItem.ImageFormat.WEBP;
                        }
                        b2.d(uri2, size, imageFormat);
                    }
                }
            }
            size = null;
            str2 = map.get("imageFormat");
            siw siwVar2 = hgl.a;
            if (!epx.f(str2, "JPEG")) {
            }
            b2.d(uri2, size, imageFormat);
        }
    }

    @Override // xsna.w7g0
    public final void h(uhd0 uhd0Var) {
        o360.b().c(uhd0Var.r().l().toString());
    }

    @Override // xsna.yhd0
    public final boolean i(uhd0 uhd0Var, String str) {
        return true;
    }

    @Override // xsna.w7g0
    public final void a(ozi0 ozi0Var) {
    }

    @Override // xsna.yhd0
    public final void j(uhd0 uhd0Var) {
    }

    @Override // xsna.yhd0
    public final void g(uhd0 uhd0Var, String str) {
    }

    @Override // xsna.yhd0
    public final void k(uhd0 uhd0Var, String str) {
    }

    @Override // xsna.yhd0
    public final void e(uhd0 uhd0Var, String str, boolean z) {
    }

    @Override // xsna.yhd0
    public final void b(uhd0 uhd0Var, String str, Throwable th, Map<String, String> map) {
    }
}

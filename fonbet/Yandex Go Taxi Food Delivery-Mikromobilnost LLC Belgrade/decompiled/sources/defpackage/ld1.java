package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.util.Pair;
import android.util.Size;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.camera.extensions.internal.sessionprocessor.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ld1 implements b731 {
    public final fyo a = new fyo();
    public final AdvancedExtenderImpl b;
    public String c;
    public final int w;

    public ld1() {
        try {
            this.b = new NightAdvancedExtenderImpl();
            this.w = 3;
        } catch (NoClassDefFoundError unused) {
            ny61.g("AdvancedExtenderImpl does not exist");
            throw null;
        }
    }

    public static List a(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            arrayList.add(new Pair(num, (Size[]) ((List) map.get(num)).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List b() {
        List list;
        c94 c94Var = c94.C;
        if (!a3c.b(c94Var) || !azo.f(c94Var)) {
            return Collections.EMPTY_LIST;
        }
        try {
            list = this.b.getAvailableCharacteristicsKeyValues();
        } catch (Throwable th) {
            sgb1.e("AdvancedVendorExtender", "Failed to retrieve available characteristics key-values!", th);
            list = null;
        }
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        c94 b = azo.b();
        c94 c94Var = c94.A;
        b.getClass();
        if (c94.b(b).compareTo(c94.b(c94Var)) >= 0) {
            try {
                Iterator it = this.b.getAvailableCaptureRequestKeys().iterator();
                while (it.hasNext()) {
                    arrayList.add((CaptureRequest.Key) it.next());
                }
            } catch (Throwable th) {
                sgb1.e("AdvancedVendorExtender", "Failed to retrieve available characteristics key-values!", th);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Map d(Size size) {
        c94 c94Var = c94.B;
        if (a3c.b(c94Var) && azo.f(c94Var)) {
            try {
                return Collections.unmodifiableMap(this.b.getSupportedPostviewResolutions(size));
            } catch (Throwable th) {
                sgb1.e("AdvancedVendorExtender", "AdvancedExtenderImpl.getSupportedPostviewResolutions throws exceptions", th);
            }
        }
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.b731
    public final List e() {
        d6z.v(this.c, "VendorExtender#init() must be called first");
        try {
            return a(this.b.getSupportedCaptureOutputResolutions(this.c));
        } catch (Throwable th) {
            sgb1.e("AdvancedVendorExtender", "AdvancedExtenderImpl.getSupportedCaptureOutputResolutions throws exceptions", th);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.b731
    public final List g() {
        c94 b = azo.b();
        c94 c94Var = c94.A;
        b.getClass();
        if (c94.b(b).compareTo(c94.b(c94Var)) >= 0) {
            try {
                return Collections.unmodifiableList(this.b.getAvailableCaptureResultKeys());
            } catch (Throwable th) {
                sgb1.e("AdvancedVendorExtender", "AdvancedExtenderImpl.getAvailableCaptureResultKeys throws exceptions", th);
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.b731
    public final boolean h(String str, LinkedHashMap linkedHashMap) {
        if (this.a.a(str)) {
            return false;
        }
        return this.b.isExtensionAvailable(str, linkedHashMap);
    }

    @Override // defpackage.b731
    public final boolean j() {
        c94 c94Var = c94.B;
        if (!a3c.b(c94Var) || !azo.f(c94Var)) {
            return false;
        }
        try {
            return this.b.isCaptureProcessProgressAvailable();
        } catch (Throwable th) {
            sgb1.e("AdvancedVendorExtender", "AdvancedExtenderImpl.isCaptureProcessProgressAvailable throws exceptions", th);
            return false;
        }
    }

    @Override // defpackage.b731
    public final void l(ar7 ar7Var) {
        this.c = ar7Var.c();
        this.b.init(this.c, sia1.e(ar7Var));
    }

    @Override // defpackage.b731
    public final Size[] n() {
        d6z.v(this.c, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    @Override // defpackage.b731
    public final List o() {
        d6z.v(this.c, "VendorExtender#init() must be called first");
        try {
            return a(this.b.getSupportedPreviewOutputResolutions(this.c));
        } catch (Throwable th) {
            sgb1.e("AdvancedVendorExtender", "AdvancedExtenderImpl.getSupportedPreviewOutputResolutions throws exceptions", th);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.b731
    public final m0r0 p(Context context) {
        d6z.v(this.c, "VendorExtender#init() must be called first");
        return new a(this.b.createSessionProcessor(), c(), this, context, this.w);
    }

    @Override // defpackage.b731
    public final boolean s() {
        c94 c94Var = c94.B;
        if (!a3c.b(c94Var) || !azo.f(c94Var)) {
            return false;
        }
        try {
            return this.b.isPostviewAvailable();
        } catch (Throwable th) {
            sgb1.e("AdvancedVendorExtender", "AdvancedExtenderImpl.isPostviewAvailable throws exceptions", th);
            return false;
        }
    }
}

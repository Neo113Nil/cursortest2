package defpackage;

import android.content.Context;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import coil.view.Scale;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlinx.serialization.json.b;

/* loaded from: classes11.dex */
public final class l76 implements k76, jc90, ku3, ec7, rr9, dso, brd0, nkw, ne20, eq50, u370, bw90, g0a0, c5c0, ueo0, ci6, d1r, b1k0, zxx0 {
    public final /* synthetic */ int a;
    public static final l76 b = new l76(0);
    public static final b40 c = new b40();
    public static final l76 w = new l76(2);
    public static final l76 x = new l76(3);
    public static final l76 y = new l76(5);
    public static final l76 z = new l76(6);
    public static final l76 A = new l76(8);
    public static final l76 B = new l76(9);
    public static final sgn C = new sgn();
    public static final l76 D = new l76(11);
    public static final l76 E = new l76(13);
    public static final l76 F = new l76(14);
    public static final l76 G = new l76(16);
    public static final l76 H = new l76(17);
    public static final l76 I = new l76(18);
    public static final l76 J = new l76(19);
    public static final l76 K = new l76(20);
    public static final l76 L = new l76(21);
    public static final l76 M = new l76(22);
    public static final l76 N = new l76(23);
    public static final l76 O = new l76(24);
    public static final l76 P = new l76(25);
    public static final l76 Q = new l76(26);
    public static final l76 R = new l76(27);
    public static final l76 S = new l76(28);
    public static final l76 T = new l76(29);

    public /* synthetic */ l76(int i) {
        this.a = i;
    }

    public static final double i(int i, int i2, int i3, int i4, Scale scale) {
        double d = i3 / i;
        double d2 = i4 / i2;
        int i5 = zxg.a[scale.ordinal()];
        if (i5 == 1) {
            return Math.max(d, d2);
        }
        if (i5 == 2) {
            return Math.min(d, d2);
        }
        w511.b();
        return 0.0d;
    }

    public static l9s j(ArrayList arrayList) {
        return new l9s((List) arrayList, true, true);
    }

    public static l9s k(int i, boolean z2, List list) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return new l9s(list, false, z2);
    }

    public static ymu l(tls tlsVar, zls zlsVar) {
        return new ymu(27, tlsVar, zlsVar);
    }

    public static byx m(b bVar) {
        return new byx(Screen.CHOOSE_B, new c430(Mode.SHUTTLE, bVar, (un0) null));
    }

    @Override // defpackage.d1r
    public boolean a(Context context, au2 au2Var) {
        List list = au2Var.a;
        if (au2Var.c() && ((String) a.P(list)).equals("share_photo")) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(kotlin.io.b.m(new File((String) a.Z(list))));
            if (mimeTypeFromExtension == null || mimeTypeFromExtension.length() <= 0) {
                mimeTypeFromExtension = null;
            }
            if (mimeTypeFromExtension != null ? cvu0.x(mimeTypeFromExtension, "image/", false) : false) {
                if (au2Var.c()) {
                    d6w n = y6i0.n(1, list.size());
                    List subList = list.subList(n.a, n.b);
                    String str = File.separator;
                    String X = a.X(subList, str, str, null, null, 60);
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
                    if (!file.exists() && !file.mkdirs()) {
                        ny61.v("Can't create file");
                        return false;
                    }
                    if (jl40.l(file.getAbsolutePath(), X) || jl40.l(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Yandex").getAbsolutePath(), X) || jl40.l(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath(), X)) {
                        return true;
                    }
                } else {
                    ny61.g("Failed requirement.");
                }
            }
        }
        return false;
    }

    @Override // defpackage.ci6
    public long b(dfq0 dfq0Var, int i) {
        String str = dfq0Var.f.a.a.b;
        return eja1.c(lhb1.e(i, str), lhb1.d(i, str));
    }

    @Override // defpackage.brd0
    public boolean c(Object obj, Object obj2) {
        return jl40.l(((dg20) obj).b(), ((dg20) obj2).b());
    }

    @Override // defpackage.brd0
    public boolean e(Object obj, Object obj2) {
        return jl40.l((dg20) obj, (dg20) obj2);
    }

    @Override // defpackage.rr9
    public float g() {
        return 2.5f;
    }

    @Override // defpackage.rr9
    public float h() {
        return 5.5f;
    }

    @Override // defpackage.rr9
    public float o() {
        return 27.0f;
    }

    @Override // defpackage.rr9
    public float r() {
        return 36.0f;
    }

    public String toString() {
        switch (this.a) {
            case 29:
                return "compact_to_details";
            default:
                return super.toString();
        }
    }
}

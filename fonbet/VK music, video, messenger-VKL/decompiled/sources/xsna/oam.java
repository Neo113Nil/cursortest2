package xsna;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.webkit.URLUtil;
import com.vk.dto.common.DialogBackground;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.lam;
import xsna.u6x;
import xsna.ykr0;

/* compiled from: DialogBackgroundProcessJob.kt */
/* loaded from: classes.dex */
public final class oam extends u4w {
    public final String c;
    public final long d;
    public final lam.a e;
    public final lam.a f;
    public final zkr0 g = new zkr0(new hne(4), new cs7(this, 1));

    /* compiled from: DialogBackgroundProcessJob.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(w2w w2wVar, lam lamVar, boolean z) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            boolean z2 = false;
            ref$BooleanRef.element = hpo0.d(lamVar, "light") != null;
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            ref$BooleanRef2.element = hpo0.d(lamVar, "dark") != null;
            w2wVar.O0().b("DialogBackgroundProcessJob " + lamVar.a + ' ' + lamVar.b, new zgb(lamVar, ref$BooleanRef, ref$BooleanRef2, 2));
            boolean z3 = ref$BooleanRef.element;
            if (z3 && ref$BooleanRef2.element) {
                z2 = true;
            }
            lam.a aVar = !z3 ? lamVar.c : null;
            lam.a aVar2 = ref$BooleanRef2.element ? null : lamVar.d;
            oam oamVar = new oam(lamVar.a, lamVar.b, aVar, aVar2);
            if (z2) {
                return;
            }
            if (aVar == null && aVar2 == null) {
                return;
            }
            if (z) {
                w2wVar.O0().d(oamVar);
            } else {
                w2wVar.O0().a(oamVar);
            }
        }
    }

    /* compiled from: DialogBackgroundProcessJob.kt */
    public static final class b implements s7x<oam> {
        @Override // xsna.s7x
        public final oam a(ny90 ny90Var) {
            return new oam(ny90Var.f("name"), ny90Var.e("updated_time"), mam.a(ny90Var.f("model_light")), mam.a(ny90Var.f("model_dark")));
        }

        @Override // xsna.s7x
        public final void b(oam oamVar, ny90 ny90Var) {
            oam oamVar2 = oamVar;
            ny90Var.o("name", oamVar2.c);
            ny90Var.n("updated_time", oamVar2.d);
            lam.a aVar = oamVar2.e;
            String jSONObject = aVar != null ? mam.b(aVar).toString() : null;
            if (jSONObject == null) {
                jSONObject = "";
            }
            ny90Var.o("model_light", jSONObject);
            lam.a aVar2 = oamVar2.f;
            String jSONObject2 = aVar2 != null ? mam.b(aVar2).toString() : null;
            ny90Var.o("model_dark", jSONObject2 != null ? jSONObject2 : "");
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DialogBackgroundProcessJob";
        }
    }

    public oam(String str, long j, lam.a aVar, lam.a aVar2) {
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = xsna.bz2.b(new xsna.o8o(r3, com.vk.core.files.a.p(), false, 0), null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Uri Q(String str) {
        File b2;
        if (URLUtil.isNetworkUrl(str) && b2 != null && hpo0.f(b2)) {
            return Uri.fromFile(b2);
        }
        return null;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        Uri R = R(this.c, this.d, "light", this.e);
        Uri R2 = R(this.c, this.d, "dark", this.f);
        if (hpo0.g(R) || hpo0.g(R2)) {
            if (R == null) {
                R = Uri.EMPTY;
            }
            if (R2 == null) {
                R2 = Uri.EMPTY;
            }
            w2wVar.S0().g(new DialogBackground(this.c, R, R2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public final Uri R(String str, long j, String str2, lam.a aVar) {
        ?? r8;
        ?? r10;
        ykr0.c cVar;
        List<String> b2;
        String a2;
        Uri b3;
        File c = hpo0.c(hpo0.a(j, str, str2));
        if (hpo0.f(c)) {
            return Uri.fromFile(c);
        }
        r4 = null;
        ykr0 ykr0Var = null;
        if (aVar == null) {
            return null;
        }
        String a3 = hpo0.a(j, str, str2);
        if (aVar.a() != null) {
            String a4 = aVar.a().a();
            File c2 = hpo0.c(a3);
            if (hpo0.f(c2)) {
                return Uri.fromFile(c2);
            }
            Uri Q = Q(a4);
            return (Q == null || (b3 = hpo0.b(Q, c2)) == null) ? Uri.EMPTY : b3;
        }
        if (aVar.b() == null) {
            return Uri.EMPTY;
        }
        lam.a.b b4 = aVar.b();
        File c3 = hpo0.c(a3);
        if (!hpo0.f(c3)) {
            if (b4.d() != null || b4.a() != null || b4.b() != null || b4.c() != null) {
                lam.a.b.d d = b4.d();
                Uri Q2 = (d == null || (a2 = d.a()) == null) ? null : Q(a2);
                if (b4.d() == null || Q2 != null) {
                    lam.a.b.d d2 = b4.d();
                    ykr0.d dVar = (Q2 == null || d2 == null) ? null : new ykr0.d(Q2.toString(), d2.d(), d2.b(), d2.c(), d2.e());
                    List<lam.a.b.C3245b> b5 = b4.b();
                    if (b5 != null) {
                        List<lam.a.b.C3245b> list = b5;
                        r8 = new ArrayList(c5g.u(list, 10));
                        for (lam.a.b.C3245b c3245b : list) {
                            r8.add(new ykr0.b(c3245b.d(), c3245b.e(), c3245b.b(), c3245b.c(), Color.parseColor(c3245b.a())));
                        }
                    } else {
                        r8 = EmptyList.b;
                    }
                    lam.a.b.c c4 = b4.c();
                    if (c4 == null || (b2 = c4.b()) == null) {
                        r10 = 0;
                    } else {
                        List<String> list2 = b2;
                        r10 = new ArrayList(c5g.u(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            r10.add(Integer.valueOf(Color.parseColor((String) it.next())));
                        }
                    }
                    if (r10 == 0) {
                        r10 = EmptyList.b;
                    }
                    if (c4 != null) {
                        int size = r10.size();
                        EmptyList emptyList = r10;
                        if (size <= 1) {
                            emptyList = EmptyList.b;
                        }
                        cVar = new ykr0.c(emptyList, c4.a());
                    } else {
                        cVar = null;
                    }
                    lam.a.b.C3244a a5 = b4.a();
                    ykr0Var = new ykr0(dVar, r8, cVar, a5 != null ? new ykr0.a(a5.b(), a5.c(), Color.parseColor(a5.a())) : null);
                }
            }
            if (ykr0Var == null) {
                return Uri.EMPTY;
            }
            Bitmap b6 = this.g.b(ykr0Var, iah0.f().widthPixels, iah0.f().heightPixels);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(c3);
                try {
                    Bitmap.CompressFormat compressFormat = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
                    bpn0 bpn0Var = hpo0.a;
                    b6.compress(compressFormat, 80, fileOutputStream);
                    fileOutputStream.close();
                } finally {
                }
            } catch (IOException e) {
                L.E(e, new Object[0]);
                hpo0.i(a3);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        return Uri.fromFile(c3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oam)) {
            return false;
        }
        oam oamVar = (oam) obj;
        return epx.f(this.c, oamVar.c) && this.d == oamVar.d && epx.f(this.e, oamVar.e) && epx.f(this.f, oamVar.f);
    }

    public final int hashCode() {
        int a2 = bh10.a(this.c.hashCode() * 31, 31, this.d);
        lam.a aVar = this.e;
        int hashCode = (a2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        lam.a aVar2 = this.f;
        return hashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.r(this.c);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogBackgroundProcessVectorCmd";
    }

    public final String toString() {
        return "DialogBackgroundProcessJob(name=" + this.c + ", updatedTime=" + this.d + ", lightThemeData=" + this.e + ", darkThemeData=" + this.f + ')';
    }
}

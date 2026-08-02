package xsna;

import android.database.DatabaseUtils;
import android.net.Uri;
import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.c;
import com.vk.toggle.features.ImFeatures;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.NotImplementedError;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gam;
import xsna.lam;

/* compiled from: DialogBackgroundStorageImpl.kt */
/* loaded from: classes2.dex */
public final class sam implements ram {
    public static final bpn0 d = new bpn0(new a44(12));
    public static final List<DialogBackground.Size> e = e43.l(DialogBackground.Size.XXXHDIP, DialogBackground.Size.XXHDIP, DialogBackground.Size.XHDIP, DialogBackground.Size.HDIP);
    public final gam a;
    public final cil0<DialogBackground> b;
    public volatile boolean c;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((lam) t).f), Integer.valueOf(((lam) t2).f));
        }
    }

    /* compiled from: DialogBackgroundStorageImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<fam, lam> {
        @Override // xsna.izs
        public final lam invoke(fam famVar) {
            sam samVar = (sam) this.receiver;
            bpn0 bpn0Var = sam.d;
            samVar.getClass();
            return sam.n(famVar);
        }
    }

    public sam(tgl0 tgl0Var) {
        gam gamVar = new gam(tgl0Var);
        this.a = gamVar;
        this.b = tgl0Var.c(DialogBackground.class);
        int i = tgl0Var.a().getInt("dialog_background_storage_version", 0);
        while (i < gamVar.c) {
            gam gamVar2 = this.a;
            if (i == 0) {
                String str = c.C1124c.c.a;
                Uri uri = Uri.EMPTY;
                fam famVar = new fam(str, "", uri, uri);
                gamVar2.getClass();
                tgl0 tgl0Var2 = gamVar2.b;
                tgl0Var2.b().h(new h1(11, gamVar2, Collections.singletonList(famVar)));
                File[] listFiles = ((File) d.getValue()).listFiles();
                List A = listFiles != null ? rli0.A(rli0.t(rli0.j(rl3.D(listFiles), new dj1(26)), new fj1(21))) : null;
                tgl0Var2.b().h(new h1(11, gamVar2, A == null ? EmptyList.b : A));
            } else if (i == 1) {
                mey a2 = tgl0Var.a();
                fam c = this.a.c(c.h.c.a);
                DialogBackground dialogBackground = c != null ? new DialogBackground(c.a, c.c, (Uri) null, 4, (zcl) null) : null;
                if (dialogBackground != null) {
                    a2.putString(fto0.w("sidepack_background_uri"), dialogBackground.c);
                }
            } else if (i == 2) {
                mey a3 = tgl0Var.a();
                lam e2 = e(c.h.c.a);
                if (e2 != null) {
                    Uri d2 = hpo0.d(e2, "light");
                    String uri2 = d2 != null ? d2.toString() : null;
                    a3.putString(fto0.w("sidepack_background_uri"), uri2 != null ? uri2 : "");
                }
            } else {
                if (i != 3) {
                    throw new NotImplementedError("An operation is not implemented: Implement migration in DialogBackgroundDb");
                }
                Collection<fam> b2 = gamVar2.b();
                ArrayList arrayList = new ArrayList(c5g.u(b2, 10));
                for (fam famVar2 : b2) {
                    arrayList.add(new fam(famVar2.a, famVar2.b, famVar2.c, famVar2.d, !epx.f(famVar2.a, c.h.c.a) ? 1 : 0, famVar2.f, famVar2.g, famVar2.h, famVar2.i));
                }
                gamVar2.b.b().h(new h1(11, gamVar2, arrayList));
            }
            i++;
            tgl0Var.a().putInt("dialog_background_storage_version", i);
        }
    }

    public static void l(long j, String str, String str2, String str3) {
        if (!epx.f(str, c.h.c.a)) {
            hpo0.i(hpo0.a(j, str, str2));
        } else if (str3 != null) {
            bpn0 bpn0Var = hpo0.a;
            hpo0.h(sv1.E(Uri.parse(str3)));
        }
    }

    public static lam n(fam famVar) {
        return new lam(famVar.a, famVar.f, mam.a(famVar.g), mam.a(famVar.h), famVar.i, famVar.e);
    }

    @Override // xsna.ram
    public final boolean a(long j, String str) {
        fam c = this.a.c(str);
        return c != null && c.f == j;
    }

    @Override // xsna.ram
    public final ArrayList b() {
        List<lam> all = getAll();
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (!((lam) obj).e) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // xsna.ram
    public final void c(String str) {
        gam gamVar = this.a;
        if (gamVar.c(str) != null) {
            if (gamVar.b.b().f(gamVar.a.a, gam.a.NAME.getKey() + " = ?", new String[]{DatabaseUtils.sqlEscapeString(str)}) > 0) {
                cil0<DialogBackground> cil0Var = this.b;
                if (cil0Var != null) {
                    cil0Var.c(EmptyList.b);
                }
                k(str);
            }
        }
    }

    @Override // xsna.ram
    public final ArrayList d(List list) {
        Set S0 = j5g.S0(list);
        Collection<fam> b2 = this.a.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b2) {
            if (S0.contains(((fam) obj).a)) {
                arrayList.add(obj);
            }
        }
        List D0 = j5g.D0(new h8p0(2), arrayList);
        ArrayList arrayList2 = new ArrayList(c5g.u(D0, 10));
        Iterator it = D0.iterator();
        while (it.hasNext()) {
            arrayList2.add(n((fam) it.next()));
        }
        return arrayList2;
    }

    @Override // xsna.ram
    public final lam e(String str) {
        fam c = this.a.c(str);
        if (c != null) {
            return n(c);
        }
        return null;
    }

    @Override // xsna.ram
    public final void f(lam lamVar) {
        String str = lamVar.a;
        fam c = this.a.c(str);
        lam e2 = e(str);
        String str2 = lamVar.a;
        String valueOf = String.valueOf(System.currentTimeMillis());
        Uri uri = c != null ? c.c : null;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        Uri uri2 = c != null ? c.d : null;
        if (uri2 == null) {
            uri2 = Uri.EMPTY;
        }
        Uri uri3 = uri2;
        long j = lamVar.b;
        lam.a aVar = lamVar.c;
        String jSONObject = aVar != null ? mam.b(aVar).toString() : null;
        String str3 = jSONObject == null ? "" : jSONObject;
        lam.a aVar2 = lamVar.d;
        String jSONObject2 = aVar2 != null ? mam.b(aVar2).toString() : null;
        fam famVar = new fam(str2, valueOf, uri, uri3, lamVar.f, j, str3, jSONObject2 == null ? "" : jSONObject2, lamVar.e);
        List l = e43.l(hpo0.a(j, str2, "light"), hpo0.a(j, str2, "dark"));
        File[] listFiles = ((File) hpo0.a.getValue()).listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                if (brm0.B(file.getName(), str2, false) && !l.contains(file.getName())) {
                    arrayList.add(file);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hpo0.h((File) it.next());
            }
        }
        m(str, e2, famVar);
    }

    @Override // xsna.ram
    public final void g(String str, Uri uri, int i, int i2) {
        String uri2;
        Uri uri3;
        Uri uri4;
        String str2;
        String str3;
        fam c = this.a.c(str);
        DialogBackground dialogBackground = c != null ? new DialogBackground(c.a, c.c, (Uri) null, 4, (zcl) null) : null;
        lam e2 = e(str);
        bpn0 bpn0Var = hpo0.a;
        Uri b2 = hpo0.b(uri, hpo0.c(UUID.randomUUID().toString()));
        if (b2 == null || (uri2 = b2.toString()) == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(currentTimeMillis);
        if (dialogBackground == null || (str3 = dialogBackground.c) == null || (uri3 = Uri.parse(str3)) == null) {
            uri3 = Uri.EMPTY;
        }
        if (dialogBackground == null || (str2 = dialogBackground.d) == null || (uri4 = Uri.parse(str2)) == null) {
            uri4 = Uri.EMPTY;
        }
        m(str, e2, new fam(str, valueOf, uri3, uri4, 0, currentTimeMillis, mam.b(new lam.a(new lam.a.C3243a(uri2, i, i2), 1)).toString(), mam.b(new lam.a(new lam.a.C3243a(uri2, i, i2), 1)).toString(), false));
    }

    @Override // xsna.ram
    public final List<lam> getAll() {
        ulp0 ulp0Var = new ulp0(new i5g(this.a.b()), new b(1, this, sam.class, "toDialogBackgroundModel", "toDialogBackgroundModel(Lcom/vk/im/engine/internal/storage/delegates/dialogs/DialogBackgroundData;)Lcom/vk/im/engine/models/chats/DialogBackgroundModel;", 0));
        a aVar = new a();
        List B = rli0.B(ulp0Var);
        g5g.L(B, aVar);
        Iterator it = ((ArrayList) B).iterator();
        if (!it.hasNext()) {
            return EmptyList.b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList b2 = y57.b(next);
        while (it.hasNext()) {
            b2.add(it.next());
        }
        return b2;
    }

    @Override // xsna.ram
    public final void h() {
        this.c = true;
    }

    @Override // xsna.ram
    public final boolean i() {
        return this.c;
    }

    @Override // xsna.ram
    public final boolean j(String str) {
        lam e2 = e(str);
        if (e2 != null) {
            return hpo0.e(e2);
        }
        return false;
    }

    public final void k(String str) {
        fam c = this.a.c(str);
        if (c != null) {
            try {
                long j = c.f;
                String str2 = c.g;
                lam.a.C3243a c3243a = mam.a(str2).b;
                l(j, str, "light", c3243a != null ? c3243a.a : null);
                ImFeatures imFeatures = ImFeatures.BACKGROUND_LOSS_FIX;
                imFeatures.getClass();
                lam.a.C3243a c3243a2 = (com.vk.toggle.b.A.a(imFeatures) ? mam.a(c.h) : mam.a(str2)).b;
                l(j, str, "dark", c3243a2 != null ? c3243a2.a : null);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        }
    }

    public final void m(String str, lam lamVar, fam famVar) {
        cil0<DialogBackground> cil0Var;
        if (lamVar != null) {
            k(str);
        }
        gam gamVar = this.a;
        gamVar.getClass();
        gamVar.b.b().h(new h1(11, gamVar, Collections.singletonList(famVar)));
        lam e2 = e(str);
        if (e2 == null || (cil0Var = this.b) == null) {
            return;
        }
        cil0Var.b(lamVar != null ? hpo0.j(lamVar) : null, hpo0.j(e2));
    }
}

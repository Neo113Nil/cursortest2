package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.media3.database.DatabaseIOException;
import com.squareup.tape.FileException;
import com.squareup.wire.ProtoAdapter;
import com.yandex.go.account.user_verification.domain.i;
import com.yandex.go.feedback_common.services.FeedbackTask;
import com.yandex.go.payments.paymentlist.ui.IconType;
import com.yandex.go.payments.ui.PaymentIconInfoType;
import com.yandex.go.profile.domain.flex.a;
import com.yandex.go.profile.domain.flex.f;
import com.yandex.go.taxi.order.models.api.affiliate.AffiliateInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.KSerializer;
import ru.yandex.alice.megamind.protos.scenarios.directive.deeplinks.TOpenUriDirective;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.perf.b;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes.dex */
public final class cxq0 implements ed7, y49, bnj, k5t0, qp60, z0x {
    public static cxq0 y;
    public static final String[] z = {"id", "key", kju0.j};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;

    public cxq0(z8g z8gVar, p8g p8gVar) {
        this.a = 10;
        this.b = z8gVar;
        this.c = p8gVar;
        pw pwVar = p8gVar.f0;
        this.w = new dld0(pwVar, z8gVar.s0, 29);
        this.x = new xj(z8gVar.W, z8gVar.y, p8gVar.f, p8gVar.h0, z8gVar.N, z8gVar.e0, p8gVar.S0, p8gVar.l, z8gVar.f0, z8gVar.e, pwVar, 5);
    }

    public static synchronized cxq0 v() {
        cxq0 cxq0Var;
        synchronized (cxq0.class) {
            try {
                if (y == null) {
                    y = new cxq0();
                }
                cxq0Var = y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cxq0Var;
    }

    public void A(String str) {
        Set set = (Set) this.x;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        j9a0 j9a0Var = (j9a0) this.w;
        int d = qv10.d("ru.yandex.taxi.paymentmethods.badges.show_count.", str, j9a0Var.a, 0);
        cne0 cne0Var = j9a0Var.a;
        cne0Var.p(d + 1, g8e.o("ru.yandex.taxi.paymentmethods.badges.show_count.", str));
        if (d == 0) {
            cne0Var.q(System.currentTimeMillis(), g8e.o("ru.yandex.taxi.paymentmethods.badges.first_show_time.", str));
        }
    }

    public void B(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.b;
        str.getClass();
        ia31.b(sQLiteDatabase, 1, str);
        String str2 = (String) this.x;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.x) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public nef0 C(p8w0 p8w0Var) {
        yff0 yff0Var = (yff0) this.b;
        String str = p8w0Var.a;
        String str2 = p8w0Var.b;
        yuf0 yuf0Var = yff0Var.a;
        f fVar = new f(str, str2, (mgf0) ((xvf0) yuf0Var.a).get(), (ajr) ((u5g) yuf0Var.b).get(), (rgf0) ((xvf0) yuf0Var.c).get(), (xv11) ((u5g) yuf0Var.d).get(), (i) ((xvf0) yuf0Var.e).get(), (wnt) ((u5g) yuf0Var.f).get());
        gef0 gef0Var = (gef0) this.c;
        String str3 = p8w0Var.a;
        String str4 = p8w0Var.b;
        ofa0 ofa0Var = gef0Var.a;
        return new nef0(fVar, new a((tse) ((u5g) ofa0Var.b).get(), (zef0) ((xvf0) ofa0Var.a).get(), (b) ((xvf0) ofa0Var.c).get(), i5m.a((xvf0) ofa0Var.w), str3, str4), ((mjr) this.w).a(jjr.x, (com.yandex.div.core.expression.variables.a) this.x));
    }

    public void D() {
        ((ru.yandex.taxi.badge.b) this.c).b((ViewGroup) this.x, (String) this.b, new a59());
    }

    @Override // defpackage.z0x
    public v0x a(int i) {
        Object obj = ((LinkedHashMap) this.x).get(Integer.valueOf(i));
        if (obj != null) {
            return (v0x) obj;
        }
        ny61.g("Each view type should be associated with some item adapter");
        return null;
    }

    @Override // defpackage.ed7
    public void b(long j) {
        String hexString = Long.toHexString(j);
        this.b = hexString;
        this.x = g8e.o("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.z0x
    public v0x c(u0x u0xVar) {
        return t(u0xVar);
    }

    @Override // defpackage.k5t0
    public void cancel() {
        ((Socket) this.b).close();
    }

    @Override // defpackage.ed7
    public void d(HashMap hashMap) {
        try {
            SQLiteDatabase writableDatabase = ((lqg) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                B(writableDatabase);
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    p(writableDatabase, (dd7) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.w).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.ed7
    public void delete() {
        lqg lqgVar = (lqg) this.c;
        String str = (String) this.b;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = lqgVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = ia31.a;
                try {
                    int i2 = tw21.a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(concat));
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.k5t0
    public uis0 e() {
        return (lkh) this.x;
    }

    @Override // defpackage.qp60
    public void f(FeedbackTask feedbackTask) {
        n0r n0rVar = (n0r) this.c;
        try {
            n0rVar.reset();
            hzk hzkVar = (hzk) this.x;
            hzkVar.getClass();
            if (feedbackTask != null) {
                wnt wntVar = (wnt) hzkVar.a;
                KSerializer kSerializer = (KSerializer) hzkVar.b;
                sbx a = ((xnt) wntVar).a.a();
                KSerializer kSerializer2 = kSerializer;
                qdx qdxVar = new qdx(n0rVar);
                byte[] bArr = (byte[]) qdxVar.w;
                try {
                    s8o.k(a, qdxVar, kSerializer2, feedbackTask);
                    qdxVar.n();
                    ui9.c.a((char[]) qdxVar.x);
                    n67.c.a(bArr);
                } catch (Throwable th) {
                    qdxVar.n();
                    ui9.c.a((char[]) qdxVar.x);
                    n67.c.a(bArr);
                    throw th;
                }
            }
            ((zjg0) this.b).a(n0rVar.size(), n0rVar.a());
        } catch (IOException e) {
            throw new FileException("Failed to add entry.", e, (File) this.w);
        }
    }

    @Override // defpackage.z0x
    public int g(u0x u0xVar) {
        return t(u0xVar).a;
    }

    @Override // defpackage.k5t0
    public y9t0 getSource() {
        return (mkh) this.w;
    }

    @Override // defpackage.bnj
    public void h(smj smjVar) {
        syj0 a;
        if (jl40.l(smjVar.b(), "open_uri")) {
            gnj c = smjVar.c();
            t830 t830Var = (t830) this.w;
            ProtoAdapter<TOpenUriDirective> protoAdapter = TOpenUriDirective.ADAPTER;
            if (c instanceof fnj) {
                a = t830Var.a(TOpenUriDirective.class, ((fnj) c).a()).a(b4h.a);
            } else {
                if (!(c instanceof enj)) {
                    w511.b();
                    return;
                }
                a = jaa1.a(protoAdapter, ((enj) c).a()).a(c4h.a);
            }
            if (a instanceof lyj0) {
                ((e4h) this.b).a(Uri.parse(((TOpenUriDirective) ((lyj0) a).a).getUri()));
            } else if (!(a instanceof jyj0)) {
                w511.b();
            } else {
                ((zwf0) this.c).f("DeeplinksDirectiveHandler", b64.l("Fail to deserialize ", qoi0.a(c.getClass()).d(), " open uri directive ", ((txg) ((jyj0) a).a).a()));
            }
        }
    }

    @Override // defpackage.ed7
    public void i(dd7 dd7Var) {
        ((SparseArray) this.w).put(dd7Var.a, dd7Var);
    }

    @Override // defpackage.ed7
    public boolean j() {
        try {
            SQLiteDatabase readableDatabase = ((lqg) this.c).getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            return ia31.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.ed7
    public void k(HashMap hashMap) {
        SparseArray sparseArray = (SparseArray) this.w;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((lqg) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    dd7 dd7Var = (dd7) sparseArray.valueAt(i);
                    if (dd7Var == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = (String) this.x;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        p(writableDatabase, dd7Var);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.ed7
    public void l(dd7 dd7Var, boolean z2) {
        SparseArray sparseArray = (SparseArray) this.w;
        int i = dd7Var.a;
        if (z2) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // defpackage.bnj
    public Set m() {
        return (Set) this.x;
    }

    @Override // defpackage.z0x
    public void n() {
        Iterator it = ((LinkedHashMap) this.x).values().iterator();
        while (it.hasNext()) {
            ((v0x) it.next()).getClass();
        }
    }

    @Override // defpackage.ed7
    public void o(HashMap hashMap, SparseArray sparseArray) {
        lqg lqgVar = (lqg) this.c;
        d6z.x(((SparseArray) this.w).size() == 0);
        try {
            SQLiteDatabase readableDatabase = lqgVar.getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            if (ia31.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = lqgVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    B(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = lqgVar.getReadableDatabase();
            String str2 = (String) this.x;
            str2.getClass();
            Cursor query = readableDatabase2.query(str2, z, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    string.getClass();
                    hashMap.put(string, new dd7(i, string, yuf0.h(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            query.close();
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new DatabaseIOException(e);
        }
    }

    public void p(SQLiteDatabase sQLiteDatabase, dd7 dd7Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuf0.i(dd7Var.d(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(dd7Var.a));
        contentValues.put("key", dd7Var.b);
        contentValues.put(kju0.j, byteArray);
        String str = (String) this.x;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    @Override // defpackage.qp60
    public Object peek() {
        byte[] bArr;
        try {
            zjg0 zjg0Var = (zjg0) this.b;
            synchronized (zjg0Var) {
                if (zjg0Var.e()) {
                    bArr = null;
                } else {
                    vjg0 vjg0Var = zjg0Var.d;
                    int i = vjg0Var.c;
                    bArr = new byte[i];
                    zjg0Var.i(vjg0Var.b + 4, 0, i, bArr);
                }
            }
            if (bArr == null) {
                return null;
            }
            hzk hzkVar = (hzk) this.x;
            return ((xnt) ((wnt) hzkVar.a)).b(new ByteArrayInputStream(bArr), (KSerializer) hzkVar.b);
        } catch (IOException e) {
            throw new FileException("Failed to peek.", e, (File) this.w);
        }
    }

    public boolean q(String str, Integer num, Integer num2) {
        int d;
        if (!((Set) this.x).contains(str)) {
            cne0 cne0Var = ((j9a0) this.w).a;
            if (num != null && (d = qv10.d("ru.yandex.taxi.paymentmethods.badges.show_count.", str, cne0Var, 0)) != 0) {
                if (num2 != null) {
                    int intValue = num2.intValue();
                    long j = cne0Var.j("ru.yandex.taxi.paymentmethods.badges.first_show_time." + str, 0L);
                    if (j != 0 && (System.currentTimeMillis() - j) / 86400000 >= intValue) {
                        cne0Var.w("ru.yandex.taxi.paymentmethods.badges.show_count." + str);
                        cne0Var.w("ru.yandex.taxi.paymentmethods.badges.first_show_time." + str);
                        return true;
                    }
                }
                if (d >= num.intValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public m1a0 r(String str, String str2, String str3, IconType iconType) {
        t0a0 e = ((com.yandex.go.payments.common.a) ((u0a0) this.x)).e(PaymentIconInfoType.ICON_TAG, str3, new uyz(iconType, 0));
        if (str2 == null) {
            str2 = "";
        }
        return new m1a0(str, str2, e, o0a0.c, null, false, null);
    }

    @Override // defpackage.qp60
    public void remove() {
        try {
            ((zjg0) this.b).h();
        } catch (IOException e) {
            throw new FileException("Failed to remove.", e, (File) this.w);
        }
    }

    public AffiliateInfo s(Uri uri) {
        String a = og21.a(uri, "ref");
        if (a == null || evu0.J(a)) {
            return null;
        }
        Calendar b = ((jtq0) this.w).b(null);
        yqg yqgVar = (yqg) this.x;
        Date time = b.getTime();
        TimeZone timeZone = b.getTimeZone();
        yqgVar.getClass();
        ThreadLocal threadLocal = zqg.c;
        return new AffiliateInfo(uh6.s(time, timeZone), a);
    }

    @Override // defpackage.qp60
    public int size() {
        int i;
        zjg0 zjg0Var = (zjg0) this.b;
        synchronized (zjg0Var) {
            i = zjg0Var.c;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v0x t(u0x u0xVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.w;
        Object g = u0xVar instanceof r7u ? ((r7u) u0xVar).g() : qoi0.a(u0xVar.getClass());
        v0x v0xVar = (v0x) linkedHashMap.get(g);
        if (v0xVar != null) {
            return v0xVar;
        }
        v0x a = ((okx) this.b).a(g);
        if (a == null) {
            a = (v0x) this.c;
        }
        linkedHashMap.put(g, a);
        ((LinkedHashMap) this.x).put(Integer.valueOf(a.a), a);
        return a;
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return ((Socket) this.b).toString();
            default:
                return super.toString();
        }
    }

    public j4a0 u(u0k u0kVar, boolean z2) {
        Object obj;
        Object obj2;
        g9a0 g9a0Var = (g9a0) this.c;
        uj4 uj4Var = (uj4) this.b;
        if (u0kVar instanceof lea0) {
            String c = vez0.c(u0kVar);
            String V = vez0.V(u0kVar);
            if (c != null) {
                Iterator it = uj4Var.a.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    mw90 mw90Var = (mw90) obj2;
                    if (jl40.l(mw90Var.e(), c)) {
                        if (mw90Var.g().isEmpty()) {
                            break;
                        }
                        List g = mw90Var.g();
                        if (!(g instanceof Collection) || !g.isEmpty()) {
                            Iterator it2 = g.iterator();
                            while (it2.hasNext()) {
                                if (cvu0.t((String) it2.next(), V, true)) {
                                    break loop0;
                                }
                            }
                        }
                    }
                }
                mw90 mw90Var2 = (mw90) obj2;
                if (mw90Var2 != null && ((!z2 || mw90Var2.b()) && q(mw90Var2.c(), mw90Var2.d(), mw90Var2.f()))) {
                    A(mw90Var2.c());
                    String c2 = mw90Var2.c();
                    g9a0Var.getClass();
                    g9a0Var.a.a("PaymentMethods.Badge.Shown", x4e.p("id", c2), 1, new HashMap());
                    return new j4a0(mw90Var2.a(), mw90Var2.h(), mw90Var2.i());
                }
            }
        } else {
            if (!(u0kVar instanceof vi0)) {
                w511.b();
                return null;
            }
            String c3 = vez0.c(u0kVar);
            if (c3 != null) {
                Iterator it3 = uj4Var.b.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (evu0.y(c3, ((cg0) obj).d(), false)) {
                        break;
                    }
                }
                cg0 cg0Var = (cg0) obj;
                if (cg0Var != null && q(cg0Var.b(), cg0Var.c(), cg0Var.e())) {
                    A(cg0Var.b());
                    String b = cg0Var.b();
                    g9a0Var.getClass();
                    g9a0Var.a.a("PaymentMethods.Badge.Shown", x4e.p("id", b), 1, new HashMap());
                    return new j4a0(cg0Var.a(), cg0Var.f(), cg0Var.g());
                }
            }
        }
        return null;
    }

    public w040 w() {
        z8g z8gVar = (z8g) this.b;
        Handler c = z8gVar.c();
        q5z.i(z8gVar.a.a);
        p8g p8gVar = (p8g) this.c;
        SharedPreferences sharedPreferences = (SharedPreferences) p8gVar.r.get();
        return new w040(c, sharedPreferences, i5m.a(p8gVar.z), i5m.a(p8gVar.o), i5m.a((dld0) this.w), p8gVar.a, i5m.a(p8gVar.u1), (com.yandex.messaging.internal.storage.i) z8gVar.E.get());
    }

    public boolean x(Context context) {
        if (((Boolean) this.w) == null) {
            this.w = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.w).booleanValue();
    }

    public boolean y(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.c).booleanValue();
    }

    public void z() {
        ru.yandex.taxi.badge.b bVar = (ru.yandex.taxi.badge.b) this.c;
        kn4 kn4Var = bVar.e;
        if (kn4Var != null) {
            kn4Var.b();
        }
        bVar.d.b();
    }

    public cxq0(cop0 cop0Var) {
        this.a = 25;
        this.b = cop0Var;
        int i = 0;
        this.c = kotlin.a.a(new l2z(i, this, "sdk-config.graphql"));
        this.w = kotlin.a.a(new l2z(i, this, "experiments.graphql"));
        this.x = tje.a(sbx.d, new p0u(17));
    }

    public cxq0(zuj0 zuj0Var) {
        this.a = 15;
        this.b = zuj0Var;
        final int i = 0;
        this.c = kotlin.a.a(new sls(this) { // from class: qei
            public final /* synthetic */ cxq0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                cxq0 cxq0Var = this.b;
                switch (i2) {
                    case 0:
                        return ((avj0) ((zuj0) cxq0Var.b)).h(pzh0.delivery_ndd_map_scheme);
                    case 1:
                        return ((avj0) ((zuj0) cxq0Var.b)).h(pzh0.delivery_ndd_map_host);
                    default:
                        return ((avj0) ((zuj0) cxq0Var.b)).h(pzh0.delivery_ndd_map_path);
                }
            }
        });
        final int i2 = 1;
        this.w = kotlin.a.a(new sls(this) { // from class: qei
            public final /* synthetic */ cxq0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                cxq0 cxq0Var = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) ((zuj0) cxq0Var.b)).h(pzh0.delivery_ndd_map_scheme);
                    case 1:
                        return ((avj0) ((zuj0) cxq0Var.b)).h(pzh0.delivery_ndd_map_host);
                    default:
                        return ((avj0) ((zuj0) cxq0Var.b)).h(pzh0.delivery_ndd_map_path);
                }
            }
        });
        final int i3 = 2;
        this.x = kotlin.a.a(new sls(this) { // from class: qei
            public final /* synthetic */ cxq0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                cxq0 cxq0Var = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) ((zuj0) cxq0Var.b)).h(pzh0.delivery_ndd_map_scheme);
                    case 1:
                        return ((avj0) ((zuj0) cxq0Var.b)).h(pzh0.delivery_ndd_map_host);
                    default:
                        return ((avj0) ((zuj0) cxq0Var.b)).h(pzh0.delivery_ndd_map_path);
                }
            }
        });
    }

    public cxq0(b03 b03Var, wnt wntVar, dne0 dne0Var) {
        this.a = 8;
        this.b = b03Var;
        this.c = dne0Var;
        this.w = wntVar;
        this.x = kotlin.a.a(new d9(27, this));
    }

    public cxq0(e4h e4hVar, zwf0 zwf0Var, t830 t830Var) {
        this.a = 11;
        this.b = e4hVar;
        this.c = zwf0Var;
        this.w = t830Var;
        this.x = Collections.singleton(new dnj("open_uri"));
    }

    public cxq0(ru.yandex.taxi.badge.b bVar, ViewGroup viewGroup, String str) {
        this.a = 7;
        this.c = bVar;
        this.b = str;
        this.w = viewGroup.findViewById(dfh0.top_end_corner_shift_layout);
        this.x = (ViewGroup) viewGroup.findViewById(dfh0.btn_cashback);
    }

    public cxq0(h hVar, f0 f0Var, kb20 kb20Var, rs2 rs2Var) {
        this.a = 18;
        this.b = hVar;
        this.c = f0Var;
        this.w = kb20Var;
        rs2Var.getClass();
        String str = Build.VERSION.RELEASE;
        this.x = new nei0("ru.yandex.taxi", "5.89.0");
    }

    public cxq0(uj4 uj4Var, g9a0 g9a0Var, j9a0 j9a0Var) {
        this.a = 27;
        this.b = uj4Var;
        this.c = g9a0Var;
        this.w = j9a0Var;
        this.x = Collections.synchronizedSet(new LinkedHashSet());
    }

    public cxq0(File file, hzk hzkVar) {
        this.a = 20;
        this.c = new n0r();
        this.w = file;
        this.x = hzkVar;
        this.b = new zjg0(file);
    }

    public cxq0(Socket socket) {
        this.a = 12;
        this.b = socket;
        this.c = new AtomicInteger();
        this.w = new mkh(this);
        this.x = new lkh(this);
    }

    public cxq0(okx okxVar, v0x v0xVar) {
        this.a = 23;
        this.b = okxVar;
        this.c = v0xVar;
        this.w = new LinkedHashMap();
        this.x = new LinkedHashMap();
    }

    public cxq0() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.w = null;
        this.x = new ArrayDeque();
    }

    public cxq0(lqg lqgVar) {
        this.a = 1;
        this.c = lqgVar;
        this.w = new SparseArray();
    }

    public /* synthetic */ cxq0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }
}

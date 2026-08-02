package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.yandex.div.core.expression.storedvalues.a;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.paymentlist.domain.PaymentMethodsConfig$OpenReason;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.mob.datastore.d;
import com.yandex.mob.model.MobCronJobType;
import com.yandex.plus.home.benchmark.BenchmarkState;
import com.ybsdk.feature.persistence.api.StorageType;
import flex.logger.FlexLogLevel;
import flex.network.cache.utils.CachePathNotUpdatedException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.VMInspector.Depends;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes9.dex */
public final class jb7 implements pi1, k5t0, k1m0, zme, vbi0 {
    public static final n2f x = new n2f(0);
    public static final o2f y = new o2f(0);
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object w;

    public jb7(File file, int i) {
        StackTraceElement stackTraceElement;
        String num;
        this.a = i;
        String str = null;
        int i2 = 0;
        switch (i) {
            case 11:
                this.c = file;
                this.b = new jb7(file, 0);
                if (file.isDirectory()) {
                    str = file.getAbsolutePath();
                } else {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        str = parentFile.getAbsolutePath();
                    }
                }
                this.w = str;
                break;
            default:
                this.b = new zjr(xfz.b(jb7.class.getSimpleName()));
                try {
                    File file2 = !file.isDirectory() ? file : null;
                    file2 = file2 == null ? new File(file, "flex_cache_path_file.txt") : file2;
                    n(file2);
                    file = file2;
                } catch (Exception unused) {
                    zjr zjrVar = (zjr) this.b;
                    i3y a = xfz.a(new Pair("filePath", file.getPath()));
                    s7s0 s7s0Var = zjrVar.c.a;
                    boolean booleanValue = Boolean.FALSE.booleanValue();
                    tjr tjrVar = tjr.d;
                    if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName = stackTraceElement.getFileName();
                        fileName = fileName == null ? "No file info" : fileName;
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                        tjrVar = new tjr(fileName, methodName, (valueOf == null || (num = valueOf.toString()) == null) ? "No line info" : num);
                    }
                    zjrVar.d(FlexLogLevel.DEBUG, "Could not create file for caching path to current cache.", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                }
                this.c = file;
                this.w = (ReentrantReadWriteLock) ((vdz) vdz.b.getValue()).a.a.computeIfAbsent(file.getAbsolutePath(), new dxd(i2, new qu(16)));
                break;
        }
    }

    public static i3y f(String str, Throwable th) {
        return xfz.a(new Pair("error", th.getMessage()), new Pair("cause", th), new Pair("key", str));
    }

    public static final jb7 g(ilx ilxVar) {
        if (ilxVar.A() <= 0) {
            kbs.v("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(ilxVar.A());
        for (hlx hlxVar : ilxVar.B()) {
            hlxVar.getClass();
            try {
                try {
                    lhx a = jz40.b.a(yuf0.p(hlxVar.B().C(), hlxVar.B().D(), hlxVar.B().B(), hlxVar.D(), hlxVar.D() == OutputPrefixType.RAW ? null : Integer.valueOf(hlxVar.C())));
                    int i = jlx.a[hlxVar.E().ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new klx(a));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a protokey serialization failed", e);
            }
        }
        return new jb7(ilxVar, Collections.unmodifiableList(arrayList));
    }

    public static final jb7 u(cot cotVar, aa2 aa2Var) {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) cotVar.b;
        try {
            xzn B = xzn.B(byteArrayInputStream, oyo.b());
            byteArrayInputStream.close();
            if (B.z().size() == 0) {
                kbs.v("empty keyset");
                return null;
            }
            try {
                ilx F = ilx.F(aa2Var.b(B.z().j(), bArr), oyo.b());
                if (F.A() > 0) {
                    return g(F);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (InvalidProtocolBufferException unused) {
                kbs.v("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public Object a(int i, ContinuationImpl continuationImpl) {
        long b = ((npt) this.c).b();
        Object r = ((d) this.w).r((MobCronJobType) this.b, new qn20(new Long(b), new Long(b + i)), continuationImpl);
        return r == CoroutineSingletons.COROUTINE_SUSPENDED ? r : zy11.a;
    }

    @Override // defpackage.pi1
    public Object b(c551 c551Var, Map map, vpr vprVar, boolean z, Continuation continuation) {
        List list;
        boolean z2 = map != null;
        if (z && z2) {
            list = c551Var.b;
        } else {
            List list2 = c551Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((ArrayList) this.c).contains(((wx70) obj).getA())) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        if (jl40.l((List) this.w, list) || list.isEmpty()) {
            return zy11.a;
        }
        this.w = list;
        return vprVar.emit(((g551) this.b).b(new c551(c551Var.a, list), map, z), continuation);
    }

    public void c() {
        File file = (File) this.c;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.w;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            n(file);
            String e = g3r.e(file);
            if (e.length() <= 0) {
                e = null;
            }
            if (e == null) {
                return;
            }
            n(file);
            g3r.g(file, "");
            File file2 = new File(e);
            if (file2.exists() && !file2.delete()) {
                throw new IOException("Failed to clear previous cache file from disk");
            }
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // defpackage.k5t0
    public void cancel() {
        ((k5t0) this.b).cancel();
    }

    public s9a0 d(vba0 vba0Var, sls slsVar, kjz kjzVar) {
        boolean z;
        PaymentMethodsConfig$OpenReason paymentMethodsConfig$OpenReason;
        wma0 wma0Var = vba0Var.c;
        PaymentsScreen paymentsScreen = vba0Var.a;
        dca0 dca0Var = vba0Var.b;
        if (dca0Var.a) {
            ((chh) this.b).getClass();
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        switch (kba0.a[vba0Var.a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                paymentMethodsConfig$OpenReason = PaymentMethodsConfig$OpenReason.PREORDER;
                break;
            case 14:
                paymentMethodsConfig$OpenReason = PaymentMethodsConfig$OpenReason.DEBTS;
                break;
            case 15:
                paymentMethodsConfig$OpenReason = PaymentMethodsConfig$OpenReason.RIDE;
                break;
            case 16:
                paymentMethodsConfig$OpenReason = PaymentMethodsConfig$OpenReason.COMPOSITE_PAYMENT;
                break;
            default:
                w511.b();
                return null;
        }
        return new s9a0(((Boolean) ((lca0) this.c).a.c()).booleanValue(), wma0Var, paymentsScreen, z2, paymentMethodsConfig$OpenReason, new c82(4, slsVar), kjzVar, ((g) this.w).e(), dca0Var.e, dca0Var.c, dca0Var instanceof bca0, vba0Var.e);
    }

    @Override // defpackage.k5t0
    public uis0 e() {
        return (ici0) this.w;
    }

    @Override // defpackage.k5t0
    public y9t0 getSource() {
        return (jci0) this.c;
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        eyu0 eyu0Var = (eyu0) this.w;
        int i = eyu0Var.a.a(eyu0Var.b.getThemeType()).b;
        int i2 = ((AtomicInteger) this.b).get();
        if (i2 != i) {
            synchronized (((ContextThemeWrapper) this.c)) {
                if (((AtomicInteger) this.b).compareAndSet(i2, i)) {
                    y5e.Q((ContextThemeWrapper) this.c, i);
                }
            }
        }
        return (ContextThemeWrapper) this.c;
    }

    public Object h(String str, String str2) {
        vgb1 a = ((a) ((nfh) this.b).c).a(str, (l6o) this.c, (String) this.w, str2);
        if (a != null) {
            return a.b();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(Class cls) {
        Class cls2;
        Object obj;
        Object obj2;
        HashMap hashMap;
        AtomicReference atomicReference = nri0.a;
        try {
            hashMap = ((n2f0) fz40.b.a.get()).b;
        } catch (GeneralSecurityException unused) {
            cls2 = null;
        }
        if (!hashMap.containsKey(cls)) {
            throw new GeneralSecurityException(qv10.m(cls, "No input primitive class for ", " available"));
        }
        cls2 = ((r2f0) hashMap.get(cls)).a();
        if (cls2 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        List list = (List) this.c;
        ilx ilxVar = (ilx) this.b;
        int i = qw21.a;
        int C = ilxVar.C();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (hlx hlxVar : ilxVar.B()) {
            if (hlxVar.E() == KeyStatusType.ENABLED) {
                if (!hlxVar.F()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(hlxVar.C())));
                }
                if (hlxVar.D() == OutputPrefixType.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(hlxVar.C())));
                }
                if (hlxVar.E() == KeyStatusType.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(hlxVar.C())));
                }
                if (hlxVar.C() == C) {
                    if (z) {
                        kbs.v("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                if (hlxVar.B().B() != KeyData$KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            kbs.v("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z && !z2) {
            kbs.v("keyset doesn't contain a valid primary key");
            return null;
        }
        oo2 oo2Var = new oo2(cls2);
        d630 d630Var = (d630) this.w;
        if (((ConcurrentHashMap) oo2Var.b) == null) {
            ny61.r("setAnnotations cannot be called after build");
            return null;
        }
        oo2Var.x = d630Var;
        for (int i3 = 0; i3 < ilxVar.A(); i3++) {
            hlx z3 = ilxVar.z(i3);
            if (z3.E().equals(KeyStatusType.ENABLED)) {
                try {
                    bix B = z3.B();
                    AtomicReference atomicReference2 = nri0.a;
                    obj = nri0.c(B.C(), B.D(), cls2);
                } catch (GeneralSecurityException e) {
                    if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
                        throw e;
                    }
                    obj = null;
                }
                if (list.get(i3) != null) {
                    try {
                        obj2 = nri0.b(((klx) list.get(i3)).a, cls2);
                    } catch (GeneralSecurityException unused2) {
                    }
                    if (obj2 != null && obj == null) {
                        StringBuilder sb = new StringBuilder("Unable to get primitive ");
                        sb.append(cls2);
                        String C2 = z3.B().C();
                        sb.append(" for key of type ");
                        sb.append(C2);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    if (z3.C() != ilxVar.C()) {
                        oo2Var.b(obj2, obj, z3, true);
                    } else {
                        oo2Var.b(obj2, obj, z3, false);
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                }
                if (z3.C() != ilxVar.C()) {
                }
            }
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oo2Var.b;
        if (concurrentHashMap == null) {
            ny61.r("build cannot be called twice");
            return null;
        }
        p2f0 p2f0Var = (p2f0) oo2Var.c;
        d630 d630Var2 = (d630) oo2Var.x;
        Class cls3 = (Class) oo2Var.a;
        jb7 jb7Var = new jb7(concurrentHashMap, p2f0Var, d630Var2, cls3);
        oo2Var.b = null;
        AtomicReference atomicReference3 = nri0.a;
        HashMap hashMap2 = ((n2f0) fz40.b.a.get()).b;
        if (!hashMap2.containsKey(cls)) {
            throw new GeneralSecurityException(qv10.l(cls, "No wrapper found for "));
        }
        r2f0 r2f0Var = (r2f0) hashMap2.get(cls);
        if (cls3.equals(r2f0Var.a()) && r2f0Var.a().equals(cls3)) {
            return r2f0Var.c(jb7Var);
        }
        kbs.v("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        return null;
    }

    public List j(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.b).get(new q2f0(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public enp0 k() {
        return (enp0) ((i3y) this.c).getValue();
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        String c = ((sbx) this.w).c(obj, (KSerializer) this.c);
        int i = m5j0.a;
        return wms.a(c, (wg10) this.b);
    }

    public boolean m(String str) {
        kr krVar = (kr) ((Map) this.b).get(str);
        if (krVar == null) {
            h5z0.a.d(oyr.p("Action with id ", str, " doesn't exists"), new Object[0]);
            return false;
        }
        ((wu) this.w).b(krVar, (pxl) this.c, b.f());
        return true;
    }

    public void n(File file) {
        StackTraceElement stackTraceElement;
        String str;
        try {
            gtq0.k(file);
        } catch (Throwable th) {
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage != null) {
                zjr zjrVar = (zjr) this.b;
                i3y a = xfz.a(new Pair("filePath", file.getPath()));
                s7s0 s7s0Var = zjrVar.c.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                tjr tjrVar = tjr.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = Integer.valueOf(lineNumber);
                    if (lineNumber <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null || (str = valueOf.toString()) == null) {
                        str = "No line info";
                    }
                    tjrVar = new tjr(fileName, methodName, str);
                }
                zjrVar.d(FlexLogLevel.DEBUG, localizedMessage, a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
            }
            throw th;
        }
    }

    public BufferedInputStream o() {
        jb7 jb7Var = (jb7) this.b;
        ReentrantReadWriteLock.ReadLock readLock = ((ReentrantReadWriteLock) jb7Var.w).readLock();
        readLock.lock();
        try {
            File file = (File) jb7Var.c;
            jb7Var.n(file);
            String e = g3r.e(file);
            BufferedInputStream bufferedInputStream = null;
            if (e.length() <= 0) {
                e = null;
            }
            if (e == null) {
                readLock.unlock();
                return null;
            }
            File file2 = new File(e);
            if (!file2.exists()) {
                jb7Var.q("Could not load data from disk because provided file does not exist");
            } else if (file2.isDirectory()) {
                jb7Var.q("Could not load data from disk because provided file is actually a directory");
            } else {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 8192);
            }
            readLock.unlock();
            return bufferedInputStream;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    public void q(String str) {
        StackTraceElement stackTraceElement;
        String str2;
        zjr zjrVar = (zjr) this.b;
        i3y a = xfz.a(new Pair("filePath", ((File) this.c).getPath()));
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str2);
        }
        zjrVar.d(FlexLogLevel.DEBUG, str, a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    public void r(wl3 wl3Var) {
        AuthEnvironment a;
        ((z8g) k()).a().c("tech_account_changed", "env", (wl3Var == null || (a = wl3Var.a()) == null) ? null : Integer.valueOf(a.getInteger()));
        ((z8g) k()).b().a(new weu(8, wl3Var));
    }

    public void s(File file, File file2) {
        File file3 = (File) this.c;
        if (!file3.exists() && !file3.mkdirs()) {
            ny61.v(g8e.o("Can't make dir ", file3.getPath()));
            return;
        }
        if (file2.exists()) {
            if (!file.exists() || file.delete()) {
                return;
            }
            ny61.v("Can't delete inconsistent file");
            return;
        }
        if (!file.exists() && !file.createNewFile()) {
            ny61.v("Can't prepare empty backup");
        } else {
            if (file.renameTo(file2)) {
                return;
            }
            ny61.v("Can't make backup");
        }
    }

    public m2g0 t() {
        return new m2g0(((c1b0) ((a1b0) ((x8g) ((dnp0) this.c)).n.get())).a(StorageType.PUSH_NOTIFICATIONS));
    }

    public String toString() {
        switch (this.a) {
            case 17:
                return qw21.a((ilx) this.b).toString();
            default:
                return super.toString();
        }
    }

    public synchronized String v() {
        File file = new File((File) this.c, (String) this.b);
        File file2 = new File((File) this.c, (String) this.w);
        if (file2.exists()) {
            if (file.exists() && !file.delete()) {
                throw new IOException("Can't delete inconsistent file");
            }
            if (file2.length() == 0) {
                if (!file2.delete()) {
                    throw new IOException("Can't delete empty backup");
                }
            } else if (!file2.renameTo(file)) {
                throw new IOException("Can't restore backup");
            }
        }
        if (!file.exists()) {
            return "";
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Charset defaultCharset = Charset.defaultCharset();
            v0w H = vng.H(fileInputStream);
            yp6 yp6Var = new yp6();
            yp6Var.N1(H);
            String T = yp6Var.T(yp6Var.b, defaultCharset);
            fileInputStream.close();
            return T;
        } finally {
        }
    }

    public void w(byte[] bArr) {
        String str = (String) this.w;
        String str2 = "flex_copy_file_" + UUID.randomUUID() + "_";
        File file = (File) this.c;
        String name = file.getName();
        int L = evu0.L(Extension.DOT_CHAR, name, 6);
        if (L != -1) {
            name = name.substring(0, L);
        }
        String m = kotlin.io.b.m(file);
        if (m.length() <= 0) {
            m = null;
        }
        File file2 = new File(str, g8e.p(str2, name, m != null ? Extension.DOT_CHAR.concat(m) : Depends.TEXT_EXT));
        file2.createNewFile();
        g3r.f(file2, bArr);
        try {
            ((jb7) this.b).y(file2);
        } catch (CachePathNotUpdatedException e) {
            if (!file2.exists() || file2.delete()) {
                throw e;
            }
            dac.g("Failed to delete new cache file that could not be saved", e);
        }
    }

    public void x() {
        hz40 hz40Var = (hz40) this.b;
        String str = (String) this.c;
        List list = (List) hz40Var.m(str);
        if (list != null) {
            list.remove((sls) this.w);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        hz40Var.o(str, list);
    }

    public void y(File file) {
        File file2 = (File) this.c;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.w;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                c();
                try {
                    String absolutePath = file.getAbsolutePath();
                    n(file2);
                    g3r.g(file2, absolutePath);
                } catch (Exception e) {
                    throw new CachePathNotUpdatedException("Failed to write path of actual cache file into path file", e);
                }
            } catch (Throwable th) {
                try {
                    String absolutePath2 = file.getAbsolutePath();
                    n(file2);
                    g3r.g(file2, absolutePath2);
                    throw th;
                } catch (Exception e2) {
                    throw new CachePathNotUpdatedException("Failed to write path of actual cache file into path file", e2);
                }
            }
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public synchronized void z(String str) {
        File file = new File((File) this.c, (String) this.b);
        File file2 = new File((File) this.c, (String) this.w);
        s(file, file2);
        FileWriter fileWriter = new FileWriter(file);
        try {
            fileWriter.write(str);
            fileWriter.close();
            if (!file2.delete()) {
                throw new IOException("Can't delete backup to commit write");
            }
        } finally {
        }
    }

    public jb7(com.yandex.plus.core.benchmark.b bVar, wls wlsVar) {
        this.a = 22;
        this.b = bVar;
        this.c = wlsVar;
        this.w = new AtomicReference(BenchmarkState.NOT_STARTED);
    }

    public jb7(File file, String str) {
        this.a = 4;
        this.c = file;
        this.b = str;
        this.w = b64.j(str, ".backup");
    }

    public jb7(zuj0 zuj0Var) {
        this.a = 14;
        this.b = zuj0Var;
        this.c = ((avj0) zuj0Var).h(kyh0.super_app_fallback_assistant_reload);
        this.w = ((avj0) zuj0Var).h(kyh0.super_app_fallback_assistant_taxi);
    }

    public /* synthetic */ jb7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public jb7(List list) {
        this.a = 19;
        this.w = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.b).add(new thr0((List) ((cy00) list.get(i)).b.b));
            ((ArrayList) this.c).add(((cy00) list.get(i)).c.I());
        }
    }

    public jb7(int i, Context context, eyu0 eyu0Var) {
        this.a = 29;
        this.w = eyu0Var;
        this.b = new AtomicInteger(i);
        this.c = new ContextThemeWrapper(context, i);
    }

    public jb7(vg7 vg7Var, ou ouVar, zjr zjrVar) {
        this.a = 25;
        this.c = vg7Var;
        this.w = ouVar;
        this.b = zjrVar;
    }

    public jb7(g551 g551Var, ServiceType[] serviceTypeArr) {
        this.a = 2;
        this.b = g551Var;
        ArrayList arrayList = new ArrayList(serviceTypeArr.length);
        for (ServiceType serviceType : serviceTypeArr) {
            arrayList.add(serviceType.getAlias());
        }
        this.c = arrayList;
        this.w = EmptyList.a;
    }

    public jb7(k5t0 k5t0Var) {
        this.a = 6;
        this.b = k5t0Var;
        this.c = new jci0(k5t0Var.getSource());
        this.w = new ici0(k5t0Var.e());
    }

    public jb7(q1r q1rVar) {
        this.a = 1;
        this.c = null;
        this.w = null;
        this.b = q1rVar;
    }

    public jb7(Context context) {
        this.a = 20;
        this.b = context;
        final int i = 0;
        this.c = kotlin.a.a(new sls(this) { // from class: b420
            public final /* synthetic */ jb7 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                jb7 jb7Var = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = onp0.a;
                        return onp0.a((Context) jb7Var.b);
                    default:
                        Context context3 = ((z8g) jb7Var.k()).a.a;
                        q5z.i(context3);
                        return new j420(context3);
                }
            }
        });
        final int i2 = 1;
        this.w = kotlin.a.a(new sls(this) { // from class: b420
            public final /* synthetic */ jb7 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                jb7 jb7Var = this.b;
                switch (i22) {
                    case 0:
                        Context context2 = onp0.a;
                        return onp0.a((Context) jb7Var.b);
                    default:
                        Context context3 = ((z8g) jb7Var.k()).a.a;
                        q5z.i(context3);
                        return new j420(context3);
                }
            }
        });
    }

    public jb7(g2g0 g2g0Var, dnp0 dnp0Var) {
        this.a = 9;
        this.b = g2g0Var;
        this.c = dnp0Var;
        this.w = i5m.b(new h90(g2g0Var, n3w.a(dnp0Var), 9));
    }

    public jb7(com.yandex.div.internal.widget.indicator.a aVar) {
        this.a = 15;
        this.w = aVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public jb7(ConcurrentMap concurrentMap, p2f0 p2f0Var, d630 d630Var, Class cls) {
        this.a = 24;
        this.b = concurrentMap;
        this.c = p2f0Var;
        this.w = d630Var;
    }

    public jb7(ilx ilxVar, List list) {
        this.a = 17;
        this.b = ilxVar;
        this.c = list;
        this.w = d630.b;
    }
}

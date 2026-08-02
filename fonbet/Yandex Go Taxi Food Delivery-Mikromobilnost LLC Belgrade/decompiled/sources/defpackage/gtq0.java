package defpackage;

import android.R;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PaintDrawable;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.google.android.gms.tasks.Task;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.VariableMutationException;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.base.internal.NavigationRouterException;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.h;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.util.p;
import com.yandex.runtime.Runtime;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class gtq0 {
    public static final dac a = new dac(26);
    public static final dac b = new dac(27);
    public static final dac c = new dac(28);
    public static final dac d = new dac(29);
    public static final jb20 e = new jb20("NO_OWNER", 1);
    public static final gl11 f = new gl11(new ceu0(22), new u431(9));
    public static final gl11 g = new gl11(new ceu0(23), new ceu0(24));
    public static final gl11 h = new gl11(new ceu0(25), new ceu0(26));
    public static final gl11 i = new gl11(new ceu0(27), new ceu0(28));
    public static final gl11 j = new gl11(new ceu0(29), new u431(0));
    public static final gl11 k = new gl11(new u431(1), new u431(2));
    public static final gl11 l = new gl11(new u431(3), new u431(4));
    public static final gl11 m = new gl11(new u431(5), new u431(6));
    public static final gl11 n = new gl11(new u431(7), new u431(8));
    public static String o;
    public static Boolean p;

    public static LinkedHashMap A(int i2) {
        return new LinkedHashMap(i2 < 3 ? i2 + 1 : i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static final KSerializer B(kf5 kf5Var, g0c g0cVar) {
        KSerializer b2 = kf5Var.b(g0cVar, EmptyList.a);
        if (b2 != null) {
            return b2;
        }
        uh6.M(g0cVar);
        throw null;
    }

    public static final KSerializer C(lfx lfxVar, ArrayList arrayList, sls slsVar) {
        KSerializer p53Var;
        KSerializer eni0Var;
        if (lfxVar.equals(qoi0.a(Collection.class)) || lfxVar.equals(qoi0.a(List.class)) || lfxVar.equals(qoi0.a(List.class)) || lfxVar.equals(qoi0.a(ArrayList.class))) {
            p53Var = new p53((KSerializer) arrayList.get(0), 0);
        } else if (lfxVar.equals(qoi0.a(HashSet.class))) {
            p53Var = new m8u((KSerializer) arrayList.get(0));
        } else if (lfxVar.equals(qoi0.a(Set.class)) || lfxVar.equals(qoi0.a(Set.class)) || lfxVar.equals(qoi0.a(LinkedHashSet.class))) {
            p53Var = new p53((KSerializer) arrayList.get(0), 1);
        } else if (lfxVar.equals(qoi0.a(HashMap.class))) {
            p53Var = new k8u((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 0);
        } else if (lfxVar.equals(qoi0.a(Map.class)) || lfxVar.equals(qoi0.a(Map.class)) || lfxVar.equals(qoi0.a(LinkedHashMap.class))) {
            p53Var = new k8u((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 1);
        } else {
            if (lfxVar.equals(qoi0.a(Map.Entry.class))) {
                eni0Var = new qh00((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            } else if (lfxVar.equals(qoi0.a(Pair.class))) {
                eni0Var = new ta90((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            } else if (lfxVar.equals(qoi0.a(Triple.class))) {
                p53Var = new nf11((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
            } else if (((zzb) lfxVar).a().isArray()) {
                eni0Var = new eni0((lfx) slsVar.invoke(), (KSerializer) arrayList.get(0));
            } else {
                p53Var = null;
            }
            p53Var = eni0Var;
        }
        if (p53Var != null) {
            return p53Var;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        return y5e.n(((zzb) lfxVar).a(), (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
    }

    public static final q6x D(q6x q6xVar, q6x q6xVar2) {
        if (q6xVar == null && q6xVar2 == null) {
            return null;
        }
        boolean z = q6xVar instanceof r6x;
        if (!z || !(q6xVar2 instanceof r6x)) {
            if (q6xVar instanceof p6x) {
                return q6xVar2;
            }
            if (z && (q6xVar2 instanceof p6x)) {
                return q6xVar;
            }
            return null;
        }
        Map map = ((r6x) q6xVar).a;
        Set N0 = a.N0(map.keySet());
        Map map2 = ((r6x) q6xVar2).a;
        LinkedHashSet<String> U = a.U(N0, map2.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : U) {
            q6x D = D((q6x) map.get(str), (q6x) map2.get(str));
            if (D != null) {
                linkedHashMap.put(str, D);
            }
        }
        if (U.isEmpty()) {
            return null;
        }
        return new r6x(linkedHashMap);
    }

    public static final int E(int i2, String str) {
        char charAt = str.charAt(i2);
        return (charAt << 7) + str.charAt(i2 + 1);
    }

    public static final void F(String str, String str2, Throwable th) {
        xby.l(jst.e, "Account Manager:".concat(str), null, th, str2 == null ? str : str2, 2);
    }

    public static final boolean G(List list, List list2) {
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzs B = ((Address) list2.get(i2)).B();
                zzs B2 = ((Address) list.get(i2)).B();
                uzs uzsVar = zzs.Companion;
                if (B.a(B2, 1.0E-6d)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final KSerializer H(kf5 kf5Var, mgx mgxVar) {
        KSerializer S = bvf0.S(kf5Var, mgxVar, true);
        if (S != null) {
            return S;
        }
        uh6.M(uh6.F(mgxVar));
        throw null;
    }

    public static final KSerializer I(kf5 kf5Var, Type type) {
        KSerializer R = kp50.R(kf5Var, type, true);
        if (R != null) {
            return R;
        }
        yci0.m(uh6.J(qoi0.a(kp50.J(type))));
        return null;
    }

    public static final KSerializer J(lfx lfxVar) {
        KSerializer K = K(lfxVar);
        if (K != null) {
            return K;
        }
        uh6.M(lfxVar);
        throw null;
    }

    public static final KSerializer K(lfx lfxVar) {
        KSerializer n2 = y5e.n(((zzb) lfxVar).a(), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
        return n2 == null ? (KSerializer) s2f0.a.get(lfxVar) : n2;
    }

    public static final ArrayList L(kf5 kf5Var, List list, boolean z) {
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(H(kf5Var, (mgx) it.next()));
            }
            return arrayList;
        }
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            KSerializer S = bvf0.S(kf5Var, (mgx) it2.next(), false);
            if (S == null) {
                return null;
            }
            arrayList2.add(S);
        }
        return arrayList2;
    }

    public static final void M(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void N(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final byte[] O(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    j8e j8eVar = (j8e) it.next();
                    objectOutputStream.writeUTF(j8eVar.a().toString());
                    objectOutputStream.writeBoolean(j8eVar.b());
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } finally {
        }
    }

    public static VariableMutationException P(Div2View div2View, String str, String str2, rvo rvoVar) {
        Object failure;
        c231 variable = rvoVar.getVariable(str);
        if (variable == null) {
            VariableMutationException variableMutationException = new VariableMutationException(oyr.p("Variable '", str, "' not defined!"), null);
            div2View.logError(variableMutationException);
            return variableMutationException;
        }
        try {
            variable.g(str2);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 == null) {
            return null;
        }
        VariableMutationException variableMutationException2 = new VariableMutationException(oyr.p("Variable '", str, "' mutation failed!"), a2);
        div2View.logError(variableMutationException2);
        return variableMutationException2;
    }

    public static void Q(Div2View div2View, String str, rvo rvoVar, tls tlsVar) {
        Object failure;
        c231 variable = rvoVar.getVariable(str);
        if (variable == null) {
            div2View.logError(new VariableMutationException(oyr.p("Variable '", str, "' not defined!"), null));
            return;
        }
        try {
            variable.h((c231) tlsVar.invoke(variable));
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 == null) {
            return;
        }
        div2View.logError(new VariableMutationException(oyr.p("Variable '", str, "' mutation failed!"), a2));
    }

    public static final int R(WorkInfo$State workInfo$State) {
        switch (la51.a[workInfo$State.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                w511.b();
                break;
        }
        return 0;
    }

    public static final Pair S(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static final hg4 T(Drawable drawable) {
        return drawable != null ? new eg4(drawable) : gg4.a;
    }

    public static final jz50 U(byte[] bArr) {
        if (bArr.length == 0) {
            return new jz50(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i2 = 0; i2 < readInt; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i3 = 0; i3 < readInt2; i3++) {
                    iArr2[i3] = objectInputStream.readInt();
                }
                jz50 f2 = ksb1.f(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return f2;
            } finally {
            }
        } finally {
        }
    }

    public static final void V(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PassportEnvironmentImpl passportEnvironmentImpl = h.a;
        if (p.m()) {
            hst hstVar = jst.e;
            IllegalStateException illegalStateException = new IllegalStateException();
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
            str = "";
            hstVar.x(illegalStateException, String.format("Trying to init passportApi in wrong process. ProcessName: %s, Runtime.isInMainProcess: %b", Arrays.copyOf(new Object[]{str, Boolean.valueOf(Runtime.isMainProcess(context))}, 2)));
        }
    }

    public static void W(int i2, int i3) {
        String d2;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                d2 = sya1.d("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    ny61.g(oyr.i(i3, "negative size: "));
                    return;
                }
                d2 = sya1.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(d2);
        }
    }

    public static void X(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            ny61.m(Z(i2, i3, "index"));
        }
    }

    public static void Y(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? Z(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? Z(i3, i4, "end index") : sya1.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static String Z(int i2, int i3, String str) {
        if (i2 < 0) {
            return sya1.d("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return sya1.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        ny61.g(oyr.i(i3, "negative size: "));
        return null;
    }

    public static kotlinx.coroutines.sync.a a() {
        return new kotlinx.coroutines.sync.a(false);
    }

    public static final h55 b(m950 m950Var) {
        if (m950Var instanceof h55) {
            return (h55) m950Var;
        }
        throw new NavigationRouterException("Unknown NavigationRouter inheritor type");
    }

    public static final Object c(Task task, ContinuationImpl continuationImpl) {
        if (!task.n()) {
            j18 j18Var = new j18(1, dvw.b(continuationImpl));
            j18Var.u();
            task.c(ykj.b, new qmx(j18Var));
            Object s = j18Var.s();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s;
        }
        Exception j2 = task.j();
        if (j2 != null) {
            throw j2;
        }
        if (!task.m()) {
            return task.k();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final LinkedHashSet d(byte[] bArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                for (int i2 = 0; i2 < readInt; i2++) {
                    linkedHashSet.add(new j8e(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                }
                objectInputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(byteArrayInputStream, th);
                throw th2;
            }
        }
        byteArrayInputStream.close();
        return linkedHashSet;
    }

    public static ColorStateList e(int i2) {
        return f(i2, Color.argb((int) (Color.alpha(i2) * 0.5f), Color.red(i2), Color.green(i2), Color.blue(i2)));
    }

    public static ColorStateList f(int i2, int i3) {
        int argb;
        if (lhc.c(i2) < 0.25d) {
            argb = lhc.b(0.050000012f, i2, -1);
        } else {
            int alpha = Color.alpha(i2);
            int b2 = m810.b(Color.red(i2) * 0.95f);
            if (b2 > 255) {
                b2 = 255;
            }
            int b3 = m810.b(Color.green(i2) * 0.95f);
            if (b3 > 255) {
                b3 = 255;
            }
            int b4 = m810.b(Color.blue(i2) * 0.95f);
            argb = Color.argb(alpha, b2, b3, b4 <= 255 ? b4 : 255);
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{-16842910}, new int[0]}, new int[]{argb, i3, i2});
    }

    public static final gyr g(Context context) {
        return new gyr(new androidx.compose.ui.text.font.a(context), new o92(Build.VERSION.SDK_INT >= 31 ? mzr.a.a(context) : 0));
    }

    public static final PassportUidImpl h(u02 u02Var, long j2) {
        u02Var.getClass();
        return new PassportUidImpl(PassportEnvironmentImpl.from(KPassportEnvironment.PRODUCTION), j2);
    }

    public static final yc5 i() {
        return new yc5(new Throwable().getStackTrace(), 1);
    }

    public static final Enum j(String str, KSerializer kSerializer) {
        int c2;
        if (str == null || (c2 = kSerializer.getDescriptor().c(str)) == -3) {
            return null;
        }
        return (Enum) kSerializer.deserialize(new hgz(c2));
    }

    public static final void k(File file) {
        try {
            if (file.isDirectory()) {
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("Failed to create directories with given folder path");
                }
            } else {
                if (file.exists()) {
                    return;
                }
                File parentFile = file.getParentFile();
                if ((parentFile == null || !parentFile.mkdirs()) && !file.createNewFile()) {
                    throw new IOException("Failed to create file with given file path");
                }
            }
        } catch (Exception e2) {
            throw new Exception("Exception occurred while file creation", e2);
        }
    }

    public static final m5x l(m5x m5xVar, q6x q6xVar) {
        if (!(q6xVar instanceof r6x)) {
            if (q6xVar instanceof p6x) {
                return m5xVar;
            }
            w511.b();
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((r6x) q6xVar).a.entrySet()) {
            String str = (String) entry.getKey();
            q6x q6xVar2 = (q6x) entry.getValue();
            Object obj = (j5x) m5xVar.a.get(str);
            if (!(q6xVar2 instanceof p6x)) {
                if (!(q6xVar2 instanceof r6x)) {
                    w511.b();
                    return null;
                }
                obj = obj instanceof m5x ? l((m5x) obj, q6xVar2) : null;
            }
            if (obj != null) {
                linkedHashMap.put(str, obj);
            }
        }
        return new m5x(linkedHashMap);
    }

    public static final v6x m(d6x d6xVar, String str) {
        q6x q6xVar = (q6x) d6xVar.b.a.get(str);
        return q6xVar != null ? new v6x(l(d6xVar.a.a, q6xVar)) : w6x.a;
    }

    public static omk n(ag90 ag90Var, JSONObject jSONObject) {
        return ((umk) ft6.b.N2.getValue()).a(ag90Var, jSONObject);
    }

    public static final byte[] o(jz50 jz50Var) {
        NetworkRequest networkRequest = (NetworkRequest) jz50Var.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] d2 = nm91.d(networkRequest);
                int[] b2 = nm91.b(networkRequest);
                objectOutputStream.writeInt(d2.length);
                for (int i2 : d2) {
                    objectOutputStream.writeInt(i2);
                }
                objectOutputStream.writeInt(b2.length);
                for (int i3 : b2) {
                    objectOutputStream.writeInt(i3);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } finally {
        }
    }

    public static final BackoffPolicy p(int i2) {
        if (i2 == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i2 == 1) {
            return BackoffPolicy.LINEAR;
        }
        ny61.g(oyr.j(i2, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final NetworkType q(int i2) {
        if (i2 == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i2 == 1) {
            return NetworkType.CONNECTED;
        }
        if (i2 == 2) {
            return NetworkType.UNMETERED;
        }
        if (i2 == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i2 == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        ny61.g(oyr.j(i2, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final OutOfQuotaPolicy r(int i2) {
        if (i2 == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i2 == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        ny61.g(oyr.j(i2, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final WorkInfo$State s(int i2) {
        if (i2 == 0) {
            return WorkInfo$State.ENQUEUED;
        }
        if (i2 == 1) {
            return WorkInfo$State.RUNNING;
        }
        if (i2 == 2) {
            return WorkInfo$State.SUCCEEDED;
        }
        if (i2 == 3) {
            return WorkInfo$State.FAILED;
        }
        if (i2 == 4) {
            return WorkInfo$State.BLOCKED;
        }
        if (i2 == 5) {
            return WorkInfo$State.CANCELLED;
        }
        ny61.g(oyr.j(i2, "Could not convert ", " to State"));
        return null;
    }

    public static final m1k t(tse tseVar, tls tlsVar) {
        l8x l8xVar = (l8x) tseVar.getCoroutineContext().get(seu.C);
        if (l8xVar != null) {
            return l8xVar.w(tlsVar);
        }
        xby.d.q("This must be a bug in the coroutines internals or one manually implemented CoroutineScope and did a mistake. Job is required in the CoroutineScope. Read more here: https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-scope/");
        return le60.a;
    }

    public static final boolean u(m950 m950Var) {
        return m950Var != null && (m950Var instanceof h55) && ((h55) m950Var).w();
    }

    public static Drawable v(ru.yandex.taxi.design.utils.a aVar, Context context, int i2, hgr0 hgr0Var, int i3, int i4) {
        boolean z = (i4 & 8) != 0;
        if ((i4 & 16) != 0) {
            i3 = qje.t(xng0.bgMain, context);
        }
        PaintDrawable W = d6z.W(i3, i2);
        NinePatchDrawable w = w(aVar, context, W, hgr0Var, false, true);
        return z ? new LayerDrawable(new Drawable[]{w, W}) : w;
    }

    public static final NinePatchDrawable w(ru.yandex.taxi.design.utils.a aVar, Context context, PaintDrawable paintDrawable, hgr0 hgr0Var, boolean z, boolean z2) {
        int i2;
        int i3;
        paintDrawable.setIntrinsicWidth(paintDrawable.getIntrinsicWidth() + 1);
        paintDrawable.setIntrinsicHeight(paintDrawable.getIntrinsicHeight() + (z2 ? 1 : 0));
        aVar.getClass();
        BitmapDrawable e2 = aVar.e(paintDrawable, hgr0Var.a, hgr0Var.b, hgr0Var.c, hgr0Var.d, z);
        int d2 = aVar.d(paintDrawable);
        int b2 = aVar.b(paintDrawable);
        float f2 = hgr0Var.c;
        float f3 = hgr0Var.a;
        float f4 = ru.yandex.taxi.design.utils.a.f(f2, f3);
        float f5 = hgr0Var.c;
        float f6 = hgr0Var.b;
        float f7 = ru.yandex.taxi.design.utils.a.f(f5, f6);
        int g2 = ru.yandex.taxi.design.utils.a.g(f5, d2, f4);
        int g3 = ru.yandex.taxi.design.utils.a.g(f5, b2, f7);
        int c2 = (int) ru.yandex.taxi.design.utils.a.c(f5, f3);
        int c3 = (int) ru.yandex.taxi.design.utils.a.c(f5, f6);
        Rect rect = new Rect(c2, c3, g2 - (d2 + c2), g3 - (b2 + c3));
        e2.getIntrinsicWidth();
        int intrinsicHeight = e2.getIntrinsicHeight();
        int intrinsicWidth = e2.getIntrinsicWidth() / 2;
        int i4 = intrinsicWidth + 1;
        if (z2) {
            i3 = e2.getIntrinsicHeight() / 2;
            i2 = i3 + 1;
        } else {
            i2 = intrinsicHeight;
            i3 = 0;
        }
        return sb2.m(context, sb2.B(context, e2, new Canvas()), new xa60(rect.left, e2.getIntrinsicWidth() - rect.right, rect.top, e2.getIntrinsicHeight() - rect.bottom), new xa60[]{new xa60(intrinsicWidth, i4, i3, i2)});
    }

    public static NinePatchDrawable x(ru.yandex.taxi.design.utils.a aVar, Context context, int i2, hgr0 hgr0Var) {
        float f2 = i2;
        PaintDrawable paintDrawable = new PaintDrawable(qje.u(context.getTheme(), xng0.bgMain));
        paintDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
        paintDrawable.setIntrinsicWidth(i2 * 2);
        paintDrawable.setIntrinsicHeight(i2);
        return w(aVar, context, paintDrawable, hgr0Var, false, false);
    }

    public static final String y(oeu oeuVar) {
        if (oeuVar != null) {
            return oeuVar.a("X-YaMasstransitRequestId");
        }
        return null;
    }

    public static final int z(NetworkType networkType) {
        int i2 = la51.c[networkType.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        w511.t("Could not convert ", networkType, " to int");
        return 0;
    }
}

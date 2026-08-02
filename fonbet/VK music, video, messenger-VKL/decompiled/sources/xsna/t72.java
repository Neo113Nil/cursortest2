package xsna;

import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import com.huawei.hms.health.aace;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.vk.lists.ListDataSet;
import com.vk.notifications.GroupedNotificationsFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class t72 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t72(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        String flush$lambda$7;
        byte[] a;
        FileOutputStream fileOutputStream;
        String encodeToString;
        int length;
        int i;
        boolean equals;
        List aab;
        int i2 = this.b;
        byte[] bArr = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                flush$lambda$7 = AndroidDiagnosticEventRepository.flush$lambda$7((AndroidDiagnosticEventRepository) obj2, (List) obj);
                return flush$lambda$7;
            case 1:
                return Boolean.valueOf(((laa) obj2).c.n((String) obj));
            case 2:
                z7f z7fVar = (z7f) obj2;
                n7f orDefault = z7fVar.g.getOrDefault(Integer.valueOf(System.identityHashCode((yds0) obj)), null);
                if (orDefault == null) {
                    return Optional.empty();
                }
                int i3 = orDefault.a;
                Integer num = z7fVar.f;
                if (num != null && num.intValue() == i3) {
                    return Optional.empty();
                }
                z7f a2 = z7f.a(z7fVar, null, null, Integer.valueOf(i3), null, 479);
                List<n7f> list = z7fVar.d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(fz5.x((n7f) it.next(), Integer.valueOf(i3)));
                }
                return Optional.of(new Pair(a2, arrayList));
            case 3:
                pm60 pm60Var = (pm60) obj;
                io.reactivex.rxjava3.internal.observers.d<String> dVar = x5m.a;
                File file = new File((File) obj2, "ok-calls/fp/data");
                try {
                    bArr = nbr.p(file);
                } catch (IOException unused) {
                }
                StringBuilder sb = new StringBuilder("droid");
                try {
                    if (bArr != null) {
                        if (bArr.length != 40) {
                            equals = false;
                        } else {
                            long j = ByteBuffer.wrap(bArr).getLong(32);
                            String str = Build.FINGERPRINT;
                            equals = Arrays.equals(x5m.a(j), bArr);
                        }
                        if (equals) {
                            encodeToString = Base64.encodeToString(bArr, 0);
                            StringBuilder sb2 = new StringBuilder();
                            length = encodeToString.length();
                            for (i = 0; i < length; i++) {
                                char charAt = encodeToString.charAt(i);
                                if (Character.isLetterOrDigit(charAt) || charAt == '=') {
                                    sb2.append(charAt);
                                }
                            }
                            sb.append(sb2.toString());
                            return sb.toString();
                        }
                    }
                    fileOutputStream.write(a);
                    s3q0 s3q0Var = s3q0.a;
                    fileOutputStream.close();
                    encodeToString = Base64.encodeToString(a, 0);
                    StringBuilder sb22 = new StringBuilder();
                    length = encodeToString.length();
                    while (i < length) {
                    }
                    sb.append(sb22.toString());
                    return sb.toString();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(fileOutputStream, th);
                        throw th2;
                    }
                }
                long longValue = ((Number) pm60Var.invoke()).longValue();
                String str2 = Build.FINGERPRINT;
                a = x5m.a(TimeUnit.MILLISECONDS.toHours(longValue - SystemClock.elapsedRealtime()) / 12);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
                break;
            case 4:
                izs izsVar = (izs) obj;
                ArrayList arrayList2 = new ArrayList();
                hou houVar = GroupedNotificationsFragment.this.Z;
                if (houVar != null) {
                    ((ListDataSet) houVar.c).u(new fdc(2, izsVar, arrayList2));
                }
                return arrayList2;
            default:
                aab = aace.aab((HealthKitApiInvoker) obj2, (String) obj);
                return aab;
        }
    }
}

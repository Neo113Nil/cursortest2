package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.dto.music.Thumb;
import com.vk.superapp.bridges.dto.analytics.RefreshType;
import com.vk.superapp.bridges.dto.analytics.VkHealthProductType;
import com.vk.superapp.bridges.dto.analytics.VkSystemWidgetType;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class i7o0 {
    public static ExecutorService a;
    public static zdw b;

    public static final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        return arrayList;
    }

    public static final long b(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static Thumb e(String str) {
        return (Thumb) Thumb.f.a(new JSONObject(str));
    }

    public static final zdw f() {
        zdw zdwVar = b;
        if (zdwVar != null) {
            return zdwVar;
        }
        return null;
    }

    public static final Integer g(Collection collection, izs izsVar) {
        Iterator it = collection.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (((Boolean) izsVar.invoke(next)).booleanValue()) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static final byte[] h(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 8192);
        return byteArrayOutputStream.toByteArray();
    }

    public static void i(@NonNull Status status, @Nullable Object obj, @NonNull TaskCompletionSource taskCompletionSource) {
        if (status.i()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(ey2.g(status));
        }
    }

    public static s3q0 j(Throwable th) {
        try {
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            udx0Var.g(new cpv0(VkHealthProductType.WORKOUTS, VkSystemWidgetType.SMALL_OVERVIEW, RefreshType.REFRESH, th != null ? th.getMessage() : null));
            return s3q0.a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean k(@NonNull Status status, @Nullable Object obj, @NonNull TaskCompletionSource taskCompletionSource) {
        return status.i() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(ey2.g(status));
    }

    public long d() {
        return System.currentTimeMillis();
    }
}

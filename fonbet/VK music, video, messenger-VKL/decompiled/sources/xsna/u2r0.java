package xsna;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.UnsupportedEncodingException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: Util.java */
/* loaded from: classes13.dex */
public final class u2r0 {
    @Nullable
    public static String a(@Nullable wfx wfxVar) {
        if (wfxVar == null) {
            return null;
        }
        try {
            b23 b23Var = (b23) Tasks.await(wfxVar.getToken(), ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, TimeUnit.MILLISECONDS);
            if (b23Var.a() != null) {
                Objects.toString(b23Var.a());
            }
            return b23Var.b();
        } catch (InterruptedException e) {
            e = e;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (TimeoutException e3) {
            e = e3;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        }
    }

    @Nullable
    public static void b(@Nullable yfx yfxVar) {
        if (yfxVar != null) {
            try {
                ((yvt) Tasks.await(yfxVar.h(), ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, TimeUnit.MILLISECONDS)).getClass();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("StorageUtil", "error getting token " + e);
                return;
            }
        }
        TextUtils.isEmpty(null);
    }

    @Nullable
    public static Uri c(@Nullable String str) throws UnsupportedEncodingException {
        String str2;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = a560.j;
        str2 = "";
        if (str.toLowerCase().startsWith("gs://")) {
            String w = d02.w(str.substring(5));
            if (!TextUtils.isEmpty(w)) {
                String encode = Uri.encode(w);
                exc0.i(encode);
                str2 = encode.replace("%2F", DomExceptionUtils.SEPARATOR);
            }
            return Uri.parse("gs://" + str2);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || !(dq70.b(scheme.toLowerCase(), "http") || dq70.b(scheme.toLowerCase(), HttpRequest.DEFAULT_SCHEME))) {
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String encodedPath = parse.getEncodedPath();
        exc0.i(encodedPath);
        String replace = encodedPath.replace("%2F", DomExceptionUtils.SEPARATOR);
        if (indexOf == 0 && replace.startsWith(DomExceptionUtils.SEPARATOR)) {
            int indexOf2 = replace.indexOf("/b/", 0);
            int i = indexOf2 + 3;
            int indexOf3 = replace.indexOf(DomExceptionUtils.SEPARATOR, i);
            int indexOf4 = replace.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = replace.substring(i, indexOf3);
            replace = indexOf4 != -1 ? replace.substring(indexOf4 + 3) : "";
        } else {
            if (indexOf <= 1) {
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = parse.getAuthority().substring(0, indexOf - 1);
        }
        exc0.g(substring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(substring).encodedPath(replace).build();
    }
}

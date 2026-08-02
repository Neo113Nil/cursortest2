package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.VerifyInfo;
import com.vk.superapp.base.js.bridge.Responses$ApiError;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonConnectionLost;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: TextBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class fco0 implements dba0 {
    public static final jai b = new jai(-1112361506, new ndi(2), false);

    static {
        new jai(1433856561, new f6g((byte) 0, 3), false);
    }

    public static xfy0 b(String str) {
        if (TextUtils.isEmpty(str)) {
            vay0.d("%s : empty one dt", "OneDTParser");
            return new xfy0("", -1L);
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            if (optJSONObject != null && "onedtid".equalsIgnoreCase(optJSONObject.optString("propertyName", ""))) {
                return new xfy0(optJSONObject.optString("propertyValue", ""), optJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e) {
            ofy0.f(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_PARSE_ERROR, e);
            vay0.d("%s : failed parse one dt", "OneDTParser");
        }
        return new xfy0("", -1L);
    }

    public static final void c() {
        if (Thread.interrupted()) {
            throw new InterruptedException("Thread interrupted");
        }
    }

    public static boolean d(Throwable th) {
        boolean z = th instanceof VKApiExecutionException;
        if (z && ((VKApiExecutionException) th).s() == -1) {
            return true;
        }
        if (z && ((VKApiExecutionException) th).s() == 24) {
            return true;
        }
        return (z && ((VKApiExecutionException) th).s() == 15) || !z;
    }

    public static final boolean e(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[2] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[3] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[4] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[5] == 1.0f && fArr[6] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[7] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[8] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[9] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[10] == 1.0f && fArr[11] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[12] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[13] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[14] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[15] == 1.0f;
    }

    public static boolean f(RecyclerView recyclerView, View view, float f, float f2, boolean z) {
        int min;
        int max;
        int height = z ? recyclerView.getHeight() : recyclerView.getWidth();
        int height2 = z ? view.getHeight() : view.getWidth();
        if (height > 0 && height2 > 0) {
            if (z) {
                min = Math.min(recyclerView.getHeight(), view.getBottom());
                max = Math.max(0, view.getTop());
            } else {
                min = Math.min(recyclerView.getWidth(), view.getRight());
                max = Math.max(0, view.getLeft());
            }
            int i = min - max;
            if (i < 0) {
                i = 0;
            }
            float f3 = i;
            if (f3 / height >= f || f3 / height2 >= f2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Responses$ApiError g(Throwable th) {
        String str = null;
        Object[] objArr = 0;
        if (d(th)) {
            return null;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        int s = vKApiExecutionException.s();
        String u = vKApiExecutionException.u();
        if (u == null) {
            u = "";
        }
        Map<String, String> z = vKApiExecutionException.z();
        if (z == null) {
            z = jgp.b;
        }
        ArrayList arrayList = new ArrayList(z.size());
        for (Map.Entry<String, String> entry : z.entrySet()) {
            arrayList.add(new Responses$ApiError.ErrorData.RequestParams(entry.getKey(), entry.getValue()));
        }
        return new Responses$ApiError(str, new Responses$ApiError.ErrorData(s, u, arrayList), 1, objArr == true ? 1 : 0);
    }

    public static Responses$ClientError h(String str, Throwable th) {
        boolean z = th instanceof VKApiExecutionException;
        if (z && ((VKApiExecutionException) th).s() == -1) {
            return new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CONNECTION_LOST, null, null, null, new Responses$ReasonConnectionLost(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, 131054, null), str, 1, null);
        }
        if (z && ((VKApiExecutionException) th).s() == 24) {
            return new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), str, 1, null);
        }
        if (z && ((VKApiExecutionException) th).s() == 15) {
            return new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), str, 1, null);
        }
        if (z) {
            return null;
        }
        if (th instanceof IllegalStateException) {
            return new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), str, 1, null);
        }
        return new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, th.getMessage(), new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), str, 1, null);
    }

    public static final dnr0 i(VerifyInfo verifyInfo) {
        return verifyInfo != null ? new dnr0(verifyInfo.b, verifyInfo.c, verifyInfo.d, verifyInfo.e, verifyInfo.f) : new dnr0(0);
    }

    public static final VerifyInfo j(dnr0 dnr0Var) {
        return new VerifyInfo(dnr0Var.a, dnr0Var.b, dnr0Var.c, dnr0Var.d, dnr0Var.e, false, 32, null);
    }

    @Override // xsna.dba0
    public ViewPropertyAnimator a(View view, boolean z, boolean z2) {
        return view.animate().scaleX(z ? 0.75f : 1.0f).scaleY(z ? 0.75f : 1.0f).setDuration(z2 ? 100L : 0L);
    }
}

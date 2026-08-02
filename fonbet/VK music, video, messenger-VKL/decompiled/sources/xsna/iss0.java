package xsna;

import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoOwner;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: VideoLinkHelper.kt */
/* loaded from: classes16.dex */
public final class iss0 {
    public static final iss0 a = new iss0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.vk.dto.common.id.UserId] */
    public static io.reactivex.rxjava3.core.q a(String str, io.reactivex.rxjava3.internal.operators.observable.m1 m1Var) {
        int i;
        String str2;
        String str3 = "";
        if (str == null) {
            return m1Var.U(new nlf0(new xlq0(3), 13));
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r3 = UserId.d;
        ref$ObjectRef.element = r3;
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("z");
            String U = (queryParameter == null || (str2 = (String) j5g.b0(0, drm0.c0(queryParameter, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6))) == null) ? null : drm0.U(str2, "video");
            if (U != null) {
                str3 = U;
            }
            List c0 = drm0.c0(str3, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
            String str4 = (String) j5g.b0(1, c0);
            i = str4 != null ? Integer.parseInt(str4) : -1;
            try {
                String str5 = (String) j5g.b0(0, c0);
                T t = r3;
                if (str5 != null) {
                    t = new UserId(Long.parseLong(str5));
                }
                ref$ObjectRef.element = t;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            i = -1;
        }
        int i2 = 5;
        return io.reactivex.rxjava3.core.q.I0(m1Var, (drm0.N(str3) || i == -1) ? io.reactivex.rxjava3.core.q.T(new VideoOwner(-1, UserId.d)) : new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.l0(new ins0((UserId) ref$ObjectRef.element, i), null, 3), new cmc0(new eyp0(7), 6)), new cyh0(new hre(i2), i2));
    }
}

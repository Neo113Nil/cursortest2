package xsna;

import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* compiled from: UploadBridge.kt */
/* loaded from: classes15.dex */
public interface baq0 {
    void a(String str);

    boolean b();

    void c(String str, UserId userId, mp3 mp3Var, g84 g84Var);

    void d();

    void e();

    void f(Throwable th);

    void g();

    void h(int i);

    Object i(ContinuationImpl continuationImpl);

    void j();

    void k(Uri uri, UserId userId);

    void l(String str, RectF rectF, boolean z, Integer num);

    void m();

    void n(Intent intent, boolean z);

    void o();

    void p(Integer num, String str);

    Object q(boolean z, k2j0 k2j0Var);

    void r(boolean z, boolean z2, boolean z3);

    void s(Photo photo);

    default Parcelable t(UserId userId, String str) {
        return null;
    }

    void u(int i, UserId userId, String str);

    void v(JSONObject jSONObject);

    void w(float f);

    boolean x();
}

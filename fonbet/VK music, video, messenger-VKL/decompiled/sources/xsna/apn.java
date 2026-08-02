package xsna;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* compiled from: DivSightAction.kt */
/* loaded from: classes8.dex */
public interface apn {
    Expression<String> a();

    Expression<Long> b();

    com.yandex.div2.k0 c();

    String d();

    Expression<Uri> e();

    pkn f();

    JSONObject getPayload();

    Expression<Uri> getUrl();

    Expression<Boolean> isEnabled();
}

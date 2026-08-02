package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.push.common.analytics.AnalyticsCallback;
import java.util.Map;
import ru.mail.libverify.platform.core.ISmsRetrieverService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class uqi implements AnalyticsCallback, ISmsRetrieverService {
    public static String a(String str, int i, char c) {
        return str + i + c;
    }

    public static String b(StringBuilder sb, Integer num, char c) {
        sb.append(num);
        sb.append(c);
        return sb.toString();
    }

    @Override // ru.mail.libverify.platform.core.ISmsRetrieverService
    public void enqueueWork(Context context, Intent intent) {
        ru.mail.libverify.platform.firebase.a.a(context, intent);
    }

    @Override // com.vk.push.common.analytics.AnalyticsCallback
    public void onAnalyticsEvent(String str, Map map) {
    }
}

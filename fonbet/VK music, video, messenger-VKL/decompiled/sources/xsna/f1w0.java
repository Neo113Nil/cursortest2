package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: VkVoipNotificationsConfig.kt */
/* loaded from: classes7.dex */
public final class f1w0 implements ctw0 {
    public final Context a;
    public final qjl b;

    public f1w0(Context context) {
        this.a = context;
        this.b = new qjl(context);
    }

    @Override // xsna.ctw0
    public final qjl a() {
        return this.b;
    }

    @Override // xsna.ctw0
    public final String b() {
        return d(R.string.voip_video_call_notification_title);
    }

    @Override // xsna.ctw0
    public final String c() {
        return d(R.string.voip_call_notification_title);
    }

    public final String d(int i) {
        StringBuilder sb = new StringBuilder();
        Context context = this.a;
        sb.append(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
        sb.append(": ");
        sb.append(context.getString(i));
        return sb.toString();
    }
}

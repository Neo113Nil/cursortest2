package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.vk.dto.common.data.ApiApplication;
import kotlin.text.Regex;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.sw50;

/* compiled from: CommonCommunicationsImpl.kt */
/* loaded from: classes7.dex */
public final class jig implements sw50.c {
    @Override // xsna.sw50.c
    public final boolean a(Context context, String str) {
        return com.vk.common.links.c.B(context, str);
    }

    @Override // xsna.sw50.c
    public final void b(Context context, String str, String str2) {
        Regex regex = com.vk.common.links.c.a;
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.putExtra(RTCStatsConstants.KEY_ADDRESS, str);
        intent.setType("text/plain");
        intent.setData(Uri.parse("sms:"));
        intent.putExtra("sms_body", str2);
        context.startActivity(intent);
    }

    @Override // xsna.sw50.c
    public final boolean c(Context context, String str, String str2, String str3) {
        return com.vk.common.links.c.C(context, str, str2, str3);
    }

    @Override // xsna.sw50.c
    public final io.reactivex.rxjava3.disposables.c d(Context context, ApiApplication apiApplication, String str) {
        return hf3.c(new op20(apiApplication, context, new mq20((String) null, (String) null, (String) null, (String) null, 63, (String) null, str), null, new aq20(null, null, null, null, null, null, null, false, null, false, 3839), 8));
    }
}

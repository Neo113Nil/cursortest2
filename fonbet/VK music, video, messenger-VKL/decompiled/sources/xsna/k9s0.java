package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vkontakte.android.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: VideoCatalogLink.kt */
/* loaded from: classes14.dex */
public final class k9s0 implements kss0 {
    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        return jh.h("/(?:videos)([-0-9]+)", peq0Var, null, null, 14);
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        Matcher matcher;
        yy0 yy0Var = new yy0(peq0Var, ydt0Var, context, 11);
        Pattern compile = Pattern.compile("album_([-0-9]+)");
        String str = peq0Var.d;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                matcher = compile.matcher(str);
                if (matcher != null || !matcher.find()) {
                    yy0Var.invoke();
                    return null;
                }
                try {
                    VideoAlbum videoAlbum = new VideoAlbum(Integer.parseInt(matcher.group(1)), new UserId(peq0Var.c(1)), context.getString(R.string.album), null, 0, 0, null, false, null, false, false, 0, null, null, false, null, null, null, 262136, null);
                    Activity h = e3m.h(context);
                    if (h != null) {
                        ydt0.e(fxc0.B().Y(), h, videoAlbum, null, null, 28);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    return null;
                } catch (NumberFormatException unused) {
                    yy0Var.invoke();
                    s3q0 s3q0Var2 = s3q0.a;
                    return null;
                }
            }
        }
        matcher = null;
        if (matcher != null) {
        }
        yy0Var.invoke();
        return null;
    }
}

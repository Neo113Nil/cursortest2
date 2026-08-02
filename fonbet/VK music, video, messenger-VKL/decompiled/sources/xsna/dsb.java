package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.im.engine.exceptions.ApiArgNotFoundException;
import com.vk.im.engine.exceptions.ImTaskExecutionException;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import java.util.concurrent.TimeoutException;
import xsna.wzb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class dsb implements izs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Uri e;

    public /* synthetic */ dsb(Context context, Uri uri, String str, String str2) {
        this.b = context;
        this.c = str;
        this.d = str2;
        this.e = uri;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable cause;
        Throwable cause2;
        Throwable th = (Throwable) obj;
        if (th instanceof TimeoutException) {
            ChatInviteFragment.c cVar = ChatInviteFragment.T;
            ChatInviteFragment.c.c(this.b, this.c, this.d, this.e, false, null);
        } else {
            if (((th instanceof ImTaskExecutionException) || (th instanceof ApiArgNotFoundException)) && (cause = th.getCause()) != null) {
                if ((!(cause instanceof ImTaskExecutionException) && !(cause instanceof ApiArgNotFoundException)) || (th = cause.getCause()) == null) {
                    th = cause;
                } else if (((th instanceof ImTaskExecutionException) || (th instanceof ApiArgNotFoundException)) && (cause2 = th.getCause()) != null) {
                    th = wzb.a.b(cause2);
                }
            }
            zk70.e(th);
        }
        return s3q0.a;
    }
}

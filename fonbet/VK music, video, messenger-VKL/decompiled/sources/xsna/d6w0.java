package xsna;

import android.content.Context;
import com.vk.dto.stickers.VmojiAvatar;

/* compiled from: VmojiBridge.kt */
/* loaded from: classes7.dex */
public interface d6w0 {
    static /* synthetic */ void a(d6w0 d6w0Var, Context context, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        d6w0Var.b(context, str, str2);
    }

    void b(Context context, String str, String str2);

    void c(Context context, VmojiAvatar vmojiAvatar);

    void d(Context context, int i, String str);

    void e(jbs jbsVar, String str);

    void f(long j, Context context, Integer num, String str);
}

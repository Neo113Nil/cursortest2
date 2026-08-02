package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import com.vk.contacts.AndroidContact;
import com.vk.dto.attaches.Attach;
import java.util.Collection;

/* compiled from: ImActionBridge.kt */
/* loaded from: classes.dex */
public interface iwv {
    public static final a a = a.a;

    /* compiled from: ImActionBridge.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final ComponentName b = new ComponentName("com.vk.im", "com.vk.im.ui.MainActivity");
    }

    /* compiled from: ImActionBridge.kt */
    /* loaded from: classes2.dex */
    public static abstract class b {
    }

    static /* synthetic */ void f(iwv iwvVar, Context context, int i, String str, String str2, String str3, String str4, int i2) {
        int i3;
        String str5;
        String str6;
        String str7;
        String str8;
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            i3 = i;
            str5 = str;
            str6 = str2;
            str7 = str3;
            str8 = null;
        } else {
            i3 = i;
            str5 = str;
            str6 = str2;
            str7 = str3;
            str8 = str4;
        }
        iwvVar.h(context, str5, str6, str7, str8, i3);
    }

    static /* synthetic */ void l(iwv iwvVar, Context context, Attach attach, com.vk.im.engine.models.messages.a aVar, qtd0 qtd0Var, Long l, View view, boolean z, int i) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        if ((i & 8) != 0) {
            qtd0Var = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            view = null;
        }
        if ((i & 64) != 0) {
            z = true;
        }
        iwvVar.m(context, attach, aVar, qtd0Var, l, view, z);
    }

    void a(Context context, String str);

    void b(Context context, String str);

    void c(Context context, k320 k320Var);

    void d(Context context, String str);

    void e(Context context, String str);

    void h(Context context, String str, String str2, String str3, String str4, int i);

    default s3v0 i(Context context) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return new s3v0(context, this, a1wVar.r().O.i(), cew.b);
    }

    default boolean j(Context context) {
        return false;
    }

    void k(Context context, long j, String str);

    void m(Context context, Attach attach, com.vk.im.engine.models.messages.a aVar, qtd0 qtd0Var, Long l, View view, boolean z);

    default void g(Context context, Collection<AndroidContact> collection) {
    }

    default void n(Context context, String str) {
    }
}

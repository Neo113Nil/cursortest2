package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vk.log.L;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class fp {
    public static Intent a(String str, Context context, BroadcastReceiver broadcastReceiver) {
        return context.registerReceiver(broadcastReceiver, new IntentFilter(str));
    }

    public static StringBuilder b(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static PropertyReference1Impl c(int i, Class cls, String str, String str2, hpf0 hpf0Var) {
        hpf0Var.getClass();
        return new PropertyReference1Impl(cls, str, str2, i);
    }

    public static void d(String str) {
        L.i(new IllegalStateException(str));
    }
}

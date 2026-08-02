package xsna;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: SystemJobInfoConverter.java */
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class qqn0 {
    public final ComponentName a;
    public final i7o0 b;
    public final boolean c;

    /* compiled from: SystemJobInfoConverter.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        m100.d("SystemJobInfoConverter");
    }

    public qqn0(@NonNull Context context, i7o0 i7o0Var, boolean z) {
        this.b = i7o0Var;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }
}

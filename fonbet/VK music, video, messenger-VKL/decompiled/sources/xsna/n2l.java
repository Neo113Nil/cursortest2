package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* loaded from: classes11.dex */
public final class n2l {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTraceElement.getLineNumber() + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String c(int i, Context context) {
        if (i == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        try {
            i = context.getResources().getResourceEntryName(i);
            return i;
        } catch (Exception unused) {
            return lhg.a(i, "?");
        }
    }

    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }
}

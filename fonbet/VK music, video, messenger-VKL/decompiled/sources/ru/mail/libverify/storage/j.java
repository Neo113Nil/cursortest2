package ru.mail.libverify.storage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
final class j {

    @Nullable
    private static ru.mail.libverify.m.m a;

    @Nullable
    public static synchronized ru.mail.libverify.m.m a(@NonNull Context context) {
        synchronized (j.class) {
            try {
                ru.mail.libverify.m.m mVar = a;
                if (mVar != null) {
                    return mVar;
                }
                try {
                    if (new File(ru.mail.libverify.n0.e.c(context), "SMS_TEMPLATES").exists()) {
                        FileLog.v("SmsTemplatesStorage", "start file read");
                        long nanoTime = System.nanoTime();
                        String b = ru.mail.libverify.n0.e.b(new File(ru.mail.libverify.n0.e.c(context), "SMS_TEMPLATES"));
                        if (!TextUtils.isEmpty(b)) {
                            a = (ru.mail.libverify.m.m) ru.mail.libverify.q0.a.a(b, ru.mail.libverify.m.m.class);
                            FileLog.v("SmsTemplatesStorage", "file read competed (%d ms)", Long.valueOf((System.nanoTime() - nanoTime) / 1000000));
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    Log.e("SmsTemplatesStorage", "Failed to read sms info file", e);
                } catch (JsonParseException e2) {
                    e = e2;
                    Log.e("SmsTemplatesStorage", "Failed to read sms info file", e);
                } catch (Throwable th) {
                    ru.mail.libverify.n0.b.a("SmsTemplatesStorage", "Failed to read sms info file", th);
                }
                return a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void a(@NonNull Context context, @Nullable ru.mail.libverify.m.m mVar) {
        File file;
        synchronized (j.class) {
            try {
                try {
                    a = mVar;
                    file = new File(ru.mail.libverify.n0.e.c(context), "SMS_TEMPLATES");
                } catch (IOException e) {
                    e = e;
                    Log.e("SmsTemplatesStorage", "Failed to write sms info file", e);
                } catch (JsonParseException e2) {
                    e = e2;
                    Log.e("SmsTemplatesStorage", "Failed to write sms info file", e);
                } catch (Throwable th) {
                    ru.mail.libverify.n0.b.a("SmsTemplatesStorage", "Failed to write sms info file", th);
                }
                if (mVar == null) {
                    if (file.exists()) {
                        boolean delete = file.delete();
                        if (!delete) {
                            File file2 = new File(ru.mail.libverify.n0.e.c(context), "SMS_TEMPLATES_TMP");
                            boolean renameTo = file.renameTo(file2);
                            delete = renameTo ? file2.delete() : renameTo;
                        }
                        FileLog.d("SmsTemplatesStorage", "sms info delete result " + delete);
                        return;
                    }
                    return;
                }
                FileLog.v("SmsTemplatesStorage", "start file write");
                long currentTimeMillis = System.currentTimeMillis();
                ru.mail.libverify.n0.e.b(file, ru.mail.libverify.q0.a.f(mVar));
                FileLog.v("SmsTemplatesStorage", "file write competed (%d ms)", Long.valueOf((System.nanoTime() - currentTimeMillis) / 1000000));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.concurrent.futures.b;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes10.dex */
public final /* synthetic */ class e5h implements ruy, el7, at21, sll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ e5h(pyf0 pyf0Var, long j, v790 v790Var) {
        this.a = 3;
        this.c = pyf0Var;
        this.b = j;
        this.w = v790Var;
    }

    @Override // defpackage.sll0
    public Object apply(Object obj) {
        String str = (String) this.c;
        LogEventDropped$Reason logEventDropped$Reason = (LogEventDropped$Reason) this.w;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(logEventDropped$Reason.getNumber())});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.b;
            if (z) {
                sQLiteDatabase.execSQL(qv10.k(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(logEventDropped$Reason.getNumber())});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(CRLReasonCodeExtension.REASON, Integer.valueOf(logEventDropped$Reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.at21
    /* renamed from: e */
    public x08 mo25e(cl21 cl21Var) {
        pyf0 pyf0Var = (pyf0) this.c;
        v790 v790Var = (v790) this.w;
        d9g d9gVar = (d9g) cl21Var;
        h9b b = d9gVar.b();
        String chatId = pyf0Var.a.getChatId();
        if (chatId == null) {
            ny61.t("chatId must be initialized");
            return null;
        }
        s020 e = b.e(chatId);
        if (e != null) {
            return d9gVar.e().f(new oyf0(pyf0Var, e, this.b, v790Var));
        }
        ny61.r("chat component must be initialized");
        return null;
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        ((j42) obj).onRenderedFirstFrame((h42) this.c, this.w, this.b);
    }

    @Override // defpackage.el7
    public Object j(final b bVar) {
        int i = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        final long j = this.b;
        Object obj = this.w;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                gl7 gl7Var = (gl7) obj2;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) obj;
                ni91.h(gl7Var, bVar);
                fl7 fl7Var = gl7Var.b;
                if (!fl7Var.isDone()) {
                    final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new qpo(17, bVar, gl7Var), j, timeUnit);
                    final int i2 = 0;
                    fl7Var.c(new Runnable() { // from class: rqs
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            ScheduledFuture scheduledFuture = schedule;
                            switch (i3) {
                                case 0:
                                    scheduledFuture.cancel(true);
                                    break;
                                default:
                                    scheduledFuture.cancel(true);
                                    break;
                            }
                        }
                    }, geb1.b());
                }
                return "TimeoutFuture[" + gl7Var + "]";
            default:
                final euy euyVar = (euy) obj2;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) obj;
                ni91.h(euyVar, bVar);
                if (!euyVar.isDone()) {
                    final ScheduledFuture schedule2 = scheduledExecutorService2.schedule(new Callable() { // from class: sqs
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(b.this.d(new TimeoutException("Future[" + euyVar + "] is not done within " + j + " ms.")));
                        }
                    }, j, timeUnit);
                    final int i3 = 1;
                    euyVar.c(new Runnable() { // from class: rqs
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i32 = i3;
                            ScheduledFuture scheduledFuture = schedule2;
                            switch (i32) {
                                case 0:
                                    scheduledFuture.cancel(true);
                                    break;
                                default:
                                    scheduledFuture.cancel(true);
                                    break;
                            }
                        }
                    }, geb1.b());
                }
                return "TimeoutFuture[" + euyVar + "]";
        }
    }

    public /* synthetic */ e5h(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = j;
    }
}

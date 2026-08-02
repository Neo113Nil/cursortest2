package defpackage;

import android.os.CountDownTimer;
import defpackage.eez0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class eez0 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            CountDownTimer countDownTimer = (CountDownTimer) ((Map.Entry) it.next()).getValue();
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        linkedHashMap.clear();
    }

    public final void b(String str) {
        CountDownTimer countDownTimer = (CountDownTimer) this.a.remove(str);
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void c(long j, final sls slsVar) {
        final String str = "INFO_TIMER_TAG";
        if (evu0.J("INFO_TIMER_TAG")) {
            LinkedHashMap linkedHashMap = zdz.a;
            ogb1.b("Failed to init timer. Argument timerTag is blank ".concat("INFO_TIMER_TAG"));
        } else {
            b("INFO_TIMER_TAG");
            final long j2 = j * 1000;
            this.a.put("INFO_TIMER_TAG", new CountDownTimer(j2) { // from class: com.yandex.payment.sdk.ui.utils.TimerModel$setupAndStartTimer$timer$1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    eez0.this.b(str);
                    slsVar.invoke();
                }

                @Override // android.os.CountDownTimer
                public void onTick(long millisUntilFinished) {
                }
            }.start());
        }
    }
}

package defpackage;

import android.os.CountDownTimer;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import defpackage.xah0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class amf implements dpk {
    @Override // defpackage.dpk
    public final void bindView(final Div2View div2View, rvo rvoVar, final View view, egk egkVar) {
        JSONObject jSONObject;
        Object tag = view.getTag(xah0.ybsdk_countdown_timer_tag);
        Object obj = null;
        CountDownTimer countDownTimer = tag instanceof CountDownTimer ? (CountDownTimer) tag : null;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((bpk) next).a, "custom_countdown_timer")) {
                    obj = next;
                    break;
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar == null || (jSONObject = bpkVar.b) == null) {
                return;
            }
            final long optLong = jSONObject.optLong("target_timestamp_ms") - System.currentTimeMillis();
            if (optLong <= 0) {
                div2View.setVariable("is_timer_finished", "true");
            } else {
                view.setTag(xah0.ybsdk_countdown_timer_tag, new CountDownTimer(optLong) { // from class: com.ybsdk.feature.divkit.internal.extensions.CustomTimerDivKitHandler$bindView$timer$1
                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        div2View.setVariable("is_timer_finished", "true");
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long millisUntilFinished) {
                        Object tag2 = view.getTag(xah0.ybsdk_last_displayed_time_tag);
                        String str = tag2 instanceof String ? (String) tag2 : null;
                        this.getClass();
                        String format = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(millisUntilFinished / 3600000), Long.valueOf((millisUntilFinished / 60000) % 60), Long.valueOf((millisUntilFinished / 1000) % 60)}, 3));
                        if (format.equals(str)) {
                            return;
                        }
                        div2View.setVariable("timer_display_string", format);
                        view.setTag(xah0.ybsdk_last_displayed_time_tag, format);
                    }
                }.start());
            }
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions == null) {
            return false;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, "custom_countdown_timer")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object tag = view.getTag(xah0.ybsdk_countdown_timer_tag);
        CountDownTimer countDownTimer = tag instanceof CountDownTimer ? (CountDownTimer) tag : null;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        view.setTag(xah0.ybsdk_last_displayed_time_tag, null);
        view.setTag(xah0.ybsdk_countdown_timer_tag, null);
    }
}

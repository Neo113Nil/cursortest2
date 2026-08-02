package xsna;

import com.vk.core.preference.Preference;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.log.L;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import ru.ok.gl.tf.Tensorflow;
import xsna.asu0;
import xsna.trw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o8r implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ o8r(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.a b;
        switch (this.b) {
            case 0:
                L.j((Throwable) obj, "NSPK_LIST_DOWNLOADER", "Could not save NSPK list");
                return s3q0.a;
            case 1:
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject == null) {
                    return null;
                }
                if (((trw.a) trw.a.getValue()).b() >= 5) {
                    io.reactivex.rxjava3.disposables.c cVar = trw.b;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    b = fsk.t().b(InAppReviewConditionKey.ADD_5_CHANGED_AND_SAVE_VMOJI, jgp.b);
                    trw.b = new io.reactivex.rxjava3.internal.operators.completable.h(io.reactivex.rxjava3.core.a.s(3L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.a.a()).c(b).o(io.reactivex.rxjava3.android.schedulers.a.b()), new io.reactivex.rxjava3.functions.a() { // from class: xsna.srw
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            ((trw.a) trw.a.getValue()).a = 0L;
                            Preference.C("vk_in_app_review_trigger_controller", "vmoji_add_5_changes");
                        }
                    }).subscribe();
                }
                return jSONObject;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VKApplication.a aVar = VKApplication.c;
                asu0.a.getClass();
                int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) - 1;
                return asu0.E(new asu0.a(availableProcessors, availableProcessors, 50L, true, true, booleanValue ? -15 : null, Tensorflow.FRAME_HEIGHT), "vk-parallel-startup-");
        }
    }
}

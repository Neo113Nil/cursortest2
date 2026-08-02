package defpackage;

import android.net.Uri;
import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.CashbackScreenConfig;
import java.lang.reflect.ParameterizedType;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public abstract class e49 {
    public static final dfr a;

    static {
        String q = tje.q(tje.E1);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, CashbackScreenConfig.class);
        String q2 = tje.q(tje.e3);
        Regex regex = gtu0.a;
        a = new dfr(q, newParameterizedType, new CommonExperiment(new CashbackScreenConfig(true, unr0.p("ybapp://screen.open/open_web?url=", Uri.encode(q2), "&auth=", tje.q(tje.G1), "&control=none&show_navbar=false&swipe_navigation=true")), ExperimentApplyType.LATEST));
    }
}

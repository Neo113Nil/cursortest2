package defpackage;

import android.net.Uri;
import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.AppIconConfigSchema;
import java.lang.reflect.ParameterizedType;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public abstract class bu2 {
    public static final dfr a;

    static {
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, AppIconConfigSchema.class);
        Regex regex = gtu0.a;
        a = new dfr("yb_mobile_app_icon_config", newParameterizedType, new CommonExperiment(new AppIconConfigSchema(oyr.p("ybapp://screen.open/divkit?path=", Uri.encode("/v1/app-icons/selection"), "&screen=choose_app_icon&skeleton=app_icon_selection&fit_window_top=false&show_navbar=false&statusbar_style=light"), Boolean.TRUE, null, null, null), ExperimentApplyType.LATEST));
    }
}

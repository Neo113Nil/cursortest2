package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7q0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ f7q0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            case 1:
                qcy<Object>[] qcyVarArr = UserProfileComponentImpl.m;
                return new joz();
            case 2:
                return Integer.valueOf((int) x5r0.a(480, 1));
            case 3:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return Integer.valueOf(context.getColor(R.color.vk_white_alpha60));
            case 4:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AUTOPLAY_TRAILERS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 5:
                return Preference.j();
            case 6:
                return new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
            case 7:
                return s3q0.a;
            case 8:
                return tlo0.Companion.serializer();
            case 9:
                return new pco(0);
            default:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.J().f();
        }
    }
}

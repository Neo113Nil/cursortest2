package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.tool.view.onboarding.VkOnboardingBanner;
import com.vk.toggle.features.ComFeatures;
import java.io.File;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class im80 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ im80(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                return new mpz();
            case 1:
                return new ls90();
            case 2:
                return new ColorDrawable();
            case 3:
                return s3q0.a;
            case 4:
                nr4.a().getClass();
                return Integer.valueOf(o0m0.a());
            case 5:
                return new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            case 6:
                return new com.vk.music.player.playback.d();
            case 7:
                ComFeatures comFeatures = ComFeatures.COM_PROFILE_SUBSCRIBE;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 8:
                ComFeatures comFeatures2 = ComFeatures.COM_PROFILE_DONUT_VIDEO;
                comFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures2));
            case 9:
                return new zi50();
            case 10:
                return s3q0.a;
            case 11:
                b = e8r.a.b(r3, PrivateSubdir.VIDEO_DOWNLOADS.h(), false);
                File file = b.a;
                if (!file.isDirectory()) {
                    return null;
                }
                String[] list = file.list();
                if (list == null) {
                    list = new String[0];
                }
                for (String str : list) {
                    if (!brm0.v(str, "uid", false) && !str.equals("test.tmp")) {
                        Context context = e43.a;
                        return new o0m(context != null ? context : null);
                    }
                }
                return null;
            case 12:
                return new zzq(true);
            case 13:
                return s3q0.a;
            case 14:
                return new tub0(fpf0.a(k1u0.class), new Annotation[0]);
            case 15:
                throw null;
            case 16:
                int i = VkOnboardingBanner.y;
                return s3q0.a;
            case 17:
                return (mfv0) jfv0.t.getValue();
            default:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_voip_ok_test_domain", false));
        }
    }
}

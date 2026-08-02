package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import xsna.pbj0;

/* compiled from: ExternalShare.kt */
/* loaded from: classes5.dex */
public abstract class qfq {
    public static final a c = new a(R.string.sharing_external_app_telegram, R.drawable.vk_icon_logo_telegram_color_28, "org.telegram.messenger");
    public static final a d = new a(R.string.sharing_external_app_telegram, R.drawable.vk_icon_logo_telegram_color_28, "org.telegram.messenger.web");
    public static final a e = new a(R.string.sharing_external_app_whatsapp, R.drawable.vk_icon_logo_whatsapp_color_28, "com.whatsapp");
    public static final a f = new a(R.string.sharing_external_app_max, R.drawable.vk_icon_logo_max_circle_color_28, "ru.oneme.app");
    public final int a;
    public final int b;

    /* compiled from: ExternalShare.kt */
    public static final class a extends qfq {
        public final String g;

        /* compiled from: ExternalShare.kt */
        /* renamed from: xsna.qfq$a$a, reason: collision with other inner class name */
        public static final class C3560a {
            public static String a(int i) {
                pbj0.b bVar = com.vk.toggle.d.r().e;
                if (i == 7) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_MAX_INSTALL;
                    videoFeatures.getClass();
                    return (com.vk.toggle.b.A.a(videoFeatures) && BuildInfo.q()) ? com.vk.toggle.d.y().b : com.vk.toggle.d.r().e.b;
                }
                if (i == 26) {
                    return bVar.d;
                }
                if (i == 30) {
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_MAX_INSTALL;
                    videoFeatures2.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures2)) {
                        return com.vk.toggle.d.y().a;
                    }
                    return null;
                }
                if (i == 31) {
                    return bVar.a;
                }
                if (i == 49) {
                    return bVar.c;
                }
                if (i != 50) {
                    return null;
                }
                VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_MAX_INSTALL;
                videoFeatures3.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures3)) {
                    return com.vk.toggle.d.y().c;
                }
                return null;
            }
        }

        public a(int i, int i2, String str) {
            super(i, i2);
            this.g = str;
        }
    }

    /* compiled from: ExternalShare.kt */
    public static final class b extends qfq {
        public static final b g = new b(R.string.sharing_action_button_label3, R.drawable.vk_icon_copy_outline_28);
    }

    /* compiled from: ExternalShare.kt */
    public static final class c extends qfq {
        public static final c g = new c(R.string.sharing_external_email, R.drawable.vk_icon_mail_outline_28);
    }

    /* compiled from: ExternalShare.kt */
    public static final class d extends qfq {
        public static final d g = new d(R.string.sharing_external_sms, R.drawable.vk_icon_smartphone_outline_28);
    }

    /* compiled from: ExternalShare.kt */
    public static final class e extends qfq {
    }

    public qfq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}

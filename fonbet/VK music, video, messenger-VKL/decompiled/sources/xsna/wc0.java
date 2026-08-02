package xsna;

import com.vk.stat.scheme.CommonVideoAdsStat$CommonFields;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdClose;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdMenuAction;

/* compiled from: AdBannerStatTracker.kt */
/* loaded from: classes2.dex */
public interface wc0 {

    /* compiled from: AdBannerStatTracker.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final Long d;

        public a(String str, Long l, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = l;
        }
    }

    void a(String str);

    void b();

    void c(CommonVideoAdsStat$TypeOverlayAdMenuAction.MenuAction menuAction);

    void d(CommonVideoAdsStat$TypeOverlayAdClose.CloseSource closeSource, CommonVideoAdsStat$TypeOverlayAdClose.CloseReason closeReason);

    void e();

    void f(boolean z, CommonVideoAdsStat$CommonFields.BannerType bannerType, a aVar);

    void g();
}

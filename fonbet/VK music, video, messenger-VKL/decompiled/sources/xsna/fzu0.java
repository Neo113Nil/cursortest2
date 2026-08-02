package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: VkHtmlGameView.kt */
/* loaded from: classes6.dex */
public interface fzu0 extends gvv0 {

    /* compiled from: VkHtmlGameView.kt */
    public interface a extends fvv0 {
        boolean P();

        void b0(boolean z);

        @Override // xsna.fvv0, xsna.xwv0
        fzu0 getView();

        void m(String str);
    }

    void G9(WebApiApplication webApiApplication);

    void Q6(WebApiApplication webApiApplication, String str);

    void Z8(WebApiApplication webApiApplication, int i, int i2);

    void g8(UserId userId, String str);

    void o9(UserId userId, String str, String str2);
}

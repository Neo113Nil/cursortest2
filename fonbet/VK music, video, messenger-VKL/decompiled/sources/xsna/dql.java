package xsna;

import android.content.Context;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import xsna.tlo0;

/* compiled from: DefaultUnavailableTabContentView.kt */
/* loaded from: classes15.dex */
public final class dql extends VkPlaceholder {
    public dql(Context context) {
        super(context, null, 0);
    }

    public final void n(Integer num, String str, gzs gzsVar) {
        VkPlaceholder.a.C0857a.C0858a c0858a;
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        VkButton.Mode mode = VkButton.Mode.Primary;
        tlo0.h d = oq.d(tlo0.Companion, str);
        if (num != null) {
            int intValue = num.intValue();
            getContext();
            LinkedHashMap linkedHashMap = x1z.a;
            c0858a = new VkPlaceholder.a.C0857a.C0858a(new gko(intValue), null, null);
        } else {
            c0858a = null;
        }
        VkPlaceholder.a.C0857a c0857a = null;
        setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) d, gzsVar, c0858a, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, mode, (VkButton.Appearance) null, false, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE), c0857a, c0857a, null, 8));
    }

    public final void o(int i, int i2, String str, String str2) {
        setTop(new VkPlaceholder.c.b(new gko(i), new x7g(i2), null, 12));
        setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, oq.d(tlo0.Companion, str)), new VkPlaceholder.b.C0859b(14, new tlo0.h(str2))));
    }
}

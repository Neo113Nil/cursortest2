package xsna;

import android.widget.TextView;
import com.vk.superapp.bridges.SuperappUiDesignBridge;

/* compiled from: WebAppUiBuilderBridge.kt */
/* loaded from: classes11.dex */
public final class gfx0 implements SuperappUiDesignBridge {
    public static final gfx0 a = new gfx0();

    @Override // com.vk.superapp.bridges.SuperappUiDesignBridge
    public final boolean a() {
        return dhr0.M();
    }

    @Override // com.vk.superapp.bridges.SuperappUiDesignBridge
    public final void b(TextView textView, SuperappUiDesignBridge.FontFamily fontFamily) {
        com.vk.typography.b.k(textView, hfx0.a(fontFamily), null, 6);
    }
}

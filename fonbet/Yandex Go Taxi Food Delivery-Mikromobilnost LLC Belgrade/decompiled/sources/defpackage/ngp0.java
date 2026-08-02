package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes13.dex */
public final class ngp0 {
    public final co40 a;

    public ngp0(co40 co40Var) {
        this.a = co40Var;
    }

    public final void a(Screen screen) {
        String b = screen.b();
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (b != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, b);
        }
        co40Var.a.a("ScreenshotWasCaptured", hashMap, 1, new HashMap());
    }
}

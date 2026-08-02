package xsna;

import com.vk.voip.ui.members.VoipDataProvider;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class j99 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ j99(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                it80.a aVar = it80.b;
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider == null) {
                    voipDataProvider = null;
                }
                whr0 a = voipDataProvider.a(this.c);
                aVar.getClass();
                return new it80(a);
            default:
                return new JSONObject(this.c);
        }
    }
}

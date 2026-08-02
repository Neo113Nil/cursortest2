package xsna;

import android.app.Activity;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.members.VoipDataProvider;
import java.util.concurrent.Callable;
import kotlin.Lazy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ht60 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ht60(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ((YandexAdFeatureComponent) ((Lazy) this.d).getValue()).e5().b((Activity) this.c);
                return s3q0.a;
            default:
                return new it80(((VoipDataProvider) ((clj0) this.c).d.getValue()).a(((CallMemberId) this.d).b));
        }
    }
}

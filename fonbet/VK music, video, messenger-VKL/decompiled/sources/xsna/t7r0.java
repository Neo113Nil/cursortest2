package xsna;

import android.net.Uri;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class t7r0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t7r0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                VKApplication.a aVar = VKApplication.c;
                return (Boolean) ((v94) obj).invoke();
            default:
                return Uri.parse((String) obj);
        }
    }
}

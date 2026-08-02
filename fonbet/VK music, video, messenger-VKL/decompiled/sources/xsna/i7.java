package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.work.impl.WorkDatabase;
import com.vk.imageloader.view.VkImageViewTopCrop;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import java.security.InvalidParameterException;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i7 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object c;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (AboutVideoItem.h) obj;
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) ((iv3) obj).a;
                Long b = workDatabase.z().b("next_alarm_manager_id");
                int longValue = b != null ? (int) b.longValue() : 0;
                workDatabase.z().a(new txc0("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
            case 2:
                Bitmap invoke = ((pbm0) obj).b.invoke();
                if (invoke != null) {
                    return p8c0.c(invoke);
                }
                throw new InvalidParameterException("Local content preview source undefined");
            case 3:
                int i2 = VkImageViewTopCrop.c;
                return Uri.parse((String) obj);
            case 4:
                return Boolean.valueOf(((u4x0) obj).e);
            default:
                c = ((ru.mail.libverify.j0.j) obj).c();
                return c;
        }
    }

    public /* synthetic */ i7(pbm0 pbm0Var, p8c0 p8c0Var) {
        this.b = 2;
        this.c = pbm0Var;
    }
}

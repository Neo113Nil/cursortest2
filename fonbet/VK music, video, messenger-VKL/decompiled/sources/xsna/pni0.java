package xsna;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import com.vk.log.L;
import java.util.Date;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class pni0 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pni0(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                L.e("SCL", "lastDate: ", new Date(((Long) obj).longValue()), "newDate: ", new Date(((Long) obj2).longValue()));
                return s3q0.a;
            case 1:
                xwk.d().e().a((Context) obj, (String) obj2);
                return s3q0.a;
            default:
                return new AppCompatImageButton((Context) obj, (AttributeSet) obj2);
        }
    }
}

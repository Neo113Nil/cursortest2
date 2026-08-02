package xsna;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.core.preference.Preference;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class s7r0 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ s7r0(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                VKApplication.a aVar = VKApplication.c;
                return Preference.f((String) obj);
            default:
                return new h23((Context) obj, (AttributeSet) obj2);
        }
    }
}

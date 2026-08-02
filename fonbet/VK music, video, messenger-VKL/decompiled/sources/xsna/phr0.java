package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.checkbox.VkCheckbox;
import java.util.HashMap;
import xsna.vhr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class phr0 implements wzs {
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        AttributeSet attributeSet = (AttributeSet) obj2;
        HashMap<String, wzs<Context, AttributeSet, View>> hashMap = vhr0.f;
        return new VkCheckbox(context, attributeSet, 0, vhr0.a.a(context, attributeSet), 4);
    }
}

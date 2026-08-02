package xsna;

import android.graphics.ColorFilter;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsDuetController.kt */
/* loaded from: classes14.dex */
public final /* synthetic */ class vud extends FunctionReferenceImpl implements izs<View, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(View view) {
        uud uudVar = (uud) this.receiver;
        int i = uud.e;
        uudVar.getClass();
        VkImageSimple vkImageSimple = (VkImageSimple) view;
        LinearLayout linearLayout = uudVar.b;
        if (linearLayout == null) {
            linearLayout = null;
        }
        VkImageSimple vkImageSimple2 = (VkImageSimple) linearLayout.getChildAt(uudVar.c);
        vkImageSimple2.setColorFilter((ColorFilter) null);
        vkImageSimple2.setBackground(null);
        LinearLayout linearLayout2 = uudVar.b;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        int indexOfChild = linearLayout2.indexOfChild(vkImageSimple);
        uudVar.c = indexOfChild;
        LinearLayout linearLayout3 = uudVar.b;
        VkImageSimple vkImageSimple3 = (VkImageSimple) (linearLayout3 != null ? linearLayout3 : null).getChildAt(indexOfChild);
        vkImageSimple3.setColorFilter(uudVar.d);
        vkImageSimple3.setBackgroundColor(-1);
        uudVar.a.accept(uudVar.c());
        return s3q0.a;
    }
}

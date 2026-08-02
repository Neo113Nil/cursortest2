package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ButtonScreenContent.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class mr8 extends FunctionReferenceImpl implements izs<Context, com.vk.core.view.components.button.d> {
    public static final mr8 b = new mr8(1, nr8.class, "viewImplementationFactory", "viewImplementationFactory(Landroid/content/Context;)Lcom/vk/core/view/components/button/VkButtonSkeleton;", 1);

    @Override // xsna.izs
    public final com.vk.core.view.components.button.d invoke(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Context context2 = context;
        VkButton vkButton = new VkButton(context2, null, 6, 0);
        vkButton.setOnClickListener(new o44(0));
        com.vk.core.view.components.button.d dVar = new com.vk.core.view.components.button.d(context2);
        dVar.addView(vkButton, 0);
        dVar.setShimmer(new ThemableShimmer.a(context2).a());
        currentWindowMetrics = ((WindowManager) context2.getSystemService("window")).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        dVar.setArea(new a.b(bounds));
        return dVar;
    }
}

package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.profile.user.impl.UserProfileDialogs;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z8o0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ z8o0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, com.vk.core.view.components.tooltip.VkTooltip] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Size size = (Size) this.c;
                a9o0 a9o0Var = (a9o0) this.d;
                View view = (View) this.e;
                y8o0 y8o0Var = (y8o0) this.f;
                List<View> list = (List) this.g;
                float width = size.getWidth();
                ViewGroup viewGroup = (ViewGroup) a9o0Var.a;
                float measuredWidth = width / viewGroup.getMeasuredWidth();
                float y = view.getY();
                y8o0Var.getClass();
                viewGroup.setScaleX(measuredWidth);
                viewGroup.setScaleY(measuredWidth);
                viewGroup.setY(y);
                for (View view2 : list) {
                    view2.setPivotX(viewGroup.getPivotX());
                    view2.setPivotY(viewGroup.getPivotY());
                    view2.setScaleX(measuredWidth);
                    view2.setScaleY(measuredWidth);
                    view2.setY(y);
                }
                break;
            case 1:
                e6p0 e6p0Var = (e6p0) this.c;
                Context context = (Context) this.d;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
                String str = (String) this.f;
                VkTooltip.TooltipGravity tooltipGravity = (VkTooltip.TooltipGravity) this.g;
                Rect rect = (Rect) linkedHashMap.get(str);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                VkTooltip.Appearance k = (e6p0Var.n() == l6p0.Lego && (e6p0Var.k() == VkTooltip.Appearance.Accent || e6p0Var.k() == VkTooltip.Appearance.Transparent)) ? VkTooltip.Appearance.Neutral : e6p0Var.k();
                VkTooltip.a aVar = new VkTooltip.a(context);
                aVar.b = ((tho0) ((zak0) e6p0Var.d).getValue()).a.c;
                aVar.c = ((tho0) ((zak0) e6p0Var.e).getValue()).a.c;
                aVar.e = k;
                aVar.f = tooltipGravity;
                aVar.g = e6p0Var.q();
                aVar.h = e6p0Var.r();
                aVar.i = e6p0Var.o();
                aVar.j = e6p0Var.p();
                aVar.p = e6p0Var.m();
                aVar.q = e6p0Var.s(context, new pwh0(ref$ObjectRef, 13));
                if (rect == null) {
                    rect = new Rect();
                }
                ref$ObjectRef.element = aVar.a(rect);
                break;
            default:
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                qoq0 qoq0Var = (qoq0) this.e;
                ooq0 ooq0Var = (ooq0) this.f;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.g;
                userProfileDialogs.getClass();
                UserProfileDialogs.c(fragmentActivity, qoq0Var);
                userProfileDialogs.i.remove(ooq0Var);
                gzs gzsVar = (gzs) ref$ObjectRef2.element;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}

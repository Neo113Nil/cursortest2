package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.utils.vectordrawable.AnimationTarget;
import com.vk.utils.vectordrawable.EnhancedAnimatedVectorDrawable;
import com.vk.utils.vectordrawable.EnhancedVectorDrawable;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.w1c;

/* compiled from: SelectionDecoration.kt */
/* loaded from: classes2.dex */
public final class uci0 extends LruCache<Integer, Drawable> {
    public final /* synthetic */ vci0 a;
    public final /* synthetic */ tcn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uci0(vci0 vci0Var, tcn tcnVar) {
        super(40);
        this.a = vci0Var;
        this.b = tcnVar;
    }

    @Override // android.util.LruCache
    public final Drawable create(Integer num) {
        int intValue = num.intValue();
        int[] iArr = w1c.b;
        vci0 vci0Var = this.a;
        RecyclerView recyclerView = vci0Var.b;
        Context context = recyclerView.getContext();
        boolean z = vci0Var.d;
        je40 je40Var = new je40(this.b, 8);
        w1c w1cVar = new w1c();
        int[] iArr2 = w1c.b;
        int i = w1c.d;
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, i);
        w1c.a.c(enhancedVectorDrawable, z, je40Var);
        w1cVar.addState(iArr2, enhancedVectorDrawable, i);
        int[] iArr3 = w1c.c;
        int i2 = w1c.e;
        EnhancedVectorDrawable enhancedVectorDrawable2 = new EnhancedVectorDrawable(context, i2);
        w1c.a.b(enhancedVectorDrawable2, z, je40Var);
        w1cVar.addState(iArr3, enhancedVectorDrawable2, i2);
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, R.drawable.vkim_animated_check_on_to_off_outline);
        w1c.a.c(enhancedAnimatedVectorDrawable, z, je40Var);
        AnimationTarget.Property property = AnimationTarget.Property.STROKE_COLOR;
        Integer[] B = jw5.B(new int[]{w1c.a.a(je40Var, z, true), w1c.a.a(je40Var, z, false)});
        com.vk.utils.vectordrawable.a.a(enhancedAnimatedVectorDrawable, "bg", property, Arrays.copyOf(B, B.length));
        AnimationTarget.Property property2 = AnimationTarget.Property.STROKE_ALPHA;
        float[] fArr = new float[2];
        if (z) {
            fArr[0] = 1.0f;
            fArr[1] = 1.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        int length2 = fArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            fArr2[i3] = Float.valueOf(fArr[i3]);
        }
        com.vk.utils.vectordrawable.a.a(enhancedAnimatedVectorDrawable, "outline", property2, Arrays.copyOf(fArr2, length));
        w1cVar.addTransition(i, i2, enhancedAnimatedVectorDrawable, false);
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable2 = new EnhancedAnimatedVectorDrawable(context, R.drawable.vkim_animated_check_off_to_on_outline);
        w1c.a.b(enhancedAnimatedVectorDrawable2, z, je40Var);
        Integer[] B2 = jw5.B(new int[]{w1c.a.a(je40Var, z, false), w1c.a.a(je40Var, z, true)});
        com.vk.utils.vectordrawable.a.a(enhancedAnimatedVectorDrawable2, "bg", property, Arrays.copyOf(B2, B2.length));
        float[] fArr3 = new float[2];
        if (z) {
            fArr3[0] = 1.0f;
            fArr3[1] = 1.0f;
        } else {
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
        }
        int length3 = fArr3.length;
        Float[] fArr4 = new Float[length3];
        int length4 = fArr3.length;
        for (int i4 = 0; i4 < length4; i4++) {
            fArr4[i4] = Float.valueOf(fArr3[i4]);
        }
        com.vk.utils.vectordrawable.a.a(enhancedAnimatedVectorDrawable2, "outline", property2, Arrays.copyOf(fArr4, length3));
        w1cVar.addTransition(i2, i, enhancedAnimatedVectorDrawable2, false);
        w1cVar.setCallback(vci0Var.l);
        w1cVar.setState(vci0.l(recyclerView, intValue) ? vci0.n : vci0.o);
        w1cVar.jumpToCurrentState();
        return w1cVar;
    }
}

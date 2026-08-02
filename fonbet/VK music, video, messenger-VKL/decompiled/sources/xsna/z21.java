package xsna;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdvancedClipEditorSwapItemHolder.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes18.dex */
public final class z21 extends hf6<zcd> {
    public final View m;
    public final izs<Integer, s3q0> n;
    public final VkImageSimple o;
    public final Object p;
    public final y21 q;

    public z21(View view, tm0 tm0Var) {
        super(view);
        this.m = view;
        this.n = tm0Var;
        VkImageSimple vkImageSimple = (VkImageSimple) this.itemView.findViewById(R.id.photo);
        this.o = vkImageSimple;
        vkImageSimple.setClipToOutline(true);
        jjc.g(this.itemView, new com.vk.movika.sdk.base.observable.g(this, 2));
        this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.x21
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ((GestureDetector) z21.this.p.getValue()).onTouchEvent(motionEvent);
            }
        });
        this.p = msy.a(LazyThreadSafetyMode.NONE, new s4(this, 1));
        this.q = new y21(this);
    }

    @Override // xsna.hf6
    public final void W5(zcd zcdVar) {
        zcd zcdVar2 = zcdVar;
        Bitmap bitmap = zcdVar2.b;
        if (bitmap == null) {
            bitmap = zcdVar2.a;
        }
        this.o.setImageBitmap(bitmap);
    }
}

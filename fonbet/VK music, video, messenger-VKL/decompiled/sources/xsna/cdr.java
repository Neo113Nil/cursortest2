package xsna;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.y9k0;

/* compiled from: FilterItemHolder.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes16.dex */
public final class cdr extends RecyclerView.e0 implements y9k0.c {
    public final izs<Integer, s3q0> l;
    public final VkImageSimple m;
    public final VkText n;
    public final View o;
    public final View p;
    public Bitmap q;
    public float r;
    public boolean s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final bdr w;

    public cdr(ViewGroup viewGroup, r9k r9kVar) {
        super(tf3.b(viewGroup, R.layout.holder_filter_correction_item, viewGroup, false));
        this.l = r9kVar;
        VkImageSimple vkImageSimple = (VkImageSimple) this.itemView.findViewById(R.id.preview);
        this.m = vkImageSimple;
        this.n = (VkText) this.itemView.findViewById(R.id.intensity);
        this.o = this.itemView.findViewById(R.id.shadow);
        this.p = this.itemView.findViewById(R.id.stroke);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, new bzj(this, 9));
        this.u = msy.a(lazyThreadSafetyMode, new nuj(this, 8));
        this.v = msy.a(lazyThreadSafetyMode, new n0(14, viewGroup, this));
        this.w = new bdr(this);
        vkImageSimple.setClipToOutline(true);
        jjc.g(this.itemView, new sop(this, 3));
        this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.adr
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                cdr cdrVar = cdr.this;
                ?? r0 = cdrVar.u;
                ?? r1 = cdrVar.t;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    ((smk0) r1.getValue()).j(0.9f);
                    ((smk0) r0.getValue()).j(0.9f);
                } else if (actionMasked == 1 || actionMasked == 3) {
                    ((smk0) r1.getValue()).j(1.0f);
                    ((smk0) r0.getValue()).j(1.0f);
                }
                return ((GestureDetector) cdrVar.v.getValue()).onTouchEvent(motionEvent);
            }
        });
    }

    @Override // xsna.y9k0.c
    public final void C4(float f) {
        this.p.setAlpha(an10.b(f / 0.01f) * 0.01f);
    }
}

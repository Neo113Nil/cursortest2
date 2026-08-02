package xsna;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.item.market_ads.view.models.CarouselMode;
import com.vk.core.view.components.picture.VkPicture;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.dr00;

/* compiled from: MarketAdsItemContentRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class gp00 implements View.OnTouchListener {
    public static final float l = iah0.b(20.0f);
    public final qq00 b;
    public final Lazy<aq00> c;
    public final dg1 d;
    public final bcr0<ImageView> e;
    public final Object f;
    public final Object g;
    public dr00.b h;
    public ArrayList i;
    public to00 j;
    public final ep00 k;

    /* compiled from: MarketAdsItemContentRenderDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CarouselMode.values().length];
            try {
                iArr[CarouselMode.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CarouselMode.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [xsna.ep00] */
    public gp00(qq00 qq00Var, Lazy<? extends aq00> lazy, dg1 dg1Var, bcr0<? extends ImageView> bcr0Var) {
        RenderEffect createBlurEffect;
        this.b = qq00Var;
        this.c = lazy;
        this.d = dg1Var;
        this.e = bcr0Var;
        atm atmVar = new atm(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, atmVar);
        this.g = msy.a(lazyThreadSafetyMode, new m1o(this, 17));
        this.k = new View.OnLayoutChangeListener() { // from class: xsna.ep00
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i2 == i6 && i4 == i8) {
                    return;
                }
                gp00 gp00Var = gp00.this;
                ImageView c = gp00Var.c.getValue().c();
                dr00.b bVar = gp00Var.h;
                int a2 = (bVar == null || !bVar.g) ? iah0.a(50) : iah0.a(92);
                dr00.b bVar2 = gp00Var.h;
                int i9 = bVar2 != null ? bVar2.c : 0;
                int top = c.getTop() - a2;
                gp00Var.b.c.setY(x9.b(top, i9, 2, i9) - (r1.c.getHeight() / 2));
            }
        };
        VkPicture vkPicture = qq00Var.b;
        if (Build.VERSION.SDK_INT < 31) {
            vkPicture.setOnLoadCallback(new hp00(this, vkPicture));
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        float f = l;
        createBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP);
        vkPicture.setRenderEffect(createBlurEffect);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dr00.b bVar = this.h;
        if (bVar == null || bVar.d) {
            return false;
        }
        ((GestureDetector) this.f.getValue()).onTouchEvent(motionEvent);
        return true;
    }

    /* compiled from: MarketAdsItemContentRenderDelegate.kt */
    public static final class a implements RecyclerView.s {
        public final GestureDetector b;
        public final s1m c;
        public float d;
        public float e;

        public a(GestureDetector gestureDetector, s1m s1mVar) {
            this.b = gestureDetector;
            this.c = s1mVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.b.onTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked == 2) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(Math.abs(motionEvent.getX() - this.d) / ((float) 2) > Math.abs(motionEvent.getY() - this.e));
            }
            dr00.b bVar = ((gp00) this.c.c).h;
            return (bVar == null || bVar.d) ? false : true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void h(boolean z) {
        }
    }
}

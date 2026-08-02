package com.yandex.div.internal.widget.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import defpackage.asv;
import defpackage.bb1;
import defpackage.ffx;
import defpackage.jb7;
import defpackage.l890;
import defpackage.lps0;
import defpackage.mhs0;
import defpackage.ny61;
import defpackage.ofa0;
import defpackage.qdx;
import defpackage.qrv;
import defpackage.rrv;
import defpackage.s59;
import defpackage.sb2;
import defpackage.sk7;
import defpackage.srv;
import defpackage.trv;
import defpackage.urv;
import defpackage.w511;
import defpackage.xrv;
import defpackage.yrv;
import defpackage.zrv;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/PagerIndicatorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/div/internal/widget/indicator/a;", "Lzy11;", "update", "(Lcom/yandex/div/internal/widget/indicator/a;)V", "Lzrv;", "style", "setStyle", "(Lzrv;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "newDivPager", "attachPager", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;)V", "stripDrawer", "Lcom/yandex/div/internal/widget/indicator/a;", "divPager", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "Lzrv;", "Landroidx/viewpager2/widget/ViewPager2$a;", "onPageChangeListener", "Landroidx/viewpager2/widget/ViewPager2$a;", "Lcom/yandex/div/core/view2/divs/pager/a;", "getCurrentAdapter", "()Lcom/yandex/div/core/view2/divs/pager/a;", "currentAdapter", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class PagerIndicatorView extends View {
    private DivPagerView divPager;
    private final ViewPager2.a onPageChangeListener;
    private a stripDrawer;
    private zrv style;

    public /* synthetic */ PagerIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPager$lambda$3(PagerIndicatorView pagerIndicatorView) {
        a aVar = pagerIndicatorView.stripDrawer;
        if (aVar != null) {
            pagerIndicatorView.update(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.div.core.view2.divs.pager.a getCurrentAdapter() {
        ViewPager2 viewPager;
        DivPagerView divPagerView = this.divPager;
        RecyclerView.Adapter adapter = (divPagerView == null || (viewPager = divPagerView.getViewPager()) == null) ? null : viewPager.getAdapter();
        if (adapter instanceof com.yandex.div.core.view2.divs.pager.a) {
            return (com.yandex.div.core.view2.divs.pager.a) adapter;
        }
        return null;
    }

    private final void update(a aVar) {
        com.yandex.div.core.view2.divs.pager.a currentAdapter = getCurrentAdapter();
        if (currentAdapter != null) {
            int size = currentAdapter.g().size();
            aVar.f = size;
            qrv qrvVar = aVar.c;
            qrvVar.b(size);
            aVar.b();
            aVar.h = aVar.l / 2.0f;
            int p = currentAdapter.p(currentAdapter.F.getCurrentItem$div_release());
            aVar.m = p;
            aVar.n = 0.0f;
            qrvVar.onPageSelected(p);
            aVar.a(0.0f, p);
            invalidate();
        }
    }

    public final void attachPager(DivPagerView newDivPager) {
        DivPagerView divPagerView = this.divPager;
        if (divPagerView != null) {
            divPagerView.removeChangePageCallbackForIndicators(this.onPageChangeListener);
        }
        newDivPager.addChangePageCallbackForIndicators(this.onPageChangeListener);
        if (newDivPager == this.divPager) {
            return;
        }
        this.divPager = newDivPager;
        if (newDivPager.getViewPager().getAdapter() == null) {
            ny61.g("Attached pager adapter is null!");
            return;
        }
        a aVar = this.stripDrawer;
        if (aVar != null) {
            update(aVar);
        }
        newDivPager.setPagerOnItemsCountChange$div_release(new s59(this));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        RectF c;
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        a aVar = this.stripDrawer;
        if (aVar != null) {
            mhs0 mhs0Var = aVar.b;
            qrv qrvVar = aVar.c;
            jb7 jb7Var = aVar.e;
            Iterator it = ((ArrayList) jb7Var.c).iterator();
            while (it.hasNext()) {
                asv asvVar = (asv) it.next();
                float f = asvVar.c;
                int i = asvVar.a;
                mhs0Var.s(canvas, f, aVar.h, asvVar.d, qrvVar.j(i), qrvVar.e(i), qrvVar.g(i));
            }
            Iterator it2 = ((ArrayList) jb7Var.c).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((asv) obj).b) {
                        break;
                    }
                }
            }
            asv asvVar2 = (asv) obj;
            if (asvVar2 == null || (c = qrvVar.c(asvVar2.c, aVar.h, aVar.k, ffx.W(aVar.d))) == null) {
                return;
            }
            mhs0Var.h(canvas, c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingLeft;
        int paddingRight;
        int i;
        a aVar;
        ViewPager2 viewPager;
        RecyclerView.Adapter adapter;
        bb1 t;
        bb1 t2;
        bb1 t3;
        bb1 t4;
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        zrv zrvVar = this.style;
        float f = 0.0f;
        float s = (zrvVar == null || (t4 = zrvVar.b.t()) == null) ? 0.0f : t4.s();
        zrv zrvVar2 = this.style;
        float s2 = (zrvVar2 == null || (t3 = zrvVar2.c.t()) == null) ? 0.0f : t3.s();
        zrv zrvVar3 = this.style;
        int max = (int) (Math.max(s, Math.max(s2, (zrvVar3 == null || (t2 = zrvVar3.d.t()) == null) ? 0.0f : t2.s())) + getPaddingTop() + getPaddingBottom());
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(max, size);
        } else if (mode != 1073741824) {
            size = max;
        }
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        zrv zrvVar4 = this.style;
        if (zrvVar4 != null && (t = zrvVar4.b.t()) != null) {
            f = t.u();
        }
        zrv zrvVar5 = this.style;
        urv urvVar = zrvVar5 != null ? zrvVar5.e : null;
        if (urvVar instanceof srv) {
            float f2 = ((srv) urvVar).a;
            DivPagerView divPagerView = this.divPager;
            paddingLeft = getPaddingLeft() + ((int) ((f2 * ((divPagerView == null || (viewPager = divPagerView.getViewPager()) == null || (adapter = viewPager.getAdapter()) == null) ? 0 : adapter.getItemCount())) + f));
            paddingRight = getPaddingRight();
        } else {
            if (urvVar instanceof trv) {
                i = size2;
                if (mode2 != Integer.MIN_VALUE) {
                    size2 = Math.min(i, size2);
                } else if (mode2 != 1073741824) {
                    size2 = i;
                }
                setMeasuredDimension(size2, size);
                aVar = this.stripDrawer;
                if (aVar == null) {
                    aVar.c((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
                    return;
                }
                return;
            }
            if (urvVar != null) {
                w511.b();
                return;
            } else {
                paddingLeft = getPaddingLeft() + ((int) f);
                paddingRight = getPaddingRight();
            }
        }
        i = paddingRight + paddingLeft;
        if (mode2 != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size2, size);
        aVar = this.stripDrawer;
        if (aVar == null) {
        }
    }

    public final void setStyle(zrv style) {
        mhs0 sk7Var;
        qrv qdxVar;
        this.style = style;
        sb2 sb2Var = style.b;
        if (sb2Var instanceof yrv) {
            sk7Var = new ofa0(style);
        } else {
            if (!(sb2Var instanceof xrv)) {
                w511.b();
                return;
            }
            sk7Var = new sk7(style);
        }
        int i = rrv.a[style.a.ordinal()];
        if (i == 1) {
            qdxVar = new qdx(style);
        } else if (i == 2) {
            qdxVar = new lps0(style, 1);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            qdxVar = new lps0(style, 0);
        }
        a aVar = new a(style, sk7Var, qdxVar, this);
        aVar.c((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        update(aVar);
        this.stripDrawer = aVar;
        requestLayout();
    }

    public PagerIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PagerIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PagerIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPageChangeListener = new l890(this);
    }
}

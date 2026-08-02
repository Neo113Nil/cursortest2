package com.yandex.go.taxi.order.bubble;

import android.graphics.Bitmap;
import com.yandex.go.taxi.order.bubble.StyledOrderBubbleViewHolder$State;
import com.yandex.go.taxi.order.bubble.g;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.bl00;
import defpackage.cwa1;
import defpackage.czo0;
import defpackage.f4c0;
import defpackage.fi70;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.txu0;
import defpackage.uh60;
import defpackage.uxu0;
import defpackage.vxu0;
import defpackage.xm00;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class g extends fi70 {
    public final i3y A;
    public XYPoint B;
    public pzt0 D;
    public boolean F;
    public final vxu0 a;
    public final float b;
    public final uh60 c;
    public final pav w;
    public final com.yandex.go.pin.api.widget.b x;
    public final ru.yandex.taxi.map_common.map.utils.a y;
    public final i3y z;
    public final hbp0 C = new hbp0(new czo0(14), "", null);
    public StyledOrderBubbleViewHolder$State E = StyledOrderBubbleViewHolder$State.COLLAPSED;

    public g(vxu0 vxu0Var, float f, uh60 uh60Var, pav pavVar, com.yandex.go.pin.api.widget.b bVar, ru.yandex.taxi.map_common.map.utils.a aVar) {
        this.a = vxu0Var;
        this.b = f;
        this.c = uh60Var;
        this.w = pavVar;
        this.x = bVar;
        this.y = aVar;
        final int i = 0;
        this.z = kotlin.a.a(new sls(this) { // from class: wxu0
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                g gVar = this.b;
                switch (i2) {
                    case 0:
                        return gVar.e(StyledOrderBubbleViewHolder$State.EXPANDED);
                    default:
                        return gVar.e(StyledOrderBubbleViewHolder$State.COLLAPSED);
                }
            }
        });
        final int i2 = 1;
        this.A = kotlin.a.a(new sls(this) { // from class: wxu0
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return gVar.e(StyledOrderBubbleViewHolder$State.EXPANDED);
                    default:
                        return gVar.e(StyledOrderBubbleViewHolder$State.COLLAPSED);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, txu0 txu0Var, ContinuationImpl continuationImpl) {
        StyledOrderBubbleViewHolder$loadImageIcon$1 styledOrderBubbleViewHolder$loadImageIcon$1;
        int i;
        Bitmap bitmap;
        gVar.getClass();
        if (continuationImpl instanceof StyledOrderBubbleViewHolder$loadImageIcon$1) {
            styledOrderBubbleViewHolder$loadImageIcon$1 = (StyledOrderBubbleViewHolder$loadImageIcon$1) continuationImpl;
            int i2 = styledOrderBubbleViewHolder$loadImageIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                styledOrderBubbleViewHolder$loadImageIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = styledOrderBubbleViewHolder$loadImageIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = styledOrderBubbleViewHolder$loadImageIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = txu0Var.a;
                    styledOrderBubbleViewHolder$loadImageIcon$1.L$0 = txu0Var;
                    styledOrderBubbleViewHolder$loadImageIcon$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(gVar.w.b().b(str), styledOrderBubbleViewHolder$loadImageIcon$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    txu0Var = (txu0) styledOrderBubbleViewHolder$loadImageIcon$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                zy11 zy11Var = zy11.a;
                if (bitmap != null) {
                    return zy11Var;
                }
                ((f4c0) gVar.A.getValue()).z(ImageProvider.fromBitmap(bitmap), new IconStyle().setAnchor(txu0Var.b));
                return zy11Var;
            }
        }
        styledOrderBubbleViewHolder$loadImageIcon$1 = new StyledOrderBubbleViewHolder$loadImageIcon$1(gVar, continuationImpl);
        Object obj2 = styledOrderBubbleViewHolder$loadImageIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = styledOrderBubbleViewHolder$loadImageIcon$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        zy11 zy11Var2 = zy11.a;
        if (bitmap != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(g gVar, uxu0 uxu0Var, ContinuationImpl continuationImpl) {
        StyledOrderBubbleViewHolder$loadPinIcon$1 styledOrderBubbleViewHolder$loadPinIcon$1;
        int i;
        Bitmap bitmap;
        gVar.getClass();
        if (continuationImpl instanceof StyledOrderBubbleViewHolder$loadPinIcon$1) {
            styledOrderBubbleViewHolder$loadPinIcon$1 = (StyledOrderBubbleViewHolder$loadPinIcon$1) continuationImpl;
            int i2 = styledOrderBubbleViewHolder$loadPinIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                styledOrderBubbleViewHolder$loadPinIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = styledOrderBubbleViewHolder$loadPinIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = styledOrderBubbleViewHolder$loadPinIcon$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = uxu0Var.a;
                    styledOrderBubbleViewHolder$loadPinIcon$1.L$0 = uxu0Var;
                    styledOrderBubbleViewHolder$loadPinIcon$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(gVar.w.b().b(str), styledOrderBubbleViewHolder$loadPinIcon$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        bl00 bl00Var = (bl00) obj;
                        gVar.f().z(bl00Var.a, bl00Var.b);
                        return zy11Var;
                    }
                    uxu0Var = (uxu0) styledOrderBubbleViewHolder$loadPinIcon$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return zy11Var;
                }
                com.yandex.go.pin.api.widget.b bVar = gVar.x;
                String str2 = uxu0Var.b;
                String str3 = uxu0Var.d;
                styledOrderBubbleViewHolder$loadPinIcon$1.L$0 = null;
                styledOrderBubbleViewHolder$loadPinIcon$1.L$1 = null;
                styledOrderBubbleViewHolder$loadPinIcon$1.label = 2;
                obj = bVar.g(str2, bitmap, str3, styledOrderBubbleViewHolder$loadPinIcon$1);
            }
        }
        styledOrderBubbleViewHolder$loadPinIcon$1 = new StyledOrderBubbleViewHolder$loadPinIcon$1(gVar, continuationImpl);
        Object obj2 = styledOrderBubbleViewHolder$loadPinIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = styledOrderBubbleViewHolder$loadPinIcon$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
    }

    @Override // defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(xm00 xm00Var, Continuation continuation) {
        StyledOrderBubbleViewHolder$attachSelf$1 styledOrderBubbleViewHolder$attachSelf$1;
        int i;
        xm00 xm00Var2;
        g gVar;
        if (continuation instanceof StyledOrderBubbleViewHolder$attachSelf$1) {
            styledOrderBubbleViewHolder$attachSelf$1 = (StyledOrderBubbleViewHolder$attachSelf$1) continuation;
            int i2 = styledOrderBubbleViewHolder$attachSelf$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                styledOrderBubbleViewHolder$attachSelf$1.label = i2 - Integer.MIN_VALUE;
                Object obj = styledOrderBubbleViewHolder$attachSelf$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = styledOrderBubbleViewHolder$attachSelf$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Point d = cwa1.d(this.a.a);
                    styledOrderBubbleViewHolder$attachSelf$1.L$0 = xm00Var;
                    styledOrderBubbleViewHolder$attachSelf$1.L$1 = this;
                    styledOrderBubbleViewHolder$attachSelf$1.label = 1;
                    obj = this.y.b(d, styledOrderBubbleViewHolder$attachSelf$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    xm00Var2 = xm00Var;
                    gVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gVar = (g) styledOrderBubbleViewHolder$attachSelf$1.L$1;
                    xm00Var2 = (xm00) styledOrderBubbleViewHolder$attachSelf$1.L$0;
                    kotlin.b.b(obj);
                }
                gVar.B = (XYPoint) obj;
                this.C.a();
                h();
                f4c0 f4c0Var = (f4c0) this.A.getValue();
                xm00Var2.getClass();
                f4c0Var.b(xm00Var2);
                f().b(xm00Var2);
                return zy11.a;
            }
        }
        styledOrderBubbleViewHolder$attachSelf$1 = new StyledOrderBubbleViewHolder$attachSelf$1(this, continuation);
        Object obj2 = styledOrderBubbleViewHolder$attachSelf$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = styledOrderBubbleViewHolder$attachSelf$1.label;
        if (i != 0) {
        }
        gVar.B = (XYPoint) obj2;
        this.C.a();
        h();
        f4c0 f4c0Var2 = (f4c0) this.A.getValue();
        xm00Var2.getClass();
        f4c0Var2.b(xm00Var2);
        f().b(xm00Var2);
        return zy11.a;
    }

    public final f4c0 e(StyledOrderBubbleViewHolder$State styledOrderBubbleViewHolder$State) {
        f4c0 f4c0Var = new f4c0(cwa1.d(this.a.a), null, 6);
        f4c0Var.k(styledOrderBubbleViewHolder$State == StyledOrderBubbleViewHolder$State.EXPANDED ? this.b : 0.0f);
        f4c0Var.i(styledOrderBubbleViewHolder$State == StyledOrderBubbleViewHolder$State.COLLAPSED);
        return f4c0Var;
    }

    public final f4c0 f() {
        return (f4c0) this.z.getValue();
    }

    public final void g() {
        ((f4c0) this.A.getValue()).i(this.E == StyledOrderBubbleViewHolder$State.COLLAPSED);
        f().i(this.E == StyledOrderBubbleViewHolder$State.EXPANDED);
    }

    public final void h() {
        pzt0 pzt0Var = this.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.D = tje.N(this.C.c(), null, null, new StyledOrderBubbleViewHolder$loadIcon$1(this, null), 3);
    }
}

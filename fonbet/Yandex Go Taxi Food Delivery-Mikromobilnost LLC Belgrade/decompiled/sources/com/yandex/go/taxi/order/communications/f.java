package com.yandex.go.taxi.order.communications;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.analytics.view_tracking.ViewVisibilityTracker$SingleState;
import defpackage.c4v;
import defpackage.czo0;
import defpackage.f02;
import defpackage.hbp0;
import defpackage.hsc;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kpf0;
import defpackage.l8x;
import defpackage.mrg0;
import defpackage.n121;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.pfv;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tvi0;
import defpackage.ug2;
import defpackage.w511;
import defpackage.wug0;
import defpackage.xuc;
import defpackage.xwy0;
import defpackage.ypf0;
import defpackage.ytz;
import defpackage.zy11;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public abstract class f extends xwy0 {
    public static final /* synthetic */ int b0 = 0;
    public final ListItemComponent O;
    public final ru.yandex.taxi.utils.d P;
    public final ytz Q;
    public final ypf0 R;
    public final hbp0 S;
    public final int T;
    public final int U;
    public final i3y V;
    public pzt0 W;
    public kpf0 Z;
    public String a0;

    public f(ListItemComponent listItemComponent, ru.yandex.taxi.utils.d dVar, ytz ytzVar, ypf0 ypf0Var) {
        super(listItemComponent);
        this.O = listItemComponent;
        this.P = dVar;
        this.Q = ytzVar;
        this.R = ypf0Var;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        hbp0Var.a();
        this.S = hbp0Var;
        this.T = tje.r(wug0.order_communication_image_total_size, listItemComponent.getContext());
        this.U = tje.r(mrg0.go_design_s_space, listItemComponent.getContext());
        this.V = kotlin.a.a(new f02(18, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(f fVar, CommunicationItem communicationItem, ContinuationImpl continuationImpl) {
        BaseCommunicationsViewHolder$setupLeadView$1 baseCommunicationsViewHolder$setupLeadView$1;
        Object obj;
        int i;
        fVar.getClass();
        if (continuationImpl instanceof BaseCommunicationsViewHolder$setupLeadView$1) {
            baseCommunicationsViewHolder$setupLeadView$1 = (BaseCommunicationsViewHolder$setupLeadView$1) continuationImpl;
            int i2 = baseCommunicationsViewHolder$setupLeadView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseCommunicationsViewHolder$setupLeadView$1.label = i2 - Integer.MIN_VALUE;
                obj = baseCommunicationsViewHolder$setupLeadView$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseCommunicationsViewHolder$setupLeadView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ug2 ug2Var = communicationItem.f;
                    baseCommunicationsViewHolder$setupLeadView$1.L$0 = communicationItem;
                    baseCommunicationsViewHolder$setupLeadView$1.label = 1;
                    if (ug2Var instanceof tvi0) {
                        obj = fVar.c0(((tvi0) ug2Var).a, baseCommunicationsViewHolder$setupLeadView$1);
                    } else {
                        if (!(ug2Var instanceof xuc) && ug2Var != null && !ug2Var.equals(n121.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        obj = Boolean.FALSE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    communicationItem = (CommunicationItem) baseCommunicationsViewHolder$setupLeadView$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
                c4v c4vVar = communicationItem.d;
                baseCommunicationsViewHolder$setupLeadView$1.L$0 = null;
                baseCommunicationsViewHolder$setupLeadView$1.label = 2;
                Object b02 = fVar.b0(c4vVar, baseCommunicationsViewHolder$setupLeadView$1);
                return b02 == obj2 ? obj2 : b02;
            }
        }
        baseCommunicationsViewHolder$setupLeadView$1 = new BaseCommunicationsViewHolder$setupLeadView$1(fVar, continuationImpl);
        obj = baseCommunicationsViewHolder$setupLeadView$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseCommunicationsViewHolder$setupLeadView$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static boolean Y(kpf0 kpf0Var) {
        CommunicationItem.a aVar = kpf0Var.a.g;
        if ((aVar != null ? aVar.a : null) != null) {
            return true;
        }
        if ((aVar != null ? aVar.f : null) == null) {
            return (aVar != null ? aVar.c : null) != null;
        }
        return true;
    }

    public void X(kpf0 kpf0Var) {
        this.Z = kpf0Var;
        hbp0 hbp0Var = this.S;
        if (!hbp0Var.d()) {
            hbp0Var.f();
        }
        pzt0 pzt0Var = this.W;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.W = tje.N(hbp0Var.c(), null, null, new BaseCommunicationsViewHolder$bind$1(this, kpf0Var, null), 3);
        CommunicationItem communicationItem = kpf0Var.a;
        if (jl40.l(this.a0, communicationItem.a)) {
            return;
        }
        this.a0 = communicationItem.a;
        a0(communicationItem);
    }

    public void Z() {
        l8x l8xVar;
        this.S.b();
        ypf0 ypf0Var = this.R;
        ViewVisibilityTracker$SingleState viewVisibilityTracker$SingleState = (ViewVisibilityTracker$SingleState) ypf0Var.f;
        hsc hscVar = (hsc) ypf0Var.j.remove(this.O);
        if (hscVar != null) {
            String str = hscVar.b;
            Map map = (Map) ypf0Var.e.get(viewVisibilityTracker$SingleState);
            if (map != null && (l8xVar = (l8x) map.remove(str)) != null) {
                l8xVar.a(null);
            }
            Set set = (Set) ypf0Var.d.get(viewVisibilityTracker$SingleState);
            if (set != null) {
                set.remove(str);
            }
        }
    }

    public abstract void a0(CommunicationItem communicationItem);

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        this.O.applyTheme(themeType);
        kpf0 kpf0Var = this.Z;
        if (kpf0Var != null) {
            X(kpf0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(c4v c4vVar, ContinuationImpl continuationImpl) {
        BaseCommunicationsViewHolder$setLeadImage$1 baseCommunicationsViewHolder$setLeadImage$1;
        int i;
        Object obj;
        ClickableImageView clickableImageView;
        ListItemComponent listItemComponent;
        if (continuationImpl instanceof BaseCommunicationsViewHolder$setLeadImage$1) {
            baseCommunicationsViewHolder$setLeadImage$1 = (BaseCommunicationsViewHolder$setLeadImage$1) continuationImpl;
            int i2 = baseCommunicationsViewHolder$setLeadImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseCommunicationsViewHolder$setLeadImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = baseCommunicationsViewHolder$setLeadImage$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseCommunicationsViewHolder$setLeadImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean a = c4vVar.a();
                    ListItemComponent listItemComponent2 = this.O;
                    if (!a) {
                        listItemComponent2.clearLeadView();
                        listItemComponent2.setCenterFramePaddingStart(0);
                        listItemComponent2.setPadding(0, 0, 0, 0);
                        return zy11.a;
                    }
                    ClickableImageView leadImageView = listItemComponent2.getLeadImageView();
                    baseCommunicationsViewHolder$setLeadImage$1.L$0 = null;
                    baseCommunicationsViewHolder$setLeadImage$1.L$1 = listItemComponent2;
                    baseCommunicationsViewHolder$setLeadImage$1.L$2 = listItemComponent2;
                    baseCommunicationsViewHolder$setLeadImage$1.L$3 = leadImageView;
                    baseCommunicationsViewHolder$setLeadImage$1.label = 1;
                    Object a2 = this.P.a(c4vVar, pfv.a, baseCommunicationsViewHolder$setLeadImage$1);
                    if (a2 == obj3) {
                        return obj3;
                    }
                    obj = a2;
                    clickableImageView = leadImageView;
                    listItemComponent = listItemComponent2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    clickableImageView = (ClickableImageView) baseCommunicationsViewHolder$setLeadImage$1.L$3;
                    listItemComponent = (ListItemComponent) baseCommunicationsViewHolder$setLeadImage$1.L$2;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                clickableImageView.setImageBitmap((Bitmap) (obj instanceof Result.Failure ? null : obj));
                listItemComponent.setLeadImagePadding(0);
                listItemComponent.setLeadImageSize(this.T);
                int i3 = this.U;
                listItemComponent.setCenterFramePaddingStart(i3);
                listItemComponent.setPadding(i3, 0, 0, 0);
                listItemComponent.getLeadImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return zy11.a;
            }
        }
        baseCommunicationsViewHolder$setLeadImage$1 = new BaseCommunicationsViewHolder$setLeadImage$1(this, continuationImpl);
        Object obj22 = baseCommunicationsViewHolder$setLeadImage$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseCommunicationsViewHolder$setLeadImage$1.label;
        if (i != 0) {
        }
        clickableImageView.setImageBitmap((Bitmap) (obj instanceof Result.Failure ? null : obj));
        listItemComponent.setLeadImagePadding(0);
        listItemComponent.setLeadImageSize(this.T);
        int i32 = this.U;
        listItemComponent.setCenterFramePaddingStart(i32);
        listItemComponent.setPadding(i32, 0, 0, 0);
        listItemComponent.getLeadImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(String str, ContinuationImpl continuationImpl) {
        BaseCommunicationsViewHolder$setRemoteLottieAnimation$1 baseCommunicationsViewHolder$setRemoteLottieAnimation$1;
        int i;
        nsz nszVar;
        if (continuationImpl instanceof BaseCommunicationsViewHolder$setRemoteLottieAnimation$1) {
            baseCommunicationsViewHolder$setRemoteLottieAnimation$1 = (BaseCommunicationsViewHolder$setRemoteLottieAnimation$1) continuationImpl;
            int i2 = baseCommunicationsViewHolder$setRemoteLottieAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseCommunicationsViewHolder$setRemoteLottieAnimation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseCommunicationsViewHolder$setRemoteLottieAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseCommunicationsViewHolder$setRemoteLottieAnimation$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    baseCommunicationsViewHolder$setRemoteLottieAnimation$1.L$0 = null;
                    baseCommunicationsViewHolder$setRemoteLottieAnimation$1.label = 1;
                    obj = ((com.yandex.go.lottie_loader.a) this.Q).a(str, baseCommunicationsViewHolder$setRemoteLottieAnimation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                nszVar = (nsz) obj;
                if (nszVar == null) {
                    i3y i3yVar = this.V;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) i3yVar.getValue();
                    lottieAnimationView.setComposition(nszVar);
                    lottieAnimationView.playAnimation();
                    ListItemComponent listItemComponent = this.O;
                    int i3 = this.U;
                    listItemComponent.setPadding(i3, 0, 0, 0);
                    listItemComponent.setCenterFramePaddingStart(i3);
                    listItemComponent.setLeadView((LottieAnimationView) i3yVar.getValue());
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        baseCommunicationsViewHolder$setRemoteLottieAnimation$1 = new BaseCommunicationsViewHolder$setRemoteLottieAnimation$1(this, continuationImpl);
        Object obj2 = baseCommunicationsViewHolder$setRemoteLottieAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseCommunicationsViewHolder$setRemoteLottieAnimation$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        nszVar = (nsz) obj2;
        if (nszVar == null) {
        }
        return Boolean.valueOf(z2);
    }
}

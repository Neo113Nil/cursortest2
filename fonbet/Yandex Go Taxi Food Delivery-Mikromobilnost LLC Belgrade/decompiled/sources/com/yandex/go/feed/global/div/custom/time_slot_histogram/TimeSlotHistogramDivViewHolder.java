package com.yandex.go.feed.global.div.custom.time_slot_histogram;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.feed.global.div.custom.time_slot_histogram.TimeSlotHistogramDivViewHolder;
import defpackage.aub;
import defpackage.cj9;
import defpackage.gtk;
import defpackage.kp50;
import defpackage.l7z0;
import defpackage.lds0;
import defpackage.m7z0;
import defpackage.mbb;
import defpackage.ny61;
import defpackage.p7z0;
import defpackage.q7z0;
import defpackage.qke;
import defpackage.r7z0;
import defpackage.rvo;
import defpackage.t7z0;
import defpackage.tje;
import defpackage.tls;
import defpackage.usg0;
import defpackage.v3k;
import defpackage.x1n;
import defpackage.zi9;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.HapticController$Effect;

@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00014\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010#R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010#R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/yandex/go/feed/global/div/custom/time_slot_histogram/TimeSlotHistogramDivViewHolder;", "Landroid/widget/FrameLayout;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lrvo;", "expressionResolver", "Lgtk;", "divImageLoader", "<init>", "(Lcom/yandex/div/core/view2/Div2View;Lrvo;Lgtk;)V", "", "position", "Lp7z0;", "item", "Lzy11;", "onSlotItemClicked", "(ILp7z0;)V", "onItemSnapped", "(I)V", "fireAction", "(Lp7z0;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lq7z0;", "histogramProperties", "bind", "(Lq7z0;)V", "release", "()V", "Lcom/yandex/div/core/view2/Div2View;", "Lrvo;", "Lgtk;", "slotSidePadding", CA20Status.STATUS_USER_I, "minSlotWidthPx", "Lt7z0;", "slotSizeCalculator", "Lt7z0;", "defaultAvailableSlotWidthPx", "Lr7z0;", "recyclerViewAdapter", "Lr7z0;", "Lcom/yandex/go/feed/global/div/custom/time_slot_histogram/TimeSlotHistogramRecyclerView;", "recyclerView", "Lcom/yandex/go/feed/global/div/custom/time_slot_histogram/TimeSlotHistogramRecyclerView;", "", "onScrollActionEnabled", "Z", "pendingCenteredPosition", "pendingClickTargetPosition", "l7z0", "applyPendingCenteredPositionRunnable", "Ll7z0;", "Lx1n;", "snapHelper", "Lx1n;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimeSlotHistogramDivViewHolder extends FrameLayout {
    private final l7z0 applyPendingCenteredPositionRunnable;
    private final int defaultAvailableSlotWidthPx;
    private final gtk divImageLoader;
    private final Div2View divView;
    private final rvo expressionResolver;
    private final int minSlotWidthPx;
    private boolean onScrollActionEnabled;
    private int pendingCenteredPosition;
    private int pendingClickTargetPosition;
    private final TimeSlotHistogramRecyclerView recyclerView;
    private final r7z0 recyclerViewAdapter;
    private final int slotSidePadding;
    private final t7z0 slotSizeCalculator;
    private final x1n snapHelper;

    public TimeSlotHistogramDivViewHolder(Div2View div2View, rvo rvoVar, gtk gtkVar) {
        super(div2View.getContext());
        this.divView = div2View;
        this.expressionResolver = rvoVar;
        this.divImageLoader = gtkVar;
        this.slotSidePadding = tje.r(usg0.due_timetable_slot_side_padding, getContext());
        int r = tje.r(usg0.due_timetable_min_slot_width, getContext());
        this.minSlotWidthPx = r;
        t7z0 t7z0Var = new t7z0(getContext(), r);
        this.slotSizeCalculator = t7z0Var;
        Iterator it = t7z0Var.a.iterator();
        cj9 cj9Var = (cj9) it;
        x1n x1nVar = null;
        if (!cj9Var.c) {
            ny61.p();
            throw null;
        }
        String valueOf = String.valueOf(((zi9) it).a());
        Paint paint = t7z0Var.b;
        int ceil = (int) Math.ceil(paint.measureText(valueOf));
        while (cj9Var.c) {
            int ceil2 = (int) Math.ceil(paint.measureText(String.valueOf(r8.a())));
            if (ceil < ceil2) {
                ceil = ceil2;
            }
        }
        int max = (this.slotSidePadding * 2) + Math.max(r, (ceil * 4) + ((int) Math.ceil(paint.measureText(":"))));
        this.defaultAvailableSlotWidthPx = max;
        r7z0 r7z0Var = new r7z0(max, new m7z0(this), this.divImageLoader);
        this.recyclerViewAdapter = r7z0Var;
        TimeSlotHistogramRecyclerView timeSlotHistogramRecyclerView = new TimeSlotHistogramRecyclerView(getContext());
        final int i = 0;
        timeSlotHistogramRecyclerView.setLayoutManager(new LinearLayoutManager(timeSlotHistogramRecyclerView.getContext(), 0, false));
        timeSlotHistogramRecyclerView.setAdapter(r7z0Var);
        timeSlotHistogramRecyclerView.setClipToPadding(false);
        timeSlotHistogramRecyclerView.setItemAnimator(null);
        this.recyclerView = timeSlotHistogramRecyclerView;
        this.pendingCenteredPosition = -1;
        this.pendingClickTargetPosition = -1;
        this.applyPendingCenteredPositionRunnable = new l7z0(this);
        if (!tje.L(getContext())) {
            x1nVar = new x1n();
            x1nVar.o = new tls(this) { // from class: k7z0
                public final /* synthetic */ TimeSlotHistogramDivViewHolder b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    zy11 snapHelper$lambda$0$0;
                    zy11 snapHelper$lambda$0$1;
                    int i2 = i;
                    TimeSlotHistogramDivViewHolder timeSlotHistogramDivViewHolder = this.b;
                    int intValue = ((Integer) obj).intValue();
                    switch (i2) {
                        case 0:
                            snapHelper$lambda$0$0 = TimeSlotHistogramDivViewHolder.snapHelper$lambda$0$0(timeSlotHistogramDivViewHolder, intValue);
                            return snapHelper$lambda$0$0;
                        default:
                            snapHelper$lambda$0$1 = TimeSlotHistogramDivViewHolder.snapHelper$lambda$0$1(timeSlotHistogramDivViewHolder, intValue);
                            return snapHelper$lambda$0$1;
                    }
                }
            };
            final int i2 = 1;
            x1nVar.n = new tls(this) { // from class: k7z0
                public final /* synthetic */ TimeSlotHistogramDivViewHolder b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    zy11 snapHelper$lambda$0$0;
                    zy11 snapHelper$lambda$0$1;
                    int i22 = i2;
                    TimeSlotHistogramDivViewHolder timeSlotHistogramDivViewHolder = this.b;
                    int intValue = ((Integer) obj).intValue();
                    switch (i22) {
                        case 0:
                            snapHelper$lambda$0$0 = TimeSlotHistogramDivViewHolder.snapHelper$lambda$0$0(timeSlotHistogramDivViewHolder, intValue);
                            return snapHelper$lambda$0$0;
                        default:
                            snapHelper$lambda$0$1 = TimeSlotHistogramDivViewHolder.snapHelper$lambda$0$1(timeSlotHistogramDivViewHolder, intValue);
                            return snapHelper$lambda$0$1;
                    }
                }
            };
            x1nVar.b(timeSlotHistogramRecyclerView);
        }
        this.snapHelper = x1nVar;
        addView(timeSlotHistogramRecyclerView, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireAction(p7z0 item) {
        v3k v3kVar = item.j;
        if (v3kVar != null) {
            Div2View.handleAction$default(this.divView, v3kVar, null, this.expressionResolver, 2, null);
        }
    }

    private final void onItemSnapped(int position) {
        int i = this.pendingClickTargetPosition;
        if (i != -1) {
            if (position == i) {
                this.pendingClickTargetPosition = -1;
            }
        } else {
            p7z0 p7z0Var = (p7z0) a.S(position, this.recyclerViewAdapter.w);
            qke.E(getContext(), HapticController$Effect.CLICK_LIGHT, false, 8);
            if (p7z0Var != null) {
                fireAction(p7z0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSlotItemClicked(int position, p7z0 item) {
        RecyclerView recyclerView;
        RecyclerView.e layoutManager;
        RecyclerView.j d;
        this.pendingClickTargetPosition = position;
        this.recyclerViewAdapter.f(position, true);
        x1n x1nVar = this.snapHelper;
        if (x1nVar != null && (recyclerView = x1nVar.h) != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = x1nVar.d(layoutManager)) != null) {
            d.a = position;
            layoutManager.v(d);
            x1nVar.l = true;
        }
        fireAction(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 snapHelper$lambda$0$0(TimeSlotHistogramDivViewHolder timeSlotHistogramDivViewHolder, int i) {
        timeSlotHistogramDivViewHolder.onItemSnapped(i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 snapHelper$lambda$0$1(TimeSlotHistogramDivViewHolder timeSlotHistogramDivViewHolder, int i) {
        timeSlotHistogramDivViewHolder.removeCallbacks(timeSlotHistogramDivViewHolder.applyPendingCenteredPositionRunnable);
        timeSlotHistogramDivViewHolder.pendingCenteredPosition = i;
        timeSlotHistogramDivViewHolder.post(timeSlotHistogramDivViewHolder.applyPendingCenteredPositionRunnable);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(q7z0 histogramProperties) {
        String str;
        boolean z;
        x1n x1nVar;
        RecyclerView.e layoutManager;
        p7z0 p7z0Var;
        r7z0 r7z0Var = this.recyclerViewAdapter;
        int i = 20;
        if (histogramProperties == null) {
            List list = r7z0Var.w;
            EmptyList emptyList = EmptyList.a;
            r7z0Var.w = emptyList;
            kp50.f(new lds0(list, emptyList, new aub(i)), true).b(r7z0Var);
            return;
        }
        boolean z2 = histogramProperties.c;
        ArrayList arrayList = histogramProperties.a;
        p7z0 p7z0Var2 = (p7z0) a.S(r7z0Var.x, r7z0Var.w);
        String str2 = p7z0Var2 != null ? p7z0Var2.a : null;
        r7z0 r7z0Var2 = this.recyclerViewAdapter;
        List list2 = r7z0Var2.w;
        r7z0Var2.w = arrayList;
        kp50.f(new lds0(list2, arrayList, new aub(i)), true).b(r7z0Var2);
        if (str2 != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((p7z0) it.next()).a.equals(str2)) {
                    str = str2;
                    break;
                }
            }
        }
        str = histogramProperties.b;
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            } else if (((p7z0) it2.next()).a.equals(str)) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 < 0 ? 0 : i2;
        boolean z3 = i3 != this.recyclerViewAdapter.x;
        boolean z4 = this.recyclerView.getScrollState() == 0;
        if (this.recyclerView.isLaidOut() && str2 != null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((p7z0) it3.next()).a.equals(str2)) {
                    }
                }
            }
            z = true;
            if (z) {
                this.pendingClickTargetPosition = -1;
            }
            if (!z || (z3 && z4)) {
                this.recyclerViewAdapter.f(i3, false);
                x1nVar = this.snapHelper;
                if (x1nVar == null) {
                    RecyclerView recyclerView = x1nVar.h;
                    if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                        x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i3);
                        if (findViewHolderForAdapterPosition != null) {
                            int[] c = x1nVar.c(layoutManager, findViewHolderForAdapterPosition.a);
                            recyclerView.scrollBy(c[0], c[1]);
                        } else {
                            recyclerView.post(new mbb(recyclerView, i3, x1nVar, layoutManager, 1));
                        }
                    }
                } else {
                    this.recyclerView.scrollToPosition(i3);
                }
            } else if (!z3 && (p7z0Var = (p7z0) a.S(i3, this.recyclerViewAdapter.w)) != null) {
                fireAction(p7z0Var);
            }
            this.onScrollActionEnabled = histogramProperties.d;
            this.recyclerView.setEnabled(z2);
            this.recyclerView.setAlpha(!z2 ? 1.0f : 0.5f);
        }
        z = false;
        if (z) {
        }
        if (z) {
        }
        this.recyclerViewAdapter.f(i3, false);
        x1nVar = this.snapHelper;
        if (x1nVar == null) {
        }
        this.onScrollActionEnabled = histogramProperties.d;
        this.recyclerView.setEnabled(z2);
        this.recyclerView.setAlpha(!z2 ? 1.0f : 0.5f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = (((View.MeasureSpec.getMode(widthMeasureSpec) != 0 ? View.MeasureSpec.getSize(widthMeasureSpec) : getContext().getResources().getDisplayMetrics().widthPixels) - this.defaultAvailableSlotWidthPx) / 2) - this.slotSidePadding;
        this.recyclerView.setPadding(size, 0, size, 0);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void release() {
        x1n x1nVar = this.snapHelper;
        if (x1nVar != null) {
            x1nVar.o = null;
            x1nVar.n = null;
            x1nVar.b(null);
        }
    }
}

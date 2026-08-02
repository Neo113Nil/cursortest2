package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.d7p0;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoTooltipContainer$BubblePositionHolder$attachListener$1;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment;

/* loaded from: classes6.dex */
public final class d7p0 {
    public final View a;
    public final BubbleComponent b;
    public final rju c;
    public final ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment d;
    public final ViewGroup e;
    public final View f;
    public final int[] g = {0, 0};
    public final ScootersVehicleActualPhotoTooltipContainer$BubblePositionHolder$attachListener$1 h = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoTooltipContainer$BubblePositionHolder$attachListener$1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            d7p0.this.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
        }
    };
    public final yln i = new yln(24, this);
    public final boolean j;

    /* JADX WARN: Type inference failed for: r2v6, types: [ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoTooltipContainer$BubblePositionHolder$attachListener$1] */
    public d7p0(View view, BubbleComponent bubbleComponent, rju rjuVar, ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment) {
        this.a = view;
        this.b = bubbleComponent;
        this.c = rjuVar;
        this.d = scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment;
        this.e = (ViewGroup) bubbleComponent.getParent();
        this.f = view.getRootView();
        this.j = xw31.n(view.getContext());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r6 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        r2 = ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position.OFFSET_END;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        r12.c.g(r2);
        r3.setX(r5);
        r3.setY((((r4 - r1) - r3.getHeight()) + r12.y.height()) + defpackage.tje.u(8, r0.getContext()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        r2 = ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position.OFFSET_START;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r10 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (r10 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r6 = r7[r8.ordinal()];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        View view = this.a;
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int width = view.getRotationY() == 180.0f ? view.getWidth() : 0;
        int i2 = iArr[1];
        this.e.getLocationOnScreen(iArr);
        int i3 = iArr[1];
        float width2 = (view.getWidth() / 2.0f) + (i - width);
        BubbleComponent bubbleComponent = this.b;
        float width3 = width2 - bubbleComponent.getWidth();
        int[] iArr2 = c7p0.a;
        ScootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment = this.d;
        int i4 = iArr2[scootersVehicleActualPhotoTooltipContainer$TooltipPointerAlignment.ordinal()];
        boolean z = this.j;
        if (i4 != 1) {
            if (i4 != 2) {
                w511.b();
            }
        }
    }
}

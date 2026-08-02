package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.view.View;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.HorizontalPosition;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/SideDependentTexture;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTexture;", "leftAlignedView", "Landroid/view/View;", "rightAlignedView", "compactView", "balloonParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "scaleFactor", "", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;F)V", "getView", "balloonAnchor", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SideDependentTexture extends BalloonTexture {
    private final View compactView;
    private final View leftAlignedView;
    private final View rightAlignedView;

    public SideDependentTexture(View view, View view2, View view3, BalloonParams balloonParams, float f) {
        super(balloonParams, f);
        this.leftAlignedView = view;
        this.rightAlignedView = view2;
        this.compactView = view3;
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.BalloonTexture
    public View getView(BalloonAnchor balloonAnchor) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        View view = this.compactView;
        if (view != null) {
            arrayList.add(view);
        }
        arrayList.add(balloonAnchor.getHorizontal() == HorizontalPosition.RIGHT ? this.rightAlignedView : this.leftAlignedView);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                View view2 = (View) next;
                int measuredWidth = view2.getMeasuredWidth() * view2.getMeasuredHeight();
                do {
                    Object next2 = it.next();
                    View view3 = (View) next2;
                    int measuredWidth2 = view3.getMeasuredWidth() * view3.getMeasuredHeight();
                    if (measuredWidth > measuredWidth2) {
                        next = next2;
                        measuredWidth = measuredWidth2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (View) obj;
    }
}

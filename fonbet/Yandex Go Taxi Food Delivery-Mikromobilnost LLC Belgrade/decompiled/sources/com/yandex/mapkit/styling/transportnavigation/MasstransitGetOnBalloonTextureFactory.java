package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.HorizontalPosition;
import com.yandex.mapkit.navigation.balloons.VerticalPosition;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import com.yandex.mapkit.navigation.transport.layer.balloons.MasstransitGetOnBalloon;
import defpackage.scc;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0014J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/MasstransitGetOnBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/transportnavigation/MasstransitViewBalloonTextureFactory;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "Landroid/view/View;", "table", "Landroid/widget/LinearLayout;", "getAnchorView", "createView", "balloon", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;", "isNightMode", "", "getPossibleAnchors", "", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "Companion", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MasstransitGetOnBalloonTextureFactory extends MasstransitViewBalloonTextureFactory {
    private static final List<BalloonAnchor> GET_ON_POSSIBLE_ANCHORS;
    private final Context context;
    private final LinearLayout table;
    private final View view;

    static {
        VerticalPosition verticalPosition = VerticalPosition.TOP;
        HorizontalPosition horizontalPosition = HorizontalPosition.LEFT;
        BalloonAnchor balloonAnchor = new BalloonAnchor(verticalPosition, horizontalPosition);
        HorizontalPosition horizontalPosition2 = HorizontalPosition.RIGHT;
        BalloonAnchor balloonAnchor2 = new BalloonAnchor(verticalPosition, horizontalPosition2);
        VerticalPosition verticalPosition2 = VerticalPosition.BOTTOM;
        GET_ON_POSSIBLE_ANCHORS = scc.g(balloonAnchor, balloonAnchor2, new BalloonAnchor(verticalPosition2, horizontalPosition), new BalloonAnchor(verticalPosition2, horizontalPosition2));
    }

    public MasstransitGetOnBalloonTextureFactory(Context context) {
        this.context = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_transport_layout_masstransit_get_on_balloon, (ViewGroup) null);
        this.view = inflate;
        this.table = (LinearLayout) inflate.findViewById(R.id.masstransit_get_on_table);
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.MasstransitViewBalloonTextureFactory
    public View createView(Balloon balloon, boolean isNightMode) {
        MasstransitGetOnBalloon masstransitGetOn = balloon.getMasstransitGetOn();
        MasstransitManoeuvreKt.setupGetOnTable(this.table, masstransitGetOn, this.context, isNightMode);
        MasstransitManoeuvreKt.setUpPointName((StrokeTextView) this.view.findViewById(R.id.masstransit_point_name), masstransitGetOn, this.context, isNightMode);
        return this.view;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.MasstransitViewBalloonTextureFactory
    public View getAnchorView() {
        return this.table;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.MasstransitViewBalloonTextureFactory, com.yandex.mapkit.styling.transportnavigation.BalloonTextureFactory
    public List<BalloonAnchor> getPossibleAnchors() {
        return GET_ON_POSSIBLE_ANCHORS;
    }
}

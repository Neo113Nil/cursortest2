package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.content.Context;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.styling.BalloonImageProvider;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.BalloonGeometry;
import com.yandex.mapkit.navigation.balloons.HorizontalPosition;
import com.yandex.mapkit.navigation.balloons.VerticalPosition;
import com.yandex.mapkit.styling.automotive.balloons.BalloonColors;
import com.yandex.mapkit.styling.automotivenavigation.LocalizedContextKt;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ny61;
import defpackage.scc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/DefaultBalloonImageProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/BalloonImageProvider;", "defaultContext", "Landroid/content/Context;", "colors", "Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;", "<init>", "(Landroid/content/Context;Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;)V", "context", "alternativeFactory", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/AlternativeBalloonTextureFactory;", "routeSummaryFactory", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/RouteSummaryBalloonTextureFactory;", "manoeuvreFactory", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ManoeuvreBalloonTextureFactory;", "laneSignFactory", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneSignBalloonTextureFactory;", "manoeuvreWithLaneSignFactory", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ManoeuvreWithLaneSignBalloonTextureFactory;", "getFactory", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonTextureFactory;", "balloon", "Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;", "geometriesForBalloon", "", "Lcom/yandex/mapkit/navigation/balloons/BalloonGeometry;", "scaleFactor", "", "isNightMode", "", "createImage", "Lcom/yandex/runtime/image/ImageProvider;", "anchor", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "Companion", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultBalloonImageProvider implements BalloonImageProvider {
    private static final List<BalloonAnchor> POSSIBLE_ANCHORS;
    private final AlternativeBalloonTextureFactory alternativeFactory;
    private final Context context;
    private final LaneSignBalloonTextureFactory laneSignFactory;
    private final ManoeuvreBalloonTextureFactory manoeuvreFactory;
    private final ManoeuvreWithLaneSignBalloonTextureFactory manoeuvreWithLaneSignFactory;
    private final RouteSummaryBalloonTextureFactory routeSummaryFactory;

    static {
        VerticalPosition verticalPosition = VerticalPosition.TOP;
        HorizontalPosition horizontalPosition = HorizontalPosition.LEFT;
        BalloonAnchor balloonAnchor = new BalloonAnchor(verticalPosition, horizontalPosition);
        HorizontalPosition horizontalPosition2 = HorizontalPosition.CENTER;
        BalloonAnchor balloonAnchor2 = new BalloonAnchor(verticalPosition, horizontalPosition2);
        HorizontalPosition horizontalPosition3 = HorizontalPosition.RIGHT;
        BalloonAnchor balloonAnchor3 = new BalloonAnchor(verticalPosition, horizontalPosition3);
        VerticalPosition verticalPosition2 = VerticalPosition.CENTER;
        BalloonAnchor balloonAnchor4 = new BalloonAnchor(verticalPosition2, horizontalPosition);
        BalloonAnchor balloonAnchor5 = new BalloonAnchor(verticalPosition2, horizontalPosition3);
        VerticalPosition verticalPosition3 = VerticalPosition.BOTTOM;
        POSSIBLE_ANCHORS = scc.g(balloonAnchor, balloonAnchor2, balloonAnchor3, balloonAnchor4, balloonAnchor5, new BalloonAnchor(verticalPosition3, horizontalPosition), new BalloonAnchor(verticalPosition3, horizontalPosition2), new BalloonAnchor(verticalPosition3, horizontalPosition3));
    }

    public DefaultBalloonImageProvider(Context context, BalloonColors balloonColors) {
        Context localizedContext = LocalizedContextKt.localizedContext(context);
        this.context = localizedContext;
        this.alternativeFactory = new AlternativeBalloonTextureFactory(localizedContext, balloonColors);
        this.routeSummaryFactory = new RouteSummaryBalloonTextureFactory(localizedContext, balloonColors);
        this.manoeuvreFactory = new ManoeuvreBalloonTextureFactory(localizedContext, balloonColors);
        this.laneSignFactory = new LaneSignBalloonTextureFactory(localizedContext, balloonColors);
        this.manoeuvreWithLaneSignFactory = new ManoeuvreWithLaneSignBalloonTextureFactory(localizedContext, balloonColors);
    }

    private final BalloonTextureFactory getFactory(Balloon balloon) {
        if (balloon.getRouteSummary() != null) {
            return this.routeSummaryFactory;
        }
        if (balloon.getAlternative() != null) {
            return this.alternativeFactory;
        }
        if (balloon.getManoeuvre() != null) {
            return this.manoeuvreFactory;
        }
        if (balloon.getLaneSign() != null) {
            return this.laneSignFactory;
        }
        if (balloon.getManoeuvreWithLaneSign() != null) {
            return this.manoeuvreWithLaneSignFactory;
        }
        return null;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.BalloonImageProvider
    public ImageProvider createImage(Balloon balloon, BalloonAnchor anchor, float scaleFactor, boolean isNightMode) {
        BalloonTextureFactory factory = getFactory(balloon);
        if (factory != null) {
            return factory.createTexture(balloon, isNightMode, scaleFactor).create(anchor);
        }
        ny61.r("Not implemented");
        return null;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.BalloonImageProvider
    public List<BalloonGeometry> geometriesForBalloon(Balloon balloon, float scaleFactor, boolean isNightMode) {
        BalloonTextureFactory factory = getFactory(balloon);
        if (factory == null) {
            ny61.r("Not implemented");
            return null;
        }
        BalloonTexture createTexture = factory.createTexture(balloon, isNightMode, scaleFactor);
        ArrayList arrayList = new ArrayList();
        Iterator<BalloonAnchor> it = POSSIBLE_ANCHORS.iterator();
        while (it.hasNext()) {
            arrayList.add(createTexture.getBalloonGeometry(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultBalloonImageProvider(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DefaultBalloonImageProvider(Context context, BalloonColors balloonColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : balloonColors);
    }
}

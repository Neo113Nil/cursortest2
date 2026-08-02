package com.yandex.mapkit.styling.transportnavigation;

import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.HorizontalPosition;
import com.yandex.mapkit.navigation.balloons.VerticalPosition;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import defpackage.scc;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\f"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/BalloonTextureFactory;", "", "createTexture", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonTexture;", "balloon", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;", "isNightMode", "", "getPossibleAnchors", "", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "Companion", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BalloonTextureFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/BalloonTextureFactory$Companion;", "", "<init>", "()V", "POSSIBLE_ANCHORS", "", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final List<BalloonAnchor> POSSIBLE_ANCHORS;

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

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static List<BalloonAnchor> getPossibleAnchors(BalloonTextureFactory balloonTextureFactory) {
            return Companion.POSSIBLE_ANCHORS;
        }
    }

    BalloonTexture createTexture(Balloon balloon, boolean isNightMode);

    List<BalloonAnchor> getPossibleAnchors();
}

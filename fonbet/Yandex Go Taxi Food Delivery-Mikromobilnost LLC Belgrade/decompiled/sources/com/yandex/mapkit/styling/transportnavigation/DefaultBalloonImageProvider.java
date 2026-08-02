package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.BalloonGeometry;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonImageProvider;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J(\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/DefaultBalloonImageProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/BalloonImageProvider;", "defaultContext", "Landroid/content/Context;", "summaryConvertors", "Lcom/yandex/mapkit/styling/transportnavigation/SummaryConvertors;", "<init>", "(Landroid/content/Context;Lcom/yandex/mapkit/styling/transportnavigation/SummaryConvertors;)V", "context", "routeSummaryFactory", "Lcom/yandex/mapkit/styling/transportnavigation/RouteSummaryBalloonTextureFactory;", "manoeuvreFactory", "Lcom/yandex/mapkit/styling/transportnavigation/ManoeuvreBalloonTextureFactory;", "masstransitStopFactory", "Lcom/yandex/mapkit/styling/transportnavigation/MasstransitStopBalloonTextureFactory;", "masstransitGetOnFactory", "Lcom/yandex/mapkit/styling/transportnavigation/MasstransitGetOnBalloonTextureFactory;", "masstransitGetOffFactory", "Lcom/yandex/mapkit/styling/transportnavigation/MasstransitGetOffBalloonTextureFactory;", "masstransitTransferFactory", "Lcom/yandex/mapkit/styling/transportnavigation/MasstransitTransferBalloonTextureFactory;", "getFactory", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonTextureFactory;", "balloon", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;", "geometriesForBalloon", "", "Lcom/yandex/mapkit/navigation/balloons/BalloonGeometry;", "scaleFactor", "", "isNightMode", "", "createImage", "Lcom/yandex/runtime/image/ImageProvider;", "anchor", "Lcom/yandex/mapkit/navigation/balloons/BalloonAnchor;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultBalloonImageProvider implements BalloonImageProvider {
    private final Context context;
    private final ManoeuvreBalloonTextureFactory manoeuvreFactory;
    private final MasstransitGetOffBalloonTextureFactory masstransitGetOffFactory;
    private final MasstransitGetOnBalloonTextureFactory masstransitGetOnFactory;
    private final MasstransitStopBalloonTextureFactory masstransitStopFactory;
    private final MasstransitTransferBalloonTextureFactory masstransitTransferFactory;
    private final RouteSummaryBalloonTextureFactory routeSummaryFactory;

    public DefaultBalloonImageProvider(Context context, SummaryConvertors summaryConvertors) {
        Context localizedContext = LocalizedContextKt.localizedContext(context);
        this.context = localizedContext;
        this.routeSummaryFactory = new RouteSummaryBalloonTextureFactory(summaryConvertors, localizedContext);
        this.manoeuvreFactory = new ManoeuvreBalloonTextureFactory(localizedContext);
        this.masstransitStopFactory = new MasstransitStopBalloonTextureFactory(localizedContext);
        this.masstransitGetOnFactory = new MasstransitGetOnBalloonTextureFactory(localizedContext);
        this.masstransitGetOffFactory = new MasstransitGetOffBalloonTextureFactory(localizedContext);
        this.masstransitTransferFactory = new MasstransitTransferBalloonTextureFactory(localizedContext);
    }

    private final BalloonTextureFactory getFactory(Balloon balloon) {
        if (balloon.getRouteSummary() != null) {
            return this.routeSummaryFactory;
        }
        if (balloon.getManoeuvre() != null) {
            return this.manoeuvreFactory;
        }
        if (balloon.getMasstransitStop() != null) {
            return this.masstransitStopFactory;
        }
        if (balloon.getMasstransitGetOn() != null) {
            return this.masstransitGetOnFactory;
        }
        if (balloon.getMasstransitGetOff() != null) {
            return this.masstransitGetOffFactory;
        }
        if (balloon.getMasstransitTransfer() != null) {
            return this.masstransitTransferFactory;
        }
        return null;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonImageProvider
    public ImageProvider createImage(Balloon balloon, BalloonAnchor anchor, float scaleFactor, boolean isNightMode) {
        BalloonTextureFactory factory = getFactory(balloon);
        if (factory != null) {
            return factory.createTexture(balloon, isNightMode).create(anchor);
        }
        ny61.r("Not implemented");
        return null;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.balloons.BalloonImageProvider
    public List<BalloonGeometry> geometriesForBalloon(Balloon balloon, float scaleFactor, boolean isNightMode) {
        BalloonTextureFactory factory = getFactory(balloon);
        if (factory == null) {
            ny61.r("Not implemented");
            return null;
        }
        BalloonTexture createTexture = factory.createTexture(balloon, isNightMode);
        ArrayList arrayList = new ArrayList();
        Iterator<BalloonAnchor> it = factory.getPossibleAnchors().iterator();
        while (it.hasNext()) {
            arrayList.add(createTexture.getBalloonGeometry(it.next()));
        }
        return arrayList;
    }

    public /* synthetic */ DefaultBalloonImageProvider(Context context, SummaryConvertors summaryConvertors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new DefaultConvertors(context) : summaryConvertors);
    }
}

package defpackage;

import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final /* synthetic */ class e011 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ msv b;
    public final /* synthetic */ BalloonView c;

    public /* synthetic */ e011(msv msvVar, BalloonView balloonView, int i) {
        this.a = i;
        this.b = msvVar;
        this.c = balloonView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        BalloonView balloonView = this.c;
        msv msvVar = this.b;
        switch (i) {
            case 0:
                return b.i(new Pair("type", "onBalloonContentChanged"), new Pair("balloonId", msvVar.d.a(ReferenceType.TRANSPORT_BALLOON_VIEW, balloonView)));
            case 1:
                return b.i(new Pair("type", "onBalloonViewTap"), new Pair("balloonId", msvVar.d.a(ReferenceType.TRANSPORT_BALLOON_VIEW, balloonView)));
            default:
                return b.i(new Pair("type", "onBalloonVisibilityChanged"), new Pair("balloonId", msvVar.d.a(ReferenceType.TRANSPORT_BALLOON_VIEW, balloonView)));
        }
    }
}

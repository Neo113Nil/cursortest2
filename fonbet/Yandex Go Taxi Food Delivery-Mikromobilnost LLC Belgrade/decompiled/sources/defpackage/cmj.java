package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.BalloonView;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final /* synthetic */ class cmj implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzs b;
    public final /* synthetic */ BalloonView c;

    public /* synthetic */ cmj(pzs pzsVar, BalloonView balloonView, int i) {
        this.a = i;
        this.b = pzsVar;
        this.c = balloonView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        BalloonView balloonView = this.c;
        pzs pzsVar = this.b;
        switch (i) {
            case 0:
                return b.i(new Pair("type", "onBalloonVisibilityChanged"), new Pair("balloonId", pzsVar.d.a(ReferenceType.BALLOON_VIEW, balloonView)));
            default:
                return b.i(new Pair("type", "onBalloonViewTap"), new Pair("balloonId", pzsVar.d.a(ReferenceType.BALLOON_VIEW, balloonView)));
        }
    }
}

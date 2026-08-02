package defpackage;

import android.view.View;
import com.yandex.go.pin.api.v1.PinV1Component;
import ru.yandex.taxi.preorder.source.SourcePointFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class fft0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SourcePointFragment b;

    public /* synthetic */ fft0(SourcePointFragment sourcePointFragment, int i) {
        this.a = i;
        this.b = sourcePointFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$1;
        zy11 prepareIntersectionsParticipants$lambda$0;
        int i = this.a;
        SourcePointFragment sourcePointFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$1 = SourcePointFragment.onViewCreated$lambda$1(sourcePointFragment, (PinV1Component) obj);
                return onViewCreated$lambda$1;
            default:
                prepareIntersectionsParticipants$lambda$0 = SourcePointFragment.prepareIntersectionsParticipants$lambda$0(sourcePointFragment, (View) obj);
                return prepareIntersectionsParticipants$lambda$0;
        }
    }
}

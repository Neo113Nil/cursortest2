package defpackage;

import android.view.View;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.preorder.source.SourcePointFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class eft0 implements muw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;

    public /* synthetic */ eft0(Object obj, int i, View view) {
        this.a = i;
        this.b = obj;
        this.c = view;
    }

    @Override // defpackage.muw
    public final ro00 a() {
        ro00 prepareIntersectionsParticipants$lambda$0$0;
        ro00 prepareIntersectionsParticipants$lambda$0$1;
        int i = this.a;
        View view = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                prepareIntersectionsParticipants$lambda$0$0 = SourcePointFragment.prepareIntersectionsParticipants$lambda$0$0((SourcePointFragment) obj, view);
                return prepareIntersectionsParticipants$lambda$0$0;
            case 1:
                prepareIntersectionsParticipants$lambda$0$1 = SourcePointFragment.prepareIntersectionsParticipants$lambda$0$1((SourcePointFragment) obj, view);
                return prepareIntersectionsParticipants$lambda$0$1;
            default:
                to00 to00Var = (to00) ((so00) ((gl) obj).w);
                to00Var.getClass();
                return to00Var.c(Participant.PIN, view);
        }
    }
}

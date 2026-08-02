package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.hwc0;

/* compiled from: PostsFromNotificationsMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class iwc0 implements au60<hwc0> {
    @Override // xsna.au60
    public final hwc0 a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new hwc0.a.b((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new cwc0((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new gwc0((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new dwc0((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new fwc0((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new ewc0((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new bwc0((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new hwc0.b.a((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}

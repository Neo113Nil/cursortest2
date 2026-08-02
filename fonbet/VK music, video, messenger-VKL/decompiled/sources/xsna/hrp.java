package xsna;

import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.profile.design.view.fab.ProfileFabView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EntriesListPresenter.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class hrp extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ hrp(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((EntriesListPresenter) this.receiver).Y();
                break;
            default:
                ProfileFabView.I((ProfileFabView) this.receiver);
                break;
        }
        return s3q0.a;
    }

    public hrp(Object obj) {
        super(0, obj, ProfileFabView.class, "onRightButtonClick", "onRightButtonClick()V", 0);
    }
}

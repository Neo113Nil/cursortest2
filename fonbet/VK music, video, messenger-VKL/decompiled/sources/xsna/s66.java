package xsna;

import com.vk.prefui.fragments.MaterialPreferenceToolbarFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseAuthPresenter.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class s66 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s66(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((com.vk.auth.main.e) this.receiver).l();
                break;
            case 1:
                ((q5x) this.receiver).l();
                break;
            default:
                MaterialPreferenceToolbarFragment materialPreferenceToolbarFragment = (MaterialPreferenceToolbarFragment) this.receiver;
                materialPreferenceToolbarFragment.getClass();
                h3p0.b(materialPreferenceToolbarFragment);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s66(Object obj) {
        super(0, obj, q5x.class, "showControls", "showControls()V", 0);
        this.b = 1;
    }
}

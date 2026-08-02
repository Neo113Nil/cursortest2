package xsna;

import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class x5x0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x5x0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = y5x0.l1;
                ((f6x0) obj2).h.setText(booleanValue ? R.string.voip_configure_vmoji_disable_vmoji : R.string.voip_configure_vmoji_enable_vmoji);
                break;
            default:
                Throwable th = (Throwable) obj;
                ((y7f) obj2).a.finish();
                h03.b(th);
                L.g("ClipsTemplateEditorPresenter", th);
                break;
        }
        return s3q0.a;
    }
}

package xsna;

import com.vk.toggle.internal.ToggleManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lak0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ lak0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            default:
                return Boolean.valueOf(((ToggleManager.Sync) obj) == ToggleManager.Sync.Done);
        }
    }
}

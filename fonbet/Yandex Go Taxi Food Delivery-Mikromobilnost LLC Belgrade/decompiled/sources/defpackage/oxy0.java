package defpackage;

import com.ybsdk.core.common.data.network.dto.ThemedParameter;

/* loaded from: classes3.dex */
public final /* synthetic */ class oxy0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemedParameter b;

    public /* synthetic */ oxy0(ThemedParameter themedParameter, int i) {
        this.a = i;
        this.b = themedParameter;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ThemedParameter themedParameter = this.b;
        switch (i) {
            case 0:
                x4c.g("Error parsing colors", null, "light=" + themedParameter.getLight() + " dark=" + themedParameter.getDark(), null, 10);
                break;
            default:
                x4c.g("Error parsing colors", null, "light=" + themedParameter.getLight() + " dark=" + themedParameter.getDark(), null, 10);
                break;
        }
        return zy11Var;
    }
}

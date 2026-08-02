package xsna;

import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class st80 implements izs {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ OptionalNativeAdEntry d;
    public final /* synthetic */ tt80 e;
    public final /* synthetic */ int f;

    public /* synthetic */ st80(String str, String str2, OptionalNativeAdEntry optionalNativeAdEntry, tt80 tt80Var, int i, aav0 aav0Var) {
        this.b = str;
        this.c = str2;
        this.d = optionalNativeAdEntry;
        this.e = tt80Var;
        this.f = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        OptionalNativeAdEntry optionalNativeAdEntry = this.d;
        int i = optionalNativeAdEntry.n.c;
        List<String> list = optionalNativeAdEntry.l;
        tt80 tt80Var = this.e;
        int i2 = this.f;
        new f410(optionalNativeAdEntry, tt80Var, i2);
        new g9t(optionalNativeAdEntry, tt80Var, i2);
        throw null;
    }
}

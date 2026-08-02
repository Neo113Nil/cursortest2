package xsna;

import android.content.Context;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import xsna.xxl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sq0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ sq0(Context context, xxl.c cVar, izs izsVar, q630 q630Var, int i) {
        this.b = 1;
        this.e = context;
        this.f = cVar;
        this.c = izsVar;
        this.g = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((hr0) this.e).l((is0) this.f, (AdditionalSettingsConfiguration) this.g, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                eyl.b((Context) this.e, (xxl.c) this.f, (izs) this.c, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((o5p0) this.e).b((spg0) this.f, (vgc0) this.g, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sq0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = obj4;
        this.d = i;
    }
}

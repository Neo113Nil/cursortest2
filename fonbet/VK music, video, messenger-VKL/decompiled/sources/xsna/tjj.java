package xsna;

import com.vkontakte.android.fragments.WebViewFragment;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class tjj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tjj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((wow) obj2).get(((Number) obj).intValue());
                return null;
            default:
                int i2 = WebViewFragment.O0;
                ((WebViewFragment) obj2).wo();
                return s3q0.a;
        }
    }
}

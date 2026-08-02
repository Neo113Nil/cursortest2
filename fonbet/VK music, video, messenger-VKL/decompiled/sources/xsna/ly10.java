package xsna;

import com.vkontakte.android.data.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ly10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ly10(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('_');
        sb.append(this.c);
        ((b.d) obj).b(sb.toString(), "media_aspect_ratio");
        return s3q0.a;
    }
}

package xsna;

import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ha3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ha3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT name, value, storage_name FROM app_values WHERE storage_name = ?");
                try {
                    V0.D3(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        String l2 = V0.l2(0);
                        String l22 = V0.l2(1);
                        V0.l2(2);
                        arrayList.add(new y0p0(l2, l22));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 1:
                ((p870) ((ek40) this.c).b.getValue()).e(120, new AudioPlaylistAttachment(((b9b0) obj).b));
                return s3q0.a;
            default:
                ((gzs) this.c).invoke();
                return s3q0.a;
        }
    }
}

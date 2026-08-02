package xsna;

import com.vkontakte.android.data.b;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kcm0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kcm0(int i, String str) {
        this.c = i;
        this.d = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                b.d dVar = (b.d) obj;
                dVar.b("sticker", "clickable_sticker_type");
                dVar.b(Integer.valueOf(this.c), "clickable_sticker_id_value");
                if (str != null) {
                    dVar.b(str, "reaction_name");
                }
                break;
            default:
                ((n9e) this.d).invoke(new rbt0(this.c, 50, 0, 32, EmptyList.b));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kcm0(n9e n9eVar, int i) {
        this.d = n9eVar;
        this.c = i;
    }
}

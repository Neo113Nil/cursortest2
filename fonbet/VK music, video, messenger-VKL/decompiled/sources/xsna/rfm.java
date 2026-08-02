package xsna;

import com.vk.im.engine.models.InfoBar;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rfm implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rfm(long j, String str, Ref$BooleanRef ref$BooleanRef) {
        this.c = j;
        this.d = str;
        this.e = ref$BooleanRef;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.e;
                hpm e = ((xgl0) obj).b().e();
                long j = this.c;
                com.vk.im.engine.models.dialogs.b c = e.c(j);
                InfoBar infoBar = c != null ? c.w : null;
                if (epx.f(infoBar != null ? infoBar.b : null, str)) {
                    e.p(j, true);
                    ref$BooleanRef.element = true;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.d;
                ((hpm) this.e).b.b().execSQL("UPDATE dialogs SET unread_reactions = ? WHERE id = ?", new Object[]{kvf.a(arrayList).toString(), Long.valueOf(this.c)});
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rfm(long j, ArrayList arrayList, hpm hpmVar) {
        this.d = arrayList;
        this.c = j;
        this.e = hpmVar;
    }
}

package xsna;

import android.content.Context;
import io.opentelemetry.api.trace.SpanKind;
import java.util.ArrayList;
import xsna.oxc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qej implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qej(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                oxc0.a aVar = (oxc0.a) obj;
                aVar.getClass();
                StringBuilder sb = new StringBuilder();
                Context context = com.vk.contacts.f.c;
                if (context == null) {
                    context = null;
                }
                sb.append(context.getPackageName());
                sb.append("_preferences");
                aVar.a = sb.toString();
                com.vk.contacts.f fVar = com.vk.contacts.f.a;
                aVar.b = com.vk.contacts.f.b();
                ArrayList arrayList = aVar.c;
                oxc0.b.a aVar2 = new oxc0.b.a();
                com.vk.contacts.f fVar2 = com.vk.contacts.f.a;
                aVar2.b = "contacts_imported";
                com.vk.contacts.f fVar3 = com.vk.contacts.f.a;
                aVar2.a = "contacts_imported";
                arrayList.add(aVar2.a());
                break;
            case 1:
                f620 f620Var = f620.b;
                rsg0.T(new i730()).subscribe(new k2y(new kpr(7), 3));
                break;
            case 2:
                break;
            case 3:
                Throwable th = (Throwable) obj;
                if (!(th instanceof InterruptedException)) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                }
                break;
            default:
                ((phk0) obj).d(SpanKind.CLIENT);
                break;
        }
        return s3q0.a;
    }
}

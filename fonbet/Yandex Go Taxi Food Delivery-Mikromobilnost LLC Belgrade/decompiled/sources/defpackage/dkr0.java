package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.messaging.ChatRequest;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final class dkr0 extends ky4 {
    public final boolean A;
    public final boolean y;
    public final Set z;

    public dkr0(ChatRequest chatRequest, boolean z, Set set, boolean z2) {
        super(chatRequest);
        this.y = z;
        this.z = set;
        this.A = z2;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        uy10 uy10Var = (uy10) ((m8g) s020Var).d0.get();
        boolean z = this.A;
        boolean z2 = this.y;
        Set set = this.z;
        if (z2) {
            List w0 = a.w0(uy10Var.a(set));
            if (!w0.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                uy10Var.d(w0, sb, sb2, z);
                if (!evu0.J(sb)) {
                    uy10Var.b(sb.toString(), sb2.toString());
                }
            }
        } else {
            List w02 = a.w0(uy10Var.a(set));
            if (!w02.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                uy10Var.d(w02, sb3, new StringBuilder(), z);
                if (!evu0.J(sb3)) {
                    Context context = uy10Var.a;
                    String sb4 = sb3.toString();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", sb4);
                    intent.setType("text/plain");
                    Intent createChooser = Intent.createChooser(intent, null);
                    createChooser.addFlags(SelfTester_JCP.IMITA);
                    context.startActivity(createChooser);
                }
            }
        }
        h();
    }
}

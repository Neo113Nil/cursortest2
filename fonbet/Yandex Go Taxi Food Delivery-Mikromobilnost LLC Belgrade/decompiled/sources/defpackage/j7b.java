package defpackage;

import com.yandex.messaging.core.net.entities.MediaMessageListData;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.internal.entities.Message;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final /* synthetic */ class j7b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7b b;
    public final /* synthetic */ j3b c;
    public final /* synthetic */ long w;
    public final /* synthetic */ int x;
    public final /* synthetic */ v790 y;

    public /* synthetic */ j7b(n7b n7bVar, j3b j3bVar, long j, int i, v790 v790Var, int i2) {
        this.a = i2;
        this.b = n7bVar;
        this.c = j3bVar;
        this.w = j;
        this.x = i;
        this.y = v790Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Message message;
        Message message2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                MediaMessageListData mediaMessageListData = (MediaMessageListData) obj;
                n7b n7bVar = this.b;
                ks10 ks10Var = n7bVar.d;
                boolean z = n7bVar.e;
                Message[] g = ks10Var.g((ChatHistoryResponse.OutMessage[]) mediaMessageListData.getMessages().toArray(new ChatHistoryResponse.OutMessage[0]));
                j3b j3bVar = this.c;
                if (g != null) {
                    List A = j73.A(g);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : A) {
                        if (jl40.l(((Message) obj2).a, j3bVar.b)) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                }
                n7bVar.i(arrayList);
                long j = (arrayList == null || (message = (Message) a.R(arrayList)) == null) ? 0L : message.b;
                long j2 = this.w;
                int i2 = this.x;
                ArrayList f = n7bVar.f(j3bVar, j - 1, j2, i2);
                boolean isEmpty = f.isEmpty();
                v790 v790Var = this.y;
                if (!isEmpty || arrayList == null || !(!arrayList.isEmpty()) || !mediaMessageListData.getInfo().getHasPrev()) {
                    MediaMessageListData.Info info = mediaMessageListData.getInfo();
                    boolean hasNext = z ? info.getHasNext() : info.getHasPrev();
                    MediaMessageListData.Info info2 = mediaMessageListData.getInfo();
                    v790Var.F(new w790(f, hasNext, z ? info2.getHasPrev() : info2.getHasNext()));
                    break;
                } else {
                    n7bVar.h(j3bVar, j, i2, v790Var);
                    break;
                }
                break;
            default:
                MediaMessageListData mediaMessageListData2 = (MediaMessageListData) obj;
                n7b n7bVar2 = this.b;
                ks10 ks10Var2 = n7bVar2.d;
                boolean z2 = n7bVar2.e;
                Message[] g2 = ks10Var2.g((ChatHistoryResponse.OutMessage[]) mediaMessageListData2.getMessages().toArray(new ChatHistoryResponse.OutMessage[0]));
                j3b j3bVar2 = this.c;
                if (g2 != null) {
                    List A2 = j73.A(g2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : A2) {
                        if (jl40.l(((Message) obj3).a, j3bVar2.b)) {
                            arrayList3.add(obj3);
                        }
                    }
                    arrayList = arrayList3;
                }
                n7bVar2.i(arrayList);
                long j3 = (arrayList == null || (message2 = (Message) a.b0(arrayList)) == null) ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : message2.b;
                long j4 = this.w;
                int i3 = this.x;
                ArrayList f2 = n7bVar2.f(j3bVar2, j4, j3 + 1, i3);
                boolean isEmpty2 = f2.isEmpty();
                v790 v790Var2 = this.y;
                if (!isEmpty2 || arrayList == null || !(!arrayList.isEmpty()) || !mediaMessageListData2.getInfo().getHasNext()) {
                    MediaMessageListData.Info info3 = mediaMessageListData2.getInfo();
                    boolean hasNext2 = z2 ? info3.getHasNext() : info3.getHasPrev();
                    MediaMessageListData.Info info4 = mediaMessageListData2.getInfo();
                    v790Var2.F(new w790(f2, hasNext2, z2 ? info4.getHasPrev() : info4.getHasNext()));
                    break;
                } else {
                    n7bVar2.g(j3bVar2, j3, i3, v790Var2);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}

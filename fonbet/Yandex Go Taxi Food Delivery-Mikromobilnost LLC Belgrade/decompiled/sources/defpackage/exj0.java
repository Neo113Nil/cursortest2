package defpackage;

import com.yandex.messaging.core.net.entities.RequestUserParams;
import com.yandex.messaging.core.net.entities.chatcreate.CreateChannelParam;
import com.yandex.messaging.core.net.entities.chatcreate.CreateFamilyChatParam;
import com.yandex.messaging.core.net.entities.chatcreate.GroupChatData;
import com.yandex.messaging.core.net.entities.xiva.XivaSecretContainer;
import com.yandex.messaging.core.net.entities.xiva.XivaSecretSign;
import com.yandex.messaging.core.net.entities.xiva.XivaUser;
import com.yandex.messaging.internal.net.Error;

/* loaded from: classes15.dex */
public final class exj0 extends w920 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public exj0(mj31 mj31Var, String str, e331 e331Var) {
        this.a = 2;
        this.w = mj31Var;
        this.b = str;
        this.c = e331Var;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ouu ouuVar = ((fxj0) obj).c;
                ouuVar.getClass();
                return ouu.b(ouuVar, "create_chat", GroupChatData.class, kvj0Var);
            case 1:
                ouu ouuVar2 = ((fxj0) obj).c;
                ouuVar2.getClass();
                return ouu.b(ouuVar2, "create_chat", GroupChatData.class, kvj0Var);
            default:
                gg70 b = ouu.b((ouu) ((mj31) this.w).c, "request_user", XivaSecretContainer.class, kvj0Var);
                if (!(b instanceof dg70)) {
                    return b;
                }
                XivaUser xivaUser = ((XivaSecretContainer) ((dg70) b).a).user;
                long j = xivaUser.uid;
                return !jl40.l((j > 0L ? 1 : (j == 0L ? 0 : -1)) != 0 ? String.valueOf(j) : xivaUser.guid, (String) this.b) ? new gg70() : b;
        }
    }

    @Override // defpackage.w920
    public boolean e(ngz ngzVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((an8) obj).g(Error.GENERIC);
                return true;
            case 1:
                ((an8) obj).g(Error.GENERIC);
                return true;
            default:
                return super.e(ngzVar);
        }
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                GroupChatData groupChatData = (GroupChatData) obj;
                ((fxj0) obj3).a.a(groupChatData.getErrors());
                ((an8) obj2).h(groupChatData.getChatData(), null);
                break;
            case 1:
                GroupChatData groupChatData2 = (GroupChatData) obj;
                ((fxj0) obj3).a.a(groupChatData2.getErrors());
                ((an8) obj2).h(groupChatData2.getChatData(), null);
                break;
            default:
                XivaSecretContainer xivaSecretContainer = (XivaSecretContainer) obj;
                e331 e331Var = (e331) obj3;
                XivaUser xivaUser = xivaSecretContainer.user;
                long j = xivaUser.uid;
                String valueOf = j != 0 ? String.valueOf(j) : xivaUser.guid;
                XivaSecretSign xivaSecretSign = xivaSecretContainer.secret;
                e331Var.invoke(new ne51(valueOf, xivaSecretSign.sign, xivaSecretSign.ts));
                break;
        }
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                return ((fxj0) obj).c.a((CreateFamilyChatParam) obj2, "create_chat");
            case 1:
                return ((fxj0) obj).c.a((CreateChannelParam) obj2, "create_chat");
            default:
                RequestUserParams requestUserParams = new RequestUserParams();
                requestUserParams.needXivaSecret = true;
                mj31 mj31Var = (mj31) obj2;
                bbj bbjVar = (bbj) mj31Var.w;
                t4j0 a = ((ouu) mj31Var.c).a(requestUserParams, "request_user");
                bbjVar.b(a);
                return a;
        }
    }

    public /* synthetic */ exj0(fxj0 fxj0Var, Object obj, an8 an8Var, int i) {
        this.a = i;
        this.c = fxj0Var;
        this.w = obj;
        this.b = an8Var;
    }
}

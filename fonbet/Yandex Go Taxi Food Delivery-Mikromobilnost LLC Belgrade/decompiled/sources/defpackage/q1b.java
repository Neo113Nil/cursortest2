package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.GetChatDataByInviteHashParams;
import com.yandex.messaging.core.net.entities.GetChatInfoByAlias;
import com.yandex.messaging.core.net.entities.chatcreate.CreateChannelParam;
import com.yandex.messaging.core.net.entities.chatcreate.CreateFamilyChatParam;
import com.yandex.messaging.core.net.entities.chatcreate.CreateGroupChatParam;
import com.yandex.messaging.core.net.entities.chatcreate.CreatePrivateChatParam;
import com.yandex.messaging.core.net.entities.chatcreate.Permissions;
import com.yandex.messaging.core.net.entities.chatcreate.Roles;
import com.yandex.messaging.files.ImageFileInfo;
import com.yandex.messaging.internal.ChatAlias;
import com.yandex.messaging.internal.CreateChannel;
import com.yandex.messaging.internal.CreateFamilyChat;
import com.yandex.messaging.internal.CreateGroupChat;
import com.yandex.messaging.internal.ExistingChat;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.StaffChat;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.entities.BusinessItem;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class q1b implements k8b {
    public final /* synthetic */ u1b a;

    public q1b(u1b u1bVar) {
        this.a = u1bVar;
    }

    @Override // defpackage.k8b
    public final Object c(ExistingChat existingChat) {
        u1b u1bVar = this.a;
        to3 to3Var = u1bVar.y.f;
        return to3Var.a.a(new io3(6, to3Var, new String[]{existingChat.id()}, u1bVar));
    }

    @Override // defpackage.k8b
    public final Object j(CreateChannel createChannel) {
        String[] members = createChannel.members();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = members.length;
        int i = 0;
        while (true) {
            boolean z = true;
            char c = 1;
            if (i >= length) {
                u1b u1bVar = this.a;
                w1b w1bVar = u1bVar.y;
                fxj0 fxj0Var = w1bVar.e;
                an8 an8Var = new an8(w1bVar, u1bVar, "channel", createChannel.avatar());
                String requestId = createChannel.requestId();
                String name = createChannel.name();
                String description = createChannel.description();
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                Long[] lArr = (Long[]) arrayList2.toArray(new Long[0]);
                Long[] lArr2 = (Long[]) arrayList3.toArray(new Long[0]);
                boolean channelPublicity = createChannel.getChannelPublicity();
                fxj0Var.getClass();
                CreateChannelParam createChannelParam = new CreateChannelParam(name, description, new Permissions(strArr, lArr, lArr2), new Roles(), channelPublicity, true);
                boj0 boj0Var = fxj0Var.b;
                exj0 exj0Var = new exj0(fxj0Var, createChannelParam, an8Var, c == true ? 1 : 0);
                boj0Var.getClass();
                return new ixj0(boj0Var, requestId, exj0Var, new d7g0(10));
            }
            String str = members[i];
            Long b = BusinessItem.Companion.b(str);
            Long a = BusinessItem.Companion.a(str);
            if (b != null) {
                arrayList2.add(b);
            } else if (a != null) {
                arrayList3.add(a);
            } else {
                try {
                    UUID.fromString(str);
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                z83.h("Incorrect uuid", z);
                arrayList.add(str);
            }
            i++;
        }
    }

    @Override // defpackage.k8b
    public final Object k(InviteThread inviteThread) {
        z83.j("Parent chat must be prefetched for InviteThread");
        return wfz.z;
    }

    @Override // defpackage.k8b
    public final Object m(InviteChat inviteChat) {
        u1b u1bVar = this.a;
        v3b v3bVar = u1bVar.y.g;
        String inviteHash = inviteChat.inviteHash();
        c29 c29Var = new c29(16, u1bVar);
        z83.g(null, v3bVar.b, Looper.myLooper());
        to3 to3Var = v3bVar.a;
        c29 c29Var2 = new c29(17, c29Var);
        to3Var.getClass();
        return to3Var.a.a(new io3(8, to3Var, new GetChatDataByInviteHashParams(inviteHash), c29Var2));
    }

    @Override // defpackage.k8b
    public final Object n(StaffChat staffChat) {
        return new s1b(this.a, staffChat.nickname());
    }

    @Override // defpackage.k8b
    public final Object p(ChatAlias chatAlias) {
        u1b u1bVar = this.a;
        to3 to3Var = u1bVar.y.f;
        String alias = chatAlias.alias();
        to3Var.getClass();
        return to3Var.a.a(new io3(7, to3Var, new GetChatInfoByAlias(alias), u1bVar));
    }

    @Override // defpackage.k8b
    public final Object t(ThreadChat threadChat) {
        return new t1b(this.a, threadChat);
    }

    @Override // defpackage.k8b
    public final Object u(CreateFamilyChat createFamilyChat) {
        u1b u1bVar = this.a;
        w1b w1bVar = u1bVar.y;
        fxj0 fxj0Var = w1bVar.e;
        an8 an8Var = new an8(w1bVar, u1bVar, "group", (ImageFileInfo) null);
        String requestId = createFamilyChat.getRequestId();
        String[] members = createFamilyChat.getMembers();
        fxj0Var.getClass();
        CreateFamilyChatParam createFamilyChatParam = new CreateFamilyChatParam(new Permissions(members, new Long[0], new Long[0]), new Roles(), true, false);
        boj0 boj0Var = fxj0Var.b;
        exj0 exj0Var = new exj0(fxj0Var, createFamilyChatParam, an8Var, 0);
        boj0Var.getClass();
        return new ixj0(boj0Var, requestId, exj0Var, new d7g0(10));
    }

    @Override // defpackage.k8b
    public final Object v() {
        u1b u1bVar = this.a;
        w1b w1bVar = u1bVar.y;
        to3 to3Var = w1bVar.f;
        an8 an8Var = new an8(w1bVar, u1bVar, "saved messages", (ImageFileInfo) null);
        String str = w1bVar.c.a;
        to3Var.getClass();
        return to3Var.a.a(new io3(4, to3Var, new CreatePrivateChatParam(str, null), an8Var));
    }

    @Override // defpackage.k8b
    public final Object w(CreateGroupChat createGroupChat) {
        boolean z;
        String[] members = createGroupChat.members();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : members) {
            Long b = BusinessItem.Companion.b(str);
            Long a = BusinessItem.Companion.a(str);
            if (b != null) {
                arrayList2.add(b);
            } else if (a != null) {
                arrayList3.add(a);
            } else {
                try {
                    UUID.fromString(str);
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                z83.h(null, z);
                arrayList.add(str);
            }
        }
        u1b u1bVar = this.a;
        w1b w1bVar = u1bVar.y;
        fxj0 fxj0Var = w1bVar.e;
        an8 an8Var = new an8(w1bVar, u1bVar, "group", createGroupChat.avatar());
        String requestId = createGroupChat.requestId();
        String name = createGroupChat.name();
        String description = createGroupChat.description();
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Long[] lArr = (Long[]) arrayList2.toArray(new Long[0]);
        Long[] lArr2 = (Long[]) arrayList3.toArray(new Long[0]);
        boolean isPublic = createGroupChat.isPublic();
        fxj0Var.getClass();
        CreateGroupChatParam createGroupChatParam = new CreateGroupChatParam(name, description, new Permissions(strArr, lArr, lArr2), new Roles(), isPublic);
        boj0 boj0Var = fxj0Var.b;
        io3 io3Var = new io3(fxj0Var, createGroupChatParam, an8Var, 29);
        boj0Var.getClass();
        return new ixj0(boj0Var, requestId, io3Var, new d7g0(10));
    }

    @Override // defpackage.k8b
    public final Object z(PrivateChat privateChat) {
        String addressee = privateChat.addressee();
        u1b u1bVar = this.a;
        if (!jl40.l(addressee, u1bVar.y.c.a)) {
            return new r1b(u1bVar, privateChat.addressee());
        }
        w1b w1bVar = u1bVar.y;
        to3 to3Var = w1bVar.f;
        an8 an8Var = new an8(w1bVar, u1bVar, "saved messages", (ImageFileInfo) null);
        String str = w1bVar.c.a;
        to3Var.getClass();
        return to3Var.a.a(new io3(4, to3Var, new CreatePrivateChatParam(str, null), an8Var));
    }
}

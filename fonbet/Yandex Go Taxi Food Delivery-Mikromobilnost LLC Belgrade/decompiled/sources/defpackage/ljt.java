package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.Ranking;
import com.yandex.messaging.core.net.entities.SearchData;
import com.yandex.messaging.core.net.entities.SearchParams;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.proto.message.ForwardedMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.entities.Message;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import com.yandex.messaging.internal.net.Error;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class ljt implements e1k, ho3 {
    public j5b a;
    public final njt b;
    public final yjt c;
    public xo3 w;
    public final SearchParams x;
    public final /* synthetic */ mjt y;

    public ljt(mjt mjtVar, j5b j5bVar, njt njtVar, yjt yjtVar) {
        this.y = mjtVar;
        this.a = j5bVar;
        this.b = njtVar;
        this.c = yjtVar;
        Ranking.Companion companion = Ranking.INSTANCE;
        l4o l4oVar = tz10.a;
        lqo lqoVar = mjtVar.f;
        companion.getClass();
        Ranking ranking = new Ranking("messenger_search_ranking", "");
        boolean z = njtVar.b;
        String str = njtVar.a;
        SearchParams searchParams = z ? new SearchParams(new String[]{"users_and_chats", "messages"}, null, str, null, ranking) : new SearchParams(new String[]{"users_and_chats"}, null, str, null, ranking);
        this.x = searchParams;
        to3 to3Var = mjtVar.b;
        this.w = to3Var.a.a(new jo3(yjtVar, to3Var, searchParams, this));
    }

    @Override // defpackage.go3
    public final void D(Object obj) {
        SearchData.Message[] messageArr;
        s020 e;
        ogu oguVar;
        ml21 ml21Var;
        Iterator it;
        SearchData.UserOrChat[] userOrChatArr;
        SearchData searchData = (SearchData) obj;
        if (this.a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        mjt mjtVar = this.y;
        k020 k020Var = mjtVar.a;
        ogu oguVar2 = mjtVar.e;
        ml21 ml21Var2 = mjtVar.d;
        l020 C = k020Var.C();
        try {
            SearchData.UsersAndChats usersAndChats = searchData.usersAndChats;
            if (usersAndChats != null && (userOrChatArr = usersAndChats.items) != null) {
                for (SearchData.UserOrChat userOrChat : j73.A(userOrChatArr)) {
                    ChatData chatData = userOrChat.b;
                    njt njtVar = this.b;
                    if (chatData != null) {
                        wbz0 wbz0Var = s8b.c;
                        String[] rights = chatData.getRights();
                        wbz0Var.getClass();
                        s8b k = wbz0.k(rights);
                        j3b l = mjtVar.a.l(chatData.getChatId());
                        if ((l == null || njtVar.a(l)) && ((k.l() || !njtVar.c) && !oguVar2.a(chatData.getChatId()))) {
                            C.I(chatData);
                            ojt ojtVar = new ojt(chatData.getChatId());
                            if (l == null || !l.L) {
                                arrayList2.add(ojtVar);
                            } else {
                                arrayList.add(ojtVar);
                            }
                        }
                    }
                    UserData userData = userOrChat.a;
                    if (userData != null) {
                        C.D0(userData);
                        njtVar.getClass();
                        String str = userData.userId;
                        fm21 fm21Var = new fm21(str, userData.isRobot);
                        njtVar.d.getClass();
                        if (bn21.a(str) ? false : njtVar.c(fm21Var)) {
                            if (jl40.l(userData.userId, ml21Var2.a)) {
                                String str2 = ml21Var2.a;
                                arrayList.add(new ojt(new ChatId.PrivateChatId(str2, str2).a));
                            } else {
                                sjt sjtVar = new sjt(userData.userId);
                                SearchData.ItemType itemType = SearchData.ItemType.USERS_PVP;
                                SearchData.ItemType itemType2 = userOrChat.c;
                                if (itemType != itemType2 && SearchData.ItemType.CONTACTS != itemType2) {
                                    arrayList2.add(sjtVar);
                                }
                                arrayList.add(sjtVar);
                            }
                        }
                    }
                }
            }
            SearchData.Messages messages = searchData.messages;
            if (messages != null && (messageArr = messages.items) != null) {
                Iterator it2 = j73.A(messageArr).iterator();
                while (it2.hasNext()) {
                    SearchData.Message message = (SearchData.Message) it2.next();
                    ServerMessage serverMessage = message.serverMessage;
                    PlainMessage plainMessage = serverMessage.clientMessage.plain;
                    if (plainMessage != null) {
                        ForwardedMessageInfo[] forwardedMessageInfoArr = serverMessage.forwardedMessages;
                        if (a(plainMessage, forwardedMessageInfoArr != null ? j73.A(forwardedMessageInfoArr) : null) != null) {
                            String chatId = plainMessage.getChatId();
                            if (!oguVar2.a(chatId) && (e = mjtVar.c.e(chatId)) != null) {
                                String str3 = ((m8g) e).a.h;
                                ServerMessageInfo serverMessageInfo = message.serverMessage.serverMessageInfo;
                                if (!ChatNamespaces.a(chatId) || !jl40.l(str3, serverMessageInfo.from.userId)) {
                                    jl40.l(ml21Var2.a, serverMessageInfo.from.userId);
                                }
                                oguVar = oguVar2;
                                ml21Var = ml21Var2;
                                long j = serverMessageInfo.timestamp;
                                String str4 = serverMessageInfo.from.userId;
                                it = it2;
                                new ServerMessageRef(chatId, j);
                                arrayList3.add(new pjt(chatId));
                                Message c = mjtVar.g.c(message.serverMessage, plainMessage, false);
                                oab d = ((m8g) e).d();
                                z83.g(null, d.c, Looper.myLooper());
                                C.b0(d.b, c, true);
                                oguVar2 = oguVar;
                                ml21Var2 = ml21Var;
                                it2 = it;
                            }
                        }
                    }
                    it = it2;
                    oguVar = oguVar2;
                    ml21Var = ml21Var2;
                    oguVar2 = oguVar;
                    ml21Var2 = ml21Var;
                    it2 = it;
                }
            }
            C.s();
            C.close();
            xjt xjtVar = new xjt(arrayList, arrayList2, arrayList3);
            this.c.a(5);
            j5b j5bVar = this.a;
            if (j5bVar != null) {
                ((x6f0) j5bVar.a).d(new myj0(xjtVar));
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(C, th);
                throw th2;
            }
        }
    }

    public final String a(PlainMessage plainMessage, List list) {
        String str;
        String text;
        PlainMessage.FileInfo fileInfo;
        String str2;
        PlainMessage.FileInfo fileInfo2;
        String str3;
        if (plainMessage.getText() != null) {
            PlainMessage.Text text2 = plainMessage.getText();
            if (text2 != null) {
                return text2.getText();
            }
            return null;
        }
        PlainMessage.File file = plainMessage.getFile();
        mjt mjtVar = this.y;
        if (file != null) {
            PlainMessage.File file2 = plainMessage.getFile();
            return (file2 == null || (fileInfo2 = file2.getFileInfo()) == null || (str3 = fileInfo2.name) == null) ? mjtVar.j : str3;
        }
        if (plainMessage.getCard() != null) {
            return mjtVar.k;
        }
        if (plainMessage.getImage() != null) {
            PlainMessage.Image image = plainMessage.getImage();
            return (image == null || (fileInfo = image.fileInfo) == null || (str2 = fileInfo.name) == null) ? mjtVar.l : str2;
        }
        if (plainMessage.getSticker() != null) {
            return mjtVar.m;
        }
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            return mjtVar.o;
        }
        if (plainMessage.getGallery() != null) {
            PlainMessage.Gallery gallery = plainMessage.getGallery();
            return (gallery == null || (text = gallery.getText()) == null) ? mjtVar.n : text;
        }
        if (plainMessage.getVoice() != null) {
            PlainMessage.Voice voice = plainMessage.getVoice();
            PlainMessage.FileInfo fileInfo3 = voice.fileInfo;
            return ne10.a(new VoiceMessageData(fileInfo3.name, fileInfo3.id2, voice.duration, voice.text, voice.wasRecognized, voice.waveform, voice.disableRecognition), mjtVar.i);
        }
        if (plainMessage.getPoll() == null) {
            return null;
        }
        PlainMessage.Poll poll = plainMessage.getPoll();
        if (poll == null || (str = poll.title) == null) {
            str = "";
        }
        return "📊 ".concat(str);
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public final boolean mo103c(int i) {
        this.y.h.c(this.x, i);
        j5b j5bVar = this.a;
        if (j5bVar == null) {
            return true;
        }
        ((x6f0) j5bVar.a).d(new iyj0(Error.GENERIC));
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xo3 xo3Var = this.w;
        if (xo3Var != null) {
            xo3Var.cancel();
        }
        this.w = null;
        this.a = null;
    }
}

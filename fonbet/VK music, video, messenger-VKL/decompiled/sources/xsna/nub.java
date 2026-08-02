package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.stickers.StickerItem;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import org.json.JSONObject;
import xsna.pdg0;

/* compiled from: ChatPreviewGetCmd.kt */
/* loaded from: classes2.dex */
public final class nub extends le6<a> {
    public final gcl b;
    public final Source c;

    /* compiled from: ChatPreviewGetCmd.kt */
    public static final class a {
        public final mj30 a;
        public final Dialog b;
        public final Peer c;

        public a(mj30 mj30Var, Dialog dialog, Peer peer) {
            this.a = mj30Var;
            this.b = dialog;
            this.c = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(historyExt=");
            sb.append(this.a);
            sb.append(", dialog=");
            sb.append(this.b);
            sb.append(", currentMember=");
            return eq.a(sb, this.c, ')');
        }
    }

    public nub(gcl gclVar, Source source) {
        this.b = gclVar;
        this.c = source;
        if (source == Source.NETWORK) {
            throw new UnsupportedOperationException("Operation not supported");
        }
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Object obj;
        String[] strArr;
        int i;
        boolean z;
        Object obj2;
        Dialog dialog = new Dialog();
        dialog.setId(2000000001L);
        gcl gclVar = this.b;
        gclVar.getClass();
        ProfilesInfo profilesInfo = new ProfilesInfo();
        a1w a1wVar = gclVar.a;
        pdg0 n = a1wVar.n("FakeChatComponent", new b1r0(a1wVar.q(), Source.CACHE, 12));
        if (n instanceof pdg0.a) {
            obj = new wpp();
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        wpp wppVar = (wpp) obj;
        if (wppVar.c.isEmpty()) {
            pdg0 n2 = a1wVar.n("FakeChatComponent", new b1r0(a1wVar.q(), Source.NETWORK, 12));
            if (n2 instanceof pdg0.a) {
                obj2 = new wpp();
            } else {
                if (!(n2 instanceof pdg0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = ((pdg0.b) n2).a;
            }
            wppVar = (wpp) obj2;
        }
        if (!wppVar.c.isEmpty()) {
            profilesInfo.Jb((qtd0) j5g.X(wppVar.c.values()));
        }
        profilesInfo.Jb(gclVar.b);
        String str = gcl.c;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String[] j = enj.j(R.array.vkim_fake_chat_msg, context);
        ArrayList arrayList = new ArrayList(j.length);
        int i2 = 0;
        int i3 = 0;
        for (int length = j.length; i2 < length; length = i) {
            String str2 = j[i2];
            int i4 = i3 + 1;
            MsgFromUser msgFromUser = new MsgFromUser();
            msgFromUser.b = i4;
            ArrayList arrayList2 = arrayList;
            msgFromUser.g = (i3 * 60000) + (System.currentTimeMillis() - 3600000);
            int i5 = i2;
            if (brm0.B(str2, "IN:", false)) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                msgFromUser.h = new Peer.User(2147483647L);
                msgFromUser.F = str2.substring(3);
                msgFromUser.i = true;
                strArr = j;
                i = length;
                arrayList = arrayList2;
            } else {
                if (brm0.B(str2, "IN_STICKER:", false)) {
                    int parseInt = Integer.parseInt(str2.substring(11));
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    strArr = j;
                    i = length;
                    msgFromUser.h = new Peer.User(2147483647L);
                    StickerItem stickerItem = StickerItem.l;
                    AttachSticker attachSticker = new AttachSticker(parseInt, parseInt, StickerItem.a.a(new JSONObject(String.format(Locale.ENGLISH, str, Arrays.copyOf(new Object[]{String.valueOf(parseInt)}, 1)))), "");
                    z = false;
                    msgFromUser.H = e43.o(attachSticker);
                    msgFromUser.i = true;
                } else {
                    strArr = j;
                    i = length;
                    z = false;
                    if (brm0.B(str2, "OUT:", false)) {
                        msgFromUser.h = a1wVar.q();
                        msgFromUser.F = str2.substring(4);
                        msgFromUser.i = false;
                    } else {
                        if (brm0.B(str2, "OUT_STICKER:", false)) {
                            int parseInt2 = Integer.parseInt(str2.substring(12));
                            msgFromUser.h = a1wVar.q();
                            StickerItem stickerItem2 = StickerItem.l;
                            msgFromUser.H = e43.o(new AttachSticker(parseInt2, parseInt2, StickerItem.a.a(new JSONObject(String.format(Locale.ENGLISH, str, Arrays.copyOf(new Object[]{String.valueOf(parseInt2)}, 1)))), ""));
                            msgFromUser.i = true;
                        }
                        arrayList = arrayList2;
                    }
                }
                arrayList = arrayList2;
            }
            arrayList.add(msgFromUser);
            i2 = i5 + 1;
            i3 = i4;
            j = strArr;
        }
        return new a(new mj30(new gj30(arrayList, EmptySet.b, false, false, false, false), profilesInfo), dialog, w2wVar.H0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nub)) {
            return false;
        }
        nub nubVar = (nub) obj;
        return epx.f(this.b, nubVar.b) && this.c == nubVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChatPreviewGetCmd(cacheDataProvider=" + this.b + ", source=" + this.c + ')';
    }
}

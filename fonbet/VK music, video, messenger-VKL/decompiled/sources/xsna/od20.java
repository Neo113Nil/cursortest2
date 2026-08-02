package xsna;

import com.vk.api.generated.messages.dto.MessagesCreateFolderResponseDto;
import com.vk.api.generated.messages.dto.MessagesCreateFolderTypeDto;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.FolderType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MessagesCreateFolderApiCmd.kt */
/* loaded from: classes18.dex */
public final class od20 extends nx2<Integer> {
    public final String b;
    public final FolderType c;
    public final Iterable<Peer> d;

    /* JADX WARN: Multi-variable type inference failed */
    public od20(String str, FolderType folderType, Iterable<? extends Peer> iterable) {
        this.b = str;
        this.c = folderType;
        this.d = iterable;
    }

    @Override // xsna.nx2
    public final Integer f(l7r0 l7r0Var) {
        MessagesCreateFolderTypeDto messagesCreateFolderTypeDto = null;
        FolderType folderType = this.c;
        if (folderType != null) {
            MessagesCreateFolderTypeDto[] values = MessagesCreateFolderTypeDto.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                MessagesCreateFolderTypeDto messagesCreateFolderTypeDto2 = values[i];
                if (epx.f(messagesCreateFolderTypeDto2.i(), folderType.j())) {
                    messagesCreateFolderTypeDto = messagesCreateFolderTypeDto2;
                    break;
                }
                i++;
            }
        }
        Iterable<Peer> iterable = this.d;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator<Peer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(com.vk.dto.common.a.b(it.next()));
        }
        tfx tfxVar = new tfx("messages.createFolder", new wr(25), new xr(22));
        tfx.o(tfxVar, "name", this.b, 1, 0, 8);
        if (messagesCreateFolderTypeDto != null) {
            tfx.o(tfxVar, "type", messagesCreateFolderTypeDto.i(), 0, 0, 12);
        }
        tfx.p(tfxVar, "included_peer_ids", arrayList, 0L, 12);
        return Integer.valueOf(((MessagesCreateFolderResponseDto) ((az2) bz2.n(tfxVar, new z13(27)).c).invoke(l7r0Var)).d());
    }
}

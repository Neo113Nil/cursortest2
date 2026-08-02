package xsna;

import com.vk.api.generated.messages.dto.MessagesGetReactionsAssetsResponseDto;
import com.vk.api.generated.messages.dto.MessagesReactionAssetItemDto;
import com.vk.api.generated.messages.dto.MessagesReactionAssetItemLinksDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.wst;

/* compiled from: GetMsgReactionsAssetsCmd.kt */
/* loaded from: classes2.dex */
public final class xst extends le6<wst> {

    /* compiled from: GetMsgReactionsAssetsCmd.kt */
    public static final class a {
        public static wst.a a(MessagesReactionAssetItemDto messagesReactionAssetItemDto) {
            return new wst.a(messagesReactionAssetItemDto.e(), new wst.a.C3957a(messagesReactionAssetItemDto.d().d(), messagesReactionAssetItemDto.d().e(), messagesReactionAssetItemDto.d().f()));
        }
    }

    @Override // xsna.le6
    public final wst e(w2w w2wVar) {
        wst.a.C3957a c3957a;
        ArrayList arrayList;
        MessagesGetReactionsAssetsResponseDto messagesGetReactionsAssetsResponseDto = (MessagesGetReactionsAssetsResponseDto) bz2.c(bz2.n(new tfx("messages.getReactionsAssets", new or(22), new pr(23)), new ept(1)), "GetMsgReactionsAssetsCmd.messagesGetReactionsAssets");
        int i = messagesGetReactionsAssetsResponseDto.i();
        List<MessagesReactionAssetItemDto> d = messagesGetReactionsAssetsResponseDto.d();
        ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList2.add(a.a((MessagesReactionAssetItemDto) it.next()));
        }
        List<MessagesReactionAssetItemDto> f = messagesGetReactionsAssetsResponseDto.f();
        if (f != null) {
            List<MessagesReactionAssetItemDto> list = f;
            ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(a.a((MessagesReactionAssetItemDto) it2.next()));
            }
            c3957a = null;
            arrayList = arrayList3;
        } else {
            c3957a = null;
            arrayList = null;
        }
        List<Integer> g = messagesGetReactionsAssetsResponseDto.g();
        MessagesReactionAssetItemLinksDto e = messagesGetReactionsAssetsResponseDto.e();
        if (e != null) {
            c3957a = new wst.a.C3957a(e.d(), e.e(), e.f());
        }
        return new wst(i, arrayList2, arrayList, g, c3957a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xst)) {
            return false;
        }
        ((xst) obj).getClass();
        return true;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "GetMsgReactionsAssetsCmd(version=null)";
    }
}

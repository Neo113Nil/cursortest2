package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: State.kt */
/* loaded from: classes2.dex */
public final class ltk0 {
    public boolean a;
    public long b;
    public Peer c;
    public wpp<Long, Dialog> d;
    public boolean e;
    public List<? extends Msg> f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    public ltk0() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.c = Peer.Unknown.e;
        this.d = new wpp<>();
        this.f = EmptyList.b;
        this.g = true;
        this.h = true;
        this.i = true;
        this.j = true;
    }
}

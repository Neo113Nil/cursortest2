package xsna;

import android.os.Parcelable;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MessageFromChannelHolder.kt */
/* loaded from: classes16.dex */
public final class p920 implements com.vk.im.engine.models.messages.a {
    public final boolean b;
    public final List<Attach> c;
    public final a d;
    public final long e;
    public String f;
    public String g;
    public MsgTextFormat h;
    public ArrayList i;
    public ArrayList j;
    public final long k;
    public final Peer l;

    /* compiled from: MessageFromChannelHolder.kt */
    public interface a {

        /* compiled from: MessageFromChannelHolder.kt */
        /* renamed from: xsna.p920$a$a, reason: collision with other inner class name */
        public static final class C3498a implements a {
            public static final C3498a a = new C3498a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3498a);
            }

            public final int hashCode() {
                return 869096041;
            }

            public final String toString() {
                return "Empty";
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p920(MsgFromChannel msgFromChannel, boolean z) {
        a aVar;
        String str;
        PostDonut.Paywall paywall;
        PostDonut.Snippet snippet;
        LinkButton linkButton;
        PostDonut.Paywall paywall2;
        PostDonut.Snippet snippet2;
        LinkButton linkButton2;
        this.b = z;
        List<Attach> list = msgFromChannel.E;
        this.c = list;
        MsgFromChannel.b bVar = msgFromChannel.I;
        boolean z2 = bVar.z;
        if (z2) {
            PostDonut postDonut = bVar.g;
            if ((postDonut != null ? postDonut.g : null) != null) {
                String str2 = (postDonut == null || (paywall2 = postDonut.g) == null || (snippet2 = paywall2.d) == null || (linkButton2 = snippet2.e) == null || (str2 = linkButton2.b) == null) ? "" : str2;
                Parcelable parcelable = (postDonut == null || (paywall = postDonut.g) == null || (snippet = paywall.d) == null || (linkButton = snippet.e) == null) ? null : linkButton.c;
                ActionOpenUrl actionOpenUrl = parcelable instanceof ActionOpenUrl ? (ActionOpenUrl) parcelable : null;
                aVar = new o920(str2, (actionOpenUrl == null || (str = actionOpenUrl.c) == null) ? "" : str, msgFromChannel.c);
                this.d = aVar;
                this.e = msgFromChannel.c;
                this.f = "";
                this.g = "";
                this.h = MsgTextFormat.d;
                ArrayList arrayList = new ArrayList();
                ArrayList a2 = a(list);
                if (z) {
                    arrayList.addAll(a2);
                    ArrayList E = g5g.E(list, AttachWall.class);
                    ArrayList arrayList2 = new ArrayList(c5g.u(E, 10));
                    Iterator it = E.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(b((AttachWall) it.next()));
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList.addAll((List) it2.next());
                    }
                } else {
                    arrayList = a2;
                }
                this.i = new ArrayList(arrayList);
                this.j = new ArrayList();
                this.k = msgFromChannel.g;
                this.l = msgFromChannel.h;
            }
        }
        aVar = z2 ? n920.a : a.C3498a.a;
        this.d = aVar;
        this.e = msgFromChannel.c;
        this.f = "";
        this.g = "";
        this.h = MsgTextFormat.d;
        ArrayList arrayList3 = new ArrayList();
        ArrayList a22 = a(list);
        if (z) {
        }
        this.i = new ArrayList(arrayList3);
        this.j = new ArrayList();
        this.k = msgFromChannel.g;
        this.l = msgFromChannel.h;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((Attach) obj) instanceof AttachWall)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final boolean A4(boolean z) {
        return super.D3(AttachWall.class, z);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void Ba(MsgTextFormat msgTextFormat) {
        this.h = msgTextFormat;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final long C() {
        return this.k;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void I3(ArrayList arrayList) {
        this.j = arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void J2(Class cls, boolean z, ArrayList arrayList, boolean z2) {
        a.C1125a.e(this, cls, z, arrayList, z2);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<Attach> K0() {
        return this.i;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void P9() {
        this.g = "";
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<CarouselItem> U4() {
        return null;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final BotKeyboard V2() {
        return null;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final MsgTextFormat a4() {
        return this.h;
    }

    public final ArrayList b(AttachWall attachWall) {
        ArrayList arrayList = new ArrayList();
        ArrayList a2 = a(attachWall.o);
        if (this.b) {
            return a2;
        }
        arrayList.addAll(a2);
        ArrayList E = g5g.E(attachWall.o, AttachWall.class);
        ArrayList arrayList2 = new ArrayList(c5g.u(E, 10));
        Iterator it = E.iterator();
        while (it.hasNext()) {
            arrayList2.add(b((AttachWall) it.next()));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.addAll((List) it2.next());
        }
        return arrayList;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getBody() {
        return this.g;
    }

    @Override // xsna.vsx0
    public final Peer getFrom() {
        return this.l;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final String getTitle() {
        return this.f;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void h3(List<Attach> list) {
        this.i = (ArrayList) list;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void i2(izs<? super NestedMsg, s3q0> izsVar, boolean z) {
        super.i2(izsVar, false);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final <T extends Attach> T l2(Class<T> cls, boolean z) {
        return (T) super.l2(AttachAudioMsg.class, false);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final Attach l4(izs<? super Attach, Boolean> izsVar, boolean z) {
        return com.vk.im.engine.models.messages.a.Q7(this, izsVar, z);
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void m(String str) {
        this.f = "";
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void o3(ArrayList arrayList) {
        a.C1125a.b(this, arrayList);
    }

    @Override // xsna.vsx0
    public final long ob() {
        return getFrom().d;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final List<NestedMsg> q7() {
        return this.j;
    }

    @Override // com.vk.im.engine.models.messages.a
    public final void u8(izs izsVar, izs izsVar2) {
        a.C1125a.f(this, izsVar, izsVar2);
    }

    @Override // xsna.vsx0
    public final Peer.Type y2() {
        return getFrom().c;
    }
}

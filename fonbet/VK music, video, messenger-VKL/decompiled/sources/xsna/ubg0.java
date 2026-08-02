package xsna;

import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dux0;
import xsna.g1e0;

/* compiled from: ExtendedResponse.kt */
/* loaded from: classes2.dex */
public final class ubg0<T extends dux0> extends dcq<T> {
    public final boolean b;
    public final FunctionReferenceImpl c;
    public final Source d;

    /* JADX WARN: Multi-variable type inference failed */
    public ubg0(T t, boolean z, wzs<? super T, ? super ProfilesSimpleInfo, ? extends T> wzsVar, Source source) {
        super(t);
        this.b = z;
        this.c = (FunctionReferenceImpl) wzsVar;
        this.d = source;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // xsna.dcq
    public final Object a(w2w w2wVar, ProfilesSimpleInfo profilesSimpleInfo, d9j d9jVar) {
        T t = this.a;
        dux0 dux0Var = (dux0) t;
        if (dux0Var.c().f()) {
            return (dux0) ((dcq) d9jVar.c).a;
        }
        SetBuilder h = dux0Var.c().h();
        SetBuilder setBuilder = new SetBuilder();
        Collection<User> values = profilesSimpleInfo.b.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        for (User user : values) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.a(user.b, Peer.Type.USER));
        }
        setBuilder.addAll(arrayList);
        Collection<Contact> values2 = profilesSimpleInfo.c.values();
        ArrayList arrayList2 = new ArrayList(c5g.u(values2, 10));
        for (Contact contact : values2) {
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList2.add(Peer.a.a(contact.b, Peer.Type.CONTACT));
        }
        setBuilder.addAll(arrayList2);
        Collection<Email> values3 = profilesSimpleInfo.d.values();
        ArrayList arrayList3 = new ArrayList(c5g.u(values3, 10));
        for (Email email : values3) {
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            arrayList3.add(Peer.a.a(email.b, Peer.Type.EMAIL));
        }
        setBuilder.addAll(arrayList3);
        Collection<Group> values4 = profilesSimpleInfo.e.values();
        ArrayList arrayList4 = new ArrayList(c5g.u(values4, 10));
        for (Group group : values4) {
            Serializer.c<Peer> cVar4 = Peer.CREATOR;
            arrayList4.add(Peer.a.a(group.b, Peer.Type.GROUP));
        }
        setBuilder.addAll(arrayList4);
        Collection values5 = profilesSimpleInfo.f.values();
        ArrayList arrayList5 = new ArrayList(c5g.u(values5, 10));
        Iterator it = values5.iterator();
        while (it.hasNext()) {
            arrayList5.add(new Peer.Channel(((Channel) it.next()).b));
        }
        setBuilder.addAll(arrayList5);
        Set g = izi0.g(h, setBuilder.d());
        if (!g.isEmpty()) {
            g1e0.a aVar = new g1e0.a();
            aVar.h(g);
            aVar.b = this.d;
            aVar.c = this.b;
            profilesSimpleInfo = ((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)))).Ob().Ib(profilesSimpleInfo);
        }
        return (dux0) this.c.invoke(t, profilesSimpleInfo);
    }
}

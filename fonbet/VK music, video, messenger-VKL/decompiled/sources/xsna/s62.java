package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.contacts.AndroidContact;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.CommentDonut;
import com.vk.superapp.vkclient.js.bridge.api.events.JoinGroup$Parameters;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.h8w;
import xsna.hfr;
import xsna.kb70;
import xsna.kzw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class s62 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s62(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.im.engine.models.im_item.a meta;
        switch (this.b) {
            case 0:
                u62 u62Var = (u62) this.c;
                String str = (String) this.d;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
                hfr t = rli0.t(rli0.l((uki0) obj, new t62(str, 0)), new t50(u62Var, 1));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                hfr.a aVar = new hfr.a(t);
                while (aVar.hasNext()) {
                    Object next = aVar.next();
                    Long valueOf = Long.valueOf(((AndroidContact) next).h);
                    Object obj2 = linkedHashMap2.get(valueOf);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap2.put(valueOf, obj2);
                    }
                    ((List) obj2).add(next);
                }
                Collection values = linkedHashMap2.values();
                ArrayList arrayList = new ArrayList(c5g.u(values, 10));
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(u62.a((List) it.next()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AndroidContact androidContact = (AndroidContact) it2.next();
                    linkedHashMap.put(Long.valueOf(androidContact.h), androidContact);
                }
                break;
            case 1:
                CommentDonut.Placeholder placeholder = (CommentDonut.Placeholder) this.c;
                UserId userId = (UserId) this.d;
                f1o f1oVar = (f1o) this.e;
                LinkButton linkButton = placeholder.c;
                if (linkButton != null) {
                    hd60.a().v(linkButton.c, f1oVar.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
                }
                b.d dVar = new b.d("donut_click_pay");
                dVar.b("thread_placeholder", "source");
                dVar.b(userId, "owner_id");
                dVar.e();
                break;
            case 2:
                h8w.a.b bVar = (h8w.a.b) this.c;
                w2w w2wVar = (w2w) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                if (!bVar.e && (meta = w2wVar.I0().j().getMeta()) != null) {
                    h8w.q(w2wVar, meta, arrayList2);
                }
                w2wVar.I0().j().e(arrayList2);
                break;
            case 3:
                ((x7y) this.c).L0().e(((JoinGroup$Parameters) this.e).e(), (String) this.d, (Throwable) obj);
                break;
            case 4:
                pe40 pe40Var = (pe40) this.c;
                String str2 = (String) this.d;
                UIBlockLink uIBlockLink = (UIBlockLink) this.e;
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    break;
                }
            case 5:
                izs izsVar = (izs) this.c;
                izs izsVar2 = (izs) this.d;
                kb70 kb70Var = (kb70) this.e;
                izsVar.invoke((snv) obj);
                izsVar2.invoke(((kb70.d) kb70Var).a);
                break;
            case 6:
                break;
            case 7:
                ((vtn0) this.c).e((Context) this.d, (List) this.e);
                break;
            default:
                ((hzw0) this.c).T(new kzw0.c.a((CharSequence) this.d, (set0) this.e, (Throwable) obj));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ s62(h8w.a.b bVar, w2w w2wVar, ArrayList arrayList, h8w h8wVar) {
        this.b = 2;
        this.c = bVar;
        this.d = w2wVar;
        this.e = arrayList;
    }

    public /* synthetic */ s62(x7y x7yVar, JoinGroup$Parameters joinGroup$Parameters, String str) {
        this.b = 3;
        this.c = x7yVar;
        this.e = joinGroup$Parameters;
        this.d = str;
    }
}

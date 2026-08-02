package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.user.InvisibleLastSeenStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.a;
import com.vk.voip.ui.calls.presentation.model.list.FriendItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.kr5;

/* compiled from: VoipCallServicesUserMapper.kt */
/* loaded from: classes7.dex */
public final class cjw0 {
    public final v8j a = v8j.a;
    public final DisplayNameFormatter b = new DisplayNameFormatter(null, 3, null);
    public final gp80 c;

    /* compiled from: VoipCallServicesUserMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InvisibleLastSeenStatus.values().length];
            try {
                iArr[InvisibleLastSeenStatus.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvisibleLastSeenStatus.RECENTLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvisibleLastSeenStatus.LAST_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InvisibleLastSeenStatus.LAST_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InvisibleLastSeenStatus.NOT_SHOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InvisibleLastSeenStatus.LONG_AGO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cjw0() {
        Context context = e43.a;
        this.c = new gp80(context != null ? context : null);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ziw0 ziw0Var = (ziw0) it.next();
            arrayList2.add(new low0(ziw0Var.a, ziw0Var.b, ziw0Var.c, ziw0Var.d, ziw0Var.e, ziw0Var.f, ziw0Var.g, ziw0Var.h, false, ziw0Var.i, true, ziw0Var.j));
        }
        return arrayList2;
    }

    public final FriendItem a(Contact contact, String str) {
        boolean z = contact.m == Contact.LastSeenStatus.LONG_AGO;
        DisplayNameFormatter displayNameFormatter = this.b;
        displayNameFormatter.getClass();
        String e = displayNameFormatter.e(contact, UserNameCase.NOM);
        Contact.LastSeenStatus lastSeenStatus = contact.m;
        this.a.getClass();
        String a2 = v8j.a(lastSeenStatus);
        tlo0 d = a2 != null ? oq.d(tlo0.Companion, a2) : tq.h(tlo0.Companion, R.string.voip_vkapp_services_contact_long_ago);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Contact contact2 = new Peer.Contact(contact.b + 1900000000);
        FriendItem.CallStatus callStatus = !contact.o ? FriendItem.CallStatus.Restricted : z ? FriendItem.CallStatus.Expired : FriendItem.CallStatus.Enabled;
        FriendItem.a.C2039a c2039a = new FriendItem.a.C2039a(d);
        kr5.a aVar = new kr5.a(new g6o0(contact.h));
        s3q0 s3q0Var = s3q0.a;
        return new FriendItem(contact2, e, false, callStatus, aVar.a(), c2039a, new a.b.C1179b(e), str);
    }

    public final FriendItem b(qtd0 qtd0Var, String str) {
        FriendItem.CallStatus callStatus;
        boolean b;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.User user = new Peer.User(qtd0Var.id());
        DisplayNameFormatter displayNameFormatter = this.b;
        displayNameFormatter.getClass();
        String e = displayNameFormatter.e(qtd0Var, UserNameCase.NOM);
        boolean z = qtd0Var.B2() == UserSex.FEMALE;
        boolean ib = qtd0Var.ib();
        OnlineInfo mb = qtd0Var.mb();
        if (!ib) {
            callStatus = FriendItem.CallStatus.Restricted;
        } else if (mb.Bb()) {
            callStatus = FriendItem.CallStatus.Enabled;
        } else if (mb instanceof VisibleStatus) {
            if (qtd0Var instanceof Contact) {
                Contact.LastSeenStatus lastSeenStatus = m0c.a;
                b = m0c.a(((Contact) qtd0Var).m);
            } else {
                b = m0c.b(mb);
            }
            callStatus = b ? FriendItem.CallStatus.Expired : FriendItem.CallStatus.Enabled;
        } else {
            if (!(mb instanceof InvisibleStatus)) {
                throw new NoWhenBranchMatchedException();
            }
            switch (a.$EnumSwitchMapping$0[((InvisibleStatus) mb).b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    callStatus = FriendItem.CallStatus.Enabled;
                    break;
                case 6:
                    callStatus = FriendItem.CallStatus.Expired;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        FriendItem.CallStatus callStatus2 = callStatus;
        OnlineInfo mb2 = qtd0Var.mb();
        VisibleStatus zb = mb2.zb();
        boolean Ab = mb2.Ab();
        gp80 gp80Var = this.c;
        FriendItem.a c2039a = Ab ? new FriendItem.a.C2039a(oq.d(tlo0.Companion, imj0.d(gp80Var, qtd0Var))) : zb == null ? new FriendItem.a.C2039a(oq.d(tlo0.Companion, imj0.d(gp80Var, qtd0Var))) : zb.e == Platform.MOBILE ? FriendItem.a.b.C2040a.a : FriendItem.a.b.C2041b.a;
        qtd0Var.n9();
        kr5.a aVar = new kr5.a(new g6o0(qtd0Var.C8()));
        s3q0 s3q0Var = s3q0.a;
        return new FriendItem(user, e, z, callStatus2, aVar.a(), c2039a, new a.b.c(qtd0Var), str);
    }

    public final ArrayList c(List list) {
        List<qtd0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (qtd0 qtd0Var : list2) {
            arrayList.add(qtd0Var instanceof Contact ? a((Contact) qtd0Var, null) : b(qtd0Var, null));
        }
        return arrayList;
    }
}

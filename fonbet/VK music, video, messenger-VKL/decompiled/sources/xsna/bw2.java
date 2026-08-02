package xsna;

import com.vk.antispam.ChatSpamAction;
import com.vk.antispam.ProfileSpamAction;
import com.vk.antispam.SpamAction;
import com.vk.antispam.SpammerModel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.aw2;

/* compiled from: AntispamReducer.kt */
/* loaded from: classes14.dex */
public final class bw2 extends dm50<iw2, aw2, fw2> {
    public final SpammerModel d;
    public final gw2 e;

    /* compiled from: AntispamReducer.kt */
    public static final class a {

        /* compiled from: AntispamReducer.kt */
        /* renamed from: xsna.bw2$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2627a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Peer.Type.values().length];
                try {
                    iArr[Peer.Type.USER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Peer.Type.EMAIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Peer.Type.CONTACT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Peer.Type.CHAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Peer.Type.GROUP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static ArrayList a(Peer.Type type) {
            int i = C2627a.$EnumSwitchMapping$0[type.ordinal()];
            Iterable l = (i == 1 || i == 2 || i == 3) ? e43.l(ProfileSpamAction.DeleteChat.b, ProfileSpamAction.BlackList.b, ProfileSpamAction.Report.b) : (i == 4 || i == 5) ? e43.l(ChatSpamAction.ExitChatAndClearHistory.b, ChatSpamAction.Report.b) : EmptyList.b;
            ArrayList arrayList = new ArrayList(c5g.u(l, 10));
            Iterator it = l.iterator();
            while (it.hasNext()) {
                arrayList.add(new lhk0((SpamAction) it.next(), true));
            }
            return arrayList;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bw2(SpammerModel spammerModel) {
        super(new fw2(r1, new SpammerModel("", r4, Peer.Unknown.e, null, false, 24, null)));
        EmptyList emptyList = EmptyList.b;
        ImageList imageList = new ImageList(null, 1, null);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.d = spammerModel;
        this.e = gw2.a;
    }

    @Override // xsna.dm50
    public final fw2 c(fw2 fw2Var, aw2 aw2Var) {
        fw2 fw2Var2 = fw2Var;
        aw2 aw2Var2 = aw2Var;
        List<lhk0> list = fw2Var2.b;
        if (!(aw2Var2 instanceof aw2.a)) {
            if (!(aw2Var2 instanceof aw2.b)) {
                throw new NoWhenBranchMatchedException();
            }
            SpammerModel spammerModel = ((aw2.b) aw2Var2).b;
            return new fw2(a.a(spammerModel.d.c), spammerModel);
        }
        Iterator<lhk0> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (epx.f(it.next().a, ((aw2.a) aw2Var2).b)) {
                break;
            }
            i++;
        }
        aw2.a aVar = (aw2.a) aw2Var2;
        return new fw2(rdi.I(i, new lhk0(aVar.b, aVar.c), list), fw2Var2.c);
    }

    @Override // xsna.dm50
    public final iw2 d() {
        return new iw2(e(new lb(this, 4)));
    }

    @Override // xsna.dm50
    public final void h(fw2 fw2Var, iw2 iw2Var) {
        f(iw2Var.a, fw2Var);
    }
}

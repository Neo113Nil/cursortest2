package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: DialogMembersList.kt */
/* loaded from: classes2.dex */
public final class ohm implements Iterable<DialogMember>, icy {
    public static final bpn0 c = new bpn0(new bv0(12));
    public final ArrayList b;

    /* compiled from: DialogMembersList.kt */
    public static final class a {
        public static final String a(qtd0 qtd0Var) {
            Pair pair;
            bpn0 bpn0Var = ohm.c;
            ImFeatures imFeatures = ImFeatures.EDU_SORT_CHAT_MEMBERS_CONTACT;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures) && qtd0Var.v5() != null && (qtd0Var instanceof User)) {
                User user = (User) qtd0Var;
                UserNameCase userNameCase = UserNameCase.NOM;
                pair = new Pair(user.Cb(userNameCase), user.Fb(userNameCase));
            } else {
                UserNameCase userNameCase2 = UserNameCase.NOM;
                pair = new Pair(qtd0Var.d6(userNameCase2), qtd0Var.H5(userNameCase2));
            }
            String str = (String) pair.d();
            String str2 = (String) pair.g();
            return str2.length() == 0 ? str : v1v.a(' ', str2, str);
        }

        public static int b(DialogMember dialogMember, boolean z) {
            if (z) {
                return 0;
            }
            if (dialogMember.h) {
                return 1;
            }
            if (dialogMember.zb()) {
                return 3;
            }
            return dialogMember.f != null ? 4 : 2;
        }
    }

    public ohm(DialogMember... dialogMemberArr) {
        this(Arrays.asList(dialogMemberArr));
    }

    public final DialogMember a(Peer peer) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((DialogMember) obj).b, peer)) {
                break;
            }
        }
        return (DialogMember) obj;
    }

    @CheckResult
    public final ohm b(ohm ohmVar) {
        ArrayList arrayList = ohmVar.b;
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((DialogMember) it.next()).b);
        }
        HashSet hashSet = new HashSet(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList.size() + arrayList2.size());
        arrayList4.addAll(arrayList2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((DialogMember) next).b)) {
                arrayList4.add(next);
            }
        }
        return new ohm(arrayList4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ohm) {
            return epx.f(this.b, ((ohm) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<DialogMember> iterator() {
        return this.b.listIterator();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("DialogMembersList(list="), this.b);
    }

    public ohm() {
        this.b = new ArrayList();
    }

    public ohm(Collection<DialogMember> collection) {
        this();
        this.b.addAll(collection);
    }
}

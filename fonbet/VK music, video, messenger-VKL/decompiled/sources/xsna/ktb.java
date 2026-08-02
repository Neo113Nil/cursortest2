package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.CheckResult;
import com.vk.contacts.AndroidContact;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserProfile;
import com.vk.im.chatmembers.api.ChatMembersFeatureComponent;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.im.ui.fragments.ImSelectDonutContactsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChatMembersInviteHelper.kt */
/* loaded from: classes2.dex */
public final class ktb implements w8i {
    public final Context b;
    public final a1w c;
    public final mxv d;
    public final b25 e;
    public final gzs<DialogExt> f;
    public final u90 g;
    public final int h;
    public final a i;
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: ChatMembersInviteHelper.kt */
    /* loaded from: classes.dex */
    public interface a {
        void F9(itb itbVar, jtb jtbVar);

        void Le(Throwable th);

        void b5(esb esbVar);

        void jd(bb bbVar);

        void m4();
    }

    public ktb(Context context, a1w a1wVar, mxv mxvVar, b25 b25Var, gzs<DialogExt> gzsVar, u90 u90Var, int i, a aVar) {
        this.b = context;
        this.c = a1wVar;
        this.d = mxvVar;
        this.e = b25Var;
        this.f = gzsVar;
        this.g = u90Var;
        this.h = i;
        this.i = aVar;
    }

    public final DialogExt a() {
        return this.f.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    public final void b(Intent intent) {
        Iterable iterable;
        ?? r0;
        long[] longArrayExtra = intent != null ? intent.getLongArrayExtra("ids") : null;
        if (longArrayExtra == null || longArrayExtra.length == 0) {
            ArrayList parcelableArrayListExtra = intent != null ? Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("result", UserProfile.class) : intent.getParcelableArrayListExtra("result") : null;
            if (parcelableArrayListExtra != null) {
                ArrayList arrayList = new ArrayList(c5g.u(parcelableArrayListExtra, 10));
                Iterator it = parcelableArrayListExtra.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((UserProfile) it.next()).c.b));
                }
                iterable = arrayList;
            } else {
                iterable = EmptyList.b;
            }
        } else {
            iterable = rl3.t0(longArrayExtra);
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable2, 10));
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            long longValue = ((Number) it2.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList2.add(Peer.a.b(longValue));
        }
        if (intent != null) {
            ArrayList parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("selectedContacts", AndroidContact.class) : intent.getParcelableArrayListExtra("selectedContacts");
            if (parcelableArrayListExtra2 != null) {
                r0 = new ArrayList(c5g.u(parcelableArrayListExtra2, 10));
                Iterator it3 = parcelableArrayListExtra2.iterator();
                while (it3.hasNext()) {
                    r0.add((String) j5g.X(((AndroidContact) it3.next()).e));
                }
                if (arrayList2.isEmpty() || !r0.isEmpty()) {
                    this.c.r().getClass();
                    int i = 0;
                    this.i.F9(new itb(this, arrayList2, r0, i), new jtb(this, arrayList2, r0, i));
                }
                return;
            }
        }
        r0 = EmptyList.b;
        if (arrayList2.isEmpty()) {
        }
        this.c.r().getClass();
        int i2 = 0;
        this.i.F9(new itb(this, arrayList2, r0, i2), new jtb(this, arrayList2, r0, i2));
    }

    public final void c(Peer peer) {
        ChatSettings Hb;
        Long l;
        ChatSettings Hb2;
        ((ChatMembersFeatureComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(ChatMembersFeatureComponent.class))).S1().getClass();
        EmptyList emptyList = EmptyList.b;
        boolean z = a().l;
        Context context = this.b;
        if (!z) {
            ((ChatMembersFeatureComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(ChatMembersFeatureComponent.class))).S1().getClass();
            o0r0 d = this.d.d();
            String string = context.getString(R.string.vkim_empty_selection_hint);
            String string2 = context.getString(R.string.vkim_add_users);
            EmptyList emptyList2 = emptyList;
            ArrayList arrayList = new ArrayList(c5g.u(emptyList2, 10));
            Iterator<E> it = emptyList2.iterator();
            while (it.hasNext()) {
                dq.h(((Number) it.next()).longValue(), arrayList);
            }
            o0r0.h(d, this.g, true, false, this.h, null, string, string2, null, null, arrayList, null, MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_FRIENDS_ADD, a().f, 112196);
            return;
        }
        Dialog Cb = a().Cb();
        if (Cb == null || (Hb = Cb.Hb()) == null || (l = Hb.C) == null) {
            return;
        }
        long longValue = l.longValue();
        ImSelectDonutContactsFragment.a aVar = new ImSelectDonutContactsFragment.a();
        String string3 = context.getString(R.string.vkim_choose_members);
        Bundle bundle = aVar.j;
        bundle.putString("title", string3);
        bundle.putString("hint", context.getString(R.string.vkim_empty_selection_donut_hint));
        bundle.putLongArray("ids", j5g.P0(emptyList));
        bundle.putParcelable("donut_root_dialog_peer", a().f);
        bundle.putString("text", context.getString(R.string.vkim_select_members));
        bundle.putSerializable("visitSource", MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_FRIENDS_ADD);
        bundle.putLong("donut_chat_owner_id", longValue);
        DialogExt a2 = a();
        Peer q = this.c.q();
        Dialog dialog = a2.d.d;
        boolean z2 = false;
        if (dialog != null && (Hb2 = dialog.Hb()) != null && Hb2.e.contains(q)) {
            z2 = true;
        }
        bundle.putSerializable("factory", !z2 ? DonutContactsListFactory.SELECT_DONUT_FRIENDS_VKAPP : DonutContactsListFactory.SELECT_DONUT_USERS_VKAPP);
        u90 u90Var = this.g;
        u90Var.D(aVar.n(u90Var.B()), this.h, null);
    }

    public final void d(int i, ArrayList arrayList, List list) {
        if (arrayList.isEmpty() && list.isEmpty()) {
            return;
        }
        this.j.b(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.c.F(this, new urm(a().f, arrayList, list, i, null, false, "AddChatMembersHelper", 16)), new wf1(new x7(this, 23), 11)), new g66(this, 1)).subscribe(new h60(new a8(this, 20), 12), new f60(new com.vk.movika.sdk.base.observable.a(this, 21), 13)));
    }

    @CheckResult
    public final io.reactivex.rxjava3.disposables.b e() {
        return this.j;
    }
}

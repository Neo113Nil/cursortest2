package xsna;

import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.channels.impl.channelselection.SelectChannelFragment;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cwb0;
import xsna.ikv0;
import xsna.v6i0;
import xsna.y6i0;

/* compiled from: SelectChannelViewController.kt */
/* loaded from: classes16.dex */
public final class x6i0 extends fi6<z6i0, w6i0> {
    public final MviComponentFragment f;
    public g g;
    public a h;
    public final bpn0 i;

    /* compiled from: SelectChannelViewController.kt */
    public static final class a extends qul {
    }

    /* compiled from: SelectChannelViewController.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: SelectChannelViewController.kt */
    public static final class c implements hfz {
        public final qtd0 b;
        public final String c;
        public final boolean d;

        public c(String str, qtd0 qtd0Var, boolean z) {
            this.b = qtd0Var;
            this.c = str;
            this.d = z;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }
    }

    /* compiled from: SelectChannelViewController.kt */
    public static final class d extends vfz<c> {
        public final b l;
        public final ImAvatarView m;
        public final AppCompatTextView n;
        public final TextView o;
        public c p;

        public d(View view, b bVar) {
            super(view);
            this.l = bVar;
            this.m = (ImAvatarView) this.itemView.findViewById(R.id.vkim_avatar);
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.itemView.findViewById(R.id.vkim_username);
            appCompatTextView.setEmojiCompatEnabled(false);
            this.n = appCompatTextView;
            this.o = (TextView) this.itemView.findViewById(R.id.vkim_subtitle);
            this.itemView.setOnClickListener(new vg(this, 6));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(c cVar) {
            c cVar2 = cVar;
            qtd0 qtd0Var = cVar2.b;
            this.p = cVar2;
            View view = this.itemView;
            boolean z = cVar2.d;
            view.setEnabled(z);
            view.setAlpha(z ? 1.0f : 0.65f);
            this.n.setText(qtd0Var.name());
            String str = cVar2.c;
            if (str == null) {
                str = "";
            }
            this.o.setText(str);
            this.m.s1(qtd0Var);
        }
    }

    /* compiled from: SelectChannelViewController.kt */
    public static final class e implements hfz {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }
    }

    /* compiled from: SelectChannelViewController.kt */
    public static final class f extends vfz<e> {
        public final TextView l;

        public f(View view) {
            super(view);
            this.l = (TextView) view;
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(e eVar) {
            this.l.setText(eVar.b);
        }
    }

    /* compiled from: SelectChannelViewController.kt */
    public static final class g {
        public final Toolbar a;
        public final RecyclerView b;
        public final ProgressBar c;
        public final ViewGroup d;

        public g(View view) {
            this.a = (Toolbar) view.findViewById(R.id.im_toolbar);
            this.b = (RecyclerView) view.findViewById(R.id.im_profile_list);
            this.c = (ProgressBar) view.findViewById(R.id.im_progress);
            this.d = (ViewGroup) view.findViewById(R.id.snackbar_container);
        }
    }

    public x6i0(SelectChannelFragment selectChannelFragment) {
        super(R.layout.im_channels_selection, null);
        this.f = selectChannelFragment;
        this.i = new bpn0(new hk70(this, 17));
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        g gVar = new g(view);
        gVar.a.setNavigationOnClickListener(new nn9(this, 7));
        LayoutInflater from = LayoutInflater.from(view.getContext());
        b bVar = new b();
        a aVar = new a(true);
        aVar.x0(c.class, new sf4(21, from, bVar));
        aVar.x0(e.class, new qhg0(from, 2));
        this.h = aVar;
        RecyclerView recyclerView = gVar.b;
        recyclerView.setAdapter(aVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.g = gVar;
    }

    public final c R(List list, qtd0 qtd0Var) {
        boolean contains = list.contains(Long.valueOf(qtd0Var.G3()));
        String str = null;
        if (!contains) {
            g gVar = this.g;
            str = (gVar != null ? gVar : null).a.getContext().getString(R.string.vkim_select_channel_created_subtitle);
        } else if (qtd0Var instanceof User) {
            g gVar2 = this.g;
            str = (gVar2 != null ? gVar2 : null).a.getContext().getString(R.string.vkim_select_channel_user_activity);
        } else if (qtd0Var instanceof Group) {
            str = ((Group) qtd0Var).n;
        }
        return new c(str, qtd0Var, contains);
    }

    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        boolean z = yn50Var instanceof y6i0.b;
        bpn0 bpn0Var = this.i;
        if (!z) {
            if (yn50Var.equals(y6i0.a.a)) {
                ((bzb0) bpn0Var.getValue()).a();
                return;
            }
            return;
        }
        v6i0 v6i0Var = ((y6i0.b) yn50Var).a;
        if (!(v6i0Var instanceof v6i0.b)) {
            if (!epx.f(v6i0Var, v6i0.a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((bzb0) bpn0Var.getValue()).c(new cwb0.s0(null, R.string.vkim_select_channel_creation, 5), null);
            return;
        }
        String b2 = zk70.b(((v6i0.b) v6i0Var).a);
        g gVar = this.g;
        if (gVar == null) {
            gVar = null;
        }
        ikv0.a aVar = new ikv0.a(gVar.a.getContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
        aVar.u = new ikv0.d(b2, (String) null, (ikv0.d.a) null, 6);
        aVar.o = Integer.valueOf(cn70.b(8));
        ikv0 b3 = aVar.b();
        g gVar2 = this.g;
        if (gVar2 == null) {
            gVar2 = null;
        }
        ViewGroup viewGroup = gVar2.d;
        utj utjVar = b3.b;
        utjVar.l = null;
        utjVar.m = new WeakReference<>(viewGroup);
        utjVar.e();
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        z6i0 z6i0Var = (z6i0) ao50Var;
        if (z6i0Var.d) {
            g gVar = this.g;
            if (gVar == null) {
                gVar = null;
            }
            gVar.c.setVisibility(0);
            g gVar2 = this.g;
            f4m.j((gVar2 != null ? gVar2 : null).b);
            return;
        }
        g gVar3 = this.g;
        if (gVar3 == null) {
            gVar3 = null;
        }
        f4m.j(gVar3.c);
        g gVar4 = this.g;
        if (gVar4 == null) {
            gVar4 = null;
        }
        gVar4.b.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        User user = z6i0Var.a;
        List<Long> list = z6i0Var.c;
        if (user != null) {
            arrayList.add(new e(R.string.vkim_select_channel_divider_profile));
            arrayList.add(R(list, user));
        }
        List<Group> list2 = z6i0Var.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(R(list, (Group) it.next()));
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new e(R.string.vkim_select_channel_divider_groups));
            arrayList.addAll(arrayList2);
        }
        a aVar = this.h;
        (aVar != null ? aVar : null).setItems(arrayList);
    }
}

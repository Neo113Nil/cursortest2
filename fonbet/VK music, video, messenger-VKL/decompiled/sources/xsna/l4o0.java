package xsna;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.dto.common.Peer;
import com.vk.dto.group.Group;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.pushes.PushAwareActivity;
import com.vk.sharing.api.dto.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import xsna.gxh;

/* compiled from: TargetsLoader.java */
/* loaded from: classes5.dex */
public final class l4o0 {
    public static final /* synthetic */ int l = 0;
    public io.reactivex.rxjava3.disposables.c a;
    public io.reactivex.rxjava3.disposables.c b;
    public final boolean d;

    @NonNull
    public final dcj0 e;

    @NonNull
    public final hdm f;

    @Nullable
    public PushAwareActivity h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();

    @NonNull
    public final Handler g = new Handler(Looper.getMainLooper());

    /* compiled from: TargetsLoader.java */
    public class a implements gxh.a {
        public a() {
        }

        @Override // xsna.gxh.a
        public final void a(@NonNull ArrayList<Group> arrayList) {
            l4o0 l4o0Var = l4o0.this;
            l4o0Var.f();
            l4o0Var.g.post(new e0(8, this, l4o0.d(arrayList)));
        }

        @Override // xsna.gxh.a
        public final void onError() {
            l4o0 l4o0Var = l4o0.this;
            l4o0Var.f();
            l4o0Var.g.post(new d0(this, 13));
        }
    }

    /* compiled from: TargetsLoader.java */
    public interface b {
        void P(@NonNull ArrayList<Target> arrayList);

        void Z(@NonNull ArrayList<Target> arrayList);

        void b1();

        void c0();

        void n1(@NonNull ArrayList<Target> arrayList);

        void o0();

        void v(@NonNull ArrayList<Target> arrayList, boolean z);
    }

    public l4o0(boolean z, dcj0 dcj0Var, hdm hdmVar) {
        this.d = z;
        this.e = dcj0Var;
        this.f = hdmVar;
    }

    @NonNull
    public static ArrayList<Target> d(@Nullable Collection<Group> collection) {
        ArrayList<Target> arrayList = new ArrayList<>();
        if (collection != null) {
            for (Group group : collection) {
                String str = group.o;
                if (str == null || str.isEmpty()) {
                    if (fkq0.b(group.c)) {
                        group.c = fkq0.a(group.c);
                    }
                    Target target = new Target(group);
                    target.c = fkq0.e(target.c);
                    arrayList.add(target);
                }
            }
        }
        return arrayList;
    }

    public final void a() {
        this.k = false;
        io.reactivex.rxjava3.disposables.c cVar = this.a;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
    }

    @SuppressLint({"CheckResult"})
    public final void b(@NonNull List<Target> list, @Nullable List<Peer> list2, @Nullable Integer num) {
        Dialog dialog;
        if (this.i) {
            return;
        }
        this.i = !this.i;
        gkx0 gkx0Var = gkx0.e;
        if (!list.isEmpty()) {
            int size = list.size() - 1;
            while (true) {
                if (size >= 0) {
                    Target target = list.get(size);
                    if (target != null && (dialog = target.i) != null) {
                        gkx0Var = dialog.nc();
                        break;
                    }
                    size--;
                } else {
                    break;
                }
            }
        }
        this.b = this.e.c(gkx0Var, this.d ? 50 : 10, "l4o0", list2, num).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new a960(this, 23), new vk40(this, 22));
    }

    public final void c(int i, boolean z) {
        if (this.j) {
            return;
        }
        f();
        if (!z) {
            t6g0 t6g0Var = t6g0.b;
            t6g0.b().clear();
            t6g0.b().S(i, new a());
        } else {
            io.reactivex.rxjava3.disposables.b bVar = this.c;
            dqu dquVar = new dqu();
            bVar.b(rsg0.W(yfb.x(xqu.h(new zqu(), o25.a().c(), e43.l(GroupsFilterDto.ADMIN, GroupsFilterDto.EDITOR), e43.l(GroupsFieldsDto.CAN_POST, GroupsFieldsDto.WALL), null, 1000, 40)), 7).l(new t9c0(3, new t3v(dquVar, 19))).subscribe(new f5y(this, 29), new tk40(this, 20)));
        }
    }

    @SuppressLint({"CheckResult"})
    public final void e(@NonNull String str) {
        if (this.k) {
            return;
        }
        this.a = new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(this.e.b(this.d ? 50 : 10, str), new n240(this, 23), io.reactivex.rxjava3.internal.functions.a.c), new ig4(this, 6)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m3y(this, 24), new cc20(this, 27));
    }

    public final void f() {
        this.j = !this.j;
    }
}

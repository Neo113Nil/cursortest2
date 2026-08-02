package com.vkontakte.android.actionlinks.views.fragments.add;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchItem;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.movika.sdk.base.logic.interactor.d;
import com.vkontakte.android.actionlinks.BaseItem;
import com.vkontakte.android.actionlinks.SourceType;
import com.vkontakte.android.actionlinks.g;
import com.vkontakte.android.actionlinks.views.holders.search.ItemSearch$ItemSearchListener$Mode;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.am0;
import xsna.asp;
import xsna.cc6;
import xsna.cm0;
import xsna.dm0;
import xsna.fvx;
import xsna.ga;
import xsna.ha;
import xsna.ia;
import xsna.j50;
import xsna.qux;
import xsna.rsg0;
import xsna.s6;
import xsna.svx;
import xsna.tl0;
import xsna.u20;
import xsna.ul0;
import xsna.vl0;
import xsna.vux;
import xsna.wl0;
import xsna.wux;
import xsna.xl0;
import xsna.xo2;
import xsna.y00;
import xsna.yl0;
import xsna.zl0;
import xsna.zrp;
import xsna.zzr0;

/* compiled from: AddLinkPresenter.kt */
/* loaded from: classes7.dex */
public final class AddLinkPresenter implements cc6 {
    public boolean b;
    public io.reactivex.rxjava3.disposables.c c;
    public com.vk.lists.c d;
    public cm0 e;
    public final g f;
    public dm0 g;
    public String h;
    public SourceType i;
    public io.reactivex.rxjava3.disposables.c j;
    public fvx k;
    public wux l;
    public final svx m;
    public final b n;
    public final c o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddLinkPresenter.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State LINK;
        public static final State USER;

        static {
            State state = new State("LINK", 0);
            LINK = state;
            State state2 = new State("USER", 1);
            USER = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: AddLinkPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SourceType.values().length];
            try {
                iArr[SourceType.Live.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SourceType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AddLinkPresenter.kt */
    public static final class b implements c.l<VKList<SearchItem>> {
        public b() {
        }

        @Override // com.vk.lists.c.k
        public final q<VKList<SearchItem>> hj(com.vk.lists.c cVar, boolean z) {
            cVar.r(true);
            AddLinkPresenter addLinkPresenter = AddLinkPresenter.this;
            io.reactivex.rxjava3.disposables.c cVar2 = addLinkPresenter.c;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            addLinkPresenter.m.clear();
            return rsg0.y0(new zzr0(addLinkPresenter.h, 0, cVar.k()), null, null, 3);
        }

        @Override // com.vk.lists.c.l
        public final q<VKList<SearchItem>> ui(int i, com.vk.lists.c cVar) {
            return rsg0.y0(new zzr0(AddLinkPresenter.this.h, i, cVar.k()), null, null, 3);
        }

        @Override // com.vk.lists.c.k
        public final void wd(q<VKList<SearchItem>> qVar, boolean z, com.vk.lists.c cVar) {
            m1 a0 = qVar.a0(io.reactivex.rxjava3.android.schedulers.a.b());
            int i = 0;
            AddLinkPresenter addLinkPresenter = AddLinkPresenter.this;
            addLinkPresenter.c = a0.subscribe(new zl0(new yl0(i, cVar, addLinkPresenter), i), new j50(new am0(i), 1));
        }
    }

    /* compiled from: AddLinkPresenter.kt */
    public static final class c {

        /* compiled from: AddLinkPresenter.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ItemSearch$ItemSearchListener$Mode.values().length];
                try {
                    iArr[ItemSearch$ItemSearchListener$Mode.USER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ItemSearch$ItemSearchListener$Mode.LINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
        }

        public final void a(String str, ItemSearch$ItemSearchListener$Mode itemSearch$ItemSearchListener$Mode) {
            AddLinkPresenter addLinkPresenter = AddLinkPresenter.this;
            io.reactivex.rxjava3.disposables.c cVar = addLinkPresenter.c;
            if (cVar != null) {
                cVar.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar2 = addLinkPresenter.j;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            addLinkPresenter.j = null;
            addLinkPresenter.h = str;
            int i = a.$EnumSwitchMapping$0[itemSearch$ItemSearchListener$Mode.ordinal()];
            int i2 = 0;
            int i3 = 1;
            if (i == 1) {
                State state = State.LINK;
                addLinkPresenter.m.clear();
                cm0 cm0Var = addLinkPresenter.e;
                if (cm0Var == null) {
                    cm0Var = null;
                }
                RecyclerPaginatedView recyclerPaginatedView = cm0Var.i;
                if (recyclerPaginatedView == null) {
                    recyclerPaginatedView = null;
                }
                xo2.f(recyclerPaginatedView, true, true, 300L);
                cm0 cm0Var2 = addLinkPresenter.e;
                if (cm0Var2 == null) {
                    cm0Var2 = null;
                }
                cm0Var2.d();
                cm0 cm0Var3 = addLinkPresenter.e;
                if (cm0Var3 == null) {
                    cm0Var3 = null;
                }
                cm0Var3.c(true);
                cm0 cm0Var4 = addLinkPresenter.e;
                if (cm0Var4 == null) {
                    cm0Var4 = null;
                }
                cm0Var4.f(true);
                com.vk.lists.c cVar3 = addLinkPresenter.d;
                (cVar3 != null ? cVar3 : null).p(false);
                return;
            }
            int i4 = 2;
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            State state2 = State.LINK;
            if (addLinkPresenter.h.length() == 0) {
                cm0 cm0Var5 = addLinkPresenter.e;
                if (cm0Var5 == null) {
                    cm0Var5 = null;
                }
                cm0Var5.b(true);
                cm0 cm0Var6 = addLinkPresenter.e;
                if (cm0Var6 == null) {
                    cm0Var6 = null;
                }
                cm0Var6.i(true);
                cm0 cm0Var7 = addLinkPresenter.e;
                if (cm0Var7 == null) {
                    cm0Var7 = null;
                }
                cm0Var7.c(true);
                cm0 cm0Var8 = addLinkPresenter.e;
                (cm0Var8 != null ? cm0Var8 : null).f(true);
                return;
            }
            cm0 cm0Var9 = addLinkPresenter.e;
            if (cm0Var9 == null) {
                cm0Var9 = null;
            }
            cm0Var9.b(true);
            cm0 cm0Var10 = addLinkPresenter.e;
            if (cm0Var10 == null) {
                cm0Var10 = null;
            }
            cm0Var10.d();
            io.reactivex.rxjava3.disposables.c cVar4 = addLinkPresenter.j;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            addLinkPresenter.j = q.B0(300L, TimeUnit.MILLISECONDS).L(new xl0(new wl0(addLinkPresenter, i2), i2), false).subscribe(new ga(new d(addLinkPresenter, i4), i3), new ia(new ha(addLinkPresenter, i3), i4), new ul0(addLinkPresenter, 0));
            String str2 = addLinkPresenter.h;
            wux wuxVar = addLinkPresenter.l;
            if (wuxVar == null) {
                wuxVar = null;
            }
            vux vuxVar = wuxVar.b;
            (vuxVar != null ? vuxVar : null).setSubTitle(str2);
            addLinkPresenter.f.getClass();
        }
    }

    public AddLinkPresenter() {
        UserId.b bVar = UserId.c;
        new qux();
        this.f = new g(BaseItem.Type.LINK);
        this.h = "";
        State state = State.LINK;
        this.i = SourceType.Video;
        this.m = new svx();
        this.n = new b();
        this.o = new c();
    }

    public final void b(String str) {
        io.reactivex.rxjava3.disposables.c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
        int i = 1;
        this.j = rsg0.y0(new u20(str), null, null, 3).subscribe(new y00(new tl0(this, 0), i), new vl0(new s6(this, i), 0));
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }
}

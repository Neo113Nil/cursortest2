package xsna;

import android.util.ArraySet;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.dialogs_list.e;
import com.vk.im.ui.components.dialogs_list.g;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.EmptySet;
import xsna.ih30;

/* compiled from: EventConsumer.kt */
/* loaded from: classes2.dex */
public final class gyp implements io.reactivex.rxjava3.functions.f<sxp> {
    public final com.vk.im.ui.components.dialogs_list.c b;

    /* compiled from: EventConsumer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DialogsCounters.Type.values().length];
            try {
                iArr[DialogsCounters.Type.REQUESTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogsCounters.Type.BUSINESS_NOTIFY_UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogsCounters.Type.ARCHIVE_UNREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DialogsCounters.Type.ARCHIVE_MENTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DialogsCounters.Type.ARCHIVE_UNREAD_UNMUTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DialogsFilter.values().length];
            try {
                iArr2[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public gyp(com.vk.im.ui.components.dialogs_list.c cVar) {
        this.b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.im.ui.components.dialogs_list.c, java.lang.Object, xsna.ok6] */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.vk.im.ui.components.dialogs_list.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.vk.im.ui.components.dialogs_list.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.vk.im.ui.components.dialogs_list.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.vk.im.ui.components.dialogs_list.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.vk.im.ui.components.dialogs_list.c, java.lang.Object, xsna.ok6] */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.vk.im.ui.components.dialogs_list.c, java.lang.Object, xsna.ok6] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.util.ArraySet] */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.util.ArraySet] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v8, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        Throwable th;
        sxp sxpVar2 = sxpVar;
        ?? r2 = this.b;
        com.vk.im.ui.components.dialogs_list.e eVar = r2.h;
        eVar.getClass();
        if (sxpVar2 instanceof m580) {
            m580 m580Var = (m580) sxpVar2;
            boolean z = m580Var.b;
            InfoBar infoBar = m580Var.c;
            if (eVar.z) {
                boolean z2 = infoBar == null;
                boolean z3 = (infoBar == null || infoBar.equals(eVar.u)) ? false : true;
                if (z && (z2 || z3)) {
                    eVar.u = null;
                    r2.B(r2);
                }
            }
        } else if (sxpVar2 instanceof p680) {
            if (eVar.d) {
                r2.E();
                r2.C();
            }
        } else if (sxpVar2 instanceof OnCacheInvalidateEvent) {
            r2.t(sxpVar2);
        } else if (sxpVar2 instanceof g480) {
            r2.t(sxpVar2);
        } else if (sxpVar2 instanceof p980) {
            r2.q((q490) sxpVar2, ((p980) sxpVar2).d.keySet());
        } else if (sxpVar2 instanceof g980) {
            r2.q((q490) sxpVar2, Collections.singletonList(Long.valueOf(((g980) sxpVar2).d)));
        } else if (sxpVar2 instanceof f980) {
            r2.q((q490) sxpVar2, Collections.singletonList(Long.valueOf(((f980) sxpVar2).d)));
        } else if (sxpVar2 instanceof t480) {
            for (adm admVar : ((t480) sxpVar2).b) {
                int i = a.$EnumSwitchMapping$0[admVar.a.ordinal()];
                if (i == 1) {
                    this.b.t(sxpVar2);
                } else if (i == 2) {
                    ?? r4 = this.b;
                    int i2 = admVar.b;
                    com.vk.im.ui.components.dialogs_list.e eVar2 = r4.h;
                    if (!eVar2.y) {
                        eVar2.F = e.a.a(eVar2.F, false, null, new xpp(Integer.valueOf(i2), false), null, null, null, 59);
                        if (((vtm) r4.f()) != null) {
                            r4.B(r4);
                        }
                    }
                } else if (i == 3 || i == 4 || i == 5) {
                    com.vk.im.ui.components.dialogs_list.c cVar = this.b;
                    c0q0 c0q0Var = cVar.s;
                    c0q0Var.getClass();
                    f9w f9wVar = c0q0.h;
                    uh80 uh80Var = new uh80(9);
                    Object[] objArr = {com.vk.im.ui.components.dialogs_list.g.class.getSimpleName()};
                    f9wVar.getClass();
                    f9wVar.debug(new mh3(10, uh80Var, objArr));
                    c0q0.b();
                    c0q0Var.a();
                    if (c0q0Var.d != null && c0q0Var.d.getClass() == com.vk.im.ui.components.dialogs_list.g.class) {
                        c0q0Var.c();
                    }
                    Iterator it = new ArrayList(c0q0Var.b).iterator();
                    while (it.hasNext()) {
                        zzp0<?> zzp0Var = (zzp0) it.next();
                        if (zzp0Var.getClass() == com.vk.im.ui.components.dialogs_list.g.class) {
                            f9w f9wVar2 = c0q0.h;
                            f9wVar2.getClass();
                            f9wVar2.debug(new mh3(10, new uh80(9), new Object[]{zzp0Var}));
                            c0q0.b();
                            c0q0Var.a();
                            if (c0q0Var.d == zzp0Var) {
                                c0q0Var.c();
                            }
                            Iterator it2 = c0q0Var.b.iterator();
                            while (it2.hasNext()) {
                                if (((zzp0) it2.next()) == zzp0Var) {
                                    it2.remove();
                                }
                            }
                            c0q0Var.f();
                        }
                    }
                    g.a aVar = new g.a();
                    aVar.a = cVar;
                    com.vk.im.ui.components.dialogs_list.c cVar2 = aVar.a;
                    if (cVar2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cVar.F(this, new com.vk.im.ui.components.dialogs_list.g(cVar2));
                }
            }
        } else if (sxpVar2 instanceof v480) {
            v480 v480Var = (v480) sxpVar2;
            if (a.$EnumSwitchMapping$1[v480Var.c.ordinal()] == 1) {
                ?? r3 = this.b;
                xpp<Boolean> xppVar = v480Var.d;
                com.vk.im.ui.components.dialogs_list.e eVar3 = r3.h;
                if (!eVar3.y) {
                    eVar3.F = e.a.a(eVar3.F, false, xppVar, null, null, null, null, 61);
                    r3.r(sxpVar2);
                    if (((vtm) r3.f()) != null) {
                        r3.B(r3);
                    }
                }
            }
        } else if (sxpVar2 instanceof e480) {
            Peer peer = ((e480) sxpVar2).c;
            edw edwVar = edw.a;
            edw.c(r2.f, new y4(8, r2, peer));
        } else if ((sxpVar2 instanceof d480) && (th = ((d480) sxpVar2).d) != null && ((vtm) r2.f()) != null) {
            zk70.e(th);
        }
        if ("DialogsListPresenter".equals(sxpVar2.a())) {
            return;
        }
        if (sxpVar2 instanceof i480) {
            com.vk.im.ui.components.dialogs_list.c cVar3 = this.b;
            i480 i480Var = (i480) sxpVar2;
            gkx0 gkx0Var = i480Var.c;
            int i3 = i480Var.d;
            if (cVar3.h.y) {
                return;
            }
            cVar3.F(sxpVar2, new com.vk.im.ui.components.dialogs_list.k(cVar3, gkx0Var, i3, false));
            return;
        }
        if (sxpVar2 instanceof l480) {
            this.b.t(sxpVar2);
            return;
        }
        if (!(sxpVar2 instanceof r480)) {
            if (sxpVar2 instanceof ka80) {
                ?? r22 = this.b;
                ProfilesInfo profilesInfo = ((ka80) sxpVar2).c;
                com.vk.im.ui.components.dialogs_list.e eVar4 = r22.h;
                if (eVar4.y || eVar4.h.Ib(profilesInfo).f()) {
                    return;
                }
                r22.r(r22);
                r22.B(r22);
                return;
            }
            if (sxpVar2 instanceof nc80) {
                ?? r23 = this.b;
                nc80 nc80Var = (nc80) sxpVar2;
                r23.F(r23, new e6o0(r23, nc80Var.c, nc80Var.d));
                return;
            } else {
                if (sxpVar2 instanceof oc80) {
                    ?? r24 = this.b;
                    oc80 oc80Var = (oc80) sxpVar2;
                    r24.F(r24, new f6o0(r24, oc80Var.c, oc80Var.d));
                    return;
                }
                return;
            }
        }
        ?? r25 = this.b;
        wpp<Long, Dialog> wppVar = ((r480) sxpVar2).c;
        com.vk.im.ui.components.dialogs_list.e eVar5 = r25.h;
        if (eVar5.y) {
            return;
        }
        DialogsHistory dialogsHistory = eVar5.g;
        ArraySet k = wppVar.k();
        dialogsHistory.getClass();
        Iterator it3 = k.iterator();
        ?? r6 = 0;
        while (it3.hasNext()) {
            long longValue = ((Number) it3.next()).longValue();
            if (dialogsHistory.l(longValue)) {
                if (r6 == 0) {
                    r6 = new ArraySet();
                }
                r6.add(Long.valueOf(longValue));
            }
        }
        if (r6 == 0) {
            r6 = EmptySet.b;
        }
        if (r6.isEmpty()) {
            ImFeatures imFeatures = ImFeatures.VKM_DIALOGS_NONEXPIRED_FIX;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures)) {
                r25.t(r25);
                return;
            }
            return;
        }
        ProfilesSimpleInfo Ob = eVar5.h.Ob();
        DialogsHistory dialogsHistory2 = eVar5.g;
        dialogsHistory2.B(wppVar);
        for (Dialog dialog : wppVar.c.values()) {
            Msg msg = dialogsHistory2.s().get(dialog.Sb());
            if (msg != null) {
                LinkedHashMap linkedHashMap = eVar5.i;
                Long Sb = dialog.Sb();
                ih30.a aVar2 = ih30.a;
                linkedHashMap.put(Sb, ih30.b(msg, dialog, Ob, eVar5.f));
            }
        }
        DialogsHistory dialogsHistory3 = eVar5.g;
        DialogsFilter dialogsFilter = r25.i;
        dialogsHistory3.getClass();
        if (DialogsHistory.a.$EnumSwitchMapping$0[dialogsFilter.ordinal()] == 1) {
            Iterator<Dialog> it4 = dialogsHistory3.k().iterator();
            while (it4.hasNext()) {
                Dialog next = it4.next();
                if (!next.Qb()) {
                    it4.remove();
                    dialogsHistory3.d().remove(next.Sb());
                }
            }
        }
        r25.B(r25);
        r25.r(r25);
    }
}

package xsna;

import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.engine.models.account.PrivacySetting;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: StorageTriggerFactoryImpl.kt */
/* loaded from: classes.dex */
public final class eil0 implements dil0 {
    public final fil0 a;
    public final Object b = pn00.k(new Pair(com.vk.im.engine.models.dialogs.d.class, new eia(this, 7)), new Pair(com.vk.im.engine.models.dialogs.b.class, new rb8(this, 6)), new Pair(AccountInfo.class, new sb8(this, 8)), new Pair(oo8.class, new tb8(this, 8)), new Pair(PrivacySetting.class, new ub8(this, 5)), new Pair(DialogBackground.class, new n03(this, 5)), new Pair(DialogTheme.class, new vb8(this, 5)));

    /* compiled from: StorageTriggerFactoryImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a implements cil0<AccountInfo> {
        public final fil0 a;

        public a(fil0 fil0Var) {
            this.a = fil0Var;
        }

        @Override // xsna.cil0
        public final void b(AccountInfo accountInfo, AccountInfo accountInfo2) {
            super.b(accountInfo, accountInfo2);
        }

        @Override // xsna.cil0
        public final void c(Collection<? extends hhl0<? extends AccountInfo>> collection) {
            fil0 fil0Var = this.a;
            if (fil0Var.a()) {
                fil0Var.d.b(hg1.i(new io.reactivex.rxjava3.internal.operators.single.v(new cwk(fil0Var, 2)).q(asu0.a.c()), new qjg0(fil0Var, 4)));
            }
        }
    }

    /* compiled from: StorageTriggerFactoryImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b implements cil0<oo8> {
        public final fil0 a;

        public b(fil0 fil0Var) {
            this.a = fil0Var;
        }

        @Override // xsna.cil0
        public final void b(oo8 oo8Var, oo8 oo8Var2) {
            super.b(oo8Var, oo8Var2);
        }

        @Override // xsna.cil0
        public final void c(Collection<? extends hhl0<? extends oo8>> collection) {
            DialogsFilter dialogsFilter = DialogsFilter.BUSINESS_NOTIFY;
            fil0 fil0Var = this.a;
            if (fil0Var.a()) {
                fil0Var.d.b(hg1.i(new io.reactivex.rxjava3.internal.operators.single.v(new ewk(2, fil0Var, dialogsFilter)).q(asu0.a.c()), new wqb(20, fil0Var, dialogsFilter)));
            }
        }
    }

    /* compiled from: StorageTriggerFactoryImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c implements cil0<DialogBackground> {
        public final fil0 a;

        public c(fil0 fil0Var) {
            this.a = fil0Var;
        }

        @Override // xsna.cil0
        public final void b(DialogBackground dialogBackground, DialogBackground dialogBackground2) {
            super.b(dialogBackground, dialogBackground2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.cil0
        public final void c(Collection<? extends hhl0<? extends DialogBackground>> collection) {
            DialogBackground dialogBackground;
            hhl0 hhl0Var = (hhl0) j5g.Z(collection);
            if (hhl0Var == null || (dialogBackground = (DialogBackground) hhl0Var.b) == null) {
                dialogBackground = DialogBackground.e;
            }
            fil0 fil0Var = this.a;
            fil0Var.a.e1(fil0Var, new f480(fil0Var, dialogBackground));
        }
    }

    /* compiled from: StorageTriggerFactoryImpl.kt */
    /* loaded from: classes2.dex */
    public static final class d implements cil0<com.vk.im.engine.models.dialogs.b> {
        public final fil0 a;

        public d(fil0 fil0Var) {
            this.a = fil0Var;
        }

        @Override // xsna.cil0
        public final void b(com.vk.im.engine.models.dialogs.b bVar, com.vk.im.engine.models.dialogs.b bVar2) {
            super.b(bVar, bVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.cil0
        public final void c(Collection<? extends hhl0<? extends com.vk.im.engine.models.dialogs.b>> collection) {
            boolean z;
            boolean z2;
            MsgRequestStatus msgRequestStatus;
            MsgRequestStatus msgRequestStatus2;
            Collection<? extends hhl0<? extends com.vk.im.engine.models.dialogs.b>> collection2 = collection;
            Collection<? extends hhl0<? extends com.vk.im.engine.models.dialogs.b>> collection3 = collection2;
            boolean z3 = true;
            if (!collection3.isEmpty()) {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    hhl0 hhl0Var = (hhl0) it.next();
                    T t = hhl0Var.a;
                    T t2 = hhl0Var.b;
                    if (t != 0) {
                        com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) t;
                        int i = bVar.j;
                        boolean z4 = i > 0 && ((com.vk.im.engine.models.dialogs.b) t2).j == 0;
                        int i2 = bVar.l;
                        boolean z5 = i2 > 0 && ((com.vk.im.engine.models.dialogs.b) t2).l == 0;
                        com.vk.im.engine.models.dialogs.b bVar2 = (com.vk.im.engine.models.dialogs.b) t2;
                        if (bVar2.k <= bVar2.g) {
                            if (z4 && i2 > 0) {
                                z = true;
                                break;
                            }
                        } else if (z5 && i > 0) {
                            z = true;
                            break;
                        }
                    } else {
                        com.vk.im.engine.models.dialogs.b bVar3 = (com.vk.im.engine.models.dialogs.b) t2;
                        if (bVar3.j != 0 && bVar3.l != 0) {
                        }
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!collection3.isEmpty()) {
                Iterator<T> it2 = collection2.iterator();
                while (it2.hasNext()) {
                    hhl0 hhl0Var2 = (hhl0) it2.next();
                    com.vk.im.engine.models.dialogs.b bVar4 = (com.vk.im.engine.models.dialogs.b) hhl0Var2.a;
                    com.vk.im.engine.models.dialogs.b bVar5 = (com.vk.im.engine.models.dialogs.b) hhl0Var2.b;
                    if (bVar4 == null || bVar4.R != bVar5.R) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!collection3.isEmpty()) {
                Iterator<T> it3 = collection2.iterator();
                while (it3.hasNext()) {
                    hhl0 hhl0Var3 = (hhl0) it3.next();
                    com.vk.im.engine.models.dialogs.b bVar6 = (com.vk.im.engine.models.dialogs.b) hhl0Var3.a;
                    com.vk.im.engine.models.dialogs.b bVar7 = (com.vk.im.engine.models.dialogs.b) hhl0Var3.b;
                    if (bVar6 != null && (bVar6.m != bVar7.m || !epx.f(bVar6.n, bVar7.n))) {
                        break;
                    }
                }
            }
            z3 = false;
            fil0 fil0Var = this.a;
            if (z || z3 || z2) {
                if (z2) {
                    fil0Var.c(e43.l(DialogsCounters.Type.UNREAD, DialogsCounters.Type.ARCHIVE_UNREAD, DialogsCounters.Type.ARCHIVE_MENTIONS, DialogsCounters.Type.ARCHIVE_UNREAD_UNMUTED));
                } else {
                    fil0Var.b(DialogsCounters.Type.UNREAD);
                }
            }
            if (!collection3.isEmpty()) {
                Iterator<T> it4 = collection2.iterator();
                while (it4.hasNext()) {
                    hhl0 hhl0Var4 = (hhl0) it4.next();
                    com.vk.im.engine.models.dialogs.b bVar8 = (com.vk.im.engine.models.dialogs.b) hhl0Var4.a;
                    com.vk.im.engine.models.dialogs.b bVar9 = (com.vk.im.engine.models.dialogs.b) hhl0Var4.b;
                    if (bVar8 == null || (msgRequestStatus2 = bVar8.I) == null) {
                        msgRequestStatus2 = bVar8 != null ? bVar8.F : null;
                    }
                    MsgRequestStatus msgRequestStatus3 = bVar9.I;
                    if (msgRequestStatus3 == null) {
                        msgRequestStatus3 = bVar9.F;
                    }
                    if (msgRequestStatus2 != null) {
                        MsgRequestStatus msgRequestStatus4 = MsgRequestStatus.PENDING;
                        if (msgRequestStatus2 == msgRequestStatus4) {
                            msgRequestStatus3.getClass();
                            if (msgRequestStatus3 != msgRequestStatus4) {
                            }
                        }
                        msgRequestStatus3.getClass();
                        if (msgRequestStatus3 == msgRequestStatus4) {
                        }
                    }
                    fil0Var.b(DialogsCounters.Type.REQUESTS);
                }
            }
            Iterator<T> it5 = collection2.iterator();
            while (it5.hasNext()) {
                hhl0 hhl0Var5 = (hhl0) it5.next();
                com.vk.im.engine.models.dialogs.b bVar10 = (com.vk.im.engine.models.dialogs.b) hhl0Var5.a;
                com.vk.im.engine.models.dialogs.b bVar11 = (com.vk.im.engine.models.dialogs.b) hhl0Var5.b;
                if (bVar10 == null || (msgRequestStatus = bVar10.I) == null) {
                    msgRequestStatus = bVar10 != null ? bVar10.F : null;
                }
                MsgRequestStatus msgRequestStatus5 = bVar11.I;
                long j = bVar11.b;
                com.vk.im.engine.models.dialogs.c cVar = bVar11.C;
                if (msgRequestStatus5 == null) {
                    msgRequestStatus5 = bVar11.F;
                }
                if (msgRequestStatus != null && msgRequestStatus != msgRequestStatus5) {
                    fil0Var.a.e1(fil0Var, new j980(j, msgRequestStatus, msgRequestStatus5));
                }
                if (!epx.f(bVar10 != null ? bVar10.C : null, cVar)) {
                    fil0Var.a.e1(fil0Var, new m480(j, cVar, fil0Var));
                }
            }
        }
    }

    /* compiled from: StorageTriggerFactoryImpl.kt */
    /* loaded from: classes2.dex */
    public static final class e implements cil0<DialogTheme> {
        public final fil0 a;

        public e(fil0 fil0Var) {
            this.a = fil0Var;
        }

        @Override // xsna.cil0
        public final void b(DialogTheme dialogTheme, DialogTheme dialogTheme2) {
            super.b(dialogTheme, dialogTheme2);
        }

        @Override // xsna.cil0
        public final void c(Collection<? extends hhl0<? extends DialogTheme>> collection) {
            fil0 fil0Var = this.a;
            fil0Var.a.e1(fil0Var, new n480(fil0Var));
        }
    }

    /* compiled from: StorageTriggerFactoryImpl.kt */
    /* loaded from: classes2.dex */
    public static final class f implements cil0<com.vk.im.engine.models.dialogs.d> {
        public final fil0 a;

        public f(fil0 fil0Var) {
            this.a = fil0Var;
        }

        @Override // xsna.cil0
        public final void b(com.vk.im.engine.models.dialogs.d dVar, com.vk.im.engine.models.dialogs.d dVar2) {
            super.b(dVar, dVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.cil0
        public final void c(Collection<? extends hhl0<? extends com.vk.im.engine.models.dialogs.d>> collection) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                hashSet.add(((com.vk.im.engine.models.dialogs.d) ((hhl0) it.next()).b).a);
            }
            this.a.c(hashSet);
        }
    }

    /* compiled from: StorageTriggerFactoryImpl.kt */
    /* loaded from: classes2.dex */
    public static final class g implements cil0<PrivacySetting> {
        public final fil0 a;

        public g(fil0 fil0Var) {
            this.a = fil0Var;
        }

        @Override // xsna.cil0
        public final void b(PrivacySetting privacySetting, PrivacySetting privacySetting2) {
            super.b(privacySetting, privacySetting2);
        }

        @Override // xsna.cil0
        public final void c(Collection<? extends hhl0<? extends PrivacySetting>> collection) {
            fil0 fil0Var = this.a;
            fil0Var.a.J0(fil0Var, new o9q());
        }
    }

    public eil0(fil0 fil0Var) {
        this.a = fil0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.dil0
    public final <T> cil0<T> a(Class<T> cls) {
        gzs gzsVar = (gzs) this.b.get(cls);
        cil0<T> cil0Var = gzsVar != null ? (cil0) gzsVar.invoke() : null;
        if (cil0Var != null) {
            return cil0Var;
        }
        return null;
    }
}

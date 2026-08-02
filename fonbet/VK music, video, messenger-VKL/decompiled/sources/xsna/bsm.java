package xsna;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.ui.views.DialogListInfoBarView;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.im.ui.views.dialogs.DialogMentionMarkerView;
import com.vk.im.ui.views.dialogs.DialogSkeletonView;
import com.vk.im.ui.views.dialogs.DialogsGroupItemView;
import com.vk.pullfromtopofrecycler.PullFromTopMode;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.err0;
import xsna.evr0;
import xsna.msm;
import xsna.tqr0;

/* compiled from: DialogsListAdapter.kt */
/* loaded from: classes2.dex */
public final class bsm extends ixm<ogm, RecyclerView.e0> {
    public final LayoutInflater e;
    public final com.vk.im.engine.models.c f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public lj0 p;

    /* compiled from: DialogsListAdapter.kt */
    public static abstract class a {
        public final WeakReference<bsm> b;

        public a(bsm bsmVar) {
            this.b = new WeakReference<>(bsmVar);
        }

        public final hj0 e() {
            bsm bsmVar = this.b.get();
            if (bsmVar != null) {
                return bsmVar.p;
            }
            return null;
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public static final class b extends m.e<ogm> {
        public final Object a = new Object();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(ogm ogmVar, ogm ogmVar2) {
            return ogmVar.equals(ogmVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(ogm ogmVar, ogm ogmVar2) {
            return epx.f(ogmVar.getItemId(), ogmVar2.getItemId());
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(ogm ogmVar, ogm ogmVar2) {
            return this.a;
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public static final class c extends a implements izs<msm, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(msm msmVar) {
            xtm xtmVar;
            msm msmVar2 = msmVar;
            hj0 e = e();
            if (e != null && (xtmVar = ((lj0) e).a.F) != null) {
                xtmVar.g(msmVar2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public final class d extends a implements err0.a {
        public d() {
            throw null;
        }

        @Override // xsna.err0.a
        public final void c() {
            hj0 e = e();
            if (e != null) {
                msm.a aVar = msm.a.a;
                xtm xtmVar = ((lj0) e).a.F;
                if (xtmVar != null) {
                    xtmVar.g(aVar);
                }
            }
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public static final class e extends a implements tqr0.a {
        @Override // xsna.tqr0.a
        public final void d() {
            xtm xtmVar;
            hj0 e = e();
            if (e == null || (xtmVar = ((lj0) e).a.F) == null) {
                return;
            }
            xtmVar.e();
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public static final class f extends a implements wzs<InfoBar, InfoBar.Button, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(InfoBar infoBar, InfoBar.Button button) {
            xtm xtmVar;
            InfoBar infoBar2 = infoBar;
            InfoBar.Button button2 = button;
            hj0 e = e();
            if (e != null && (xtmVar = ((lj0) e).a.F) != null) {
                xtmVar.d(infoBar2, button2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public static final class g extends a implements izs<InfoBar, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(InfoBar infoBar) {
            xtm xtmVar;
            InfoBar infoBar2 = infoBar;
            hj0 e = e();
            if (e != null && (xtmVar = ((lj0) e).a.F) != null) {
                xtmVar.a(infoBar2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public final class h extends a {
        public h() {
            throw null;
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public static final class i extends a {
        public final void g() {
            hj0 e = e();
            if (e != null) {
                DialogsFilter dialogsFilter = DialogsFilter.BUSINESS_NOTIFY;
                vtm vtmVar = ((lj0) e).a;
                DialogsFilterChangeSource dialogsFilterChangeSource = DialogsFilterChangeSource.LIST_WITH_ITEMS;
                xtm xtmVar = vtmVar.F;
                if (xtmVar != null) {
                    xtmVar.b(dialogsFilter, dialogsFilterChangeSource);
                }
            }
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public static final class j extends a {
        public final void g() {
            hj0 e = e();
            if (e != null) {
                DialogsFilter dialogsFilter = DialogsFilter.REQUESTS;
                vtm vtmVar = ((lj0) e).a;
                DialogsFilterChangeSource dialogsFilterChangeSource = DialogsFilterChangeSource.LIST_WITH_ITEMS;
                xtm xtmVar = vtmVar.F;
                if (xtmVar != null) {
                    xtmVar.b(dialogsFilter, dialogsFilterChangeSource);
                }
            }
        }
    }

    /* compiled from: DialogsListAdapter.kt */
    public static final class k extends a implements evr0.a {
        @Override // xsna.evr0.a
        public final void a() {
            xtm xtmVar;
            hj0 e = e();
            if (e == null || (xtmVar = ((lj0) e).a.F) == null) {
                return;
            }
            xtmVar.n();
        }
    }

    public bsm(LayoutInflater layoutInflater, com.vk.im.engine.models.c cVar) {
        super(new b());
        this.e = layoutInflater;
        this.f = cVar;
        wnh wnhVar = new wnh(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, wnhVar);
        this.h = msy.a(lazyThreadSafetyMode, new sim(this, 1));
        this.i = msy.a(lazyThreadSafetyMode, new bu1(this, 28));
        this.j = msy.a(lazyThreadSafetyMode, new tbh(this, 8));
        this.k = msy.a(lazyThreadSafetyMode, new mxj(this, 1));
        this.l = msy.a(lazyThreadSafetyMode, new u3k(this, 2));
        this.m = msy.a(lazyThreadSafetyMode, new n5i(this, 6));
        int i2 = 8;
        this.n = msy.a(lazyThreadSafetyMode, new g4g(this, i2));
        this.o = msy.a(lazyThreadSafetyMode, new drg(this, i2));
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i2) {
        return getItem(i2).getItemId().longValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i2) {
        return getItem(i2).Za();
    }

    /* JADX WARN: Code restructure failed: missing block: B:314:0x05a4, code lost:
    
        if (r5.rc() == false) goto L438;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026a  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v286, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v289, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v301, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v321, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i2) {
        boolean z;
        ProfilesSimpleInfo profilesSimpleInfo;
        ProfilesSimpleInfo profilesSimpleInfo2;
        Dialog dialog;
        OnlineInfo mb;
        Dialog dialog2;
        ProfilesSimpleInfo profilesSimpleInfo3;
        boolean z2;
        agm agmVar;
        boolean z3;
        agm agmVar2;
        boolean z4;
        agm agmVar3;
        agm agmVar4;
        boolean z5;
        Msg msg;
        Dialog dialog3;
        boolean z6;
        Dialog dialog4;
        DialogItemView.ExtraIcon extraIcon;
        Dialog dialog5;
        boolean z7;
        Dialog dialog6;
        long longValue;
        MsgReadAsLastData f2;
        MsgReadAsLastData g2;
        agm agmVar5;
        Dialog dialog7;
        ProfilesSimpleInfo profilesSimpleInfo4;
        Dialog dialog8;
        agm agmVar6;
        ProfilesSimpleInfo profilesSimpleInfo5;
        Dialog dialog9;
        ImageStatus E5;
        boolean z8;
        Dialog dialog10;
        agm agmVar7;
        boolean z9;
        ProfilesSimpleInfo profilesSimpleInfo6;
        Dialog dialog11;
        qtd0 zb;
        ProfilesSimpleInfo profilesSimpleInfo7;
        Dialog dialog12;
        qtd0 zb2;
        Dialog dialog13;
        agm agmVar8;
        agm agmVar9;
        Dialog dialog14;
        String str;
        List<Long> list;
        int itemViewType = getItemViewType(i2);
        if (itemViewType != 1) {
            ?? r4 = this.i;
            if (itemViewType == 12) {
                bvr0 bvr0Var = (bvr0) e0Var;
                bvr0Var.m.setCounter(((tv30) getItem(i2)).b);
                j jVar = (j) r4.getValue();
                if (jVar == null) {
                    bvr0Var.itemView.setOnClickListener(null);
                    return;
                } else {
                    bwt0.i0(bvr0Var.itemView, new wgm0(jVar, 11));
                    return;
                }
            }
            ?? r1 = this.j;
            switch (itemViewType) {
                case 14:
                    ro8 ro8Var = (ro8) getItem(i2);
                    oqr0 oqr0Var = (oqr0) e0Var;
                    int i3 = ro8Var.b;
                    boolean z10 = ro8Var.c;
                    oqr0Var.m.setCounter(i3);
                    oqr0Var.l = z10 ? PullFromTopMode.DEFAULT : PullFromTopMode.ALWAYS_VISIBLE;
                    oqr0Var.n = (i) r1.getValue();
                    break;
                case 15:
                    InfoBar infoBar = ((jvw) getItem(i2)).b;
                    f fVar = (f) this.l.getValue();
                    g gVar = (g) this.m.getValue();
                    DialogListInfoBarView dialogListInfoBarView = ((urr0) e0Var).l;
                    dialogListInfoBarView.setFromBar(infoBar);
                    dialogListInfoBarView.setOnButtonClickListener(fVar);
                    dialogListInfoBarView.setOnHideCloseListener(gVar);
                    break;
                case 16:
                    bwt0.i0(((tqr0) e0Var).itemView, new wgm0((e) this.g.getValue(), 10));
                    break;
                case 17:
                    k kVar = (k) this.h.getValue();
                    RoundedSearchView roundedSearchView = ((evr0) e0Var).l;
                    bwt0.i0(roundedSearchView, new q8i0(kVar, 19));
                    roundedSearchView.setOnActionSearchQueryClick(new a06(kVar, 13));
                    break;
                case 18:
                    wd80 wd80Var = (wd80) getItem(i2);
                    ((sur0) e0Var).V5(wd80Var.b, wd80Var.c, wd80Var.d, (c) this.n.getValue());
                    break;
                default:
                    switch (itemViewType) {
                        case 20:
                            gqr0 gqr0Var = (gqr0) e0Var;
                            ih3 ih3Var = (ih3) getItem(i2);
                            int i4 = ih3Var.b;
                            boolean z11 = ih3Var.c;
                            boolean z12 = ih3Var.d;
                            DialogsGroupItemView dialogsGroupItemView = gqr0Var.m;
                            dialogsGroupItemView.setCounter(i4);
                            DialogMentionMarkerView dialogMentionMarkerView = dialogsGroupItemView.b;
                            bwt0.p0(dialogMentionMarkerView, z11);
                            dialogMentionMarkerView.setMuted(true);
                            gqr0Var.l = z12 ? PullFromTopMode.DEFAULT : PullFromTopMode.ALWAYS_VISIBLE;
                            gqr0Var.n = (h) this.k.getValue();
                            break;
                        case 21:
                            kvr0 kvr0Var = (kvr0) e0Var;
                            kvr0Var.l.setText(enj.f(R.plurals.vkim_dialogs_list_empty_shared_chats_count, ((w9j0) getItem(i2)).b, kvr0Var.itemView.getContext()));
                            break;
                        case 22:
                            jvr0 jvr0Var = (jvr0) e0Var;
                            v9j0 v9j0Var = (v9j0) getItem(i2);
                            Dialog dialog15 = v9j0Var.d;
                            jvr0Var.m = dialog15;
                            ProfilesSimpleInfo profilesSimpleInfo8 = v9j0Var.e;
                            jvr0Var.n = profilesSimpleInfo8;
                            jvr0Var.q.X0(dialog15, profilesSimpleInfo8);
                            jvr0Var.o.setText(v9j0Var.b);
                            jvr0Var.p.setText(v9j0Var.c);
                            break;
                        case 23:
                            so8 so8Var = (so8) getItem(i2);
                            nqr0 nqr0Var = (nqr0) e0Var;
                            nqr0Var.V5(so8Var.b, so8Var.d, so8Var.c);
                            nqr0Var.o = (i) r1.getValue();
                            break;
                        case 24:
                            avr0 avr0Var = (avr0) e0Var;
                            uv30 uv30Var = (uv30) getItem(i2);
                            avr0Var.V5(uv30Var.b, uv30Var.d, uv30Var.c);
                            avr0Var.o = (j) r4.getValue();
                            break;
                        case 25:
                            jjc.g(((err0) e0Var).itemView, new ap30((d) this.o.getValue(), 27));
                            break;
                        case 26:
                            xur0 xur0Var = (xur0) e0Var;
                            xur0Var.W5((k5e0) getItem(i2));
                            xur0Var.m = this.p;
                            break;
                    }
            }
            return;
        }
        yqr0 yqr0Var = (yqr0) e0Var;
        agm agmVar10 = (agm) getItem(i2);
        V v = yqr0Var.l;
        en30 en30Var = yqr0Var.r;
        SpannableStringBuilder spannableStringBuilder = yqr0Var.u;
        Dialog dialog16 = agmVar10.b;
        if (yqr0Var.x != null) {
            long longValue2 = dialog16.Sb().longValue();
            agm agmVar11 = yqr0Var.x;
            if (agmVar11 == null) {
                agmVar11 = null;
            }
            if (longValue2 == agmVar11.b.Sb().longValue()) {
                z = true;
                yqr0Var.x = agmVar10;
                yqr0Var.m = dialog16;
                profilesSimpleInfo = agmVar10.f;
                yqr0Var.n = profilesSimpleInfo;
                yqr0Var.y = agmVar10.i;
                yqr0Var.z = agmVar10.c;
                DialogItemView dialogItemView = (DialogItemView) v;
                if (dialog16 == null) {
                    dialog16 = null;
                }
                if (profilesSimpleInfo == null) {
                    profilesSimpleInfo = null;
                }
                dialogItemView.g(dialog16, profilesSimpleInfo);
                profilesSimpleInfo2 = yqr0Var.n;
                if (profilesSimpleInfo2 == null) {
                    profilesSimpleInfo2 = null;
                }
                dialog = yqr0Var.m;
                if (dialog == null) {
                    dialog = null;
                }
                qtd0 Ab = profilesSimpleInfo2.Ab(dialog.Sb());
                mb = Ab == null ? Ab.mb() : null;
                if (mb != null) {
                    Dialog dialog17 = yqr0Var.m;
                    if (dialog17 == null) {
                        dialog17 = null;
                    }
                    if (!dialog17.Jc() && !mb.Ab()) {
                        VisibleStatus zb3 = mb.zb();
                        if (zb3 != null) {
                            Platform platform = zb3.e;
                            if (platform == Platform.MOBILE || platform == Platform.WEB) {
                                dialogItemView.l();
                            } else {
                                dialogItemView.o();
                            }
                        }
                        dialog2 = yqr0Var.m;
                        if (dialog2 == null) {
                            dialog2 = null;
                        }
                        profilesSimpleInfo3 = yqr0Var.n;
                        if (profilesSimpleInfo3 == null) {
                            profilesSimpleInfo3 = null;
                        }
                        qtd0 Ab2 = profilesSimpleInfo3.Ab(dialog2.Sb());
                        boolean Jc = dialog2.Jc();
                        GroupCallInProgress Ob = dialog2.Ob();
                        z2 = Ob != null;
                        boolean z13 = Ob == null && (list = Ob.b) != null && (list.isEmpty() ^ true);
                        if (z2) {
                            dialogItemView.setSpecialStatusCall(z13);
                        } else {
                            agm agmVar12 = yqr0Var.x;
                            if (agmVar12 == null) {
                                agmVar12 = null;
                            }
                            if (!agmVar12.o || Ab2 == null || Ab2.ka() || !qv20.k(Ab2) || Jc) {
                                dialogItemView.n();
                            } else {
                                dialogItemView.m();
                            }
                        }
                        agmVar = yqr0Var.x;
                        if (agmVar == null) {
                            agmVar = null;
                        }
                        if (agmVar.p) {
                            Dialog dialog18 = yqr0Var.m;
                            if (dialog18 == null) {
                                dialog18 = null;
                            }
                            if (dialog18.Ic()) {
                                Dialog dialog19 = yqr0Var.m;
                                if (dialog19 == null) {
                                    dialog19 = null;
                                }
                                if (dialog19.Xb().k()) {
                                    Dialog dialog20 = yqr0Var.m;
                                    if (dialog20 == null) {
                                        dialog20 = null;
                                    }
                                    dialogItemView.setUnreadInMuted(!yqr0.a6(dialog20));
                                    Dialog dialog21 = yqr0Var.m;
                                    if (dialog21 == null) {
                                        dialog21 = null;
                                    }
                                    if (dialog21.Jb() > 0) {
                                        Dialog dialog22 = yqr0Var.m;
                                        if (dialog22 == null) {
                                            dialog22 = null;
                                        }
                                        dialogItemView.r(dialog22.Jb(), z);
                                    } else {
                                        dialogItemView.t();
                                    }
                                    dialogItemView.setUnreadOutVisible(false);
                                    dialogItemView.setReadOutVisible(false);
                                    dialogItemView.setSendingVisible(false);
                                    dialogItemView.setErrorVisible(false);
                                    dialog3 = yqr0Var.m;
                                    if (dialog3 == null) {
                                        dialog3 = null;
                                    }
                                    if (dialog3.T8()) {
                                        Dialog dialog23 = yqr0Var.m;
                                        if (dialog23 == null) {
                                            dialog23 = null;
                                        }
                                        if (!dialog23.mc().isEmpty()) {
                                            Dialog dialog24 = yqr0Var.m;
                                            if (dialog24 == null) {
                                                dialog24 = null;
                                            }
                                            if (dialog24.lc().isEmpty()) {
                                                Dialog dialog25 = yqr0Var.m;
                                                if (dialog25 == null) {
                                                    dialog25 = null;
                                                }
                                                if (dialog25.Lb().isEmpty()) {
                                                    z6 = true;
                                                    dialog4 = yqr0Var.m;
                                                    if (dialog4 == null) {
                                                        dialog4 = null;
                                                    }
                                                    dialogItemView.v(z6, !yqr0.a6(dialog4));
                                                    if (yqr0Var.B) {
                                                        yqr0Var.W5();
                                                    }
                                                    if (yqr0Var.B) {
                                                        Dialog dialog26 = yqr0Var.m;
                                                        if (dialog26 == null) {
                                                            dialog26 = null;
                                                        }
                                                        if (dialog26.Lb().isEmpty()) {
                                                            Dialog dialog27 = yqr0Var.m;
                                                            if (dialog27 == null) {
                                                                dialog27 = null;
                                                            }
                                                            if (dialog27.lc().isEmpty()) {
                                                                agm agmVar13 = yqr0Var.x;
                                                                if (agmVar13 == null) {
                                                                    agmVar13 = null;
                                                                }
                                                                if (agmVar13.m) {
                                                                    Dialog dialog28 = yqr0Var.m;
                                                                    if (dialog28 == null) {
                                                                        dialog28 = null;
                                                                    }
                                                                    if (dialog28.Bc() && dialogItemView.c()) {
                                                                        agm agmVar14 = yqr0Var.x;
                                                                        if (agmVar14 == null) {
                                                                            agmVar14 = null;
                                                                        }
                                                                        if (!agmVar14.u) {
                                                                            extraIcon = DialogItemView.ExtraIcon.PIN;
                                                                        }
                                                                    }
                                                                }
                                                                extraIcon = DialogItemView.ExtraIcon.NONE;
                                                            } else {
                                                                extraIcon = DialogItemView.ExtraIcon.MENTION;
                                                            }
                                                        } else {
                                                            extraIcon = DialogItemView.ExtraIcon.BOMB;
                                                        }
                                                    } else {
                                                        extraIcon = DialogItemView.ExtraIcon.DRAG;
                                                    }
                                                    dialog5 = yqr0Var.m;
                                                    if (dialog5 == null) {
                                                        dialog5 = null;
                                                    }
                                                    dialogItemView.j(extraIcon, !yqr0.a6(dialog5));
                                                    if (!dialogItemView.d() && dialogItemView.c()) {
                                                        agmVar5 = yqr0Var.x;
                                                        if (agmVar5 == null) {
                                                            agmVar5 = null;
                                                        }
                                                        if (agmVar5.u) {
                                                            z7 = true;
                                                            dialogItemView.setReplyButtonInStatus(z7);
                                                            dialog6 = yqr0Var.m;
                                                            if (dialog6 == null) {
                                                                dialog6 = null;
                                                            }
                                                            longValue = dialog6.Sb().longValue();
                                                            yqr0Var.w.getClass();
                                                            f2 = cew.f(longValue);
                                                            if (f2 != null && z7 && !f2.c) {
                                                                yqr0Var.v.i(longValue, f2.e.i());
                                                                g2 = cew.g(cew.h(), longValue);
                                                                if (g2 != null) {
                                                                    cew.k(cew.h(), longValue, MsgReadAsLastData.a(g2));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z7 = false;
                                                    dialogItemView.setReplyButtonInStatus(z7);
                                                    dialog6 = yqr0Var.m;
                                                    if (dialog6 == null) {
                                                    }
                                                    longValue = dialog6.Sb().longValue();
                                                    yqr0Var.w.getClass();
                                                    f2 = cew.f(longValue);
                                                    if (f2 != null) {
                                                        yqr0Var.v.i(longValue, f2.e.i());
                                                        g2 = cew.g(cew.h(), longValue);
                                                        if (g2 != null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z6 = false;
                                    dialog4 = yqr0Var.m;
                                    if (dialog4 == null) {
                                    }
                                    dialogItemView.v(z6, !yqr0.a6(dialog4));
                                    if (yqr0Var.B) {
                                    }
                                    if (yqr0Var.B) {
                                    }
                                    dialog5 = yqr0Var.m;
                                    if (dialog5 == null) {
                                    }
                                    dialogItemView.j(extraIcon, !yqr0.a6(dialog5));
                                    if (!dialogItemView.d()) {
                                        agmVar5 = yqr0Var.x;
                                        if (agmVar5 == null) {
                                        }
                                        if (agmVar5.u) {
                                        }
                                    }
                                    z7 = false;
                                    dialogItemView.setReplyButtonInStatus(z7);
                                    dialog6 = yqr0Var.m;
                                    if (dialog6 == null) {
                                    }
                                    longValue = dialog6.Sb().longValue();
                                    yqr0Var.w.getClass();
                                    f2 = cew.f(longValue);
                                    if (f2 != null) {
                                    }
                                }
                            }
                            dialogItemView.u();
                            agm agmVar15 = yqr0Var.x;
                            if (!(agmVar15 == null ? null : agmVar15).h) {
                                if (agmVar15 == null) {
                                    agmVar15 = null;
                                }
                                if (!agmVar15.g) {
                                    Dialog dialog29 = yqr0Var.m;
                                    if (dialog29 == null) {
                                        dialog29 = null;
                                    }
                                    if (dialog29.Rb()) {
                                        z3 = true;
                                        dialogItemView.setUnreadOutVisible(z3);
                                        agmVar2 = yqr0Var.x;
                                        if (!(agmVar2 != null ? null : agmVar2).h) {
                                            if (agmVar2 == null) {
                                                agmVar2 = null;
                                            }
                                            if (agmVar2.g) {
                                                z4 = true;
                                                dialogItemView.setSendingVisible(z4);
                                                agmVar3 = yqr0Var.x;
                                                if (agmVar3 == null) {
                                                    agmVar3 = null;
                                                }
                                                dialogItemView.setErrorVisible(agmVar3.h);
                                                agmVar4 = yqr0Var.x;
                                                if (!(agmVar4 == null ? null : agmVar4).h) {
                                                    if (agmVar4 == null) {
                                                        agmVar4 = null;
                                                    }
                                                    if (!agmVar4.g) {
                                                        Dialog dialog30 = yqr0Var.m;
                                                        if (dialog30 == null) {
                                                            dialog30 = null;
                                                        }
                                                        if (!dialog30.Bc() && (msg = yqr0Var.z) != null && (!msg.i)) {
                                                            Dialog dialog31 = yqr0Var.m;
                                                            if (dialog31 == null) {
                                                                dialog31 = null;
                                                            }
                                                            if (!dialog31.Rb()) {
                                                                z5 = true;
                                                                dialogItemView.setReadOutVisible(z5);
                                                                dialog3 = yqr0Var.m;
                                                                if (dialog3 == null) {
                                                                }
                                                                if (dialog3.T8()) {
                                                                }
                                                                z6 = false;
                                                                dialog4 = yqr0Var.m;
                                                                if (dialog4 == null) {
                                                                }
                                                                dialogItemView.v(z6, !yqr0.a6(dialog4));
                                                                if (yqr0Var.B) {
                                                                }
                                                                if (yqr0Var.B) {
                                                                }
                                                                dialog5 = yqr0Var.m;
                                                                if (dialog5 == null) {
                                                                }
                                                                dialogItemView.j(extraIcon, !yqr0.a6(dialog5));
                                                                if (!dialogItemView.d()) {
                                                                }
                                                                z7 = false;
                                                                dialogItemView.setReplyButtonInStatus(z7);
                                                                dialog6 = yqr0Var.m;
                                                                if (dialog6 == null) {
                                                                }
                                                                longValue = dialog6.Sb().longValue();
                                                                yqr0Var.w.getClass();
                                                                f2 = cew.f(longValue);
                                                                if (f2 != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                z5 = false;
                                                dialogItemView.setReadOutVisible(z5);
                                                dialog3 = yqr0Var.m;
                                                if (dialog3 == null) {
                                                }
                                                if (dialog3.T8()) {
                                                }
                                                z6 = false;
                                                dialog4 = yqr0Var.m;
                                                if (dialog4 == null) {
                                                }
                                                dialogItemView.v(z6, !yqr0.a6(dialog4));
                                                if (yqr0Var.B) {
                                                }
                                                if (yqr0Var.B) {
                                                }
                                                dialog5 = yqr0Var.m;
                                                if (dialog5 == null) {
                                                }
                                                dialogItemView.j(extraIcon, !yqr0.a6(dialog5));
                                                if (!dialogItemView.d()) {
                                                }
                                                z7 = false;
                                                dialogItemView.setReplyButtonInStatus(z7);
                                                dialog6 = yqr0Var.m;
                                                if (dialog6 == null) {
                                                }
                                                longValue = dialog6.Sb().longValue();
                                                yqr0Var.w.getClass();
                                                f2 = cew.f(longValue);
                                                if (f2 != null) {
                                                }
                                            }
                                        }
                                        z4 = false;
                                        dialogItemView.setSendingVisible(z4);
                                        agmVar3 = yqr0Var.x;
                                        if (agmVar3 == null) {
                                        }
                                        dialogItemView.setErrorVisible(agmVar3.h);
                                        agmVar4 = yqr0Var.x;
                                        if (!(agmVar4 == null ? null : agmVar4).h) {
                                        }
                                        z5 = false;
                                        dialogItemView.setReadOutVisible(z5);
                                        dialog3 = yqr0Var.m;
                                        if (dialog3 == null) {
                                        }
                                        if (dialog3.T8()) {
                                        }
                                        z6 = false;
                                        dialog4 = yqr0Var.m;
                                        if (dialog4 == null) {
                                        }
                                        dialogItemView.v(z6, !yqr0.a6(dialog4));
                                        if (yqr0Var.B) {
                                        }
                                        if (yqr0Var.B) {
                                        }
                                        dialog5 = yqr0Var.m;
                                        if (dialog5 == null) {
                                        }
                                        dialogItemView.j(extraIcon, !yqr0.a6(dialog5));
                                        if (!dialogItemView.d()) {
                                        }
                                        z7 = false;
                                        dialogItemView.setReplyButtonInStatus(z7);
                                        dialog6 = yqr0Var.m;
                                        if (dialog6 == null) {
                                        }
                                        longValue = dialog6.Sb().longValue();
                                        yqr0Var.w.getClass();
                                        f2 = cew.f(longValue);
                                        if (f2 != null) {
                                        }
                                    }
                                }
                            }
                            z3 = false;
                            dialogItemView.setUnreadOutVisible(z3);
                            agmVar2 = yqr0Var.x;
                            if (!(agmVar2 != null ? null : agmVar2).h) {
                            }
                            z4 = false;
                            dialogItemView.setSendingVisible(z4);
                            agmVar3 = yqr0Var.x;
                            if (agmVar3 == null) {
                            }
                            dialogItemView.setErrorVisible(agmVar3.h);
                            agmVar4 = yqr0Var.x;
                            if (!(agmVar4 == null ? null : agmVar4).h) {
                            }
                            z5 = false;
                            dialogItemView.setReadOutVisible(z5);
                            dialog3 = yqr0Var.m;
                            if (dialog3 == null) {
                            }
                            if (dialog3.T8()) {
                            }
                            z6 = false;
                            dialog4 = yqr0Var.m;
                            if (dialog4 == null) {
                            }
                            dialogItemView.v(z6, !yqr0.a6(dialog4));
                            if (yqr0Var.B) {
                            }
                            if (yqr0Var.B) {
                            }
                            dialog5 = yqr0Var.m;
                            if (dialog5 == null) {
                            }
                            dialogItemView.j(extraIcon, !yqr0.a6(dialog5));
                            if (!dialogItemView.d()) {
                            }
                            z7 = false;
                            dialogItemView.setReplyButtonInStatus(z7);
                            dialog6 = yqr0Var.m;
                            if (dialog6 == null) {
                            }
                            longValue = dialog6.Sb().longValue();
                            yqr0Var.w.getClass();
                            f2 = cew.f(longValue);
                            if (f2 != null) {
                            }
                        } else {
                            yqr0Var.W5();
                        }
                        dialog7 = yqr0Var.m;
                        if (dialog7 == null) {
                            dialog7 = null;
                        }
                        if (!dialog7.uc()) {
                            List<Peer.Type> list2 = rdw.a;
                            Dialog dialog32 = yqr0Var.m;
                            if (dialog32 == null) {
                                dialog32 = null;
                            }
                            Peer Zb = dialog32.Zb();
                            Dialog dialog33 = yqr0Var.m;
                            if (dialog33 == null) {
                                dialog33 = null;
                            }
                            if (rdw.a(Zb, dialog33.Jc())) {
                                agm agmVar16 = yqr0Var.x;
                                if (agmVar16 == null) {
                                    agmVar16 = null;
                                }
                                dialogItemView.setStories(agmVar16.t);
                            }
                        }
                        profilesSimpleInfo4 = yqr0Var.n;
                        if (profilesSimpleInfo4 == null) {
                            profilesSimpleInfo4 = null;
                        }
                        dialog8 = yqr0Var.m;
                        if (dialog8 == null) {
                            dialog8 = null;
                        }
                        qtd0 zb4 = profilesSimpleInfo4.zb(dialog8.Zb());
                        boolean K6 = zb4 != null ? zb4.K6() : false;
                        agmVar6 = yqr0Var.x;
                        if (agmVar6 == null) {
                            agmVar6 = null;
                        }
                        dialogItemView.p(agmVar6.d, K6);
                        profilesSimpleInfo5 = yqr0Var.n;
                        if (profilesSimpleInfo5 == null) {
                            profilesSimpleInfo5 = null;
                        }
                        dialog9 = yqr0Var.m;
                        if (dialog9 == null) {
                            dialog9 = null;
                        }
                        qtd0 zb5 = profilesSimpleInfo5.zb(dialog9.Zb());
                        E5 = zb5 != null ? zb5.E5() : null;
                        if (E5 != null) {
                            dialogItemView.e(E5.d);
                            dialogItemView.setImageStatusContentDescription(E5.c);
                        }
                        if (E5 != null) {
                            Dialog dialog34 = yqr0Var.m;
                            if (dialog34 == null) {
                                dialog34 = null;
                            }
                            if (!dialog34.Jc()) {
                                z8 = true;
                                dialogItemView.setImageStatusVisible(z8);
                                dialog10 = yqr0Var.m;
                                if (dialog10 == null) {
                                    dialog10 = null;
                                }
                                dialogItemView.setDonutIconVisible(dialog10.o1());
                                agmVar7 = yqr0Var.x;
                                if (agmVar7 == null) {
                                    agmVar7 = null;
                                }
                                if (agmVar7.r) {
                                    Dialog dialog35 = yqr0Var.m;
                                    if (dialog35 == null) {
                                        dialog35 = null;
                                    }
                                    if (!yqr0.a6(dialog35)) {
                                        z9 = true;
                                        dialogItemView.setMutedVisible(z9);
                                        profilesSimpleInfo6 = yqr0Var.n;
                                        if (profilesSimpleInfo6 == null) {
                                            profilesSimpleInfo6 = null;
                                        }
                                        dialog11 = yqr0Var.m;
                                        if (dialog11 == null) {
                                            dialog11 = null;
                                        }
                                        zb = profilesSimpleInfo6.zb(dialog11.Zb());
                                        if (zb != null || (r14 = zb.q9()) == null) {
                                            profilesSimpleInfo7 = yqr0Var.n;
                                            if (profilesSimpleInfo7 == null) {
                                                profilesSimpleInfo7 = null;
                                            }
                                            dialog12 = yqr0Var.m;
                                            if (dialog12 == null) {
                                                dialog12 = null;
                                            }
                                            ChatSettings Hb = dialog12.Hb();
                                            zb2 = profilesSimpleInfo7.zb(Hb != null ? Hb.d : null);
                                            if (zb2 != null && (r14 = zb2.q9()) != null) {
                                                dialog13 = yqr0Var.m;
                                                if (dialog13 == null) {
                                                    dialog13 = null;
                                                }
                                            }
                                            VerifyInfo verifyInfo = null;
                                        }
                                        dialogItemView.setVerified(verifyInfo);
                                        vlm vlmVar = yqr0Var.p;
                                        agmVar8 = yqr0Var.x;
                                        if (agmVar8 == null) {
                                            agmVar8 = null;
                                        }
                                        CharSequence charSequence = "";
                                        if (agmVar8.q) {
                                            Msg msg2 = yqr0Var.z;
                                            if (msg2 != null) {
                                                long j2 = msg2.g;
                                                g2v.c().getClass();
                                                StringBuffer stringBuffer = vlmVar.e;
                                                vlm.b(j2, stringBuffer);
                                                str = stringBuffer.toString();
                                            } else {
                                                str = "";
                                            }
                                            dialogItemView.setTime(str);
                                        } else {
                                            dialogItemView.setTime("");
                                        }
                                        SpannableStringBuilder spannableStringBuilder2 = yqr0Var.t;
                                        if (yqr0Var.z == null) {
                                            dialogItemView.i();
                                            dialogItemView.k();
                                        } else {
                                            spannableStringBuilder2.clear();
                                            zri zriVar = yqr0Var.s;
                                            ProfilesSimpleInfo profilesSimpleInfo9 = yqr0Var.n;
                                            if (profilesSimpleInfo9 == null) {
                                                profilesSimpleInfo9 = null;
                                            }
                                            hcm hcmVar = yqr0Var.y;
                                            if (hcmVar == null) {
                                                hcmVar = null;
                                            }
                                            Dialog dialog36 = yqr0Var.m;
                                            if (dialog36 == null) {
                                                dialog36 = null;
                                            }
                                            zriVar.c(profilesSimpleInfo9, hcmVar, dialog36, spannableStringBuilder2);
                                            if (spannableStringBuilder2.length() > 0) {
                                                hcm hcmVar2 = yqr0Var.y;
                                                if (hcmVar2 == null) {
                                                    hcmVar2 = null;
                                                }
                                                if (hcmVar2.c()) {
                                                    dialogItemView.i();
                                                    hcm hcmVar3 = yqr0Var.y;
                                                    if (hcmVar3 == null) {
                                                        hcmVar3 = null;
                                                    }
                                                    dialogItemView.q(spannableStringBuilder2, hcmVar3.b());
                                                }
                                            }
                                            dialogItemView.k();
                                            Dialog dialog37 = yqr0Var.m;
                                            if (dialog37 == null) {
                                                dialog37 = null;
                                            }
                                            if (dialog37.uc()) {
                                                agm agmVar17 = yqr0Var.x;
                                                if (agmVar17 == null) {
                                                    agmVar17 = null;
                                                }
                                                if (agmVar17.l) {
                                                    Dialog dialog38 = yqr0Var.m;
                                                    if (dialog38 == null) {
                                                        dialog38 = null;
                                                    }
                                                    dialogItemView.h(enj.f(R.plurals.vkim_chat_settings_members_count, dialog38.Hb().f, yqr0Var.o), null);
                                                }
                                            }
                                            Msg msg3 = yqr0Var.z;
                                            MsgFromUser msgFromUser = msg3 instanceof MsgFromUser ? (MsgFromUser) msg3 : null;
                                            agm agmVar18 = yqr0Var.x;
                                            if (agmVar18 == null) {
                                                agmVar18 = null;
                                            }
                                            CharSequence charSequence2 = agmVar18.e;
                                            if (msgFromUser == null) {
                                                dialogItemView.h(charSequence2, null);
                                            } else if (charSequence2 == null || charSequence2.length() == 0) {
                                                if (msgFromUser.g8()) {
                                                    Dialog dialog39 = yqr0Var.m;
                                                    if (dialog39 == null) {
                                                        dialog39 = null;
                                                    }
                                                    ProfilesSimpleInfo profilesSimpleInfo10 = yqr0Var.n;
                                                    if (profilesSimpleInfo10 == null) {
                                                        profilesSimpleInfo10 = null;
                                                    }
                                                    spannableStringBuilder.clear();
                                                    spannableStringBuilder.append(yqr0Var.q.b(msgFromUser));
                                                    kh30.a(spannableStringBuilder, msgFromUser, dialog39, profilesSimpleInfo10);
                                                    SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
                                                    charSequence = new SpannableString(spannableStringBuilder);
                                                } else if (msgFromUser.p3()) {
                                                    Dialog dialog40 = yqr0Var.m;
                                                    if (dialog40 == null) {
                                                        dialog40 = null;
                                                    }
                                                    ProfilesSimpleInfo profilesSimpleInfo11 = yqr0Var.n;
                                                    if (profilesSimpleInfo11 == null) {
                                                        profilesSimpleInfo11 = null;
                                                    }
                                                    NestedMsg.Type type = NestedMsg.Type.REPLY;
                                                    spannableStringBuilder.clear();
                                                    spannableStringBuilder.append((CharSequence) en30Var.b(msgFromUser, type));
                                                    kh30.a(spannableStringBuilder, msgFromUser, dialog40, profilesSimpleInfo11);
                                                    SparseArray<ForegroundColorSpan> sparseArray2 = nik0.a;
                                                    charSequence = new SpannableString(spannableStringBuilder);
                                                } else if (msgFromUser.db()) {
                                                    Dialog dialog41 = yqr0Var.m;
                                                    if (dialog41 == null) {
                                                        dialog41 = null;
                                                    }
                                                    ProfilesSimpleInfo profilesSimpleInfo12 = yqr0Var.n;
                                                    if (profilesSimpleInfo12 == null) {
                                                        profilesSimpleInfo12 = null;
                                                    }
                                                    NestedMsg.Type type2 = NestedMsg.Type.FWD;
                                                    spannableStringBuilder.clear();
                                                    spannableStringBuilder.append((CharSequence) en30Var.b(msgFromUser, type2));
                                                    kh30.a(spannableStringBuilder, msgFromUser, dialog41, profilesSimpleInfo12);
                                                    SparseArray<ForegroundColorSpan> sparseArray3 = nik0.a;
                                                    charSequence = new SpannableString(spannableStringBuilder);
                                                }
                                                dialogItemView.h(charSequence2, charSequence);
                                            } else {
                                                dialogItemView.h(charSequence2, null);
                                            }
                                        }
                                        agmVar9 = yqr0Var.x;
                                        if (agmVar9 == null) {
                                            agmVar9 = null;
                                        }
                                        if (agmVar9.k) {
                                            yqr0Var.itemView.setAlpha(1.0f);
                                        } else {
                                            yqr0Var.itemView.setAlpha(0.4f);
                                        }
                                        dialog14 = yqr0Var.m;
                                        if (dialog14 == null) {
                                            dialog14 = null;
                                        }
                                        if (dialog14.sc()) {
                                            dialogItemView.setCasperIconVisible(true);
                                            Dialog dialog42 = yqr0Var.m;
                                            if (dialog42 == null) {
                                                dialog42 = null;
                                            }
                                            dialogItemView.setCasperIconColor(c4g0.t(dialog42.hc()));
                                        } else {
                                            dialogItemView.setCasperIconVisible(false);
                                        }
                                        Dialog dialog43 = yqr0Var.m;
                                        ChatSettings Hb2 = (dialog43 != null ? dialog43 : null).Hb();
                                        dialogItemView.setWritingDisabledIconVisible(Hb2 == null && Hb2.H);
                                    }
                                }
                                z9 = false;
                                dialogItemView.setMutedVisible(z9);
                                profilesSimpleInfo6 = yqr0Var.n;
                                if (profilesSimpleInfo6 == null) {
                                }
                                dialog11 = yqr0Var.m;
                                if (dialog11 == null) {
                                }
                                zb = profilesSimpleInfo6.zb(dialog11.Zb());
                                if (zb != null) {
                                }
                                profilesSimpleInfo7 = yqr0Var.n;
                                if (profilesSimpleInfo7 == null) {
                                }
                                dialog12 = yqr0Var.m;
                                if (dialog12 == null) {
                                }
                                ChatSettings Hb3 = dialog12.Hb();
                                zb2 = profilesSimpleInfo7.zb(Hb3 != null ? Hb3.d : null);
                                if (zb2 != null) {
                                    dialog13 = yqr0Var.m;
                                    if (dialog13 == null) {
                                    }
                                }
                                VerifyInfo verifyInfo2 = null;
                                dialogItemView.setVerified(verifyInfo2);
                                vlm vlmVar2 = yqr0Var.p;
                                agmVar8 = yqr0Var.x;
                                if (agmVar8 == null) {
                                }
                                CharSequence charSequence3 = "";
                                if (agmVar8.q) {
                                }
                                SpannableStringBuilder spannableStringBuilder22 = yqr0Var.t;
                                if (yqr0Var.z == null) {
                                }
                                agmVar9 = yqr0Var.x;
                                if (agmVar9 == null) {
                                }
                                if (agmVar9.k) {
                                }
                                dialog14 = yqr0Var.m;
                                if (dialog14 == null) {
                                }
                                if (dialog14.sc()) {
                                }
                                Dialog dialog432 = yqr0Var.m;
                                ChatSettings Hb22 = (dialog432 != null ? dialog432 : null).Hb();
                                dialogItemView.setWritingDisabledIconVisible(Hb22 == null && Hb22.H);
                            }
                        }
                        z8 = false;
                        dialogItemView.setImageStatusVisible(z8);
                        dialog10 = yqr0Var.m;
                        if (dialog10 == null) {
                        }
                        dialogItemView.setDonutIconVisible(dialog10.o1());
                        agmVar7 = yqr0Var.x;
                        if (agmVar7 == null) {
                        }
                        if (agmVar7.r) {
                        }
                        z9 = false;
                        dialogItemView.setMutedVisible(z9);
                        profilesSimpleInfo6 = yqr0Var.n;
                        if (profilesSimpleInfo6 == null) {
                        }
                        dialog11 = yqr0Var.m;
                        if (dialog11 == null) {
                        }
                        zb = profilesSimpleInfo6.zb(dialog11.Zb());
                        if (zb != null) {
                        }
                        profilesSimpleInfo7 = yqr0Var.n;
                        if (profilesSimpleInfo7 == null) {
                        }
                        dialog12 = yqr0Var.m;
                        if (dialog12 == null) {
                        }
                        ChatSettings Hb32 = dialog12.Hb();
                        zb2 = profilesSimpleInfo7.zb(Hb32 != null ? Hb32.d : null);
                        if (zb2 != null) {
                        }
                        VerifyInfo verifyInfo22 = null;
                        dialogItemView.setVerified(verifyInfo22);
                        vlm vlmVar22 = yqr0Var.p;
                        agmVar8 = yqr0Var.x;
                        if (agmVar8 == null) {
                        }
                        CharSequence charSequence32 = "";
                        if (agmVar8.q) {
                        }
                        SpannableStringBuilder spannableStringBuilder222 = yqr0Var.t;
                        if (yqr0Var.z == null) {
                        }
                        agmVar9 = yqr0Var.x;
                        if (agmVar9 == null) {
                        }
                        if (agmVar9.k) {
                        }
                        dialog14 = yqr0Var.m;
                        if (dialog14 == null) {
                        }
                        if (dialog14.sc()) {
                        }
                        Dialog dialog4322 = yqr0Var.m;
                        ChatSettings Hb222 = (dialog4322 != null ? dialog4322 : null).Hb();
                        dialogItemView.setWritingDisabledIconVisible(Hb222 == null && Hb222.H);
                    }
                }
                dialogItemView.o();
                dialog2 = yqr0Var.m;
                if (dialog2 == null) {
                }
                profilesSimpleInfo3 = yqr0Var.n;
                if (profilesSimpleInfo3 == null) {
                }
                qtd0 Ab22 = profilesSimpleInfo3.Ab(dialog2.Sb());
                boolean Jc2 = dialog2.Jc();
                GroupCallInProgress Ob2 = dialog2.Ob();
                if (Ob2 != null) {
                }
                if (Ob2 == null) {
                }
                if (z2) {
                }
                agmVar = yqr0Var.x;
                if (agmVar == null) {
                }
                if (agmVar.p) {
                }
                dialog7 = yqr0Var.m;
                if (dialog7 == null) {
                }
                if (!dialog7.uc()) {
                }
                profilesSimpleInfo4 = yqr0Var.n;
                if (profilesSimpleInfo4 == null) {
                }
                dialog8 = yqr0Var.m;
                if (dialog8 == null) {
                }
                qtd0 zb42 = profilesSimpleInfo4.zb(dialog8.Zb());
                if (zb42 != null) {
                }
                agmVar6 = yqr0Var.x;
                if (agmVar6 == null) {
                }
                dialogItemView.p(agmVar6.d, K6);
                profilesSimpleInfo5 = yqr0Var.n;
                if (profilesSimpleInfo5 == null) {
                }
                dialog9 = yqr0Var.m;
                if (dialog9 == null) {
                }
                qtd0 zb52 = profilesSimpleInfo5.zb(dialog9.Zb());
                if (zb52 != null) {
                }
                if (E5 != null) {
                }
                if (E5 != null) {
                }
                z8 = false;
                dialogItemView.setImageStatusVisible(z8);
                dialog10 = yqr0Var.m;
                if (dialog10 == null) {
                }
                dialogItemView.setDonutIconVisible(dialog10.o1());
                agmVar7 = yqr0Var.x;
                if (agmVar7 == null) {
                }
                if (agmVar7.r) {
                }
                z9 = false;
                dialogItemView.setMutedVisible(z9);
                profilesSimpleInfo6 = yqr0Var.n;
                if (profilesSimpleInfo6 == null) {
                }
                dialog11 = yqr0Var.m;
                if (dialog11 == null) {
                }
                zb = profilesSimpleInfo6.zb(dialog11.Zb());
                if (zb != null) {
                }
                profilesSimpleInfo7 = yqr0Var.n;
                if (profilesSimpleInfo7 == null) {
                }
                dialog12 = yqr0Var.m;
                if (dialog12 == null) {
                }
                ChatSettings Hb322 = dialog12.Hb();
                zb2 = profilesSimpleInfo7.zb(Hb322 != null ? Hb322.d : null);
                if (zb2 != null) {
                }
                VerifyInfo verifyInfo222 = null;
                dialogItemView.setVerified(verifyInfo222);
                vlm vlmVar222 = yqr0Var.p;
                agmVar8 = yqr0Var.x;
                if (agmVar8 == null) {
                }
                CharSequence charSequence322 = "";
                if (agmVar8.q) {
                }
                SpannableStringBuilder spannableStringBuilder2222 = yqr0Var.t;
                if (yqr0Var.z == null) {
                }
                agmVar9 = yqr0Var.x;
                if (agmVar9 == null) {
                }
                if (agmVar9.k) {
                }
                dialog14 = yqr0Var.m;
                if (dialog14 == null) {
                }
                if (dialog14.sc()) {
                }
                Dialog dialog43222 = yqr0Var.m;
                ChatSettings Hb2222 = (dialog43222 != null ? dialog43222 : null).Hb();
                dialogItemView.setWritingDisabledIconVisible(Hb2222 == null && Hb2222.H);
            }
        }
        z = false;
        yqr0Var.x = agmVar10;
        yqr0Var.m = dialog16;
        profilesSimpleInfo = agmVar10.f;
        yqr0Var.n = profilesSimpleInfo;
        yqr0Var.y = agmVar10.i;
        yqr0Var.z = agmVar10.c;
        DialogItemView dialogItemView2 = (DialogItemView) v;
        if (dialog16 == null) {
        }
        if (profilesSimpleInfo == null) {
        }
        dialogItemView2.g(dialog16, profilesSimpleInfo);
        profilesSimpleInfo2 = yqr0Var.n;
        if (profilesSimpleInfo2 == null) {
        }
        dialog = yqr0Var.m;
        if (dialog == null) {
        }
        qtd0 Ab3 = profilesSimpleInfo2.Ab(dialog.Sb());
        if (Ab3 == null) {
        }
        if (mb != null) {
        }
        dialogItemView2.o();
        dialog2 = yqr0Var.m;
        if (dialog2 == null) {
        }
        profilesSimpleInfo3 = yqr0Var.n;
        if (profilesSimpleInfo3 == null) {
        }
        qtd0 Ab222 = profilesSimpleInfo3.Ab(dialog2.Sb());
        boolean Jc22 = dialog2.Jc();
        GroupCallInProgress Ob22 = dialog2.Ob();
        if (Ob22 != null) {
        }
        if (Ob22 == null) {
        }
        if (z2) {
        }
        agmVar = yqr0Var.x;
        if (agmVar == null) {
        }
        if (agmVar.p) {
        }
        dialog7 = yqr0Var.m;
        if (dialog7 == null) {
        }
        if (!dialog7.uc()) {
        }
        profilesSimpleInfo4 = yqr0Var.n;
        if (profilesSimpleInfo4 == null) {
        }
        dialog8 = yqr0Var.m;
        if (dialog8 == null) {
        }
        qtd0 zb422 = profilesSimpleInfo4.zb(dialog8.Zb());
        if (zb422 != null) {
        }
        agmVar6 = yqr0Var.x;
        if (agmVar6 == null) {
        }
        dialogItemView2.p(agmVar6.d, K6);
        profilesSimpleInfo5 = yqr0Var.n;
        if (profilesSimpleInfo5 == null) {
        }
        dialog9 = yqr0Var.m;
        if (dialog9 == null) {
        }
        qtd0 zb522 = profilesSimpleInfo5.zb(dialog9.Zb());
        if (zb522 != null) {
        }
        if (E5 != null) {
        }
        if (E5 != null) {
        }
        z8 = false;
        dialogItemView2.setImageStatusVisible(z8);
        dialog10 = yqr0Var.m;
        if (dialog10 == null) {
        }
        dialogItemView2.setDonutIconVisible(dialog10.o1());
        agmVar7 = yqr0Var.x;
        if (agmVar7 == null) {
        }
        if (agmVar7.r) {
        }
        z9 = false;
        dialogItemView2.setMutedVisible(z9);
        profilesSimpleInfo6 = yqr0Var.n;
        if (profilesSimpleInfo6 == null) {
        }
        dialog11 = yqr0Var.m;
        if (dialog11 == null) {
        }
        zb = profilesSimpleInfo6.zb(dialog11.Zb());
        if (zb != null) {
        }
        profilesSimpleInfo7 = yqr0Var.n;
        if (profilesSimpleInfo7 == null) {
        }
        dialog12 = yqr0Var.m;
        if (dialog12 == null) {
        }
        ChatSettings Hb3222 = dialog12.Hb();
        zb2 = profilesSimpleInfo7.zb(Hb3222 != null ? Hb3222.d : null);
        if (zb2 != null) {
        }
        VerifyInfo verifyInfo2222 = null;
        dialogItemView2.setVerified(verifyInfo2222);
        vlm vlmVar2222 = yqr0Var.p;
        agmVar8 = yqr0Var.x;
        if (agmVar8 == null) {
        }
        CharSequence charSequence3222 = "";
        if (agmVar8.q) {
        }
        SpannableStringBuilder spannableStringBuilder22222 = yqr0Var.t;
        if (yqr0Var.z == null) {
        }
        agmVar9 = yqr0Var.x;
        if (agmVar9 == null) {
        }
        if (agmVar9.k) {
        }
        dialog14 = yqr0Var.m;
        if (dialog14 == null) {
        }
        if (dialog14.sc()) {
        }
        Dialog dialog432222 = yqr0Var.m;
        ChatSettings Hb22222 = (dialog432222 != null ? dialog432222 : null).Hb();
        dialogItemView2.setWritingDisabledIconVisible(Hb22222 == null && Hb22222.H);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflater = this.e;
        if (i2 == 1) {
            int i3 = yqr0.C;
            return new yqr0((DialogItemView) layoutInflater.inflate(R.layout.vkim_dialogs_list_item_dialog, viewGroup, false));
        }
        if (i2 == 10) {
            int i4 = arr0.m;
            DialogSkeletonView dialogSkeletonView = new DialogSkeletonView(viewGroup.getContext(), null, 6);
            dialogSkeletonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new arr0(dialogSkeletonView);
        }
        switch (i2) {
            case 12:
                int i5 = bvr0.n;
                return new bvr0(layoutInflater.inflate(R.layout.vkim_dialogs_list_item_requests_count, viewGroup, false));
            case 13:
                int i6 = cvr0.l;
                return new cvr0(layoutInflater.inflate(R.layout.vkim_dialogs_list_item_requests_info, viewGroup, false));
            case 14:
                int i7 = oqr0.o;
                return new oqr0(layoutInflater.inflate(R.layout.vkim_dialogs_list_item_business_notify_count, viewGroup, false));
            case 15:
                int i8 = urr0.m;
                return new urr0(layoutInflater.inflate(R.layout.vkim_dialogs_list_item_info_bar_legacy, viewGroup, false));
            case 16:
                tqr0 tqr0Var = new tqr0(R.layout.vkim_dialogs_list_button, viewGroup);
                ImageView imageView = (ImageView) tqr0Var.itemView.findViewById(R.id.vkim_icon);
                if (imageView != null) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = cn70.b(50);
                    layoutParams.width = cn70.b(50);
                    imageView.setLayoutParams(layoutParams);
                }
                TextView textView = (TextView) tqr0Var.itemView.findViewById(R.id.vkim_btn);
                if (textView != null) {
                    f4m.s(cn70.b(76), textView);
                }
                return tqr0Var;
            case 17:
                int i9 = evr0.m;
                return new evr0(layoutInflater.inflate(R.layout.vkim_dialogs_search, viewGroup, false));
            case 18:
                int i10 = sur0.r;
                return new sur0(layoutInflater.inflate(R.layout.vkim_dialogs_list_item_onboarding, viewGroup, false));
            case 19:
                g2v.c().getClass();
                throw new UnsupportedOperationException("No HeaderItemVh");
            case 20:
                int i11 = gqr0.o;
                return new gqr0(layoutInflater.inflate(R.layout.vkim_dialogs_list_item_archives_count, viewGroup, false));
            case 21:
                int i12 = kvr0.m;
                return new kvr0(layoutInflater.inflate(R.layout.vkim_dialogs_list_item_shared_chats_count, viewGroup, false));
            case 22:
                int i13 = jvr0.r;
                return new jvr0(layoutInflater.inflate(R.layout.vkim_dialogs_list_item_shared_chat, viewGroup, false));
            case 23:
                int i14 = nqr0.p;
                nqr0 nqr0Var = new nqr0((DialogItemView) layoutInflater.inflate(R.layout.vkim_dialogs_list_item_dialog, viewGroup, false), R.drawable.vk_icon_work_outline_28, R.string.vkim_business_notify_count_default);
                jjc.g(nqr0Var.itemView, new n3b0(nqr0Var, 21));
                return nqr0Var;
            case 24:
                int i15 = avr0.p;
                avr0 avr0Var = new avr0((DialogItemView) layoutInflater.inflate(R.layout.vkim_dialogs_list_item_dialog, viewGroup, false), R.drawable.vk_icon_messages_outline_28, R.string.vkim_msg_request);
                bwt0.i0(avr0Var.itemView, new mvl0(avr0Var, 8));
                return avr0Var;
            case 25:
                return new err0(R.layout.im_edu_bar_vh, viewGroup);
            case 26:
                return new xur0(R.layout.vh_promo_link, viewGroup);
            default:
                throw new UnsupportedOperationException(lhg.a(i2, "Unknown view type: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        super.onViewAttachedToWindow(e0Var);
        if (e0Var instanceof hqr0) {
            ((hqr0) e0Var).b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        super.onViewDetachedFromWindow(e0Var);
        if (e0Var instanceof hqr0) {
            ((hqr0) e0Var).c();
        }
    }
}

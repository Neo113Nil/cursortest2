package xsna;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Attachment;
import com.vk.dto.hints.HintId;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;

/* compiled from: PostingAttachmentsAdapter.kt */
/* loaded from: classes4.dex */
public final class qcc0 extends b2c0 implements gvx {
    public final a2o A;
    public final Object B = msy.a(LazyThreadSafetyMode.NONE, new kcc0(0));
    public final o64 C;
    public final l5d0 D;
    public final ncc0 E;
    public final vou r;
    public final pn0 s;
    public final z4 t;
    public final defpackage.e u;
    public final defpackage.f v;
    public final c94 w;
    public final wb7 x;
    public final boolean y;
    public final ndc0 z;

    public qcc0(vou vouVar, pn0 pn0Var, z4 z4Var, mh mhVar, zbc0 zbc0Var, defpackage.e eVar, defpackage.f fVar, c94 c94Var, wb7 wb7Var, boolean z, ndc0 ndc0Var, a2o a2oVar) {
        zbc0 zbc0Var2;
        ndc0 ndc0Var2;
        qcc0 qcc0Var;
        o64 r64Var;
        this.r = vouVar;
        this.s = pn0Var;
        this.t = z4Var;
        this.u = eVar;
        this.v = fVar;
        this.w = c94Var;
        this.x = wb7Var;
        this.y = z;
        this.z = ndc0Var;
        this.A = a2oVar;
        if (z) {
            ndc0Var2 = ndc0Var;
            r64Var = new q64(this, vouVar, mhVar, zbc0Var, ndc0Var2, a2oVar);
            zbc0Var2 = zbc0Var;
            qcc0Var = this;
        } else {
            zbc0Var2 = zbc0Var;
            ndc0Var2 = ndc0Var;
            qcc0Var = this;
            r64Var = new r64(qcc0Var, vouVar, mhVar, ndc0Var2, a2oVar);
        }
        qcc0Var.C = r64Var;
        qcc0Var.D = new l5d0(zbc0Var2, ndc0Var2.a);
        qcc0Var.E = new ncc0(this);
    }

    public static List O0(u1c0 u1c0Var) {
        List<Attachment> list;
        r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
        Attachment attachment = r74Var != null ? r74Var.q : null;
        if (attachment != null) {
            return Collections.singletonList(attachment);
        }
        w84 w84Var = u1c0Var instanceof w84 ? (w84) u1c0Var : null;
        return (w84Var == null || (list = w84Var.q) == null) ? EmptyList.b : list;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.b2c0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: L0 */
    public final qi6 onCreateViewHolder(int i, ViewGroup viewGroup) {
        qi6 onCreateViewHolder;
        this.x.getClass();
        SetBuilder setBuilder = new SetBuilder();
        if (BuildInfo.q()) {
            setBuilder.add(Integer.valueOf(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE));
        }
        setBuilder.add(5);
        setBuilder.add(50);
        setBuilder.add(51);
        setBuilder.add(11);
        setBuilder.add(Integer.valueOf(PsExtractor.PRIVATE_STREAM_1));
        boolean contains = setBuilder.d().contains(Integer.valueOf(i));
        o64 o64Var = this.C;
        if (contains) {
            if (o64Var.t2() == null) {
                o64Var.o2(new b4d0(viewGroup, this.r, this.E, new occ0(this), o64Var.u(), (ldc0) this.t.invoke(), this.u, this.v, this.D, this.w, this.x, this.y, this.z));
            }
            return o64Var.t2();
        }
        vou vouVar = this.r;
        if (i == 79) {
            onCreateViewHolder = new su90(viewGroup, vouVar);
        } else if (i == 237) {
            onCreateViewHolder = new tbc0(viewGroup);
        } else if (i == 192) {
            y1c0 y1c0Var = this.p;
            y1c0Var.getClass();
            onCreateViewHolder = new c6i(viewGroup, ((NewsFeedComponent) y1c0Var.f.getValue()).G2());
        } else {
            onCreateViewHolder = super.onCreateViewHolder(i, viewGroup);
        }
        if (onCreateViewHolder instanceof zu90) {
            o64Var.r2().add(onCreateViewHolder);
        }
        if (onCreateViewHolder instanceof blc0) {
            blc0 blc0Var = (blc0) onCreateViewHolder;
            blc0Var.Z1(vouVar);
            blc0Var.p5();
        }
        return onCreateViewHolder;
    }

    public final zu90 P0(int i) {
        Object obj;
        o64 o64Var = this.C;
        b4d0 t2 = o64Var.t2();
        Object obj2 = null;
        if (t2 != null) {
            Iterator it = t2.E.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                View.OnClickListener onClickListener = (de6) obj;
                zu90 zu90Var = onClickListener instanceof zu90 ? (zu90) onClickListener : null;
                if (zu90Var != null && zu90Var.S() == i) {
                    break;
                }
            }
            zu90 zu90Var2 = obj instanceof zu90 ? (zu90) obj : null;
            if (zu90Var2 != null) {
                return zu90Var2;
            }
        }
        Iterator it2 = o64Var.r2().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((zu90) next).S() == i) {
                obj2 = next;
                break;
            }
        }
        return (zu90) obj2;
    }

    @Override // xsna.gvx
    public final boolean d(int i, int i2) {
        return this.C.d(i, i2);
    }

    @Override // xsna.b2c0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((u1c0) this.c.c(i)).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.b2c0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof qi6) {
            u1c0 u1c0Var = (u1c0) this.c.c(i);
            qi6 qi6Var = (qi6) e0Var;
            qi6Var.a6(u1c0Var);
            if (qi6Var instanceof pt4) {
                pt4 pt4Var = (pt4) e0Var;
                Attachment attachment = (Attachment) j5g.a0(O0(u1c0Var));
                if (attachment != null) {
                    pt4Var.T4(new q2r(1, this, attachment));
                }
            } else if (qi6Var instanceof blc0) {
                blc0 blc0Var = (blc0) e0Var;
                blc0Var.D1(true);
                blc0Var.p5();
                Attachment attachment2 = (Attachment) j5g.a0(O0(u1c0Var));
                if (attachment2 != null) {
                    blc0Var.j1(new m1l(2, this, attachment2));
                }
            } else if (qi6Var instanceof gqb0) {
                Object a0 = j5g.a0(O0(u1c0Var));
                final PollAttachment pollAttachment = a0 instanceof PollAttachment ? (PollAttachment) a0 : null;
                if (pollAttachment != null) {
                    final gqb0 gqb0Var = (gqb0) e0Var;
                    gqb0Var.E.setActionsClickListener(new View.OnClickListener() { // from class: xsna.lcc0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final gqb0 gqb0Var2 = gqb0.this;
                            PopupMenu popupMenu = new PopupMenu(gqb0Var2.itemView.getContext(), view);
                            popupMenu.getMenu().add(0, 0, 0, R.string.edit);
                            if (pollAttachment.f.Ab()) {
                                popupMenu.getMenu().add(0, 1, 1, R.string.poll_cancel_vote);
                            }
                            popupMenu.getMenu().add(0, 2, 2, R.string.delete);
                            final qcc0 qcc0Var = this;
                            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: xsna.jcc0
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v1 */
                                /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r3v2 */
                                /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r3v8 */
                                /* JADX WARN: Type inference failed for: r3v9 */
                                @Override // android.widget.PopupMenu.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    PollAttachment pollAttachment2;
                                    PollAttachment pollAttachment3;
                                    PollAttachment pollAttachment4;
                                    pn0 pn0Var = qcc0.this.s;
                                    int itemId = menuItem.getItemId();
                                    if (itemId == 0) {
                                        Iterator it = ((b94) pn0Var.a).m.C.u().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                pollAttachment2 = 0;
                                                break;
                                            }
                                            pollAttachment2 = it.next();
                                            if (((Attachment) pollAttachment2) instanceof PollAttachment) {
                                                break;
                                            }
                                        }
                                        pollAttachment3 = pollAttachment2 instanceof PollAttachment ? pollAttachment2 : null;
                                        if (pollAttachment3 != null) {
                                            shc0 shc0Var = (shc0) pn0Var.b;
                                            shc0Var.b.h(MobileOfficialAppsFeedStat$PickerType.POLL);
                                            int i2 = PollEditorFragment.a.m;
                                            PollEditorFragment.a b = PollEditorFragment.a.C1520a.b(pollAttachment3, "");
                                            b.j.putBoolean("shouldMeasureTechMetrics", true);
                                            b.g(10009, shc0Var.a);
                                            return true;
                                        }
                                    } else {
                                        if (itemId == 1) {
                                            gqb0Var2.E.i();
                                            return true;
                                        }
                                        if (itemId != 2) {
                                            return false;
                                        }
                                        b94 b94Var = (b94) pn0Var.a;
                                        Iterator it2 = b94Var.m.C.u().iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                pollAttachment4 = 0;
                                                break;
                                            }
                                            pollAttachment4 = it2.next();
                                            if (((Attachment) pollAttachment4) instanceof PollAttachment) {
                                                break;
                                            }
                                        }
                                        pollAttachment3 = pollAttachment4 instanceof PollAttachment ? pollAttachment4 : null;
                                        if (pollAttachment3 != null) {
                                            b94Var.m(pollAttachment3);
                                            return true;
                                        }
                                    }
                                    return true;
                                }
                            });
                            popupMenu.show();
                        }
                    });
                }
            }
            if (e0Var instanceof sq7) {
                ((sq7) e0Var).G = true;
                pla.e().b().q(e0Var.itemView, HintId.ECOMM_POSTING_BOOKING_ATTACHMENT);
            }
            boolean z = u1c0Var instanceof k5i;
            if (z && (((k5i) u1c0Var).q instanceof MarketLinkAttachment)) {
                pla.e().b().q(e0Var.itemView, HintId.ECOMM_POSTING_MARKET_STOREFRONT_LINK);
            }
            if (z && (((k5i) u1c0Var).q instanceof MarketMessageOwnerAttachment)) {
                h7v.d(pla.e().b(), e0Var.itemView, HintId.ECOMM_POSTING_MARKET_MESSAGES_ATTACH.getId(), new ha40(6), null, 24);
            }
            if ((e0Var instanceof vz00) || (e0Var instanceof wz00)) {
                ?? r8 = this.B;
                ((m56) e0Var).O6((fa60) r8.getValue());
            }
        }
    }
}

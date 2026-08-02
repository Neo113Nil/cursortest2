package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.group.Group;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import xsna.e8v0;
import xsna.q630;
import xsna.yb70;
import xsna.zc70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x28 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x28(int i, Group group, qmu qmuVar) {
        this.b = 2;
        this.d = group;
        this.c = i;
        this.e = qmuVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        boolean contains;
        Object obj4;
        Object obj5;
        boolean contains2;
        switch (this.b) {
            case 0:
                ((b38) this.d).a((BotButton) this.e, this.c);
                return s3q0.a;
            case 1:
                com.vk.search.fragment.a aVar = (com.vk.search.fragment.a) this.d;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.e;
                if (((Boolean) obj).booleanValue()) {
                    aVar.g.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.j.b);
                } else {
                    aVar.c.e(this.c, false);
                }
                return s3q0.a;
            case 2:
                Group group = (Group) this.d;
                qmu qmuVar = (qmu) this.e;
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                group.C = this.c;
                qmuVar.o6();
                j03.l(th);
                return s3q0.a;
            case 3:
                w2w w2wVar = (w2w) this.d;
                wy1 wy1Var = (wy1) this.e;
                com.vk.im.engine.models.im_item.a meta = w2wVar.I0().j().getMeta();
                if (meta == null) {
                    return null;
                }
                c2a0 c2a0Var = new c2a0(cq.a(w2wVar), w2wVar.I0().system().j(), new cws(w2wVar, 10));
                e5w e5wVar = e5w.a;
                x7w x7wVar = wy1Var.a;
                x7w x7wVar2 = meta.a;
                x7w x7wVar3 = wy1Var.b;
                x7w x7wVar4 = meta.b;
                e5wVar.getClass();
                l5w h = w2wVar.I0().j().h(x7wVar, x7wVar2, x7wVar3, x7wVar4, this.c);
                ArrayList arrayList = h.a;
                boolean z = h.b;
                t8v b = t8w.b(w2wVar, arrayList, c2a0Var);
                el3<b5w> el3Var = b.d;
                ArrayList arrayList2 = b.a;
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((v7w) obj2).a.b == ImItemType.DIALOG) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                v7w v7wVar = (v7w) obj2;
                if (v7wVar != null) {
                    contains = el3Var.contains(v7wVar.a);
                } else {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (((v7w) obj3).a.b == ImItemType.CHANNEL) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    v7w v7wVar2 = (v7w) obj3;
                    contains = v7wVar2 != null ? el3Var.contains(v7wVar2.a) : false;
                }
                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj4 = listIterator.previous();
                        if (((v7w) obj4).a.b == ImItemType.DIALOG) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                v7w v7wVar3 = (v7w) obj4;
                if (v7wVar3 != null) {
                    contains2 = el3Var.contains(v7wVar3.a);
                } else {
                    ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            Object previous = listIterator2.previous();
                            if (((v7w) previous).a.b == ImItemType.CHANNEL) {
                                obj5 = previous;
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    v7w v7wVar4 = (v7w) obj5;
                    contains2 = v7wVar4 != null ? el3Var.contains(v7wVar4.a) : false;
                }
                boolean z2 = meta.c == c2a0Var.a && meta.d == c2a0Var.b;
                boolean z3 = z2 && meta.e;
                x7w x7wVar5 = x7w.g;
                boolean z4 = x7wVar.equals(x7wVar5) && x7wVar3.equals(x7wVar5);
                boolean z5 = !z4 && (z || contains || !z2);
                boolean z6 = !z4 && z;
                boolean z7 = h.c;
                return new s8v(b, new u8v(z6, z7, z5, z7 || contains2 || !z3));
            default:
                yb70.e eVar = (yb70.e) this.d;
                final izs izsVar = (izs) this.e;
                nvy nvyVar = (nvy) obj;
                ListNextState listNextState = eVar.a.b;
                int i = listNextState == null ? -1 : zc70.a.$EnumSwitchMapping$1[listNextState.ordinal()];
                if (i == 1) {
                    nvy.g(nvyVar, "next_loader", null, tii.c, 2);
                } else if (i == 2) {
                    final int i2 = this.c;
                    nvy.g(nvyVar, null, null, new jai(-1195346565, new yzs() { // from class: xsna.tc70
                        @Override // xsna.yzs
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj7;
                            int intValue = ((Integer) obj8).intValue();
                            if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1195346565, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.list.footer.<anonymous> (NotificationListView.kt:528)");
                                }
                                q630.a aVar3 = q630.a.a;
                                jqu0.a(s200.E(aVar3, 16, 8), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 6, 14);
                                izs izsVar2 = izs.this;
                                boolean J = aVar2.J(izsVar2);
                                int i3 = i2;
                                boolean o = J | aVar2.o(i3);
                                Object x = aVar2.x();
                                if (o || x == a.C0011a.a) {
                                    x = new rif(izsVar2, i3, 1);
                                    aVar2.R(x);
                                }
                                vwp.a(6, 0, aVar2, (gzs) x, aVar3);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, true), 3);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ x28(int i, yb70.e eVar, izs izsVar) {
        this.b = 4;
        this.c = i;
        this.d = eVar;
        this.e = izsVar;
    }

    public /* synthetic */ x28(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}

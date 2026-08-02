package xsna;

import android.app.AlertDialog;
import android.text.Editable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.content.design.view.photo.flow.PhotoFlowHeaderView;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.dialogs_list.ImDialogsFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.music.informer.mvi.d;
import com.vk.music.informer.mvi.h;
import com.vk.music.playlist.framework.presentation.PlaylistScreenContentType;
import com.vk.music.subscription.MusicSubscriptionDetailsContainer;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.e;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a750;
import xsna.ah30;
import xsna.asb;
import xsna.aw9;
import xsna.dg20;
import xsna.g650;
import xsna.qr60;
import xsna.r7x;
import xsna.sir0;
import xsna.slz;
import xsna.tra0;
import xsna.wk50;
import xsna.ws00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class iou implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iou(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Editable text;
        b9w b9wVar;
        nbk0 nbk0Var;
        View findSnapView;
        int i = 24;
        Integer num = null;
        switch (this.b) {
            case 0:
                hou houVar = ((GroupedNotificationsFragment) this.c).Z;
                if (houVar != null) {
                    houVar.clear();
                }
                return s3q0.a;
            case 1:
                c8v c8vVar = (c8v) this.c;
                List<HistoryAttach> list = (List) obj;
                c8vVar.d1().g(false);
                c8vVar.d1().d(list);
                c8vVar.f1().r(list.isEmpty());
                return s3q0.a;
            case 2:
                UIBlockList uIBlockList = (UIBlockList) this.c;
                nvy nvyVar = (nvy) obj;
                PlaylistScreenContentType playlistScreenContentType = PlaylistScreenContentType.SPACER;
                nvy.g(nvyVar, null, playlistScreenContentType, pgi.a, 1);
                nvyVar.e(uIBlockList.y.size(), new b5h(uIBlockList, 19), new oce(uIBlockList, 29), new jai(-1992285428, new rfv(uIBlockList, r5), true));
                nvy.g(nvyVar, null, playlistScreenContentType, pgi.b, 1);
                return s3q0.a;
            case 3:
                ((AlertDialog) this.c).show();
                return s3q0.a;
            case 4:
                ImDialogsFragment imDialogsFragment = (ImDialogsFragment) this.c;
                imDialogsFragment.Q.b().m(new jbs(imDialogsFragment), false, false);
                return s3q0.a;
            case 5:
                izs<qr60.a, lm50> izsVar = ((dzw) this.c).b;
                izsVar.invoke(new qr60.a.d(false));
                izsVar.invoke(qr60.a.b.a);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(epx.f(((r7x.a) obj).b(), (w6x) this.c));
            case 7:
                kbx kbxVar = (kbx) this.c;
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.e eVar = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.e) obj;
                if (eVar.equals(e.a.a)) {
                    kbxVar.d.invoke();
                } else {
                    if (!eVar.equals(e.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VkInputSelect vkInputSelect = kbxVar.h;
                    if (vkInputSelect != null && (text = vkInputSelect.getText()) != null) {
                        text.clear();
                    }
                    kbxVar.c.invoke();
                }
                return s3q0.a;
            case 8:
                asb.b bVar = ((bqx) this.c).h;
                if (bVar != null) {
                    bVar.invoke();
                }
                return s3q0.a;
            case 9:
                Object obj2 = this.c;
                ((Integer) obj).intValue();
                return obj2;
            case 10:
                plz plzVar = (plz) this.c;
                slz slzVar = (slz) obj;
                int i2 = plz.j1;
                if (slzVar instanceof slz.b) {
                    UserId userId = ((slz.b) slzVar).a;
                    ClipsRouter.j(g620.f().a(), plzVar.requireContext(), new ClipGridParams.OnlyId.Profile(userId), o25.a().a(userId), null, null, 56);
                } else {
                    if (!(slzVar instanceof slz.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    plzVar.dismiss();
                }
                return s3q0.a;
            case 11:
                ((rsz) this.c).d.setProgress(((Float) obj).floatValue());
                return s3q0.a;
            case 12:
                com.vk.ecomm.reviews.impl.allreviews.presentation.b bVar2 = (com.vk.ecomm.reviews.impl.allreviews.presentation.b) this.c;
                bVar2.T(c.i.b);
                bVar2.k.b(ws00.a.a);
                return s3q0.a;
            case 13:
                sf20 sf20Var = (sf20) this.c;
                dg20 dg20Var = (dg20) obj;
                nf20 nf20Var = sf20Var.l;
                if (dg20Var instanceof dg20.e) {
                    dg20.e eVar2 = (dg20.e) dg20Var;
                    vm30 vm30Var = sf20Var.o;
                    if (vm30Var != null) {
                        vm30Var.H(eVar2.a);
                    }
                } else if (dg20Var instanceof dg20.k) {
                    dg20.k kVar = (dg20.k) dg20Var;
                    vm30 vm30Var2 = sf20Var.o;
                    if (vm30Var2 != null) {
                        boolean z = kVar.a;
                        boolean z2 = kVar.b;
                        String str = kVar.c;
                        if (z && z2) {
                            vm30Var2.K(str + "->handleScrollToLatestEvent");
                        } else if (z) {
                            vm30Var2.k(str + "->handleScrollToLatestEvent");
                        } else if (z2) {
                            vm30Var2.J(str + "->handleScrollToLatestEvent");
                        } else {
                            vm30Var2.j(str + "->handleScrollToLatestEvent");
                        }
                    }
                } else if (dg20Var instanceof dg20.l) {
                    dg20.l lVar = (dg20.l) dg20Var;
                    vm30 vm30Var3 = sf20Var.o;
                    if (vm30Var3 != null) {
                        boolean z3 = lVar.c;
                        int i3 = lVar.b;
                        MsgIdType msgIdType = lVar.a;
                        if (z3) {
                            sf20Var.a(msgIdType, i3, true);
                        }
                        vm30Var3.L(msgIdType, i3, lVar.d);
                    }
                } else if (dg20Var instanceof dg20.g) {
                    nf20Var.R(((dg20.g) dg20Var).a);
                } else if (dg20Var instanceof dg20.i) {
                    nf20Var.Y(((dg20.i) dg20Var).a);
                } else if (dg20Var instanceof dg20.h) {
                    nf20Var.U(((dg20.h) dg20Var).a);
                } else if (dg20Var instanceof dg20.b) {
                    dg20.b bVar3 = (dg20.b) dg20Var;
                    Msg msg = bVar3.b;
                    NestedMsg nestedMsg = bVar3.c;
                    Attach attach = bVar3.a;
                    vm30 vm30Var4 = sf20Var.o;
                    nf20Var.W(msg, nestedMsg, attach, vm30Var4 != null ? vm30Var4.e(attach.xb()) : null);
                } else if (dg20Var instanceof dg20.a) {
                    dg20.a aVar = (dg20.a) dg20Var;
                    Msg msg2 = aVar.b;
                    NestedMsg nestedMsg2 = aVar.c;
                    Attach attach2 = aVar.a;
                    vm30 vm30Var5 = sf20Var.o;
                    nf20Var.X(msg2, nestedMsg2, attach2, vm30Var5 != null ? vm30Var5.e(attach2.xb()) : null);
                } else if (dg20Var instanceof dg20.c) {
                    nf20Var.S(((dg20.c) dg20Var).b);
                } else if (dg20Var instanceof dg20.f) {
                    nf20Var.L(((dg20.f) dg20Var).a);
                } else if (dg20Var instanceof dg20.d) {
                    Attach attach3 = ((dg20.d) dg20Var).a;
                    if (((attach3 instanceof AttachVideo) || ((attach3 instanceof AttachDoc) && ((AttachDoc) attach3).x5())) && (b9wVar = (b9w) sf20Var.a.b.a) != null) {
                        b9wVar.a();
                    }
                } else {
                    if (!(dg20Var instanceof dg20.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nf20Var.V(((dg20.j) dg20Var).a);
                }
                return s3q0.a;
            case 14:
                ((cq20) this.c).a.invoke();
                return s3q0.a;
            case 15:
                ah30 ah30Var = (ah30) this.c;
                long j = ((ah30.a) obj).b;
                ah30Var.getClass();
                ChatFragment.w1.getClass();
                return Boolean.valueOf((ChatFragment.y1 == j ? 1 : 0) ^ 1);
            case 16:
                u440 u440Var = (u440) this.c;
                Throwable th = (Throwable) obj;
                L.g("MultiStory", th);
                th.printStackTrace();
                h03.b(th);
                ((g440) u440Var.s).ik();
                u440Var.j.M();
                return s3q0.a;
            case 17:
                awt0.x((View) obj, 0, ((hc40) this.c).b, 0, 0, 13);
                return s3q0.a;
            case 18:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new cj40((ej40) this.c, null), 3));
            case 19:
                com.vk.music.informer.mvi.d dVar = (com.vk.music.informer.mvi.d) this.c;
                Boolean bool = (Boolean) obj;
                d.c cVar = dVar.k;
                d.b a = d.b.a(cVar.b, null, false, false, bool.booleanValue(), false, false, 55);
                cVar.b = a;
                lt3 lt3Var = a.a;
                if (lt3Var != null && a.b && a.c && !a.d && a.e && !a.f) {
                    cVar.a.invoke(lt3Var);
                }
                dVar.T(new h.e(bool.booleanValue()));
                return s3q0.a;
            case 20:
                j650 j650Var = (j650) this.c;
                a750.a aVar2 = (a750.a) obj;
                if (aVar2 != null) {
                    e650 e650Var = j650Var.g;
                    RecyclerView recyclerView = j650Var.e;
                    List<? extends hfz> list2 = e650Var.h;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof pck0) {
                            arrayList.add(obj3);
                        }
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    List<nck0> list3 = aVar2.a;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new pck0((nck0) it.next()));
                    }
                    mck0 mck0Var = j650Var.i;
                    if (mck0Var != null) {
                        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                        int i4 = -1;
                        if (layoutManager != null && (findSnapView = mck0Var.b.findSnapView(layoutManager)) != null) {
                            i4 = layoutManager.getPosition(findSnapView);
                        }
                        num = Integer.valueOf(i4);
                    }
                    int size = e650Var.h.size() - 1;
                    boolean z4 = num != null && num.intValue() == size;
                    e650Var.setItems(j5g.v0(rck0.b, arrayList2));
                    if (z4 && e650Var.h.size() > size) {
                        recyclerView.scrollToPosition(size);
                        nck0 nck0Var = ((pck0) arrayList2.get(size)).b;
                        nbk0 nbk0Var2 = (nbk0) j5g.b0(0, nck0Var.g);
                        if (nbk0Var2 != null) {
                            j650Var.c.invoke(new g650.d.c(nck0Var.a, nbk0Var2.b, false, 24));
                        }
                    }
                    j650Var.j = false;
                    if (isEmpty) {
                        recyclerView.scrollToPosition(0);
                        pck0 pck0Var = (pck0) j5g.a0(arrayList2);
                        if (pck0Var != null && (nbk0Var = (nbk0) j5g.a0(pck0Var.b.g)) != null) {
                            bwt0.j(j650Var.d, new ki4(j650Var, pck0Var, nbk0Var, 5));
                        }
                    }
                }
                return s3q0.a;
            case 21:
                int i5 = MusicSubscriptionDetailsContainer.A;
                ((f950) this.c).a(null, (Subscription) obj);
                return s3q0.a;
            case 22:
                Object[] objArr = (Object[]) obj;
                return ((wzs) this.c).invoke(objArr[0], objArr[1]);
            case 23:
                Boolean bool2 = (Boolean) obj;
                cjx cjxVar = ((lr50) this.c).J;
                (cjxVar != null ? cjxVar : null).o(!bool2.booleanValue());
                return s3q0.a;
            case 24:
                ((NewsfeedFragment) this.c).z0 = (List) obj;
                return s3q0.a;
            case 25:
                yp80 yp80Var = (yp80) this.c;
                Throwable th2 = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th2);
                }
                return s3q0.a;
            case 26:
                ((wk50.a) this.c).b(new aw9.d.a((Throwable) obj));
                return s3q0.a;
            case 27:
                ((tra0.a) obj).q((tra0) this.c, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 28:
                bbu bbuVar = (bbu) this.c;
                zlj0 zlj0Var = (zlj0) bbuVar.a;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                Long l = vkAuthValidatePhoneResult.p;
                Object r3a0Var = l != null ? new r3a0(l.longValue()) : q3a0.a;
                if (epx.f(r3a0Var, q3a0.a)) {
                    return io.reactivex.rxjava3.core.q.T(vkAuthValidatePhoneResult);
                }
                if (!(r3a0Var instanceof r3a0)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((p3a0) bbuVar.b).a();
                sir0.e eVar3 = zlj0Var.a;
                return io.reactivex.rxjava3.core.q.B0(Math.min(Math.max(((r3a0) r3a0Var).a, 0L), 3000L), TimeUnit.MILLISECONDS).L(new t7(new x2y(sir0.h(sir0.a, new sir0.e(eVar3.a, eVar3.b, eVar3.c, true, true, eVar3.f, eVar3.g, eVar3.h, ol90.a(), eVar3.j)), i), 26), false);
            default:
                PhotoFlowHeaderView.a aVar3 = ((PhotoFlowHeaderView) this.c).y;
                if (aVar3 != null) {
                    aVar3.e();
                }
                return s3q0.a;
        }
    }
}

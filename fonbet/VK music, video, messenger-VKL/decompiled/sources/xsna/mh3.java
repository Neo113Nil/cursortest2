package xsna;

import android.content.Context;
import android.telephony.CellInfo;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.dto.group.Group;
import com.vk.dto.hints.Hint;
import com.vk.dto.polls.PollInfo;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.settings.LabelWithCounterSettingsView;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.reefton.utils.ReefNetworkUtil;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.djc;
import xsna.fck;
import xsna.g650;
import xsna.gob;
import xsna.hmd0;
import xsna.i870;
import xsna.kyh;
import xsna.lvv0;
import xsna.mnb;
import xsna.o270;
import xsna.o9t;
import xsna.wed0;
import xsna.wk50;
import xsna.xse0;
import xsna.ymb;
import xsna.zi3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mh3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mh3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0364  */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        gvv0 view;
        izs<lvv0, s3q0> ke;
        jn50 a;
        boolean z;
        Object obj = null;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                ((rh3) this.c).o.b(new zi3.d.a(((PhotoAlbumWrapper.CommonPhotoAlbum) ((PhotoAlbumWrapper) this.d)).e));
                return s3q0.a;
            case 1:
                ymb ymbVar = (ymb) this.c;
                gob.a aVar = (gob.a) this.d;
                DialogExt dialogExt = aVar.c;
                Msg msg = aVar.a;
                DialogExt dialogExt2 = ymbVar.i;
                if (dialogExt2 == null) {
                    ymbVar.i = dialogExt;
                } else {
                    ProfilesInfo profilesInfo = dialogExt2.b;
                    if (profilesInfo != null) {
                        profilesInfo.Hb(dialogExt.b);
                    }
                }
                ymbVar.T(new mnb.h(dialogExt));
                ymbVar.k.putIfAbsent(Integer.valueOf(msg.d), new ymb.a(msg, z2, aVar.b));
                ymbVar.V();
                return s3q0.a;
            case 2:
                return new xwe(((iff) this.c).f().d6(), (Context) this.d);
            case 3:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar2 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) this.c;
                wk50.a aVar3 = (wk50.a) this.d;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d(aVar3, false);
                aVar3.a(c.r.C1015r.b);
                aVar2.c.b(kyh.a.k.a);
                return s3q0.a;
            case 4:
                hrh hrhVar = (hrh) this.c;
                hrhVar.e0().b(((Hint) this.d).b);
                hrhVar.e0().detach();
                return s3q0.a;
            case 5:
                fck fckVar = (fck) this.c;
                fck.a.C2864a c2864a = (fck.a.C2864a) this.d;
                ww50 v = s200.v(fckVar.requireContext());
                if (v != null) {
                    v.S(c2864a);
                }
                return s3q0.a;
            case 6:
                xal xalVar = (xal) this.c;
                bgk0 bgk0Var = (bgk0) this.d;
                synchronized (xalVar) {
                    try {
                        l4b0 l4b0Var = xalVar.m;
                        l4b0Var.getClass();
                        if (!l4b0Var.d) {
                            xalVar.d();
                        }
                        xalVar.m.a.p(bgk0Var);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s3q0.a;
            case 7:
                com.vk.core.fragments.b bVar = (com.vk.core.fragments.b) this.c;
                FragmentImpl fragmentImpl = (FragmentImpl) this.d;
                if (epx.f(bVar.e.d, fragmentImpl.Kn())) {
                    bVar.a0();
                } else {
                    FragmentEntry Kn = fragmentImpl.Kn();
                    if (Kn != null) {
                        Iterator<T> it = bVar.e.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (epx.f(((LaunchForResultInfo) next).c, Kn.d)) {
                                    obj = next;
                                }
                            }
                        }
                        LaunchForResultInfo launchForResultInfo = (LaunchForResultInfo) obj;
                        if (launchForResultInfo != null) {
                            bVar.e.b.remove(launchForResultInfo);
                        }
                        bVar.K(Kn);
                        bVar.e.c.Fb(Kn);
                        bVar.e.c.Gb();
                        bVar.J();
                    }
                }
                return s3q0.a;
            case 8:
                izs izsVar = (izs) this.c;
                g6t g6tVar = (g6t) this.d;
                ArrayList<Integer> arrayList = h6t.a;
                izsVar.invoke(new o9t.m(new djc.a(g6tVar.c)));
                return s3q0.a;
            case 9:
                ((qmu) this.c).s6((Group) this.d, null);
                return s3q0.a;
            case 10:
                gzs gzsVar = (gzs) this.c;
                Object[] objArr = (Object[]) this.d;
                Locale locale = Locale.US;
                String str = (String) gzsVar.invoke();
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
            case 11:
                x6y x6yVar = (x6y) this.c;
                lvv0.c cVar = (lvv0.c) this.d;
                fvv0 M = x6yVar.M();
                if (M != null && (view = M.getView()) != null && (ke = view.ke()) != null) {
                    ke.invoke(cVar);
                }
                return s3q0.a;
            case 12:
                Context context = (Context) this.c;
                LabelWithCounterSettingsView labelWithCounterSettingsView = (LabelWithCounterSettingsView) this.d;
                int i = LabelWithCounterSettingsView.A;
                TextView textView = new TextView(context);
                textView.setTextAppearance(R.style.VkLegacyTypography_Headline2);
                textView.setGravity(17);
                textView.setTextColor(b6g.a(R.attr.vk_ui_text_contrast_themed, context));
                ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
                float f = 12;
                ((ViewGroup.MarginLayoutParams) bVar2).leftMargin = iah0.a(f);
                textView.setGravity(16);
                float f2 = 6;
                float f3 = 2;
                textView.setPadding(iah0.a(f2), iah0.a(f3), iah0.a(f2), iah0.a(f3));
                bVar2.i = 0;
                bVar2.l = 0;
                bVar2.f = labelWithCounterSettingsView.getTitleView().getId();
                textView.setLayoutParams(bVar2);
                wng0 wng0Var = new wng0();
                wng0.e(iah0.a(f), wng0Var);
                wng0Var.b(e3m.f(R.attr.vk_ui_background_accent_themed, context));
                textView.setBackground(wng0Var);
                textView.setIncludeFontPadding(false);
                textView.setText(R.string.vkim_badge_new);
                return textView;
            case 13:
                return new eq00(((com.vk.clips.sdk.shared.item.market_ads.b) this.c).h, new d11(e3m.a(R.dimen.clip_owner_avatar_height, (Context) this.d)));
            case 14:
                return new ti((Context) this.c, new ow4((yn40) this.d, 6));
            case 15:
                um50 um50Var = (um50) this.c;
                hn50 hn50Var = (hn50) this.d;
                mn50<State, TaskId, InTask, OutTask, TaskExecution, Patch, Event> mn50Var = um50Var.h.b;
                if (mn50Var.B(hn50Var) && (a = mn50Var.F(hn50Var).a(mn50Var.n().e(), hn50Var)) != null) {
                    mn50Var.n().g(hn50Var.getId(), a);
                }
                return s3q0.a;
            case 16:
                mo60 mo60Var = (mo60) this.c;
                return new cr60(new so60((AtomicReference) mo60Var.a.b), new du60(this.d), mo60Var.L, mo60Var.M, mo60Var.I, mo60Var.O, mo60Var.N);
            case 17:
                m270 m270Var = (m270) this.c;
                o270 o270Var = (o270) this.d;
                int i2 = o270.a.$EnumSwitchMapping$0[m270Var.b.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    o270Var.l.s();
                } else if (i2 != 4) {
                    if (i2 != 5) {
                        o270Var.l.b();
                    } else {
                        o270Var.l.e();
                    }
                }
                return s3q0.a;
            case 18:
                izs izsVar2 = (izs) this.c;
                i870.a aVar4 = (i870.a) this.d;
                if (!jjc.d().a()) {
                    izsVar2.invoke(aVar4.c);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 19:
                jnf jnfVar = (jnf) this.c;
                iy70 iy70Var = (iy70) this.d;
                okhttp3.o oVar = (okhttp3.o) jnfVar.invoke();
                qcn qcnVar = oVar.b;
                sb sbVar = new sb(iy70Var, 8);
                synchronized (qcnVar) {
                    qcnVar.c = sbVar;
                }
                return oVar;
            case 20:
                ((bob0) this.c).a(!((yrb0) this.d).d);
                return s3q0.a;
            case 21:
                otb0 otb0Var = (otb0) this.c;
                PollInfo a2 = otb0Var.a(new JSONObject((String) this.d).getJSONObject("poll"));
                vtb0.a().a((Context) otb0Var.b, a2.c, a2.b, a2.d);
                return s3q0.a;
            case 22:
                ((izs) this.c).invoke(new wed0.b(((PrivacyViewState.c) this.d).a));
                return s3q0.a;
            case 23:
                ((izs) this.c).invoke((hmd0.a) this.d);
                return s3q0.a;
            case 24:
                ((xse0.a) this.c).b.b((bl2) this.d);
                return s3q0.a;
            case 25:
                dof0 dof0Var = (dof0) this.c;
                List list = (List) this.d;
                enf0 enf0Var = dof0Var.a;
                ReefNetworkUtil reefNetworkUtil = enf0Var.a;
                ArrayList arrayList2 = new ArrayList();
                if (enf0Var.c.a() < 18) {
                    return j5g.V(arrayList2);
                }
                if (list.size() > 2) {
                    return j5g.V(arrayList2);
                }
                if (list.isEmpty()) {
                    dnf0 dnf0Var = enf0Var.d;
                    if (dnf0Var != null) {
                        arrayList2.add(dnf0Var.b());
                        enf0Var.d = null;
                    }
                    dnf0 dnf0Var2 = enf0Var.e;
                    if (dnf0Var2 != null) {
                        arrayList2.add(dnf0Var2.b());
                        enf0Var.e = null;
                    }
                    return j5g.V(arrayList2);
                }
                if (list.size() == 1) {
                    dnf0 a3 = reefNetworkUtil.a((CellInfo) j5g.Y(list));
                    dnf0 dnf0Var3 = enf0Var.d;
                    if (dnf0Var3 == null) {
                        dnf0 d = dnf0.d(a3, false, null, 8191);
                        enf0Var.d = d;
                        arrayList2.add(d.a());
                    } else if (dnf0Var3.e(a3)) {
                        dnf0 dnf0Var4 = enf0Var.d;
                        arrayList2.add(dnf0Var4 != null ? dnf0Var4.b() : null);
                        dnf0 dnf0Var5 = enf0Var.e;
                        if (dnf0Var5 == null) {
                            dnf0 d2 = dnf0.d(a3, false, null, 8191);
                            enf0Var.d = d2;
                            arrayList2.add(d2.a());
                        } else {
                            enf0Var.d = dnf0.d(dnf0Var5, false, null, 8191);
                            enf0Var.e = null;
                            if (!r10.e(a3)) {
                                dnf0 dnf0Var6 = enf0Var.d;
                                enf0Var.d = dnf0Var6 != null ? dnf0Var6.c(reefNetworkUtil.e((CellInfo) j5g.Y(list))) : null;
                            } else {
                                dnf0 dnf0Var7 = enf0Var.d;
                                arrayList2.add(dnf0Var7 != null ? dnf0Var7.b() : null);
                                enf0Var.d = dnf0.d(a3, false, null, 8191);
                            }
                            dnf0 dnf0Var8 = enf0Var.d;
                            arrayList2.add(dnf0Var8 != null ? dnf0Var8.a() : null);
                        }
                    } else {
                        dnf0 dnf0Var9 = enf0Var.d;
                        dnf0 c = dnf0Var9 != null ? dnf0Var9.c(reefNetworkUtil.e((CellInfo) j5g.Y(list))) : null;
                        enf0Var.d = c;
                        if (enf0Var.e != null) {
                            arrayList2.add(c != null ? c.a() : null);
                            dnf0 dnf0Var10 = enf0Var.e;
                            arrayList2.add(dnf0Var10 != null ? dnf0Var10.b() : null);
                            enf0Var.e = null;
                        }
                    }
                    z = true;
                    if (list.size() == 2) {
                        dnf0 a4 = reefNetworkUtil.a((CellInfo) j5g.Y(list));
                        dnf0 a5 = reefNetworkUtil.a((CellInfo) list.get(1));
                        dnf0 dnf0Var11 = enf0Var.d;
                        if (dnf0Var11 == null) {
                            enf0Var.d = dnf0.d(a4, false, null, 8191);
                            enf0Var.e = dnf0.d(a5, false, null, 8191);
                            dnf0 dnf0Var12 = enf0Var.d;
                            arrayList2.add(dnf0Var12 != null ? dnf0Var12.a() : null);
                            dnf0 dnf0Var13 = enf0Var.e;
                            arrayList2.add(dnf0Var13 != null ? dnf0Var13.a() : null);
                        } else if (dnf0Var11.e(a4)) {
                            if (enf0Var.d == null || !(!r11.e(a5))) {
                                dnf0 dnf0Var14 = enf0Var.d;
                                arrayList2.add(dnf0Var14 != null ? dnf0Var14.b() : null);
                                dnf0 dnf0Var15 = enf0Var.e;
                                if (dnf0Var15 == null) {
                                    dnf0 d3 = dnf0.d(a4, false, null, 8191);
                                    enf0Var.d = d3;
                                    arrayList2.add(d3.a());
                                    dnf0 d4 = dnf0.d(a5, false, null, 8191);
                                    enf0Var.e = d4;
                                    arrayList2.add(d4.a());
                                } else {
                                    if (dnf0Var15.e(a4)) {
                                        dnf0 d5 = dnf0.d(a4, false, null, 8191);
                                        enf0Var.d = d5;
                                        arrayList2.add(d5.a());
                                        dnf0 dnf0Var16 = enf0Var.e;
                                        if (dnf0Var16 == null || !dnf0Var16.e(a5)) {
                                            dnf0 dnf0Var17 = enf0Var.e;
                                            enf0Var.e = dnf0Var17 != null ? dnf0Var17.c(reefNetworkUtil.e((CellInfo) list.get(1))) : null;
                                        } else {
                                            dnf0 dnf0Var18 = enf0Var.e;
                                            arrayList2.add(dnf0Var18 != null ? dnf0Var18.b() : null);
                                            enf0Var.e = dnf0.d(a5, false, null, 8191);
                                        }
                                    } else {
                                        dnf0 d6 = dnf0.d(a5, false, null, 8191);
                                        enf0Var.d = d6;
                                        arrayList2.add(d6.a());
                                        dnf0 dnf0Var19 = enf0Var.e;
                                        enf0Var.e = dnf0Var19 != null ? dnf0Var19.c(reefNetworkUtil.e((CellInfo) list.get(1))) : null;
                                    }
                                    dnf0 dnf0Var20 = enf0Var.e;
                                    arrayList2.add(dnf0Var20 != null ? dnf0Var20.a() : null);
                                }
                            } else {
                                dnf0 dnf0Var21 = enf0Var.d;
                                enf0Var.d = dnf0Var21 != null ? dnf0Var21.c(reefNetworkUtil.e((CellInfo) list.get(1))) : null;
                                dnf0 dnf0Var22 = enf0Var.e;
                                if (dnf0Var22 == null) {
                                    enf0Var.e = dnf0.d(a4, false, null, 8191);
                                    dnf0 dnf0Var23 = enf0Var.d;
                                    arrayList2.add(dnf0Var23 != null ? dnf0Var23.a() : null);
                                    dnf0 dnf0Var24 = enf0Var.e;
                                    arrayList2.add(dnf0Var24 != null ? dnf0Var24.a() : null);
                                } else if (dnf0Var22.e(a4)) {
                                    dnf0 dnf0Var25 = enf0Var.d;
                                    arrayList2.add(dnf0Var25 != null ? dnf0Var25.a() : null);
                                    dnf0 dnf0Var26 = enf0Var.e;
                                    arrayList2.add(dnf0Var26 != null ? dnf0Var26.b() : null);
                                    dnf0 d7 = dnf0.d(a4, false, null, 8191);
                                    enf0Var.e = d7;
                                    arrayList2.add(d7.a());
                                } else {
                                    dnf0 dnf0Var27 = enf0Var.e;
                                    enf0Var.e = dnf0Var27 != null ? dnf0Var27.c(reefNetworkUtil.e((CellInfo) j5g.Y(list))) : null;
                                }
                            }
                        } else {
                            dnf0 dnf0Var28 = enf0Var.d;
                            enf0Var.d = dnf0Var28 != null ? dnf0Var28.c(reefNetworkUtil.e((CellInfo) j5g.Y(list))) : null;
                            dnf0 dnf0Var29 = enf0Var.e;
                            if (dnf0Var29 == null) {
                                dnf0 d8 = dnf0.d(a5, false, null, 8191);
                                enf0Var.e = d8;
                                arrayList2.add(d8.a());
                            } else if (dnf0Var29.e(a5)) {
                                dnf0 dnf0Var30 = enf0Var.e;
                                arrayList2.add(dnf0Var30 != null ? dnf0Var30.b() : null);
                                dnf0 d9 = dnf0.d(a5, false, null, 8191);
                                enf0Var.e = d9;
                                arrayList2.add(d9.a());
                            } else {
                                dnf0 dnf0Var31 = enf0Var.e;
                                enf0Var.e = dnf0Var31 != null ? dnf0Var31.c(reefNetworkUtil.e((CellInfo) list.get(1))) : null;
                            }
                        }
                        return z2 ? j5g.V(arrayList2) : EmptyList.b;
                    }
                    z2 = z;
                    if (z2) {
                    }
                }
                z = false;
                if (list.size() == 2) {
                }
                z2 = z;
                if (z2) {
                }
                break;
            case 26:
                znj0 znj0Var = (znj0) this.c;
                df90 df90Var = (df90) this.d;
                HorizontalRecyclerPaginationView a6 = znj0Var.h().a();
                if (a6 != null) {
                    a6.M9(df90Var);
                }
                return s3q0.a;
            case 27:
                adk0 adk0Var = (adk0) this.c;
                yck0 yck0Var = (yck0) this.d;
                adk0Var.m.invoke(new g650.d.c(yck0Var.b, yck0Var.c, true, 16));
                return s3q0.a;
            case 28:
                rg50 rg50Var = (rg50) this.c;
                wh50 wh50Var = (wh50) this.d;
                rg50Var.C(0);
                wh50Var.setValue(Boolean.TRUE);
                return s3q0.a;
            default:
                com.vk.video.ui.discovery.minimizable.h hVar = (com.vk.video.ui.discovery.minimizable.h) this.c;
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.d;
                if (hVar.b.e()) {
                    gVar.J.b(VideoMinimizableDiscoverySideEffect.g0.a);
                }
                return s3q0.a;
        }
    }
}

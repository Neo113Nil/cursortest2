package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.profile.community.creationonboarding.api.data.GroupCreationOnboardingHighlight;
import com.vk.profile.community.impl.ui.item.header.model.CommunityDescriptionItemModel;
import com.vk.profile.community.impl.ui.item.header.model.CommunityTrustMarkItemModel;
import com.vk.profile.core.info_items.PostingCountersWithButtonItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.h490;
import xsna.if6;
import xsna.r4h;
import xsna.xrh;

/* compiled from: CommunityHeaderSharedItemsFactory.kt */
/* loaded from: classes5.dex */
public abstract class d4h extends if6<List<? extends r4h>> {
    public final defpackage.t c;
    public final ExtendedCommunityProfile d;
    public final t2o e;
    public final com.vk.movika.sdk.base.presenter.c f;
    public final ynh g;
    public final o3h h;
    public final yte i;
    public final izs<View, s3q0> j;
    public final Lifecycle k;
    public final f5z l;
    public final UserId m;
    public final String n;
    public final e3h o;
    public final int p;
    public final Object q;
    public final Object r;

    public d4h(Context context, defpackage.t tVar, ExtendedCommunityProfile extendedCommunityProfile, t2o t2oVar, com.vk.movika.sdk.base.presenter.c cVar, ynh ynhVar, o3h o3hVar, yte yteVar, izs izsVar, Lifecycle lifecycle, f5z f5zVar) {
        super(context);
        this.c = tVar;
        this.d = extendedCommunityProfile;
        this.e = t2oVar;
        this.f = cVar;
        this.g = ynhVar;
        this.h = o3hVar;
        this.i = yteVar;
        this.j = izsVar;
        this.k = lifecycle;
        this.l = f5zVar;
        this.m = bwd0.i(extendedCommunityProfile);
        this.n = "club" + bwd0.i(extendedCommunityProfile).b;
        this.o = new e3h();
        this.p = R.layout.item_community_custom_badges;
        te0 te0Var = new te0(10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, te0Var);
        this.r = msy.a(lazyThreadSafetyMode, new c6(8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v77, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.if6
    public final if6<List<? extends r4h>>.c[] a(List<? extends r4h> list) {
        if6.c cVar;
        we6 we6Var;
        we6 pbhVar;
        we6 vdhVar;
        we6 dwhVar;
        we6 we6Var2;
        we6 q0hVar;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            ?? r4 = 0;
            if (!it.hasNext()) {
                return (if6.c[]) arrayList.toArray(new if6.c[0]);
            }
            r4h r4hVar = (r4h) it.next();
            List<s4h> list2 = r4hVar.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (true) {
                int i = 6;
                if (!it2.hasNext()) {
                    break;
                }
                s4h s4hVar = (s4h) it2.next();
                we6 d = d(s4hVar);
                if (d == null) {
                    boolean z = s4hVar instanceof gpg;
                    int i2 = 8;
                    defpackage.t tVar = this.c;
                    ynh ynhVar = this.g;
                    if (z) {
                        fpg fpgVar = new fpg((gpg) s4hVar, (wvw) ynhVar.K0.getValue(), ynhVar.d(), new ibd(tVar.invoke(), 1), this.i, this.j);
                        fpgVar.n = iah0.a(8);
                        we6Var2 = fpgVar;
                    } else if (s4hVar instanceof zpg) {
                        zpg zpgVar = (zpg) s4hVar;
                        d = new ypg(0, zpgVar.b, zpgVar.c, zpgVar.d, zpgVar.e, zpgVar.f, new s3h(this));
                    } else {
                        int i3 = 11;
                        if (s4hVar instanceof lqg) {
                            q0hVar = new kqg(r4, new com.vk.movika.sdk.base.ui.i(i3, this, (lqg) s4hVar));
                        } else if (s4hVar instanceof wrg) {
                            wrg wrgVar = (wrg) s4hVar;
                            q0hVar = new vrg(wrgVar, new fg1(i, wrgVar, this));
                        } else {
                            if (s4hVar instanceof yrg) {
                                yrg yrgVar = (yrg) s4hVar;
                                pbhVar = new xrg(yrgVar, new hn0(i2, this, yrgVar));
                                pbhVar.e = iah0.a(yrgVar.c ? 4 : 16);
                            } else if (s4hVar instanceof nsg) {
                                nsg nsgVar = (nsg) s4hVar;
                                pbhVar = new msg(nsgVar, new uh3(i2, this, nsgVar), new com.vk.movika.sdk.base.flow.binding.g(9, this, nsgVar));
                            } else if (s4hVar instanceof psg) {
                                we6Var2 = new osg((psg) s4hVar);
                            } else if (s4hVar instanceof o0h) {
                                o0h o0hVar = (o0h) s4hVar;
                                q0hVar = new q0h(o0hVar, new mu1(i3, this, o0hVar));
                            } else {
                                int i4 = 26;
                                if (s4hVar instanceof r0h) {
                                    r0h r0hVar = (r0h) s4hVar;
                                    ExtendedUserProfile.f fVar = r0hVar.b;
                                    Image image = fVar.c;
                                    d = new h490(new h490.b(image != 0 ? image.Cb(iah0.a(48), r4, true).d.d : null), ynhVar.e().d(fVar.a, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382)), fVar.e, this.p, new kgb(1, r0hVar, this), new ld(r0hVar, i4));
                                } else {
                                    int i5 = 3;
                                    if (s4hVar instanceof CommunityDescriptionItemModel) {
                                        v0h v0hVar = new v0h((CommunityDescriptionItemModel) s4hVar, ynhVar.e(), new z4f(this, i), new c5f(this, i5), new r3h(this, r4));
                                        v0hVar.e = r4;
                                        we6Var2 = v0hVar;
                                    } else {
                                        int i6 = 27;
                                        if (s4hVar instanceof mzh) {
                                            pbhVar = new lzh((mzh) s4hVar, new ry0(this, i6));
                                        } else if (s4hVar instanceof j2h) {
                                            we6Var2 = new i2h((j2h) s4hVar, ynhVar.e());
                                        } else {
                                            int i7 = 29;
                                            if (s4hVar instanceof o5h) {
                                                we6Var2 = new d5h((o5h) s4hVar, new ul1(this, i7), (VkOnboardingComponent) ynhVar.p0.getValue(), ((Boolean) this.q.getValue()).booleanValue());
                                            } else {
                                                int i8 = 28;
                                                if (s4hVar instanceof nah) {
                                                    pbhVar = new mah((nah) s4hVar, new on(this, i8));
                                                    pbhVar.e = r4;
                                                } else if (s4hVar instanceof ech) {
                                                    d = new cch((ech) s4hVar, new lp1(tVar.invoke(), 3), new kpd(tVar.invoke(), 1), new mre(this, i), new frg(this, 1));
                                                } else if (s4hVar instanceof uch) {
                                                    uch uchVar = (uch) s4hVar;
                                                    pbhVar = new tch(uchVar, new q3h((int) r4, this, uchVar));
                                                } else {
                                                    boolean z2 = s4hVar instanceof wch;
                                                    Context context = this.a;
                                                    if (z2) {
                                                        wch wchVar = (wch) s4hVar;
                                                        egc0 egc0Var = (egc0) this.f.invoke();
                                                        if (egc0Var != null) {
                                                            boolean z3 = wchVar.h;
                                                            ?? r12 = this.r;
                                                            if (z3) {
                                                                PostingCountersWithButtonItem c = c(wchVar, PostingCountersWithButtonItem.CommunityPostingButton.PUBLISH);
                                                                egc0Var.n7(((Boolean) r12.getValue()).booleanValue() ? hbh0.b(20, context) : hbh0.b(24, context));
                                                                we6Var2 = c;
                                                            } else if (wchVar.i) {
                                                                PostingCountersWithButtonItem c2 = c(wchVar, PostingCountersWithButtonItem.CommunityPostingButton.SUGGEST);
                                                                egc0Var.m(context.getString(R.string.posting_suggest_post));
                                                                egc0Var.n7(((Boolean) r12.getValue()).booleanValue() ? hbh0.b(20, context) : hbh0.b(24, context));
                                                                we6Var2 = c2;
                                                            }
                                                        }
                                                        we6Var2 = null;
                                                    } else if (s4hVar instanceof ydh) {
                                                        we6Var2 = new xdh((ydh) s4hVar);
                                                    } else {
                                                        boolean z4 = s4hVar instanceof ash;
                                                        o3h o3hVar = this.h;
                                                        if (z4) {
                                                            ash ashVar = (ash) s4hVar;
                                                            if ((o3hVar != null ? o3hVar.a() : null) instanceof xrh.b) {
                                                                we6Var2 = new zrh(ashVar, new z3h(0, this.h, o3h.class, "onButtonClicked", "onButtonClicked(Lcom/vk/onboarding/api/stat/VkOnboardingStat$Event;)V", 0), new a4h(0, this.h, o3h.class, "onDismiss", "onDismiss(Lcom/vk/onboarding/api/stat/VkOnboardingStat$Event;)V", 0));
                                                            }
                                                            d = null;
                                                        } else if (s4hVar instanceof fxh) {
                                                            pbhVar = new exh((fxh) s4hVar, new b4h(tVar.invoke()));
                                                            pbhVar.e = iah0.a((float) r4);
                                                        } else {
                                                            boolean z5 = s4hVar instanceof d2i;
                                                            UserId userId = this.m;
                                                            if (z5) {
                                                                we6Var2 = new c2i(new d2i(userId), (me10) ynhVar.e0.getValue());
                                                            } else {
                                                                if (s4hVar instanceof t2i) {
                                                                    dwhVar = new s2i((t2i) s4hVar, ynhVar);
                                                                } else if (s4hVar instanceof w4i) {
                                                                    we6Var2 = new v4i((w4i) s4hVar, new cwg(this, 1), new defpackage.f(this, i6), new c4h(2, tVar.invoke(), d3h.class, "handleActionButton", "handleActionButton(Landroid/view/View;Lcom/vk/profile/community/impl/ui/tag/CommunityActionTags;)V", 0));
                                                                } else if (s4hVar instanceof f5i) {
                                                                    dwhVar = new e5i((f5i) s4hVar, ynhVar);
                                                                } else if (s4hVar instanceof h5i) {
                                                                    we6Var2 = new fnx0((h5i) s4hVar, new n9b(tVar.invoke(), 3));
                                                                } else {
                                                                    int i9 = 7;
                                                                    int i10 = 5;
                                                                    if (s4hVar instanceof mru) {
                                                                        mru mruVar = (mru) s4hVar;
                                                                        vdhVar = new lru(mruVar.b, mruVar.c, mruVar.d, new ire(this, i10), new cm(i9, this, mruVar));
                                                                    } else if (s4hVar instanceof bxg) {
                                                                        we6Var2 = new axg((bxg) s4hVar, new g5(this, i6), new i70(this, 29));
                                                                    } else if (s4hVar instanceof c0h) {
                                                                        c0h c0hVar = (c0h) s4hVar;
                                                                        h0h Zd = ynhVar.b().Zd();
                                                                        GroupCreationOnboardingHighlight groupCreationOnboardingHighlight = GroupCreationOnboardingHighlight.TITLE;
                                                                        boolean d2 = Zd.d(userId, groupCreationOnboardingHighlight);
                                                                        if (!d2) {
                                                                            Zd.c(userId, groupCreationOnboardingHighlight);
                                                                        }
                                                                        dwhVar = new a0h(c0hVar, !d2, new i5f(this, i10), new pff(this, 6));
                                                                    } else {
                                                                        int i11 = 2;
                                                                        if (s4hVar instanceof kug) {
                                                                            we6Var2 = new jug((kug) s4hVar, new wpg(this, i11));
                                                                        } else if (s4hVar instanceof ewh) {
                                                                            ((d3h) tVar.invoke()).m.a(userId);
                                                                            dwhVar = new dwh((ewh) s4hVar, new t3h(this, 0));
                                                                        } else if (s4hVar instanceof mdh) {
                                                                            we6Var2 = new ldh((mdh) s4hVar, new sz(this, 26));
                                                                        } else if (s4hVar instanceof wdh) {
                                                                            vdhVar = new vdh((wdh) s4hVar, new ic(this, 28), new dne(this, 6), new h9(this, 26), new com.vk.movika.sdk.base.presenter.b(this, 21), new qc(this, 25), new w3h(this), new x3h(this), new y3h(this));
                                                                        } else if (s4hVar instanceof z1h) {
                                                                            z1h z1hVar = (z1h) s4hVar;
                                                                            pbhVar = new y1h(z1hVar, new yqf(this, i11), new v3h(2, tVar.invoke(), d3h.class, "handleActionButton", "handleActionButton(Landroid/view/View;Lcom/vk/profile/community/impl/ui/tag/CommunityActionTags;)V", 0), new k7f(this, 3));
                                                                            pbhVar.e = z1hVar.k ? iah0.a(12) : 0;
                                                                        } else if (s4hVar instanceof iyn) {
                                                                            pbhVar = new z0o((iyn) s4hVar, new com.vk.movika.sdk.base.observable.w(this, 28), this.e.a(), new p3h(this, 0));
                                                                        } else if (s4hVar instanceof j9h) {
                                                                            we6Var2 = new i9h(context, this.k, (j9h) s4hVar, new i3b(tVar.invoke(), 3));
                                                                        } else if (s4hVar instanceof vpg) {
                                                                            we6Var2 = new fd0(((vpg) s4hVar).b, new u3h(this));
                                                                        } else if (s4hVar instanceof CommunityTrustMarkItemModel) {
                                                                            CommunityTrustMarkItemModel communityTrustMarkItemModel = (CommunityTrustMarkItemModel) s4hVar;
                                                                            we6Var2 = new k4i(communityTrustMarkItemModel, new hh1(this, i6), new com.vk.movika.sdk.android.defaultplayer.container.e(i9, this, communityTrustMarkItemModel));
                                                                        } else if (s4hVar instanceof upg) {
                                                                            we6Var2 = new tpg((upg) s4hVar, new z8f(this, 3), new l00(this, 28));
                                                                        } else {
                                                                            if (s4hVar instanceof wbh) {
                                                                                wbh wbhVar = (wbh) s4hVar;
                                                                                pbhVar = new pbh(wbhVar, new ozf(this, i10), new v43(i9, wbhVar, this), o3hVar != null ? o3hVar.x() : null);
                                                                            }
                                                                            d = null;
                                                                        }
                                                                    }
                                                                    d = vdhVar;
                                                                }
                                                                d = dwhVar;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            d = pbhVar;
                        }
                        d = q0hVar;
                    }
                    d = we6Var2;
                }
                if (d != null) {
                    if (s4hVar.a) {
                        Integer valueOf = d instanceof bsg ? Integer.valueOf(iah0.a(0)) : null;
                        int intValue = valueOf != null ? valueOf.intValue() : d instanceof fpg ? iah0.a(16) : d instanceof v0h ? iah0.a(10) : ((d instanceof xrg) || (d instanceof zrh) || (d instanceof exh)) ? 0 : iah0.a(12);
                        if (d instanceof fpg) {
                            ((fpg) d).o = intValue;
                        } else {
                            d.d = intValue;
                        }
                    }
                    we6Var = d;
                } else {
                    we6Var = null;
                }
                if (we6Var != null) {
                    arrayList2.add(we6Var);
                }
                r4 = 0;
            }
            if (arrayList2.isEmpty()) {
                cVar = null;
            } else {
                cVar = new if6.c(new if6.f(new i3f(arrayList2, 1)));
                this.o.getClass();
                r4h.a aVar = r4hVar.b;
                if (epx.f(aVar, r4h.a.c.a)) {
                    cVar.b = iah0.a(4);
                } else if (epx.f(aVar, r4h.a.d.a)) {
                    cVar.b = iah0.a(12);
                } else if (epx.f(aVar, r4h.a.C3596a.a)) {
                    float f = 6;
                    cVar.b = iah0.a(f);
                    cVar.a = iah0.a(f);
                } else if (epx.f(aVar, r4h.a.b.a)) {
                    cVar.c = false;
                } else if (aVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
    }

    public final PostingCountersWithButtonItem c(wch wchVar, PostingCountersWithButtonItem.CommunityPostingButton communityPostingButton) {
        egc0 egc0Var;
        RecyclerView.o layoutManager;
        PostingCreationEntryPoint postingCreationEntryPoint = PostingCreationEntryPoint.GroupWallButton;
        if (this.g.a().o().a.b <= 0 || (egc0Var = (egc0) this.f.invoke()) == null) {
            return null;
        }
        ExtendedCommunityProfile extendedCommunityProfile = this.d;
        egc0Var.u6(extendedCommunityProfile);
        ViewGroup V3 = egc0Var.V3();
        bwt0.Z(R.attr.vk_ui_background_content, V3);
        ViewParent parent = V3.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.removeView(V3);
        }
        egc0Var.G5(postingCreationEntryPoint);
        Context context = this.a;
        egc0Var.m(context.getString(R.string.post_create_title));
        boolean z = wchVar.b;
        boolean z2 = wchVar.d;
        egc0Var.Y5(z);
        egc0Var.H4(z2);
        egc0Var.h7(wchVar.e);
        if (wchVar.c) {
            egc0Var.F3();
        }
        egc0Var.M2(context.getString(wchVar.g ? R.string.accessibility_suggest_post_with_attachment : R.string.accessibility_make_post_with_attachment));
        boolean z3 = wchVar.f;
        egc0Var.s7(z3);
        boolean z4 = !z3 && z;
        egc0Var.S3((z2 && z4) ? false : z4);
        egc0Var.R2(wchVar.j);
        return new PostingCountersWithButtonItem(V3, communityPostingButton, w2h.b(extendedCommunityProfile));
    }

    public abstract we6 d(s4h s4hVar);
}

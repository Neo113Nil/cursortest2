package xsna;

import android.view.ViewGroup;
import com.vk.clips.design.view.author.ClipAuthorCellView;
import com.vk.clips.design.view.author.a;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsView;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.fm70;
import xsna.jvm0;
import xsna.l1n0;
import xsna.x590;

/* compiled from: ClipItemOverlayRedesignRenderer.kt */
/* loaded from: classes17.dex */
public final class e2d implements i2d {
    public final Object a;
    public final yux b;
    public final hlh0 c;
    public final VkBlurContentView d;
    public boolean e;
    public boolean f;
    public i390 g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    /* compiled from: ClipItemOverlayRedesignRenderer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestrictionOverlayRenderDelegate.RestrictionOverlayAction.values().length];
            try {
                iArr[RestrictionOverlayRenderDelegate.RestrictionOverlayAction.ButtonClick.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e2d(Lazy lazy, final j1d j1dVar, final jlh0 jlh0Var, i3i0 i3i0Var, final cjh0 cjh0Var, yux yuxVar, kaf kafVar, boolean z, final boolean z2, VkBlurContentView vkBlurContentView) {
        this.a = lazy;
        this.b = yuxVar;
        this.c = kafVar;
        this.d = vkBlurContentView;
        this.f = z;
        u14 u14Var = new u14(3, this, i3i0Var);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, u14Var);
        this.i = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.d2d
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.gzs
            public final Object invoke() {
                e2d e2dVar = e2d.this;
                return new h1d(((x6d) e2dVar.a.getValue()).i, j1dVar, jlh0Var, cjh0Var, z2, e2dVar.d);
            }
        });
        this.j = msy.a(lazyThreadSafetyMode, new j3(5, this, j1dVar));
        this.k = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 24));
        this.l = msy.a(lazyThreadSafetyMode, new kg(7, this, j1dVar));
        this.m = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.i(this, 15));
    }

    @Override // xsna.i2d
    public final void a() {
        i390 i390Var;
        this.f = false;
        if (this.e || (i390Var = this.g) == null) {
            return;
        }
        d(i390Var);
    }

    @Override // xsna.i2d
    public final void b(boolean z) {
        i390 i390Var;
        this.e = z;
        if (z || this.f || (i390Var = this.g) == null) {
            return;
        }
        d(i390Var);
    }

    @Override // xsna.i2d
    public final void c(j2d j2dVar) {
        i390 i390Var = j2dVar instanceof i390 ? (i390) j2dVar : null;
        if (i390Var == null) {
            this.c.b(new IllegalStateException("viewState in renderer should match viewState produced by renderFactory"));
        } else if (this.e || this.f) {
            this.g = i390Var;
        } else {
            this.g = null;
            d(i390Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(i390 i390Var) {
        MainOverlayState mainOverlayState;
        boolean z;
        MainOverlayState.a aVar;
        a.InterfaceC0555a cVar;
        ImageUrl b;
        ImageUrl b2;
        qc qcVar;
        MainOverlayState.i iVar;
        String str;
        u6d u6dVar;
        g1d g1dVar;
        boolean z2;
        a.b bVar;
        a.d.C0561a c0561a;
        a.d.C0561a.InterfaceC0562a c0563a;
        String str2;
        String b3;
        u6d u6dVar2;
        g1d g1dVar2;
        fm70.a cVar2;
        MainOverlayState.c cVar3;
        MainOverlayState.c cVar4;
        e2d e2dVar = this;
        f2d f2dVar = (f2d) e2dVar.h.getValue();
        q390 q390Var = i390Var.a;
        x6d x6dVar = f2dVar.a;
        boolean z3 = q390Var.f;
        boolean z4 = q390Var.e;
        l390 l390Var = f2dVar.c;
        q390 q390Var2 = f2dVar.b;
        if (q390Var2 == null) {
            x6d x6dVar2 = l390Var.a;
            ViewGroup viewGroup = x6dVar2.h;
            if (viewGroup == null) {
                viewGroup = x6dVar2.getRootContainer();
            }
            zmp0.a(viewGroup, l390Var.c);
        } else {
            l390Var.getClass();
            biq biqVar = l390Var.c;
            x6d x6dVar3 = l390Var.a;
            boolean f = epx.f(q390Var.a, q390Var2.a);
            boolean z5 = z4 != q390Var2.e;
            if (f && !z5) {
                biqVar.setDuration(z3 != q390Var2.f ? 200L : 300L);
                if (x6dVar3.getRootContainer().isAttachedToWindow()) {
                    zmp0.b(x6dVar3.getRootContainer());
                }
                ViewGroup viewGroup2 = x6dVar3.h;
                if (viewGroup2 == null) {
                    viewGroup2 = x6dVar3.getRootContainer();
                }
                zmp0.a(viewGroup2, biqVar);
            } else if (x6dVar3.getRootContainer().isAttachedToWindow()) {
                zmp0.b(x6dVar3.getRootContainer());
            }
        }
        x6dVar.i.b.setVisibility(q390Var.c ? 0 : 8);
        x6dVar.j.setVisibility(q390Var.d ? 0 : 8);
        x6dVar.k.setVisibility(z4 ? 0 : 8);
        l390Var.b.h(q390Var.b);
        x6dVar.m.setVisibility(z3 ? 0 : 8);
        x6dVar.o.setVisibility(q390Var.g ? 0 : 8);
        x6dVar.l.setVisibility(q390Var.h ? 0 : 8);
        f2dVar.b = q390Var;
        h1d h1dVar = (h1d) e2dVar.i.getValue();
        MainOverlayState mainOverlayState2 = i390Var.b;
        rf00 rf00Var = h1dVar.e;
        u6d u6dVar3 = h1dVar.b;
        g1d g1dVar3 = h1dVar.a;
        if (mainOverlayState2 instanceof MainOverlayState.i) {
            MainOverlayState.i iVar2 = (MainOverlayState.i) mainOverlayState2;
            MainOverlayState.a aVar2 = iVar2.k;
            String str3 = iVar2.a;
            MainOverlayState.f fVar = iVar2.f;
            DescriptionViewState descriptionViewState = iVar2.e;
            MainOverlayState.g gVar = iVar2.d;
            MainOverlayState mainOverlayState3 = h1dVar.c;
            rf00Var.getClass();
            g1d g1dVar4 = rf00Var.a;
            boolean z6 = mainOverlayState3 instanceof MainOverlayState.i;
            if (!epx.f(str3, mainOverlayState3 != null ? mainOverlayState3.F() : null) || !z6) {
                zmp0.b(g1dVar4.b);
            } else if (z6) {
                MainOverlayState.i iVar3 = (MainOverlayState.i) mainOverlayState3;
                if (gVar.equals(iVar3.d)) {
                    boolean f2 = epx.f(descriptionViewState, iVar3.e);
                    boolean f3 = epx.f(fVar, iVar3.f);
                    boolean equals = aVar2.equals(iVar3.k);
                    if (!f2 || !equals || !f3 || !f3) {
                        zmp0.b(g1dVar4.b);
                        zmp0.a(g1dVar4.b, rf00Var.b);
                    }
                } else {
                    zmp0.b(g1dVar4.b);
                }
            }
            MainOverlayState mainOverlayState4 = h1dVar.c;
            boolean z7 = epx.f(str3, mainOverlayState4 != null ? mainOverlayState4.F() : null) && (mainOverlayState4 instanceof MainOverlayState.i);
            MainOverlayState.h hVar = iVar2.b;
            boolean z8 = hVar.c;
            boolean z9 = hVar.b;
            MainOverlayState.i iVar4 = h1dVar.d;
            if (!hVar.equals(iVar4 != null ? iVar4.b : null)) {
                ClipFeedSideControlsView clipFeedSideControlsView = g1dVar3.d;
                MainOverlayState.i iVar5 = h1dVar.d;
                MainOverlayState.h hVar2 = iVar5 != null ? iVar5.b : null;
                boolean z10 = hVar2 != null && z9 == hVar2.b;
                boolean z11 = hVar2 != null && z8 == hVar2.c;
                if (!z10 || !z11) {
                    clipFeedSideControlsView.o(z9);
                    clipFeedSideControlsView.Z3(z8);
                }
                clipFeedSideControlsView.k1(k15.z(hVar.a));
            }
            bmc bmcVar = h1dVar.g;
            x590 x590Var = iVar2.c;
            if (x590Var.equals(bmcVar.e) && gVar.equals(bmcVar.f)) {
                mainOverlayState = mainOverlayState2;
                z = z7;
                u6dVar = u6dVar3;
                g1dVar = g1dVar3;
                iVar = iVar2;
                aVar = aVar2;
            } else {
                ClipAuthorCellView clipAuthorCellView = bmcVar.a;
                x590.a aVar3 = x590Var.a;
                boolean z12 = bmcVar.c;
                if (aVar3 instanceof x590.a.b) {
                    cVar = a.InterfaceC0555a.C0556a.a;
                    mainOverlayState = mainOverlayState2;
                    z = z7;
                    aVar = aVar2;
                } else if (aVar3 instanceof x590.a.c) {
                    x590.a.c cVar5 = (x590.a.c) aVar3;
                    String str4 = cVar5.b;
                    SdkOwner sdkOwner = cVar5.a;
                    if (str4 == null) {
                        if (sdkOwner != null) {
                            mainOverlayState = mainOverlayState2;
                            aVar = aVar2;
                            ImageUrl b4 = sdkOwner.d.b(hbh0.b(32, clipAuthorCellView.getContext()));
                            if (b4 != null) {
                                str4 = b4.b;
                            }
                        } else {
                            mainOverlayState = mainOverlayState2;
                            aVar = aVar2;
                        }
                        str4 = null;
                    } else {
                        mainOverlayState = mainOverlayState2;
                        aVar = aVar2;
                    }
                    ndu0 ndu0Var = (sdkOwner == null || !sdkOwner.q) ? null : new ndu0();
                    if (z12) {
                        z = z7;
                        qcVar = new qc(bmcVar, 11);
                    } else {
                        z = z7;
                        qcVar = null;
                    }
                    cVar = new a.InterfaceC0555a.b(str4, ndu0Var, qcVar, 1);
                } else {
                    mainOverlayState = mainOverlayState2;
                    z = z7;
                    aVar = aVar2;
                    if (!(aVar3 instanceof x590.a.C3974a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int b5 = hbh0.b(32, clipAuthorCellView.getContext());
                    x590.a.C3974a c3974a = (x590.a.C3974a) aVar3;
                    SdkOwner sdkOwner2 = c3974a.a;
                    String str5 = (sdkOwner2 == null || (b2 = sdkOwner2.d.b(b5)) == null) ? null : b2.b;
                    SdkCoOwnerItem sdkCoOwnerItem = (SdkCoOwnerItem) j5g.a0(c3974a.b);
                    cVar = new a.InterfaceC0555a.c(str5, (sdkCoOwnerItem == null || (b = sdkCoOwnerItem.c.d.b(b5)) == null) ? null : b.b, z12 ? new s5(bmcVar, 22) : null, 3);
                }
                tlo0 tlo0Var = x590Var.b;
                boolean z13 = x590Var.d instanceof x590.d.b;
                x590.b bVar2 = x590Var.c;
                iVar = iVar2;
                if (bVar2 instanceof x590.b.C3975b) {
                    str = ((x590.b.C3975b) bVar2).a;
                } else {
                    if (!(bVar2 instanceof x590.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = null;
                }
                a.c cVar6 = new a.c(tlo0Var, z13, str);
                MainOverlayState.PublicationDateState publicationDateState = gVar.a;
                x590.c cVar7 = x590Var.e;
                MainOverlayState.PublicationDateState.Visible visible = publicationDateState instanceof MainOverlayState.PublicationDateState.Visible ? (MainOverlayState.PublicationDateState.Visible) publicationDateState : null;
                String str6 = visible != null ? visible.a : null;
                x590.c.b bVar3 = cVar7 instanceof x590.c.b ? (x590.c.b) cVar7 : null;
                boolean z14 = bVar3 != null && (!bVar3.d || str6 == null);
                ListBuilder e = e43.e();
                if (z14) {
                    z2 = z14;
                    String str7 = bVar3.b;
                    String str8 = bVar3.a;
                    if (str7 != null) {
                        if (drm0.N(str7)) {
                            g1dVar = g1dVar3;
                            str2 = null;
                        } else {
                            g1dVar = g1dVar3;
                            str2 = str7;
                        }
                        u6dVar = u6dVar3;
                        if (str2 != null && (b3 = pzl.b(str8, " - ", str2)) != null) {
                            str8 = b3;
                        }
                    } else {
                        u6dVar = u6dVar3;
                        g1dVar = g1dVar3;
                    }
                    e.add(new a.b.C0560b(oq.d(tlo0.Companion, str8), bVar3.c ? a.b.InterfaceC0557a.C0559b.a : new a.b.InterfaceC0557a.C0558a(0)));
                } else {
                    u6dVar = u6dVar3;
                    g1dVar = g1dVar3;
                    z2 = z14;
                }
                if (str6 != null) {
                    e.add(new a.b.C0560b(oq.d(tlo0.Companion, str6), a.b.InterfaceC0557a.c.a));
                }
                ListBuilder g = e.g();
                if (g.isEmpty()) {
                    bVar = null;
                } else {
                    bVar = new a.b(g, z2 ? new com.vk.newsfeed.posting.mediapicker.photovk.base.a(bmcVar, 17) : null);
                }
                jvm0 jvm0Var = gVar.b;
                VkBlurContentView vkBlurContentView = bmcVar.d;
                if (jvm0Var instanceof jvm0.b) {
                    if (((jvm0.b) jvm0Var).a) {
                        vkBlurContentView.setCaptureEnabled(false);
                        c0563a = a.d.C0561a.InterfaceC0562a.b.a;
                    } else {
                        vkBlurContentView.setCaptureEnabled(true);
                        c0563a = new a.d.C0561a.InterfaceC0562a.C0563a(vkBlurContentView);
                    }
                    c0561a = new a.d.C0561a(tq.h(tlo0.Companion, R.string.clips_subscribe), c0563a, new f1(bmcVar, 14));
                } else if (jvm0Var instanceof jvm0.c) {
                    vkBlurContentView.setCaptureEnabled(true);
                    c0561a = new a.d.C0561a(tq.h(tlo0.Companion, R.string.clips_subscribed), new a.d.C0561a.InterfaceC0562a.C0563a(vkBlurContentView), new ng1(bmcVar, 16));
                } else {
                    if (!(jvm0Var instanceof jvm0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkBlurContentView.setCaptureEnabled(false);
                    c0561a = null;
                }
                clipAuthorCellView.setState(new com.vk.clips.design.view.author.a(cVar, cVar6, bVar, c0561a));
                bmcVar.e = x590Var;
                bmcVar.f = gVar;
            }
            h1dVar.f.a(descriptionViewState);
            MainOverlayState.i iVar6 = h1dVar.d;
            if (epx.f(fVar, iVar6 != null ? iVar6.f : null)) {
                g1dVar2 = g1dVar;
                u6dVar2 = u6dVar;
            } else {
                u6dVar2 = u6dVar;
                u6dVar2.a(l4d.b);
                if (fVar instanceof MainOverlayState.f.a) {
                    g1dVar2 = g1dVar;
                    f4m.j(g1dVar2.h);
                } else {
                    g1dVar2 = g1dVar;
                    if (!(fVar instanceof MainOverlayState.f.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g1dVar2.h.setVisibility(0);
                }
            }
            MainOverlayState.i iVar7 = iVar;
            boolean z15 = z;
            h1dVar.l.a(iVar7.g, z15);
            h1dVar.k.a(iVar7.h);
            MainOverlayState.c cVar8 = iVar7.i;
            MainOverlayState.i iVar8 = h1dVar.d;
            if (!epx.f(cVar8, iVar8 != null ? iVar8.i : null)) {
                u6dVar2.a(new f4d(cVar8 instanceof MainOverlayState.c.b));
                h1d.c(g1dVar2.e, cVar8);
            }
            MainOverlayState.c cVar9 = iVar7.j;
            MainOverlayState.i iVar9 = h1dVar.d;
            if (!epx.f(cVar9, iVar9 != null ? iVar9.j : null)) {
                u6dVar2.a(new g4d(cVar9 instanceof MainOverlayState.c.b));
                MainOverlayState.i iVar10 = h1dVar.d;
                if (iVar10 != null && (cVar4 = iVar10.j) != null && !h1d.b(cVar4) && h1d.b(cVar9)) {
                    u6dVar2.a(o4d.b);
                }
                MainOverlayState.i iVar11 = h1dVar.d;
                if (iVar11 != null && (cVar3 = iVar11.j) != null && !h1d.a(cVar3) && h1d.a(cVar9)) {
                    u6dVar2.a(c4d.b);
                }
                h1d.c(g1dVar2.f, cVar9);
            }
            MainOverlayState.i iVar12 = h1dVar.d;
            MainOverlayState.a aVar4 = aVar;
            if (!aVar4.equals(iVar12 != null ? iVar12.k : null)) {
                h1dVar.h.b(aVar4.a, z15);
                h1dVar.j.b(aVar4.b, z15);
            }
            List<SubtitleRenderItem> list = iVar7.l;
            MainOverlayState.i iVar13 = h1dVar.d;
            if (!epx.f(list, iVar13 != null ? iVar13.l : null)) {
                g1dVar2.n.setRenderItems(list);
            }
            boolean z16 = iVar7.m;
            MainOverlayState.i iVar14 = h1dVar.d;
            if (iVar14 == null || z16 != iVar14.m) {
                g1dVar2.o.setVisibility(z16 ? 0 : 8);
            }
            MainOverlayState.e eVar = iVar7.n;
            MainOverlayState.i iVar15 = h1dVar.d;
            if (!epx.f(eVar, iVar15 != null ? iVar15.n : null)) {
                LazyNpsView lazyNpsView = g1dVar2.p;
                if (eVar instanceof MainOverlayState.e.b) {
                    lazyNpsView.setVisibility(0);
                    MainOverlayState.e.b bVar4 = (MainOverlayState.e.b) eVar;
                    if (bVar4 instanceof MainOverlayState.e.b.a) {
                        MainOverlayState.e.b.a aVar5 = (MainOverlayState.e.b.a) eVar;
                        cVar2 = new fm70.a.b(z15, aVar5.a, aVar5.b, new m7(h1dVar, 27));
                    } else {
                        if (!(bVar4 instanceof MainOverlayState.e.b.C0664b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar2 = new fm70.a.c(z15);
                    }
                    lazyNpsView.setState(cVar2);
                } else {
                    if (!(eVar instanceof MainOverlayState.e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lazyNpsView.setState(new fm70.a.C2883a(z15));
                    if (!z15) {
                        lazyNpsView.setVisibility(8);
                    }
                }
            }
            h1dVar.i.a(iVar7.o);
            h1dVar.c = mainOverlayState;
            h1dVar.d = iVar7;
            e2dVar = this;
        } else {
            h1dVar.c = mainOverlayState2;
        }
        ((RestrictionOverlayRenderDelegate) e2dVar.j.getValue()).a(i390Var.c);
        ((ErrorOverlayRenderDelegate) e2dVar.k.getValue()).a(i390Var.d);
        ((v1d) e2dVar.l.getValue()).a(i390Var.e);
        b3d b3dVar = (b3d) e2dVar.m.getValue();
        l1n0 l1n0Var = i390Var.f;
        if (!(l1n0Var instanceof l1n0.b)) {
            b3dVar.getClass();
        } else {
            if (l1n0Var.equals(b3dVar.b)) {
                return;
            }
            l1n0.b bVar5 = (l1n0.b) l1n0Var;
            b3dVar.a.setRenderItems(bVar5.b);
            b3dVar.b = bVar5;
        }
    }
}

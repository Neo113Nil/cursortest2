package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.flex.main_screen.presentation.controllers.skaffold.TrackedScrollScaffold;
import core.flex.ui.contentaware.ContentAwareFrameLayout;
import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.section.divkit.DivkitSnippet;
import flex.theme.ThemedColor;

/* loaded from: classes4.dex */
public final class b201 extends pjm0 {
    public hlx0 A;
    public hlx0 B;
    public a201 C;
    public final hbp0 D;
    public final w0j a;
    public final b3k b;
    public final exy0 c;
    public final n530 w;
    public final ovl x;
    public final l3k y;
    public hlx0 z;

    public b201(w0j w0jVar, b3k b3kVar, exy0 exy0Var, cyl cylVar, n530 n530Var) {
        this.a = w0jVar;
        this.b = b3kVar;
        this.c = exy0Var;
        this.w = n530Var;
        new pvl();
        this.x = new ovl();
        this.y = new l3k(cylVar);
        this.D = new hbp0(new czo0(14), "TrackedScaffoldController", null);
    }

    public static void b(Div2View div2View, mds0 mds0Var) {
        if (mds0Var == null) {
            return;
        }
        xvl xvlVar = mds0Var.a;
        div2View.setData(xvlVar.b.a, xvlVar.c);
        div2View.setActionHandler(mds0Var.b);
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        ContentAwareFrameLayout contentAwareFrameLayout = (ContentAwareFrameLayout) d().y;
        if (contentAwareFrameLayout != null) {
            return contentAwareFrameLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final ContentAwareFrameLayout c() {
        hlx0 hlx0Var = this.z;
        if (hlx0Var != null) {
            ContentAwareFrameLayout contentAwareFrameLayout = (ContentAwareFrameLayout) hlx0Var.y;
            if (contentAwareFrameLayout != null) {
                return contentAwareFrameLayout;
            }
            ny61.g("Required value was null.");
        }
        return null;
    }

    public final hlx0 d() {
        hlx0 hlx0Var = this.z;
        if (hlx0Var != null) {
            return hlx0Var;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.z = new hlx0(context, this.b.a(context, this.a), this.y);
        Div2View div2View = (Div2View) d().c;
        if (div2View == null) {
            ny61.g("Required value was null.");
            return null;
        }
        ContentAwareFrameLayout c = c();
        final int i = 0;
        this.A = new hlx0(div2View, c != null ? Integer.valueOf(c.getPaddingTop()) : null, new tls(this) { // from class: z101
            public final /* synthetic */ b201 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                b201 b201Var = this.b;
                pkj pkjVar = (pkj) obj;
                switch (i2) {
                    case 0:
                        ContentAwareFrameLayout c2 = b201Var.c();
                        if (c2 != null) {
                            sb2.M(c2, pkjVar.w, 0, 13);
                            break;
                        }
                        break;
                    default:
                        ContentAwareFrameLayout c3 = b201Var.c();
                        if (c3 != null) {
                            sb2.M(c3, 0, pkjVar.w, 7);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        });
        d().s().setOnTouchListener(new cz2(13));
        Div2View s = d().s();
        ContentAwareFrameLayout c2 = c();
        final int i2 = 1;
        this.B = new hlx0(s, c2 != null ? Integer.valueOf(c2.getPaddingBottom()) : null, new tls(this) { // from class: z101
            public final /* synthetic */ b201 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                b201 b201Var = this.b;
                pkj pkjVar = (pkj) obj;
                switch (i22) {
                    case 0:
                        ContentAwareFrameLayout c22 = b201Var.c();
                        if (c22 != null) {
                            sb2.M(c22, pkjVar.w, 0, 13);
                            break;
                        }
                        break;
                    default:
                        ContentAwareFrameLayout c3 = b201Var.c();
                        if (c3 != null) {
                            sb2.M(c3, 0, pkjVar.w, 7);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        });
        this.D.a();
        FrameLayout frameLayout = (FrameLayout) d().b;
        if (frameLayout != null) {
            return frameLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        Integer num;
        Integer num2;
        hlx0 hlx0Var = this.A;
        if (hlx0Var != null && (num2 = (Integer) hlx0Var.c) != null) {
            int intValue = num2.intValue();
            ContentAwareFrameLayout c = c();
            if (c != null) {
                c.setPadding(c.getPaddingLeft(), intValue, c.getPaddingRight(), c.getPaddingBottom());
            }
        }
        hlx0 hlx0Var2 = this.B;
        if (hlx0Var2 != null && (num = (Integer) hlx0Var2.c) != null) {
            int intValue2 = num.intValue();
            ContentAwareFrameLayout c2 = c();
            if (c2 != null) {
                c2.setPadding(c2.getPaddingLeft(), c2.getPaddingTop(), c2.getPaddingRight(), intValue2);
            }
        }
        hlx0 hlx0Var3 = this.A;
        if (hlx0Var3 != null) {
            hlx0Var3.o();
        }
        this.A = null;
        hlx0 hlx0Var4 = this.B;
        if (hlx0Var4 != null) {
            hlx0Var4.o();
        }
        this.B = null;
        a201 a201Var = this.C;
        if (a201Var != null) {
            dxy0 dxy0Var = (dxy0) a201Var.c;
            if (dxy0Var != null) {
                dxy0Var.x();
            }
            a201Var.c = null;
        }
        this.C = null;
        hlx0 d = d();
        Div2View div2View = (Div2View) d.c;
        if (div2View != null) {
            div2View.cleanup();
            div2View.setActionHandler(null);
        }
        Div2View div2View2 = (Div2View) d.w;
        if (div2View2 != null) {
            div2View2.cleanup();
            div2View2.setActionHandler(null);
        }
        Div2View div2View3 = (Div2View) d.x;
        if (div2View3 != null) {
            div2View3.cleanup();
            div2View3.setActionHandler(null);
        }
        d.c = null;
        d.w = null;
        d.y = null;
        d.x = null;
        d.b = null;
        this.z = null;
        this.D.b();
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        ew2 ew2Var = (ew2) obj;
        mjm0 mjm0Var = (mjm0) ew2Var.b;
        TrackedScrollScaffold trackedScrollScaffold = mjm0Var instanceof TrackedScrollScaffold ? (TrackedScrollScaffold) mjm0Var : null;
        if (trackedScrollScaffold == null) {
            return;
        }
        pxl pxlVar = new pxl((cnr0) ew2Var.c);
        DivkitSnippet divkitSnippet = trackedScrollScaffold.a;
        n530 n530Var = this.w;
        ovl ovlVar = this.x;
        if (divkitSnippet != null) {
            Div2View div2View = (Div2View) d().c;
            if (div2View == null) {
                ny61.g("Required value was null.");
                return;
            }
            div2View.setVisibility(0);
            mds0 c = ovlVar.c(divkitSnippet, pxlVar, n530Var);
            Div2View div2View2 = (Div2View) d().c;
            if (div2View2 == null) {
                ny61.g("Required value was null.");
                return;
            }
            b(div2View2, c);
        } else {
            Div2View div2View3 = (Div2View) d().c;
            if (div2View3 == null) {
                ny61.g("Required value was null.");
                return;
            }
            div2View3.setVisibility(8);
        }
        DivkitSnippet divkitSnippet2 = trackedScrollScaffold.c;
        if (divkitSnippet2 != null) {
            d().s().setVisibility(0);
            b(d().s(), ovlVar.c(divkitSnippet2, pxlVar, n530Var));
        } else {
            d().s().setVisibility(8);
        }
        DivkitSnippet divkitSnippet3 = trackedScrollScaffold.e;
        if (divkitSnippet3 != null) {
            Div2View div2View4 = (Div2View) d().x;
            if (div2View4 == null) {
                ny61.g("Required value was null.");
                return;
            }
            div2View4.setVisibility(0);
            mds0 c2 = ovlVar.c(divkitSnippet3, pxlVar, n530Var);
            Div2View div2View5 = (Div2View) d().x;
            if (div2View5 == null) {
                ny61.g("Required value was null.");
                return;
            }
            b(div2View5, c2);
        }
        hlx0 hlx0Var = this.A;
        if (hlx0Var != null) {
            DivKitScaffoldPadding divKitScaffoldPadding = trackedScrollScaffold.b;
            hlx0Var.k(divKitScaffoldPadding != null ? divKitScaffoldPadding.a : null);
        }
        hlx0 hlx0Var2 = this.B;
        if (hlx0Var2 != null) {
            DivKitScaffoldPadding divKitScaffoldPadding2 = trackedScrollScaffold.d;
            hlx0Var2.k(divKitScaffoldPadding2 != null ? divKitScaffoldPadding2.a : null);
        }
        FrameLayout frameLayout = (FrameLayout) d().b;
        if (frameLayout == null) {
            ny61.g("Required value was null.");
            return;
        }
        exy0 exy0Var = this.c;
        a201 a201Var = new a201(exy0Var, frameLayout);
        ThemedColor themedColor = trackedScrollScaffold.f;
        dxy0 dxy0Var = (dxy0) a201Var.c;
        if (dxy0Var != null) {
            dxy0Var.x();
        }
        a201Var.c = null;
        if (themedColor == null) {
            frameLayout.setBackgroundColor(exy0Var.a(null));
        } else {
            a201Var.c = exy0Var.b(themedColor, new pjh(1, a201Var));
        }
        this.C = a201Var;
    }
}

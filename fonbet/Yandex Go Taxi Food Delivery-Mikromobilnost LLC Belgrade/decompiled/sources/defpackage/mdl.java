package defpackage;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs$TabTitleStyle;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mdl implements c4x, egk {
    public final DivEdgeInsets A;
    public final Expression B;
    public final ldl C;
    public final DivTabs$TabTitleStyle D;
    public final DivEdgeInsets E;
    public final List F;
    public final DivTransform G;
    public final List H;
    public final DivChangeTransition I;
    public final DivAppearanceTransition J;
    public final DivAppearanceTransition K;
    public final List L;
    public final List M;
    public final List N;
    public final Expression O;
    public final DivVisibilityAction P;
    public final List Q;
    public final DivSize R;
    public Integer S;
    public Integer T;
    public final DivAccessibility a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final List e;
    public final List f;
    public final DivBorder g;
    public final Expression h;
    public final List i;
    public final Expression j;
    public final List k;
    public final DivFocus l;
    public final List m;
    public final Expression n;
    public final DivSize o;
    public final String p;
    public final List q;
    public final DivLayoutProvider r;
    public final DivEdgeInsets s;
    public final DivEdgeInsets t;
    public final Expression u;
    public final Expression v;
    public final Expression w;
    public final List x;
    public final Expression y;
    public final Expression z;

    static {
        ngd0.m(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        ngd0.m(bool);
        ngd0.m(bool);
        ngd0.m(bool);
        ngd0.m(0L);
        ngd0.m(Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR));
        ngd0.m(0L);
        ngd0.m(12L);
        ngd0.m(12L);
        ngd0.m(0L);
        ngd0.m(Boolean.TRUE);
        ngd0.m(8L);
        ngd0.m(12L);
        ngd0.m(12L);
        ngd0.m(0L);
        ngd0.m(DivVisibility.VISIBLE);
    }

    public mdl(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, Expression expression5, List list4, DivFocus divFocus, List list5, Expression expression6, DivSize divSize, String str, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, DivEdgeInsets divEdgeInsets3, Expression expression12, ldl ldlVar, DivTabs$TabTitleStyle divTabs$TabTitleStyle, DivEdgeInsets divEdgeInsets4, List list8, DivTransform divTransform, List list9, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, List list11, List list12, Expression expression13, DivVisibilityAction divVisibilityAction, List list13, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = divBorder;
        this.h = expression4;
        this.i = list3;
        this.j = expression5;
        this.k = list4;
        this.l = divFocus;
        this.m = list5;
        this.n = expression6;
        this.o = divSize;
        this.p = str;
        this.q = list6;
        this.r = divLayoutProvider;
        this.s = divEdgeInsets;
        this.t = divEdgeInsets2;
        this.u = expression7;
        this.v = expression8;
        this.w = expression9;
        this.x = list7;
        this.y = expression10;
        this.z = expression11;
        this.A = divEdgeInsets3;
        this.B = expression12;
        this.C = ldlVar;
        this.D = divTabs$TabTitleStyle;
        this.E = divEdgeInsets4;
        this.F = list8;
        this.G = divTransform;
        this.H = list9;
        this.I = divChangeTransition;
        this.J = divAppearanceTransition;
        this.K = divAppearanceTransition2;
        this.L = list10;
        this.M = list11;
        this.N = list12;
        this.O = expression13;
        this.P = divVisibilityAction;
        this.Q = list13;
        this.R = divSize2;
    }

    public static mdl B(mdl mdlVar, String str, ArrayList arrayList, int i) {
        DivAccessibility divAccessibility;
        DivAccessibility divAccessibility2 = mdlVar.a;
        Expression expression = mdlVar.b;
        Expression expression2 = mdlVar.c;
        Expression expression3 = mdlVar.d;
        List list = mdlVar.e;
        List list2 = mdlVar.f;
        DivBorder divBorder = mdlVar.g;
        Expression expression4 = mdlVar.h;
        List list3 = mdlVar.i;
        Expression expression5 = mdlVar.j;
        List list4 = mdlVar.k;
        DivFocus divFocus = mdlVar.l;
        List list5 = mdlVar.m;
        Expression expression6 = mdlVar.n;
        DivSize divSize = mdlVar.o;
        if ((i & 32768) != 0) {
            divAccessibility = divAccessibility2;
            str = mdlVar.p;
        } else {
            divAccessibility = divAccessibility2;
        }
        DivLayoutProvider divLayoutProvider = mdlVar.r;
        DivEdgeInsets divEdgeInsets = mdlVar.s;
        DivEdgeInsets divEdgeInsets2 = mdlVar.t;
        Expression expression7 = mdlVar.u;
        Expression expression8 = mdlVar.v;
        Expression expression9 = mdlVar.w;
        List list6 = mdlVar.x;
        Expression expression10 = mdlVar.y;
        Expression expression11 = mdlVar.z;
        DivEdgeInsets divEdgeInsets3 = mdlVar.A;
        Expression expression12 = mdlVar.B;
        ldl ldlVar = mdlVar.C;
        DivTabs$TabTitleStyle divTabs$TabTitleStyle = mdlVar.D;
        DivEdgeInsets divEdgeInsets4 = mdlVar.E;
        List list7 = mdlVar.F;
        DivTransform divTransform = mdlVar.G;
        List list8 = mdlVar.H;
        DivChangeTransition divChangeTransition = mdlVar.I;
        DivAppearanceTransition divAppearanceTransition = mdlVar.J;
        DivAppearanceTransition divAppearanceTransition2 = mdlVar.K;
        List list9 = mdlVar.L;
        List list10 = mdlVar.M;
        List list11 = mdlVar.N;
        Expression expression13 = mdlVar.O;
        DivVisibilityAction divVisibilityAction = mdlVar.P;
        List list12 = mdlVar.Q;
        DivSize divSize2 = mdlVar.R;
        mdlVar.getClass();
        return new mdl(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, expression5, list4, divFocus, list5, expression6, divSize, str, arrayList, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression7, expression8, expression9, list6, expression10, expression11, divEdgeInsets3, expression12, ldlVar, divTabs$TabTitleStyle, divEdgeInsets4, list7, divTransform, list8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression13, divVisibilityAction, list12, divSize2);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x0635, code lost:
    
        if (r4.v.a(r3.v, r12, r13) != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0642, code lost:
    
        if (r10.E.a(r11.E, r12, r13) == false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0644, code lost:
    
        r3 = r11.F;
        r4 = r10.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0648, code lost:
    
        if (r4 == null) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x064a, code lost:
    
        if (r3 != null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0656, code lost:
    
        if (r4.size() == r3.size()) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x065a, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0665, code lost:
    
        if (r4.hasNext() == false) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0667, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x066d, code lost:
    
        if (r5 < 0) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x067b, code lost:
    
        if (((defpackage.gil) r6).a((defpackage.gil) r3.get(r5), r12, r13) != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x067f, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0681, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0684, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0687, code lost:
    
        r3 = r11.G;
        r4 = r10.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x068b, code lost:
    
        if (r4 == null) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x068d, code lost:
    
        r3 = r4.a(r3, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0697, code lost:
    
        if (r3 == false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0699, code lost:
    
        r3 = r11.H;
        r4 = r10.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x069d, code lost:
    
        if (r4 == null) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x069f, code lost:
    
        if (r3 != null) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x06ab, code lost:
    
        if (r4.size() == r3.size()) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x06af, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x06ba, code lost:
    
        if (r4.hasNext() == false) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x06bc, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x06c2, code lost:
    
        if (r5 < 0) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x06d0, code lost:
    
        if (((defpackage.xjl) r6).a((defpackage.xjl) r3.get(r5), r12, r13) != false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x06d4, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x06d6, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06d9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06dc, code lost:
    
        r3 = r11.I;
        r4 = r10.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x06e0, code lost:
    
        if (r4 == null) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x06e2, code lost:
    
        r3 = r4.a(r3, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x06ec, code lost:
    
        if (r3 == false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x06ee, code lost:
    
        r3 = r11.J;
        r4 = r10.J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x06f2, code lost:
    
        if (r4 == null) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x06f4, code lost:
    
        r3 = r4.a(r3, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x06fe, code lost:
    
        if (r3 == false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0700, code lost:
    
        r3 = r11.K;
        r4 = r10.K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0704, code lost:
    
        if (r4 == null) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0706, code lost:
    
        r3 = r4.a(r3, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0710, code lost:
    
        if (r3 == false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0712, code lost:
    
        r3 = r11.L;
        r4 = r10.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0716, code lost:
    
        if (r4 == null) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0718, code lost:
    
        if (r3 != null) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0724, code lost:
    
        if (r4.size() == r3.size()) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0728, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0733, code lost:
    
        if (r4.hasNext() == false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0735, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x073b, code lost:
    
        if (r5 < 0) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0745, code lost:
    
        if (((com.yandex.div2.DivTransitionTrigger) r6) != ((com.yandex.div2.DivTransitionTrigger) r3.get(r5))) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0747, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0749, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x074c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x074f, code lost:
    
        r3 = r11.M;
        r4 = r10.M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0753, code lost:
    
        if (r4 == null) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0755, code lost:
    
        if (r3 != null) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0761, code lost:
    
        if (r4.size() == r3.size()) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0765, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0770, code lost:
    
        if (r4.hasNext() == false) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0772, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0778, code lost:
    
        if (r5 < 0) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0786, code lost:
    
        if (((defpackage.lll) r6).a((defpackage.lll) r3.get(r5), r12, r13) != false) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x078a, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x078c, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x078f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0792, code lost:
    
        r3 = r11.N;
        r4 = r10.N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0796, code lost:
    
        if (r4 == null) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0798, code lost:
    
        if (r3 != null) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x07a4, code lost:
    
        if (r4.size() == r3.size()) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x07a8, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x07b3, code lost:
    
        if (r4.hasNext() == false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x07b5, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x07bb, code lost:
    
        if (r5 < 0) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x07c9, code lost:
    
        if (((com.yandex.div2.c3) r6).a((com.yandex.div2.c3) r3.get(r5), r12, r13) != false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x07cd, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x07cf, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x07d2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x07e1, code lost:
    
        if (r10.O.a(r12) != r11.O.a(r13)) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x07e3, code lost:
    
        r3 = r11.P;
        r4 = r10.P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x07e7, code lost:
    
        if (r4 == null) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x07e9, code lost:
    
        r3 = r4.f(r3, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x07f3, code lost:
    
        if (r3 == false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x07f5, code lost:
    
        r3 = r11.Q;
        r4 = r10.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x07f9, code lost:
    
        if (r4 == null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x07fb, code lost:
    
        if (r3 != null) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0806, code lost:
    
        if (r4.size() == r3.size()) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0809, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0814, code lost:
    
        if (r4.hasNext() == false) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0816, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x081c, code lost:
    
        if (r5 < 0) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x082a, code lost:
    
        if (((com.yandex.div2.DivVisibilityAction) r6).f((com.yandex.div2.DivVisibilityAction) r3.get(r5), r12, r13) != false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x082d, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x082f, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0832, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x083d, code lost:
    
        if (r10.R.a(r11.R, r12, r13) == false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x083f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0833, code lost:
    
        if (r3 != null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x07ee, code lost:
    
        if (r3 != null) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x07f0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x07f2, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x07d3, code lost:
    
        if (r3 != null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0790, code lost:
    
        if (r3 != null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x074d, code lost:
    
        if (r3 != null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x070b, code lost:
    
        if (r3 != null) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x070d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x070f, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x06f9, code lost:
    
        if (r3 != null) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x06fb, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x06fd, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x06e7, code lost:
    
        if (r3 != null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x06e9, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x06eb, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x06da, code lost:
    
        if (r3 != null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0692, code lost:
    
        if (r3 != null) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0694, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0696, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0685, code lost:
    
        if (r3 != null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0638, code lost:
    
        if (r3 == null) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0376, code lost:
    
        if (r3 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0212, code lost:
    
        if (r3 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x01bd, code lost:
    
        if (r3 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0160, code lost:
    
        if (r3 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x00ed, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x00aa, code lost:
    
        if (r3 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(mdl mdlVar, rvo rvoVar, rvo rvoVar2) {
        if (mdlVar != null) {
            DivAccessibility divAccessibility = mdlVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                Expression expression = this.b;
                DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                Expression expression2 = mdlVar.b;
                if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                    Expression expression3 = this.c;
                    DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                    Expression expression4 = mdlVar.c;
                    if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) mdlVar.d.a(rvoVar2)).doubleValue()) {
                        List list = mdlVar.e;
                        List list2 = this.e;
                        if (list2 != null) {
                            if (list != null && list2.size() == list.size()) {
                                int i = 0;
                                for (Object obj : list2) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    if (!((ydk) obj).a((ydk) list.get(i), rvoVar, rvoVar2)) {
                                        break;
                                    }
                                    i = i2;
                                }
                                List list3 = mdlVar.f;
                                List list4 = this.f;
                                if (list4 != null) {
                                    if (list3 != null && list4.size() == list3.size()) {
                                        int i3 = 0;
                                        for (Object obj2 : list4) {
                                            int i4 = i3 + 1;
                                            if (i3 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            if (!((kfk) obj2).a((kfk) list3.get(i3), rvoVar, rvoVar2)) {
                                                break;
                                            }
                                            i3 = i4;
                                        }
                                        DivBorder divBorder = mdlVar.g;
                                        DivBorder divBorder2 = this.g;
                                        if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                                            Expression expression5 = this.h;
                                            Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                            Expression expression6 = mdlVar.h;
                                            if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null)) {
                                                List list5 = mdlVar.i;
                                                List list6 = this.i;
                                                if (list6 != null) {
                                                    if (list5 != null && list6.size() == list5.size()) {
                                                        int i5 = 0;
                                                        for (Object obj3 : list6) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                scc.m();
                                                                throw null;
                                                            }
                                                            if (!((nnk) obj3).f((nnk) list5.get(i5), rvoVar, rvoVar2)) {
                                                                break;
                                                            }
                                                            i5 = i6;
                                                        }
                                                        if (((Boolean) this.j.a(rvoVar)).booleanValue() == ((Boolean) mdlVar.j.a(rvoVar2)).booleanValue()) {
                                                            List list7 = mdlVar.k;
                                                            List list8 = this.k;
                                                            if (list8 != null) {
                                                                if (list7 != null && list8.size() == list7.size()) {
                                                                    int i7 = 0;
                                                                    for (Object obj4 : list8) {
                                                                        int i8 = i7 + 1;
                                                                        if (i7 < 0) {
                                                                            scc.m();
                                                                            throw null;
                                                                        }
                                                                        if (!((bpk) obj4).a((bpk) list7.get(i7))) {
                                                                            break;
                                                                        }
                                                                        i7 = i8;
                                                                    }
                                                                    DivFocus divFocus = mdlVar.l;
                                                                    DivFocus divFocus2 = this.l;
                                                                    if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                        List list9 = mdlVar.m;
                                                                        List list10 = this.m;
                                                                        if (list10 != null) {
                                                                            if (list9 != null && list10.size() == list9.size()) {
                                                                                int i9 = 0;
                                                                                for (Object obj5 : list10) {
                                                                                    int i10 = i9 + 1;
                                                                                    if (i9 < 0) {
                                                                                        scc.m();
                                                                                        throw null;
                                                                                    }
                                                                                    if (!((irk) obj5).a((irk) list9.get(i9))) {
                                                                                        break;
                                                                                    }
                                                                                    i9 = i10;
                                                                                }
                                                                                if (((Boolean) this.n.a(rvoVar)).booleanValue() == ((Boolean) mdlVar.n.a(rvoVar2)).booleanValue() && this.o.a(mdlVar.o, rvoVar, rvoVar2) && jl40.l(this.p, mdlVar.p)) {
                                                                                    List list11 = mdlVar.q;
                                                                                    List list12 = this.q;
                                                                                    if (list12.size() == list11.size()) {
                                                                                        Iterator it = list12.iterator();
                                                                                        int i11 = 0;
                                                                                        while (true) {
                                                                                            if (it.hasNext()) {
                                                                                                Object next = it.next();
                                                                                                int i12 = i11 + 1;
                                                                                                if (i11 < 0) {
                                                                                                    scc.m();
                                                                                                    throw null;
                                                                                                }
                                                                                                kdl kdlVar = (kdl) list11.get(i11);
                                                                                                kdl kdlVar2 = (kdl) next;
                                                                                                if (kdlVar == null) {
                                                                                                    kdlVar2.getClass();
                                                                                                    return false;
                                                                                                }
                                                                                                if (!kdlVar2.a.a(kdlVar.a, rvoVar, rvoVar2) || !jl40.l(kdlVar2.b.a(rvoVar), kdlVar.b.a(rvoVar2))) {
                                                                                                    break;
                                                                                                }
                                                                                                v3k v3kVar = kdlVar2.c;
                                                                                                v3k v3kVar2 = kdlVar.c;
                                                                                                if (!(v3kVar != null ? v3kVar.a(v3kVar2, rvoVar, rvoVar2) : v3kVar2 == null)) {
                                                                                                    break;
                                                                                                }
                                                                                                i11 = i12;
                                                                                            } else {
                                                                                                DivLayoutProvider divLayoutProvider = mdlVar.r;
                                                                                                DivLayoutProvider divLayoutProvider2 = this.r;
                                                                                                if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                                    DivEdgeInsets divEdgeInsets = mdlVar.s;
                                                                                                    DivEdgeInsets divEdgeInsets2 = this.s;
                                                                                                    if (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) {
                                                                                                        DivEdgeInsets divEdgeInsets3 = mdlVar.t;
                                                                                                        DivEdgeInsets divEdgeInsets4 = this.t;
                                                                                                        if ((divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) && ((Boolean) this.u.a(rvoVar)).booleanValue() == ((Boolean) mdlVar.u.a(rvoVar2)).booleanValue()) {
                                                                                                            Expression expression7 = this.v;
                                                                                                            String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                                                                            Expression expression8 = mdlVar.v;
                                                                                                            if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null)) {
                                                                                                                Expression expression9 = this.w;
                                                                                                                Long l2 = expression9 != null ? (Long) expression9.a(rvoVar) : null;
                                                                                                                Expression expression10 = mdlVar.w;
                                                                                                                if (jl40.l(l2, expression10 != null ? (Long) expression10.a(rvoVar2) : null)) {
                                                                                                                    List list13 = mdlVar.x;
                                                                                                                    List list14 = this.x;
                                                                                                                    if (list14 != null) {
                                                                                                                        if (list13 != null && list14.size() == list13.size()) {
                                                                                                                            int i13 = 0;
                                                                                                                            for (Object obj6 : list14) {
                                                                                                                                int i14 = i13 + 1;
                                                                                                                                if (i13 < 0) {
                                                                                                                                    scc.m();
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                if (!((v3k) obj6).a((v3k) list13.get(i13), rvoVar, rvoVar2)) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                i13 = i14;
                                                                                                                            }
                                                                                                                            if (((Number) this.y.a(rvoVar)).longValue() == ((Number) mdlVar.y.a(rvoVar2)).longValue() && ((Number) this.z.a(rvoVar)).intValue() == ((Number) mdlVar.z.a(rvoVar2)).intValue() && this.A.a(mdlVar.A, rvoVar, rvoVar2) && ((Boolean) this.B.a(rvoVar)).booleanValue() == ((Boolean) mdlVar.B.a(rvoVar2)).booleanValue()) {
                                                                                                                                ldl ldlVar = mdlVar.C;
                                                                                                                                ldl ldlVar2 = this.C;
                                                                                                                                if (ldlVar2 == null ? ldlVar == null : !(ldlVar == null || !ldlVar2.a.a(ldlVar.a, rvoVar, rvoVar2) || !jl40.l(ldlVar2.b.a(rvoVar), ldlVar.b.a(rvoVar2)) || !ldlVar2.c.a(ldlVar.c, rvoVar, rvoVar2))) {
                                                                                                                                    DivTabs$TabTitleStyle divTabs$TabTitleStyle = mdlVar.D;
                                                                                                                                    DivTabs$TabTitleStyle divTabs$TabTitleStyle2 = this.D;
                                                                                                                                    if (divTabs$TabTitleStyle2 != null) {
                                                                                                                                        if (divTabs$TabTitleStyle != null && ((Number) divTabs$TabTitleStyle2.a.a(rvoVar)).intValue() == ((Number) divTabs$TabTitleStyle.a.a(rvoVar2)).intValue()) {
                                                                                                                                            Expression expression11 = divTabs$TabTitleStyle2.b;
                                                                                                                                            JSONObject jSONObject = expression11 != null ? (JSONObject) expression11.a(rvoVar) : null;
                                                                                                                                            Expression expression12 = divTabs$TabTitleStyle.b;
                                                                                                                                            if (jl40.l(jSONObject, expression12 != null ? (JSONObject) expression12.a(rvoVar2) : null)) {
                                                                                                                                                Expression expression13 = divTabs$TabTitleStyle2.c;
                                                                                                                                                DivFontWeight divFontWeight = expression13 != null ? (DivFontWeight) expression13.a(rvoVar) : null;
                                                                                                                                                Expression expression14 = divTabs$TabTitleStyle.c;
                                                                                                                                                if (divFontWeight == (expression14 != null ? (DivFontWeight) expression14.a(rvoVar2) : null)) {
                                                                                                                                                    Expression expression15 = divTabs$TabTitleStyle2.d;
                                                                                                                                                    Long l3 = expression15 != null ? (Long) expression15.a(rvoVar) : null;
                                                                                                                                                    Expression expression16 = divTabs$TabTitleStyle.d;
                                                                                                                                                    if (jl40.l(l3, expression16 != null ? (Long) expression16.a(rvoVar2) : null) && ((Number) divTabs$TabTitleStyle2.e.a(rvoVar)).intValue() == ((Number) divTabs$TabTitleStyle.e.a(rvoVar2)).intValue() && ((Number) divTabs$TabTitleStyle2.f.a(rvoVar)).longValue() == ((Number) divTabs$TabTitleStyle.f.a(rvoVar2)).longValue() && divTabs$TabTitleStyle2.g.a(rvoVar) == divTabs$TabTitleStyle.g.a(rvoVar2)) {
                                                                                                                                                        Expression expression17 = divTabs$TabTitleStyle2.h;
                                                                                                                                                        Long l4 = expression17 != null ? (Long) expression17.a(rvoVar) : null;
                                                                                                                                                        Expression expression18 = divTabs$TabTitleStyle.h;
                                                                                                                                                        if (jl40.l(l4, expression18 != null ? (Long) expression18.a(rvoVar2) : null)) {
                                                                                                                                                            jkk jkkVar = divTabs$TabTitleStyle2.i;
                                                                                                                                                            jkk jkkVar2 = divTabs$TabTitleStyle.i;
                                                                                                                                                            if (jkkVar != null ? jkkVar.a(jkkVar2, rvoVar, rvoVar2) : jkkVar2 == null) {
                                                                                                                                                                Expression expression19 = divTabs$TabTitleStyle2.j;
                                                                                                                                                                String str2 = expression19 != null ? (String) expression19.a(rvoVar) : null;
                                                                                                                                                                Expression expression20 = divTabs$TabTitleStyle.j;
                                                                                                                                                                if (jl40.l(str2, expression20 != null ? (String) expression20.a(rvoVar2) : null) && ((Number) divTabs$TabTitleStyle2.k.a(rvoVar)).longValue() == ((Number) divTabs$TabTitleStyle.k.a(rvoVar2)).longValue() && divTabs$TabTitleStyle2.l.a(rvoVar) == divTabs$TabTitleStyle.l.a(rvoVar2) && divTabs$TabTitleStyle2.m.a(rvoVar) == divTabs$TabTitleStyle.m.a(rvoVar2)) {
                                                                                                                                                                    Expression expression21 = divTabs$TabTitleStyle2.n;
                                                                                                                                                                    Integer num = expression21 != null ? (Integer) expression21.a(rvoVar) : null;
                                                                                                                                                                    Expression expression22 = divTabs$TabTitleStyle.n;
                                                                                                                                                                    if (jl40.l(num, expression22 != null ? (Integer) expression22.a(rvoVar2) : null)) {
                                                                                                                                                                        Expression expression23 = divTabs$TabTitleStyle2.o;
                                                                                                                                                                        JSONObject jSONObject2 = expression23 != null ? (JSONObject) expression23.a(rvoVar) : null;
                                                                                                                                                                        Expression expression24 = divTabs$TabTitleStyle.o;
                                                                                                                                                                        if (jl40.l(jSONObject2, expression24 != null ? (JSONObject) expression24.a(rvoVar2) : null)) {
                                                                                                                                                                            Expression expression25 = divTabs$TabTitleStyle2.p;
                                                                                                                                                                            DivFontWeight divFontWeight2 = expression25 != null ? (DivFontWeight) expression25.a(rvoVar) : null;
                                                                                                                                                                            Expression expression26 = divTabs$TabTitleStyle.p;
                                                                                                                                                                            if (divFontWeight2 == (expression26 != null ? (DivFontWeight) expression26.a(rvoVar2) : null)) {
                                                                                                                                                                                Expression expression27 = divTabs$TabTitleStyle2.q;
                                                                                                                                                                                Long l5 = expression27 != null ? (Long) expression27.a(rvoVar) : null;
                                                                                                                                                                                Expression expression28 = divTabs$TabTitleStyle.q;
                                                                                                                                                                                if (jl40.l(l5, expression28 != null ? (Long) expression28.a(rvoVar2) : null) && ((Number) divTabs$TabTitleStyle2.r.a(rvoVar)).intValue() == ((Number) divTabs$TabTitleStyle.r.a(rvoVar2)).intValue() && ((Number) divTabs$TabTitleStyle2.s.a(rvoVar)).longValue() == ((Number) divTabs$TabTitleStyle.s.a(rvoVar2)).longValue() && ((Number) divTabs$TabTitleStyle2.t.a(rvoVar)).doubleValue() == ((Number) divTabs$TabTitleStyle.t.a(rvoVar2)).doubleValue()) {
                                                                                                                                                                                    Expression expression29 = divTabs$TabTitleStyle2.u;
                                                                                                                                                                                    Long l6 = expression29 != null ? (Long) expression29.a(rvoVar) : null;
                                                                                                                                                                                    Expression expression30 = divTabs$TabTitleStyle.u;
                                                                                                                                                                                    if (jl40.l(l6, expression30 != null ? (Long) expression30.a(rvoVar2) : null)) {
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int D() {
        int i;
        Integer num = this.T;
        if (num != null) {
            return num.intValue();
        }
        int E = E();
        int i2 = 0;
        for (kdl kdlVar : this.q) {
            Integer num2 = kdlVar.d;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode = kdlVar.b.hashCode() + kdlVar.a.b() + qoi0.a(kdl.class).hashCode();
                v3k v3kVar = kdlVar.c;
                int b = hashCode + (v3kVar != null ? v3kVar.b() : 0);
                kdlVar.d = Integer.valueOf(b);
                i = b;
            }
            i2 += i;
        }
        int i3 = E + i2;
        this.T = Integer.valueOf(i3);
        return i3;
    }

    public final int E() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(mdl.class).hashCode();
        int i13 = 0;
        DivAccessibility divAccessibility = this.a;
        int b = hashCode + (divAccessibility != null ? divAccessibility.b() : 0);
        Expression expression = this.b;
        int hashCode2 = b + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.c;
        int hashCode3 = this.d.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((ydk) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i14 = hashCode3 + i;
        List list2 = this.f;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((kfk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i15 = i14 + i2;
        DivBorder divBorder = this.g;
        int b2 = i15 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.h;
        int hashCode4 = b2 + (expression3 != null ? expression3.hashCode() : 0);
        List list3 = this.i;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((nnk) it3.next()).g();
            }
        } else {
            i3 = 0;
        }
        int hashCode5 = this.j.hashCode() + hashCode4 + i3;
        List list4 = this.k;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((bpk) it4.next()).b();
            }
        } else {
            i4 = 0;
        }
        int i16 = hashCode5 + i4;
        DivFocus divFocus = this.l;
        int b3 = i16 + (divFocus != null ? divFocus.b() : 0);
        List list5 = this.m;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((irk) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int b4 = this.o.b() + this.n.hashCode() + b3 + i5;
        String str = this.p;
        int hashCode6 = b4 + (str != null ? str.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.r;
        int b5 = hashCode6 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        DivEdgeInsets divEdgeInsets = this.s;
        int b6 = b5 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.t;
        int hashCode7 = this.u.hashCode() + b6 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        Expression expression4 = this.v;
        int hashCode8 = hashCode7 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.w;
        int hashCode9 = hashCode8 + (expression5 != null ? expression5.hashCode() : 0);
        List list6 = this.x;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((v3k) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int hashCode10 = this.B.hashCode() + this.A.b() + this.z.hashCode() + this.y.hashCode() + hashCode9 + i6;
        ldl ldlVar = this.C;
        if (ldlVar != null) {
            Integer num2 = ldlVar.d;
            if (num2 != null) {
                i7 = num2.intValue();
            } else {
                int hashCode11 = ldlVar.b.hashCode() + ldlVar.a.b() + qoi0.a(ldl.class).hashCode() + ldlVar.c.b();
                ldlVar.d = Integer.valueOf(hashCode11);
                i7 = hashCode11;
            }
        } else {
            i7 = 0;
        }
        int i17 = hashCode10 + i7;
        DivTabs$TabTitleStyle divTabs$TabTitleStyle = this.D;
        if (divTabs$TabTitleStyle != null) {
            Integer num3 = divTabs$TabTitleStyle.w;
            if (num3 != null) {
                i8 = num3.intValue();
            } else {
                int hashCode12 = divTabs$TabTitleStyle.a.hashCode() + qoi0.a(DivTabs$TabTitleStyle.class).hashCode();
                Expression expression6 = divTabs$TabTitleStyle.b;
                int hashCode13 = hashCode12 + (expression6 != null ? expression6.hashCode() : 0);
                Expression expression7 = divTabs$TabTitleStyle.c;
                int hashCode14 = hashCode13 + (expression7 != null ? expression7.hashCode() : 0);
                Expression expression8 = divTabs$TabTitleStyle.d;
                int hashCode15 = divTabs$TabTitleStyle.g.hashCode() + divTabs$TabTitleStyle.f.hashCode() + divTabs$TabTitleStyle.e.hashCode() + hashCode14 + (expression8 != null ? expression8.hashCode() : 0);
                Expression expression9 = divTabs$TabTitleStyle.h;
                int hashCode16 = hashCode15 + (expression9 != null ? expression9.hashCode() : 0);
                jkk jkkVar = divTabs$TabTitleStyle.i;
                int b7 = hashCode16 + (jkkVar != null ? jkkVar.b() : 0);
                Expression expression10 = divTabs$TabTitleStyle.j;
                int hashCode17 = divTabs$TabTitleStyle.m.hashCode() + divTabs$TabTitleStyle.l.hashCode() + divTabs$TabTitleStyle.k.hashCode() + b7 + (expression10 != null ? expression10.hashCode() : 0);
                Expression expression11 = divTabs$TabTitleStyle.n;
                int hashCode18 = hashCode17 + (expression11 != null ? expression11.hashCode() : 0);
                Expression expression12 = divTabs$TabTitleStyle.o;
                int hashCode19 = hashCode18 + (expression12 != null ? expression12.hashCode() : 0);
                Expression expression13 = divTabs$TabTitleStyle.p;
                int hashCode20 = hashCode19 + (expression13 != null ? expression13.hashCode() : 0);
                Expression expression14 = divTabs$TabTitleStyle.q;
                int hashCode21 = divTabs$TabTitleStyle.t.hashCode() + divTabs$TabTitleStyle.s.hashCode() + divTabs$TabTitleStyle.r.hashCode() + hashCode20 + (expression14 != null ? expression14.hashCode() : 0);
                Expression expression15 = divTabs$TabTitleStyle.u;
                int hashCode22 = hashCode21 + (expression15 != null ? expression15.hashCode() : 0) + divTabs$TabTitleStyle.v.b();
                divTabs$TabTitleStyle.w = Integer.valueOf(hashCode22);
                i8 = hashCode22;
            }
        } else {
            i8 = 0;
        }
        int b8 = this.E.b() + i17 + i8;
        List list7 = this.F;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i9 = 0;
            while (it7.hasNext()) {
                i9 += ((gil) it7.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i18 = b8 + i9;
        DivTransform divTransform = this.G;
        int b9 = i18 + (divTransform != null ? divTransform.b() : 0);
        List list8 = this.H;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i10 = 0;
            while (it8.hasNext()) {
                i10 += ((xjl) it8.next()).b();
            }
        } else {
            i10 = 0;
        }
        int i19 = b9 + i10;
        DivChangeTransition divChangeTransition = this.I;
        int b10 = i19 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.J;
        int b11 = b10 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.K;
        int b12 = b11 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list9 = this.L;
        int hashCode23 = b12 + (list9 != null ? list9.hashCode() : 0);
        List list10 = this.M;
        if (list10 != null) {
            Iterator it9 = list10.iterator();
            i11 = 0;
            while (it9.hasNext()) {
                i11 += ((lll) it9.next()).b();
            }
        } else {
            i11 = 0;
        }
        int i20 = hashCode23 + i11;
        List list11 = this.N;
        if (list11 != null) {
            Iterator it10 = list11.iterator();
            i12 = 0;
            while (it10.hasNext()) {
                i12 += ((c3) it10.next()).b();
            }
        } else {
            i12 = 0;
        }
        int hashCode24 = this.O.hashCode() + i20 + i12;
        DivVisibilityAction divVisibilityAction = this.P;
        int g = hashCode24 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list12 = this.Q;
        if (list12 != null) {
            Iterator it11 = list12.iterator();
            while (it11.hasNext()) {
                i13 += ((DivVisibilityAction) it11.next()).g();
            }
        }
        int b13 = this.R.b() + g + i13;
        this.S = Integer.valueOf(b13);
        return b13;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.d;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.Q;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.h;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.N;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.s;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.w;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.v;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.f;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.k;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.o;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.p;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.O;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.R;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.b;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.F;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.K;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.I;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.i;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.G;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.L;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.c;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.l;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((xdl) ft6.b.e8.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.t;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.x;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.r;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.M;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.P;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.m;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.J;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.e;
    }
}

package com.yandex.div.core.view2.divs;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivText$Truncate;
import defpackage.afl;
import defpackage.agl;
import defpackage.aw5;
import defpackage.bcl;
import defpackage.bpk;
import defpackage.cfl;
import defpackage.cma1;
import defpackage.dfl;
import defpackage.egk;
import defpackage.evu0;
import defpackage.f1k;
import defpackage.ffl;
import defpackage.ffx;
import defpackage.fhl;
import defpackage.h6l;
import defpackage.hfl;
import defpackage.hgl;
import defpackage.j5l;
import defpackage.jl40;
import defpackage.jnk;
import defpackage.k5l;
import defpackage.kfl;
import defpackage.kgr0;
import defpackage.kic;
import defpackage.kvo;
import defpackage.lfl;
import defpackage.lnt0;
import defpackage.m8l;
import defpackage.mfl;
import defpackage.n5l;
import defpackage.nml;
import defpackage.o80;
import defpackage.pgl;
import defpackage.pvo;
import defpackage.q5i0;
import defpackage.qje;
import defpackage.r8;
import defpackage.rvo;
import defpackage.scc;
import defpackage.sqk;
import defpackage.t6e;
import defpackage.tls;
import defpackage.u5i0;
import defpackage.uml;
import defpackage.uyk;
import defpackage.v3k;
import defpackage.vyk;
import defpackage.w511;
import defpackage.wal;
import defpackage.wiy;
import defpackage.x4l;
import defpackage.ygl;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends r8 {
    public final nml c;
    public final lnt0 w;
    public final boolean x;

    public w(e eVar, nml nmlVar, lnt0 lnt0Var, boolean z) {
        super(4, eVar);
        this.c = nmlVar;
        this.w = lnt0Var;
        this.x = z;
    }

    public static final int Hg(w wVar, TextView textView) {
        wVar.getClass();
        return Math.min(a.u(textView), (int) textView.getPaint().measureText(textView.getText().toString()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if ((r5 != null ? ((java.lang.Boolean) r5.a(r6)).booleanValue() : false) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Ig(DivLineHeightTextView divLineHeightTextView, ffl fflVar, rvo rvoVar) {
        TextUtils.TruncateAt truncateAt;
        DivText$Truncate divText$Truncate = (DivText$Truncate) fflVar.k0.a(rvoVar);
        int i = hfl.c[divText$Truncate.ordinal()];
        boolean z = true;
        if (i == 1) {
            truncateAt = null;
        } else if (i == 2) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i == 3) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            truncateAt = TextUtils.TruncateAt.END;
        }
        divLineHeightTextView.setEllipsisLocation(truncateAt);
        if (divText$Truncate != DivText$Truncate.NONE) {
            Expression expression = fflVar.i;
        }
        z = false;
        divLineHeightTextView.setAutoEllipsize(z);
    }

    public static void Lg(DivLineHeightTextView divLineHeightTextView, Div2View div2View, Long l, Long l2) {
        com.yandex.div.core.widget.a adaptiveMaxLines = divLineHeightTextView.getAdaptiveMaxLines();
        if (adaptiveMaxLines != null) {
            adaptiveMaxLines.c();
        }
        int i = Integer.MAX_VALUE;
        if (l == null || l2 == null) {
            if (l != null) {
                long longValue = l.longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue;
                } else {
                    i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            divLineHeightTextView.setMaxLines(i);
            return;
        }
        com.yandex.div.core.widget.a aVar = new com.yandex.div.core.widget.a(divLineHeightTextView, div2View.getViewComponent().l());
        long longValue2 = l.longValue();
        long j2 = longValue2 >> 31;
        int i2 = (j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue3 = l2.longValue();
        long j3 = longValue3 >> 31;
        if (j3 == 0 || j3 == -1) {
            r0 = (int) longValue3;
        } else if (longValue3 > 0) {
            r0 = Integer.MAX_VALUE;
        }
        aVar.a(new o80(i2, r0));
        divLineHeightTextView.setAdaptiveMaxLines$div_release(aVar);
    }

    public static void Qg(TextView textView, DivLineStyle divLineStyle) {
        int i = hfl.b[divLineStyle.ordinal()];
        if (i == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        } else {
            if (i != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        }
    }

    public static void Rg(TextView textView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        textView.setGravity(uml.b(divAlignmentHorizontal, divAlignmentVertical));
        int i = hfl.a[divAlignmentHorizontal.ordinal()];
        int i2 = 5;
        if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3 || (i != 4 && i == 5)) {
                i2 = 6;
            }
        }
        textView.setTextAlignment(i2);
    }

    public static void Sg(TextView textView, int i, Integer num) {
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{num != null ? num.intValue() : i, i}));
    }

    public static void Tg(TextView textView, kgr0 kgr0Var) {
        DivViewWrapper divViewWrapper;
        if (kgr0Var == null) {
            ViewParent parent = textView.getParent();
            divViewWrapper = parent instanceof DivViewWrapper ? (DivViewWrapper) parent : null;
            if (divViewWrapper != null) {
                divViewWrapper.setClipChildren(true);
                divViewWrapper.setClipToPadding(true);
            }
            textView.setClipToOutline(true);
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            return;
        }
        ViewParent parent2 = textView.getParent();
        divViewWrapper = parent2 instanceof DivViewWrapper ? (DivViewWrapper) parent2 : null;
        if (divViewWrapper != null) {
            divViewWrapper.setClipChildren(false);
            divViewWrapper.setClipToPadding(false);
        }
        textView.setClipToOutline(false);
        textView.setShadowLayer(kgr0Var.c, kgr0Var.a, kgr0Var.b, kgr0Var.d);
    }

    public static void Ug(TextView textView, DivLineStyle divLineStyle) {
        int i = hfl.b[divLineStyle.ordinal()];
        if (i == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        } else {
            if (i != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        }
    }

    public static kgr0 Vg(m8l m8lVar, rvo rvoVar, DisplayMetrics displayMetrics, int i) {
        float q = a.q((Number) m8lVar.b.a(rvoVar), displayMetrics);
        x4l x4lVar = m8lVar.d;
        float G = a.G(x4lVar.a, displayMetrics, rvoVar);
        float G2 = a.G(x4lVar.b, displayMetrics, rvoVar);
        Paint paint = new Paint();
        paint.setColor(((Number) m8lVar.c.a(rvoVar)).intValue());
        paint.setAlpha((int) (((Number) m8lVar.a.a(rvoVar)).doubleValue() * (i >>> 24)));
        return new kgr0(G, G2, q, paint.getColor());
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x05f0, code lost:
    
        if (defpackage.qje.B(r6 != null ? r6.d : r27) != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x082a, code lost:
    
        if (defpackage.qje.k(r3, r14 != null ? r14.k0 : r27) != false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (defpackage.qje.k(r4, r14 != null ? r14.Y : null) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0aa1, code lost:
    
        if (defpackage.qje.k((r0 == null || (r1 = r0.d) == null || (r1 = r1.b) == null) ? r14 : r1.a, (r14 == null || (r3 = r14.b0) == null || (r3 = r3.d) == null || (r3 = r3.b) == null) ? r14 : r3.a) != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0b38, code lost:
    
        r1 = r24;
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0b36, code lost:
    
        if (defpackage.qje.B((r0 == null || (r0 = r0.d) == null || (r0 = r0.b) == null) ? r14 : r0.a) != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x088d, code lost:
    
        if (defpackage.cma1.p(r3, r0.a()) != false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0947, code lost:
    
        if (defpackage.cma1.q(r9, r4.a()) != false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015c, code lost:
    
        if (defpackage.qje.k(r13, r14 != null ? r14.s : null) != false) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0c3c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [kgr0] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r3v100, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v127 */
    /* JADX WARN: Type inference failed for: r3v128, types: [afl] */
    /* JADX WARN: Type inference failed for: r3v129 */
    /* JADX WARN: Type inference failed for: r3v130, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v135 */
    /* JADX WARN: Type inference failed for: r3v136, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v140, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v178 */
    /* JADX WARN: Type inference failed for: r3v179 */
    /* JADX WARN: Type inference failed for: r3v180 */
    /* JADX WARN: Type inference failed for: r3v181 */
    /* JADX WARN: Type inference failed for: r3v182 */
    /* JADX WARN: Type inference failed for: r3v183 */
    /* JADX WARN: Type inference failed for: r3v184 */
    /* JADX WARN: Type inference failed for: r3v185 */
    /* JADX WARN: Type inference failed for: r3v186 */
    /* JADX WARN: Type inference failed for: r3v187 */
    /* JADX WARN: Type inference failed for: r3v188 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v113, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r4v159 */
    /* JADX WARN: Type inference failed for: r4v160 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    @Override // defpackage.r8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Hc(View view, final aw5 aw5Var, egk egkVar, egk egkVar2) {
        Expression expression;
        Div2View div2View;
        final aw5 aw5Var2;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        List list;
        final ffl fflVar;
        f1k f1kVar;
        rvo rvoVar;
        List<cfl> list2;
        Iterator it;
        bcl bclVar;
        Expression expression5;
        bcl bclVar2;
        Expression expression6;
        Iterator it2;
        bcl bclVar3;
        Expression expression7;
        bcl bclVar4;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        mfl mflVar;
        Shader shader;
        m8l m8lVar;
        x4l x4lVar;
        jnk jnkVar;
        Expression expression11;
        x4l x4lVar2;
        jnk jnkVar2;
        Expression expression12;
        x4l x4lVar3;
        jnk jnkVar3;
        Expression expression13;
        x4l x4lVar4;
        jnk jnkVar4;
        Expression expression14;
        Expression expression15;
        Expression expression16;
        Expression expression17;
        x4l x4lVar5;
        jnk jnkVar5;
        x4l x4lVar6;
        jnk jnkVar6;
        x4l x4lVar7;
        jnk jnkVar7;
        Expression expression18;
        Expression expression19;
        m8l m8lVar2;
        x4l x4lVar8;
        jnk jnkVar8;
        x4l x4lVar9;
        jnk jnkVar9;
        m8l m8lVar3;
        x4l x4lVar10;
        jnk jnkVar10;
        x4l x4lVar11;
        jnk jnkVar11;
        m8l m8lVar4;
        x4l x4lVar12;
        jnk jnkVar12;
        x4l x4lVar13;
        jnk jnkVar13;
        m8l m8lVar5;
        m8l m8lVar6;
        m8l m8lVar7;
        Expression expression20;
        Expression expression21;
        final w wVar = this;
        DivLineHeightTextView divLineHeightTextView = (DivLineHeightTextView) view;
        final ffl fflVar2 = (ffl) egkVar;
        ffl fflVar3 = (ffl) egkVar2;
        Div2View div2View2 = aw5Var.a;
        Div2View div2View3 = aw5Var.a;
        rvo rvoVar2 = aw5Var.b;
        divLineHeightTextView.setDrawingPassOverrideStrategy$div_release(div2View2.getViewComponent().l());
        v3k v3kVar = fflVar2.b;
        afl aflVar = fflVar2.p;
        List list3 = fflVar2.Q;
        Expression expression22 = fflVar2.s;
        Expression expression23 = fflVar2.Z;
        a.c(divLineHeightTextView, aw5Var, v3kVar, fflVar2.d, fflVar2.J, fflVar2.o, fflVar2.D, fflVar2.C, fflVar2.P, fflVar2.O, fflVar2.c, fflVar2.l);
        final rvo rvoVar3 = aw5Var.b;
        final DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
        a.B(divLineHeightTextView2, fflVar2.t, fflVar2.y, fflVar2.z, fflVar2.x, fflVar3 != null ? fflVar3.t : null, fflVar3 != null ? fflVar3.y : null, fflVar3 != null ? fflVar3.z : null, fflVar3 != null ? fflVar3.x : null, fflVar3, wVar.c, rvoVar3);
        Expression expression24 = fflVar2.X;
        Expression expression25 = fflVar2.Y;
        if (qje.k(expression24, fflVar3 != null ? fflVar3.X : null)) {
        }
        Rg(divLineHeightTextView2, (DivAlignmentHorizontal) expression24.a(rvoVar3), (DivAlignmentVertical) expression25.a(rvoVar3));
        if (!(expression24 instanceof kvo) || !(expression25 instanceof kvo)) {
            tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextAlignment$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    w wVar2 = w.this;
                    DivLineHeightTextView divLineHeightTextView3 = divLineHeightTextView2;
                    DivAlignmentHorizontal divAlignmentHorizontal = (DivAlignmentHorizontal) fflVar2.X.a(rvoVar3);
                    DivAlignmentVertical divAlignmentVertical = (DivAlignmentVertical) fflVar2.Y.a(rvoVar3);
                    wVar2.getClass();
                    w.Rg(divLineHeightTextView3, divAlignmentHorizontal, divAlignmentVertical);
                    return zy11.a;
                }
            };
            divLineHeightTextView2.addSubscription(expression24.c(rvoVar3, tlsVar));
            divLineHeightTextView2.addSubscription(expression25.c(rvoVar3, tlsVar));
        }
        a.y(divLineHeightTextView2, fflVar2.v, fflVar2.w, fflVar3 != null ? fflVar3.v : null, fflVar3 != null ? fflVar3.w : null, rvoVar3, divLineHeightTextView2);
        a.z(divLineHeightTextView2, fflVar2.H, fflVar2.v, fflVar3 != null ? fflVar3.H : null, fflVar3 != null ? fflVar3.v : null, rvoVar3, divLineHeightTextView2);
        Expression expression26 = fflVar2.u;
        if (!qje.k(expression26, fflVar3 != null ? fflVar3.u : null)) {
            String str = expression26 != null ? (String) expression26.a(rvoVar3) : null;
            if (str == null || !(!evu0.J(str))) {
                str = null;
            }
            divLineHeightTextView2.setFontFeatureSettings(str);
            if (!qje.B(expression26)) {
                divLineHeightTextView2.addSubscription(expression26 != null ? expression26.c(rvoVar3, new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindFontFeatureSettings$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        w wVar2 = w.this;
                        DivLineHeightTextView divLineHeightTextView3 = divLineHeightTextView2;
                        Expression expression27 = fflVar2.u;
                        String str2 = null;
                        String str3 = expression27 != null ? (String) expression27.a(rvoVar3) : null;
                        wVar2.getClass();
                        if (str3 != null && (!evu0.J(str3))) {
                            str2 = str3;
                        }
                        divLineHeightTextView3.setFontFeatureSettings(str2);
                        return zy11.a;
                    }
                }) : null);
            }
        }
        if (qje.k(expression23, fflVar3 != null ? fflVar3.Z : null)) {
            expression = expression22;
        } else {
            expression = expression22;
        }
        Sg(divLineHeightTextView2, ((Number) expression23.a(rvoVar3)).intValue(), expression != null ? (Integer) expression.a(rvoVar3) : null);
        if (!(expression23 instanceof kvo) || !qje.B(expression)) {
            tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextColor$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    w wVar2 = w.this;
                    DivLineHeightTextView divLineHeightTextView3 = divLineHeightTextView2;
                    int intValue = ((Number) fflVar2.Z.a(rvoVar3)).intValue();
                    Expression expression27 = fflVar2.s;
                    Integer num = expression27 != null ? (Integer) expression27.a(rvoVar3) : null;
                    wVar2.getClass();
                    w.Sg(divLineHeightTextView3, intValue, num);
                    return zy11.a;
                }
            };
            divLineHeightTextView2.addSubscription(expression23.c(rvoVar3, tlsVar2));
            divLineHeightTextView2.addSubscription(expression != null ? expression.c(rvoVar3, tlsVar2) : null);
        }
        Expression expression27 = fflVar2.l0;
        if (!qje.k(expression27, fflVar3 != null ? fflVar3.l0 : null)) {
            Ug(divLineHeightTextView2, (DivLineStyle) expression27.a(rvoVar3));
            if (!(expression27 instanceof kvo)) {
                divLineHeightTextView2.addSubscription(expression27.c(rvoVar3, new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindUnderline$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        w wVar2 = w.this;
                        DivLineHeightTextView divLineHeightTextView3 = divLineHeightTextView2;
                        wVar2.getClass();
                        w.Ug(divLineHeightTextView3, (DivLineStyle) obj);
                        return zy11.a;
                    }
                }));
            }
        }
        Expression expression28 = fflVar2.V;
        if (!qje.k(expression28, fflVar3 != null ? fflVar3.V : null)) {
            Qg(divLineHeightTextView2, (DivLineStyle) expression28.a(rvoVar3));
            if (!(expression28 instanceof kvo)) {
                divLineHeightTextView2.addSubscription(expression28.c(rvoVar3, new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindStrikethrough$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        w wVar2 = w.this;
                        DivLineHeightTextView divLineHeightTextView3 = divLineHeightTextView2;
                        wVar2.getClass();
                        w.Qg(divLineHeightTextView3, (DivLineStyle) obj);
                        return zy11.a;
                    }
                }));
            }
        }
        Expression expression29 = fflVar2.L;
        Expression expression30 = fflVar2.M;
        if (qje.k(expression29, fflVar3 != null ? fflVar3.L : null)) {
            if (qje.k(expression30, fflVar3 != null ? fflVar3.M : null)) {
                div2View = div2View3;
                aw5Var2 = aw5Var;
                expression2 = fflVar2.I;
                expression3 = fflVar2.w;
                expression4 = fflVar2.W;
                list = fflVar2.F;
                if (list3 == null || list != null) {
                    fflVar = fflVar2;
                    f1kVar = null;
                    wVar.Pg(divLineHeightTextView2, aw5Var2, fflVar);
                    rvoVar = rvoVar2;
                    wVar.Jg(divLineHeightTextView2, (String) expression4.a(rvoVar));
                    divLineHeightTextView2.addSubscription(expression4.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            w.this.Pg(divLineHeightTextView2, aw5Var2, fflVar);
                            w.this.Jg(divLineHeightTextView2, (String) obj);
                            return zy11.a;
                        }
                    }));
                    tls tlsVar3 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            w.this.Pg(divLineHeightTextView2, aw5Var2, fflVar);
                            return zy11.a;
                        }
                    };
                    divLineHeightTextView2.addSubscription(fflVar.v.c(rvoVar, tlsVar3));
                    divLineHeightTextView2.addSubscription(expression3.c(rvoVar, tlsVar3));
                    Expression expression31 = fflVar.t;
                    divLineHeightTextView2.addSubscription(expression31 != null ? expression31.c(rvoVar, tlsVar3) : null);
                    divLineHeightTextView2.addSubscription(expression2 != null ? expression2.c(rvoVar, tlsVar3) : null);
                    if (list3 != null) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            dfl dflVar = (dfl) it3.next();
                            Expression expression32 = dflVar.q;
                            hgl hglVar = dflVar.e;
                            divLineHeightTextView2.addSubscription(expression32.c(rvoVar, tlsVar3));
                            Expression expression33 = dflVar.f;
                            divLineHeightTextView2.addSubscription(expression33 != null ? expression33.c(rvoVar, tlsVar3) : null);
                            Expression expression34 = dflVar.b;
                            divLineHeightTextView2.addSubscription(expression34 != null ? expression34.c(rvoVar, tlsVar3) : null);
                            divLineHeightTextView2.addSubscription(dflVar.d.c(rvoVar, tlsVar3));
                            Expression expression35 = dflVar.i;
                            divLineHeightTextView2.addSubscription(expression35 != null ? expression35.c(rvoVar, tlsVar3) : null);
                            divLineHeightTextView2.addSubscription(dflVar.j.c(rvoVar, tlsVar3));
                            Expression expression36 = dflVar.g;
                            divLineHeightTextView2.addSubscription(expression36 != null ? expression36.c(rvoVar, tlsVar3) : null);
                            Expression expression37 = dflVar.l;
                            divLineHeightTextView2.addSubscription(expression37 != null ? expression37.c(rvoVar, tlsVar3) : null);
                            Expression expression38 = dflVar.m;
                            divLineHeightTextView2.addSubscription(expression38 != null ? expression38.c(rvoVar, tlsVar3) : null);
                            Expression expression39 = dflVar.h;
                            divLineHeightTextView2.addSubscription(expression39 != null ? expression39.c(rvoVar, tlsVar3) : null);
                            Expression expression40 = dflVar.n;
                            divLineHeightTextView2.addSubscription(expression40 != null ? expression40.c(rvoVar, tlsVar3) : null);
                            Expression expression41 = dflVar.o;
                            divLineHeightTextView2.addSubscription(expression41 != null ? expression41.c(rvoVar, tlsVar3) : null);
                            Expression expression42 = dflVar.r;
                            divLineHeightTextView2.addSubscription(expression42 != null ? expression42.c(rvoVar, tlsVar3) : null);
                            Expression expression43 = dflVar.s;
                            divLineHeightTextView2.addSubscription(expression43 != null ? expression43.c(rvoVar, tlsVar3) : null);
                            Expression expression44 = dflVar.u;
                            divLineHeightTextView2.addSubscription(expression44 != null ? expression44.c(rvoVar, tlsVar3) : null);
                            Expression expression45 = dflVar.v;
                            divLineHeightTextView2.addSubscription(expression45 != null ? expression45.c(rvoVar, tlsVar3) : null);
                            agl aglVar = dflVar.c;
                            Object a = aglVar != null ? aglVar.a() : null;
                            List list4 = list;
                            if (a instanceof wal) {
                                divLineHeightTextView2.addSubscription(((wal) a).a.c(rvoVar, tlsVar3));
                            }
                            pgl pglVar = dflVar.p;
                            Object a2 = pglVar != null ? pglVar.a() : null;
                            if (a2 instanceof fhl) {
                                fhl fhlVar = (fhl) a2;
                                divLineHeightTextView2.addSubscription(fhlVar.b.c(rvoVar, tlsVar3));
                                divLineHeightTextView2.addSubscription(fhlVar.a.c(rvoVar, tlsVar3));
                            } else if (a2 instanceof ygl) {
                                ygl yglVar = (ygl) a2;
                                sqk sqkVar = yglVar.e;
                                it = it3;
                                divLineHeightTextView2.addSubscription(yglVar.d.c(rvoVar, tlsVar3));
                                divLineHeightTextView2.addSubscription(yglVar.a.c(rvoVar, tlsVar3));
                                divLineHeightTextView2.addSubscription(yglVar.b.c(rvoVar, tlsVar3));
                                divLineHeightTextView2.addSubscription(yglVar.c.c(rvoVar, tlsVar3));
                                divLineHeightTextView2.addSubscription(sqkVar.b.c(rvoVar, tlsVar3));
                                divLineHeightTextView2.addSubscription(sqkVar.a.c(rvoVar, tlsVar3));
                                divLineHeightTextView2.addSubscription((hglVar != null || (bclVar2 = hglVar.b) == null || (expression6 = bclVar2.a) == null) ? null : expression6.c(rvoVar, tlsVar3));
                                divLineHeightTextView2.addSubscription((hglVar != null || (bclVar = hglVar.b) == null || (expression5 = bclVar.d) == null) ? null : expression5.c(rvoVar, tlsVar3));
                                Expression expression46 = dflVar.k;
                                divLineHeightTextView2.addSubscription(expression46 == null ? expression46.c(rvoVar, tlsVar3) : null);
                                it3 = it;
                                list = list4;
                            }
                            it = it3;
                            divLineHeightTextView2.addSubscription((hglVar != null || (bclVar2 = hglVar.b) == null || (expression6 = bclVar2.a) == null) ? null : expression6.c(rvoVar, tlsVar3));
                            divLineHeightTextView2.addSubscription((hglVar != null || (bclVar = hglVar.b) == null || (expression5 = bclVar.d) == null) ? null : expression5.c(rvoVar, tlsVar3));
                            Expression expression462 = dflVar.k;
                            divLineHeightTextView2.addSubscription(expression462 == null ? expression462.c(rvoVar, tlsVar3) : null);
                            it3 = it;
                            list = list4;
                        }
                    }
                    list2 = list;
                    if (list2 != null) {
                        for (cfl cflVar : list2) {
                            Expression expression47 = cflVar.f;
                            sqk sqkVar2 = cflVar.j;
                            divLineHeightTextView2.addSubscription(expression47.c(rvoVar, tlsVar3));
                            divLineHeightTextView2.addSubscription(cflVar.d.c(rvoVar, tlsVar3));
                            divLineHeightTextView2.addSubscription(cflVar.i.c(rvoVar, tlsVar3));
                            divLineHeightTextView2.addSubscription(cflVar.b.c(rvoVar, tlsVar3));
                            Expression expression48 = cflVar.g;
                            divLineHeightTextView2.addSubscription(expression48 != null ? expression48.c(rvoVar, tlsVar3) : null);
                            divLineHeightTextView2.addSubscription(sqkVar2.b.c(rvoVar, tlsVar3));
                            divLineHeightTextView2.addSubscription(sqkVar2.a.c(rvoVar, tlsVar3));
                        }
                    }
                } else {
                    if (qje.k(expression4, fflVar3 != null ? fflVar3.W : null)) {
                        if (qje.k(expression2, fflVar3 != null ? fflVar3.I : null)) {
                            if (qje.k(expression3, fflVar3 != null ? fflVar3.w : null)) {
                                List list5 = fflVar2.q;
                                List list6 = fflVar3 != null ? fflVar3.q : null;
                                if (list5 == null && list6 == null) {
                                    fflVar = fflVar2;
                                    f1kVar = null;
                                    rvoVar = rvoVar2;
                                } else if (list5 != null && list6 != null) {
                                    f1kVar = null;
                                    if (list5.size() == list6.size()) {
                                        int i = 0;
                                        for (Object obj : list5) {
                                            int i2 = i + 1;
                                            if (i < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            if (jl40.l(((bpk) obj).a, ((bpk) list6.get(i)).a)) {
                                                i = i2;
                                            }
                                        }
                                        fflVar = fflVar2;
                                        rvoVar = rvoVar2;
                                    }
                                    final rvo rvoVar4 = aw5Var2.b;
                                    String str2 = (String) expression4.a(rvoVar4);
                                    wVar.Mg(divLineHeightTextView2, aw5Var2, fflVar2);
                                    wVar.Jg(divLineHeightTextView2, str2);
                                    if ((expression4 instanceof kvo) || !qje.B(expression2) || !qje.B(expression3)) {
                                        final DivLineHeightTextView divLineHeightTextView3 = divLineHeightTextView2;
                                        final ffl fflVar4 = fflVar2;
                                        final w wVar2 = wVar;
                                        final aw5 aw5Var3 = aw5Var2;
                                        tls tlsVar4 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainText$callback$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // defpackage.tls
                                            public final Object invoke(Object obj2) {
                                                String str3 = (String) fflVar4.W.a(rvoVar4);
                                                wVar2.Mg(divLineHeightTextView3, aw5Var3, fflVar4);
                                                wVar2.Jg(divLineHeightTextView3, str3);
                                                return zy11.a;
                                            }
                                        };
                                        aw5Var2 = aw5Var3;
                                        wVar = wVar2;
                                        fflVar = fflVar4;
                                        divLineHeightTextView2 = divLineHeightTextView3;
                                        divLineHeightTextView2.addSubscription(expression4.c(rvoVar4, tlsVar4));
                                        divLineHeightTextView2.addSubscription(expression2 == null ? expression2.c(rvoVar4, tlsVar4) : f1kVar);
                                        divLineHeightTextView2.addSubscription(expression3.c(rvoVar4, tlsVar4));
                                        rvoVar = rvoVar2;
                                    }
                                    fflVar = fflVar2;
                                    rvoVar = rvoVar2;
                                }
                            }
                        }
                    }
                    f1kVar = null;
                    final rvo rvoVar42 = aw5Var2.b;
                    String str22 = (String) expression4.a(rvoVar42);
                    wVar.Mg(divLineHeightTextView2, aw5Var2, fflVar2);
                    wVar.Jg(divLineHeightTextView2, str22);
                    if (expression4 instanceof kvo) {
                    }
                    final DivLineHeightTextView divLineHeightTextView32 = divLineHeightTextView2;
                    final ffl fflVar42 = fflVar2;
                    final w wVar22 = wVar;
                    final aw5 aw5Var32 = aw5Var2;
                    tls tlsVar42 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainText$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            String str3 = (String) fflVar42.W.a(rvoVar42);
                            wVar22.Mg(divLineHeightTextView32, aw5Var32, fflVar42);
                            wVar22.Jg(divLineHeightTextView32, str3);
                            return zy11.a;
                        }
                    };
                    aw5Var2 = aw5Var32;
                    wVar = wVar22;
                    fflVar = fflVar42;
                    divLineHeightTextView2 = divLineHeightTextView32;
                    divLineHeightTextView2.addSubscription(expression4.c(rvoVar42, tlsVar42));
                    divLineHeightTextView2.addSubscription(expression2 == null ? expression2.c(rvoVar42, tlsVar42) : f1kVar);
                    divLineHeightTextView2.addSubscription(expression3.c(rvoVar42, tlsVar42));
                    rvoVar = rvoVar2;
                }
                if ((aflVar != null ? aflVar.c : f1kVar) == null) {
                    if ((aflVar != null ? aflVar.b : f1kVar) == null) {
                        if ((aflVar != null ? aflVar.a : f1kVar) == null) {
                            ?? r3 = fflVar3 != null ? fflVar3.p : f1kVar;
                            if (!qje.k(aflVar != null ? aflVar.d : f1kVar, r3 != 0 ? r3.d : f1kVar)) {
                                CharSequence charSequence = (aflVar == null || (expression21 = aflVar.d) == null) ? f1kVar : (String) expression21.a(rvoVar);
                                if (charSequence == null) {
                                    charSequence = EllipsizedTextView.DEFAULT_ELLIPSIS;
                                }
                                divLineHeightTextView2.setEllipsis(charSequence);
                                if (qje.B(aflVar != null ? aflVar.d : f1kVar)) {
                                }
                                divLineHeightTextView2.addSubscription((aflVar == null || (expression20 = aflVar.d) == null) ? f1kVar : expression20.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainEllipsis$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        String str3 = (String) obj2;
                                        w wVar3 = w.this;
                                        DivLineHeightTextView divLineHeightTextView4 = divLineHeightTextView2;
                                        wVar3.getClass();
                                        if (str3 == null) {
                                            str3 = EllipsizedTextView.DEFAULT_ELLIPSIS;
                                        }
                                        divLineHeightTextView4.setEllipsis(str3);
                                        return zy11.a;
                                    }
                                }));
                            }
                            expression9 = fflVar.i;
                            expression10 = fflVar.k0;
                            if (qje.k(expression9, fflVar3 == null ? fflVar3.i : f1kVar)) {
                            }
                            Ig(divLineHeightTextView2, fflVar, rvoVar3);
                            if (qje.B(expression9) || !(expression10 instanceof kvo)) {
                                tls tlsVar5 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindEllipsize$callback$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        w wVar3 = w.this;
                                        DivLineHeightTextView divLineHeightTextView4 = divLineHeightTextView2;
                                        ffl fflVar5 = fflVar;
                                        rvo rvoVar5 = rvoVar3;
                                        wVar3.getClass();
                                        w.Ig(divLineHeightTextView4, fflVar5, rvoVar5);
                                        return zy11.a;
                                    }
                                };
                                if (expression9 != null) {
                                    divLineHeightTextView2.addSubscription(expression9.c(rvoVar3, tlsVar5));
                                }
                                divLineHeightTextView2.addSubscription(expression10.c(rvoVar3, tlsVar5));
                            }
                            mflVar = fflVar.a0;
                            if (mflVar != null) {
                                shader = f1kVar;
                                divLineHeightTextView2.getPaint().setShader(shader);
                            } else {
                                shader = f1kVar;
                                if (mflVar instanceof kfl) {
                                    final vyk a3 = ((kfl) mflVar).a();
                                    Expression expression49 = a3.a;
                                    Object obj2 = fflVar3 != null ? fflVar3.a0 : shader;
                                    if (obj2 instanceof kfl) {
                                        kfl kflVar = (kfl) obj2;
                                        if (qje.k(expression49, kflVar.a().a)) {
                                        }
                                    }
                                    List<uyk> list7 = a3.b;
                                    pvo pvoVar = a3.c;
                                    long longValue = ((Number) expression49.a(rvoVar3)).longValue();
                                    kic D0 = cma1.D0(a3, rvoVar3);
                                    jl40.p(D0, div2View);
                                    wVar.Kg(divLineHeightTextView2, longValue, D0);
                                    if (!(expression49 instanceof kvo) || ((pvoVar != null && !(pvoVar instanceof t6e)) || !cma1.d0(list7))) {
                                        final Div2View div2View4 = div2View;
                                        tls tlsVar6 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindLinearTextGradient$callback$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // defpackage.tls
                                            public final Object invoke(Object obj3) {
                                                w wVar3 = w.this;
                                                DivLineHeightTextView divLineHeightTextView4 = divLineHeightTextView2;
                                                long longValue2 = ((Number) a3.a.a(rvoVar3)).longValue();
                                                kic D02 = cma1.D0(a3, rvoVar3);
                                                jl40.p(D02, div2View4);
                                                wVar3.Kg(divLineHeightTextView4, longValue2, D02);
                                                return zy11.a;
                                            }
                                        };
                                        divLineHeightTextView2.addSubscription(expression49.c(rvoVar3, tlsVar6));
                                        divLineHeightTextView2.addSubscription(pvoVar != null ? pvoVar.b(rvoVar3, tlsVar6) : shader);
                                        if (list7 != null) {
                                            for (uyk uykVar : list7) {
                                                if (uykVar != null) {
                                                    divLineHeightTextView2.addSubscription(uykVar.a.c(rvoVar3, tlsVar6));
                                                    divLineHeightTextView2.addSubscription(uykVar.b.c(rvoVar3, tlsVar6));
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    final Div2View div2View5 = div2View;
                                    if (mflVar instanceof lfl) {
                                        final k5l a4 = ((lfl) mflVar).a();
                                        n5l n5lVar = a4.b;
                                        n5l n5lVar2 = a4.a;
                                        h6l h6lVar = a4.e;
                                        Object obj3 = fflVar3 != null ? fflVar3.a0 : shader;
                                        if (obj3 instanceof lfl) {
                                            lfl lflVar = (lfl) obj3;
                                            if (jl40.l(h6lVar, lflVar.a().e)) {
                                                if (jl40.l(n5lVar2, lflVar.a().a)) {
                                                    if (jl40.l(n5lVar, lflVar.a().b)) {
                                                    }
                                                }
                                            }
                                        }
                                        final DisplayMetrics displayMetrics = divLineHeightTextView2.getResources().getDisplayMetrics();
                                        pvo pvoVar2 = a4.d;
                                        List<j5l> list8 = a4.c;
                                        u5i0 G0 = cma1.G0(h6lVar, displayMetrics, rvoVar3);
                                        q5i0 F0 = cma1.F0(n5lVar2, displayMetrics, rvoVar3);
                                        q5i0 F02 = cma1.F0(n5lVar, displayMetrics, rvoVar3);
                                        kic E0 = cma1.E0(a4, rvoVar3);
                                        jl40.p(E0, div2View5);
                                        DivLineHeightTextView divLineHeightTextView4 = divLineHeightTextView2;
                                        Ng(divLineHeightTextView4, G0, F0, F02, E0);
                                        divLineHeightTextView2 = divLineHeightTextView4;
                                        boolean e0 = cma1.e0(list8);
                                        if ((pvoVar2 != null && !(pvoVar2 instanceof t6e)) || !e0) {
                                            tls tlsVar7 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRadialTextGradient$callback$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // defpackage.tls
                                                public final Object invoke(Object obj4) {
                                                    w wVar3 = w.this;
                                                    DivLineHeightTextView divLineHeightTextView5 = divLineHeightTextView2;
                                                    u5i0 G02 = cma1.G0(a4.e, displayMetrics, rvoVar3);
                                                    q5i0 F03 = cma1.F0(a4.a, displayMetrics, rvoVar3);
                                                    q5i0 F04 = cma1.F0(a4.b, displayMetrics, rvoVar3);
                                                    kic E02 = cma1.E0(a4, rvoVar3);
                                                    jl40.p(E02, div2View5);
                                                    wVar3.Ng(divLineHeightTextView5, G02, F03, F04, E02);
                                                    return zy11.a;
                                                }
                                            };
                                            divLineHeightTextView2.addSubscription(pvoVar2 != null ? pvoVar2.b(rvoVar3, tlsVar7) : shader);
                                            if (list8 != null) {
                                                for (j5l j5lVar : list8) {
                                                    if (j5lVar != null) {
                                                        divLineHeightTextView2.addSubscription(j5lVar.a.c(rvoVar3, tlsVar7));
                                                        divLineHeightTextView2.addSubscription(j5lVar.b.c(rvoVar3, tlsVar7));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            m8lVar = fflVar.b0;
                            if (qje.k(m8lVar == null ? m8lVar.a : shader, (fflVar3 != null || (m8lVar7 = fflVar3.b0) == null) ? shader : m8lVar7.a)) {
                                if (qje.k(m8lVar != null ? m8lVar.b : shader, (fflVar3 == null || (m8lVar6 = fflVar3.b0) == null) ? shader : m8lVar6.b)) {
                                    if (qje.k(m8lVar != null ? m8lVar.c : shader, (fflVar3 == null || (m8lVar5 = fflVar3.b0) == null) ? shader : m8lVar5.c)) {
                                        if (qje.k((m8lVar == null || (x4lVar13 = m8lVar.d) == null || (jnkVar13 = x4lVar13.a) == null) ? shader : jnkVar13.b, (fflVar3 == null || (m8lVar4 = fflVar3.b0) == null || (x4lVar12 = m8lVar4.d) == null || (jnkVar12 = x4lVar12.a) == null) ? shader : jnkVar12.b)) {
                                            if (qje.k((m8lVar == null || (x4lVar11 = m8lVar.d) == null || (jnkVar11 = x4lVar11.a) == null) ? shader : jnkVar11.a, (fflVar3 == null || (m8lVar3 = fflVar3.b0) == null || (x4lVar10 = m8lVar3.d) == null || (jnkVar10 = x4lVar10.a) == null) ? shader : jnkVar10.a)) {
                                                if (qje.k((m8lVar == null || (x4lVar9 = m8lVar.d) == null || (jnkVar9 = x4lVar9.b) == null) ? shader : jnkVar9.b, (fflVar3 == null || (m8lVar2 = fflVar3.b0) == null || (x4lVar8 = m8lVar2.d) == null || (jnkVar8 = x4lVar8.b) == null) ? shader : jnkVar8.b)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            final m8l m8lVar8 = fflVar.b0;
                            final DisplayMetrics displayMetrics2 = divLineHeightTextView2.getResources().getDisplayMetrics();
                            Tg(divLineHeightTextView2, m8lVar8 == null ? Vg(m8lVar8, rvoVar3, displayMetrics2, ((Number) expression23.a(rvoVar3)).intValue()) : shader);
                            if (qje.B(m8lVar == null ? m8lVar.a : shader)) {
                                if (qje.B(m8lVar != null ? m8lVar.b : shader)) {
                                    if (qje.B(m8lVar != null ? m8lVar.c : shader)) {
                                        if (qje.B((m8lVar == null || (x4lVar7 = m8lVar.d) == null || (jnkVar7 = x4lVar7.a) == null) ? shader : jnkVar7.b)) {
                                            if (qje.B((m8lVar == null || (x4lVar6 = m8lVar.d) == null || (jnkVar6 = x4lVar6.a) == null) ? shader : jnkVar6.a)) {
                                                if (qje.B((m8lVar == null || (x4lVar5 = m8lVar.d) == null || (jnkVar5 = x4lVar5.b) == null) ? shader : jnkVar5.b)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            final w wVar3 = this;
                            final ffl fflVar5 = fflVar;
                            tls tlsVar8 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextShadow$callback$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.tls
                                public final Object invoke(Object obj4) {
                                    kgr0 kgr0Var;
                                    w wVar4 = w.this;
                                    DivLineHeightTextView divLineHeightTextView5 = divLineHeightTextView2;
                                    m8l m8lVar9 = m8lVar8;
                                    if (m8lVar9 != null) {
                                        rvo rvoVar5 = rvoVar3;
                                        DisplayMetrics displayMetrics3 = displayMetrics2;
                                        int intValue = ((Number) fflVar5.Z.a(rvoVar5)).intValue();
                                        wVar4.getClass();
                                        kgr0Var = w.Vg(m8lVar9, rvoVar5, displayMetrics3, intValue);
                                    } else {
                                        kgr0Var = null;
                                    }
                                    wVar4.getClass();
                                    w.Tg(divLineHeightTextView5, kgr0Var);
                                    return zy11.a;
                                }
                            };
                            ffl fflVar6 = fflVar5;
                            divLineHeightTextView2.addSubscription((m8lVar8 != null || (expression17 = m8lVar8.a) == null) ? shader : expression17.c(rvoVar3, tlsVar8));
                            divLineHeightTextView2.addSubscription((m8lVar8 != null || (expression16 = m8lVar8.c) == null) ? shader : expression16.c(rvoVar3, tlsVar8));
                            divLineHeightTextView2.addSubscription((m8lVar8 != null || (expression15 = m8lVar8.b) == null) ? shader : expression15.c(rvoVar3, tlsVar8));
                            divLineHeightTextView2.addSubscription((m8lVar8 != null || (x4lVar4 = m8lVar8.d) == null || (jnkVar4 = x4lVar4.a) == null || (expression14 = jnkVar4.b) == null) ? shader : expression14.c(rvoVar3, tlsVar8));
                            divLineHeightTextView2.addSubscription((m8lVar8 != null || (x4lVar3 = m8lVar8.d) == null || (jnkVar3 = x4lVar3.a) == null || (expression13 = jnkVar3.a) == null) ? shader : expression13.c(rvoVar3, tlsVar8));
                            divLineHeightTextView2.addSubscription((m8lVar8 != null || (x4lVar2 = m8lVar8.d) == null || (jnkVar2 = x4lVar2.b) == null || (expression12 = jnkVar2.b) == null) ? shader : expression12.c(rvoVar3, tlsVar8));
                            divLineHeightTextView2.addSubscription((m8lVar8 != null || (x4lVar = m8lVar8.d) == null || (jnkVar = x4lVar.b) == null || (expression11 = jnkVar.a) == null) ? shader : expression11.c(rvoVar3, tlsVar8));
                            expression18 = fflVar6.T;
                            if (!qje.k(expression18, fflVar3 == null ? fflVar3.T : shader)) {
                                boolean booleanValue = ((Boolean) expression18.a(rvoVar3)).booleanValue();
                                MovementMethod movementMethod = divLineHeightTextView2.getMovementMethod();
                                divLineHeightTextView2.setTextIsSelectable(booleanValue);
                                if (movementMethod instanceof SelectableLinkMovementMethod) {
                                    divLineHeightTextView2.setMovementMethod(movementMethod);
                                }
                                if (!(expression18 instanceof kvo)) {
                                    divLineHeightTextView2.addSubscription(expression18.c(rvoVar3, new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindSelectable$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj4) {
                                            boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                                            w wVar4 = w.this;
                                            DivLineHeightTextView divLineHeightTextView5 = divLineHeightTextView2;
                                            wVar4.getClass();
                                            MovementMethod movementMethod2 = divLineHeightTextView5.getMovementMethod();
                                            divLineHeightTextView5.setTextIsSelectable(booleanValue2);
                                            if (movementMethod2 instanceof SelectableLinkMovementMethod) {
                                                divLineHeightTextView5.setMovementMethod(movementMethod2);
                                            }
                                            return zy11.a;
                                        }
                                    }));
                                }
                            }
                            expression19 = fflVar6.c0;
                            if (!qje.k(expression19, fflVar3 == null ? fflVar3.c0 : shader)) {
                                divLineHeightTextView2.setTightenWidth(((Boolean) expression19.a(rvoVar3)).booleanValue());
                                if (!(expression19 instanceof kvo)) {
                                    divLineHeightTextView2.addSubscription(expression19.c(rvoVar3, new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTightenWidth$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj4) {
                                            boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                                            w wVar4 = w.this;
                                            DivLineHeightTextView divLineHeightTextView5 = divLineHeightTextView2;
                                            wVar4.getClass();
                                            divLineHeightTextView5.setTightenWidth(booleanValue2);
                                            return zy11.a;
                                        }
                                    }));
                                }
                            }
                            divLineHeightTextView2.setFocusable((divLineHeightTextView2.isFocusable() && expression == null) ? false : true);
                        }
                    }
                }
                wVar.Og(divLineHeightTextView2, aw5Var2, fflVar);
                if (aflVar != null) {
                    tls tlsVar9 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichEllipsis$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj4) {
                            w.this.Og(divLineHeightTextView2, aw5Var2, fflVar);
                            return zy11.a;
                        }
                    };
                    divLineHeightTextView2.addSubscription(aflVar.d.c(rvoVar, tlsVar9));
                    List list9 = aflVar.c;
                    if (list9 != null) {
                        for (Iterator it4 = list9.iterator(); it4.hasNext(); it4 = it2) {
                            dfl dflVar2 = (dfl) it4.next();
                            Expression expression50 = dflVar2.q;
                            hgl hglVar2 = dflVar2.e;
                            divLineHeightTextView2.addSubscription(expression50.c(rvoVar, tlsVar9));
                            Expression expression51 = dflVar2.f;
                            divLineHeightTextView2.addSubscription(expression51 != null ? expression51.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression52 = dflVar2.b;
                            divLineHeightTextView2.addSubscription(expression52 != null ? expression52.c(rvoVar, tlsVar9) : f1kVar);
                            divLineHeightTextView2.addSubscription(dflVar2.d.c(rvoVar, tlsVar9));
                            Expression expression53 = dflVar2.i;
                            divLineHeightTextView2.addSubscription(expression53 != null ? expression53.c(rvoVar, tlsVar9) : f1kVar);
                            divLineHeightTextView2.addSubscription(dflVar2.j.c(rvoVar, tlsVar9));
                            Expression expression54 = dflVar2.g;
                            divLineHeightTextView2.addSubscription(expression54 != null ? expression54.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression55 = dflVar2.l;
                            divLineHeightTextView2.addSubscription(expression55 != null ? expression55.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression56 = dflVar2.m;
                            divLineHeightTextView2.addSubscription(expression56 != null ? expression56.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression57 = dflVar2.h;
                            divLineHeightTextView2.addSubscription(expression57 != null ? expression57.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression58 = dflVar2.n;
                            divLineHeightTextView2.addSubscription(expression58 != null ? expression58.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression59 = dflVar2.o;
                            divLineHeightTextView2.addSubscription(expression59 != null ? expression59.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression60 = dflVar2.r;
                            divLineHeightTextView2.addSubscription(expression60 != null ? expression60.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression61 = dflVar2.s;
                            divLineHeightTextView2.addSubscription(expression61 != null ? expression61.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression62 = dflVar2.u;
                            divLineHeightTextView2.addSubscription(expression62 != null ? expression62.c(rvoVar, tlsVar9) : f1kVar);
                            Expression expression63 = dflVar2.v;
                            divLineHeightTextView2.addSubscription(expression63 != null ? expression63.c(rvoVar, tlsVar9) : f1kVar);
                            agl aglVar2 = dflVar2.c;
                            Object a5 = aglVar2 != null ? aglVar2.a() : f1kVar;
                            if (a5 instanceof wal) {
                                divLineHeightTextView2.addSubscription(((wal) a5).a.c(rvoVar, tlsVar9));
                            }
                            pgl pglVar2 = dflVar2.p;
                            Object a6 = pglVar2 != null ? pglVar2.a() : f1kVar;
                            if (a6 instanceof fhl) {
                                fhl fhlVar2 = (fhl) a6;
                                divLineHeightTextView2.addSubscription(fhlVar2.b.c(rvoVar, tlsVar9));
                                divLineHeightTextView2.addSubscription(fhlVar2.a.c(rvoVar, tlsVar9));
                            } else if (a6 instanceof ygl) {
                                ygl yglVar2 = (ygl) a6;
                                sqk sqkVar3 = yglVar2.e;
                                it2 = it4;
                                divLineHeightTextView2.addSubscription(yglVar2.d.c(rvoVar, tlsVar9));
                                divLineHeightTextView2.addSubscription(yglVar2.a.c(rvoVar, tlsVar9));
                                divLineHeightTextView2.addSubscription(yglVar2.b.c(rvoVar, tlsVar9));
                                divLineHeightTextView2.addSubscription(yglVar2.c.c(rvoVar, tlsVar9));
                                divLineHeightTextView2.addSubscription(sqkVar3.b.c(rvoVar, tlsVar9));
                                divLineHeightTextView2.addSubscription(sqkVar3.a.c(rvoVar, tlsVar9));
                                divLineHeightTextView2.addSubscription((hglVar2 != null || (bclVar4 = hglVar2.b) == null || (expression8 = bclVar4.a) == null) ? f1kVar : expression8.c(rvoVar, tlsVar9));
                                divLineHeightTextView2.addSubscription((hglVar2 != null || (bclVar3 = hglVar2.b) == null || (expression7 = bclVar3.d) == null) ? f1kVar : expression7.c(rvoVar, tlsVar9));
                                Expression expression64 = dflVar2.k;
                                divLineHeightTextView2.addSubscription(expression64 == null ? expression64.c(rvoVar, tlsVar9) : f1kVar);
                            }
                            it2 = it4;
                            divLineHeightTextView2.addSubscription((hglVar2 != null || (bclVar4 = hglVar2.b) == null || (expression8 = bclVar4.a) == null) ? f1kVar : expression8.c(rvoVar, tlsVar9));
                            divLineHeightTextView2.addSubscription((hglVar2 != null || (bclVar3 = hglVar2.b) == null || (expression7 = bclVar3.d) == null) ? f1kVar : expression7.c(rvoVar, tlsVar9));
                            Expression expression642 = dflVar2.k;
                            divLineHeightTextView2.addSubscription(expression642 == null ? expression642.c(rvoVar, tlsVar9) : f1kVar);
                        }
                    }
                    List<cfl> list10 = aflVar.b;
                    if (list10 != null) {
                        for (cfl cflVar2 : list10) {
                            Expression expression65 = cflVar2.f;
                            sqk sqkVar4 = cflVar2.j;
                            divLineHeightTextView2.addSubscription(expression65.c(rvoVar, tlsVar9));
                            divLineHeightTextView2.addSubscription(cflVar2.i.c(rvoVar, tlsVar9));
                            Expression expression66 = cflVar2.g;
                            divLineHeightTextView2.addSubscription(expression66 != null ? expression66.c(rvoVar, tlsVar9) : f1kVar);
                            divLineHeightTextView2.addSubscription(sqkVar4.b.c(rvoVar, tlsVar9));
                            divLineHeightTextView2.addSubscription(sqkVar4.a.c(rvoVar, tlsVar9));
                        }
                    }
                }
                expression9 = fflVar.i;
                expression10 = fflVar.k0;
                if (qje.k(expression9, fflVar3 == null ? fflVar3.i : f1kVar)) {
                }
                Ig(divLineHeightTextView2, fflVar, rvoVar3);
                if (qje.B(expression9)) {
                }
                tls tlsVar52 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindEllipsize$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj22) {
                        w wVar32 = w.this;
                        DivLineHeightTextView divLineHeightTextView42 = divLineHeightTextView2;
                        ffl fflVar52 = fflVar;
                        rvo rvoVar5 = rvoVar3;
                        wVar32.getClass();
                        w.Ig(divLineHeightTextView42, fflVar52, rvoVar5);
                        return zy11.a;
                    }
                };
                if (expression9 != null) {
                }
                divLineHeightTextView2.addSubscription(expression10.c(rvoVar3, tlsVar52));
                mflVar = fflVar.a0;
                if (mflVar != null) {
                }
                m8lVar = fflVar.b0;
                if (qje.k(m8lVar == null ? m8lVar.a : shader, (fflVar3 != null || (m8lVar7 = fflVar3.b0) == null) ? shader : m8lVar7.a)) {
                }
                final m8l m8lVar82 = fflVar.b0;
                final DisplayMetrics displayMetrics22 = divLineHeightTextView2.getResources().getDisplayMetrics();
                Tg(divLineHeightTextView2, m8lVar82 == null ? Vg(m8lVar82, rvoVar3, displayMetrics22, ((Number) expression23.a(rvoVar3)).intValue()) : shader);
                if (qje.B(m8lVar == null ? m8lVar.a : shader)) {
                }
                final w wVar32 = this;
                final ffl fflVar52 = fflVar;
                tls tlsVar82 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextShadow$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        kgr0 kgr0Var;
                        w wVar4 = w.this;
                        DivLineHeightTextView divLineHeightTextView5 = divLineHeightTextView2;
                        m8l m8lVar9 = m8lVar82;
                        if (m8lVar9 != null) {
                            rvo rvoVar5 = rvoVar3;
                            DisplayMetrics displayMetrics3 = displayMetrics22;
                            int intValue = ((Number) fflVar52.Z.a(rvoVar5)).intValue();
                            wVar4.getClass();
                            kgr0Var = w.Vg(m8lVar9, rvoVar5, displayMetrics3, intValue);
                        } else {
                            kgr0Var = null;
                        }
                        wVar4.getClass();
                        w.Tg(divLineHeightTextView5, kgr0Var);
                        return zy11.a;
                    }
                };
                ffl fflVar62 = fflVar52;
                divLineHeightTextView2.addSubscription((m8lVar82 != null || (expression17 = m8lVar82.a) == null) ? shader : expression17.c(rvoVar3, tlsVar82));
                divLineHeightTextView2.addSubscription((m8lVar82 != null || (expression16 = m8lVar82.c) == null) ? shader : expression16.c(rvoVar3, tlsVar82));
                divLineHeightTextView2.addSubscription((m8lVar82 != null || (expression15 = m8lVar82.b) == null) ? shader : expression15.c(rvoVar3, tlsVar82));
                divLineHeightTextView2.addSubscription((m8lVar82 != null || (x4lVar4 = m8lVar82.d) == null || (jnkVar4 = x4lVar4.a) == null || (expression14 = jnkVar4.b) == null) ? shader : expression14.c(rvoVar3, tlsVar82));
                divLineHeightTextView2.addSubscription((m8lVar82 != null || (x4lVar3 = m8lVar82.d) == null || (jnkVar3 = x4lVar3.a) == null || (expression13 = jnkVar3.a) == null) ? shader : expression13.c(rvoVar3, tlsVar82));
                divLineHeightTextView2.addSubscription((m8lVar82 != null || (x4lVar2 = m8lVar82.d) == null || (jnkVar2 = x4lVar2.b) == null || (expression12 = jnkVar2.b) == null) ? shader : expression12.c(rvoVar3, tlsVar82));
                divLineHeightTextView2.addSubscription((m8lVar82 != null || (x4lVar = m8lVar82.d) == null || (jnkVar = x4lVar.b) == null || (expression11 = jnkVar.a) == null) ? shader : expression11.c(rvoVar3, tlsVar82));
                expression18 = fflVar62.T;
                if (!qje.k(expression18, fflVar3 == null ? fflVar3.T : shader)) {
                }
                expression19 = fflVar62.c0;
                if (!qje.k(expression19, fflVar3 == null ? fflVar3.c0 : shader)) {
                }
                divLineHeightTextView2.setFocusable((divLineHeightTextView2.isFocusable() && expression == null) ? false : true);
            }
        }
        div2View = div2View3;
        Lg(divLineHeightTextView2, div2View, expression29 != null ? (Long) expression29.a(rvoVar3) : null, expression30 != null ? (Long) expression30.a(rvoVar3) : null);
        if (!qje.B(expression29) || !qje.B(expression30)) {
            tls tlsVar10 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindMaxLines$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj4) {
                    w wVar4 = wVar;
                    DivLineHeightTextView divLineHeightTextView5 = divLineHeightTextView2;
                    Div2View div2View6 = aw5Var.a;
                    Expression expression67 = fflVar2.L;
                    Long l = expression67 != null ? (Long) expression67.a(rvoVar3) : null;
                    Expression expression68 = fflVar2.M;
                    Long l2 = expression68 != null ? (Long) expression68.a(rvoVar3) : null;
                    wVar4.getClass();
                    w.Lg(divLineHeightTextView5, div2View6, l, l2);
                    return zy11.a;
                }
            };
            aw5Var2 = aw5Var;
            wVar = wVar;
            fflVar2 = fflVar2;
            divLineHeightTextView2 = divLineHeightTextView2;
            divLineHeightTextView2.addSubscription(expression29 != null ? expression29.c(rvoVar3, tlsVar10) : null);
            divLineHeightTextView2.addSubscription(expression30 != null ? expression30.c(rvoVar3, tlsVar10) : null);
            expression2 = fflVar2.I;
            expression3 = fflVar2.w;
            expression4 = fflVar2.W;
            list = fflVar2.F;
            if (list3 == null) {
            }
            fflVar = fflVar2;
            f1kVar = null;
            wVar.Pg(divLineHeightTextView2, aw5Var2, fflVar);
            rvoVar = rvoVar2;
            wVar.Jg(divLineHeightTextView2, (String) expression4.a(rvoVar));
            divLineHeightTextView2.addSubscription(expression4.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj4) {
                    w.this.Pg(divLineHeightTextView2, aw5Var2, fflVar);
                    w.this.Jg(divLineHeightTextView2, (String) obj4);
                    return zy11.a;
                }
            }));
            tls tlsVar32 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj4) {
                    w.this.Pg(divLineHeightTextView2, aw5Var2, fflVar);
                    return zy11.a;
                }
            };
            divLineHeightTextView2.addSubscription(fflVar.v.c(rvoVar, tlsVar32));
            divLineHeightTextView2.addSubscription(expression3.c(rvoVar, tlsVar32));
            Expression expression312 = fflVar.t;
            divLineHeightTextView2.addSubscription(expression312 != null ? expression312.c(rvoVar, tlsVar32) : null);
            divLineHeightTextView2.addSubscription(expression2 != null ? expression2.c(rvoVar, tlsVar32) : null);
            if (list3 != null) {
            }
            list2 = list;
            if (list2 != null) {
            }
            if ((aflVar != null ? aflVar.c : f1kVar) == null) {
            }
            wVar.Og(divLineHeightTextView2, aw5Var2, fflVar);
            if (aflVar != null) {
            }
            expression9 = fflVar.i;
            expression10 = fflVar.k0;
            if (qje.k(expression9, fflVar3 == null ? fflVar3.i : f1kVar)) {
            }
            Ig(divLineHeightTextView2, fflVar, rvoVar3);
            if (qje.B(expression9)) {
            }
            tls tlsVar522 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindEllipsize$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj22) {
                    w wVar322 = w.this;
                    DivLineHeightTextView divLineHeightTextView42 = divLineHeightTextView2;
                    ffl fflVar522 = fflVar;
                    rvo rvoVar5 = rvoVar3;
                    wVar322.getClass();
                    w.Ig(divLineHeightTextView42, fflVar522, rvoVar5);
                    return zy11.a;
                }
            };
            if (expression9 != null) {
            }
            divLineHeightTextView2.addSubscription(expression10.c(rvoVar3, tlsVar522));
            mflVar = fflVar.a0;
            if (mflVar != null) {
            }
            m8lVar = fflVar.b0;
            if (qje.k(m8lVar == null ? m8lVar.a : shader, (fflVar3 != null || (m8lVar7 = fflVar3.b0) == null) ? shader : m8lVar7.a)) {
            }
            final m8l m8lVar822 = fflVar.b0;
            final DisplayMetrics displayMetrics222 = divLineHeightTextView2.getResources().getDisplayMetrics();
            Tg(divLineHeightTextView2, m8lVar822 == null ? Vg(m8lVar822, rvoVar3, displayMetrics222, ((Number) expression23.a(rvoVar3)).intValue()) : shader);
            if (qje.B(m8lVar == null ? m8lVar.a : shader)) {
            }
            final w wVar322 = this;
            final ffl fflVar522 = fflVar;
            tls tlsVar822 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextShadow$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj4) {
                    kgr0 kgr0Var;
                    w wVar4 = w.this;
                    DivLineHeightTextView divLineHeightTextView5 = divLineHeightTextView2;
                    m8l m8lVar9 = m8lVar822;
                    if (m8lVar9 != null) {
                        rvo rvoVar5 = rvoVar3;
                        DisplayMetrics displayMetrics3 = displayMetrics222;
                        int intValue = ((Number) fflVar522.Z.a(rvoVar5)).intValue();
                        wVar4.getClass();
                        kgr0Var = w.Vg(m8lVar9, rvoVar5, displayMetrics3, intValue);
                    } else {
                        kgr0Var = null;
                    }
                    wVar4.getClass();
                    w.Tg(divLineHeightTextView5, kgr0Var);
                    return zy11.a;
                }
            };
            ffl fflVar622 = fflVar522;
            divLineHeightTextView2.addSubscription((m8lVar822 != null || (expression17 = m8lVar822.a) == null) ? shader : expression17.c(rvoVar3, tlsVar822));
            divLineHeightTextView2.addSubscription((m8lVar822 != null || (expression16 = m8lVar822.c) == null) ? shader : expression16.c(rvoVar3, tlsVar822));
            divLineHeightTextView2.addSubscription((m8lVar822 != null || (expression15 = m8lVar822.b) == null) ? shader : expression15.c(rvoVar3, tlsVar822));
            divLineHeightTextView2.addSubscription((m8lVar822 != null || (x4lVar4 = m8lVar822.d) == null || (jnkVar4 = x4lVar4.a) == null || (expression14 = jnkVar4.b) == null) ? shader : expression14.c(rvoVar3, tlsVar822));
            divLineHeightTextView2.addSubscription((m8lVar822 != null || (x4lVar3 = m8lVar822.d) == null || (jnkVar3 = x4lVar3.a) == null || (expression13 = jnkVar3.a) == null) ? shader : expression13.c(rvoVar3, tlsVar822));
            divLineHeightTextView2.addSubscription((m8lVar822 != null || (x4lVar2 = m8lVar822.d) == null || (jnkVar2 = x4lVar2.b) == null || (expression12 = jnkVar2.b) == null) ? shader : expression12.c(rvoVar3, tlsVar822));
            divLineHeightTextView2.addSubscription((m8lVar822 != null || (x4lVar = m8lVar822.d) == null || (jnkVar = x4lVar.b) == null || (expression11 = jnkVar.a) == null) ? shader : expression11.c(rvoVar3, tlsVar822));
            expression18 = fflVar622.T;
            if (!qje.k(expression18, fflVar3 == null ? fflVar3.T : shader)) {
            }
            expression19 = fflVar622.c0;
            if (!qje.k(expression19, fflVar3 == null ? fflVar3.c0 : shader)) {
            }
            divLineHeightTextView2.setFocusable((divLineHeightTextView2.isFocusable() && expression == null) ? false : true);
        }
        aw5Var2 = aw5Var;
        expression2 = fflVar2.I;
        expression3 = fflVar2.w;
        expression4 = fflVar2.W;
        list = fflVar2.F;
        if (list3 == null) {
        }
        fflVar = fflVar2;
        f1kVar = null;
        wVar.Pg(divLineHeightTextView2, aw5Var2, fflVar);
        rvoVar = rvoVar2;
        wVar.Jg(divLineHeightTextView2, (String) expression4.a(rvoVar));
        divLineHeightTextView2.addSubscription(expression4.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj4) {
                w.this.Pg(divLineHeightTextView2, aw5Var2, fflVar);
                w.this.Jg(divLineHeightTextView2, (String) obj4);
                return zy11.a;
            }
        }));
        tls tlsVar322 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj4) {
                w.this.Pg(divLineHeightTextView2, aw5Var2, fflVar);
                return zy11.a;
            }
        };
        divLineHeightTextView2.addSubscription(fflVar.v.c(rvoVar, tlsVar322));
        divLineHeightTextView2.addSubscription(expression3.c(rvoVar, tlsVar322));
        Expression expression3122 = fflVar.t;
        divLineHeightTextView2.addSubscription(expression3122 != null ? expression3122.c(rvoVar, tlsVar322) : null);
        divLineHeightTextView2.addSubscription(expression2 != null ? expression2.c(rvoVar, tlsVar322) : null);
        if (list3 != null) {
        }
        list2 = list;
        if (list2 != null) {
        }
        if ((aflVar != null ? aflVar.c : f1kVar) == null) {
        }
        wVar.Og(divLineHeightTextView2, aw5Var2, fflVar);
        if (aflVar != null) {
        }
        expression9 = fflVar.i;
        expression10 = fflVar.k0;
        if (qje.k(expression9, fflVar3 == null ? fflVar3.i : f1kVar)) {
        }
        Ig(divLineHeightTextView2, fflVar, rvoVar3);
        if (qje.B(expression9)) {
        }
        tls tlsVar5222 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindEllipsize$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj22) {
                w wVar3222 = w.this;
                DivLineHeightTextView divLineHeightTextView42 = divLineHeightTextView2;
                ffl fflVar5222 = fflVar;
                rvo rvoVar5 = rvoVar3;
                wVar3222.getClass();
                w.Ig(divLineHeightTextView42, fflVar5222, rvoVar5);
                return zy11.a;
            }
        };
        if (expression9 != null) {
        }
        divLineHeightTextView2.addSubscription(expression10.c(rvoVar3, tlsVar5222));
        mflVar = fflVar.a0;
        if (mflVar != null) {
        }
        m8lVar = fflVar.b0;
        if (qje.k(m8lVar == null ? m8lVar.a : shader, (fflVar3 != null || (m8lVar7 = fflVar3.b0) == null) ? shader : m8lVar7.a)) {
        }
        final m8l m8lVar8222 = fflVar.b0;
        final DisplayMetrics displayMetrics2222 = divLineHeightTextView2.getResources().getDisplayMetrics();
        Tg(divLineHeightTextView2, m8lVar8222 == null ? Vg(m8lVar8222, rvoVar3, displayMetrics2222, ((Number) expression23.a(rvoVar3)).intValue()) : shader);
        if (qje.B(m8lVar == null ? m8lVar.a : shader)) {
        }
        final w wVar3222 = this;
        final ffl fflVar5222 = fflVar;
        tls tlsVar8222 = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextShadow$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj4) {
                kgr0 kgr0Var;
                w wVar4 = w.this;
                DivLineHeightTextView divLineHeightTextView5 = divLineHeightTextView2;
                m8l m8lVar9 = m8lVar8222;
                if (m8lVar9 != null) {
                    rvo rvoVar5 = rvoVar3;
                    DisplayMetrics displayMetrics3 = displayMetrics2222;
                    int intValue = ((Number) fflVar5222.Z.a(rvoVar5)).intValue();
                    wVar4.getClass();
                    kgr0Var = w.Vg(m8lVar9, rvoVar5, displayMetrics3, intValue);
                } else {
                    kgr0Var = null;
                }
                wVar4.getClass();
                w.Tg(divLineHeightTextView5, kgr0Var);
                return zy11.a;
            }
        };
        ffl fflVar6222 = fflVar5222;
        divLineHeightTextView2.addSubscription((m8lVar8222 != null || (expression17 = m8lVar8222.a) == null) ? shader : expression17.c(rvoVar3, tlsVar8222));
        divLineHeightTextView2.addSubscription((m8lVar8222 != null || (expression16 = m8lVar8222.c) == null) ? shader : expression16.c(rvoVar3, tlsVar8222));
        divLineHeightTextView2.addSubscription((m8lVar8222 != null || (expression15 = m8lVar8222.b) == null) ? shader : expression15.c(rvoVar3, tlsVar8222));
        divLineHeightTextView2.addSubscription((m8lVar8222 != null || (x4lVar4 = m8lVar8222.d) == null || (jnkVar4 = x4lVar4.a) == null || (expression14 = jnkVar4.b) == null) ? shader : expression14.c(rvoVar3, tlsVar8222));
        divLineHeightTextView2.addSubscription((m8lVar8222 != null || (x4lVar3 = m8lVar8222.d) == null || (jnkVar3 = x4lVar3.a) == null || (expression13 = jnkVar3.a) == null) ? shader : expression13.c(rvoVar3, tlsVar8222));
        divLineHeightTextView2.addSubscription((m8lVar8222 != null || (x4lVar2 = m8lVar8222.d) == null || (jnkVar2 = x4lVar2.b) == null || (expression12 = jnkVar2.b) == null) ? shader : expression12.c(rvoVar3, tlsVar8222));
        divLineHeightTextView2.addSubscription((m8lVar8222 != null || (x4lVar = m8lVar8222.d) == null || (jnkVar = x4lVar.b) == null || (expression11 = jnkVar.a) == null) ? shader : expression11.c(rvoVar3, tlsVar8222));
        expression18 = fflVar6222.T;
        if (!qje.k(expression18, fflVar3 == null ? fflVar3.T : shader)) {
        }
        expression19 = fflVar6222.c0;
        if (!qje.k(expression19, fflVar3 == null ? fflVar3.c0 : shader)) {
        }
        divLineHeightTextView2.setFocusable((divLineHeightTextView2.isFocusable() && expression == null) ? false : true);
    }

    public final void Jg(TextView textView, String str) {
        int hyphenationFrequency = textView.getHyphenationFrequency();
        int i = 0;
        if (this.x && evu0.z(str, (char) 173)) {
            i = 1;
        }
        if (hyphenationFrequency != i) {
            textView.setHyphenationFrequency(i);
        }
    }

    public final void Kg(final TextView textView, final long j, final kic kicVar) {
        if (!ffx.V(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyLinearTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TextPaint paint = textView.getPaint();
                    wiy wiyVar = LinearGradientDrawable.Companion;
                    float f = j;
                    kic kicVar2 = kicVar;
                    int[] iArr = kicVar2.a;
                    float[] fArr = kicVar2.b;
                    int Hg = w.Hg(this, textView);
                    int height = (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop();
                    wiyVar.getClass();
                    paint.setShader(wiy.a(f, iArr, fArr, Hg, height));
                    textView.invalidate();
                }
            });
            return;
        }
        TextPaint paint = textView.getPaint();
        wiy wiyVar = LinearGradientDrawable.Companion;
        int[] iArr = kicVar.a;
        float[] fArr = kicVar.b;
        int Hg = Hg(this, textView);
        int height = (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop();
        wiyVar.getClass();
        paint.setShader(wiy.a(j, iArr, fArr, Hg, height));
        textView.invalidate();
    }

    public final void Mg(TextView textView, aw5 aw5Var, ffl fflVar) {
        textView.setText(this.w.b(aw5Var, textView, fflVar, (String) fflVar.W.a(aw5Var.b), null, null, null, null, false));
    }

    public final void Ng(final TextView textView, final u5i0 u5i0Var, final q5i0 q5i0Var, final q5i0 q5i0Var2, final kic kicVar) {
        if (!ffx.V(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRadialTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    TextPaint paint = textView.getPaint();
                    com.yandex.div.internal.drawable.a aVar = RadialGradientDrawable.Companion;
                    u5i0 u5i0Var2 = u5i0Var;
                    q5i0 q5i0Var3 = q5i0Var;
                    q5i0 q5i0Var4 = q5i0Var2;
                    kic kicVar2 = kicVar;
                    int[] iArr = kicVar2.a;
                    float[] fArr = kicVar2.b;
                    int Hg = w.Hg(this, textView);
                    int height = (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop();
                    aVar.getClass();
                    paint.setShader(com.yandex.div.internal.drawable.a.b(u5i0Var2, q5i0Var3, q5i0Var4, iArr, fArr, Hg, height));
                    textView.invalidate();
                }
            });
            return;
        }
        TextPaint paint = textView.getPaint();
        com.yandex.div.internal.drawable.a aVar = RadialGradientDrawable.Companion;
        int[] iArr = kicVar.a;
        float[] fArr = kicVar.b;
        int Hg = Hg(this, textView);
        int height = (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop();
        aVar.getClass();
        paint.setShader(com.yandex.div.internal.drawable.a.b(u5i0Var, q5i0Var, q5i0Var2, iArr, fArr, Hg, height));
        textView.invalidate();
    }

    public final void Og(final EllipsizedTextView ellipsizedTextView, aw5 aw5Var, ffl fflVar) {
        afl aflVar = fflVar.p;
        if (aflVar == null) {
            ellipsizedTextView.setEllipsis(EllipsizedTextView.DEFAULT_ELLIPSIS);
            return;
        }
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRichEllipsis$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                EllipsizedTextView.this.setEllipsis((Spanned) obj);
                return zy11.a;
            }
        };
        this.w.b(aw5Var, ellipsizedTextView, fflVar, (String) aflVar.d.a(aw5Var.b), aflVar.c, aflVar.b, aflVar.a, tlsVar, true);
    }

    public final void Pg(final TextView textView, aw5 aw5Var, ffl fflVar) {
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRichText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                textView.setText((Spanned) obj, TextView.BufferType.NORMAL);
                return zy11.a;
            }
        };
        this.w.b(aw5Var, textView, fflVar, (String) fflVar.W.a(aw5Var.b), fflVar.Q, fflVar.F, null, tlsVar, false);
    }
}

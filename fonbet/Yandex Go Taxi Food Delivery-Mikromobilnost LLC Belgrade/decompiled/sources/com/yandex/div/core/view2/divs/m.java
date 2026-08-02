package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.m;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivInput$Autocapitalization;
import com.yandex.div2.DivInput$EnterKeyType;
import com.yandex.div2.DivInput$KeyboardType;
import defpackage.aef;
import defpackage.aw5;
import defpackage.c131;
import defpackage.cwk;
import defpackage.dwk;
import defpackage.egk;
import defpackage.ewk;
import defpackage.f1k;
import defpackage.gtq0;
import defpackage.gvu0;
import defpackage.hi91;
import defpackage.hqk;
import defpackage.hzv;
import defpackage.il11;
import defpackage.ipl;
import defpackage.iqk;
import defpackage.jl40;
import defpackage.jzv;
import defpackage.ker;
import defpackage.kvo;
import defpackage.kwk;
import defpackage.l6o;
import defpackage.luk;
import defpackage.m6o;
import defpackage.muk;
import defpackage.nml;
import defpackage.nuk;
import defpackage.omk;
import defpackage.ovo;
import defpackage.ppi0;
import defpackage.puk;
import defpackage.pvk;
import defpackage.qje;
import defpackage.quk;
import defpackage.qvk;
import defpackage.r8;
import defpackage.ruk;
import defpackage.rvo;
import defpackage.s3l;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.twk;
import defpackage.uml;
import defpackage.uvo;
import defpackage.veb0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wvo;
import defpackage.x25;
import defpackage.xkk;
import defpackage.y25;
import defpackage.yh;
import defpackage.zmk;
import defpackage.zy11;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class m extends r8 {
    public final m6o A;
    public final e c;
    public final nml w;
    public final il11 x;
    public final com.yandex.div.core.c y;
    public final yh z;

    public m(e eVar, nml nmlVar, il11 il11Var, com.yandex.div.core.c cVar, yh yhVar, m6o m6oVar) {
        super(4, eVar);
        this.c = eVar;
        this.w = nmlVar;
        this.x = il11Var;
        this.y = cVar;
        this.z = yhVar;
        this.A = m6oVar;
    }

    public static final void Hg(m mVar, final c131 c131Var, String str, final DivInputView divInputView, Div2View div2View, rvo rvoVar) {
        mVar.getClass();
        final boolean b = c131Var.b().b(str);
        gtq0.P(div2View, c131Var.c(), String.valueOf(b), rvoVar);
        final IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't find label with id '" + c131Var.a() + '\'');
        final l6o a = mVar.A.a(div2View.get_divData(), div2View.getDataTag());
        final ipl n = div2View.getViewComponent().n();
        if (!divInputView.isLaidOut() || divInputView.isLayoutRequested()) {
            divInputView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$attachAccessibility$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int a2 = ipl.this.a(c131Var.c);
                    if (a2 == -1) {
                        a.e(illegalArgumentException);
                        return;
                    }
                    View findViewById = divInputView.getRootView().findViewById(a2);
                    if (findViewById != null) {
                        findViewById.setLabelFor(b ? -1 : divInputView.getId());
                    } else {
                        a.e(illegalArgumentException);
                    }
                }
            });
            return;
        }
        int a2 = n.a(c131Var.a());
        if (a2 == -1) {
            a.e(illegalArgumentException);
            return;
        }
        View findViewById = divInputView.getRootView().findViewById(a2);
        if (findViewById != null) {
            findViewById.setLabelFor(b ? -1 : divInputView.getId());
        } else {
            a.e(illegalArgumentException);
        }
    }

    public static void Jg(DivInputView divInputView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        divInputView.setGravity(uml.b(divAlignmentHorizontal, divAlignmentVertical));
        int i = divAlignmentHorizontal == null ? -1 : nuk.a[divAlignmentHorizontal.ordinal()];
        int i2 = 5;
        if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3 || (i != 4 && i == 5)) {
                i2 = 6;
            }
        }
        divInputView.setTextAlignment(i2);
    }

    public final void Ig(DivInputView divInputView, aw5 aw5Var, muk mukVar, muk mukVar2) {
        Drawable nativeBackground;
        Drawable drawable;
        Expression expression;
        rvo rvoVar = aw5Var.b;
        luk lukVar = mukVar.K;
        int intValue = (lukVar == null || (expression = lukVar.a) == null) ? 0 : ((Number) expression.a(rvoVar)).intValue();
        if (intValue == 0 || (nativeBackground = divInputView.getNativeBackground()) == null) {
            drawable = null;
        } else {
            nativeBackground.setTint(intValue);
            drawable = nativeBackground;
        }
        uvo n = s8o.n(divInputView);
        this.c.b(divInputView, aw5Var, mukVar, mukVar2, n, false, drawable);
        e.c(divInputView, mukVar, mukVar2, aw5Var.b, n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c8  */
    @Override // defpackage.r8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ae(View view, final aw5 aw5Var, egk egkVar, egk egkVar2, com.yandex.div.core.state.b bVar) {
        final muk mukVar;
        m mVar;
        muk mukVar2;
        final Expression expression;
        final Expression expression2;
        final Expression expression3;
        final Expression expression4;
        pvk pvkVar;
        qvk c;
        Expression expression5;
        f1k c2;
        String str;
        DivInputView divInputView;
        Div2View div2View;
        List list;
        jzv focusTracker;
        f1k f1kVar;
        Expression expression6;
        final DivInputView divInputView2 = (DivInputView) view;
        final muk mukVar3 = (muk) egkVar;
        muk mukVar4 = (muk) egkVar2;
        final rvo rvoVar = aw5Var.b;
        final Div2View div2View2 = aw5Var.a;
        divInputView2.setTextAlignment(5);
        divInputView2.setAccessibilityEnabled$div_release(this.z.a(divInputView2.getContext()));
        luk lukVar = mukVar3.K;
        luk lukVar2 = mukVar4 != null ? mukVar4.K : null;
        if (!((lukVar == null && lukVar2 == null) ? true : qje.k(lukVar != null ? lukVar.a : null, lukVar2 != null ? lukVar2.a : null))) {
            Ig(divInputView2, aw5Var, mukVar3, mukVar4);
            if (!(lukVar == null ? true : lukVar.a instanceof kvo)) {
                if (lukVar == null || (expression6 = lukVar.a) == null) {
                    mukVar = mukVar4;
                    mVar = this;
                    mukVar2 = mukVar3;
                    f1kVar = null;
                } else {
                    mukVar = mukVar4;
                    tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeBackground$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            ((Number) obj).intValue();
                            m.this.Ig(divInputView2, aw5Var, mukVar3, mukVar);
                            return zy11.a;
                        }
                    };
                    divInputView2 = divInputView2;
                    mVar = this;
                    mukVar2 = mukVar3;
                    f1kVar = expression6.d(rvoVar, tlsVar);
                }
                divInputView2.addSubscription(f1kVar);
                final DivInputView divInputView3 = divInputView2;
                final muk mukVar5 = mukVar2;
                a.x(divInputView3, mukVar2.q, mukVar2.r, mukVar2.E, mukVar2.S, mukVar2.F, mukVar2.p, mukVar2.t, mukVar2.u, mukVar2.s, mukVar == null ? mukVar.q : null, mukVar == null ? mukVar.r : null, mukVar == null ? mukVar.E : null, mukVar == null ? mukVar.S : null, mukVar == null ? mukVar.F : null, mukVar == null ? mukVar.p : null, mukVar == null ? mukVar.t : null, mukVar == null ? mukVar.u : null, mukVar == null ? mukVar.s : null, mukVar, mVar.w, rvoVar);
                final Expression expression7 = mukVar5.Q;
                final Expression expression8 = mukVar5.R;
                Jg(divInputView3, (DivAlignmentHorizontal) expression7.a(rvoVar), (DivAlignmentVertical) expression8.a(rvoVar));
                tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeTextAlignment$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        m mVar2 = m.this;
                        DivInputView divInputView4 = divInputView3;
                        DivAlignmentHorizontal divAlignmentHorizontal = (DivAlignmentHorizontal) expression7.a(rvoVar);
                        DivAlignmentVertical divAlignmentVertical = (DivAlignmentVertical) expression8.a(rvoVar);
                        mVar2.getClass();
                        m.Jg(divInputView4, divAlignmentHorizontal, divAlignmentVertical);
                        return zy11.a;
                    }
                };
                divInputView3.addSubscription(expression7.c(rvoVar, tlsVar2));
                divInputView3.addSubscription(expression8.c(rvoVar, tlsVar2));
                expression = mukVar5.J;
                if (expression != null) {
                    divInputView3.addSubscription(expression.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxVisibleLines$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DivInputView divInputView4 = DivInputView.this;
                            long longValue = ((Number) expression.a(rvoVar)).longValue();
                            long j = longValue >> 31;
                            divInputView4.setMaxLines((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                            return zy11.a;
                        }
                    }));
                }
                expression2 = mukVar5.I;
                if (expression2 != null) {
                    divInputView3.addSubscription(expression2.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxLength$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DivInputView divInputView4 = DivInputView.this;
                            long longValue = ((Number) expression2.a(rvoVar)).longValue();
                            long j = longValue >> 31;
                            divInputView4.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE)});
                            return zy11.a;
                        }
                    }));
                }
                expression3 = mukVar5.z;
                if (expression3 != null) {
                    divInputView3.addSubscription(expression3.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintText$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DivInputView.this.setInputHint((String) expression3.a(rvoVar));
                            return zy11.a;
                        }
                    }));
                }
                divInputView3.addSubscription(mukVar5.y.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintColor$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        DivInputView.this.setHintTextColor(((Number) mukVar5.y.a(rvoVar)).intValue());
                        return zy11.a;
                    }
                }));
                expression4 = mukVar5.x;
                if (expression4 != null) {
                    divInputView3.addSubscription(expression4.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHighlightColor$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DivInputView.this.setHighlightColor(((Number) expression4.a(rvoVar)).intValue());
                            return zy11.a;
                        }
                    }));
                }
                tls tlsVar3 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i;
                        DivInput$KeyboardType divInput$KeyboardType = (DivInput$KeyboardType) muk.this.C.a(rvoVar);
                        DivInputView divInputView4 = divInputView3;
                        this.getClass();
                        switch (nuk.b[divInput$KeyboardType.ordinal()]) {
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 131073;
                                break;
                            case 3:
                                i = 33;
                                break;
                            case 4:
                                i = 17;
                                break;
                            case 5:
                                i = 12290;
                                break;
                            case 6:
                                i = 3;
                                break;
                            case 7:
                                i = HProv.PP_SECURITY_LEVEL;
                                break;
                            default:
                                w511.b();
                                return null;
                        }
                        m mVar2 = this;
                        muk mukVar6 = muk.this;
                        rvo rvoVar2 = rvoVar;
                        mVar2.getClass();
                        int i2 = nuk.d[((DivInput$Autocapitalization) mukVar6.f.a(rvoVar2)).ordinal()];
                        divInputView4.setInputType(i | (i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 4096 : 8192 : 16384));
                        divInputView3.setHorizontallyScrolling(divInput$KeyboardType != DivInput$KeyboardType.MULTI_LINE_TEXT);
                        return zy11.a;
                    }
                };
                divInputView3.addSubscription(mukVar5.C.c(rvoVar, tlsVar3));
                divInputView3.addSubscription(mukVar5.f.d(rvoVar, tlsVar3));
                divInputView3.addSubscription(mukVar5.l.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeEnterTypeAndActions$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i;
                        DivInput$EnterKeyType divInput$EnterKeyType = (DivInput$EnterKeyType) muk.this.l.a(rvoVar);
                        DivInputView divInputView4 = divInputView3;
                        int imeOptions = divInputView4.getImeOptions();
                        this.getClass();
                        int i2 = nuk.c[divInput$EnterKeyType.ordinal()];
                        if (i2 != 1) {
                            i = 4;
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    i = 6;
                                } else if (i2 == 4) {
                                    i = 3;
                                } else {
                                    if (i2 != 5) {
                                        w511.b();
                                        return null;
                                    }
                                    i = 2;
                                }
                            }
                        } else {
                            i = 0;
                        }
                        divInputView4.setImeOptions(imeOptions + i);
                        final List list2 = muk.this.k;
                        List list3 = list2;
                        if (list3 == null || list3.isEmpty()) {
                            divInputView3.setOnEditorActionListener(null);
                        } else {
                            final DivInputView divInputView5 = divInputView3;
                            final m mVar2 = this;
                            final aw5 aw5Var2 = aw5Var;
                            divInputView5.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ouk
                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                                    if ((i3 & 255) == 0) {
                                        return false;
                                    }
                                    m.this.y.d(aw5Var2, divInputView5, list2, "enter");
                                    return false;
                                }
                            });
                        }
                        return zy11.a;
                    }
                }));
                divInputView3.addSubscription(mukVar5.O.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeSelectAllOnFocus$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        DivInputView.this.setSelectAllOnFocus(((Boolean) mukVar5.O.a(rvoVar)).booleanValue());
                        return zy11.a;
                    }
                }));
                divInputView3.addSubscription(mukVar5.B.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeIsEnabled$callback$1
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (!booleanValue && DivInputView.this.isFocused()) {
                            hi91.a(DivInputView.this);
                        }
                        DivInputView.this.setEnabled$div_release(booleanValue);
                        return zy11.a;
                    }
                }));
                divInputView3.removeAfterTextChangeListener();
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                final rvo rvoVar2 = aw5Var.b;
                final tls tlsVar4 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.yandex.div.core.util.mask.a] */
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        ?? r2 = (com.yandex.div.core.util.mask.a) obj;
                        Ref$ObjectRef.this.element = r2;
                        if (r2 != 0) {
                            DivInputView divInputView4 = divInputView3;
                            divInputView4.setText(r2.i());
                            divInputView4.setSelection(r2.d);
                        }
                        return zy11.a;
                    }
                };
                final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                zmk dataTag = div2View2.getDataTag();
                omk omkVar = div2View2.get_divData();
                m6o m6oVar = this.A;
                final l6o a = m6oVar.a(omkVar, dataTag);
                final KeyListener keyListener = divInputView3.getKeyListener();
                final wls wlsVar = new wls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$catchCommonMaskException$1
                    {
                        super(2);
                    }

                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        Exception exc = (Exception) obj;
                        sls slsVar = (sls) obj2;
                        if (exc instanceof PatternSyntaxException) {
                            l6o.this.e(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc).getPattern() + "'."));
                        } else {
                            slsVar.invoke();
                        }
                        return zy11.a;
                    }
                };
                tls tlsVar5 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        Locale locale;
                        pvk pvkVar2 = muk.this.H;
                        T t = 0;
                        qvk c3 = pvkVar2 != null ? pvkVar2.c() : null;
                        Ref$ObjectRef<com.yandex.div.core.util.mask.a> ref$ObjectRef3 = ref$ObjectRef2;
                        if (c3 instanceof iqk) {
                            divInputView3.setKeyListener(keyListener);
                            iqk iqkVar = (iqk) c3;
                            String str2 = (String) iqkVar.b.a(rvoVar2);
                            List<hqk> list2 = iqkVar.c;
                            rvo rvoVar3 = rvoVar2;
                            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                            for (hqk hqkVar : list2) {
                                char u0 = gvu0.u0((CharSequence) hqkVar.a.a(rvoVar3));
                                Expression expression9 = hqkVar.c;
                                String str3 = expression9 != null ? (String) expression9.a(rvoVar3) : null;
                                Character v0 = gvu0.v0((CharSequence) hqkVar.b.a(rvoVar3));
                                arrayList.add(new y25(u0, str3, v0 != null ? v0.charValue() : (char) 0));
                            }
                            x25 x25Var = new x25(str2, arrayList, ((Boolean) iqkVar.a.a(rvoVar2)).booleanValue());
                            com.yandex.div.core.util.mask.a aVar = ref$ObjectRef2.element;
                            if (aVar != null) {
                                aVar.n(x25Var, true);
                            } else {
                                final wls wlsVar2 = wlsVar;
                                aVar = new ker(x25Var, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.2

                                    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                    /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$2$1, reason: invalid class name */
                                    final class AnonymousClass1 extends Lambda implements sls {
                                        public static final AnonymousClass1 w = new AnonymousClass1(0);

                                        @Override // defpackage.sls
                                        public final /* bridge */ /* synthetic */ Object invoke() {
                                            return zy11.a;
                                        }
                                    }

                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        wls.this.invoke((Exception) obj2, AnonymousClass1.w);
                                        return zy11.a;
                                    }
                                });
                            }
                            t = aVar;
                        } else if (c3 instanceof xkk) {
                            Expression expression10 = ((xkk) c3).a;
                            String str4 = expression10 != null ? (String) expression10.a(rvoVar2) : null;
                            if (str4 != null) {
                                locale = Locale.forLanguageTag(str4);
                                l6o l6oVar = a;
                                String languageTag = locale.toLanguageTag();
                                if (!jl40.l(languageTag, str4)) {
                                    l6oVar.f(new IllegalArgumentException("Original locale tag '" + str4 + "' is not equals to final one '" + languageTag + '\''));
                                }
                            } else {
                                locale = Locale.getDefault();
                            }
                            divInputView3.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
                            com.yandex.div.core.util.mask.a aVar2 = ref$ObjectRef2.element;
                            com.yandex.div.core.util.mask.a aVar3 = aVar2;
                            if (aVar3 != null) {
                                aef aefVar = (aef) aVar2;
                                String replace = aefVar.h().replace(aefVar.p().getDecimalSeparator(), '.');
                                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
                                aefVar.o(currencyInstance);
                                aefVar.h = currencyInstance;
                                aefVar.a(replace.replace('.', aefVar.p().getDecimalSeparator()), null);
                                t = aVar3;
                            } else {
                                final wls wlsVar3 = wlsVar;
                                t = new aef(locale, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.4

                                    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                    /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$4$1, reason: invalid class name */
                                    final class AnonymousClass1 extends Lambda implements sls {
                                        public static final AnonymousClass1 w = new AnonymousClass1(0);

                                        @Override // defpackage.sls
                                        public final /* bridge */ /* synthetic */ Object invoke() {
                                            return zy11.a;
                                        }
                                    }

                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        wls.this.invoke((Exception) obj2, AnonymousClass1.w);
                                        return zy11.a;
                                    }
                                });
                            }
                        } else {
                            boolean z = c3 instanceof s3l;
                            DivInputView divInputView4 = divInputView3;
                            if (z) {
                                divInputView4.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
                                com.yandex.div.core.util.mask.a aVar4 = ref$ObjectRef2.element;
                                if (aVar4 != null) {
                                    aVar4.n(veb0.b, true);
                                    t = aVar4;
                                } else {
                                    final wls wlsVar4 = wlsVar;
                                    t = new ker(new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.6

                                        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                        /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$6$1, reason: invalid class name */
                                        final class AnonymousClass1 extends Lambda implements sls {
                                            public static final AnonymousClass1 w = new AnonymousClass1(0);

                                            @Override // defpackage.sls
                                            public final /* bridge */ /* synthetic */ Object invoke() {
                                                return zy11.a;
                                            }
                                        }

                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj2) {
                                            wls.this.invoke((Exception) obj2, AnonymousClass1.w);
                                            return zy11.a;
                                        }
                                    });
                                }
                            } else {
                                divInputView4.setKeyListener(keyListener);
                            }
                        }
                        ref$ObjectRef3.element = t;
                        tlsVar4.invoke(ref$ObjectRef2.element);
                        return zy11.a;
                    }
                };
                pvkVar = mukVar5.H;
                String str2 = mukVar5.T;
                c = pvkVar == null ? pvkVar.c() : null;
                if (!(c instanceof iqk)) {
                    iqk iqkVar = (iqk) c;
                    divInputView3.addSubscription(iqkVar.b.c(rvoVar2, tlsVar5));
                    for (hqk hqkVar : iqkVar.c) {
                        divInputView3.addSubscription(hqkVar.a.c(rvoVar2, tlsVar5));
                        Expression expression9 = hqkVar.c;
                        if (expression9 != null) {
                            divInputView3.addSubscription(expression9.c(rvoVar2, tlsVar5));
                        }
                        divInputView3.addSubscription(hqkVar.b.c(rvoVar2, tlsVar5));
                    }
                    divInputView3.addSubscription(iqkVar.a.c(rvoVar2, tlsVar5));
                } else if ((c instanceof xkk) && (expression5 = ((xkk) c).a) != null && (c2 = expression5.c(rvoVar2, tlsVar5)) != null) {
                    divInputView3.addSubscription(c2);
                }
                zy11 zy11Var = zy11.a;
                tlsVar5.invoke(zy11Var);
                final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                final tls tlsVar6 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r2v1, types: [T, hzv] */
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        String str3;
                        ?? r2 = (hzv) obj;
                        Ref$ObjectRef.this.element = r2;
                        if (r2 != 0) {
                            DivInputView divInputView4 = divInputView3;
                            Editable editableText = divInputView4.getEditableText();
                            if (editableText == null || (str3 = editableText.toString()) == null) {
                                str3 = "";
                            }
                            r2.b = str3;
                            r2.c = divInputView4.getSelectionStart();
                        }
                        return zy11.a;
                    }
                };
                if (pvkVar == null) {
                    final List<ruk> list2 = mukVar5.n;
                    List list3 = list2;
                    if (list3 != null && !list3.isEmpty()) {
                        final rvo rvoVar3 = aw5Var.b;
                        tls tlsVar7 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeFilters$updateFiltersData$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v3, types: [ppi0] */
                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                List<ruk> list4 = list2;
                                rvo rvoVar4 = rvoVar3;
                                m mVar2 = this;
                                aw5 aw5Var2 = aw5Var;
                                ArrayList arrayList = new ArrayList();
                                for (ruk rukVar : list4) {
                                    ovo ovoVar = null;
                                    if (rukVar instanceof quk) {
                                        try {
                                            ovoVar = new ppi0((String) ((quk) rukVar).b.a.a(rvoVar4));
                                        } catch (PatternSyntaxException e) {
                                            mVar2.A.a(aw5Var2.a.get_divData(), aw5Var2.a.getDataTag()).e(new IllegalArgumentException("Invalid regex pattern '" + e.getPattern() + "'.", e));
                                        }
                                    } else {
                                        if (!(rukVar instanceof puk)) {
                                            w511.b();
                                            return null;
                                        }
                                        ovoVar = new ovo(((puk) rukVar).b.a, rvoVar4);
                                    }
                                    if (ovoVar != null) {
                                        arrayList.add(ovoVar);
                                    }
                                }
                                tlsVar6.invoke(new hzv(arrayList));
                                return zy11.a;
                            }
                        };
                        for (ruk rukVar : list2) {
                            if (rukVar instanceof quk) {
                                divInputView3.addSubscription(((quk) rukVar).c().a.c(rvoVar3, tlsVar7));
                            }
                        }
                        tlsVar7.invoke(zy11Var);
                    }
                }
                if (pvkVar == null) {
                    String a2 = pvkVar.c().a();
                    if (a2 == null) {
                        divInputView = divInputView3;
                        div2View = div2View2;
                        divInputView.setFocusTracker$div_release(div2View.getInputFocusTracker());
                        focusTracker = divInputView.getFocusTracker();
                        if (focusTracker == null || divInputView.getTag() == null || !jl40.l(divInputView.getTag(), focusTracker.a) || !focusTracker.b) {
                            return;
                        }
                        focusTracker.c.a = true;
                        divInputView.requestFocus();
                        return;
                    }
                    str = str2;
                    str2 = a2;
                } else {
                    str = null;
                }
                divInputView3.addSubscription(this.x.a(aw5Var, str2, new l((com.yandex.div.core.util.mask.a) ref$ObjectRef.element, (hzv) ref$ObjectRef3.element, divInputView3, str, aw5Var)));
                final rvo rvoVar4 = aw5Var.b;
                final ArrayList arrayList = new ArrayList();
                final l6o a3 = m6oVar.a(div2View2.get_divData(), div2View2.getDataTag());
                final tls tlsVar8 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$revalidateExpressionValidator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        m.Hg(m.this, arrayList.get(((Number) obj).intValue()), String.valueOf(divInputView3.getText()), divInputView3, div2View2, rvoVar4);
                        return zy11.a;
                    }
                };
                divInputView3.addTextChangedListener(new TextWatcher() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$$inlined$doAfterTextChanged$1
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable s) {
                        if (s != null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                m.Hg(this, (c131) it.next(), String.valueOf(divInputView3.getText()), divInputView3, div2View2, rvoVar4);
                            }
                        }
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence text, int start, int before, int count) {
                    }
                });
                tls tlsVar9 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        arrayList.clear();
                        List<ewk> list4 = mukVar5.b0;
                        if (list4 != null) {
                            m mVar2 = this;
                            final rvo rvoVar5 = rvoVar4;
                            l6o l6oVar = a3;
                            List<c131> list5 = arrayList;
                            for (ewk ewkVar : list4) {
                                mVar2.getClass();
                                c131 c131Var = null;
                                if (ewkVar instanceof dwk) {
                                    twk twkVar = ((dwk) ewkVar).b;
                                    try {
                                        c131Var = new c131(new wvo(new Regex((String) twkVar.c.a(rvoVar5)), ((Boolean) twkVar.a.a(rvoVar5)).booleanValue()), twkVar.d, (String) twkVar.b.a(rvoVar5));
                                    } catch (PatternSyntaxException e) {
                                        l6oVar.e(new IllegalArgumentException("Invalid regex pattern '" + e.getPattern() + '\'', e));
                                    }
                                } else {
                                    if (!(ewkVar instanceof cwk)) {
                                        w511.b();
                                        return null;
                                    }
                                    final kwk kwkVar = ((cwk) ewkVar).b;
                                    c131Var = new c131(new wvo(((Boolean) kwkVar.a.a(rvoVar5)).booleanValue(), new sls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$toValidatorDataItem$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // defpackage.sls
                                        public final Object invoke() {
                                            return (Boolean) kwk.this.b.a(rvoVar5);
                                        }
                                    }), kwkVar.d, (String) kwkVar.c.a(rvoVar5));
                                }
                                if (c131Var != null) {
                                    list5.add(c131Var);
                                }
                            }
                            List<c131> list6 = arrayList;
                            m mVar3 = this;
                            DivInputView divInputView4 = divInputView3;
                            Div2View div2View3 = div2View2;
                            rvo rvoVar6 = rvoVar4;
                            Iterator<T> it = list6.iterator();
                            while (it.hasNext()) {
                                m.Hg(mVar3, (c131) it.next(), String.valueOf(divInputView4.getText()), divInputView4, div2View3, rvoVar6);
                            }
                        }
                        return zy11.a;
                    }
                };
                divInputView = divInputView3;
                div2View = div2View2;
                list = mukVar5.b0;
                if (list != null) {
                    final int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        ewk ewkVar = (ewk) obj;
                        if (ewkVar instanceof dwk) {
                            dwk dwkVar = (dwk) ewkVar;
                            divInputView.addSubscription(dwkVar.c().c.c(rvoVar4, tlsVar9));
                            divInputView.addSubscription(dwkVar.c().b.c(rvoVar4, tlsVar9));
                            divInputView.addSubscription(dwkVar.c().a.c(rvoVar4, tlsVar9));
                        } else {
                            if (!(ewkVar instanceof cwk)) {
                                w511.b();
                                return;
                            }
                            cwk cwkVar = (cwk) ewkVar;
                            divInputView.addSubscription(cwkVar.c().b.c(rvoVar4, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    ((Boolean) obj2).booleanValue();
                                    tlsVar8.invoke(Integer.valueOf(i));
                                    return zy11.a;
                                }
                            }));
                            divInputView.addSubscription(cwkVar.c().c.c(rvoVar4, tlsVar9));
                            divInputView.addSubscription(cwkVar.c().a.c(rvoVar4, tlsVar9));
                        }
                        i = i2;
                    }
                }
                tlsVar9.invoke(zy11Var);
                divInputView.setFocusTracker$div_release(div2View.getInputFocusTracker());
                focusTracker = divInputView.getFocusTracker();
                if (focusTracker == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        mukVar = mukVar4;
        mVar = this;
        mukVar2 = mukVar3;
        final DivInputView divInputView32 = divInputView2;
        if (mukVar == null) {
        }
        if (mukVar == null) {
        }
        final muk mukVar52 = mukVar2;
        a.x(divInputView32, mukVar2.q, mukVar2.r, mukVar2.E, mukVar2.S, mukVar2.F, mukVar2.p, mukVar2.t, mukVar2.u, mukVar2.s, mukVar == null ? mukVar.q : null, mukVar == null ? mukVar.r : null, mukVar == null ? mukVar.E : null, mukVar == null ? mukVar.S : null, mukVar == null ? mukVar.F : null, mukVar == null ? mukVar.p : null, mukVar == null ? mukVar.t : null, mukVar == null ? mukVar.u : null, mukVar == null ? mukVar.s : null, mukVar, mVar.w, rvoVar);
        final Expression expression72 = mukVar52.Q;
        final Expression expression82 = mukVar52.R;
        Jg(divInputView32, (DivAlignmentHorizontal) expression72.a(rvoVar), (DivAlignmentVertical) expression82.a(rvoVar));
        tls tlsVar22 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeTextAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                m mVar2 = m.this;
                DivInputView divInputView4 = divInputView32;
                DivAlignmentHorizontal divAlignmentHorizontal = (DivAlignmentHorizontal) expression72.a(rvoVar);
                DivAlignmentVertical divAlignmentVertical = (DivAlignmentVertical) expression82.a(rvoVar);
                mVar2.getClass();
                m.Jg(divInputView4, divAlignmentHorizontal, divAlignmentVertical);
                return zy11.a;
            }
        };
        divInputView32.addSubscription(expression72.c(rvoVar, tlsVar22));
        divInputView32.addSubscription(expression82.c(rvoVar, tlsVar22));
        expression = mukVar52.J;
        if (expression != null) {
        }
        expression2 = mukVar52.I;
        if (expression2 != null) {
        }
        expression3 = mukVar52.z;
        if (expression3 != null) {
        }
        divInputView32.addSubscription(mukVar52.y.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                DivInputView.this.setHintTextColor(((Number) mukVar52.y.a(rvoVar)).intValue());
                return zy11.a;
            }
        }));
        expression4 = mukVar52.x;
        if (expression4 != null) {
        }
        tls tlsVar32 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3;
                DivInput$KeyboardType divInput$KeyboardType = (DivInput$KeyboardType) muk.this.C.a(rvoVar);
                DivInputView divInputView4 = divInputView32;
                this.getClass();
                switch (nuk.b[divInput$KeyboardType.ordinal()]) {
                    case 1:
                        i3 = 1;
                        break;
                    case 2:
                        i3 = 131073;
                        break;
                    case 3:
                        i3 = 33;
                        break;
                    case 4:
                        i3 = 17;
                        break;
                    case 5:
                        i3 = 12290;
                        break;
                    case 6:
                        i3 = 3;
                        break;
                    case 7:
                        i3 = HProv.PP_SECURITY_LEVEL;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                m mVar2 = this;
                muk mukVar6 = muk.this;
                rvo rvoVar22 = rvoVar;
                mVar2.getClass();
                int i22 = nuk.d[((DivInput$Autocapitalization) mukVar6.f.a(rvoVar22)).ordinal()];
                divInputView4.setInputType(i3 | (i22 != 1 ? i22 != 2 ? i22 != 3 ? 0 : 4096 : 8192 : 16384));
                divInputView32.setHorizontallyScrolling(divInput$KeyboardType != DivInput$KeyboardType.MULTI_LINE_TEXT);
                return zy11.a;
            }
        };
        divInputView32.addSubscription(mukVar52.C.c(rvoVar, tlsVar32));
        divInputView32.addSubscription(mukVar52.f.d(rvoVar, tlsVar32));
        divInputView32.addSubscription(mukVar52.l.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeEnterTypeAndActions$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3;
                DivInput$EnterKeyType divInput$EnterKeyType = (DivInput$EnterKeyType) muk.this.l.a(rvoVar);
                DivInputView divInputView4 = divInputView32;
                int imeOptions = divInputView4.getImeOptions();
                this.getClass();
                int i22 = nuk.c[divInput$EnterKeyType.ordinal()];
                if (i22 != 1) {
                    i3 = 4;
                    if (i22 != 2) {
                        if (i22 == 3) {
                            i3 = 6;
                        } else if (i22 == 4) {
                            i3 = 3;
                        } else {
                            if (i22 != 5) {
                                w511.b();
                                return null;
                            }
                            i3 = 2;
                        }
                    }
                } else {
                    i3 = 0;
                }
                divInputView4.setImeOptions(imeOptions + i3);
                final List list22 = muk.this.k;
                List list32 = list22;
                if (list32 == null || list32.isEmpty()) {
                    divInputView32.setOnEditorActionListener(null);
                } else {
                    final DivInputView divInputView5 = divInputView32;
                    final m mVar2 = this;
                    final aw5 aw5Var2 = aw5Var;
                    divInputView5.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ouk
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i32, KeyEvent keyEvent) {
                            if ((i32 & 255) == 0) {
                                return false;
                            }
                            m.this.y.d(aw5Var2, divInputView5, list22, "enter");
                            return false;
                        }
                    });
                }
                return zy11.a;
            }
        }));
        divInputView32.addSubscription(mukVar52.O.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeSelectAllOnFocus$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                DivInputView.this.setSelectAllOnFocus(((Boolean) mukVar52.O.a(rvoVar)).booleanValue());
                return zy11.a;
            }
        }));
        divInputView32.addSubscription(mukVar52.B.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeIsEnabled$callback$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (!booleanValue && DivInputView.this.isFocused()) {
                    hi91.a(DivInputView.this);
                }
                DivInputView.this.setEnabled$div_release(booleanValue);
                return zy11.a;
            }
        }));
        divInputView32.removeAfterTextChangeListener();
        final Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
        final rvo rvoVar22 = aw5Var.b;
        final tls tlsVar42 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, com.yandex.div.core.util.mask.a] */
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                ?? r2 = (com.yandex.div.core.util.mask.a) obj2;
                Ref$ObjectRef.this.element = r2;
                if (r2 != 0) {
                    DivInputView divInputView4 = divInputView32;
                    divInputView4.setText(r2.i());
                    divInputView4.setSelection(r2.d);
                }
                return zy11.a;
            }
        };
        final Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
        zmk dataTag2 = div2View2.getDataTag();
        omk omkVar2 = div2View2.get_divData();
        m6o m6oVar2 = this.A;
        final l6o a4 = m6oVar2.a(omkVar2, dataTag2);
        final KeyListener keyListener2 = divInputView32.getKeyListener();
        final wls wlsVar2 = new wls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$catchCommonMaskException$1
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj2, Object obj22) {
                Exception exc = (Exception) obj2;
                sls slsVar = (sls) obj22;
                if (exc instanceof PatternSyntaxException) {
                    l6o.this.e(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc).getPattern() + "'."));
                } else {
                    slsVar.invoke();
                }
                return zy11.a;
            }
        };
        tls tlsVar52 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                Locale locale;
                pvk pvkVar2 = muk.this.H;
                T t = 0;
                qvk c3 = pvkVar2 != null ? pvkVar2.c() : null;
                Ref$ObjectRef<com.yandex.div.core.util.mask.a> ref$ObjectRef32 = ref$ObjectRef22;
                if (c3 instanceof iqk) {
                    divInputView32.setKeyListener(keyListener2);
                    iqk iqkVar2 = (iqk) c3;
                    String str22 = (String) iqkVar2.b.a(rvoVar22);
                    List<hqk> list22 = iqkVar2.c;
                    rvo rvoVar32 = rvoVar22;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list22, 10));
                    for (hqk hqkVar2 : list22) {
                        char u0 = gvu0.u0((CharSequence) hqkVar2.a.a(rvoVar32));
                        Expression expression92 = hqkVar2.c;
                        String str3 = expression92 != null ? (String) expression92.a(rvoVar32) : null;
                        Character v0 = gvu0.v0((CharSequence) hqkVar2.b.a(rvoVar32));
                        arrayList2.add(new y25(u0, str3, v0 != null ? v0.charValue() : (char) 0));
                    }
                    x25 x25Var = new x25(str22, arrayList2, ((Boolean) iqkVar2.a.a(rvoVar22)).booleanValue());
                    com.yandex.div.core.util.mask.a aVar = ref$ObjectRef22.element;
                    if (aVar != null) {
                        aVar.n(x25Var, true);
                    } else {
                        final wls wlsVar22 = wlsVar2;
                        aVar = new ker(x25Var, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.2

                            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$2$1, reason: invalid class name */
                            final class AnonymousClass1 extends Lambda implements sls {
                                public static final AnonymousClass1 w = new AnonymousClass1(0);

                                @Override // defpackage.sls
                                public final /* bridge */ /* synthetic */ Object invoke() {
                                    return zy11.a;
                                }
                            }

                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj22) {
                                wls.this.invoke((Exception) obj22, AnonymousClass1.w);
                                return zy11.a;
                            }
                        });
                    }
                    t = aVar;
                } else if (c3 instanceof xkk) {
                    Expression expression10 = ((xkk) c3).a;
                    String str4 = expression10 != null ? (String) expression10.a(rvoVar22) : null;
                    if (str4 != null) {
                        locale = Locale.forLanguageTag(str4);
                        l6o l6oVar = a4;
                        String languageTag = locale.toLanguageTag();
                        if (!jl40.l(languageTag, str4)) {
                            l6oVar.f(new IllegalArgumentException("Original locale tag '" + str4 + "' is not equals to final one '" + languageTag + '\''));
                        }
                    } else {
                        locale = Locale.getDefault();
                    }
                    divInputView32.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
                    com.yandex.div.core.util.mask.a aVar2 = ref$ObjectRef22.element;
                    com.yandex.div.core.util.mask.a aVar3 = aVar2;
                    if (aVar3 != null) {
                        aef aefVar = (aef) aVar2;
                        String replace = aefVar.h().replace(aefVar.p().getDecimalSeparator(), '.');
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
                        aefVar.o(currencyInstance);
                        aefVar.h = currencyInstance;
                        aefVar.a(replace.replace('.', aefVar.p().getDecimalSeparator()), null);
                        t = aVar3;
                    } else {
                        final wls wlsVar3 = wlsVar2;
                        t = new aef(locale, new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.4

                            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$4$1, reason: invalid class name */
                            final class AnonymousClass1 extends Lambda implements sls {
                                public static final AnonymousClass1 w = new AnonymousClass1(0);

                                @Override // defpackage.sls
                                public final /* bridge */ /* synthetic */ Object invoke() {
                                    return zy11.a;
                                }
                            }

                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj22) {
                                wls.this.invoke((Exception) obj22, AnonymousClass1.w);
                                return zy11.a;
                            }
                        });
                    }
                } else {
                    boolean z = c3 instanceof s3l;
                    DivInputView divInputView4 = divInputView32;
                    if (z) {
                        divInputView4.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
                        com.yandex.div.core.util.mask.a aVar4 = ref$ObjectRef22.element;
                        if (aVar4 != null) {
                            aVar4.n(veb0.b, true);
                            t = aVar4;
                        } else {
                            final wls wlsVar4 = wlsVar2;
                            t = new ker(new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.6

                                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$6$1, reason: invalid class name */
                                final class AnonymousClass1 extends Lambda implements sls {
                                    public static final AnonymousClass1 w = new AnonymousClass1(0);

                                    @Override // defpackage.sls
                                    public final /* bridge */ /* synthetic */ Object invoke() {
                                        return zy11.a;
                                    }
                                }

                                {
                                    super(1);
                                }

                                @Override // defpackage.tls
                                public final Object invoke(Object obj22) {
                                    wls.this.invoke((Exception) obj22, AnonymousClass1.w);
                                    return zy11.a;
                                }
                            });
                        }
                    } else {
                        divInputView4.setKeyListener(keyListener2);
                    }
                }
                ref$ObjectRef32.element = t;
                tlsVar42.invoke(ref$ObjectRef22.element);
                return zy11.a;
            }
        };
        pvkVar = mukVar52.H;
        String str22 = mukVar52.T;
        if (pvkVar == null) {
        }
        if (!(c instanceof iqk)) {
        }
        zy11 zy11Var2 = zy11.a;
        tlsVar52.invoke(zy11Var2);
        final Ref$ObjectRef ref$ObjectRef32 = new Ref$ObjectRef();
        final tls tlsVar62 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, hzv] */
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                String str3;
                ?? r2 = (hzv) obj2;
                Ref$ObjectRef.this.element = r2;
                if (r2 != 0) {
                    DivInputView divInputView4 = divInputView32;
                    Editable editableText = divInputView4.getEditableText();
                    if (editableText == null || (str3 = editableText.toString()) == null) {
                        str3 = "";
                    }
                    r2.b = str3;
                    r2.c = divInputView4.getSelectionStart();
                }
                return zy11.a;
            }
        };
        if (pvkVar == null) {
        }
        if (pvkVar == null) {
        }
        divInputView32.addSubscription(this.x.a(aw5Var, str22, new l((com.yandex.div.core.util.mask.a) ref$ObjectRef4.element, (hzv) ref$ObjectRef32.element, divInputView32, str, aw5Var)));
        final rvo rvoVar42 = aw5Var.b;
        final ArrayList arrayList2 = new ArrayList();
        final l6o a32 = m6oVar2.a(div2View2.get_divData(), div2View2.getDataTag());
        final tls tlsVar82 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$revalidateExpressionValidator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                m.Hg(m.this, arrayList2.get(((Number) obj2).intValue()), String.valueOf(divInputView32.getText()), divInputView32, div2View2, rvoVar42);
                return zy11.a;
            }
        };
        divInputView32.addTextChangedListener(new TextWatcher() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (s != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        m.Hg(this, (c131) it.next(), String.valueOf(divInputView32.getText()), divInputView32, div2View2, rvoVar42);
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        tls tlsVar92 = new tls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                arrayList2.clear();
                List<ewk> list4 = mukVar52.b0;
                if (list4 != null) {
                    m mVar2 = this;
                    final rvo rvoVar5 = rvoVar42;
                    l6o l6oVar = a32;
                    List<c131> list5 = arrayList2;
                    for (ewk ewkVar2 : list4) {
                        mVar2.getClass();
                        c131 c131Var = null;
                        if (ewkVar2 instanceof dwk) {
                            twk twkVar = ((dwk) ewkVar2).b;
                            try {
                                c131Var = new c131(new wvo(new Regex((String) twkVar.c.a(rvoVar5)), ((Boolean) twkVar.a.a(rvoVar5)).booleanValue()), twkVar.d, (String) twkVar.b.a(rvoVar5));
                            } catch (PatternSyntaxException e) {
                                l6oVar.e(new IllegalArgumentException("Invalid regex pattern '" + e.getPattern() + '\'', e));
                            }
                        } else {
                            if (!(ewkVar2 instanceof cwk)) {
                                w511.b();
                                return null;
                            }
                            final kwk kwkVar = ((cwk) ewkVar2).b;
                            c131Var = new c131(new wvo(((Boolean) kwkVar.a.a(rvoVar5)).booleanValue(), new sls() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$toValidatorDataItem$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    return (Boolean) kwk.this.b.a(rvoVar5);
                                }
                            }), kwkVar.d, (String) kwkVar.c.a(rvoVar5));
                        }
                        if (c131Var != null) {
                            list5.add(c131Var);
                        }
                    }
                    List<c131> list6 = arrayList2;
                    m mVar3 = this;
                    DivInputView divInputView4 = divInputView32;
                    Div2View div2View3 = div2View2;
                    rvo rvoVar6 = rvoVar42;
                    Iterator<T> it = list6.iterator();
                    while (it.hasNext()) {
                        m.Hg(mVar3, (c131) it.next(), String.valueOf(divInputView4.getText()), divInputView4, div2View3, rvoVar6);
                    }
                }
                return zy11.a;
            }
        };
        divInputView = divInputView32;
        div2View = div2View2;
        list = mukVar52.b0;
        if (list != null) {
        }
        tlsVar92.invoke(zy11Var2);
        divInputView.setFocusTracker$div_release(div2View.getInputFocusTracker());
        focusTracker = divInputView.getFocusTracker();
        if (focusTracker == null) {
        }
    }
}

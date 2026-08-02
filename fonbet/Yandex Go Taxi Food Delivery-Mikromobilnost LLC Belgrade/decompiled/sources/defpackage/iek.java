package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.yandex.div.core.animation.ColorIntValueProperty;
import com.yandex.div.core.animation.IntegerValueProperty;
import com.yandex.div.core.animation.NumberValueProperty;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import defpackage.bek;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class iek implements nbk {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r10 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (r13 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015c, code lost:
    
        if (r6 == null) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    @Override // defpackage.nbk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        Animator animator;
        Integer num;
        int intValue;
        ObjectAnimator ofArgb;
        Double b;
        Double b2;
        Object a;
        Object a2;
        Animator animator2;
        if (jbkVar instanceof mak) {
            if (str != null) {
                List f = vi91.f(div2View, str);
                if (f.size() == 1) {
                    View view = (View) a.P(f);
                    final bek o = div2View.getViewComponent().o();
                    y3k y3kVar = ((mak) jbkVar).b;
                    LinkedHashMap linkedHashMap = o.b;
                    String str2 = y3kVar.a;
                    ydk a3 = o.a(view, str2);
                    if (a3 != null) {
                        final Pair pair = new Pair(str, str2);
                        if (linkedHashMap.containsKey(pair) && (animator2 = (Animator) linkedHashMap.remove(pair)) != null) {
                            animator2.cancel();
                        }
                        Div2View div2View2 = o.a;
                        xll xllVar = y3kVar.d;
                        xll xllVar2 = y3kVar.h;
                        if (a3 instanceof xdk) {
                            i0l i0lVar = ((xdk) a3).b;
                            String str3 = i0lVar.k;
                            Expression expression = i0lVar.e;
                            Expression expression2 = i0lVar.j;
                            c231 variable = rvoVar.getVariable(str3);
                            if (variable instanceof y131) {
                                y131 y131Var = (y131) variable;
                                if (xllVar2 != null) {
                                    a = xllVar2 instanceof tll ? (Long) ((tll) xllVar2).b.a.a(rvoVar) : null;
                                }
                                a = expression2 != null ? expression2.a(rvoVar) : null;
                                if (xllVar != null) {
                                    a2 = xllVar instanceof tll ? (Long) ((tll) xllVar).b.a.a(rvoVar) : null;
                                }
                                a2 = expression.a(rvoVar);
                                if (a != null) {
                                    y131Var.i(a);
                                }
                                ofArgb = ObjectAnimator.ofInt(y131Var, IntegerValueProperty.INSTANCE, ((Number) a2).intValue());
                                fj91.a(ofArgb, div2View2, i0lVar, y3kVar, rvoVar);
                            } else if (variable instanceof x131) {
                                x131 x131Var = (x131) variable;
                                Double d = (xllVar2 == null || (b2 = hi91.b(xllVar2, rvoVar)) == null) ? expression2 != null ? (Double) expression2.a(rvoVar) : null : b2;
                                double doubleValue = (xllVar == null || (b = hi91.b(xllVar, rvoVar)) == null) ? ((Number) expression.a(rvoVar)).doubleValue() : b.doubleValue();
                                if (d != null) {
                                    x131Var.i(d);
                                }
                                ofArgb = ObjectAnimator.ofFloat(x131Var, NumberValueProperty.INSTANCE, (float) doubleValue);
                                fj91.a(ofArgb, div2View2, i0lVar, y3kVar, rvoVar);
                            } else {
                                div2View2.logError(new RuntimeException(unr0.l('\'', "Unable to find number variable with name '", str3)));
                                ofArgb = null;
                            }
                            if (ofArgb != null) {
                                ofArgb.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnEnd$1
                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationCancel(Animator animator3) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator3) {
                                        bek.this.b.remove(pair);
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationRepeat(Animator animator3) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationStart(Animator animator3) {
                                    }
                                });
                                ofArgb.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnCancel$1
                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationCancel(Animator animator3) {
                                        bek.this.b.remove(pair);
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator3) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationRepeat(Animator animator3) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationStart(Animator animator3) {
                                    }
                                });
                                linkedHashMap.put(pair, ofArgb);
                                ofArgb.start();
                                return true;
                            }
                        } else {
                            if (!(a3 instanceof wdk)) {
                                w511.b();
                                return false;
                            }
                            ljk ljkVar = ((wdk) a3).b;
                            String str4 = ljkVar.k;
                            c231 variable2 = rvoVar.getVariable(str4);
                            v131 v131Var = variable2 instanceof v131 ? (v131) variable2 : null;
                            if (v131Var == null) {
                                div2View2.logError(new RuntimeException(unr0.l('\'', "Unable to find color variable with name '", str4)));
                                ofArgb = null;
                                if (ofArgb != null) {
                                }
                            } else {
                                if (xllVar2 != null) {
                                    num = xllVar2 instanceof rll ? (Integer) ((rll) xllVar2).b.a.a(rvoVar) : null;
                                }
                                Expression expression3 = ljkVar.j;
                                num = expression3 != null ? (Integer) expression3.a(rvoVar) : null;
                                if (xllVar != null) {
                                    Integer num2 = xllVar instanceof rll ? (Integer) ((rll) xllVar).b.a.a(rvoVar) : null;
                                    if (num2 != null) {
                                        intValue = num2.intValue();
                                        if (num != null) {
                                            v131Var.i(new jdc(num.intValue()));
                                        }
                                        ofArgb = ObjectAnimator.ofArgb(v131Var, ColorIntValueProperty.INSTANCE, intValue);
                                        fj91.a(ofArgb, div2View2, ljkVar, y3kVar, rvoVar);
                                        if (ofArgb != null) {
                                        }
                                    }
                                }
                                intValue = ((Number) ljkVar.e.a(rvoVar)).intValue();
                                if (num != null) {
                                }
                                ofArgb = ObjectAnimator.ofArgb(v131Var, ColorIntValueProperty.INSTANCE, intValue);
                                fj91.a(ofArgb, div2View2, ljkVar, y3kVar, rvoVar);
                                if (ofArgb != null) {
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (!(jbkVar instanceof nak)) {
                return false;
            }
            if (str != null && (animator = (Animator) div2View.getViewComponent().o().b.remove(new Pair(str, ((nak) jbkVar).b.a))) != null) {
                animator.cancel();
                return true;
            }
        }
        return true;
    }
}
